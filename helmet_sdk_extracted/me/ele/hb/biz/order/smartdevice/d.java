package me.ele.hb.biz.order.smartdevice;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.socks.library.KLog;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.hb.biz.order.magex.sound.helper.r;
import me.ele.hb.voice.spi.params.PlayTtsParams;
import me.ele.soundmanager.player.playitem.Priority;

/* loaded from: classes5.dex */
public class d {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a */
    AtomicBoolean f65049a = new AtomicBoolean(false);

    /* renamed from: b */
    me.ele.soundmanager.player.playitem.b f65050b;

    /* loaded from: classes5.dex */
    public class a implements me.ele.hb.biz.order.smartdevice.a {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a */
        final /* synthetic */ long f65051a;

        /* renamed from: b */
        final /* synthetic */ int f65052b;

        /* renamed from: c */
        final /* synthetic */ String f65053c;

        a(long j12, int i12, String str) {
            this.f65051a = j12;
            this.f65052b = i12;
            this.f65053c = str;
        }

        public static /* synthetic */ void lambda$done$3f47bed8$1(long j12, int i12, String str, boolean z12) {
            String str2;
            KLog.e("HBVoiceSenceHelper", "SmartHelmetNewGrabOrder isSuccess = " + z12);
            if (z12) {
                str2 = "接单成功";
            } else {
                str2 = "未确认接单";
            }
            r.d("" + j12, z12, i12, true);
            PlayTtsParams playTtsParams = new PlayTtsParams(str, str2, h21.d.f53781b);
            playTtsParams.setEnablePlayInCall(true);
            playTtsParams.setPriority(Priority.MAX_PRIORITY.getPriority());
            h21.c.i(playTtsParams);
        }

        @Override // me.ele.hb.biz.order.smartdevice.a
        public void a() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            me.ele.soundmanager.player.playitem.b bVar = d.this.f65050b;
            if (bVar != null) {
                bVar.cancel();
            }
            KLog.e("HBVoiceSenceHelper", "SmartHelmetNewGrabOrder 头盔点击按键");
            r.e("" + this.f65051a, this.f65052b, true, null);
            long j12 = this.f65051a;
            me.ele.hb.biz.order.magex.messages.d.Z(j12, new c(j12, this.f65052b, this.f65053c));
        }
    }

    public void a(String str, long j12, String str2, int i12, boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, str, Long.valueOf(j12), str2, Integer.valueOf(i12), Boolean.valueOf(z12)});
            return;
        }
        if (!b.a()) {
            KLog.e("HBVoiceSenceHelper", "enableSmartHelmetGrabOrder not open");
            return;
        }
        if (!z12) {
            PlayTtsParams playTtsParams = new PlayTtsParams(str, str2, h21.d.f53781b);
            playTtsParams.setEnablePlayInCall(true);
            playTtsParams.setPlayDiAtEnd(b.a());
            h21.c.i(playTtsParams);
        }
        r.c(String.valueOf(j12), str2, i12, true);
        b.b(this.f65049a, str2, new a(j12, i12, str));
    }

    public void b(me.ele.soundmanager.player.playitem.b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, bVar});
        } else {
            this.f65050b = bVar;
        }
    }
}
