package me.ele.aiot.sensor.internal;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.util.PhoneInfo;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import f90.a;
import g90.e;
import i90.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.ele.aiot.fastble.data.BleDevice;
import me.ele.aiot.fastble.exception.BleException;
import me.ele.aiot.sensor.internal.event.command.EventCommand;
import me.ele.aiot.sensor.internal.event.command.EventResult;
import me.ele.aiot.sensor.model.HeartBeatModel;
import me.ele.aiot.sensor.model.PdrDetailModel;
import me.ele.foundation.Application;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class c extends MainThreadBluetoothGattCallback {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private static final Handler X = new me.ele.td.lib.wrapper.e(Looper.getMainLooper());
    private String D;
    private int G;
    private me.ele.aiot.sensor.internal.d H;
    private g90.f P;
    private g90.g Q;

    /* renamed from: b, reason: collision with root package name */
    private boolean f62069b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f62070c;

    /* renamed from: e, reason: collision with root package name */
    private BluetoothGatt f62072e;

    /* renamed from: k, reason: collision with root package name */
    private String f62078k;

    /* renamed from: l, reason: collision with root package name */
    private String f62079l;

    /* renamed from: p, reason: collision with root package name */
    private i90.e f62083p;

    /* renamed from: q, reason: collision with root package name */
    private i90.e f62084q;

    /* renamed from: r, reason: collision with root package name */
    private i90.e f62085r;

    /* renamed from: s, reason: collision with root package name */
    private i90.e f62086s;

    /* renamed from: t, reason: collision with root package name */
    private i90.e f62087t;

    /* renamed from: u, reason: collision with root package name */
    private me.ele.aiot.sensor.internal.a f62088u;

    /* renamed from: v, reason: collision with root package name */
    private BleDevice f62089v;

    /* renamed from: x, reason: collision with root package name */
    private String f62091x;

    /* renamed from: y, reason: collision with root package name */
    private int f62092y;

    /* renamed from: z, reason: collision with root package name */
    private String f62093z;

    /* renamed from: d, reason: collision with root package name */
    private String f62071d = "";

    /* renamed from: f, reason: collision with root package name */
    private int f62073f = 23;

    /* renamed from: g, reason: collision with root package name */
    private long f62074g = 0;

    /* renamed from: h, reason: collision with root package name */
    private String f62075h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f62076i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f62077j = "";

    /* renamed from: m, reason: collision with root package name */
    private String f62080m = "";

    /* renamed from: n, reason: collision with root package name */
    private String f62081n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f62082o = "";

    /* renamed from: w, reason: collision with root package name */
    private int f62090w = 0;
    private volatile long A = 0;
    private volatile long B = 0;
    private boolean C = false;
    private String E = "";
    private String F = "";
    private ArrayList<i90.d> I = new ArrayList<>();
    private ArrayList<g90.i> J = new ArrayList<>();
    private ArrayList<String> K = new ArrayList<>();
    private final Runnable L = new k();
    private final Runnable M = new m();
    private final Runnable N = new n();
    private final Runnable O = new o();
    private i90.f R = null;
    private int S = 0;
    private int T = 0;
    private boolean U = false;
    public final Runnable V = new j();
    g90.i W = new g90.i() { // from class: me.ele.aiot.sensor.internal.b
        @Override // g90.i
        public final void b(g90.h hVar, c cVar) {
            c.this.lambda$new$13(hVar, cVar);
        }
    };

    /* loaded from: classes4.dex */
    public class a implements i90.e {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62094a;

        a(String str) {
            this.f62094a = str;
        }

        @Override // i90.e
        public void a(EventResult eventResult) {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, eventResult});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, this.f62094a);
            hashMap.put("device_code", c.this.f62078k);
            hashMap.put("error_code", eventResult.getCode());
            k90.b.a("bluetooth_auth_fail", hashMap);
            if (c.this.f62078k.length() >= 3) {
                str = c.this.f62078k.substring(0, 3);
            } else {
                str = "";
            }
            k90.b.b("bluetooth_auth_rate", 0L, str);
            j90.c.a("下发鉴权码指令03 失败 shortResult=" + eventResult);
            w70.a.l().d(c.this.f62089v);
        }

        @Override // i90.e
        public void b(byte[] bArr) {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, bArr});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, this.f62094a);
            hashMap.put("device_code", c.this.f62078k);
            k90.b.a("bluetooth_auth_success", hashMap);
            if (c.this.f62078k.length() >= 3) {
                str = c.this.f62078k.substring(0, 3);
            } else {
                str = "";
            }
            k90.b.b("bluetooth_auth_rate", 1L, str);
            if (bArr.length >= 2) {
                c.this.S = bArr[0];
                c.this.T = bArr[1];
            }
            j90.c.a("下发鉴权码指令03 成功 data =" + l90.a.a(bArr) + "agreementMajorVersion =" + c.this.S + "agreementMinorVersion = " + c.this.T);
            c.this.i1(this.f62094a);
        }
    }

    /* loaded from: classes4.dex */
    public class b implements d.a {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i90.d f62096a;

        b(i90.d dVar) {
            this.f62096a = dVar;
        }

        @Override // i90.d.a
        public void onFinish() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            c cVar = c.this;
            cVar.G0(cVar.I, this.f62096a);
            this.f62096a.c();
        }
    }

    /* renamed from: me.ele.aiot.sensor.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC1136c implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ g90.h f62098n;

        RunnableC1136c(g90.h hVar) {
            this.f62098n = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            Iterator it = new ArrayList(c.this.J).iterator();
            while (it.hasNext()) {
                g90.i iVar = (g90.i) it.next();
                if (iVar != null) {
                    iVar.b(this.f62098n, c.this);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d extends i90.c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        d(c cVar, EventCommand eventCommand, long j12, int i12) {
            super(cVar, eventCommand, j12, i12);
        }

        @Override // i90.c
        public byte[] k() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this});
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public class e extends i90.c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        e(c cVar, EventCommand eventCommand, long j12, int i12) {
            super(cVar, eventCommand, j12, i12);
        }

        @Override // i90.c
        public byte[] k() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this});
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public class f extends i90.c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        f(c cVar, EventCommand eventCommand, long j12, int i12) {
            super(cVar, eventCommand, j12, i12);
        }

        @Override // i90.c
        public byte[] k() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this});
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public class g extends i90.c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        g(c cVar, EventCommand eventCommand, long j12, int i12) {
            super(cVar, eventCommand, j12, i12);
        }

        @Override // i90.c
        public byte[] k() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this});
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public class h extends i90.c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ byte f62104s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ byte[] f62105t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ byte[] f62106u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(c cVar, EventCommand eventCommand, long j12, int i12, byte b12, byte[] bArr, byte[] bArr2) {
            super(cVar, eventCommand, j12, i12);
            this.f62104s = b12;
            this.f62105t = bArr;
            this.f62106u = bArr2;
        }

        @Override // i90.c
        public byte[] k() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this});
            }
            j90.c.a("sendAuthCode id:" + ((int) this.f62104s) + ",authCode:" + Arrays.toString(this.f62105t) + ",token:" + Arrays.toString(this.f62106u));
            return l90.a.h(new byte[]{this.f62104s}, Arrays.copyOfRange(this.f62105t, 0, 8), Arrays.copyOfRange(this.f62106u, 0, 32));
        }
    }

    /* loaded from: classes4.dex */
    public class i implements i90.f {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        i() {
        }

        @Override // i90.f
        public void a(EventResult eventResult) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, eventResult});
                return;
            }
            j90.c.a("getDeviceBluetoothVersion onFail:" + eventResult);
        }

        @Override // i90.f
        public void onSuccess(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, str});
                return;
            }
            j90.c.a("getDeviceBluetoothVersion onSuccess:" + str);
        }
    }

    /* loaded from: classes4.dex */
    public class j implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                c.this.l0();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class k implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                if (c.this.f62072e == null) {
                    return;
                }
                c.this.f62072e.discoverServices();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class l {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62111a;

        static {
            int[] iArr = new int[EventCommand.values().length];
            f62111a = iArr;
            try {
                iArr[EventCommand.TIME_SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62111a[EventCommand.SENSOR_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62111a[EventCommand.BLUETOOTH_CONFIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public class m implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                c.this.Z();
                c.this.onEvent(new e.d());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class n implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else if (c.this.f62069b && c.this.f62072e != null) {
                c.this.a0();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class o implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                c.this.I0(100);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class p extends i90.c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        p(c cVar, EventCommand eventCommand, long j12, int i12) {
            super(cVar, eventCommand, j12, i12);
        }

        @Override // i90.c
        public byte[] k() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : l90.a.o(rf1.c.v() / 1000);
        }
    }

    /* loaded from: classes4.dex */
    public class q implements i90.e {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62116a;

        q(String str) {
            this.f62116a = str;
        }

        @Override // i90.e
        public void a(EventResult eventResult) {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, eventResult});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, this.f62116a);
            hashMap.put("device_code", c.this.f62078k);
            hashMap.put("error_code", eventResult.getCode());
            k90.b.a("bluetooth_sync_time_fail", hashMap);
            if (c.this.f62078k.length() >= 3) {
                str = c.this.f62078k.substring(0, 3);
            } else {
                str = "";
            }
            k90.b.b("bluetooth_sync_time_rate", 0L, str);
            j90.c.a("syncTime onFail:" + eventResult);
        }

        @Override // i90.e
        public void b(byte[] bArr) {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, bArr});
                return;
            }
            j90.c.a("syncTime onSuccess:" + Arrays.toString(bArr));
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, this.f62116a);
            hashMap.put("device_code", c.this.f62078k);
            k90.b.a("bluetooth_sync_time_success", hashMap);
            if (c.this.f62078k.length() >= 3) {
                str = c.this.f62078k.substring(0, 3);
            } else {
                str = "";
            }
            k90.b.b("bluetooth_sync_time_rate", 1L, str);
            c.this.n0();
            if (c.this.f62088u != null) {
                c.this.f62088u.g(this.f62116a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class r extends i90.c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        r(c cVar, EventCommand eventCommand, long j12, int i12) {
            super(cVar, eventCommand, j12, i12);
        }

        @Override // i90.c
        public byte[] k() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this});
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public class s extends x70.d {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        s() {
        }

        @Override // x70.d
        public void e(int i12) {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, c.this.f62079l);
            hashMap.put("device_code", c.this.f62078k);
            k90.b.a("bluetooth_set_mtu_success", hashMap);
            if (c.this.f62078k.length() >= 3) {
                str = c.this.f62078k.substring(0, 3);
            } else {
                str = "";
            }
            k90.b.b("bluetooth_set_mtu_rate", 1L, str);
            c.this.W0(i12);
            j90.c.a("onMtuChanged in -> " + i12);
            c.this.b0();
        }

        @Override // x70.d
        public void f(BleException bleException) {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, bleException});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, c.this.f62079l);
            hashMap.put("device_code", c.this.f62078k);
            hashMap.put("error_code", Integer.valueOf(bleException.getCode()));
            k90.b.a("bluetooth_set_mtu_fail", hashMap);
            if (c.this.f62078k.length() >= 3) {
                str = c.this.f62078k.substring(0, 3);
            } else {
                str = "";
            }
            k90.b.b("bluetooth_set_mtu_rate", 0L, str);
            j90.c.a("onSetMTUFailure in exception=" + bleException);
        }
    }

    /* loaded from: classes4.dex */
    public class t extends x70.e {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* loaded from: classes4.dex */
        public class a implements i90.e {
            private static transient /* synthetic */ ISurgeon $surgeonFlag;

            a() {
            }

            @Override // i90.e
            public void a(EventResult eventResult) {
                String str;
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "2")) {
                    iSurgeon.surgeon$dispatch("2", new Object[]{this, eventResult});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(PhoneInfo.MACADDRESS, c.this.f62079l);
                hashMap.put("device_code", c.this.f62078k);
                hashMap.put("error_code", eventResult.getCode());
                k90.b.a("bluetooth_get_auth_code_fail", hashMap);
                if (c.this.f62078k.length() >= 3) {
                    str = c.this.f62078k.substring(0, 3);
                } else {
                    str = "";
                }
                k90.b.b("bluetooth_get_auth_code_rate", 0L, str);
                j90.c.a("申请授权码指令02 失败 shortResult=" + eventResult);
            }

            @Override // i90.e
            public void b(byte[] bArr) {
                String str;
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    iSurgeon.surgeon$dispatch("1", new Object[]{this, bArr});
                    return;
                }
                if (bArr != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(PhoneInfo.MACADDRESS, c.this.f62079l);
                    hashMap.put("device_code", c.this.f62078k);
                    k90.b.a("bluetooth_get_auth_code_success", hashMap);
                    String str2 = "";
                    if (c.this.f62078k.length() < 3) {
                        str = "";
                    } else {
                        str = c.this.f62078k.substring(0, 3);
                    }
                    k90.b.b("bluetooth_get_auth_code_rate", 1L, str);
                    String i12 = l90.a.i("8c8e18fc924c48ac9f6b2664616863f6", c.this.f62091x);
                    j90.c.a("申请授权码指令02 成功 data =" + l90.a.a(bArr) + "desKey:" + i12);
                    byte[] a12 = l90.c.a(bArr, l90.a.m(i12));
                    if (a12 != null) {
                        c cVar = c.this;
                        if (cVar.f62089v != null) {
                            str2 = c.this.f62089v.getMac();
                        }
                        cVar.W(bArr, a12, str2);
                    }
                    j90.c.a("申请授权码指令02 成功 data =" + l90.a.a(a12));
                }
            }
        }

        t() {
        }

        @Override // x70.e
        public void e(byte[] bArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, bArr});
                return;
            }
            j90.c.a("BleNotifyCallback onCharacteristicChanged data=" + l90.a.a(bArr));
            c.this.A0(bArr);
        }

        @Override // x70.e
        public void f(BleException bleException) {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bleException});
                return;
            }
            j90.c.a("BleNotifyCallback onNotifyFailure");
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, c.this.f62079l);
            hashMap.put("device_code", c.this.f62078k);
            hashMap.put("error_code", Integer.valueOf(bleException.getCode()));
            k90.b.a("bluetooth_notify_fail", hashMap);
            if (c.this.f62078k.length() >= 3) {
                str = c.this.f62078k.substring(0, 3);
            } else {
                str = "";
            }
            k90.b.b("bluetooth_set_notify_rate", 0L, str);
        }

        @Override // x70.e
        public void g() {
            String str;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            j90.c.a("BleNotifyCallback onNotifySuccess");
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, c.this.f62079l);
            hashMap.put("device_code", c.this.f62078k);
            k90.b.a("bluetooth_notify_success", hashMap);
            if (c.this.f62078k.length() >= 3) {
                str = c.this.f62078k.substring(0, 3);
            } else {
                str = "";
            }
            k90.b.b("bluetooth_set_notify_rate", 1L, str);
            c.this.f62070c = true;
            c cVar = c.this;
            cVar.F0(cVar.W);
            c cVar2 = c.this;
            cVar2.V(cVar2.W);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(PhoneInfo.MACADDRESS, c.this.f62079l);
            hashMap2.put("device_code", c.this.f62078k);
            k90.b.a("bluetooth_get_auth_code_start", hashMap2);
            c.this.e0(new a());
        }
    }

    public c(String str, String str2, String str3, int i12, String str4) {
        this.f62078k = "";
        this.f62079l = "";
        this.f62078k = str;
        this.f62079l = str2;
        if (this.H == null) {
            this.H = new me.ele.aiot.sensor.internal.d(str);
        }
        this.f62091x = str3;
        this.f62092y = i12;
        this.f62093z = str4;
    }

    private synchronized void D0(g90.f fVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        boolean z12 = false;
        if (InstrumentAPI.support(iSurgeon, "54")) {
            iSurgeon.surgeon$dispatch("54", new Object[]{this, fVar});
            return;
        }
        try {
            if (fVar.n() == 1) {
                z12 = true;
            }
            this.U = z12;
            me.ele.aiot.sensor.internal.a aVar = this.f62088u;
            if (aVar != null) {
                aVar.c(fVar.j(), fVar.m() / 1000);
                if (fVar.e() > 0) {
                    this.f62088u.onFallOverCallback(fVar.e(), fVar.m());
                }
            }
            j1(1, fVar.h(), fVar.m(), fVar.n(), fVar.c(), fVar.b(), fVar.g(), fVar.j(), fVar.l(), Arrays.toString(fVar.k()), fVar.e(), fVar.o(), fVar.f(), fVar.a(), fVar.i());
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "parsingCoreDataFromEmbedded throwable:" + th2);
        }
    }

    private void E0(g90.g gVar) {
        Context applicationContext;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "53")) {
            iSurgeon.surgeon$dispatch("53", new Object[]{this, gVar});
            return;
        }
        try {
            j90.c.b("kSD_DEVICE_EVENT", "deviceEvent:" + gVar);
            HashMap hashMap = new HashMap();
            hashMap.put(PhoneInfo.MACADDRESS, this.f62079l);
            hashMap.put("device_code", this.f62078k);
            hashMap.put("system_click", Byte.valueOf(gVar.d()));
            hashMap.put("function_click", Byte.valueOf(gVar.b()));
            hashMap.put("key_status", Byte.valueOf(gVar.a()));
            k90.b.a("bluetooth_event", hashMap);
            byte b12 = gVar.b();
            if (b12 != 0) {
                onUpgradeEvent(gVar.e() / 1000, m0(), "buttonEvent", String.valueOf((int) b12), 1L);
            }
            byte f12 = gVar.f();
            if (f12 != 0) {
                onUpgradeEvent(gVar.e() / 1000, m0(), "offlineVoiceEvent", String.valueOf((int) f12), 1L);
            }
            if (l90.d.b("me.ele.hb_ksd", "wakeup_intelligence_enable", true)) {
                if ((gVar.d() != 2 && f12 != 11) || (applicationContext = Application.getApplicationContext()) == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("knight_smart_device_wakeup_intelligence_notification");
                z.a.b(applicationContext).d(intent);
                j90.c.b("kSD_BROADCAST", "sendBroadcast");
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "parsingDeviceEventFromEmbedded throwable:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(ArrayList<i90.d> arrayList, i90.d dVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "48")) {
            iSurgeon.surgeon$dispatch("48", new Object[]{this, arrayList, dVar});
            return;
        }
        try {
            Iterator<i90.d> it = arrayList.iterator();
            while (it.hasNext()) {
                if (dVar == it.next()) {
                    it.remove();
                }
            }
        } catch (Exception e12) {
            j90.c.b("kSD_THROWABLE", "removeFinishedTask exception:" + e12);
        }
    }

    private void H0(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this, Integer.valueOf(i12)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PhoneInfo.MACADDRESS, this.f62079l);
        hashMap.put("device_code", this.f62078k);
        k90.b.a("bluetooth_set_mtu_start", hashMap);
        w70.a.l().A(this.f62089v, i12, new s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(byte[] bArr, byte[] bArr2, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this, bArr, bArr2, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PhoneInfo.MACADDRESS, str);
        hashMap.put("device_code", this.f62078k);
        k90.b.a("bluetooth_auth_start", hashMap);
        if (bArr != null && bArr2 != null) {
            J0((byte) 1, bArr, bArr2, new a(str));
        }
    }

    private void Y() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "43")) {
            iSurgeon.surgeon$dispatch("43", new Object[]{this});
            return;
        }
        try {
            this.H.k();
            Iterator<i90.d> it = this.I.iterator();
            while (it.hasNext()) {
                i90.d next = it.next();
                if (next != null) {
                    next.c();
                }
            }
            this.I.clear();
        } catch (Exception e12) {
            j90.c.a("clean_up" + e12.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "25")) {
            iSurgeon.surgeon$dispatch("25", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PhoneInfo.MACADDRESS, this.f62079l);
        hashMap.put("device_code", this.f62078k);
        k90.b.a("bluetooth_notify_start", hashMap);
        w70.a.l().y(this.f62089v, "4a822a40-cf3a-11e1-9ab4-0002a5d5c52b", "4a822a41-cf3a-11e1-9ab4-0002a5d5c52b", new t());
    }

    private void d1(h90.a aVar, File file, String str, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "58")) {
            iSurgeon.surgeon$dispatch("58", new Object[]{this, aVar, file, str, Integer.valueOf(i12)});
            return;
        }
        if (str.contains("bluetooth")) {
            j90.c.d("bluetooth hardwareVersion:" + o0() + ",bluetoothVersion:" + g0());
            j90.c.d("bluetooth header.hardwareVersion:" + String.format("%d.%d", Byte.valueOf(aVar.c().f53969d), Byte.valueOf(aVar.c().c())) + ",header.softVersion:" + ((int) aVar.c().f53971f) + "." + ((int) aVar.c().f53972g));
            if (!TextUtils.isEmpty(o0()) && !TextUtils.isEmpty(g0())) {
                if (aVar.c() == null) {
                    j90.c.d("bluetooth firmware.getHeader() == null");
                    return;
                }
                if (l90.a.p(o0(), String.format("%d.%d", Byte.valueOf(aVar.c().f53969d), Byte.valueOf(aVar.c().c()))) && l90.a.g(g0(), aVar.c().f53971f, aVar.c().f53972g)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(PhoneInfo.MACADDRESS, p0());
                    hashMap.put("device_code", this.f62078k);
                    k90.b.a("bluetooth_ota_start", hashMap);
                    e1(new i90.a(this, aVar, i12, file, str));
                } else if (file != null) {
                    try {
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Throwable unused) {
                    }
                }
            } else {
                j90.c.d("bluetooth isEmpty");
                return;
            }
        }
        if (str.contains("voice")) {
            j90.c.d("voice hardwareVersion:" + o0() + "header.hardwareVersion:" + String.format("%d.%d", Byte.valueOf(aVar.c().f53969d), Byte.valueOf(aVar.c().c())));
            j90.c.d("voice voiceVersion:" + u0() + "header.voiceVersion:" + ((int) aVar.c().f53971f) + "." + ((int) aVar.c().f53972g));
            if (!TextUtils.isEmpty(o0()) && !TextUtils.isEmpty(u0())) {
                if (aVar.c() == null) {
                    j90.c.g("voice firmware.getHeader() == null");
                    return;
                }
                if (l90.a.p(o0(), String.format("%d.%d", Byte.valueOf(aVar.c().f53969d), Byte.valueOf(aVar.c().c()))) && l90.a.g(u0(), aVar.c().f53971f, aVar.c().f53972g)) {
                    e1(new i90.b(this, aVar, i12, file, str));
                    return;
                } else {
                    if (file != null) {
                        try {
                            if (file.exists()) {
                                file.delete();
                                return;
                            }
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    return;
                }
            }
            j90.c.g("voice isEmpty");
        }
    }

    private void g1(i90.d dVar, boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "47")) {
            iSurgeon.surgeon$dispatch("47", new Object[]{this, dVar, Boolean.valueOf(z12)});
            return;
        }
        dVar.f(new b(dVar));
        if (!this.f62070c && z12) {
            dVar = new i90.g(this, dVar);
        }
        ArrayList<i90.d> arrayList = this.I;
        if (arrayList != null && arrayList.size() > 50) {
            return;
        }
        this.I.add(dVar);
        l90.b.a(X, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PhoneInfo.MACADDRESS, str);
        hashMap.put("device_code", this.f62078k);
        k90.b.a("bluetooth_sync_time_start", hashMap);
        h1(new q(str));
    }

    private void j1(int i12, long j12, long j13, int i13, int i14, int i15, int i16, float f12, float f13, String str, int i17, int i18, int i19, int i22, List<PdrDetailModel> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "55")) {
            iSurgeon.surgeon$dispatch("55", new Object[]{this, Integer.valueOf(i12), Long.valueOf(j12), Long.valueOf(j13), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Float.valueOf(f12), Float.valueOf(f13), str, Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(i22), list});
            return;
        }
        this.G = i15;
        HeartBeatModel heartBeatModel = new HeartBeatModel();
        heartBeatModel.setFrequency(i12);
        heartBeatModel.setCollectIndex(j12);
        heartBeatModel.setCollectTime(j13);
        heartBeatModel.setWearStatus(i13);
        heartBeatModel.setCautionLightMode(i14);
        heartBeatModel.setBattery(i15);
        heartBeatModel.setLightIntensity(i16);
        heartBeatModel.setPressure(f12);
        heartBeatModel.setTemperature(f13);
        heartBeatModel.setRunStatus(str);
        heartBeatModel.setFallOverValue(i17);
        heartBeatModel.setWearingPosture(i18);
        heartBeatModel.setInfraredDetectionState(i19);
        heartBeatModel.setAngle(i22);
        heartBeatModel.setPdrDetailModelList(list);
        heartBeatModel.setDeviceCode(this.f62078k);
        heartBeatModel.setBluetoothVersion(this.f62075h);
        heartBeatModel.setHardwareVersion(this.f62071d);
        heartBeatModel.setCityId(this.f62090w);
        heartBeatModel.setPlatform("Android");
        heartBeatModel.setBleBroadcast(false);
        me.ele.aiot.sensor.internal.a aVar = this.f62088u;
        if (aVar != null) {
            aVar.e(heartBeatModel);
            this.f62088u.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$13(g90.h hVar, c cVar) {
        try {
            onShortEvent(hVar);
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "BleCommunicationImpl handleEvent onEvent:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "78")) {
            iSurgeon.surgeon$dispatch("78", new Object[]{this});
        } else {
            X.postDelayed(this.V, 1000L);
        }
    }

    private boolean y0(Class cls) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "44")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("44", new Object[]{this, cls})).booleanValue();
        }
        Iterator<i90.d> it = this.I.iterator();
        while (it.hasNext()) {
            if (cls.isInstance(it.next().e())) {
                return true;
            }
        }
        return false;
    }

    public void A0(@Nullable byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "33")) {
            iSurgeon.surgeon$dispatch("33", new Object[]{this, bArr});
            return;
        }
        CharacteristicId characteristicId = CharacteristicId.SHORT_RECEIVE;
        g90.h parseEvent = characteristicId.parseEvent(bArr);
        this.H.o(characteristicId);
        if (parseEvent != null) {
            onEvent(parseEvent);
        }
    }

    public void B0(String str, String str2, String str3, String str4, String str5) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "61")) {
            iSurgeon.surgeon$dispatch("61", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        me.ele.aiot.sensor.internal.a aVar = this.f62088u;
        if (aVar != null) {
            aVar.a(str, str2, str3, str4, str5);
        }
    }

    public void C0(String str, String str2, String str3, String str4) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "60")) {
            iSurgeon.surgeon$dispatch("60", new Object[]{this, str, str2, str3, str4});
            return;
        }
        me.ele.aiot.sensor.internal.a aVar = this.f62088u;
        if (aVar != null) {
            aVar.d(str, str2, str3, str4);
        }
    }

    public void F0(g90.i iVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "19")) {
            iSurgeon.surgeon$dispatch("19", new Object[]{this, iVar});
        } else if (iVar != null) {
            this.J.remove(iVar);
        }
    }

    @TargetApi(21)
    public void I0(@IntRange int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this, Integer.valueOf(i12)});
            return;
        }
        X.removeCallbacks(this.N);
        int i13 = 23;
        if (i12 >= 23) {
            i13 = i12;
        }
        if (i12 > 517) {
            i13 = 517;
        }
        H0(i13);
    }

    public void J0(byte b12, byte[] bArr, byte[] bArr2, i90.e eVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "76")) {
            iSurgeon.surgeon$dispatch("76", new Object[]{this, Byte.valueOf(b12), bArr, bArr2, eVar});
        } else {
            this.f62085r = eVar;
            f1(new h(this, EventCommand.SEND_AUTH_CODE, this.f62074g, 0, b12, bArr, bArr2));
        }
    }

    public void K0(BleDevice bleDevice) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "82")) {
            iSurgeon.surgeon$dispatch("82", new Object[]{this, bleDevice});
        } else {
            this.f62089v = bleDevice;
        }
    }

    public void L0(BluetoothGatt bluetoothGatt) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, bluetoothGatt});
        } else {
            this.f62072e = bluetoothGatt;
        }
    }

    public void M0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "62")) {
            iSurgeon.surgeon$dispatch("62", new Object[]{this, str});
        } else {
            this.f62075h = str;
        }
    }

    public void N0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "70")) {
            iSurgeon.surgeon$dispatch("70", new Object[]{this, str});
        } else {
            this.f62081n = str;
        }
    }

    public void O0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "72")) {
            iSurgeon.surgeon$dispatch("72", new Object[]{this, str});
        } else {
            this.f62082o = str;
        }
    }

    public void P0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "74")) {
            iSurgeon.surgeon$dispatch("74", new Object[]{this, str});
        } else {
            this.f62080m = str;
        }
    }

    public void Q0(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.f62090w = i12;
        }
    }

    public void R0(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.f62069b = z12;
        }
    }

    public void S0(me.ele.aiot.sensor.internal.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "81")) {
            iSurgeon.surgeon$dispatch("81", new Object[]{this, aVar});
        } else {
            this.f62088u = aVar;
        }
    }

    public void T0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "66")) {
            iSurgeon.surgeon$dispatch("66", new Object[]{this, str});
        } else {
            this.f62077j = str;
        }
    }

    public void U0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
        } else {
            this.f62071d = str;
        }
    }

    public void V(g90.i iVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, iVar});
        } else if (iVar != null) {
            this.J.add(iVar);
        }
    }

    public void V0(ArrayList<String> arrayList) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, arrayList});
        } else {
            this.K = arrayList;
        }
    }

    public void W0(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.f62073f = i12;
        }
    }

    public void X(i90.f fVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this, fVar});
        } else {
            this.R = fVar;
            f1(new r(this, EventCommand.BLUETOOTH_VERSION, this.f62074g, 0));
        }
    }

    public void X0(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.C = z12;
        }
    }

    public void Y0(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.f62074g = j12;
        }
    }

    public void Z() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            iSurgeon.surgeon$dispatch("17", new Object[]{this});
            return;
        }
        try {
            if (this.f62072e != null && !w0() && !v0()) {
                this.f62072e.close();
                this.f62072e = null;
            }
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "BleCommunicationImpl close" + th2);
        }
    }

    public void Z0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "83")) {
            iSurgeon.surgeon$dispatch("83", new Object[]{this, str});
        } else {
            this.E = str;
        }
    }

    public void a0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this});
            return;
        }
        try {
            this.f62069b = false;
            this.f62070c = false;
            if (this.f62089v != null && w70.a.l().w(this.f62089v)) {
                w70.a.l().d(this.f62089v);
            }
            Y();
        } catch (Throwable th2) {
            j90.c.b("kSD_THROWABLE", "BleCommunicationImpl disconnect" + th2);
        }
    }

    public void a1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "85")) {
            iSurgeon.surgeon$dispatch("85", new Object[]{this, str});
        } else {
            this.F = str;
        }
    }

    public void b1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.D = str;
        }
    }

    public void c0(f90.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "57")) {
            iSurgeon.surgeon$dispatch("57", new Object[]{this, aVar});
        } else if (aVar != null) {
            me.ele.aiot.sensor.internal.d dVar = this.H;
            dVar.l(new a.RunnableC0763a(this.f62072e, dVar, aVar));
            this.H.q(false);
        }
    }

    public void c1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "64")) {
            iSurgeon.surgeon$dispatch("64", new Object[]{this, str});
        } else {
            this.f62076i = str;
        }
    }

    public void d0(boolean z12, f90.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "56")) {
            iSurgeon.surgeon$dispatch("56", new Object[]{this, Boolean.valueOf(z12), aVar});
        } else if (aVar != null) {
            me.ele.aiot.sensor.internal.d dVar = this.H;
            dVar.l(new a.RunnableC0763a(this.f62072e, dVar, aVar));
            this.H.q(z12);
        }
    }

    public void e0(i90.e eVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "75")) {
            iSurgeon.surgeon$dispatch("75", new Object[]{this, eVar});
        } else {
            this.f62084q = eVar;
            f1(new g(this, EventCommand.APPLY_AUTH_CODE, this.f62074g, 0));
        }
    }

    public void e1(i90.d dVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "45")) {
            iSurgeon.surgeon$dispatch("45", new Object[]{this, dVar});
        } else if (dVar != null && !y0(dVar.getClass())) {
            f1(dVar);
        }
    }

    public int f0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "51") ? ((Integer) iSurgeon.surgeon$dispatch("51", new Object[]{this})).intValue() : this.G;
    }

    public void f1(i90.d dVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "46")) {
            iSurgeon.surgeon$dispatch("46", new Object[]{this, dVar});
        } else {
            g1(dVar, true);
        }
    }

    public String g0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "67") ? (String) iSurgeon.surgeon$dispatch("67", new Object[]{this}) : this.f62075h;
    }

    public String h0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "69") ? (String) iSurgeon.surgeon$dispatch("69", new Object[]{this}) : this.f62081n;
    }

    public void h1(i90.e eVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, eVar});
        } else {
            this.f62083p = eVar;
            f1(new p(this, EventCommand.TIME_SYNC, this.f62074g, 0));
        }
    }

    public String i0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "71") ? (String) iSurgeon.surgeon$dispatch("71", new Object[]{this}) : this.f62082o;
    }

    public String j0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "73") ? (String) iSurgeon.surgeon$dispatch("73", new Object[]{this}) : this.f62080m;
    }

    public int k0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Integer) iSurgeon.surgeon$dispatch("2", new Object[]{this})).intValue() : this.f62090w;
    }

    public void k1(byte[] bArr, File file, String str, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "27")) {
            iSurgeon.surgeon$dispatch("27", new Object[]{this, bArr, file, str, Integer.valueOf(i12)});
            return;
        }
        h90.a d12 = h90.a.d(bArr);
        if (d12 != null) {
            d1(d12, file, str, i12);
        }
    }

    public void l0() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "77")) {
            iSurgeon.surgeon$dispatch("77", new Object[]{this});
        } else {
            X(new i());
        }
    }

    public String m0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "68") ? (String) iSurgeon.surgeon$dispatch("68", new Object[]{this}) : this.f62078k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: n */
    public void lambda$onCharacteristicChanged$4(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "32")) {
            iSurgeon.surgeon$dispatch("32", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, bArr});
            return;
        }
        CharacteristicId from = CharacteristicId.from(bluetoothGattCharacteristic);
        if (from != null) {
            g90.h parseEvent = from.parseEvent(bluetoothGattCharacteristic.getValue());
            this.H.o(from);
            if (parseEvent != null) {
                onEvent(parseEvent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: o */
    public void lambda$onCharacteristicRead$2(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr, int i12) {
        g90.h parseEvent;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "30")) {
            iSurgeon.surgeon$dispatch("30", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, bArr, Integer.valueOf(i12)});
            return;
        }
        this.H.p();
        CharacteristicId from = CharacteristicId.from(bluetoothGattCharacteristic);
        if (from != null && (parseEvent = from.parseEvent(bluetoothGattCharacteristic.getValue())) != null) {
            onEvent(parseEvent);
        }
    }

    public String o0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.f62071d;
    }

    public void onEvent(g90.h hVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "49")) {
            iSurgeon.surgeon$dispatch("49", new Object[]{this, hVar});
        } else {
            l90.b.a(X, new RunnableC1136c(hVar));
        }
    }

    @RequiresApi
    public void onShortEvent(g90.h hVar) {
        i90.e eVar;
        ISurgeon iSurgeon = $surgeonFlag;
        boolean z12 = false;
        if (InstrumentAPI.support(iSurgeon, "52")) {
            iSurgeon.surgeon$dispatch("52", new Object[]{this, hVar});
            return;
        }
        if (hVar instanceof g90.a) {
            g90.a aVar = (g90.a) hVar;
            if (this.f62084q != null) {
                if (aVar.b() == EventResult.OP_SUCCESS) {
                    this.f62084q.b(aVar.a());
                } else {
                    this.f62084q.a(aVar.b());
                }
            }
        } else if (hVar instanceof g90.k) {
            g90.k kVar = (g90.k) hVar;
            if (this.f62085r != null) {
                if (kVar.a() == EventResult.OP_SUCCESS) {
                    this.f62085r.b(kVar.b());
                } else {
                    this.f62085r.a(kVar.a());
                }
            }
        } else if (hVar instanceof g90.c) {
            g90.c cVar = (g90.c) hVar;
            int i12 = l.f62111a[cVar.a().ordinal()];
            if (i12 == 1 ? (eVar = this.f62083p) == null : i12 == 2 ? (eVar = this.f62086s) == null : i12 != 3 || (eVar = this.f62087t) == null) {
                eVar = null;
            }
            if (eVar != null) {
                if (cVar.b() == EventResult.OP_SUCCESS) {
                    eVar.b(null);
                } else {
                    eVar.a(cVar.b());
                }
            }
        } else if (hVar instanceof g90.b) {
            g90.b bVar = (g90.b) hVar;
            j90.c.a("onShortEvent1 BluetoothVersionEvent in version = " + bVar);
            this.f62078k = bVar.b();
            U0(bVar.d());
            M0(bVar.a());
            c1(bVar.f());
            T0(bVar.c());
            if (this.R != null) {
                if (bVar.e() == EventResult.OP_SUCCESS) {
                    this.R.onSuccess(bVar.toString());
                } else {
                    this.R.a(bVar.e());
                }
            }
            me.ele.aiot.sensor.internal.a aVar2 = this.f62088u;
            if (aVar2 != null) {
                aVar2.b(this);
            }
        } else {
            if (hVar instanceof g90.j) {
                g90.j jVar = (g90.j) hVar;
                f1(new d(this, EventCommand.HEARTBEAT_EVENT, jVar.d(), 0));
                if (2 == jVar.h()) {
                    if (jVar.i() == 1) {
                        z12 = true;
                    }
                    this.U = z12;
                    j1(5, jVar.d(), jVar.e(), jVar.i(), jVar.k(), jVar.a(), jVar.c(), jVar.f(), 65535.0f, Arrays.toString(jVar.g()), 0, jVar.j(), 0, 65535, null);
                    me.ele.aiot.sensor.internal.a aVar3 = this.f62088u;
                    if (aVar3 != null) {
                        aVar3.c(jVar.f(), jVar.e());
                        return;
                    }
                    return;
                }
                if (1 == jVar.h()) {
                    byte b12 = jVar.b();
                    if (l90.a.f(b12) == 1) {
                        onUpgradeEvent(jVar.e(), m0(), "buttonEvent", "1", 1L);
                        return;
                    }
                    if (l90.a.f(b12) == 2) {
                        onUpgradeEvent(jVar.e(), m0(), "buttonEvent", "2", 1L);
                        return;
                    }
                    if (l90.a.f(b12) == 3) {
                        onUpgradeEvent(jVar.e(), m0(), "buttonEvent", "3", 1L);
                        return;
                    }
                    if (l90.a.f(b12) == 4) {
                        onUpgradeEvent(jVar.e(), m0(), "buttonEvent", "4", 1L);
                        return;
                    }
                    if (l90.a.f(b12) == 5) {
                        onUpgradeEvent(jVar.e(), m0(), "phoneEvent", "5", 1L);
                        return;
                    } else if (l90.a.f(b12) == 6) {
                        onUpgradeEvent(jVar.e(), m0(), "phoneEvent", "6", 1L);
                        return;
                    } else {
                        if (l90.a.f(b12) == 7) {
                            onUpgradeEvent(jVar.e(), m0(), "phoneEvent", "7", 1L);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (hVar instanceof g90.f) {
                try {
                    g90.f fVar = (g90.f) hVar;
                    this.P = fVar;
                    f1(new e(this, fVar.d(), this.P.h(), 0));
                    if (this.A == this.P.h()) {
                        return;
                    }
                    this.A = this.P.h();
                    D0(this.P);
                    return;
                } catch (Throwable th2) {
                    j90.c.a("CoreEvent throwable:" + th2);
                    return;
                }
            }
            if (hVar instanceof g90.g) {
                try {
                    this.Q = (g90.g) hVar;
                    f1(new f(this, EventCommand.DEVICE_EVENT, this.P.h(), 0));
                    if (this.B == this.Q.c()) {
                        return;
                    }
                    E0(this.Q);
                } catch (Throwable th3) {
                    j90.c.a("DeviceEvent throwable:" + th3);
                }
            }
        }
    }

    public void onUpgradeEvent(long j12, String str, String str2, String str3, long j13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "59")) {
            iSurgeon.surgeon$dispatch("59", new Object[]{this, Long.valueOf(j12), str, str2, str3, Long.valueOf(j13)});
            return;
        }
        me.ele.aiot.sensor.internal.a aVar = this.f62088u;
        if (aVar != null) {
            aVar.onUpgradeEvent(j12, str, str2, str3, j13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: p */
    public void lambda$onCharacteristicWrite$3(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "31")) {
            iSurgeon.surgeon$dispatch("31", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, bArr, Integer.valueOf(i12)});
        } else {
            this.H.p();
        }
    }

    public String p0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "87") ? (String) iSurgeon.surgeon$dispatch("87", new Object[]{this}) : this.f62079l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: q */
    public void lambda$onConnectionStateChange$0(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "28")) {
            iSurgeon.surgeon$dispatch("28", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
            return;
        }
        j90.c.a("onConnectionStateChangeSafeonConnectionStateChangeSafe status =" + i12 + "newState=" + i13);
        Handler handler = X;
        handler.removeCallbacks(this.M);
        this.f62069b = false;
        handler.removeCallbacks(this.N);
        if (i13 == 2) {
            if (i12 == 0) {
                this.f62070c = true;
                this.H.p();
                BluetoothGatt bluetoothGatt2 = this.f62072e;
                if (bluetoothGatt2 != null && bluetoothGatt2 != bluetoothGatt) {
                    bluetoothGatt2.disconnect();
                    this.f62072e.close();
                }
                this.f62072e = bluetoothGatt;
                this.L.run();
                onEvent(new e.b());
                return;
            }
            this.f62069b = false;
            this.f62070c = false;
            a0();
            Z();
            Y();
            onEvent(new e.c());
            return;
        }
        if (i13 == 0) {
            handler.removeCallbacks(this.L);
            this.f62070c = false;
            this.f62069b = false;
            a0();
            Z();
            Y();
            onEvent(new e.d());
            if (i12 == 257) {
                l90.f.d();
            }
        }
    }

    public ArrayList<String> q0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (ArrayList) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: r */
    public void lambda$onConnectionUpdated$12(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13, int i14, int i15) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "41")) {
            iSurgeon.surgeon$dispatch("41", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)});
        } else {
            j90.c.a("override onConnectionUpdatedSafe");
            this.H.p();
        }
    }

    public int r0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "42") ? ((Integer) iSurgeon.surgeon$dispatch("42", new Object[]{this})).intValue() : this.f62073f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: s */
    public void lambda$onDescriptorRead$5(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, @Nullable byte[] bArr, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "34")) {
            iSurgeon.surgeon$dispatch("34", new Object[]{this, bluetoothGatt, bluetoothGattDescriptor, bArr, Integer.valueOf(i12)});
        } else {
            this.H.p();
        }
    }

    public String s0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "84") ? (String) iSurgeon.surgeon$dispatch("84", new Object[]{this}) : this.E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: t */
    public void lambda$onDescriptorWrite$6(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, @Nullable byte[] bArr, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "35")) {
            iSurgeon.surgeon$dispatch("35", new Object[]{this, bluetoothGatt, bluetoothGattDescriptor, bArr, Integer.valueOf(i12)});
        } else {
            this.H.p();
        }
    }

    public String t0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "86") ? (String) iSurgeon.surgeon$dispatch("86", new Object[]{this}) : this.F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: u */
    public void lambda$onMtuChanged$9(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "38")) {
            iSurgeon.surgeon$dispatch("38", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
            return;
        }
        j90.c.a("override onMtuChangedSafe");
        this.f62073f = i12;
        this.H.p();
    }

    public String u0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "63") ? (String) iSurgeon.surgeon$dispatch("63", new Object[]{this}) : this.f62076i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: v */
    public void lambda$onPhyRead$10(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13, int i14) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "39")) {
            iSurgeon.surgeon$dispatch("39", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
        } else {
            j90.c.a("override onPhyReadSafe");
            this.H.p();
        }
    }

    public boolean v0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? ((Boolean) iSurgeon.surgeon$dispatch("15", new Object[]{this})).booleanValue() : w70.a.l().w(this.f62089v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: w */
    public void lambda$onPhyUpdate$11(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13, int i14) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "40")) {
            iSurgeon.surgeon$dispatch("40", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
        } else {
            j90.c.a("override onPhyUpdateSafe");
            this.H.p();
        }
    }

    public boolean w0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? ((Boolean) iSurgeon.surgeon$dispatch("13", new Object[]{this})).booleanValue() : this.f62069b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: x */
    public void lambda$onReadRemoteRssi$7(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "36")) {
            iSurgeon.surgeon$dispatch("36", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
        } else {
            this.H.p();
        }
    }

    public int x0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.f62092y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: y */
    public void lambda$onReliableWriteCompleted$8(@NonNull BluetoothGatt bluetoothGatt, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "37")) {
            iSurgeon.surgeon$dispatch("37", new Object[]{this, bluetoothGatt, Integer.valueOf(i12)});
        } else {
            this.H.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // me.ele.aiot.sensor.internal.MainThreadBluetoothGattCallback
    /* renamed from: z */
    public void lambda$onServicesDiscovered$1(@NonNull BluetoothGatt bluetoothGatt, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "29")) {
            iSurgeon.surgeon$dispatch("29", new Object[]{this, bluetoothGatt, Integer.valueOf(i12)});
            return;
        }
        X.removeCallbacks(this.L);
        this.f62069b = false;
        this.f62070c = true;
        this.O.run();
    }

    public boolean z0() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "50") ? ((Boolean) iSurgeon.surgeon$dispatch("50", new Object[]{this})).booleanValue() : this.U;
    }
}
