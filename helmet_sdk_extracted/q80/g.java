package q80;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.util.PhoneInfo;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.Gson;
import com.taobao.aranger.constant.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l80.a;
import l80.d;
import me.ele.aiot.fastble.data.BleDevice;
import me.ele.aiot.fastble.exception.BleException;
import me.ele.aiot.kernel.bean.AsrTaskResultDTO;
import me.ele.aiot.kernel.bean.BleDeviceStatusBean;
import me.ele.aiot.kernel.bean.BondedHeadset;
import me.ele.aiot.kernel.bean.BoundBleDeviceInfo;
import me.ele.aiot.kernel.bean.DiscoveredBleDeviceBean;
import me.ele.aiot.kernel.bean.KnightSmartDeviceInfoBean;
import me.ele.aiot.kernel.bean.QueryIotDeviceConfig;
import me.ele.aiot.kernel.constants.BleDeviceEventEnum;
import me.ele.aiot.kernel.constants.BleDeviceStatusEnum;
import me.ele.aiot.kernel.constants.BleDeviceTypeEnum;
import me.ele.aiot.kernel.constants.ClickEventEnum;
import me.ele.aiot.kernel.constants.KnightWorkStatusEnum;
import me.ele.aiot.kernel.constants.LibConstant;
import me.ele.aiot.kernel.constants.ProductKeyEnum;
import me.ele.aiot.sensor.model.CollectionDataModel;
import me.ele.aiot.sensor.model.HeartBeatModel;
import me.ele.hunter.trace.aspect.HBHunterTraceAspect;
import me.ele.location.newcustomlocation.LocationConstants;
import me.ele.td.lib.wrapper.WrapScheduledThreadPoolExecutor;
import okhttp3.i0;
import org.android.agoo.common.AgooConstants;
import org.aspectj.lang.a;
import z70.a;

/* loaded from: classes4.dex */
public class g {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: d0, reason: collision with root package name */
    private static g f83477d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final de0.i<s80.a> f83478e0;

    /* renamed from: f0, reason: collision with root package name */
    private static volatile long f83479f0;

    /* renamed from: g0, reason: collision with root package name */
    private static volatile int f83480g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC1573a f83481h0 = null;
    private ScheduledExecutorService D;
    private ScheduledExecutorService F;
    private ScheduledExecutorService H;
    private i80.b J;
    private File R;
    private int S;
    private i80.e X;
    private t80.f Y;

    /* renamed from: a, reason: collision with root package name */
    private Context f83482a;

    /* renamed from: b, reason: collision with root package name */
    private Application f83484b;

    /* renamed from: f, reason: collision with root package name */
    private j80.a f83490f;

    /* renamed from: g, reason: collision with root package name */
    private i80.g f83491g;

    /* renamed from: l, reason: collision with root package name */
    private int f83496l;

    /* renamed from: m, reason: collision with root package name */
    private BondedHeadset f83497m;

    /* renamed from: r, reason: collision with root package name */
    private long f83502r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f83503s;

    /* renamed from: c, reason: collision with root package name */
    private boolean f83486c = false;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f83488d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f83489e = false;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f83492h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, me.ele.aiot.sensor.internal.c> f83493i = new ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    private String f83494j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f83495k = "";

    /* renamed from: n, reason: collision with root package name */
    private String f83498n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f83499o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f83500p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f83501q = "";

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f83504t = false;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f83505u = false;

    /* renamed from: v, reason: collision with root package name */
    private KnightWorkStatusEnum f83506v = KnightWorkStatusEnum.UNKNOWN;

    /* renamed from: w, reason: collision with root package name */
    private final Map<String, Long> f83507w = new ConcurrentHashMap();

    /* renamed from: x, reason: collision with root package name */
    private final Map<String, Long> f83508x = new ConcurrentHashMap();

    /* renamed from: y, reason: collision with root package name */
    private final Map<String, Long> f83509y = new ConcurrentHashMap();

    /* renamed from: z, reason: collision with root package name */
    private List<KnightSmartDeviceInfoBean> f83510z = new CopyOnWriteArrayList();
    private List<String> A = new CopyOnWriteArrayList();
    private Map<String, String> B = new ConcurrentHashMap();
    private Map<String, s80.a> C = new ConcurrentHashMap();
    private List<ScheduledFuture<?>> E = new CopyOnWriteArrayList();
    private final List<ScheduledFuture<?>> G = new CopyOnWriteArrayList();
    private final List<ScheduledFuture<?>> I = new CopyOnWriteArrayList();
    private final List<i80.a> K = new ArrayList();
    private final Map<String, BoundBleDeviceInfo> L = new ConcurrentHashMap();
    private final Handler M = new me.ele.td.lib.wrapper.e(Looper.getMainLooper());
    private final Gson N = new Gson();
    private final List<HeartBeatModel> O = Collections.synchronizedList(new ArrayList());
    private final CollectionDataModel P = new CollectionDataModel();
    private String Q = "";
    private final Set<Integer> T = new HashSet();
    private int U = 0;
    private int V = 0;
    private String W = "";
    Runnable Z = new RunnableC1651g();

    /* renamed from: a0, reason: collision with root package name */
    de0.d<s80.a> f83483a0 = new j();

    /* renamed from: b0, reason: collision with root package name */
    me.ele.aiot.sensor.internal.a f83485b0 = new a();

    /* renamed from: c0, reason: collision with root package name */
    BroadcastReceiver f83487c0 = new b();

