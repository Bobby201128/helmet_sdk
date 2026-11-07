package me.ele.aiot.sensor.internal.event.command;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;
import l90.a;

/* loaded from: classes4.dex */
public enum EventResult {
    OP_SUCCESS("00"),
    OP_NOT_SUPPORT1(HiAnalyticsConstant.KeyAndValue.NUMBER_01),
    OP_UNKNOWN_ERROR("02"),
    OP_NOT_SUPPORT("03"),
    OP_INVALID_PARAMETERS("04"),
    OP_SOURCE_BUSY("05"),
    OP_TIMEOUT("07"),
    OP_DEFAULT("99");

    private final byte[] code;

    EventResult(String str) {
        this.code = a.m(str);
    }

    public static EventResult fromCode(byte[] bArr) {
        for (EventResult eventResult : values()) {
            if (Arrays.equals(eventResult.getCode(), bArr)) {
                return eventResult;
            }
        }
        return OP_DEFAULT;
    }

    public byte[] getCode() {
        return this.code;
    }
}
