package me.ele.aiot.kernel.constants;

import androidx.annotation.NonNull;
import me.ele.hunter.core.black.HBBlackRecordModel;

/* loaded from: classes4.dex */
public enum BleDeviceTypeEnum {
    UNKNOWN(0, HBBlackRecordModel.UNKNOWN),
    TOUKUI(1, "头盔"),
    ERJI(2, "耳机");

    private int typeCode;
    private String typeDesc;

    BleDeviceTypeEnum(int i12, String str) {
        this.typeCode = i12;
        this.typeDesc = str;
    }

    public static BleDeviceTypeEnum from(int i12) {
        for (BleDeviceTypeEnum bleDeviceTypeEnum : values()) {
            if (bleDeviceTypeEnum != null && bleDeviceTypeEnum.getTypeCode() == i12) {
                return bleDeviceTypeEnum;
            }
        }
        return UNKNOWN;
    }

    public int getTypeCode() {
        return this.typeCode;
    }

    public String getTypeDesc() {
        return this.typeDesc;
    }

    public void setTypeCode(int i12) {
        this.typeCode = i12;
    }

    public void setTypeDesc(String str) {
        this.typeDesc = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return "BleDeviceTypeEnum{typeCode='" + this.typeCode + "', typeDesc='" + this.typeDesc + "'}";
    }
}