    /* loaded from: classes4.dex */
    public class a implements me.ele.aiot.sensor.internal.a {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a() {
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void a(String str, String str2, String str3, String str4, String str5) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, str, str2, str3, str4, str5});
            } else {
                m80.a.j().o(str, str2, str3, str4, str5);
            }
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void b(me.ele.aiot.sensor.internal.c cVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, cVar});
            } else {
                u80.a.b().a(new p80.a(cVar));
            }
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void c(float f12, long j12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Float.valueOf(f12), Long.valueOf(j12)});
                return;
            }
            j90.c.b("kSD_PRESSURE", "pressure:" + f12 + ",timestamp:" + j12);
            try {
                if (g.this.X != null) {
                    g.this.X.onPressureCallback(f12, j12);
                }
            } catch (Throwable th2) {
                j90.c.b("kSD_THROWABLE", "onPressureCallBack throwable:" + th2);
            }
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void d(String str, String str2, String str3, String str4) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "5")) {
                iSurgeon.surgeon$dispatch("5", new Object[]{this, str, str2, str3, str4});
            } else {
                m80.a.j().n(str, str2, str3, str4);
            }
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void e(HeartBeatModel heartBeatModel) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                iSurgeon.surgeon$dispatch("7", new Object[]{this, heartBeatModel});
            } else {
                g.this.n0(heartBeatModel);
            }
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void f(me.ele.aiot.sensor.internal.c cVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, cVar});
            } else if (cVar != null) {
                g.this.H0(cVar);
            }
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void g(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
                return;
            }
            me.ele.aiot.sensor.internal.c b12 = v80.b.b(g.this.f83493i, str);
            if (b12 != null) {
                b12.X0(true);
            }
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void onFallOverCallback(int i12, long j12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "9")) {
                iSurgeon.surgeon$dispatch("9", new Object[]{this, Integer.valueOf(i12), Long.valueOf(j12)});
            } else if (g.this.X != null) {
                g.this.X.onFallOverCallback(i12, j12);
            }
        }

        @Override // me.ele.aiot.sensor.internal.a
        public void onUpgradeEvent(long j12, String str, String str2, String str3, long j13) {
            boolean z12;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Long.valueOf(j12), str, str2, str3, Long.valueOf(j13)});
                return;
            }
            g.this.S0(j12, str, str2, str3, j13);
            j90.c.b("KSD_Manager", "eventType:" + str2 + ",eventValue:" + str3);
            if ("buttonEvent".equals(str2) && "2".equals(str3)) {
                for (i80.a aVar : g.this.K) {
                    j90.c.b("KSD_Manager", "onUpgradeEvent bleDeviceButtonCallback has callback");
                    BleDeviceTypeEnum u02 = g.this.u0(str);
                    if (u02 != null && u02 != BleDeviceTypeEnum.UNKNOWN) {
                        j90.c.b("KSD_Manager", "onUpgradeEvent->onClickEventCallback:" + u02);
                        z12 = aVar.a(u02, ClickEventEnum.ONCE_CLICK);
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        j90.c.b("KSD_Manager", "onUpgradeEvent bleDeviceButtonCallback had execute， then remove it");
                        g.this.K.remove(aVar);
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b extends BroadcastReceiver {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f83512b = null;

        static {
            a();
        }

        b() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("KnightSmartDeviceManager.java", b.class);
            f83512b = cVar.i("method-execution", cVar.h("1", "onReceive", "me.ele.aiot.kernel.manager.KnightSmartDeviceManager$11", "android.content.Context:android.content.Intent", "context:intent", "", Constants.VOID), 0);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            me.ele.aiot.sensor.internal.c cVar;
            org.aspectj.lang.a f12 = jl1.c.f(f83512b, this, this, context, intent);
            try {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    iSurgeon.surgeon$dispatch("1", new Object[]{this, context, intent});
                } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10) {
                    j90.c.b("kSD_BLUETOOTH_ADAPTER_STATE_CHANGED", "Bluetooth state is OFF");
                    for (Map.Entry entry : g.this.f83493i.entrySet()) {
                        if (entry != null && entry.getValue() != null && (cVar = (me.ele.aiot.sensor.internal.c) entry.getValue()) != null) {
                            cVar.a0();
                        }
                    }
                }
            } finally {
                HBHunterTraceAspect.aspectOf().handleOnReceive(f12);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class c implements a.b {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        c() {
        }

        @Override // l80.a.b
        public void a(AsrTaskResultDTO asrTaskResultDTO) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, asrTaskResultDTO});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "音频转写提交成功: requestId=" + asrTaskResultDTO.getRequestId() + ", status=" + asrTaskResultDTO.getStatus() + ", code=" + asrTaskResultDTO.getCode());
        }

        @Override // l80.a.b
        public void onError(String str, String str2) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str, str2});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "音频转写提交失败: " + str + " - " + str2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends BroadcastReceiver {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f83515a = null;

        static {
            a();
        }

        d() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("KnightSmartDeviceManager.java", d.class);
            f83515a = cVar.i("method-execution", cVar.h("1", "onReceive", "me.ele.aiot.kernel.manager.KnightSmartDeviceManager$1", "android.content.Context:android.content.Intent", "context:intent", "", Constants.VOID), 0);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long j12;
            int i12;
            org.aspectj.lang.a f12 = jl1.c.f(f83515a, this, this, context, intent);
            try {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    iSurgeon.surgeon$dispatch("1", new Object[]{this, context, intent});
                } else {
                    try {
                        if (!"hb_mist_order_make_phone_call_notification".equals(intent.getAction())) {
                            j90.c.b("KSD_Manager", "registerMakePhoneCallReceiver action is not hb_mist_order_make_phone_call_notification.");
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras == null) {
                                j90.c.b("KSD_Manager", "registerMakePhoneCallReceiver bundle is null.");
                            } else {
                                Object obj = extras.get("params");
                                if (obj instanceof Map) {
                                    Map map = (Map) obj;
                                    Object obj2 = map.get("tracking_id");
                                    Object obj3 = map.get("contact_type");
                                    if (obj2 instanceof Number) {
                                        j12 = ((Number) obj2).longValue();
                                    } else if (obj2 instanceof String) {
                                        j12 = Long.parseLong((String) obj2);
                                    } else {
                                        j12 = -1;
                                    }
                                    if (obj3 instanceof Integer) {
                                        i12 = ((Integer) obj3).intValue();
                                    } else {
                                        i12 = -1;
                                    }
                                    j90.c.b("KSD_Manager", "registerMakePhoneCallReceiver tracking_id => " + j12 + ", contact_type => " + i12);
                                    long unused = g.f83479f0 = j12;
                                    int unused2 = g.f83480g0 = i12;
                                } else {
                                    j90.c.b("KSD_Manager", "registerMakePhoneCallReceiver params is null. params = " + obj);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        j90.c.b("kSD_THROWABLE", "registerMakePhoneCallReceiver onReceive throwable:" + th2);
                    }
                }
            } finally {
                HBHunterTraceAspect.aspectOf().handleOnReceive(f12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends com.google.gson.reflect.a<List<KnightSmartDeviceInfoBean>> {
        e() {
        }
    }

    /* loaded from: classes4.dex */
    public class f implements t80.i {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f83517a;

        /* loaded from: classes4.dex */
        public class a implements Runnable {
            private static transient /* synthetic */ ISurgeon $surgeonFlag;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f83519n;

            a(String str) {
                this.f83519n = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    iSurgeon.surgeon$dispatch("1", new Object[]{this});
                    return;
                }
                File externalFilesDir = f.this.f83517a.getExternalFilesDir("shantalk");
                if (externalFilesDir == null) {
                    externalFilesDir = new File(f.this.f83517a.getCacheDir(), "shantalk");
                }
                String absolutePath = new File(externalFilesDir, "received_" + rf1.c.v() + "." + this.f83519n).getAbsolutePath();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("文件路径: ");
                sb2.append(absolutePath);
                j90.c.b("KSD_Manager_SPP", sb2.toString());
                g.this.R = new File(absolutePath);
                File parentFile = g.this.R.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                if (!g.this.R.exists()) {
                    try {
                        g.this.R.createNewFile();
                    } catch (IOException e12) {
                        j90.c.b("KSD_Manager_SPP", "创建新文件失败 e: " + e12.getMessage());
                    }
                }
                j90.c.b("KSD_Manager_SPP", "已创建新文件: " + absolutePath);
            }
        }

        /* loaded from: classes4.dex */
        public class b implements Runnable {
            private static transient /* synthetic */ ISurgeon $surgeonFlag;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ byte[] f83521n;

            b(byte[] bArr) {
                this.f83521n = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    iSurgeon.surgeon$dispatch("1", new Object[]{this});
                    return;
                }
                g gVar = g.this;
                gVar.i1(this.f83521n, gVar.R);
                g.this.Y.m();
            }
        }

        f(Context context) {
            this.f83517a = context;
        }

        @Override // t80.i
        public void a(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, str});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onLog:" + str);
        }

        @Override // t80.i
        public void b(byte[] bArr, int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "9")) {
                iSurgeon.surgeon$dispatch("9", new Object[]{this, bArr, Integer.valueOf(i12)});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onRawBytesReceived:" + l90.a.a(bArr) + ",length:" + i12);
        }

        @Override // t80.i
        public void c(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                iSurgeon.surgeon$dispatch("7", new Object[]{this, str});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onConnectFailed:" + str);
        }

        @Override // t80.i
        public void d(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onRawTextReceived:" + str);
        }

        @Override // t80.i
        public void e(String str) {
            String[] split;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "12")) {
                iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onPrepareReceived:" + str);
            if (str == null) {
                split = new String[0];
            } else {
                split = str.split(":");
            }
            if (split.length >= 2 && !TextUtils.isEmpty(split[0])) {
                String str2 = split[0];
                try {
                    int parseInt = Integer.parseInt(split[1]);
                    if (parseInt <= 0) {
                        j90.c.b("KSD_Manager_SPP", "onPrepareReceived fileSize<=0: " + parseInt);
                        g.this.Y.o();
                        return;
                    }
                    g.this.W = str2;
                    g.this.U = parseInt;
                    j90.c.b("KSD_Manager_SPP", "解析结果: fileType=" + str2 + ", fileSize=" + g.this.U);
                    j90.c.b("KSD_Manager_SPP", "文件类型: " + str2 + ", 文件大小: " + (g.this.U / 1024) + "KB");
                    u80.a.b().a(new a(str2));
                    g.this.S = 1;
                    g.this.V = 0;
                    g.this.T.clear();
                    g.this.f83492h = new byte[0];
                    g.this.Y.p();
                    j90.c.b("KSD_Manager_SPP", "sendReadySignal");
                    return;
                } catch (NumberFormatException e12) {
                    j90.c.b("KSD_Manager_SPP", "onPrepareReceived 非法 fileSize: " + split[1] + ", e=" + e12.getMessage());
                    g.this.Y.o();
                    return;
                }
            }
            j90.c.b("KSD_Manager_SPP", "onPrepareReceived 非法 prepareInfo: " + str);
            g.this.Y.o();
        }

        @Override // t80.i
        public void f() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "16")) {
                iSurgeon.surgeon$dispatch("16", new Object[]{this});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onFileEndReceived");
            if (g.this.R == null) {
                j90.c.b("KSD_Manager_SPP", "currentFile == null");
                g.this.Y.m();
                return;
            }
            if (!g.this.T.isEmpty()) {
                j90.c.b("KSD_Manager_SPP", "missingPackets.isNotEmpty()");
                g.this.Y.m();
            } else {
                if (g.this.U != g.this.V) {
                    g.this.Y.m();
                    j90.c.b("KSD_Manager_SPP", "fileSize:" + g.this.U + ",totalReceivedBytes:" + g.this.V);
                    return;
                }
                u80.a.b().a(new b((byte[]) g.this.f83492h.clone()));
            }
        }

        @Override // t80.i
        public void g(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "17")) {
                iSurgeon.surgeon$dispatch("17", new Object[]{this, str});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onVersionReceived:" + str);
        }

        @Override // t80.i
        public void h(byte[] bArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "15")) {
                iSurgeon.surgeon$dispatch("15", new Object[]{this, bArr});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onFileDataReceived:" + l90.a.a(bArr));
            if (g.this.R == null) {
                j90.c.b("KSD_Manager_SPP", "currentFile == null");
                return;
            }
            if (bArr.length < 4) {
                j90.c.b("KSD_Manager_SPP", "bytes.length < 4");
                g.this.Y.o();
                return;
            }
            int i12 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 6, bArr.length);
            g.this.V += copyOfRange.length;
            byte[] c02 = g.this.c0(copyOfRange);
            if (c02[0] == bArr[4] && c02[1] == bArr[5]) {
                if (i12 != g.this.S) {
                    j90.c.b("KSD_Manager_SPP", "数据包序号不匹配: 期望 #" + g.this.S + ", 实际 #" + i12);
                    for (int i13 = g.this.S; i13 < i12; i13++) {
                        g.this.T.add(Integer.valueOf(i13));
                    }
                    if (i12 > g.this.S) {
                        j90.c.b("KSD_Manager_SPP", "检测到丢失的数据包: " + g.this.T);
                        g.this.Y.o();
                        return;
                    }
                    return;
                }
                j90.c.b("KSD_Manager_SPP", "数据包序号匹配");
                g.this.S = i12 + 1;
                g.this.b0(copyOfRange);
                return;
            }
            j90.c.b("KSD_Manager_SPP", "数据包CRC校验失败");
            g.this.Y.o();
        }

        @Override // t80.i
        public void i() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "19")) {
                iSurgeon.surgeon$dispatch("19", new Object[]{this});
            } else {
                j90.c.b("KSD_Manager_SPP", "onStopSignalReceived");
            }
        }

        @Override // t80.i
        public void j() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "13")) {
                iSurgeon.surgeon$dispatch("13", new Object[]{this});
            } else {
                j90.c.b("KSD_Manager_SPP", "onReadyReceived");
            }
        }

        @Override // t80.i
        public void k() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this});
            } else {
                j90.c.b("KSD_Manager_SPP", "onScanFinished");
            }
        }

        @Override // t80.i
        public void l(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "14")) {
                iSurgeon.surgeon$dispatch("14", new Object[]{this, str});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onFileTypeReceived:" + str);
        }

        @Override // t80.i
        public void m() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "18")) {
                iSurgeon.surgeon$dispatch("18", new Object[]{this});
            } else {
                j90.c.b("KSD_Manager_SPP", "onStartSignalReceived");
            }
        }

        @Override // t80.i
        public void n() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this});
            } else {
                j90.c.b("KSD_Manager_SPP", "onScanStarted");
            }
        }

        @Override // t80.i
        public void o(BluetoothDevice bluetoothDevice) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "5")) {
                iSurgeon.surgeon$dispatch("5", new Object[]{this, bluetoothDevice});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onConnected device:" + bluetoothDevice.getAddress());
        }

        @Override // t80.i
        public void onDisconnected() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this});
            } else {
                j90.c.b("KSD_Manager_SPP", "onDisconnected");
            }
        }

        @Override // t80.i
        public void p(BluetoothDevice bluetoothDevice, int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, bluetoothDevice, Integer.valueOf(i12)});
                return;
            }
            j90.c.b("KSD_Manager_SPP", "onDeviceFound device:" + bluetoothDevice.getAddress());
            if (bluetoothDevice.getAddress() != null && g.this.Q.equals(bluetoothDevice.getAddress())) {
                g.this.Y.g(bluetoothDevice.getAddress());
            }
        }

        @Override // t80.i
        public void q() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
                iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this});
            } else {
                j90.c.b("KSD_Manager_SPP", "onAckReceived");
            }
        }

        @Override // t80.i
        public void r() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "11")) {
                iSurgeon.surgeon$dispatch("11", new Object[]{this});
            } else {
                j90.c.b("KSD_Manager_SPP", "onNakReceived");
            }
        }
    }

    /* renamed from: q80.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC1651g implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        RunnableC1651g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                g.this.J0();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class h implements i80.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        h() {
        }

        @Override // i80.h
        public void onSuccess(List<KnightSmartDeviceInfoBean> list) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, list});
                return;
            }
            try {
                j90.c.b("KSD_Manager", "onSuccess->knightSmartDeviceInfoBeanList:" + list);
                if (g.this.f83491g != null) {
                    ArrayList arrayList = new ArrayList();
                    for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean : list) {
                        if (knightSmartDeviceInfoBean != null) {
                            if (w70.a.l().v(knightSmartDeviceInfoBean.getMacAddress())) {
                                knightSmartDeviceInfoBean.setConnected(true);
                            } else if (g.this.f83488d != null && !g.this.f83488d.contains(knightSmartDeviceInfoBean.getMacAddress())) {
                                me.ele.aiot.sensor.internal.a aVar = g.this.f83485b0;
                                long v12 = rf1.c.v();
                                String deviceCode = knightSmartDeviceInfoBean.getDeviceCode();
                                BleDeviceEventEnum bleDeviceEventEnum = BleDeviceEventEnum.BLE_DISCONNECT_EVENT;
                                aVar.onUpgradeEvent(v12, deviceCode, bleDeviceEventEnum.getEventType(), bleDeviceEventEnum.getEventValue(), 1L);
                                g.this.f83488d.add(knightSmartDeviceInfoBean.getMacAddress());
                            }
                            arrayList.add(knightSmartDeviceInfoBean);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        g.this.f83491g.b(arrayList);
                    }
                }
                g.this.k0(list);
            } catch (Throwable th2) {
                j90.c.b("KSD_Manager", "QueryBindingDeviceInfoTask onSuccess:" + th2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class i implements d.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ KnightSmartDeviceInfoBean f83525a;

        i(KnightSmartDeviceInfoBean knightSmartDeviceInfoBean) {
            this.f83525a = knightSmartDeviceInfoBean;
        }

        @Override // l80.d.h
        public void a(i0 i0Var) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, i0Var});
                return;
            }
            try {
                String string = i0Var.m().string();
                j90.c.b("kSD_HTTP", "queryIotDeviceConfig message:" + string);
                HashMap hashMap = new HashMap();
                hashMap.put("message", string);
                k90.b.a("query_config_success", hashMap);
                if (i0Var.b0()) {
                    QueryIotDeviceConfig queryIotDeviceConfig = (QueryIotDeviceConfig) g.this.N.j(string, QueryIotDeviceConfig.class);
                    if (queryIotDeviceConfig != null && queryIotDeviceConfig.getCode() == 200 && queryIotDeviceConfig.getResult() != null && queryIotDeviceConfig.getResult().getCode() == 200) {
                        QueryIotDeviceConfig.IotDeviceConfigResult.ContentIOTSecret content = queryIotDeviceConfig.getResult().getContent();
                        String t12 = new Gson().t(content);
                        j90.c.b("kSD_HTTP", "contentIOTSecretJson:" + t12);
                        String c12 = g.this.f83490f.c(g.this.f83482a, this.f83525a.getDeviceCode());
                        j90.c.b("kSD_CACHE", "cacheIOTSecretInfo:" + c12);
                        if (!c12.equals(t12)) {
                            j90.c.b("kSD_CACHE", "配置缓存需要更新:" + t12);
                            g.this.f83490f.i(g.this.f83482a, this.f83525a.getDeviceCode(), t12);
                        }
                        g.this.g1(content, this.f83525a);
                        return;
                    }
                    return;
                }
                g.this.h1(this.f83525a);
                j90.c.b("kSD_HTTP", "queryIotDeviceConfig onError: message" + string);
            } catch (Throwable th2) {
                j90.c.b("kSD_HTTP", "queryIotDeviceConfig throwable:" + th2.getMessage());
            }
        }

        @Override // l80.d.h
        public void onError(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
                return;
            }
            j90.c.b("kSD_HTTP", "queryIotDeviceConfig onError:" + str);
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            k90.b.a("query_config_fail", hashMap);
            g.this.h1(this.f83525a);
        }
    }

    /* loaded from: classes4.dex */
    public class j implements de0.d<s80.a> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        j() {
        }

        @Override // de0.d
        public void a(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
            }
        }

        @Override // de0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BluetoothDevice bluetoothDevice, s80.a aVar, int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, bluetoothDevice, aVar, Integer.valueOf(i12)});
                return;
            }
            if (aVar != null && !TextUtils.isEmpty(aVar.b())) {
                try {
                    j90.c.b("kSD_BLUETOOTH_SCAN", "BlueScan address: " + bluetoothDevice.getAddress());
                    g.this.M0(bluetoothDevice, aVar, i12);
                } catch (Throwable th2) {
                    j90.c.b("kSD_THROWABLE", "onScanDevice throwable:" + th2);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class k implements d.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f83528a;

        k(String str) {
            this.f83528a = str;
        }

        @Override // l80.d.h
        public void a(i0 i0Var) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, i0Var});
                return;
            }
            j90.c.b("kSD_HTTP", "reportBraceletData onSuccess deviceCode:" + this.f83528a);
        }

        @Override // l80.d.h
        public void onError(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
                return;
            }
            j90.c.b("kSD_HTTP", "reportBraceletData onError:" + str);
        }
    }

    /* loaded from: classes4.dex */
    public class l extends x70.b {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothDevice f83530a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ me.ele.aiot.sensor.internal.c f83531b;

        l(BluetoothDevice bluetoothDevice, me.ele.aiot.sensor.internal.c cVar) {
            this.f83530a = bluetoothDevice;
            this.f83531b = cVar;
        }

        @Override // x70.b
        public void a(BleDevice bleDevice, BleException bleException) {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bleDevice, bleException});
                return;
            }
            try {
                g.this.f83503s = false;
                j90.c.b("kSD_BLUETOOTH_CONNECT", "onConnectFail:" + bleDevice.getMac() + ",e=" + bleException.toString());
                HashMap hashMap = new HashMap();
                hashMap.put(PhoneInfo.MACADDRESS, this.f83530a.getAddress());
                hashMap.put("device_code", g.this.B.get(this.f83530a.getAddress()));
                hashMap.put("error_code", Integer.valueOf(bleException.getCode()));
                k90.b.a("bluetooth_connect_fail", hashMap);
                if (this.f83531b.m0().length() >= 3) {
                    str = this.f83531b.m0().substring(0, 3);
                } else {
                    str = "";
                }
                k90.b.b("bluetooth_connect_success_rate", 0L, str);
                this.f83531b.R0(false);
                if (this.f83531b.v0()) {
                    this.f83531b.a0();
                }
                g.this.T0();
                g.this.I0(this.f83531b, bleDevice, false);
            } catch (Throwable th2) {
                j90.c.b("kSD_THROWABLE", "onConnectFail throwable:" + th2);
            }
        }

        @Override // x70.b
        public void b(BleDevice bleDevice, BluetoothGatt bluetoothGatt, int i12) {
            String str;
            BleDeviceTypeEnum u02;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, bleDevice, bluetoothGatt, Integer.valueOf(i12)});
                return;
            }
            try {
                g.this.Q = g.j0(bleDevice.getMac());
                j90.c.b("KSD_Manager_SPP", "mSppMacAddress:" + g.this.Q);
                g.this.f83503s = true;
                j90.c.b("kSD_BLUETOOTH_CONNECT", "onConnectSuccess:" + bleDevice.getMac());
                HashMap hashMap = new HashMap();
                hashMap.put(PhoneInfo.MACADDRESS, this.f83530a.getAddress());
                hashMap.put("device_code", g.this.B.get(this.f83530a.getAddress()));
                k90.b.a("bluetooth_connect_success", hashMap);
                if (this.f83531b.m0().length() >= 3) {
                    str = this.f83531b.m0().substring(0, 3);
                } else {
                    str = "";
                }
                k90.b.b("bluetooth_connect_success_rate", 1L, str);
                for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean : g.this.f83510z) {
                    if (TextUtils.equals(knightSmartDeviceInfoBean.getMacAddress(), bleDevice.getMac())) {
                        knightSmartDeviceInfoBean.setConnected(true);
                        this.f83531b.R0(false);
                        this.f83531b.K0(bleDevice);
                        this.f83531b.L0(bluetoothGatt);
                        this.f83531b.I0(256);
                        if (g.this.f83485b0 != null) {
                            j90.c.c("getBluetoothEvent bluetoothEvent ==1");
                            g.this.f83485b0.onUpgradeEvent(rf1.c.v(), this.f83531b.m0(), "bluetoothEvent", "1", 1L);
                        }
                        if (g.this.f83491g != null) {
                            g.this.f83491g.b(g.this.f83510z);
                        }
                        if (g.this.J != null && (u02 = g.this.u0(knightSmartDeviceInfoBean.getDeviceCode())) != null && u02 != BleDeviceTypeEnum.UNKNOWN) {
                            j90.c.b("KSD_Manager", "onConnectSuccess->onStatusCallback:" + u02);
                            g.this.J.a(u02, BleDeviceStatusEnum.CONNECTED);
                        }
                        g.this.d1(knightSmartDeviceInfoBean.getMacAddress(), BleDeviceStatusEnum.CONNECTED.getStatusCode());
                    }
                }
                if (l90.d.b("me.ele.hb_ksd", "shan_talk", true) && !TextUtils.isEmpty(g.this.f83500p) && g.this.f83500p.startsWith("X3L1802")) {
                    if (g.this.Y != null) {
                        j90.c.b("KSD_Manager_SPP", "startScan");
                        g.this.Y.s();
                    } else {
                        j90.c.b("KSD_Manager_SPP", "startScan skipped, sppManager is null");
                    }
                }
            } catch (Throwable th2) {
                j90.c.b("kSD_THROWABLE", "onConnectSuccess throwable:" + th2);
            }
        }

        @Override // x70.b
        public void c(boolean z12, BleDevice bleDevice, BluetoothGatt bluetoothGatt, int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Boolean.valueOf(z12), bleDevice, bluetoothGatt, Integer.valueOf(i12)});
                return;
            }
            g.this.f83503s = false;
            j90.c.b("kSD_BLUETOOTH_CONNECT", "onDisConnected:" + bleDevice.getMac() + ",isActiveDisConnected =" + z12);
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, this.f83530a.getAddress());
            hashMap.put("device_code", g.this.B.get(this.f83530a.getAddress()));
            hashMap.put("is_active", Boolean.valueOf(z12));
            hashMap.put("status", Integer.valueOf(i12));
            k90.b.a("bluetooth_disconnect", hashMap);
            g.this.T0();
            g.this.I0(this.f83531b, bleDevice, true);
        }

        @Override // x70.b
        public void d() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            j90.c.b("kSD_BLUETOOTH_CONNECT", "onStartConnect:" + this.f83530a.getAddress());
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, this.f83530a.getAddress());
            hashMap.put("device_code", g.this.B.get(this.f83530a.getAddress()));
            k90.b.a("bluetooth_connect_start", hashMap);
        }
    }

    /* loaded from: classes4.dex */
    public class m implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* loaded from: classes4.dex */
        public class a implements d.h {
            private static transient /* synthetic */ ISurgeon $surgeonFlag;

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f83534a;

            a(List list) {
                this.f83534a = list;
            }

            @Override // l80.d.h
            public void a(i0 i0Var) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    iSurgeon.surgeon$dispatch("1", new Object[]{this, i0Var});
                }
            }

            @Override // l80.d.h
            public void onError(String str) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "2")) {
                    iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
                    return;
                }
                synchronized (g.this.O) {
                    g.this.O.addAll(this.f83534a);
                }
            }
        }

        private m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            try {
                synchronized (g.this.O) {
                    if (g.this.O.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(g.this.O);
                    g.this.O.clear();
                    g.this.P.setVersion(1);
                    g.this.P.setHeartBeatModelList(arrayList);
                    l80.d.g().m(g.this.P, new a(arrayList));
                }
            } catch (Throwable th2) {
                j90.c.b("kSD_THROWABLE", "ReportDataCollectionTask:" + th2);
            }
        }

        /* synthetic */ m(g gVar, d dVar) {
            this();
        }
    }

    static {
        a0();
        f83478e0 = new s80.b();
        f83479f0 = -1L;
        f83480g0 = -1;
    }

    private g(Application application) {
        this.f83484b = application;
        this.f83482a = application.getApplicationContext();
    }

    private static void A0(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{Long.valueOf(j12)});
        } else {
            w70.a.l().t(new a.C2051a().e(new UUID[]{v80.e.a(LibConstant.f61981b).getUuid()}).c(false).d(j12).b());
        }
    }

    private void B0(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, context});
        } else {
            this.Y = new t80.f(context, new f(context));
        }
    }

    private void D0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this});
        } else if (this.H == null) {
            WrapScheduledThreadPoolExecutor wrapScheduledThreadPoolExecutor = new WrapScheduledThreadPoolExecutor(1, "KnightSmartDeviceManager", "unknown");
            this.H = wrapScheduledThreadPoolExecutor;
            wrapScheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            this.I.add(this.H.scheduleWithFixedDelay(new Runnable() { // from class: q80.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.lambda$initMockDataTaskExecutor$2();
                }
            }, 30L, 1L, TimeUnit.SECONDS));
        }
    }

    private synchronized void E0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this});
            return;
        }
        if (this.D == null) {
            WrapScheduledThreadPoolExecutor wrapScheduledThreadPoolExecutor = new WrapScheduledThreadPoolExecutor(1, "KnightSmartDeviceManager", "unknown");
            this.D = wrapScheduledThreadPoolExecutor;
            wrapScheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            this.E.add(this.D.scheduleWithFixedDelay(new m(this, null), 0L, 5000L, TimeUnit.MILLISECONDS));
        }
    }

    private void F0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this});
        } else if (this.F == null) {
            WrapScheduledThreadPoolExecutor wrapScheduledThreadPoolExecutor = new WrapScheduledThreadPoolExecutor(1, "KnightSmartDeviceManager", "unknown");
            this.F = wrapScheduledThreadPoolExecutor;
            wrapScheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            this.G.add(this.F.scheduleWithFixedDelay(new u80.c(this.f83482a, this.f83494j, this.f83501q), 0L, 60L, TimeUnit.SECONDS));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(me.ele.aiot.sensor.internal.c cVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "43")) {
            iSurgeon.surgeon$dispatch("43", new Object[]{this, cVar});
            return;
        }
        try {
            for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean : this.f83510z) {
                j90.c.b("kSD_UI_SHOW", "boundKnightSmartDeviceInfoBeanList :" + this.f83510z + ",bleCommunicationImpl.getMacAddress():" + cVar.p0());
                if (TextUtils.equals(knightSmartDeviceInfoBean.getMacAddress(), cVar.p0())) {
                    j90.c.b("kSD_UI_SHOW", "Battery :" + cVar.f0() + "isWearComplete:  " + knightSmartDeviceInfoBean.isWearComplete());
                    if (!knightSmartDeviceInfoBean.isConnected()) {
                        knightSmartDeviceInfoBean.setConnected(true);
                        knightSmartDeviceInfoBean.setWearComplete(cVar.z0());
                        knightSmartDeviceInfoBean.setPowerBattery(cVar.f0());
                        i80.g gVar = this.f83491g;
                        if (gVar != null) {
                            gVar.b(this.f83510z);
                        }
                    } else if (knightSmartDeviceInfoBean.getPowerBattery() != cVar.f0() || knightSmartDeviceInfoBean.isWearComplete() != cVar.z0()) {
                        knightSmartDeviceInfoBean.setWearComplete(cVar.z0());
                        knightSmartDeviceInfoBean.setPowerBattery(cVar.f0());
                        i80.g gVar2 = this.f83491g;
                        if (gVar2 != null) {
                            gVar2.b(this.f83510z);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "notifyCallbackWhenConnected throwable:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, s80.a> entry : this.C.entrySet()) {
            if (entry != null && entry.getValue() != null && entry.getValue().a() != null && !v80.d.a(entry.getValue().a().getAddress())) {
                DiscoveredBleDeviceBean discoveredBleDeviceBean = new DiscoveredBleDeviceBean(entry.getValue().a().getAddress(), entry.getValue().e());
                if (!arrayList.contains(discoveredBleDeviceBean)) {
                    arrayList.add(discoveredBleDeviceBean);
                }
            }
        }
        i80.g gVar = this.f83491g;
        if (gVar != null) {
            gVar.a(arrayList);
        }
    }

    private void L0(KnightSmartDeviceInfoBean knightSmartDeviceInfoBean) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "30")) {
            iSurgeon.surgeon$dispatch("30", new Object[]{this, knightSmartDeviceInfoBean});
        } else {
            l80.d.g().k(new i(knightSmartDeviceInfoBean), knightSmartDeviceInfoBean.getDeviceCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(BluetoothDevice bluetoothDevice, s80.a aVar, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "35")) {
            iSurgeon.surgeon$dispatch("35", new Object[]{this, bluetoothDevice, aVar, Integer.valueOf(i12)});
            return;
        }
        f0(bluetoothDevice, aVar);
        if (aVar != null && bluetoothDevice != null) {
            Long l12 = this.f83507w.get(bluetoothDevice.getAddress());
            if (l12 != null && aVar.f() - l12.longValue() < 2000) {
                return;
            }
            this.f83507w.put(bluetoothDevice.getAddress(), Long.valueOf(aVar.f()));
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, bluetoothDevice.getAddress());
            hashMap.put("device_code", aVar.b());
            k90.b.a("bluetooth_scan", hashMap);
            aVar.g(bluetoothDevice);
            aVar.h(i12);
            c1(aVar);
            g0(bluetoothDevice);
        }
    }

    private static void N0(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{context});
        } else {
            z.a.b(context).c(new d(), new IntentFilter("hb_mist_order_make_phone_call_notification"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this});
            return;
        }
        try {
            t80.f fVar = this.Y;
            if (fVar != null) {
                fVar.h();
            }
        } catch (Throwable th2) {
            j90.c.b("KSD_Manager_SPP", "resetSppState disconnect throwable:" + th2);
        }
        this.Q = "";
    }

    private void X0(List<ScheduledFuture<?>> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, list});
        } else if (!list.isEmpty()) {
            Iterator<ScheduledFuture<?>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
        }
    }

    private void Y0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this});
            return;
        }
        try {
            d0(this.I);
            ScheduledExecutorService scheduledExecutorService = this.H;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.H = null;
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "stopDataTaskExecutor throwable:" + th2);
        }
    }

    private void Z0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this});
            return;
        }
        try {
            w70.a.l().e();
            w70.a.l().c();
            d0(this.E);
            ScheduledExecutorService scheduledExecutorService = this.D;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.D = null;
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "stopTimingTaskExecutor ex:" + th2.getMessage());
        }
    }

    private static /* synthetic */ void a0() {
        jl1.c cVar = new jl1.c("KnightSmartDeviceManager.java", g.class);
        f83481h0 = cVar.i("method-call", cVar.h("1", "registerReceiver", "android.app.Application", "android.content.BroadcastReceiver:android.content.IntentFilter", "receiver:filter", "", "android.content.Intent"), 341);
    }

    private void a1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            iSurgeon.surgeon$dispatch("17", new Object[]{this});
            return;
        }
        try {
            d0(this.G);
            ScheduledExecutorService scheduledExecutorService = this.F;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.F = null;
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "stopTrackAudioInfoTaskExecutor throwable:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "62")) {
            iSurgeon.surgeon$dispatch("62", new Object[]{this, bArr});
            return;
        }
        if (bArr != null && bArr.length != 0) {
            byte[] bArr2 = this.f83492h;
            byte[] bArr3 = new byte[bArr2.length + bArr.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f83492h.length, bArr.length);
            this.f83492h = bArr3;
        }
    }

    private void b1(File file) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "64")) {
            iSurgeon.surgeon$dispatch("64", new Object[]{this, file});
            return;
        }
        try {
            String str = this.W;
            if (str == null || str.isEmpty()) {
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    str = name.substring(lastIndexOf + 1);
                } else {
                    str = "wav";
                }
            }
            j90.c.b("KSD_Manager_SPP", "提交音频转写: file=" + file.getAbsolutePath() + ", knightId=" + this.f83494j + ", fileType=" + str + ", fileSize=" + file.length());
            long j12 = f83479f0;
            int i12 = f83480g0;
            f83479f0 = -1L;
            f83480g0 = -1;
            l80.a.l(file, this.f83494j, "NLS_STREAM", "bFR", j12, i12, new c());
        } catch (Exception e12) {
            j90.c.b("KSD_Manager_SPP", "提交音频转写异常: " + e12.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] c0(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "61")) {
            return (byte[]) iSurgeon.surgeon$dispatch("61", new Object[]{this, bArr});
        }
        int i12 = 65535;
        for (byte b12 : bArr) {
            i12 ^= b12 & 255;
            for (int i13 = 0; i13 < 8; i13++) {
                i12 = (i12 & 1) != 0 ? (i12 >> 1) ^ 40961 : i12 >> 1;
            }
        }
        return new byte[]{(byte) (i12 & 255), (byte) ((i12 >> 8) & 255)};
    }

    private void c1(s80.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "37")) {
            iSurgeon.surgeon$dispatch("37", new Object[]{this, aVar});
            return;
        }
        Iterator<Map.Entry<String, s80.a>> it = this.C.entrySet().iterator();
        long v12 = rf1.c.v();
        while (it.hasNext()) {
            s80.a value = it.next().getValue();
            if (value != null && v12 - value.f() > LocationConstants.NEED_GET_NET_LOCATION_TIME) {
                it.remove();
            }
        }
        if (aVar != null) {
            this.C.put(aVar.a().getAddress(), aVar);
        }
    }

    private void d0(List<ScheduledFuture<?>> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "19")) {
            iSurgeon.surgeon$dispatch("19", new Object[]{this, list});
            return;
        }
        try {
            X0(list);
            list.clear();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(String str, String str2) {
        BoundBleDeviceInfo boundBleDeviceInfo;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "29")) {
            iSurgeon.surgeon$dispatch("29", new Object[]{this, str, str2});
            return;
        }
        try {
            j90.c.b("KSD_Manager", "updateBoundDeviceState macAddress:" + str + ",statusCode:" + str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("update 前mBoundBleDeviceInfoMap:");
            sb2.append(this.L);
            j90.c.b("KSD_Manager", sb2.toString());
            if (!v80.d.a(str) && !v80.d.a(str2) && (boundBleDeviceInfo = this.L.get(str)) != null) {
                boundBleDeviceInfo.setStatusCode(str2);
            }
            j90.c.b("KSD_Manager", "update 后mBoundBleDeviceInfoMap:" + this.L);
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "updateBoundDeviceState throwable:" + th2);
        }
    }

    private void e1(List<KnightSmartDeviceInfoBean> list) {
        ProductKeyEnum from;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "28")) {
            iSurgeon.surgeon$dispatch("28", new Object[]{this, list});
            return;
        }
        try {
            this.L.clear();
            for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean : list) {
                String macAddress = knightSmartDeviceInfoBean.getMacAddress();
                if (!v80.d.a(macAddress)) {
                    String productTypeKey = knightSmartDeviceInfoBean.getProductTypeKey();
                    int typeCode = BleDeviceTypeEnum.UNKNOWN.getTypeCode();
                    String statusCode = BleDeviceStatusEnum.NOT_CONNECTED.getStatusCode();
                    if (!v80.d.a(productTypeKey) && (from = ProductKeyEnum.from(productTypeKey)) != null) {
                        typeCode = from.getProductTypeCode();
                    }
                    me.ele.aiot.sensor.internal.c b12 = v80.b.b(this.f83493i, macAddress);
                    if (b12 != null && b12.v0()) {
                        statusCode = BleDeviceStatusEnum.CONNECTED.getStatusCode();
                    }
                    this.L.put(macAddress, new BoundBleDeviceInfo(macAddress, typeCode, statusCode));
                }
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "updateBoundDeviceState throwable:" + th2);
        }
    }

    private void f0(BluetoothDevice bluetoothDevice, s80.a aVar) {
        int i12;
        int i13;
        ISurgeon iSurgeon = $surgeonFlag;
        int i14 = 0;
        if (InstrumentAPI.support(iSurgeon, "36")) {
            iSurgeon.surgeon$dispatch("36", new Object[]{this, bluetoothDevice, aVar});
            return;
        }
        if (aVar != null && bluetoothDevice != null) {
            try {
                Long l12 = this.f83508x.get(bluetoothDevice.getAddress());
                if (l12 != null && aVar.f() - l12.longValue() < 1000) {
                    return;
                }
                this.f83508x.put(bluetoothDevice.getAddress(), Long.valueOf(aVar.f()));
                byte[] d12 = aVar.d();
                if (this.f83505u && d12 != null) {
                    String b12 = aVar.b();
                    if (!TextUtils.isEmpty(b12) && b12.startsWith("BJS")) {
                        long a12 = l90.d.a("me.ele.hb_ksd", "bjs_callback_interval_ms", 3000L);
                        j90.c.b("BeaconArrive", "callbackIntervalMs:" + a12);
                        q80.a.b().c(b12, a12);
                    }
                }
                int c12 = aVar.c();
                if (c12 == 2 && d12 != null) {
                    String b13 = aVar.b();
                    if (!TextUtils.isEmpty(this.f83500p) && this.f83500p.equals(b13)) {
                        this.f83502r = rf1.c.v();
                    }
                    byte b14 = d12[13];
                    float d13 = ((float) l90.a.d(d12, 14)) / 1000.0f;
                    byte b15 = d12[18];
                    if (((b15 & 32) >> 5) == 1) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    if (((b15 & 64) >> 6) == 1) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    if (((b15 & 128) >> 7) == 1) {
                        i14 = 1;
                    }
                    HeartBeatModel heartBeatModel = new HeartBeatModel();
                    heartBeatModel.setFrequency(1);
                    heartBeatModel.setCollectTime(aVar.f());
                    heartBeatModel.setWearingPosture(i12);
                    heartBeatModel.setInfraredDetectionState(i13);
                    heartBeatModel.setWearStatus(i14);
                    heartBeatModel.setBattery(b14);
                    heartBeatModel.setDeviceCode(b13);
                    heartBeatModel.setBleBroadcast(true);
                    heartBeatModel.setCityId(this.f83496l);
                    heartBeatModel.setPlatform("Android");
                    heartBeatModel.setPressure(d13);
                    n0(heartBeatModel);
                    j90.c.b("kSD_OTA_BLUETOOTH_BROADCAST", "deviceCode:" + b13 + ",battery:" + ((int) b14) + ",pressure:" + d13 + ",wearingPosture:" + i12 + ",infraredDetectionState:" + i13 + ",wearStatus:" + i14);
                    return;
                }
                if (this.f83504t && c12 == 10 && d12 != null) {
                    String b16 = aVar.b();
                    long v12 = rf1.c.v();
                    Long l13 = this.f83509y.get(b16);
                    if (l13 == null || v12 - l13.longValue() >= 300000) {
                        j90.c.b("kSD_OTA_BLUETOOTH_BROADCAST", "flagBit == 10 recordBytes:" + l90.a.a(d12));
                        this.f83509y.put(b16, Long.valueOf(v12));
                        l80.d.g().l(this.f83494j, b16, l90.a.a(d12), new k(b16));
                    }
                }
            } catch (Throwable th2) {
                j90.c.b("kSD_THROWABLE", "compensateDataByBroadcastPackage2 throwable:" + th2);
            }
        }
    }

    private synchronized void g0(BluetoothDevice bluetoothDevice) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "38")) {
            iSurgeon.surgeon$dispatch("38", new Object[]{this, bluetoothDevice});
            return;
        }
        try {
            if (i0(this.A, bluetoothDevice.getAddress())) {
                j90.c.b("kSD_BLUETOOTH_CONNECT", "bindingBleDeviceMacAddressList =" + this.A + ",bluetoothDevice =" + bluetoothDevice.getAddress());
                h0(bluetoothDevice);
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "connectBindDeviceByBluetoothDevice throwable:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(QueryIotDeviceConfig.IotDeviceConfigResult.ContentIOTSecret contentIOTSecret, KnightSmartDeviceInfoBean knightSmartDeviceInfoBean) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "32")) {
            iSurgeon.surgeon$dispatch("32", new Object[]{this, contentIOTSecret, knightSmartDeviceInfoBean});
            return;
        }
        if (contentIOTSecret != null && knightSmartDeviceInfoBean != null && !this.f83493i.containsKey(knightSmartDeviceInfoBean.getMacAddress())) {
            me.ele.aiot.sensor.internal.c cVar = new me.ele.aiot.sensor.internal.c(knightSmartDeviceInfoBean.getDeviceCode(), knightSmartDeviceInfoBean.getMacAddress(), contentIOTSecret.getSecret(), contentIOTSecret.getSelfDeveloped(), contentIOTSecret.getProductSeriesType());
            cVar.V0(contentIOTSecret.getModelTypes());
            cVar.b1(contentIOTSecret.getThingModelProductKey());
            cVar.Z0(knightSmartDeviceInfoBean.getProductKey());
            cVar.a1(knightSmartDeviceInfoBean.getProductTypeKey());
            cVar.S0(this.f83485b0);
            cVar.Q0(this.f83496l);
            this.f83493i.put(knightSmartDeviceInfoBean.getMacAddress(), cVar);
        }
    }

    private void h0(BluetoothDevice bluetoothDevice) {
        me.ele.aiot.sensor.internal.c cVar;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "40")) {
            iSurgeon.surgeon$dispatch("40", new Object[]{this, bluetoothDevice});
            return;
        }
        if (bluetoothDevice != null && this.f83493i.containsKey(bluetoothDevice.getAddress()) && (cVar = this.f83493i.get(bluetoothDevice.getAddress())) != null && !cVar.w0() && !cVar.v0()) {
            cVar.R0(true);
            w70.a.l().a(bluetoothDevice.getAddress(), new l(bluetoothDevice, cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(KnightSmartDeviceInfoBean knightSmartDeviceInfoBean) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "31")) {
            iSurgeon.surgeon$dispatch("31", new Object[]{this, knightSmartDeviceInfoBean});
            return;
        }
        try {
            j90.c.b("kSD_CACHE", "使用设备Secret的缓存");
            QueryIotDeviceConfig.IotDeviceConfigResult.ContentIOTSecret contentIOTSecret = (QueryIotDeviceConfig.IotDeviceConfigResult.ContentIOTSecret) this.N.j(this.f83490f.c(this.f83482a, knightSmartDeviceInfoBean.getDeviceCode()), QueryIotDeviceConfig.IotDeviceConfigResult.ContentIOTSecret.class);
            j90.c.b("kSD_CACHE", "设备Secret的缓存:" + contentIOTSecret);
            if (contentIOTSecret != null) {
                g1(contentIOTSecret, knightSmartDeviceInfoBean);
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "useIOTSecretCacheInfo throwable:" + th2);
        }
    }

    public static boolean i0(List<String> list, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "39")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("39", new Object[]{list, str})).booleanValue();
        }
        if (str != null && !str.isEmpty()) {
            for (String str2 : list) {
                if (str2 != null && str2.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String j0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "60")) {
            return (String) iSurgeon.surgeon$dispatch("60", new Object[]{str});
        }
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(":");
            if (split.length != 6) {
                return "";
            }
            split[0] = "F" + split[0].substring(1);
            split[3] = "A" + split[3].substring(1);
            return android.taobao.windvane.extra.storage.a.a(":", split);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(List<KnightSmartDeviceInfoBean> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "25")) {
            iSurgeon.surgeon$dispatch("25", new Object[]{this, list});
            return;
        }
        this.f83510z = list;
        if (list != null && !list.isEmpty()) {
            j90.c.b("KSD_Manager", "dealWithBindingCase");
            l0(list);
        } else {
            j90.c.b("KSD_Manager", "dealWithNoBindingCase");
            p0();
        }
    }

    private void l0(List<KnightSmartDeviceInfoBean> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "27")) {
            iSurgeon.surgeon$dispatch("27", new Object[]{this, list});
            return;
        }
        try {
            i80.e eVar = this.X;
            if (eVar != null) {
                eVar.onBindResultCallback(BleDeviceTypeEnum.ERJI.getTypeCode());
            }
            this.B.clear();
            ArrayList<String> arrayList = new ArrayList();
            for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean : list) {
                this.f83498n = knightSmartDeviceInfoBean.getDeviceCode();
                this.f83499o = knightSmartDeviceInfoBean.getMacAddress();
                this.B.put(knightSmartDeviceInfoBean.getMacAddress(), knightSmartDeviceInfoBean.getDeviceCode());
                arrayList.add(knightSmartDeviceInfoBean.getMacAddress());
            }
            ArrayList<String> arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!this.A.contains(str)) {
                    arrayList2.add(str);
                }
            }
            ArrayList<String> arrayList3 = new ArrayList();
            for (String str2 : this.A) {
                if (!arrayList.contains(str2)) {
                    arrayList3.add(str2);
                }
            }
            if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
                j90.c.b("KSD_Manager", "骑手绑定智能设备未发生变化");
                return;
            }
            j90.c.b("KSD_Manager", "骑手绑定智能设备发生变化,increasedBoundMacAddressList:" + arrayList2 + ",reducedBoundMacAddressList:" + arrayList3);
            e1(list);
            this.A = arrayList;
            for (String str3 : arrayList2) {
                for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean2 : list) {
                    if (str3.equals(knightSmartDeviceInfoBean2.getMacAddress())) {
                        L0(knightSmartDeviceInfoBean2);
                    }
                }
            }
            for (String str4 : arrayList3) {
                Map<String, me.ele.aiot.sensor.internal.c> map = this.f83493i;
                if (map != null && map.containsKey(str4)) {
                    me.ele.aiot.sensor.internal.c cVar = this.f83493i.get(str4);
                    if (cVar != null) {
                        cVar.a0();
                    }
                    v80.b.a(this.f83493i, str4);
                }
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "dealWithBindingCase throwable:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCachedBoundInfo$1() {
        try {
            String a12 = this.f83490f.a(this.f83482a);
            j90.c.b("kSD_CACHE", "getBoundDeviceInfo:" + a12);
            List list = (List) new Gson().k(a12, new e().getType());
            j90.c.b("kSD_CACHE", "list:" + list);
            if (list != null && list.size() == 1) {
                this.f83500p = ((KnightSmartDeviceInfoBean) list.get(0)).getDeviceCode();
                this.f83501q = ((KnightSmartDeviceInfoBean) list.get(0)).getMacAddress();
                j90.c.b("kSD_CACHE", "mCachedDeviceCode:" + this.f83500p + ",mCachedMacAddress:" + this.f83501q);
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "getCachedBoundInfo:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initKnightSmartDevice$0() {
        if (!this.f83486c) {
            try {
                this.f83486c = true;
                j80.a d12 = j80.a.d();
                this.f83490f = d12;
                String e12 = d12.e(this.f83482a);
                this.f83494j = e12;
                this.f83496l = this.f83490f.b(this.f83482a);
                String f12 = this.f83490f.f(this.f83482a);
                v0();
                if (!v80.d.a(e12) && !v80.d.a(f12)) {
                    l80.d.g().p(f12);
                    K0();
                }
                if (i80.j.f54968c) {
                    de0.i<s80.a> iVar = f83478e0;
                    de0.a.a(iVar);
                    de0.a.d(iVar, this.f83483a0);
                    k90.b.a("bluetooth_scan_start", null);
                    HashMap hashMap = new HashMap();
                    hashMap.put("is_scan_ble", Boolean.TRUE);
                    k90.b.a("bluetooth_scan_update", hashMap);
                }
                if (l90.d.b("me.ele.hb_ksd", "get_bonded_headset_enable", true)) {
                    this.f83497m = v80.c.a(this.f83494j);
                }
                if (this.f83484b != null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                    Application application = this.f83484b;
                    BroadcastReceiver broadcastReceiver = this.f83487c0;
                }
                E0();
                F0();
                D0();
                if (l90.d.b("me.ele.hb_ksd", "shan_talk", true) && !TextUtils.isEmpty(this.f83500p) && this.f83500p.startsWith("X3L1802")) {
                    k90.a.a().b("shan_talk", null, null, "knight_smart_device");
                    B0(this.f83482a);
                }
                this.f83504t = l90.d.b("me.ele.hb_ksd", "enable_ssw", true);
                this.f83505u = l90.d.b("me.ele.hb_ksd", "beacon_arrive_enable", false);
                j90.c.b("kSD_ORANGE", "mIsBeaconArriveEnable:" + this.f83505u);
            } catch (Throwable th2) {
                j90.c.b("kSD_THROWABLE", "reportBondedBluetoothDevices:" + th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMockDataTaskExecutor$2() {
        j90.c.b("kSD_CACHE", "initMockDataTaskExecutor isBoundDeviceAudioInUse:" + v80.a.f89007a + ",mIsDeviceConnected:" + this.f83503s + ",timeDiff:" + (rf1.c.v() - this.f83502r));
        if (v80.a.f89007a && !this.f83503s && rf1.c.v() - this.f83502r > 5000) {
            HeartBeatModel heartBeatModel = new HeartBeatModel();
            heartBeatModel.setFrequency(1);
            heartBeatModel.setCollectTime(rf1.c.v());
            heartBeatModel.setWearingPosture(1);
            heartBeatModel.setInfraredDetectionState(1);
            heartBeatModel.setWearStatus(1);
            heartBeatModel.setBattery(0);
            heartBeatModel.setDeviceCode(this.f83500p);
            heartBeatModel.setBleBroadcast(true);
            heartBeatModel.setCityId(this.f83496l);
            heartBeatModel.setPlatform("Android");
            heartBeatModel.setPressure(0.0f);
            n0(heartBeatModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveInfoOpr$3(String str, String str2) {
        j80.a aVar = this.f83490f;
        if (aVar != null) {
            if (TextUtils.equals(aVar.e(this.f83482a), str) && TextUtils.equals(this.f83490f.f(this.f83482a), str2)) {
                return;
            }
            this.f83490f.j(this.f83482a, str);
            this.f83490f.k(this.f83482a, str2);
        }
        l80.d.g().p(str2);
        o0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void lambda$dealWithHeartbeatInWorkThread$4(HeartBeatModel heartBeatModel) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "42")) {
            iSurgeon.surgeon$dispatch("42", new Object[]{this, heartBeatModel});
            return;
        }
        try {
            String t12 = this.N.t(heartBeatModel);
            if (this.X != null && !v80.d.a(t12)) {
                this.X.onHeartBeatDataCallback(t12);
                j90.c.c("onHeartBeatDataCallback:" + t12);
            }
            synchronized (this.O) {
                if (this.O.size() >= 30) {
                    this.O.remove(0);
                }
                this.O.add(heartBeatModel);
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "onHeartbeatCallBack throwable:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(final HeartBeatModel heartBeatModel) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "41")) {
            iSurgeon.surgeon$dispatch("41", new Object[]{this, heartBeatModel});
            return;
        }
        try {
            u80.a.b().a(new Runnable() { // from class: q80.d
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.lambda$dealWithHeartbeatInWorkThread$4(heartBeatModel);
                }
            });
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "onHeartBeatCallBack throwable:" + th2);
        }
    }

    private void o0(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!v80.d.a(str) && !v80.d.a(str2)) {
                if (this.f83486c) {
                    K0();
                }
            } else {
                Z0();
                q0(this.f83493i);
                a1();
                Y0();
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "dealWithKnightInfo:" + th2);
        }
    }

    private void p0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this});
            return;
        }
        if (!this.L.isEmpty()) {
            this.L.clear();
        }
        if (!this.A.isEmpty()) {
            this.A.clear();
            this.f83510z.clear();
            w70.a.l().e();
        }
        if (this.f83491g != null) {
            j90.c.b("KSD_Manager", "iKnightSmartDeviceCallback != null");
            this.f83491g.b(null);
        } else {
            j90.c.b("KSD_Manager", "iKnightSmartDeviceCallback == null");
        }
        i80.b bVar = this.J;
        if (bVar != null) {
            bVar.a(BleDeviceTypeEnum.UNKNOWN, BleDeviceStatusEnum.NOT_BINDING);
        }
    }

    private void q0(Map<String, me.ele.aiot.sensor.internal.c> map) {
        BleDeviceTypeEnum u02;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            iSurgeon.surgeon$dispatch("15", new Object[]{this, map});
            return;
        }
        j90.c.b("kSD_BLUETOOTH_CONNECT", "disconnectedAllWhenLogout");
        for (Map.Entry<String, me.ele.aiot.sensor.internal.c> entry : map.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                entry.getValue().a0();
            }
        }
        for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean : this.f83510z) {
            if (knightSmartDeviceInfoBean.isConnected()) {
                knightSmartDeviceInfoBean.setConnected(false);
                knightSmartDeviceInfoBean.setPowerBattery(-1);
                if (this.J != null && (u02 = u0(knightSmartDeviceInfoBean.getDeviceCode())) != null && u02 != BleDeviceTypeEnum.UNKNOWN) {
                    j90.c.b("KSD_Manager", "disconnectedAllWhenLogout->onStatusCallback:" + u02);
                    this.J.a(u02, BleDeviceStatusEnum.NOT_CONNECTED);
                }
                d1(knightSmartDeviceInfoBean.getMacAddress(), BleDeviceStatusEnum.NOT_CONNECTED.getStatusCode());
            }
        }
        i80.g gVar = this.f83491g;
        if (gVar != null) {
            gVar.b(this.f83510z);
        }
        w70.a.l().e();
        List<String> list = this.A;
        if (list != null && !list.isEmpty()) {
            this.A.clear();
        }
        List<KnightSmartDeviceInfoBean> list2 = this.f83510z;
        if (list2 != null && !list2.isEmpty()) {
            this.f83510z.clear();
        }
        map.clear();
        this.f83494j = "";
        this.f83495k = "";
        T0();
        ql1.c.c().l(new k80.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BleDeviceTypeEnum u0(String str) {
        ProductKeyEnum from;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "34")) {
            return (BleDeviceTypeEnum) iSurgeon.surgeon$dispatch("34", new Object[]{this, str});
        }
        BleDeviceTypeEnum bleDeviceTypeEnum = BleDeviceTypeEnum.UNKNOWN;
        try {
            if (!v80.d.a(str) && str.length() > 3 && (from = ProductKeyEnum.from(str.substring(0, 3))) != null) {
                return BleDeviceTypeEnum.from(from.getProductTypeCode());
            }
            return bleDeviceTypeEnum;
        } catch (Throwable unused) {
            return bleDeviceTypeEnum;
        }
    }

    private void v0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this});
        } else {
            u80.a.b().a(new Runnable() { // from class: q80.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.lambda$getCachedBoundInfo$1();
                }
            });
        }
    }

    public static g x0(Application application) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (g) iSurgeon.surgeon$dispatch("1", new Object[]{application});
        }
        if (f83477d0 == null && application != null) {
            synchronized (g.class) {
                if (f83477d0 == null) {
                    f83477d0 = new g(application);
                    w70.a.l().s(application);
                    w70.a.l().f(true);
                    if (!w70.a.l().x()) {
                        j90.c.b("KSD_Manager", "Bluetooth not supportBle!");
                    }
                    if (!w70.a.l().u()) {
                        j90.c.b("KSD_Manager", "Bluetooth not enable!");
                    }
                    A0(5000L);
                    N0(application.getApplicationContext());
                }
            }
        }
        return f83477d0;
    }

    public void C0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this});
        } else {
            this.M.post(new Runnable() { // from class: q80.b
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.lambda$initKnightSmartDevice$0();
                }
            });
        }
    }

    public boolean G0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "57")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("57", new Object[]{this})).booleanValue();
        }
        Iterator<BoundBleDeviceInfo> it = this.L.values().iterator();
        while (it.hasNext()) {
            if (BleDeviceStatusEnum.CONNECTED == BleDeviceStatusEnum.from(it.next().getStatusCode())) {
                return true;
            }
        }
        return false;
    }

    public void I0(me.ele.aiot.sensor.internal.c cVar, BleDevice bleDevice, boolean z12) {
        Map<String, String> map;
        BleDeviceTypeEnum u02;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "33")) {
            iSurgeon.surgeon$dispatch("33", new Object[]{this, cVar, bleDevice, Boolean.valueOf(z12)});
            return;
        }
        try {
            j90.c.b("kSD_BLUETOOTH_CONNECT", "notifyCallbackWhenDisconnected in");
            if (cVar != null) {
                if (this.f83485b0 != null && z12) {
                    j90.c.b("kSD_BLUETOOTH_CONNECT", "getBluetoothEvent bluetoothEvent ==2 helmetImpl is not null");
                    this.f83485b0.onUpgradeEvent(rf1.c.v(), cVar.m0(), "bluetoothEvent", "2", 1L);
                }
                cVar.a0();
            } else if (this.f83485b0 != null && z12) {
                j90.c.b("kSD_BLUETOOTH_CONNECT", "getBluetoothEvent bluetoothEvent ==2 helmetImpl is null");
                String mac = bleDevice.getMac();
                if (!v80.d.a(mac) && (map = this.B) != null && map.containsKey(mac)) {
                    String str = this.B.get(mac);
                    if (!v80.d.a(str)) {
                        me.ele.aiot.sensor.internal.a aVar = this.f83485b0;
                        long v12 = rf1.c.v();
                        BleDeviceEventEnum bleDeviceEventEnum = BleDeviceEventEnum.BLE_DISCONNECT_EVENT;
                        aVar.onUpgradeEvent(v12, str, bleDeviceEventEnum.getEventType(), bleDeviceEventEnum.getEventValue(), 1L);
                    }
                }
            }
            for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean : this.f83510z) {
                if (TextUtils.equals(knightSmartDeviceInfoBean.getMacAddress(), bleDevice.getMac()) && knightSmartDeviceInfoBean.isConnected()) {
                    knightSmartDeviceInfoBean.setConnected(false);
                    knightSmartDeviceInfoBean.setPowerBattery(-1);
                    i80.g gVar = this.f83491g;
                    if (gVar != null) {
                        gVar.b(this.f83510z);
                    }
                    if (this.J != null && (u02 = u0(knightSmartDeviceInfoBean.getDeviceCode())) != null && u02 != BleDeviceTypeEnum.UNKNOWN) {
                        j90.c.b("KSD_Manager", "notifyCallbackWhenDisconnected->onStatusCallback:" + u02);
                        this.J.a(u02, BleDeviceStatusEnum.NOT_CONNECTED);
                    }
                    d1(knightSmartDeviceInfoBean.getMacAddress(), BleDeviceStatusEnum.NOT_CONNECTED.getStatusCode());
                }
            }
        } catch (Throwable th2) {
            j90.c.b("KSD_Manager", "notifyCallbackWhenDisconnected throwable:" + th2);
        }
    }

    public void K0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this});
        } else {
            u80.a.b().a(new u80.b(this.f83491g, new h(), this.f83482a));
        }
    }

    public void P0(i80.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "48")) {
            iSurgeon.surgeon$dispatch("48", new Object[]{this, aVar});
            return;
        }
        j90.c.b("KSD_Manager", "removeHelmetButtonCallback1");
        if (this.K.contains(aVar)) {
            j90.c.b("KSD_Manager", "removeHelmetButtonCallback2");
            this.K.remove(aVar);
        }
    }

    public void Q0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this});
        } else {
            this.f83491g = null;
        }
    }

    public void R0(String str, String str2) {
        BleDeviceTypeEnum u02;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this, str, str2});
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            j90.c.b("KSD_Manager", "removeUnBindDevice:" + str2);
            if (this.J != null && (u02 = u0(str)) != null && u02 != BleDeviceTypeEnum.UNKNOWN) {
                j90.c.b("KSD_Manager", "removeUnBindDevice->onStatusCallback:" + u02);
                this.J.a(u02, BleDeviceStatusEnum.NOT_BINDING);
            }
            d1(str2, BleDeviceStatusEnum.NOT_BINDING.getStatusCode());
        } catch (Throwable th2) {
            j90.c.b("KSD_Manager", "removeUnBindDevice throwable:" + th2);
        }
    }

    public synchronized void S0(long j12, String str, String str2, String str3, long j13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "44")) {
            iSurgeon.surgeon$dispatch("44", new Object[]{this, Long.valueOf(j12), str, str2, str3, Long.valueOf(j13)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap.put("eventFrom", "embedded");
            hashMap.put("deviceCode", str);
            hashMap.put("requestId", UUID.randomUUID().toString());
            hashMap.put("productTypeKey", str.substring(0, 3));
            hashMap.put("eventTime", Long.valueOf(j12));
            hashMap.put("appReportTime", Long.valueOf(rf1.c.v()));
            hashMap.put("appReportIndex", 0);
            hashMap.put("eventReportType", Long.valueOf(j13));
            hashMap.put("eventIndex", 0);
            ArrayList arrayList = new ArrayList();
            HashMap hashMap4 = new HashMap();
            hashMap4.put("eventType", str2);
            hashMap4.put("eventValue", str3);
            arrayList.add(hashMap4);
            hashMap.put("eventInfoList", arrayList);
            hashMap2.put("param", hashMap);
            hashMap3.put("params", hashMap2);
            String t12 = new Gson().t(hashMap3);
            if (this.X != null && !v80.d.a(t12)) {
                this.X.onEventDataCallback(t12);
            }
            l80.d.g().n(t12);
        } catch (Throwable th2) {
            j90.c.b("kSD_HTTP", "report_event_check: ReportEventResponse message  fail :" + th2);
        }
    }

    public void U0(final String str, final String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, str, str2});
            return;
        }
        this.f83494j = str;
        this.f83495k = str2;
        this.M.post(new Runnable() { // from class: q80.c
            @Override // java.lang.Runnable
            public final void run() {
                g.this.lambda$saveInfoOpr$3(str, str2);
            }
        });
    }

    public void V0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this});
            return;
        }
        c1(null);
        if (!this.C.isEmpty()) {
            J0();
        } else {
            this.M.postDelayed(this.Z, 5000L);
        }
    }

    public void W0(int i12) {
        j80.a aVar;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "54")) {
            iSurgeon.surgeon$dispatch("54", new Object[]{this, Integer.valueOf(i12)});
            return;
        }
        j90.c.b("KSD_Manager", "cityId:" + i12);
        if (i12 != 0 && (aVar = this.f83490f) != null && aVar.b(this.f83482a) != i12) {
            this.f83490f.h(this.f83482a, i12);
        }
    }

    public void X(i80.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "47")) {
            iSurgeon.surgeon$dispatch("47", new Object[]{this, aVar});
            return;
        }
        j90.c.b("KSD_Manager", "addBleDeviceButtonCallback1");
        if (!this.K.contains(aVar)) {
            j90.c.b("KSD_Manager", "addBleDeviceButtonCallback2");
            this.K.add(aVar);
        }
    }

    public void Y(i80.e eVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "53")) {
            iSurgeon.surgeon$dispatch("53", new Object[]{this, eVar});
        } else {
            if (eVar == null) {
                return;
            }
            this.X = eVar;
        }
    }

    public void Z(i80.g gVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, gVar});
            return;
        }
        this.f83491g = gVar;
        List<KnightSmartDeviceInfoBean> list = this.f83510z;
        if (list != null && !list.isEmpty()) {
            gVar.b(this.f83510z);
        }
    }

    public void e0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "49")) {
            iSurgeon.surgeon$dispatch("49", new Object[]{this});
        } else {
            j90.c.b("KSD_Manager", "clearHelmetButtonCallback");
            this.K.clear();
        }
    }

    public synchronized void f1(KnightWorkStatusEnum knightWorkStatusEnum) {
        boolean z12;
        ISurgeon iSurgeon = $surgeonFlag;
        boolean z13 = false;
        if (InstrumentAPI.support(iSurgeon, "50")) {
            iSurgeon.surgeon$dispatch("50", new Object[]{this, knightWorkStatusEnum});
            return;
        }
        j90.c.b("kSD_BLUETOOTH_SCAN", "骑手工作状态:" + knightWorkStatusEnum.toString());
        if (this.f83506v == knightWorkStatusEnum) {
            return;
        }
        this.f83506v = knightWorkStatusEnum;
        try {
            if (l90.d.b("me.ele.hb_ksd", "get_bonded_headset_enable", true)) {
                this.f83497m = v80.c.a(this.f83494j);
            }
            if (!i80.j.f54968c) {
                if (!this.f83489e && KnightWorkStatusEnum.WORK == knightWorkStatusEnum) {
                    this.f83489e = true;
                    de0.i<s80.a> iVar = f83478e0;
                    de0.a.a(iVar);
                    de0.a.d(iVar, this.f83483a0);
                    k90.b.a("bluetooth_scan_start", null);
                }
                KnightWorkStatusEnum knightWorkStatusEnum2 = KnightWorkStatusEnum.WORK;
                if (knightWorkStatusEnum2 == knightWorkStatusEnum) {
                    K0();
                }
                if (knightWorkStatusEnum2 == knightWorkStatusEnum) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                de0.a.b(z12);
                HashMap hashMap = new HashMap();
                if (knightWorkStatusEnum2 == knightWorkStatusEnum) {
                    z13 = true;
                }
                hashMap.put("is_scan_ble", Boolean.valueOf(z13));
                k90.b.a("bluetooth_scan_update", hashMap);
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "updateKnightWorkStatus:" + th2);
        }
    }

    public void i1(byte[] bArr, File file) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "63")) {
            iSurgeon.surgeon$dispatch("63", new Object[]{this, bArr, file});
            return;
        }
        if (bArr != null && file != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    j90.c.b("KSD_Manager_SPP", "写入文件成功: " + file.getAbsolutePath());
                    b1(file);
                    fileOutputStream.close();
                } finally {
                }
            } catch (IOException e12) {
                j90.c.b("KSD_Manager_SPP", "写入文件失败: " + e12.getMessage());
            }
        }
    }

    public String r0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "59")) {
            return (String) iSurgeon.surgeon$dispatch("59", new Object[]{this});
        }
        BondedHeadset bondedHeadset = this.f83497m;
        return (bondedHeadset == null || TextUtils.isEmpty(bondedHeadset.getDeviceName())) ? "" : this.f83497m.getDeviceName();
    }

    public String s0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "58")) {
            return (String) iSurgeon.surgeon$dispatch("58", new Object[]{this});
        }
        BondedHeadset bondedHeadset = this.f83497m;
        return (bondedHeadset == null || TextUtils.isEmpty(bondedHeadset.getMacAddress())) ? "" : this.f83497m.getMacAddress();
    }

    public BleDeviceStatusBean t0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "45")) {
            return (BleDeviceStatusBean) iSurgeon.surgeon$dispatch("45", new Object[]{this});
        }
        BleDeviceStatusBean bleDeviceStatusBean = new BleDeviceStatusBean(BleDeviceTypeEnum.UNKNOWN, BleDeviceStatusEnum.NOT_BINDING);
        try {
            if (this.L.size() == 1) {
                for (BoundBleDeviceInfo boundBleDeviceInfo : this.L.values()) {
                    int typeCode = boundBleDeviceInfo.getTypeCode();
                    String statusCode = boundBleDeviceInfo.getStatusCode();
                    bleDeviceStatusBean.setBleDeviceTypeEnum(BleDeviceTypeEnum.from(typeCode));
                    bleDeviceStatusBean.setBleDeviceStatusEnum(BleDeviceStatusEnum.from(statusCode));
                }
            }
            j90.c.b("KSD_Manager", "getBleDeviceStatus:" + bleDeviceStatusBean);
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "getBleDeviceStatus:" + th2);
        }
        return bleDeviceStatusBean;
    }

    public String w0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "55") ? (String) iSurgeon.surgeon$dispatch("55", new Object[]{this}) : this.f83498n;
    }

    public String y0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "51") ? (String) iSurgeon.surgeon$dispatch("51", new Object[]{this}) : this.f83494j;
    }

    public String z0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "56") ? (String) iSurgeon.surgeon$dispatch("56", new Object[]{this}) : this.f83499o;
    }
}
