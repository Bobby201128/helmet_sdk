package i80;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.aiot.kernel.bean.BleDeviceStatusBean;
import me.ele.aiot.kernel.constants.BleDeviceStatusEnum;
import me.ele.aiot.kernel.constants.BleDeviceTypeEnum;
import me.ele.aiot.kernel.constants.KnightWorkStatusEnum;
import me.ele.aiot.kernel.http.KnightSmartDeviceEnv;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class j {
    private static transient /* synthetic */ ISurgeon $surgeonFlag = null;

    /* renamed from: a, reason: collision with root package name */
    public static Application f54966a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Context f54967b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f54968c = true;

    /* renamed from: d, reason: collision with root package name */
    public static e f54969d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f54970e = false;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f54971f = false;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f54972g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f54973h = false;

    /* renamed from: i, reason: collision with root package name */
    private static volatile boolean f54974i = false;

    /* renamed from: j, reason: collision with root package name */
    private static int f54975j;

    public static void a(a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{aVar});
        } else {
            if (f54966a == null) {
                j90.c.b("KnightSmartDeviceApi", "addBleDeviceButtonCallback  mApplication ==null");
                return;
            }
            j90.c.b("KnightSmartDeviceApi", "addBleDeviceButtonCallback");
            q80.g.x0(f54966a).X(aVar);
            k90.b.a("add_button_callback", null);
        }
    }

    public static void b(d dVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{dVar});
        }
    }

    public static synchronized void c(e eVar) {
        synchronized (j.class) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "17")) {
                iSurgeon.surgeon$dispatch("17", new Object[]{eVar});
                return;
            }
            if (eVar != null) {
                f54969d = eVar;
            }
            if (f54966a == null) {
                return;
            }
            f54970e = true;
            j90.c.b("KnightSmartDeviceApi", "addHelmetDeviceDataListener");
            q80.g.x0(f54966a).Y(eVar);
        }
    }

    public static void d(f fVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "19")) {
            iSurgeon.surgeon$dispatch("19", new Object[]{fVar});
        }
    }

    public static void e(j90.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{aVar});
        } else {
            j90.b.b().a(aVar);
        }
    }

    public static void f() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            iSurgeon.surgeon$dispatch("15", new Object[0]);
        } else {
            if (f54966a == null) {
                return;
            }
            j90.c.b("KnightSmartDeviceApi", "clearBleDeviceButtonCallback");
            q80.g.x0(f54966a).e0();
        }
    }

    public static String g() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            return (String) iSurgeon.surgeon$dispatch("13", new Object[0]);
        }
        Application application = f54966a;
        if (application == null) {
            return "";
        }
        return q80.g.x0(application).r0();
    }

    public static String h() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            return (String) iSurgeon.surgeon$dispatch("12", new Object[0]);
        }
        Application application = f54966a;
        if (application == null) {
            return "";
        }
        return q80.g.x0(application).s0();
    }

    public static BleDeviceStatusBean i() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            return (BleDeviceStatusBean) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[0]);
        }
        Application application = f54966a;
        if (application == null) {
            j90.b.c("KnightSmartDeviceApi", "getHelmetDeviceStatus = mApplication is null");
            return new BleDeviceStatusBean(BleDeviceTypeEnum.UNKNOWN, BleDeviceStatusEnum.NOT_BINDING);
        }
        return q80.g.x0(application).t0();
    }

    public static String j() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (String) iSurgeon.surgeon$dispatch("9", new Object[0]);
        }
        Application application = f54966a;
        if (application == null) {
            return "";
        }
        return q80.g.x0(application).w0();
    }

    public static String k() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            return (String) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[0]);
        }
        Application application = f54966a;
        if (application == null) {
            return "";
        }
        return q80.g.x0(application).z0();
    }

    public static void l(Application application) {
        e eVar;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{application});
            return;
        }
        if (application == null) {
            return;
        }
        f54966a = application;
        f54967b = application.getApplicationContext();
        j90.c.b("KnightSmartDeviceApi", "packageName:" + f54967b.getPackageName() + "(" + f54967b.getPackageName() + ")");
        if (TextUtils.equals(f54967b.getPackageName(), "me.ele.crowdsource")) {
            f54968c = false;
        }
        j90.c.b("KnightSmartDeviceApi", "IS_TEAM_APP:" + f54968c);
        q80.g.x0(application).C0();
        if (!f54970e && (eVar = f54969d) != null) {
            c(eVar);
        }
        if (!f54971f) {
            j90.c.b("KnightSmartDeviceApi", "initKnightSmartDevice updateKnightWorkStatus");
            t(f54972g, f54973h);
        }
        if (!f54974i) {
            j90.c.b("KnightSmartDeviceApi", "initKnightSmartDevice setCityId");
            p(f54975j);
        }
    }

    public static boolean m() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("11", new Object[0])).booleanValue();
        }
        Application application = f54966a;
        if (application == null) {
            return false;
        }
        return q80.g.x0(application).G0();
    }

    public static void n(a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{aVar});
        } else {
            if (f54966a == null) {
                return;
            }
            j90.c.b("KnightSmartDeviceApi", "removeBleDeviceButtonCallback");
            q80.g.x0(f54966a).P0(aVar);
            k90.b.a("remove_button_callback", null);
        }
    }

    public static void o(c cVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{cVar});
        }
    }

    public static void p(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{Integer.valueOf(i12)});
            return;
        }
        f54975j = i12;
        Application application = f54966a;
        if (application == null) {
            j90.b.c("KnightSmartDeviceApi", "setCityId mApplication is null");
        } else {
            q80.g.x0(application).W0(f54975j);
        }
    }

    public static void q(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{Long.valueOf(j12)});
        }
    }

    public static void r(KnightSmartDeviceEnv knightSmartDeviceEnv) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{knightSmartDeviceEnv});
        } else {
            l80.d.g().o(knightSmartDeviceEnv);
        }
    }

    public static void s(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{str, str2});
            return;
        }
        if (f54966a == null) {
            return;
        }
        j90.c.b("KnightSmartDeviceApi", "setLoginStatusInfo:knightId =" + str + ",token =" + str2);
        q80.g.x0(f54966a).U0(str, str2);
    }

    public static void t(boolean z12, boolean z13) {
        KnightWorkStatusEnum knightWorkStatusEnum;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{Boolean.valueOf(z12), Boolean.valueOf(z13)});
            return;
        }
        j90.c.b("kSD_BLUETOOTH_SCAN", "KnightSmartDeviceApi updateKnightWorkStatus isWorking:" + z12 + ",hasDoingOrders:" + z13);
        f54972g = z12;
        f54973h = z13;
        if (f54966a == null) {
            return;
        }
        f54971f = true;
        k90.c.g(z12);
        k90.c.f(z13);
        q80.g x02 = q80.g.x0(f54966a);
        if (!f54972g && !f54973h) {
            knightWorkStatusEnum = KnightWorkStatusEnum.OFFWORK;
        } else {
            knightWorkStatusEnum = KnightWorkStatusEnum.WORK;
        }
        x02.f1(knightWorkStatusEnum);
    }
}
