# crowdsource.apk 智能头盔 SDK 逆向分析报告

> 分析对象：`crowdsource.apk`（饿了么蜂鸟众包骑手端，约 219MB，7 个 dex）
> 分析日期：2026-11-07
> 提取产物：`D:\helmet_sdk\helmet_sdk_extracted\`（263 个 Java 反编译源文件 + 物模型 JSON）

---

## 1. SDK 身份与定位

APK 中嵌入了**饿了么自研的骑手智能设备 SDK（内部代号 Knight Smart Device / KSD）**，
围绕 **"me.ele.aiot"** 命名空间组织，共 9 个子模块、约 240 个类。

| 模块 | 职责 |
|---|---|
| `me.ele.aiot.fastble` | BLE 底层栈（基于开源 FastBle 改造）：扫描/连接/GATT 收发/异常 |
| `me.ele.aiot.kernel` | 核心：设备枚举、状态机、数据模型、HTTP/OTA、温度、声波到访 |
| `me.ele.aiot.codec` | 物模型数据编解码器 v4/v8（gzip + 二进制序列化，对接阿里 IoT 物模型） |
| `me.ele.aiot.sensor` | 传感器会话层：BLE GATT 通道、指令收发、心跳/事件帧解析 |
| `me.ele.aiot.home` | 设备管理 UI（AIOTDevicesMainActivity / 绑定页 / 帮助页） |
| `me.ele.aiot.activityrecognition` | 骑手行为识别（含原生算法库） |
| `me.ele.aiot.awareness` | 场景感知算法数据层 |
| `me.ele.aiot.indoorguide` | 室内定位引导（模型下载 + POI 预测） |
| `me.ele.aiot.pedestriandeadreckoning` | PDR 步行者航位推算（室内定位补充） |

外围支撑包（同样属于 SDK 体系，已一并提取）：

| 包 | 职责 |
|---|---|
| `i80` | **对外 API 门面** `KnightSmartDeviceApi`（i80/j.java）+ 6 个回调接口 |
| `q80` | **主管理器 KSD_Manager**（q80/g.java，2568 行）：扫描→绑定→连接→鉴权→数据 |
| `s80` | BLE 广播厂商数据解析（20 字节 manufacturerData） |
| `l80` / `o80` / `m80` | HTTP 上报层 / OTA 网络层 / OTA 进度上报 |

业务层集成点（App 侧，非 SDK 本体）：`me.ele.hb.biz.order.smartdevice`（到店/超时/呼客户）、
`me.ele.hb.voice.spi.params.helmet`（TTS 播报参数）、`me.ele.hb.location.data.provider`（头盔信标/WiFi 定位源）、
`me.ele.normandie.sampling`（数据采集上报管道）。

---

## 2. 支持的设备产品线

`kernel/constants/ProductKeyEnum.java`：

| ProductKey | 产品 | 类型码 |
|---|---|---|
| TKX | 智能夏盔 | 1=头盔 |
| TKD | 智能冬盔 | 1 |
| SHF | 智能头盔 | 1 |
| SHW | 智能冬盔 | 1 |
| SHE | 智能头盔耳机 E1 | 2=耳机 |
| SHP | 智能头盔耳机 E1P | 2 |
| X3L | 智能头盔 X3L | 3 |

- 设备大类：`BleDeviceTypeEnum` = 头盔(1) / 耳机(2)，另有 UNKNOWN。
- 设备码前 3 位即 ProductKey（`u0()`：`ProductKeyEnum.from(str.substring(0,3))`）。
- X3L 且 deviceCode 以 `X3L1802` 开头时启用 **SPP 蓝牙串口通道**（"shan_talk"开关，KSD_Manager_SPP 日志）。

---

## 3. BLE 通信协议

### 3.1 GATT 通道（`sensor/internal/CharacteristicId.java`）

| 项 | 值 |
|---|---|
| Service UUID | `4a822a40-cf3a-11e1-9ab4-0002a5d5c52b` |
| 写特征（App→头盔，无 INDICATE） | `4a822a42-cf3a-11e1-9ab4-0002a5d5c52b` |
| 通知特征（头盔→App，NOTIFY） | `4a822a41-cf3a-11e1-9ab4-0002a5d5c52b` |

### 3.2 指令集（`sensor/internal/event/command/EventCommand.java`）

| 命令码 | 枚举 | 方向/含义 |
|---|---|---|
| 0x01 | TIME_SYNC | App→盔：时间同步（连接后 1s 延迟触发，`bluetooth_sync_time_start` 埋点） |
| 0x02 | APPLY_AUTH_CODE | App→盔：申请鉴权随机数 |
| 0x03 | SEND_AUTH_CODE | App→盔：发送计算后的鉴权码（HMAC/密钥来自服务端 IOTSecret） |
| 0x11 | BLUETOOTH_VERSION | 查询蓝牙固件版本 |
| 0x12 | CONTROL_STATUS | 控制状态查询/设置（警示灯等状态控制通道） |
| 0x31 | SENSOR_CONFIG | 下发传感器采样配置 |
| 0x32 | BLUETOOTH_CONFIG | 下发蓝牙配置 |
| 0x41 | BLUETOOTH_OTA | 蓝牙固件 OTA 传输 |
| 0x42 | VOICE_OTA | 语音资源 OTA 传输（TTS 音频下载到头盔，`downloadToHelmet`） |
| 0x61 | HEARTBEAT_EVENT | 心跳帧（周期性状态汇总） |
| 0x6B | CORE_DATA_6B | 核心数据帧（物模型批量数据，gzip 压缩） |
| 0x6C | DEVICE_EVENT | 设备事件（摔倒等即时事件） |
| 0x6D | CORE_DATA_6D | 核心数据帧（另一版本） |

帧结构（g90 包族）：帧头携带 EventCommand 码 + PackageDesc（REQUEST/RESPONSE/SUCCESS/FAILED）+ 序号；
载荷按命令分别解析；`g90.f` 为心跳/事件帧模型，`g90.j` 为摔倒/传感器事件帧模型。

### 3.3 广播识别与扫描

- 扫描不按 UUID 过滤，靠**厂商自定义广播 manufacturerData（20 字节）**识别：`s80.a`
  - byte[0..12]：13 字符 deviceCode（ASCII）
  - byte[19]：flagBit
- 厂商 ID（`kernel/wavearrive/ManufactureId.java`）：`43009`(EBI) / `43010`(AK)
- 仅当骑手工作状态 = WORK（`KnightWorkStatusEnum`）时启动扫描与连接（省电策略），埋点 `bluetooth_scan_start` / `bluetooth_scan_update{is_scan_ble}`。

### 3.4 绑定与鉴权流程（q80/g + sensor/internal/c）

1. 扫描发现设备 → 解析 deviceCode → 通过 ProductKey 判定设备类型。
2. 服务端查询绑定关系：`xtop.boxmanager.iotDeviceBaseManage.queryIotDeviceConfigV2`，
   返回 `IotDeviceConfigResult`（含每设备 **IOTSecret**：secret / selfDeveloped / productSeriesType / modelTypes / thingModelProductKey）。
3. GATT 连接成功 → TIME_SYNC 同步时间。
4. APPLY_AUTH_CODE 取随机数 → 用 IOTSecret 计算 → SEND_AUTH_CODE 校验通过后进入数据态。
5. 状态机（`BleDeviceStatusEnum`）：01 未绑定 / 02 已绑定未连接 / 03 已绑定已连接。

---

## 4. 头盔侧能力（心跳帧 HeartBeatModel 全字段）

`sensor/model/HeartBeatModel.java`（0x61 帧解析于 `sensor/internal/c.j1()`）：

| 字段 | 含义 |
|---|---|
| wearStatus / infraredDetectionState | **佩戴检测**（红外 in-helmet 检测） |
| wearingPosture / angle | 佩戴姿态、头盔倾角 |
| fallOverValue | **摔倒检测**（0x6C 事件帧触发 `onFallOverCallback(value, ts)`，上行 `knightWearHelmetCheck`/安全事件） |
| battery | 盔内电池电量 |
| cautionLightMode | **警示灯模式**（夜间/雨天尾灯闪烁控制，经 CONTROL_STATUS 通道） |
| lightIntensity | 光线强度（联动自动开灯） |
| pressure / temperature | 气压计（楼层/海拔）、盔内温度 |
| frequency / collectIndex / collectTime | 采样频率与采集序号 |
| pdrDetails | **PDR 细节**：每 12 字节一条 = 4B 步数 + 8B double（室内位移），随心跳上报 |
| runStatus / bluetoothVersion / hardwareVersion / sdkVersion / cityId / deviceCode / platform | 运行状态与版本信息 |

核心数据帧（0x6B/0x6D，`codec` 模块）承载**阿里物模型属性流**：
加速度/重力/线性加速度、陀螺仪、旋转矢量、姿态角（pitch/roll/yaw）、**行为识别结果（activity+置信度）**、
气压/海拔、磁力计、NFC 状态、屏幕状态、光感、距离传感器、**计步（步数/距离/配速/步频/楼层）**、
GPS（经纬度/精度/海拔/航向/速度/楼层/卫星数+SNR）、**WiFi 扫描列表**、**基站列表**、信标事件等
——与 `assets/default_thingmodel.json` 物模型 68 个属性一一对应（v4/v8 双版本编码器，支持 gzip）。

---

## 5. SDK 对外 API（i80.KnightSmartDeviceApi）

初始化/环境：
- `init(Application)`、`setEnv(KnightSmartDeviceEnv)`：PRODUCTION `https://aiot.ele.me` / PPE / DAILY
- `setCityId(int)`、`updateKnightWorkStatus(...)`（进入/退出接单工作态）

