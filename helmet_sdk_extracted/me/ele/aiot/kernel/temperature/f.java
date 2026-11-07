package me.ele.aiot.kernel.temperature;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    final String f62044a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f62045b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f62046c;

    /* renamed from: d, reason: collision with root package name */
    final String f62047d;

    /* renamed from: e, reason: collision with root package name */
    final long f62048e;

    /* renamed from: f, reason: collision with root package name */
    final List<b> f62049f;

    /* renamed from: g, reason: collision with root package name */
    final long f62050g;

    /* renamed from: h, reason: collision with root package name */
    final String f62051h;

    /* renamed from: i, reason: collision with root package name */
    final int f62052i;

    private f(String str, boolean z12, boolean z13, String str2, long j12, List<b> list, long j13, String str3, int i12) {
        this.f62044a = str;
        this.f62045b = z12;
        this.f62046c = z13;
        this.f62047d = str2;
        this.f62048e = j12;
        this.f62049f = list;
        this.f62050g = j13;
        this.f62051h = str3;
        this.f62052i = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(String str, String str2, List<b> list, long j12, String str3, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (f) iSurgeon.surgeon$dispatch("2", new Object[]{str, str2, list, Long.valueOf(j12), str3, Integer.valueOf(i12)});
        }
        return new f(str, false, false, str2, System.currentTimeMillis(), list, j12, str3, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f b(String str, boolean z12, String str2, List<b> list, long j12, String str3, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (f) iSurgeon.surgeon$dispatch("1", new Object[]{str, Boolean.valueOf(z12), str2, list, Long.valueOf(j12), str3, Integer.valueOf(i12)});
        }
        return new f(str, true, z12, str2, System.currentTimeMillis(), list, j12, str3, i12);
    }
}
