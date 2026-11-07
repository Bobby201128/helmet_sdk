package me.ele.aiot.home.ui.view;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c80.b;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.alibaba.wireless.security.SecExceptionCode;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.aranger.constant.Constants;
import com.tmall.android.dai.DAIStatusCode;
import ff0.k;
import ff0.m;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import me.ele.aiot.home.ui.model.DeviceInfo;
import me.ele.aiot.home.ui.view.AIOTDevicesMainActivity;
import me.ele.aiot.kernel.bean.DiscoveredBleDeviceBean;
import me.ele.aiot.kernel.bean.KnightSmartDeviceInfoBean;
import me.ele.aiot.kernel.constants.ProductKeyEnum;
import me.ele.crowdsource.aspect.ViewAspect;
import me.ele.hunter.trace.aspect.HBHunterTraceAspect;
import org.android.agoo.common.AgooConstants;
import org.aspectj.lang.a;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public class AIOTDevicesMainActivity extends me.ele.aiot.home.ui.view.b implements d80.d {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private static final /* synthetic */ a.InterfaceC1573a P = null;
    private static final /* synthetic */ a.InterfaceC1573a Q = null;
    private static final /* synthetic */ a.InterfaceC1573a R = null;
    private static final /* synthetic */ a.InterfaceC1573a S = null;
    private static final /* synthetic */ a.InterfaceC1573a T = null;
    private static final /* synthetic */ a.InterfaceC1573a U = null;
    private static final /* synthetic */ a.InterfaceC1573a V = null;
    private static final /* synthetic */ a.InterfaceC1573a W = null;
    private static final /* synthetic */ a.InterfaceC1573a X = null;
    private static final /* synthetic */ a.InterfaceC1573a Y = null;
    private static final /* synthetic */ a.InterfaceC1573a Z = null;

    /* renamed from: a0, reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC1573a f61946a0 = null;

    /* renamed from: b0, reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC1573a f61947b0 = null;
    private ImageView A;
    private View B;
    private View C;
    private View D;
    private View E;
    private RecyclerView F;
    private TextView G;
    private c80.b I;

    /* renamed from: r, reason: collision with root package name */
    private d80.c f61948r;

    /* renamed from: s, reason: collision with root package name */
    private Button f61949s;

    /* renamed from: t, reason: collision with root package name */
    private Button f61950t;

    /* renamed from: u, reason: collision with root package name */
    private Button f61951u;

    /* renamed from: v, reason: collision with root package name */
    private Button f61952v;

    /* renamed from: w, reason: collision with root package name */
    private Button f61953w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f61954x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f61955y;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f61956z;
    private List<DeviceInfo> H = new ArrayList();
    private String J = "";
    private String K = "";
    private g80.b L = null;
    private final String M = "https://chocobo-rush.ele.me/knight-shop/index.html#/";
    i80.g N = new f();
    private BroadcastReceiver O = new g();

    /* loaded from: classes4.dex */
    public class a implements DialogInterface.OnDismissListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, dialogInterface});
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61958o = null;

        static {
            a();
        }

        b() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesMainActivity.java", b.class);
            f61958o = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity$2", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61958o, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
            }
        }
    }

    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61960o = null;

        static {
            a();
        }

        c() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesMainActivity.java", c.class);
            f61960o = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity$3", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61960o, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
                return;
            }
            h80.a.a().b("event_unbind_smart_device", "onClick event of unbind smart device");
            if (AIOTDevicesMainActivity.this.f61948r != null) {
                AIOTDevicesMainActivity.this.f61948r.b(AIOTDevicesMainActivity.this.J, AIOTDevicesMainActivity.this.K);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f61962n;

        d(List list) {
            this.f61962n = list;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NotifyDataSetChanged"})
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            List list = this.f61962n;
            if (list == null) {
                return;
            }
            if (list.isEmpty()) {
                this.f61962n.add(new DeviceInfo(ProductKeyEnum.NONE.getProductTypeKey(), "智能无忧·准时送达", true));
            }
            AIOTDevicesMainActivity.this.I.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61964o = null;

        static {
            a();
        }

        e() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesMainActivity.java", e.class);
            f61964o = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity$5", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61964o, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
            } else {
                AIOTDevicesMainActivity.this.C.setVisibility(8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class f implements i80.g {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        f() {
        }

        @Override // i80.g
        public void a(List<DiscoveredBleDeviceBean> list) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, list});
            }
        }

        @Override // i80.g
        public void b(List<KnightSmartDeviceInfoBean> list) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, list});
                return;
            }
            AIOTDevicesMainActivity.this.H.clear();
            if (list != null && list.size() > 0) {
                Log.d("AIOTDevice", "onBindDeviceCallBack: " + list);
                for (KnightSmartDeviceInfoBean knightSmartDeviceInfoBean : list) {
                    AIOTDevicesMainActivity.this.H.add(new DeviceInfo(knightSmartDeviceInfoBean.getDeviceCode(), knightSmartDeviceInfoBean.getProductTypeKey(), knightSmartDeviceInfoBean.getProductTypeKeyDesc(), knightSmartDeviceInfoBean.getMacAddress(), knightSmartDeviceInfoBean.isConnected(), knightSmartDeviceInfoBean.getPowerBattery(), knightSmartDeviceInfoBean.isWearComplete(), false));
                }
            } else {
                Log.d("AIOTDevice", "onBindDeviceCallBack is null");
            }
            AIOTDevicesMainActivity aIOTDevicesMainActivity = AIOTDevicesMainActivity.this;
            aIOTDevicesMainActivity.N1(aIOTDevicesMainActivity.H);
            Log.d("AIOTDevice", "onBindDeviceCallBack :" + AIOTDevicesMainActivity.this.H.toString());
        }
    }

    /* loaded from: classes4.dex */
    public class g extends BroadcastReceiver {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61967b = null;

        static {
            a();
        }

        g() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesMainActivity.java", g.class);
            f61967b = cVar.i("method-execution", cVar.h("1", "onReceive", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity$8", "android.content.Context:android.content.Intent", "context:intent", "", Constants.VOID), 0);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            org.aspectj.lang.a f12 = jl1.c.f(f61967b, this, this, context, intent);
            try {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    iSurgeon.surgeon$dispatch("1", new Object[]{this, context, intent});
                } else {
                    intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                }
            } finally {
                HBHunterTraceAspect.aspectOf().handleOnReceive(f12);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class h implements g80.c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        h() {
        }
    }

    static {
        ajc$preClinit();
    }

    private void K1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this});
            return;
        }
        this.F = (RecyclerView) findViewById(k.N5);
        c80.b bVar = new c80.b(this, this.H, new b.c() { // from class: f80.h
            @Override // c80.b.c
            public final void a(DeviceInfo deviceInfo) {
                AIOTDevicesMainActivity.this.lambda$initAdapter$15(deviceInfo);
            }
        }, q80.g.x0(getApplication()).y0());
        this.I = bVar;
        this.F.setAdapter(bVar);
        this.F.setLayoutManager(new LinearLayoutManager(this));
    }

    private void L1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this});
            return;
        }
        e80.c cVar = new e80.c(this);
        this.f61948r = cVar;
        p1(cVar);
    }

    private void M1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this});
            return;
        }
        this.B = findViewById(k.Q1);
        this.f61949s = (Button) findViewById(k.P1);
        this.f61950t = (Button) findViewById(k.N1);
        this.C = findViewById(k.Tj);
        this.f61951u = (Button) findViewById(k.Sj);
        this.G = (TextView) findViewById(k.Uj);
        this.f61954x = (ImageView) findViewById(k.R1);
        this.f61952v = (Button) findViewById(k.Vj);
        this.f61953w = (Button) findViewById(k.Wj);
        this.f61955y = (ImageView) findViewById(k.M1);
        this.f61956z = (ImageView) findViewById(k.L1);
        this.D = findViewById(k.O1);
        this.E = findViewById(k.Rj);
        this.A = (ImageView) findViewById(k.f49368fh);
        K1();
        this.f61949s.setOnClickListener(new View.OnClickListener() { // from class: f80.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$3(view);
            }
        });
        this.f61950t.setOnClickListener(new View.OnClickListener() { // from class: f80.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$4(view);
            }
        });
        this.f61951u.setOnClickListener(new View.OnClickListener() { // from class: f80.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$5(view);
            }
        });
        this.f61954x.setOnClickListener(new View.OnClickListener() { // from class: f80.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$6(view);
            }
        });
        this.f61955y.setOnClickListener(new View.OnClickListener() { // from class: f80.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$7(view);
            }
        });
        this.f61956z.setOnClickListener(new View.OnClickListener() { // from class: f80.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$8(view);
            }
        });
        this.f61952v.setOnClickListener(new View.OnClickListener() { // from class: f80.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$9(view);
            }
        });
        this.f61953w.setOnClickListener(new View.OnClickListener() { // from class: f80.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$10(view);
            }
        });
        this.B.setOnClickListener(new View.OnClickListener() { // from class: f80.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$11(view);
            }
        });
        this.D.setOnClickListener(new View.OnClickListener() { // from class: f80.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.lambda$initViews$12(view);
            }
        });
        this.E.setOnClickListener(new View.OnClickListener() { // from class: f80.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.lambda$initViews$13(view);
            }
        });
        this.A.setOnClickListener(new View.OnClickListener() { // from class: f80.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesMainActivity.this.lambda$initViews$14(view);
            }
        });
        this.H.clear();
        N1(this.H);
        if (!ql1.c.c().j(this)) {
            ql1.c.c().q(this);
        }
    }

    private void P1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this});
            return;
        }
        try {
            g80.a.o0().u0("确认解绑此设备？").z0("确认解绑", new c()).v0(ILocalizationService.CANCEL, new b()).r0(true).s0(true).q0(true).y0(new a()).show(getSupportFragmentManager(), ".ui.view.AIOTDevicesMainActivity");
        } catch (Exception e12) {
            Log.d("AIOTDevice", "showReComfirmUnBindDialog Exception: " + e12);
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        jl1.c cVar = new jl1.c("AIOTDevicesMainActivity.java", AIOTDevicesMainActivity.class);
        P = cVar.i("method-call", cVar.h("1", "show", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 346);
        Q = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$14", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 180);
        Z = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$5", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 127);
        f61946a0 = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$4", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 122);
        f61947b0 = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$3", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 118);
        R = cVar.i("method-execution", cVar.h("100a", "lambda$initViews$13", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 177);
        S = cVar.i("method-execution", cVar.h("100a", "lambda$initViews$12", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 173);
        T = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$11", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 168);
        U = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$10", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 159);
        V = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$9", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), DAIStatusCode.WALLE_CODE_ERROR_TASK_COUNT_EX);
        W = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$8", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), 145);
        X = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$7", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), SecExceptionCode.SEC_ERROR_INIT_PLUGIN_CLASS_ERROR);
        Y = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$6", "me.ele.aiot.home.ui.view.AIOTDevicesMainActivity", "android.view.View", "v", "", Constants.VOID), SecExceptionCode.SEC_ERROR_INIT_NAME_VERSION_REVERSE_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAdapter$15(DeviceInfo deviceInfo) {
        if (deviceInfo.isGuide()) {
            try {
                me.ele.router.b.b(this, "lpd://web?absoluteURL=" + URLEncoder.encode("https://chocobo-rush.ele.me/knight-shop/index.html#/", "UTF-8"));
                return;
            } catch (Throwable th2) {
                j90.c.b("KNIGHT_SMART_DEVICE_THROWABLE", "lpd://mall:" + th2);
                return;
            }
        }
        O1(deviceInfo.getDeviceCode(), deviceInfo.getMacAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$10(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(U, this, this, view));
        try {
            h80.a.a().c("event_tryout_click", q80.g.x0(getApplication()).y0());
            me.ele.router.b.b(this, "lpd://nui_experience");
            this.C.setVisibility(8);
        } catch (Throwable th2) {
            j90.c.b("KNIGHT_SMART_DEVICE_THROWABLE", "toGuideBtn.setOnClickListener:" + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$11(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(T, this, this, view));
        this.B.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initViews$12(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(S, null, null, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initViews$13(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(R, null, null, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$14(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(Q, this, this, view));
        h80.a.a().b("event_smart_device_help", "onClick event of go to help page");
        startActivity(new Intent(this, (Class<?>) AIOTDevicesHelpActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$3(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(f61947b0, this, this, view));
        this.B.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$4(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(f61946a0, this, this, view));
        h80.a.a().c("event_smarthelmetentrance_click", q80.g.x0(getApplication()).y0());
        this.B.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$5(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(Z, this, this, view));
        this.C.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$6(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(Y, this, this, view));
        h80.a.a().c("event_scanbind_click", q80.g.x0(getApplication()).y0());
        Intent intent = new Intent(this, (Class<?>) AIOTDevicesBindActivity.class);
        intent.putExtra("deviceCodeInputType", "QrCode");
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$7(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(X, this, this, view));
        h80.a.a().c("event_manualbind_click", q80.g.x0(getApplication()).y0());
        Intent intent = new Intent(this, (Class<?>) AIOTDevicesBindActivity.class);
        intent.putExtra("deviceCodeInputType", "Input");
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$8(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(W, this, this, view));
        h80.a.a().c("event_bluetoothbind_click", q80.g.x0(getApplication()).y0());
        Intent intent = new Intent(this, (Class<?>) AIOTDevicesBindActivity.class);
        intent.putExtra("deviceCodeInputType", "bluetoothScan");
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$9(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(V, this, this, view));
        h80.a.a().c("event_unbind_click", q80.g.x0(getApplication()).y0());
        P1();
        this.C.setVisibility(8);
    }

    public void N1(List<DeviceInfo> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this, list});
        } else {
            runOnUiThread(new d(list));
        }
    }

    public void O1(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str, str2});
            return;
        }
        this.C.setVisibility(0);
        this.G.setText("针对“" + str + "”操作");
        this.J = str;
        this.K = str2;
        this.C.setOnClickListener(new e());
    }

    @Override // d80.d
    public void a0(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, str, str2});
            return;
        }
        this.C.setVisibility(8);
        q80.g.x0(getApplication()).R0(str, str2);
        q80.g.x0(getApplication()).K0();
    }

    @Override // d80.d
    public void g1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
        } else {
            this.C.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.c, androidx.core.app.f, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(m.f50477z);
        l1("智能头戴设备");
        M1();
        L1();
        q80.g.x0(getApplication()).Z(this.N);
        n1(this.O);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.home.ui.view.b, androidx.appcompat.app.c, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (ql1.c.c().j(this)) {
            ql1.c.c().s(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(k80.b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, bVar});
            return;
        }
        if (ql1.c.c().j(this)) {
            ql1.c.c().s(this);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this});
            return;
        }
        super.onPause();
        this.B.setVisibility(8);
        q80.g.x0(getApplication()).Q0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this});
            return;
        }
        super.onResume();
        q80.g.x0(getApplication()).Z(this.N);
        q80.g.x0(getApplication()).K0();
        this.B.setVisibility(8);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(k80.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            iSurgeon.surgeon$dispatch("15", new Object[]{this, aVar});
            return;
        }
        if (aVar == null) {
            return;
        }
        try {
            Log.d("AIOTDevice", "showBindedSuccess get event: ");
            new g80.d(new h(), aVar.a()).show(getSupportFragmentManager(), ".ui.view.AIOTDevicesMainActivity");
        } catch (Throwable th2) {
            Log.d("AIOTDevice", "showBindedSuccess Exception: " + th2);
        }
    }
}