连接与状态查询：
- `getHelmetDeviceStatus(): BleDeviceStatusBean`（类型+绑定连接状态）
- `getBondedHeadsetName()/Mac()`：系统已配对耳机（X3L 场景自动回连）
- 注册监听：`setStatusCallback`（i80.b 状态变化）、`setScanCallback`（i80.g 扫描/绑定列表）、
  `setDeviceDataCallback`（i80.e：绑定结果/事件 JSON/**摔倒**/心跳 JSON/气压）、
  `setHelmetButtonCallback`（i80.a：**头盔按键单击**，用于语音交互/抢单确认等）
- 语音识别任务：`AsrTaskResultDTO`（status/traceId/requestId）+ `AudioTranscribeDTO`（audioData/asrType/contactType...）

---

## 6. 云端接口（MTOP "xtop" 网关，域 aiot.ele.me）

| API | 用途 |
|---|---|
| `xtop.aiot.lab.beacon.helmet.uploadHelmetDataCollectionV2` | 上传头盔采集数据（WiFi/信标/心跳/事件 四路 JSON，周期批量） |
| `xtop.aiot.lab.beacon.knight.device.report.event` | 设备事件上报（摔倒、按键、佩戴等） |
| `xtop.boxmanager.iotDeviceBaseManage.queryIotDeviceConfigV2` | 查询绑定关系 + 下发设备 IOTSecret（鉴权密钥） |
| `xtop.boxmanager.knight.bracelet.dataReport` | 手环类设备数据上报（`reportBraceletData`） |
| `xtop.boxmanager.knightdeviceconfig.temperatureValidQuery.uploadAndValidateTemperature` | 盔内温度校验上报（TemperatureManager，骑手高温安全） |
| `xtop.aiot.xiaoZhi.submitAudioTranscribe` | 语音转写提交（"小智"语音助手，ASR） |
| OTA：CheckOTAVersionRequest / CheckOTAProcessRequest | 固件与语音包升级检查/进度上报（downloadToApp→downloadToHelmet→done，30/60/100 阶段） |

