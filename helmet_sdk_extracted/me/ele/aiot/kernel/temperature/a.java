package me.ele.aiot.kernel.temperature;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    public static byte[] a(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{Long.valueOf(j12)});
        }
        try {
            byte[] h12 = l90.a.h(new byte[]{1}, new byte[]{0}, l90.a.o(j12), l90.a.n(r10.length), l90.a.o(rf1.c.v() / 1000));
            return l90.a.h(l90.a.m(l90.a.k(h12)), h12);
        } catch (Throwable th2) {
            j90.c.b("TemperaturePacketUtils", "buildTemperatureReadPacket ex:" + th2);
            return new byte[0];
        }
    }

    public static byte[] b(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (byte[]) iSurgeon.surgeon$dispatch("2", new Object[]{Long.valueOf(j12)});
        }
        try {
            byte[] h12 = l90.a.h(new byte[]{98}, new byte[]{0}, l90.a.o(j12), new byte[]{0, 0});
            return l90.a.h(l90.a.m(l90.a.k(h12)), h12);
        } catch (Throwable th2) {
            j90.c.b("TemperaturePacketUtils", "buildTemperatureReportAckPacket ex:" + th2);
            return new byte[0];
        }
    }

    public static ReportParseResult c(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (ReportParseResult) iSurgeon.surgeon$dispatch("3", new Object[]{bArr});
        }
        if (bArr != null && bArr.length >= 10) {
            short b12 = l90.a.b(bArr, 8);
            int i12 = b12 + 10;
            if (bArr.length < i12) {
                return ReportParseResult.d();
            }
            if (!l90.a.k(Arrays.copyOfRange(bArr, 2, i12)).equalsIgnoreCase(l90.a.a(Arrays.copyOfRange(bArr, 0, 2)))) {
                return ReportParseResult.a();
            }
            byte b13 = bArr[2];
            long d12 = l90.a.d(bArr, 4);
            if (b13 != 98) {
                return ReportParseResult.e();
            }
            if (b12 == 0) {
                return ReportParseResult.c(d12);
            }
            int i13 = b12 / 6;
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.add(new b(l90.a.d(bArr, (i14 * 6) + 10), l90.a.b(bArr, r7 + 4) / 10.0f));
            }
            return ReportParseResult.b(d12, arrayList);
        }
        return ReportParseResult.d();
    }
}
