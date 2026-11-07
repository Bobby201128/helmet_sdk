package me.ele.aiot.kernel.temperature;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.util.PhoneInfo;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.alipay.mobile.common.transport.monitor.RPCDataParser;
import com.taobao.accs.common.Constants;
import com.taobao.tao.log.statistics.TLogEventConst;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import me.ele.aiot.fastble.data.BleDevice;
import me.ele.aiot.fastble.exception.BleException;
import me.ele.aiot.kernel.temperature.ReportParseResult;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class TemperatureManager {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: t, reason: collision with root package name */
    private static volatile TemperatureManager f61986t;

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f61987u = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}[0-9A-Fa-f]{2}$");

    /* renamed from: g, reason: collision with root package name */
    private volatile BleDevice f61994g;

    /* renamed from: h, reason: collision with root package name */
    private de0.f f61995h;

    /* renamed from: j, reason: collision with root package name */
    private volatile String f61997j;

    /* renamed from: k, reason: collision with root package name */
    private volatile String f61998k;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f61999l;

    /* renamed from: m, reason: collision with root package name */
    private volatile int f62000m;

    /* renamed from: n, reason: collision with root package name */
    private volatile long f62001n;

    /* renamed from: o, reason: collision with root package name */
    private volatile me.ele.aiot.kernel.temperature.c f62002o;

    /* renamed from: p, reason: collision with root package name */
    private volatile me.ele.aiot.kernel.temperature.f f62003p;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f61988a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    private final List<me.ele.aiot.kernel.temperature.b> f61989b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final me.ele.aiot.kernel.temperature.e f61990c = new me.ele.aiot.kernel.temperature.e();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Long> f61991d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, ConnectionState> f61992e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private volatile SessionState f61993f = SessionState.IDLE;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f61996i = new me.ele.td.lib.wrapper.e(Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f62004q = new b();

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f62005r = new c();

    /* renamed from: s, reason: collision with root package name */
    private final de0.d<me.ele.aiot.kernel.temperature.d> f62006s = new d();

    /* loaded from: classes4.dex */
    public enum ConnectionState {
        IDLE,
        CONNECTING,
        CONNECTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum SessionState {
        IDLE,
        SCANNING,
        CONNECTING,
        READING,
        DISCONNECTING,
        UPLOADING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62007a;

        static {
            int[] iArr = new int[ReportParseResult.Status.values().length];
            f62007a = iArr;
            try {
                iArr[ReportParseResult.Status.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62007a[ReportParseResult.Status.CRC_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62007a[ReportParseResult.Status.WRONG_CMD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62007a[ReportParseResult.Status.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62007a[ReportParseResult.Status.DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                TemperatureManager.this.u("session_timeout");
            }
        }
    }

    /* loaded from: classes4.dex */
    public class c implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL connect timeout, target=" + TemperatureManager.this.f61997j);
            TemperatureManager.this.u(Constants.SP_KEY_CONNECT_TIMEOUT);
        }
    }

    /* loaded from: classes4.dex */
    public class d implements de0.d<me.ele.aiot.kernel.temperature.d> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        d() {
        }

        @Override // de0.d
        public void a(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "onScanFailed errorCode=" + i12);
            TemperatureManager.D("temperature_scan_failed", "error_code", Integer.valueOf(i12));
            TemperatureManager.this.u("scan_failed_" + i12);
        }

        @Override // de0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BluetoothDevice bluetoothDevice, me.ele.aiot.kernel.temperature.d dVar, int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, bluetoothDevice, dVar, Integer.valueOf(i12)});
                return;
            }
            if (bluetoothDevice != null && dVar != null) {
                String a12 = dVar.a();
                if (TextUtils.isEmpty(a12)) {
                    return;
                }
                String address = bluetoothDevice.getAddress();
                if (TextUtils.isEmpty(address)) {
                    return;
                }
                String str = TemperatureManager.this.f61997j;
                if (!TextUtils.isEmpty(str) && address.equalsIgnoreCase(str)) {
                    Long l12 = (Long) TemperatureManager.this.f61991d.get(address);
                    long b12 = dVar.b();
                    if (l12 != null && b12 - l12.longValue() < 2000) {
                        return;
                    }
                    TemperatureManager.this.f61991d.put(address, Long.valueOf(b12));
                    TemperatureManager.D("temperature_scan", PhoneInfo.MACADDRESS, address, "device_code", a12, "tracking_id", TemperatureManager.this.f61999l);
                    j90.c.b("kSD_TemperatureManager", "TDL onScanDevice target matched mac=" + address + ", deviceCode=" + a12 + ", rssi=" + i12);
                    synchronized (TemperatureManager.this) {
                        TemperatureManager.this.Q();
                        TemperatureManager.this.f61993f = SessionState.CONNECTING;
                    }
                    TemperatureManager.this.v(bluetoothDevice, a12);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class e extends x70.b {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62011a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62012b;

        e(String str, String str2) {
            this.f62011a = str;
            this.f62012b = str2;
        }

        @Override // x70.b
        public void a(BleDevice bleDevice, BleException bleException) {
            int code;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bleDevice, bleException});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL onConnectFail mac=" + this.f62011a + ", e=" + bleException);
            TemperatureManager.this.f61992e.put(this.f62011a, ConnectionState.IDLE);
            Object[] objArr = new Object[6];
            objArr[0] = PhoneInfo.MACADDRESS;
            objArr[1] = this.f62011a;
            objArr[2] = "device_code";
            objArr[3] = this.f62012b;
            objArr[4] = "error_code";
            if (bleException == null) {
                code = -1;
            } else {
                code = bleException.getCode();
            }
            objArr[5] = Integer.valueOf(code);
            TemperatureManager.D("temperature_connect_fail", objArr);
            TemperatureManager.this.u("connect_fail");
        }

        @Override // x70.b
        public void b(BleDevice bleDevice, BluetoothGatt bluetoothGatt, int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, bleDevice, bluetoothGatt, Integer.valueOf(i12)});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL onConnectSuccess mac=" + this.f62011a + ", status=" + i12);
            TemperatureManager.this.f61996i.removeCallbacks(TemperatureManager.this.f62005r);
            TemperatureManager.this.f61992e.put(this.f62011a, ConnectionState.CONNECTED);
            TemperatureManager.this.f61994g = bleDevice;
            synchronized (TemperatureManager.this) {
                if (TemperatureManager.this.f61993f != SessionState.CONNECTING) {
                    j90.c.b("kSD_TemperatureManager", "onConnectSuccess ignored, state=" + TemperatureManager.this.f61993f);
                    return;
                }
                TemperatureManager.this.f61993f = SessionState.READING;
                TemperatureManager.D("temperature_connect_success", PhoneInfo.MACADDRESS, this.f62011a, "device_code", this.f62012b, "connect_time", Long.valueOf(rf1.c.v()));
                TemperatureManager.this.E(bleDevice, this.f62012b);
            }
        }

        @Override // x70.b
        public void c(boolean z12, BleDevice bleDevice, BluetoothGatt bluetoothGatt, int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Boolean.valueOf(z12), bleDevice, bluetoothGatt, Integer.valueOf(i12)});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL onDisConnected mac=" + this.f62011a + ", isActive=" + z12 + ", status=" + i12);
            TemperatureManager.this.f61992e.put(this.f62011a, ConnectionState.IDLE);
            TemperatureManager.D("temperature_disconnect", PhoneInfo.MACADDRESS, this.f62011a, "device_code", this.f62012b, "is_active", Boolean.valueOf(z12), "status", Integer.valueOf(i12));
            if (!z12 && TemperatureManager.this.f61993f != SessionState.IDLE && TemperatureManager.this.f61993f != SessionState.DISCONNECTING && TemperatureManager.this.f61993f != SessionState.UPLOADING) {
                TemperatureManager.this.u("unexpected_disconnect");
            }
        }

        @Override // x70.b
        public void d() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL onStartConnect mac=" + this.f62011a);
            TemperatureManager.D("temperature_connect_start", PhoneInfo.MACADDRESS, this.f62011a, "device_code", this.f62012b);
        }
    }

    /* loaded from: classes4.dex */
    public class f extends x70.d {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62014c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f62015d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BleDevice f62016e;

        f(String str, String str2, BleDevice bleDevice) {
            this.f62014c = str;
            this.f62015d = str2;
            this.f62016e = bleDevice;
        }

        @Override // x70.d
        public void e(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL onMtuChanged mac=" + this.f62014c + ", mtu=" + i12);
            TemperatureManager.D("temperature_set_mtu_success", PhoneInfo.MACADDRESS, this.f62014c, "device_code", this.f62015d, "mtu", Integer.valueOf(i12));
            TemperatureManager.this.M(this.f62016e, this.f62015d);
        }

        @Override // x70.d
        public void f(BleException bleException) {
            int code;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, bleException});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL onSetMTUFailure mac=" + this.f62014c + ", e=" + bleException);
            Object[] objArr = new Object[6];
            objArr[0] = PhoneInfo.MACADDRESS;
            objArr[1] = this.f62014c;
            objArr[2] = "device_code";
            objArr[3] = this.f62015d;
            objArr[4] = "error_code";
            if (bleException == null) {
                code = -1;
            } else {
                code = bleException.getCode();
            }
            objArr[5] = Integer.valueOf(code);
            TemperatureManager.D("temperature_set_mtu_fail", objArr);
            TemperatureManager.this.M(this.f62016e, this.f62015d);
        }
    }

    /* loaded from: classes4.dex */
    public class g extends x70.e {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62018c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BleDevice f62019d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f62020e;

        g(String str, BleDevice bleDevice, String str2) {
            this.f62018c = str;
            this.f62019d = bleDevice;
            this.f62020e = str2;
        }

        @Override // x70.e
        public void e(byte[] bArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, bArr});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL onCharacteristicChanged mac=" + this.f62018c + ", data=" + l90.a.a(bArr));
            TemperatureManager.this.C(this.f62019d, this.f62020e, bArr);
        }

        @Override // x70.e
        public void f(BleException bleException) {
            int code;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bleException});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL notify failed mac=" + this.f62018c + ", e=" + bleException);
            Object[] objArr = new Object[6];
            objArr[0] = PhoneInfo.MACADDRESS;
            objArr[1] = this.f62018c;
            objArr[2] = "device_code";
            objArr[3] = this.f62020e;
            objArr[4] = "error_code";
            if (bleException == null) {
                code = -1;
            } else {
                code = bleException.getCode();
            }
            objArr[5] = Integer.valueOf(code);
            TemperatureManager.D("temperature_notify_fail", objArr);
            TemperatureManager.this.u("notify_fail");
        }

        @Override // x70.e
        public void g() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL notify enabled mac=" + this.f62018c);
            TemperatureManager.this.N(this.f62019d, this.f62020e);
        }
    }

    /* loaded from: classes4.dex */
    public class h extends x70.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62022c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f62023d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f62024e;

        h(String str, long j12, String str2) {
            this.f62022c = str;
            this.f62023d = j12;
            this.f62024e = str2;
        }

        @Override // x70.h
        public void e(BleException bleException) {
            int code;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bleException});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL temperature read write fail mac=" + this.f62022c + ", e=" + bleException);
            Object[] objArr = new Object[6];
            objArr[0] = PhoneInfo.MACADDRESS;
            objArr[1] = this.f62022c;
            objArr[2] = "device_code";
            objArr[3] = this.f62024e;
            objArr[4] = "error_code";
            if (bleException == null) {
                code = -1;
            } else {
                code = bleException.getCode();
            }
            objArr[5] = Integer.valueOf(code);
            TemperatureManager.D("temperature_read_send_fail", objArr);
            TemperatureManager.this.u("write_fail");
        }

        @Override // x70.h
        public void f(int i12, int i13, byte[] bArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12), Integer.valueOf(i13), bArr});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL temperature read write success mac=" + this.f62022c + ", seq=" + this.f62023d + ", data=" + l90.a.a(bArr));
            TemperatureManager.D("temperature_read_send_success", PhoneInfo.MACADDRESS, this.f62022c, "device_code", this.f62024e, "seq", Long.valueOf(this.f62023d));
        }
    }

    /* loaded from: classes4.dex */
    public class i extends x70.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62026c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f62027d;

        i(String str, long j12) {
            this.f62026c = str;
            this.f62027d = j12;
        }

        @Override // x70.h
        public void e(BleException bleException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bleException});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL temperature ack write fail mac=" + this.f62026c + ", e=" + bleException);
        }

        @Override // x70.h
        public void f(int i12, int i13, byte[] bArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12), Integer.valueOf(i13), bArr});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL temperature ack write success mac=" + this.f62026c + ", seq=" + this.f62027d);
        }
    }

    /* loaded from: classes4.dex */
    public class j implements l80.e {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f62032d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f62033e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f62034f;

        j(String str, String str2, String str3, int i12, List list, long j12) {
            this.f62029a = str;
            this.f62030b = str2;
            this.f62031c = str3;
            this.f62032d = i12;
            this.f62033e = list;
            this.f62034f = j12;
        }

        @Override // l80.e
        public void a(boolean z12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, Boolean.valueOf(z12)});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "uploadTemperature result valid=" + z12);
            TemperatureManager.D("temperature_upload_result", "valid", Boolean.valueOf(z12), "temperature", this.f62029a, "device_code", this.f62030b, "tracking_id", this.f62031c, TLogEventConst.PARAM_UPLOAD_STAGE, Integer.valueOf(this.f62032d));
            TemperatureManager.this.f62003p = me.ele.aiot.kernel.temperature.f.b(this.f62030b, z12, this.f62029a, this.f62033e, this.f62034f, this.f62031c, this.f62032d);
            if (z12) {
                TemperatureManager.this.A(200, this.f62029a);
            } else {
                TemperatureManager.this.A(203, this.f62029a);
            }
        }

        @Override // l80.e
        public void onError(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
                return;
            }
            j90.c.b("kSD_TemperatureManager", "uploadTemperature onError:" + str);
            TemperatureManager.D("temperature_upload_fail", PushMessageHelper.ERROR_MESSAGE, str, "temperature", this.f62029a, "device_code", this.f62030b, "tracking_id", this.f62031c, TLogEventConst.PARAM_UPLOAD_STAGE, Integer.valueOf(this.f62032d));
            TemperatureManager.this.f62003p = me.ele.aiot.kernel.temperature.f.a(this.f62030b, this.f62029a, this.f62033e, this.f62034f, this.f62031c, this.f62032d);
            TemperatureManager.this.A(203, this.f62029a);
        }
    }

    private TemperatureManager(Application application) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A(int i12, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, Integer.valueOf(i12), str});
            return;
        }
        if (this.f61993f != SessionState.UPLOADING) {
            j90.c.b("kSD_TemperatureManager", "finishUploadAndDeliver ignored, state=" + this.f61993f + ", code=" + i12);
            return;
        }
        this.f61996i.removeCallbacks(this.f62004q);
        synchronized (this.f61989b) {
            this.f61989b.clear();
        }
        this.f62001n = 0L;
        this.f62000m = 0;
        this.f61993f = SessionState.IDLE;
        x(i12, str);
    }

    public static TemperatureManager B(Application application) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (TemperatureManager) iSurgeon.surgeon$dispatch("1", new Object[]{application});
        }
        if (f61986t == null && application != null) {
            synchronized (TemperatureManager.class) {
                if (f61986t == null) {
                    f61986t = new TemperatureManager(application);
                    w70.a.l().s(application);
                    w70.a.l().f(true);
                }
            }
        }
        return f61986t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(BleDevice bleDevice, String str, byte[] bArr) {
        int size;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, bleDevice, str, bArr});
            return;
        }
        if (bleDevice == null) {
            return;
        }
        String mac = bleDevice.getMac();
        try {
            ReportParseResult c12 = me.ele.aiot.kernel.temperature.a.c(bArr);
            int i12 = a.f62007a[c12.f61983a.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                return;
                            }
                            synchronized (this.f61989b) {
                                for (Iterator<me.ele.aiot.kernel.temperature.b> it = c12.f61985c.iterator(); it.hasNext(); it = it) {
                                    me.ele.aiot.kernel.temperature.b next = it.next();
                                    j90.c.b("kSD_TemperatureManager", "TDL secondTimeStamp:" + next.a() + ",temperature:" + next.b());
                                    this.f61989b.add(next);
                                }
                                size = this.f61989b.size();
                            }
                            j90.c.b("kSD_TemperatureManager", "TDL temperature report mac=" + mac + ", seq=" + c12.f61984b + ", points=" + c12.f61985c.size() + ", total=" + size);
                            L(bleDevice, c12.f61984b);
                            D("temperature_report_recv", PhoneInfo.MACADDRESS, mac, "device_code", str, "seq", Long.valueOf(c12.f61984b), "points", Integer.valueOf(c12.f61985c.size()));
                            return;
                        }
                        j90.c.b("kSD_TemperatureManager", "TDL temperature report finished mac=" + mac + ", seq=" + c12.f61984b);
                        L(bleDevice, c12.f61984b);
                        I(bleDevice, str);
                        return;
                    }
                    j90.c.b("kSD_TemperatureManager", "TDL non-report packet mac=" + mac);
                    return;
                }
                j90.c.b("kSD_TemperatureManager", "TDL temperature report CRC fail mac=" + mac);
                D("temperature_report_crc_fail", PhoneInfo.MACADDRESS, mac, "device_code", str);
                return;
            }
            j90.c.b("kSD_TemperatureManager", "TDL temperature report ignored, invalid data");
        } catch (Throwable th2) {
            j90.c.b("kSD_TemperatureManager", "handleTemperatureReportPacket ex:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(String str, Object... objArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        int i12 = 0;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{str, objArr});
            return;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            int i13 = i12 + 1;
            if (i13 < objArr.length) {
                hashMap.put(String.valueOf(objArr[i12]), objArr[i13]);
                i12 += 2;
            } else {
                k90.b.a(str, hashMap);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(BleDevice bleDevice, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this, bleDevice, str});
            return;
        }
        if (bleDevice == null) {
            return;
        }
        if (this.f61993f != SessionState.READING) {
            j90.c.b("kSD_TemperatureManager", "negotiateMtuThenRead aborted, state=" + this.f61993f);
            return;
        }
        try {
            w70.a.l().A(bleDevice, 256, new f(bleDevice.getMac(), str, bleDevice));
        } catch (Throwable th2) {
            j90.c.b("kSD_TemperatureManager", "negotiateMtuThenRead ex:" + th2);
            u("mtu_ex");
        }
    }

    private void F(String str, String str2, String str3, String str4, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, str, str2, str3, str4, Integer.valueOf(i12)});
            return;
        }
        D("temperature_scan_error", "reason", str, "device_code", str2, PhoneInfo.MACADDRESS, str3, "tracking_id", str4, TLogEventConst.PARAM_UPLOAD_STAGE, Integer.valueOf(i12));
        j90.c.b("kSD_TemperatureManager", "TemperatureManager ble error reason=" + str + ", deviceCode=" + str2 + ", mac=" + str3 + ", trackingId=" + str4 + ", stage=" + i12);
    }

    private void G(List<me.ele.aiot.kernel.temperature.b> list) {
        int size;
        int i12;
        String str;
        long j12;
        String str2;
        String str3;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "19")) {
            iSurgeon.surgeon$dispatch("19", new Object[]{this, list});
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onSessionComplete, points=");
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        sb2.append(size);
        sb2.append(",");
        sb2.append(list);
        j90.c.b("kSD_TemperatureManager", sb2.toString());
        String K = K(list);
        long j13 = this.f62001n;
        String str4 = this.f61998k;
        String str5 = this.f61999l;
        int i13 = this.f62000m;
        try {
            i12 = i13;
            str = str5;
            j12 = j13;
            str2 = K;
            str3 = str4;
            try {
                j jVar = new j(K, str4, str5, i12, list, j12);
                if (l90.d.b("me.ele.hb_ksd", "use_hbnetwork", true)) {
                    r80.a.b().c(j12, str3, str, i12, list, jVar);
                } else {
                    l80.d.g().q(j12, str3, str, i12, list, jVar);
                }
            } catch (Throwable th2) {
                th = th2;
                j90.c.b("kSD_TemperatureManager", "onSessionComplete upload ex:" + th);
                String str6 = str2;
                D("temperature_upload_fail", PushMessageHelper.ERROR_MESSAGE, th.getMessage(), "temperature", str6, "device_code", str3, "tracking_id", str, TLogEventConst.PARAM_UPLOAD_STAGE, Integer.valueOf(i12));
                this.f62003p = me.ele.aiot.kernel.temperature.f.a(str3, str6, list, j12, str, i12);
                A(203, str6);
            }
        } catch (Throwable th3) {
            th = th3;
            i12 = i13;
            str = str5;
            j12 = j13;
            str2 = K;
            str3 = str4;
        }
    }

    private void H(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this, str});
            return;
        }
        j90.c.b("kSD_TemperatureManager", "onSessionError, reason=" + str);
    }

    private synchronized void I(BleDevice bleDevice, String str) {
        ArrayList arrayList;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, bleDevice, str});
            return;
        }
        if (bleDevice == null) {
            return;
        }
        if (this.f61993f != SessionState.READING) {
            j90.c.b("kSD_TemperatureManager", "onTemperatureSessionFinished aborted, state=" + this.f61993f);
            return;
        }
        this.f61993f = SessionState.DISCONNECTING;
        this.f61996i.removeCallbacks(this.f62005r);
        String mac = bleDevice.getMac();
        synchronized (this.f61989b) {
            arrayList = new ArrayList(this.f61989b);
        }
        int size = arrayList.size();
        j90.c.b("kSD_TemperatureManager", "TDL temperature session finished mac=" + mac + ", total=" + size);
        try {
            w70.a.l().B(bleDevice, "4a822a40-cf3a-11e1-9ab4-0002a5d5c52b", "4a822a41-cf3a-11e1-9ab4-0002a5d5c52b");
        } catch (Throwable unused) {
        }
        y(mac);
        this.f61992e.put(mac, ConnectionState.IDLE);
        this.f61994g = null;
        this.f61993f = SessionState.UPLOADING;
        D("temperature_report_finish", PhoneInfo.MACADDRESS, mac, "device_code", str, "total_points", Integer.valueOf(size));
        G(arrayList);
    }

    private static String[] J(String str) {
        String trim;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (String[]) iSurgeon.surgeon$dispatch("3", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",", 2);
        if (split.length < 2) {
            return null;
        }
        String str2 = split[0];
        String str3 = "";
        if (str2 == null) {
            trim = "";
        } else {
            trim = str2.trim();
        }
        String str4 = split[1];
        if (str4 != null) {
            str3 = str4.trim();
        }
        if (TextUtils.isEmpty(trim) || TextUtils.isEmpty(str3) || !trim.startsWith("TDL") || !f61987u.matcher(str3).matches()) {
            return null;
        }
        return new String[]{trim, str3};
    }

    private static String K(List<me.ele.aiot.kernel.temperature.b> list) {
        me.ele.aiot.kernel.temperature.b bVar;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            return (String) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{list});
        }
        if (list == null || list.isEmpty() || (bVar = list.get(list.size() - 1)) == null) {
            return "";
        }
        return String.format(Locale.US, "%.1f", Float.valueOf(bVar.b()));
    }

    private void L(BleDevice bleDevice, long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, bleDevice, Long.valueOf(j12)});
            return;
        }
        if (bleDevice == null) {
            return;
        }
        String mac = bleDevice.getMac();
        byte[] b12 = me.ele.aiot.kernel.temperature.a.b(j12);
        if (b12 != null && b12.length != 0) {
            try {
                w70.a.l().D(bleDevice, "4a822a40-cf3a-11e1-9ab4-0002a5d5c52b", "4a822a42-cf3a-11e1-9ab4-0002a5d5c52b", b12, new i(mac, j12));
                return;
            } catch (Throwable th2) {
                j90.c.b("kSD_TemperatureManager", "replyTemperatureReportAck write ex:" + th2);
                return;
            }
        }
        j90.c.b("kSD_TemperatureManager", "TDL build ack packet failed mac=" + mac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(BleDevice bleDevice, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, bleDevice, str});
            return;
        }
        if (bleDevice == null) {
            return;
        }
        if (this.f61993f != SessionState.READING) {
            j90.c.b("kSD_TemperatureManager", "requestTemperatureRead aborted, state=" + this.f61993f);
            return;
        }
        try {
            w70.a.l().y(bleDevice, "4a822a40-cf3a-11e1-9ab4-0002a5d5c52b", "4a822a41-cf3a-11e1-9ab4-0002a5d5c52b", new g(bleDevice.getMac(), bleDevice, str));
        } catch (Throwable th2) {
            j90.c.b("kSD_TemperatureManager", "requestTemperatureRead ex:" + th2);
            u("notify_ex");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(BleDevice bleDevice, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, bleDevice, str});
            return;
        }
        String mac = bleDevice.getMac();
        long andIncrement = this.f61988a.getAndIncrement();
        byte[] a12 = me.ele.aiot.kernel.temperature.a.a(andIncrement);
        if (a12 != null && a12.length != 0) {
            try {
                w70.a.l().D(bleDevice, "4a822a40-cf3a-11e1-9ab4-0002a5d5c52b", "4a822a42-cf3a-11e1-9ab4-0002a5d5c52b", a12, new h(mac, andIncrement, str));
                return;
            } catch (Throwable th2) {
                j90.c.b("kSD_TemperatureManager", "sendTemperatureReadPacket write ex:" + th2);
                u("write_ex");
                return;
            }
        }
        j90.c.b("kSD_TemperatureManager", "TDL buildTemperatureReadPacket failed mac=" + mac);
    }

    private void P() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "25")) {
            iSurgeon.surgeon$dispatch("25", new Object[]{this});
        } else {
            this.f61996i.removeCallbacks(this.f62004q);
            this.f61996i.postDelayed(this.f62004q, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this});
            return;
        }
        try {
            de0.f fVar = this.f61995h;
            if (fVar != null) {
                de0.a.e(fVar);
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_TemperatureManager", "TemperatureManager stopScanInternal ex:" + th2);
        }
        this.f61995h = null;
        this.f61991d.clear();
        D("temperature_scan_stop", new Object[0]);
        j90.c.b("kSD_TemperatureManager", "stopScanInternal");
    }

    private void t(String str, String str2, String str3, int i12, long j12, me.ele.aiot.kernel.temperature.c cVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this, str, str2, str3, Integer.valueOf(i12), Long.valueOf(j12), cVar});
            return;
        }
        this.f61997j = str.toUpperCase(Locale.US);
        this.f61998k = str2;
        this.f61999l = str3;
        this.f62000m = i12;
        this.f62001n = j12;
        this.f62002o = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            iSurgeon.surgeon$dispatch("15", new Object[]{this, str});
            return;
        }
        SessionState sessionState = this.f61993f;
        SessionState sessionState2 = SessionState.IDLE;
        if (sessionState == sessionState2) {
            j90.c.b("kSD_TemperatureManager", "cleanupAndReset ignored, already IDLE, reason=" + str);
            return;
        }
        j90.c.b("kSD_TemperatureManager", "cleanupAndReset reason=" + str + ", state=" + this.f61993f);
        this.f61996i.removeCallbacks(this.f62004q);
        this.f61996i.removeCallbacks(this.f62005r);
        if (this.f61994g != null) {
            y(this.f61994g.getMac());
        } else if (!TextUtils.isEmpty(this.f61997j)) {
            y(this.f61997j);
        }
        String str2 = this.f61998k;
        String str3 = this.f61997j;
        String str4 = this.f61999l;
        int i12 = this.f62000m;
        if (this.f61993f == SessionState.SCANNING) {
            Q();
        }
        this.f61992e.clear();
        this.f61994g = null;
        this.f61991d.clear();
        this.f62000m = 0;
        this.f62001n = 0L;
        this.f61993f = sessionState2;
        if ("user_cancelled".equals(str)) {
            this.f62002o = null;
        } else {
            x(202, "");
        }
        H(str);
        F(str, str2, str3, str4, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void v(BluetoothDevice bluetoothDevice, String str) {
        String address;
        ConnectionState connectionState;
        ConnectionState connectionState2;
        ConnectionState connectionState3;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, bluetoothDevice, str});
            return;
        }
        if (this.f61993f != SessionState.CONNECTING) {
            j90.c.b("kSD_TemperatureManager", "connectIfNeeded aborted, state=" + this.f61993f);
            return;
        }
        try {
            address = bluetoothDevice.getAddress();
            connectionState = this.f61992e.get(address);
            if (connectionState == null) {
                connectionState = ConnectionState.IDLE;
            }
            connectionState2 = ConnectionState.CONNECTING;
        } catch (Throwable unused) {
            u("connect_ex");
        }
        if (connectionState != connectionState2 && connectionState != (connectionState3 = ConnectionState.CONNECTED)) {
            if (w70.a.l().v(address)) {
                this.f61992e.put(address, connectionState3);
                this.f61993f = SessionState.READING;
                BleDevice z12 = z(address);
                if (z12 != null) {
                    this.f61994g = z12;
                    E(z12, str);
                } else {
                    u("connected_but_no_device");
                }
                return;
            }
            this.f61992e.put(address, connectionState2);
            this.f61996i.removeCallbacks(this.f62005r);
            this.f61996i.postDelayed(this.f62005r, 5000L);
            w70.a.l().a(address, new e(address, str));
        }
    }

    private static void w(me.ele.aiot.kernel.temperature.c cVar, int i12, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{cVar, Integer.valueOf(i12), str});
            return;
        }
        if (cVar == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        try {
            cVar.onResult(i12, str);
        } catch (Throwable th2) {
            j90.c.b("kSD_TemperatureManager", "deliverCallbackSafe ex:" + th2);
        }
    }

    private void x(int i12, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "27")) {
            iSurgeon.surgeon$dispatch("27", new Object[]{this, Integer.valueOf(i12), str});
            return;
        }
        me.ele.aiot.kernel.temperature.c cVar = this.f62002o;
        this.f62002o = null;
        if (cVar == null) {
            j90.c.b("kSD_TemperatureManager", "deliverResult skipped, no callback, code=" + i12 + ", temperature=" + str);
            return;
        }
        if (str == null) {
            str = "";
        }
        try {
            cVar.onResult(i12, str);
        } catch (Throwable th2) {
            j90.c.b("kSD_TemperatureManager", "deliverResult ex:" + th2);
        }
    }

    private void y(String str) {
        List<BleDevice> g12;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            BleDevice bleDevice = this.f61994g;
            if (bleDevice != null) {
                w70.a.l().B(bleDevice, "4a822a40-cf3a-11e1-9ab4-0002a5d5c52b", "4a822a41-cf3a-11e1-9ab4-0002a5d5c52b");
            }
        } catch (Throwable unused) {
        }
        try {
            BleDevice bleDevice2 = this.f61994g;
            if (bleDevice2 == null && (g12 = w70.a.l().g()) != null) {
                Iterator<BleDevice> it = g12.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BleDevice next = it.next();
                    if (str.equalsIgnoreCase(next.getMac())) {
                        bleDevice2 = next;
                        break;
                    }
                }
            }
            if (bleDevice2 != null) {
                w70.a.l().d(bleDevice2);
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_TemperatureManager", "disconnectDevice ex:" + th2);
        }
    }

    private BleDevice z(String str) {
        List<BleDevice> g12;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            return (BleDevice) iSurgeon.surgeon$dispatch("17", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (g12 = w70.a.l().g()) != null) {
            for (BleDevice bleDevice : g12) {
                if (str.equalsIgnoreCase(bleDevice.getMac())) {
                    return bleDevice;
                }
            }
        }
        return null;
    }

    public synchronized void O(long j12, String str, int i12, String str2, me.ele.aiot.kernel.temperature.c cVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Long.valueOf(j12), str, Integer.valueOf(i12), str2, cVar});
            return;
        }
        j90.c.b("kSD_TemperatureManager", "startScan knightId=" + j12 + ", trackingId=" + str + ", stage=" + i12 + ", barCode=" + str2 + ", state=" + this.f61993f);
        if (this.f61993f != SessionState.IDLE) {
            j90.c.b("kSD_TemperatureManager", "startScan rejected: 温度读取流程进行中，请等待当前流程结束, currentState=" + this.f61993f);
            w(cVar, 204, "");
            H("温度读取流程进行中，请等待当前流程结束");
            return;
        }
        String[] J = J(str2);
        if (J == null) {
            j90.c.b("kSD_TemperatureManager", "startScan ignored, barCode invalid: " + str2);
            F("bar_code_invalid", null, null, str, i12);
            w(cVar, 201, "");
            H("bar_code_invalid");
            return;
        }
        String str3 = J[0];
        String str4 = J[1];
        me.ele.aiot.kernel.temperature.f fVar = this.f62003p;
        if (fVar != null && str3.equals(fVar.f62044a) && System.currentTimeMillis() - fVar.f62048e < 10000) {
            if (fVar.f62045b) {
                j90.c.b("kSD_TemperatureManager", "startScan cache hit (success), deviceCode=" + str3 + ", valid=" + fVar.f62046c + ", age=" + (System.currentTimeMillis() - fVar.f62048e) + RPCDataParser.TIME_MS);
                w(cVar, fVar.f62046c ? 200 : 203, fVar.f62047d);
                return;
            }
            j90.c.b("kSD_TemperatureManager", "startScan cache hit (upload failed last time), retry upload, deviceCode=" + str3 + ", age=" + (System.currentTimeMillis() - fVar.f62048e) + RPCDataParser.TIME_MS);
            t(str4, str3, str, i12, j12, cVar);
            this.f61993f = SessionState.UPLOADING;
            P();
            G(fVar.f62049f);
            return;
        }
        if (!w70.a.l().u()) {
            j90.c.b("kSD_TemperatureManager", "startScan rejected: 蓝牙未开启");
            F("蓝牙未开启", str3, str4, str, i12);
            w(cVar, 202, "");
            H("蓝牙未开启");
            return;
        }
        t(str4, str3, str, i12, j12, cVar);
        this.f61994g = null;
        synchronized (this.f61989b) {
            this.f61989b.clear();
        }
        try {
            this.f61993f = SessionState.SCANNING;
            de0.a.a(this.f61990c);
            this.f61995h = de0.a.d(this.f61990c, this.f62006s);
            D("temperature_scan_start", "device_code", str3, PhoneInfo.MACADDRESS, str4, "tracking_id", str, TLogEventConst.PARAM_UPLOAD_STAGE, Integer.valueOf(i12));
            j90.c.b("kSD_TemperatureManager", "startScan:target=" + this.f61997j);
            P();
        } catch (Throwable th2) {
            j90.c.b("kSD_TemperatureManager", "TemperatureManager startScan ex:" + th2);
            this.f61993f = SessionState.IDLE;
            F("start_scan_ex", str3, str4, str, i12);
            x(202, "");
            H("start_scan_ex");
        }
    }
}