---

## 7. 业务功能闭环（App 如何用 SDK）

1. **语音播报/语音助手**：订单事件经 `me.ele.hb.voice`（Mist 引擎）TTS → 优先通过头盔扬声器播放
   （`HelmetPlayParams`，时长=字数×160ms 超时；X3L 走 SPP "shan_talk"）；支持语音识别回复
   （`HelmetReplayInvokers` → `handleCompletedWithReply`），转写走 xiaoZhi ASR。
2. **头盔按键交互**：单击事件回调用于语音交互唤醒/功能确认（埋点 `event_smarthelmetentrance_click`、
   `event_helmet_interaction_reason_*`：未理解/打扰/不需要/无响应/其他）。
3. **订单场景自动化**：
   - 到店播报 `HelmetArriveWrapper`（`getSpeechArriveAddress`）
   - 超时呼叫客户 `SmartHelmetOvertimeCallCustmer`（`smartHelmetOvertimeEnable`）
   - 临近客户自动外呼 `SmartHelmetNearCallCustomer`（`smartHelmetNearCallEnable`）
   - 抢单语音 `enableSmartHelmetGrabOrder`（SmartHelmetGrabOrder）
4. **骑手安全**：摔倒检测→安全事件上报；佩戴检测→ `knightWearHelmetCheck.saveInfo`（XTOP 检查项），
   质检项 `qc3_helmet`（与 qc3_mask/vehicle/face 并列）；温度异常校验。
5. **定位增强**：头盔扫描的 WiFi/信标列表注入 App 定位管道
   （`DefaultHelmetWIFIProvider` / `DefaultHelmetBeaconProvider`），叠加 PDR + 室内引导（POI 预测模型）+
   行为识别，用于商场/楼宇内到店判定。
6. **OTA**：蓝牙固件（0x41）与语音资源（0x42）双通道升级，服务端记录 upgradeOtaRecordId 与分阶段进度。
7. **数据采集管道**：`me.ele.normandie.sampling.DataCollectorManager` 订阅 SDK 四路数据
   （HEARTBEAT/EVENT/WIFI/BEACON），按 cycle 批量经 V2 接口回传（`HelmetDeviceDataBuilder`）。

---

## 8. 安全观察

- 设备鉴权为**服务端下发 per-device IOTSecret + 挑战应答**（0x02/0x03），密钥不落广播。
- BLE 通道未见应用层加密（鉴权通过后核心数据帧仅 gzip 压缩，明文可解）；物理邻近攻击者可嗅探物模型数据。
- IOTSecret 缓存在本地（`kSD_CACHE`，"使用设备Secret的缓存"），依赖 App 私有存储隔离。
- 服务端域 `aiot.ele.me` 走 HTTPS + MTOP 签名（App 通用网关）。

## 9. 产物清单

```
D:\helmet_sdk\helmet_sdk_extracted\
├── me/ele/aiot/**                     # SDK 9 大模块（fastble/kernel/codec/sensor/home/...）
├── i80/**  q80/**  s80/**             # API 门面 / 主管理器 / 广播解析
├── l80/**  o80/**  m80/**             # HTTP / OTA 网络 / OTA 进度
├── me/ele/hb/**(smartdevice 等 3 处)   # App 业务集成点
└── default_thingmodel.json            # 头盔物模型（68 属性）
```
