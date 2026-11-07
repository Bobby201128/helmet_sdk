package me.ele.hb.biz.order.smartdevice;

import java.io.Serializable;
import me.ele.hb.biz.order.magex.sound.SpeechAppointOrder;
import me.ele.hb.biz.order.smartdevice.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements SpeechAppointOrder, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f65046n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f65047o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f65048p;

    public /* synthetic */ c(long j12, int i12, String str) {
        this.f65046n = j12;
        this.f65047o = i12;
        this.f65048p = str;
    }

    @Override // me.ele.hb.biz.order.magex.sound.SpeechAppointOrder
    public final void acceptOrder(boolean z12) {
        d.a.b(this.f65046n, this.f65047o, this.f65048p, z12);
    }
}
