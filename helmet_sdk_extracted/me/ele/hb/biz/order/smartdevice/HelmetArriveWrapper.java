package me.ele.hb.biz.order.smartdevice;

import android.text.TextUtils;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.koubei.android.mist.flex.template.TemplateObject;
import com.socks.library.KLog;
import ff0.q;
import fh1.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.hb.biz.order.magex.model.HBMOrder;
import me.ele.hb.biz.order.magex.sound.SpeechAutoArriveShop;
import me.ele.hb.biz.order.magex.sound.SpeechCheckArrive;
import me.ele.hb.biz.order.magex.sound.helper.r;
import me.ele.hb.biz.order.magex.sound.helper.u;
import me.ele.hb.location.model.HBLocation;
import me.ele.hb.voice.spi.params.PlayTtsParams;
import me.ele.soundmanager.player.playitem.Priority;
import z81.r0;

/* loaded from: classes5.dex */
public class HelmetArriveWrapper {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    me.ele.soundmanager.player.playitem.b f65026a;

    /* renamed from: b, reason: collision with root package name */
    AtomicBoolean f65027b = new AtomicBoolean(false);

    /* renamed from: me.ele.hb.biz.order.smartdevice.HelmetArriveWrapper$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements SpeechCheckArrive {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        final /* synthetic */ int val$count;
        final /* synthetic */ boolean val$enableSpeech;
        final /* synthetic */ HBMOrder val$hbmOrder;
        final /* synthetic */ String val$speechTxt;
        final /* synthetic */ String val$trackingId;
        final /* synthetic */ List val$unArriveOrderIds;

        AnonymousClass1(HBMOrder hBMOrder, String str, boolean z12, int i12, List list, String str2) {
            this.val$hbmOrder = hBMOrder;
            this.val$speechTxt = str;
            this.val$enableSpeech = z12;
            this.val$count = i12;
            this.val$unArriveOrderIds = list;
            this.val$trackingId = str2;
        }

