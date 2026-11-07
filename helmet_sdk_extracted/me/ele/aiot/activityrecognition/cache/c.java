package me.ele.aiot.activityrecognition.cache;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class c {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: d, reason: collision with root package name */
    private static volatile c f61788d;

    /* renamed from: a, reason: collision with root package name */
    private String f61789a = "activity_recognition_sp";

    /* renamed from: b, reason: collision with root package name */
    private Context f61790b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences.Editor f61791c;

    private c(Context context) {
        this.f61790b = context;
    }

    public static c a(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (c) iSurgeon.surgeon$dispatch("1", new Object[]{context});
        }
        if (f61788d == null) {
            synchronized (c.class) {
                if (f61788d == null) {
                    f61788d = new c(context);
                }
            }
        }
        return f61788d;
    }

    private SharedPreferences.Editor c() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (SharedPreferences.Editor) iSurgeon.surgeon$dispatch("2", new Object[]{this});
        }
        if (this.f61791c == null) {
            this.f61791c = b().edit();
        }
        return this.f61791c;
    }

    public SharedPreferences b() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (SharedPreferences) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.f61790b.getSharedPreferences(this.f61789a, 0);
    }

    public String d(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this, str, str2}) : b().getString(str, str2);
    }

    public void e(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str, str2});
        } else {
            c().putString(str, str2).apply();
        }
    }
}
