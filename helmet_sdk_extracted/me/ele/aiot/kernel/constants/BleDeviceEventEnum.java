package me.ele.aiot.kernel.constants;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public enum BleDeviceEventEnum {
    BLE_CONNECT_SUCCESS_EVENT("bluetoothEvent", "1"),
    BLE_DISCONNECT_EVENT("bluetoothEvent", "2");

    private String eventType;
    private String eventValue;

    BleDeviceEventEnum(String str, String str2) {
        this.eventType = str;
        this.eventValue = str2;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getEventValue() {
        return this.eventValue;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return "BleDeviceEventEnum{eventType='" + this.eventType + "', eventValue='" + this.eventValue + "'}";
    }
}