        @Override // me.ele.hb.biz.order.magex.sound.SpeechCheckArrive
        public void isCanStartVoice(boolean z12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, Boolean.valueOf(z12)});
                return;
            }
            if (z12) {
                me.ele.hb.biz.order.sound.arrive.config.a.f("arrive_check", 1L, "校验成功");
                String d12 = u.d(this.val$hbmOrder.getBroadcastOrderPickAddress());
                String str = this.val$speechTxt;
                if (!this.val$enableSpeech) {
                    str = String.format(r0.c(q.f50791m7), d12, Integer.valueOf(this.val$count));
                    PlayTtsParams playTtsParams = new PlayTtsParams(this.val$hbmOrder.getTrackingId() + "", str, h21.d.f53781b);
                    playTtsParams.setPlayDiAtEnd(true);
                    h21.c.i(playTtsParams);
                }
                yo0.a.f92433r.addAll(this.val$unArriveOrderIds);
                r.f(this.val$trackingId, true, str);
                b.b(HelmetArriveWrapper.this.f65027b, str, new a() { // from class: me.ele.hb.biz.order.smartdevice.HelmetArriveWrapper.1.1
                    private static transient /* synthetic */ ISurgeon $surgeonFlag;

                    @Override // me.ele.hb.biz.order.smartdevice.a
                    public void a() {
                        ISurgeon iSurgeon2 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon2, "1")) {
                            iSurgeon2.surgeon$dispatch("1", new Object[]{this});
                            return;
                        }
                        r.j(AnonymousClass1.this.val$trackingId, true, null);
                        me.ele.soundmanager.player.playitem.b bVar = HelmetArriveWrapper.this.f65026a;
                        if (bVar != null) {
                            bVar.cancel();
                        }
                        me.ele.hb.biz.order.magex.messages.d.X(AnonymousClass1.this.val$hbmOrder.getTrackingId(), new SpeechAutoArriveShop() { // from class: me.ele.hb.biz.order.smartdevice.HelmetArriveWrapper.1.1.1
                            private static transient /* synthetic */ ISurgeon $surgeonFlag;

                            @Override // me.ele.hb.biz.order.magex.sound.SpeechAutoArriveShop
                            public void voiceArriveFail(int i12, String str2) {
                                ISurgeon iSurgeon3 = $surgeonFlag;
                                if (InstrumentAPI.support(iSurgeon3, "2")) {
                                    iSurgeon3.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12), str2});
                                    return;
                                }
                                r.g(AnonymousClass1.this.val$trackingId, true);
                                me.ele.hb.biz.order.sound.arrive.config.a.g("arrive_recognize_request", 0L, str2, i12 + "");
                                PlayTtsParams playTtsParams2 = new PlayTtsParams(AnonymousClass1.this.val$hbmOrder.getTrackingId() + "", "未确认到店，请手动操作", h21.d.f53781b);
                                playTtsParams2.setPriority(Priority.MAX_PRIORITY.getPriority());
                                h21.c.i(playTtsParams2);
                                KLog.e("HBSmartHelmetHelper", "头盔到店失败", str2);
                            }

                            @Override // me.ele.hb.biz.order.magex.sound.SpeechAutoArriveShop
                            public void voiceArriveNetError(int i12, String str2) {
                                ISurgeon iSurgeon3 = $surgeonFlag;
                                if (InstrumentAPI.support(iSurgeon3, "3")) {
                                    iSurgeon3.surgeon$dispatch("3", new Object[]{this, Integer.valueOf(i12), str2});
                                    return;
                                }
                                r.g(AnonymousClass1.this.val$trackingId, true);
                                me.ele.hb.biz.order.sound.arrive.config.a.g("arrive_recognize_request", 0L, str2, i12 + "");
                                PlayTtsParams playTtsParams2 = new PlayTtsParams(AnonymousClass1.this.val$hbmOrder.getTrackingId() + "", "网络错误，请手动操作", h21.d.f53781b);
                                playTtsParams2.setPriority(Priority.MAX_PRIORITY.getPriority());
                                h21.c.i(playTtsParams2);
                                KLog.e("HBSmartHelmetHelper", "头盔到店失败", str2);
                            }

                            @Override // me.ele.hb.biz.order.magex.sound.SpeechAutoArriveShop
                            public void voiceArriveSuccess() {
                                ISurgeon iSurgeon3 = $surgeonFlag;
                                if (InstrumentAPI.support(iSurgeon3, "1")) {
                                    iSurgeon3.surgeon$dispatch("1", new Object[]{this});
                                    return;
                                }
                                r.h(AnonymousClass1.this.val$trackingId, true);
                                me.ele.hb.biz.order.sound.arrive.config.a.f("arrive_recognize_request", 1L, "头盔送达成功");
                                TemplateObject templateObject = new TemplateObject();
                                templateObject.put("tracking_id", (Object) AnonymousClass1.this.val$trackingId);
                                me.ele.hb.biz.order.magex.messages.d.P(i.b(templateObject));
                                PlayTtsParams playTtsParams2 = new PlayTtsParams(AnonymousClass1.this.val$hbmOrder.getTrackingId() + "", "到店成功", h21.d.f53781b);
                                playTtsParams2.setPriority(Priority.MAX_PRIORITY.getPriority());
                                h21.c.i(playTtsParams2);
                                KLog.i("HBSmartHelmetHelper", "头盔到店成功");
                            }
                        });
                    }
                });
                return;
            }
            me.ele.hb.biz.order.magex.sound.u.b("event_broadcast_arrive_distance_check_fail", this.val$trackingId);
            me.ele.hb.biz.order.sound.arrive.config.a.f("arrive_check", 0L, "校验失败");
            KLog.e("HBSmartHelmetHelper", "Arrive check not pass");
        }
    }

    private void a(HBMOrder hBMOrder, String str, boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, hBMOrder, str, Boolean.valueOf(z12)});
            return;
        }
        if (hBMOrder == null) {
            return;
        }
        String str2 = hBMOrder.getTrackingId() + "";
        List<String> a12 = to0.b.a(hBMOrder);
        me.ele.hb.biz.order.magex.messages.d.a0(hBMOrder.getTrackingId(), new AnonymousClass1(hBMOrder, str, z12, Math.max(a12.size(), 1), a12, str2));
    }

    public void b(HBLocation hBLocation, String str, boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, hBLocation, str, Boolean.valueOf(z12)});
            return;
        }
        if (hBLocation != null && hBLocation.isPoiHit() && hBLocation.getErrorCode() == 0) {
            if (!b.c()) {
                KLog.e("HBSmartHelmetHelper", "smartHelmetEnable false");
                return;
            }
            if (!c01.b.g()) {
                KLog.e("HBSmartHelmetHelper", "isHelmatArriveEnable false");
                return;
            }
            List<HBMOrder> p12 = dn0.c.p(20);
            if (p12 != null && !p12.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                String poiID = hBLocation.getPoiID();
                try {
                    for (HBMOrder hBMOrder : p12) {
                        if (TextUtils.equals(hBMOrder.getPickSite().getRetailerId() + "", poiID) && hBMOrder.getShippingState() == 20) {
                            arrayList.add(hBMOrder);
                        }
                    }
                } catch (Throwable th2) {
                    KLog.e("HBSmartHelmetHelper", th2);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                List<HBMOrder> a12 = xo0.b.a(arrayList, yo0.a.f92433r);
                if (a12.isEmpty()) {
                    KLog.e("HBSmartHelmetHelper", "hbLocation unArriveRecognizegedOrders is empty");
                } else {
                    a(a12.get(0), str, z12);
                }
            }
        }
    }

    public void c(me.ele.soundmanager.player.playitem.b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, bVar});
        } else {
            this.f65026a = bVar;
        }
    }
}
