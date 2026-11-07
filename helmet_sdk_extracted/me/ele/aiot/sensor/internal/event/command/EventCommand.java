package me.ele.aiot.sensor.internal.event.command;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;
import l90.a;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public enum EventCommand {
    TIME_SYNC(HiAnalyticsConstant.KeyAndValue.NUMBER_01),
    APPLY_AUTH_CODE("02"),
    SEND_AUTH_CODE("03"),
    BLUETOOTH_VERSION("11"),
    CONTROL_STATUS(AgooConstants.REPORT_MESSAGE_NULL),
    SENSOR_CONFIG("31"),
    BLUETOOTH_CONFIG("32"),
    BLUETOOTH_OTA("41"),
    VOICE_OTA("42"),
    HEARTBEAT_EVENT("61"),
    CORE_DATA_6B("6B"),
    DEVICE_EVENT("6C"),
    CORE_DATA_6D("6D");

    private byte[] code;

    EventCommand(String str) {
        this.code = a.m(str);
    }

    public static EventCommand fromCode(byte[] bArr) {
        for (EventCommand eventCommand : values()) {
            if (Arrays.equals(eventCommand.getCode(), bArr)) {
                return eventCommand;
            }
        }
        return null;
    }

    public byte[] getCode() {
        return this.code;
    }

    public int getInt() {
        return this.code[0] & 255;
    }
}
