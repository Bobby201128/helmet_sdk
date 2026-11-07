package me.ele.aiot.fastble.utils;

import android.util.Log;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public final class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag = null;

    /* renamed from: a, reason: collision with root package name */
    public static boolean f61902a = true;

    public static void a(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{str});
        } else if (f61902a && str != null) {
            Log.e("FastBle", str);
        }
    }

    public static void b(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{str});
        } else if (f61902a && str != null) {
            Log.i("FastBle", str);
        }
    }

    public static void c(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{str});
        } else if (f61902a && str != null) {
            Log.w("FastBle", str);
        }
    }
}
