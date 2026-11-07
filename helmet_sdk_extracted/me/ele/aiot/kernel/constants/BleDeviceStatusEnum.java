package me.ele.aiot.kernel.constants;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import v80.d;

/* loaded from: classes4.dex */
public enum BleDeviceStatusEnum {
    NOT_BINDING(HiAnalyticsConstant.KeyAndValue.NUMBER_01, "未绑定"),
    NOT_CONNECTED("02", "已绑定但未连接"),
    CONNECTED("03", "已绑定且已连接");

    private String statusCode;
    private String statusDesc;

    BleDeviceStatusEnum(String str, String str2) {
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static BleDeviceStatusEnum from(String str) {
        for (BleDeviceStatusEnum bleDeviceStatusEnum : values()) {
            if (bleDeviceStatusEnum != null && !d.a(str) && str.equals(bleDeviceStatusEnum.getStatusCode())) {
                return bleDeviceStatusEnum;
            }
        }
        return NOT_BINDING;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "HelmetDeviceStatusEnum{statusCode='" + this.statusCode + "', statusDesc='" + this.statusDesc + "'}";
    }
}
