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
public class SmartHelmetOvertimeCallCustmer {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    AtomicBoolean f65034a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    me.ele.soundmanager.player.playitem.b f65035b;

    public void a(final String str, final long j12, String str2, final int i12, boolean z12, boolean z13, boolean z14) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, str, Long.valueOf(j12), str2, Integer.valueOf(i12), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)});
            return;
        }
        if (!b.f()) {
            KLog.e("HBVoiceSenceHelper", "smartHelmetOvertimeEnable not open");
            return;
        }
        if (!z14) {
            KLog.e("HBVoiceSenceHelper", "smartHelmetOvertimeEnable isCallPhoneAvaliable not open");
            return;
        }
        if (!z12) {
            PlayTtsParams playTtsParams = new PlayTtsParams(str, str2, h21.d.f53781b);
            playTtsParams.setPlayDiAtEnd(z13);
            playTtsParams.setExpireTime(180000L);
            h21.c.i(playTtsParams);
        }
        r.q(String.valueOf(j12), str2, i12, true);
        b.b(this.f65034a, str2, new a() { // from class: me.ele.hb.biz.order.smartdevice.SmartHelmetOvertimeCallCustmer.1
            private static transient /* synthetic */ ISurgeon $surgeonFlag;

            @Override // me.ele.hb.biz.order.smartdevice.a
            public void a() {
                ISurgeon iSurgeon2 = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon2, "1")) {
                    iSurgeon2.surgeon$dispatch("1", new Object[]{this});
                    return;
                }
                KLog.e("HBVoiceSenceHelper", "SmartHelmetOvertimeCallCustmer 头盔点击按键");
                me.ele.soundmanager.player.playitem.b bVar = SmartHelmetOvertimeCallCustmer.this.f65035b;
                if (bVar != null) {
                    bVar.cancel();
                }
                r.t(String.valueOf(j12), i12, true, null);
                me.ele.hb.biz.order.magex.messages.d.Y(j12, 50, 0, new SpeechCallCustomer() { // from class: me.ele.hb.biz.order.smartdevice.SmartHelmetOvertimeCallCustmer.1.1
                    private static transient /* synthetic */ ISurgeon $surgeonFlag;

                    @Override // me.ele.hb.biz.order.magex.sound.SpeechCallCustomer
                    public void callCustomerFail() {
                        ISurgeon iSurgeon3 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon3, "1")) {
                            iSurgeon3.surgeon$dispatch("1", new Object[]{this});
                            return;
                        }
                        KLog.e("HBVoiceSenceHelper", "SmartHelmetOvertimeCallCustmer callCustomerFail");
                        r.r(String.valueOf(j12), i12, true);
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
                        KLog.e("HBVoiceSenceHelper", "SmartHelmetOvertimeCallCustmer callCustomerSuccess phoneNumber = " + str3);
                        r.s(String.valueOf(j12), i12, true);
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
            this.f65035b = bVar;
        }
    }
}
