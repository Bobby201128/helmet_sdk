package me.ele.hb.biz.order.smartdevice;

import android.text.TextUtils;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.socks.library.KLog;
import i80.j;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.aiot.kernel.bean.BleDeviceStatusBean;
import me.ele.aiot.kernel.constants.BleDeviceStatusEnum;
import me.ele.aiot.kernel.constants.BleDeviceTypeEnum;
import me.ele.aiot.kernel.constants.ClickEventEnum;
import me.ele.hb.biz.order.smartdevice.e;
import me.ele.normandie.sampling.config.NormandyOrangeConfig;

/* loaded from: classes5.dex */
public class b {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* loaded from: classes5.dex */
    public class a implements e.b {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f65040a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        i80.a f65041b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f65042c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ me.ele.hb.biz.order.smartdevice.a f65043d;

        /* renamed from: me.ele.hb.biz.order.smartdevice.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C1227a implements i80.a {
            private static transient /* synthetic */ ISurgeon $surgeonFlag;

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f65044a;

            C1227a(e eVar) {
                this.f65044a = eVar;
            }

            @Override // i80.a
            public boolean a(BleDeviceTypeEnum bleDeviceTypeEnum, ClickEventEnum clickEventEnum) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    return ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{this, bleDeviceTypeEnum, clickEventEnum})).booleanValue();
                }
                if (bleDeviceTypeEnum != BleDeviceTypeEnum.ERJI && bleDeviceTypeEnum != BleDeviceTypeEnum.TOUKUI) {
                    return false;
                }
                KLog.i("HBSmartHelmetHelper", "头盔到店事件: " + clickEventEnum.toString());
                e eVar = this.f65044a;
                if (eVar != null) {
                    eVar.a();
                }
                if (a.this.f65042c.compareAndSet(false, true)) {
                    if (a.this.f65040a.get()) {
                        KLog.w("HBSmartHelmetHelper", String.format("头盔到店(%d超时): %s", Long.valueOf(b.g() / 1000), clickEventEnum.toString()));
                        return true;
                    }
                    me.ele.hb.biz.order.smartdevice.a aVar = a.this.f65043d;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
                return true;
            }
        }

        a(AtomicBoolean atomicBoolean, me.ele.hb.biz.order.smartdevice.a aVar) {
            this.f65042c = atomicBoolean;
            this.f65043d = aVar;
        }

        @Override // me.ele.hb.biz.order.smartdevice.e.b
        public void a(e eVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, eVar});
                return;
            }
            C1227a c1227a = new C1227a(eVar);
            this.f65041b = c1227a;
            j.a(c1227a);
        }

        @Override // me.ele.hb.biz.order.smartdevice.e.b
        public void timeout() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this});
                return;
            }
            KLog.i("HBSmartHelmetHelper", "头盔到店事件: timeout");
            this.f65040a.set(true);
            i80.a aVar = this.f65041b;
            if (aVar != null) {
                j.n(aVar);
            }
            KLog.i("HBSmartHelmetHelper", "头盔到店事件: removeHelmetButtonCallback");
        }
    }

    public static boolean a() {
        boolean z12;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("6", new Object[0])).booleanValue();
        }
        if (c() && c01.b.i()) {
            z12 = true;
        } else {
            z12 = false;
        }
        KLog.e("HBVoiceSenceHelper", "enableSmartHelmetGrabOrder = " + z12);
        return z12;
    }

    public static void b(AtomicBoolean atomicBoolean, String str, me.ele.hb.biz.order.smartdevice.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{atomicBoolean, str, aVar});
            return;
        }
        if (c()) {
            long g12 = g();
            if (!TextUtils.isEmpty(str)) {
                g12 += str.length() * 160;
            }
            KLog.i("HBSmartHelmetHelper", "头盔到店事件: smartHelmetEnable = true");
            new e(new a(atomicBoolean, aVar), g12);
            return;
        }
        KLog.i("HBSmartHelmetHelper", "头盔到店事件: smartHelmetEnable = false");
    }

    public static boolean c() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[0])).booleanValue();
        }
        BleDeviceStatusBean i12 = j.i();
        if (i12 == null) {
            return false;
        }
        if ((i12.getBleDeviceTypeEnum() != BleDeviceTypeEnum.TOUKUI && i12.getBleDeviceTypeEnum() != BleDeviceTypeEnum.ERJI) || !e() || j.i().getBleDeviceStatusEnum() != BleDeviceStatusEnum.CONNECTED) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        boolean z12;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[0])).booleanValue();
        }
        if (c() && c01.b.n()) {
            z12 = true;
        } else {
            z12 = false;
        }
        KLog.e("HBVoiceSenceHelper", "smartHelmetNearCallEnable = " + z12);
        return z12;
    }

    private static boolean e() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Boolean) iSurgeon.surgeon$dispatch("2", new Object[0])).booleanValue() : kq0.a.e(NormandyOrangeConfig.NAMESPACE, "enableSmartHelmet", false);
    }

    public static boolean f() {
        boolean z12;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("4", new Object[0])).booleanValue();
        }
        if (c() && c01.b.h()) {
            z12 = true;
        } else {
            z12 = false;
        }
        KLog.e("HBVoiceSenceHelper", "smartHelmetOvertimeEnable = " + z12);
        return z12;
    }

    public static long g() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[0])).longValue() : kq0.a.b(NormandyOrangeConfig.NAMESPACE, "smartHelmetTimeout", JosStatusCodes.RTN_CODE_COMMON_ERROR);
    }
}
