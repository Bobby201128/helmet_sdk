# helmet_sdk — 饿了么智能头盔 SDK 逆向分析

对 `crowdsource.apk`（饿了么蜂鸟众包骑手端）内嵌的 **Knight Smart Device SDK**（命名空间 `me.ele.aiot.*`）
进行的逆向分析成果：协议规范、设备能力清单，以及提取出的 SDK 反编译源码。

> ⚠️ 本仓库仅包含分析报告与头盔 SDK 相关的反编译代码摘录（约 264 个文件），
> 用于安全研究与互操作目的。原始 APK、全量解包及全量反编译输出未入库。

## 目录结构

| 路径 | 内容 |
|---|---|
| [`智能头盔SDK分析报告.md`](智能头盔SDK分析报告.md) | 完整分析报告：SDK 架构、BLE 协议、指令集、鉴权、数据模型、云端接口 |
| `helmet_sdk_extracted/` | 从 APK 提取的头盔 SDK 反编译源码（`me.ele.aiot.*` 九大模块 + 外围支撑包） |
| `helmet_sdk_extracted/default_thingmodel.json` | 头盔 IoT 物模型（68 个属性定义） |

## SDK 模块一览

| 模块 | 职责 |
|---|---|
| `me.ele.aiot.fastble` | BLE 底层栈（扫描/连接/GATT） |
| `me.ele.aiot.kernel` | 核心：设备枚举、状态机、OTA、温度、声波到访 |
| `me.ele.aiot.codec` | 物模型数据编解码 v4/v8（gzip + 二进制序列化） |
| `me.ele.aiot.sensor` | 传感器会话层：GATT 通道、指令收发、心跳/事件帧解析 |
| `me.ele.aiot.home` | 设备管理 UI |
| `me.ele.aiot.activityrecognition` | 骑手行为识别 |
| `me.ele.aiot.awareness` | 场景感知 |
| `me.ele.aiot.indoorguide` / `pedestriandeadreckoning` | 室内定位 / PDR |
| `i80` / `q80` / `s80` / `l80` / `o80` / `m80` | API 门面 / 主管理器 / 广播解析 / HTTP / OTA |

## BLE 协议要点（详见报告）

- **GATT**：Service `4a822a40-cf3a-11e1-9ab4-0002a5d5c52b`，写特征 `…42`，通知特征 `…41`
- **帧格式**：`CRC16-MODBUS(低字节在前) + cmd + status + seq/ts(u32LE) + len(u16LE) + payload`
- **指令集**：0x01 时间同步、0x02/0x03 挑战-应答鉴权、0x11 版本、0x12/0x31/0x32 配置、
  0x41/0x42 固件与语音 OTA、0x61 心跳、0x6B/0x6D 核心数据、0x6C 设备事件
- **鉴权**：`HMAC-SHA256(challenge, DES解密(IOTSecret))`
- **设备识别**：20 字节厂商广播（13 位设备码，产品线 TKX/TKD/SHF/SHW/SHE/SHP/X3L）

## 免责声明

仅用于安全研究与学习交流。分析对象为他人所有的商业软件，相关商标与版权归原权利人所有。
