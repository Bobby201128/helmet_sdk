package me.ele.aiot.sensor.internal;

import me.ele.aiot.sensor.model.HeartBeatModel;

/* loaded from: classes4.dex */
public interface a {
    void a(String str, String str2, String str3, String str4, String str5);

    void b(c cVar);

    void c(float f12, long j12);

    void d(String str, String str2, String str3, String str4);

    void e(HeartBeatModel heartBeatModel);

    void f(c cVar);

    void g(String str);

    void onFallOverCallback(int i12, long j12);

    void onUpgradeEvent(long j12, String str, String str2, String str3, long j13);
}
