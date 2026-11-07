package me.ele.aiot.kernel.temperature;

import android.util.Log;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class d {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f62038a;

    /* renamed from: b, reason: collision with root package name */
    private long f62039b;

    /* renamed from: c, reason: collision with root package name */
    private int f62040c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f62041d;

    public d(byte[] bArr) {
        if (bArr != null && bArr.length == 20) {
            this.f62041d = bArr;
            this.f62038a = Arrays.copyOfRange(bArr, 0, 13);
            this.f62039b = rf1.c.v();
            this.f62040c = bArr[19];
            Log.d("TemperatureScan", "TEMPERATURE_SCAN deviceCode: " + a() + ", manufacturerData: " + l90.a.a(bArr) + ", flagBit: " + this.f62040c);
        }
    }

    public String a() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (String) iSurgeon.surgeon$dispatch("2", new Object[]{this});
        }
        byte[] bArr = this.f62038a;
        if (bArr != null && bArr.length > 0) {
            return new String(bArr);
        }
        return "";
    }

    public long b() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Long) iSurgeon.surgeon$dispatch("7", new Object[]{this})).longValue() : this.f62039b;
    }
}
