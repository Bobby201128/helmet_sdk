package me.ele.aiot.kernel.temperature;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public final class b {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private final long f62036a;

    /* renamed from: b, reason: collision with root package name */
    private final float f62037b;

    public b(long j12, float f12) {
        this.f62036a = j12;
        this.f62037b = f12;
    }

    public long a() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Long) iSurgeon.surgeon$dispatch("1", new Object[]{this})).longValue() : this.f62036a;
    }

    public float b() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Float) iSurgeon.surgeon$dispatch("2", new Object[]{this})).floatValue() : this.f62037b;
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (String) iSurgeon.surgeon$dispatch("3", new Object[]{this});
        }
        return "TemperaturePoint{utc=" + this.f62036a + "s, " + this.f62037b + "°C}";
    }
}
