package me.ele.hb.biz.order.smartdevice;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.socks.library.KLog;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.hb.biz.order.magex.sound.SpeechCallCustomer;
import me.ele.hb.biz.order.magex.sound.helper.r;
import me.ele.hb.biz.order.magex.sound.helper.u;
import me.ele.hb.voice.spi.params.PlayTtsParams;
import me.ele.soundmanager.player.playitem.Priority;

/* loaded from: classes5.dex */
public class SmartHelmetNearCallCustomer {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    AtomicBoolean f65029a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    me.ele.soundmanager.player.playitem.b f65030b;

    public void a(final String str, final long j12, String str2, boolean z12, boolean z13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, str, Long.valueOf(j12), str2, Boolean.valueOf(z12), Boolean.valueOf(z13)});
            return;
        }
        if (!b.d()) {
            KLog.e("HBVoiceSenceHelper", "smartHelmetNearCallEnable not open");
            return;
        }
        if (!z13) {
            KLog.e("HBVoiceSenceHelper", "smartHelmetNearCallEnable isCallPhoneAvaliable not open");
            return;
        }
        if (!z12) {
            PlayTtsParams playTtsParams = new PlayTtsParams(str, str2, h21.d.f53781b);
            playTtsParams.setPlayDiAtEnd(b.d());
            h21.c.i(playTtsParams);
        }
        r.l(String.valueOf(j12), true, str2, "");
        b.b(this.f65029a, str2, new a() { // from class: me.ele.hb.biz.order.smartdevice.SmartHelmetNearCallCustomer.1
            private static transient /* synthetic */ ISurgeon $surgeonFlag;

            @Override // me.ele.hb.biz.order.smartdevice.a
            public void a() {
                ISurgeon iSurgeon2 = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon2, "1")) {
                    iSurgeon2.surgeon$dispatch("1", new Object[]{this});
                    return;
                }
                KLog.e("HBVoiceSenceHelper", "SmartHelmetNearCallCustomer 头盔点击按键");
                me.ele.soundmanager.player.playitem.b bVar = SmartHelmetNearCallCustomer.this.f65030b;
                if (bVar != null) {
                    bVar.cancel();
                }
                r.o(String.valueOf(j12), true, null, "");
                me.ele.hb.biz.order.magex.messages.d.Y(j12, 50, 0, new SpeechCallCustomer() { // from class: me.ele.hb.biz.order.smartdevice.SmartHelmetNearCallCustomer.1.1
                    private static transient /* synthetic */ ISurgeon $surgeonFlag;

                    @Override // me.ele.hb.biz.order.magex.sound.SpeechCallCustomer
                    public void callCustomerFail() {
                        ISurgeon iSurgeon3 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon3, "1")) {
                            iSurgeon3.surgeon$dispatch("1", new Object[]{this});
                            return;
                        }
                        KLog.e("HBVoiceSenceHelper", "SmartHelmetNearCallCustomer callCustomerFail");
                        r.m(String.valueOf(j12), true, "");
                        me.ele.hb.biz.order.sound.arrive.config.a.f("delivery_call_phone", 0L, "callCustomerFail");
                        PlayTtsParams playTtsParams2 = new PlayTtsParams(str, "拨打失败，建议手动操作呼出电话", h21.d.f53781b);
                        playTtsParams2.setEnablePlayInCall(true);
                        playTtsParams2.setPriority(Priority.MAX_PRIORITY.getPriority());
                        h21.c.i(playTtsParams2);
                    }

                    @Override // me.ele.hb.biz.order.magex.sound.SpeechCallCustomer
                    public void callCustomerSuccess(String str3) {
                        ISurgeon iSurgeon3 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon3, "2")) {
                            iSurgeon3.surgeon$dispatch("2", new Object[]{this, str3});
                            return;
                        }
                        KLog.e("HBVoiceSenceHelper", "SmartHelmetNearCallCustomer callCustomerSuccess phoneNumber = " + str3);
                        r.n(String.valueOf(j12), true, "");
                        PlayTtsParams playTtsParams2 = new PlayTtsParams(str, "为您拨打顾客电话", h21.d.f53781b);
                        playTtsParams2.setEnablePlayInCall(true);
                        playTtsParams2.setPriority(Priority.MAX_PRIORITY.getPriority());
                        h21.c.i(playTtsParams2);
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        u.c(str, j12, str3);
                    }
                });
            }
        });
    }

    public void b(me.ele.soundmanager.player.playitem.b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, bVar});
        } else {
            this.f65030b = bVar;
        }
    }
}
