package me.ele.aiot.codec.commons;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public final class ValidationUtils {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    private ValidationUtils() {
    }

    public static void notNull(Object... objArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{objArr});
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                throw new CodecException("Null is not permitted");
            }
        }
    }
}
