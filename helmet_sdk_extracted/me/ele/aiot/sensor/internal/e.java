package me.ele.aiot.sensor.internal;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class e extends me.ele.td.lib.wrapper.f {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: p, reason: collision with root package name */
    private static e f62139p;

    private e() {
        super("hsizngtzu_bt");
        of1.b.b(this, "unknown");
        start();
    }

    public static e e() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (e) iSurgeon.surgeon$dispatch("1", new Object[0]);
        }
        if (f62139p == null) {
            synchronized (e.class) {
                if (f62139p == null) {
                    f62139p = new e();
                }
            }
        }
        return f62139p;
    }
}
