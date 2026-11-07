package me.ele.aiot.home.ui.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c80.d;
import c80.f;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.accs.flowcontrol.FlowControl;
import com.taobao.aranger.constant.Constants;
import ff0.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimerTask;
import me.ele.aiot.home.http.bean.QueryDeviceInfoByMacAddressResponse;
import me.ele.aiot.home.ui.model.Setting;
import me.ele.aiot.home.ui.view.AIOTDevicesBindActivity;
import me.ele.crowdsource.aspect.DialogAspect;
import me.ele.crowdsource.aspect.ViewAspect;
import me.ele.foundation.Application;
import me.ele.hunter.trace.aspect.HBHunterTraceAspect;
import me.ele.location.newcustomlocation.LocationConstants;
import me.ele.lpdcamera.widget.AliScanView;
import org.android.agoo.common.AgooConstants;
import org.aspectj.lang.a;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public class AIOTDevicesBindActivity extends me.ele.aiot.home.ui.view.b implements d80.b {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private static final /* synthetic */ a.InterfaceC1573a K = null;
    private static final /* synthetic */ a.InterfaceC1573a L = null;
    private static final /* synthetic */ a.InterfaceC1573a M = null;
    private static final /* synthetic */ a.InterfaceC1573a N = null;
    private static final /* synthetic */ a.InterfaceC1573a O = null;
    private static final /* synthetic */ a.InterfaceC1573a P = null;
    private static final /* synthetic */ a.InterfaceC1573a Q = null;
    private String A;
    private View B;
    private View C;
    private RecyclerView D;
    private RecyclerView E;
    private c80.d F;
    private c80.f G;

    /* renamed from: r, reason: collision with root package name */
    private d80.a f61903r;

    /* renamed from: s, reason: collision with root package name */
    protected FrameLayout f61904s;

    /* renamed from: t, reason: collision with root package name */
    protected AliScanView f61905t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f61906u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f61907v;

    /* renamed from: w, reason: collision with root package name */
    private ProgressBar f61908w;

    /* renamed from: x, reason: collision with root package name */
    private HashMap<String, Long> f61909x = new HashMap<>();

    /* renamed from: y, reason: collision with root package name */
    private g80.b f61910y = null;

    /* renamed from: z, reason: collision with root package name */
    private g80.b f61911z = null;
    private List<Setting> H = new ArrayList();
    private List<QueryDeviceInfoByMacAddressResponse.ContentData> I = new ArrayList();
    private BroadcastReceiver J = new g();

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f61912n;

        a(List list) {
            this.f61912n = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            AIOTDevicesBindActivity.this.I.clear();
            List list = this.f61912n;
            if (list != null && list.size() > 0) {
                AIOTDevicesBindActivity.this.I.addAll(this.f61912n);
            }
            AIOTDevicesBindActivity.this.f61907v.setEnabled(true);
            AIOTDevicesBindActivity.this.f61908w.setVisibility(4);
            AIOTDevicesBindActivity.this.M1();
        }
    }

    /* loaded from: classes4.dex */
    public class b implements DialogInterface.OnDismissListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, dialogInterface});
                return;
            }
            AliScanView aliScanView = AIOTDevicesBindActivity.this.f61905t;
            if (aliScanView != null) {
                aliScanView.b();
            }
            AIOTDevicesBindActivity.this.M1();
        }
    }

    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61915o = null;

        static {
            a();
        }

        c() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", c.class);
            f61915o = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity$12", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61915o, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
                return;
            }
            AliScanView aliScanView = AIOTDevicesBindActivity.this.f61905t;
            if (aliScanView != null) {
                aliScanView.b();
            }
            AIOTDevicesBindActivity.this.M1();
        }
    }

    /* loaded from: classes4.dex */
    public class d implements DialogInterface.OnDismissListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, dialogInterface});
                return;
            }
            AliScanView aliScanView = AIOTDevicesBindActivity.this.f61905t;
            if (aliScanView != null) {
                aliScanView.b();
            }
            AIOTDevicesBindActivity.this.M1();
        }
    }

    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61918p = null;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f61919n;

        static {
            a();
        }

        e(String str) {
            this.f61919n = str;
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", e.class);
            f61918p = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity$14", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61918p, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
            } else if (AIOTDevicesBindActivity.this.f61903r != null) {
                AIOTDevicesBindActivity.this.f61903r.a(this.f61919n);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61921o = null;

        static {
            a();
        }

        f() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", f.class);
            f61921o = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity$15", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61921o, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
                return;
            }
            AliScanView aliScanView = AIOTDevicesBindActivity.this.f61905t;
            if (aliScanView != null) {
                aliScanView.b();
            }
            AIOTDevicesBindActivity.this.M1();
        }
    }

    /* loaded from: classes4.dex */
    public class g extends BroadcastReceiver {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61923b = null;

        static {
            a();
        }

        g() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", g.class);
            f61923b = cVar.i("method-execution", cVar.h("1", "onReceive", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity$16", "android.content.Context:android.content.Intent", "context:intent", "", Constants.VOID), 0);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            org.aspectj.lang.a f12 = jl1.c.f(f61923b, this, this, context, intent);
            try {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "1")) {
                    iSurgeon.surgeon$dispatch("1", new Object[]{this, context, intent});
                } else {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                    if (intExtra != 10) {
                        if (intExtra == 12) {
                            AIOTDevicesBindActivity.this.U1(true);
                        }
                    } else {
                        AIOTDevicesBindActivity.this.U1(false);
                        if (AIOTDevicesBindActivity.this.G != null) {
                            AIOTDevicesBindActivity.this.G.notifyDataSetChanged();
                        }
                    }
                }
            } finally {
                HBHunterTraceAspect.aspectOf().handleOnReceive(f12);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class h extends TimerTask {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            try {
                AIOTDevicesBindActivity.this.G0(null);
                AIOTDevicesBindActivity.this.f61908w.setVisibility(8);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class i implements e81.d {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        i() {
        }

        @Override // e81.d
        public void a(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
            } else {
                AIOTDevicesBindActivity.this.G1(str);
            }
        }

        @Override // e81.d
        public /* synthetic */ void b(boolean z12) {
            e81.c.a(this, z12);
        }

        @Override // e81.d
        public void c(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, str});
                return;
            }
            Log.e("qrcode_open_camera", "errMsg:" + str);
        }

        @Override // e81.d
        public /* synthetic */ void d(e81.f fVar) {
            e81.c.c(this, fVar);
        }

        @Override // e81.d
        public /* synthetic */ void e(e81.f fVar, String str) {
            e81.c.b(this, fVar, str);
        }
    }

    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61927p = null;

        /* renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61928q = null;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ g80.b f61929n;

        static {
            a();
        }

        j(g80.b bVar) {
            this.f61929n = bVar;
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", j.class);
            f61927p = cVar.i("method-call", cVar.h("1", "dismiss", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 374);
            f61928q = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity$4", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61928q, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
                return;
            }
            g80.b bVar = this.f61929n;
            DialogAspect.aspectOf().hookDismiss(jl1.c.d(f61927p, this, bVar));
            bVar.dismiss();
            AIOTDevicesBindActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    public class k extends TimerTask {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ EditText f61931n;

        k(EditText editText) {
            this.f61931n = editText;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            try {
                ((InputMethodManager) this.f61931n.getContext().getSystemService("input_method")).showSoftInput(this.f61931n, 0);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61933p = null;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ EditText f61934n;

        static {
            a();
        }

        l(EditText editText) {
            this.f61934n = editText;
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", l.class);
            f61933p = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity$6", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61933p, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
            } else if (AIOTDevicesBindActivity.this.f61903r != null) {
                AIOTDevicesBindActivity.this.f61903r.c(this.f61934n.getText().toString(), me.ele.aiot.home.utils.Constants.f61973a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class m implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61936o = null;

        static {
            a();
        }

        m() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", m.class);
            f61936o = cVar.i("method-call", cVar.h("1", "dismiss", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 430);
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else if (AIOTDevicesBindActivity.this.f61910y != null && AIOTDevicesBindActivity.this.f61910y.isShowing()) {
                g80.b bVar = AIOTDevicesBindActivity.this.f61910y;
                DialogAspect.aspectOf().hookDismiss(jl1.c.d(f61936o, this, bVar));
                bVar.dismiss();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61938o = null;

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61939p = null;

        static {
            a();
        }

        n() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", n.class);
            f61938o = cVar.i("method-call", cVar.h("1", "dismiss", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 456);
            f61939p = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity$8", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61939p, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
                return;
            }
            AIOTDevicesBindActivity.this.finish();
            g80.b bVar = AIOTDevicesBindActivity.this.f61911z;
            DialogAspect.aspectOf().hookDismiss(jl1.c.d(f61938o, this, bVar));
            bVar.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    public class o implements View.OnClickListener {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61941o = null;

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ a.InterfaceC1573a f61942p = null;

        static {
            a();
        }

        o() {
        }

        private static /* synthetic */ void a() {
            jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", o.class);
            f61941o = cVar.i("method-call", cVar.h("1", "dismiss", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 464);
            f61942p = cVar.i("method-execution", cVar.h("1", "onClick", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity$9", "android.view.View", "v", "", Constants.VOID), 0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewAspect.aspectOf().hookOnClick(jl1.c.e(f61942p, this, this, view));
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, view});
                return;
            }
            AIOTDevicesBindActivity.this.F1();
            g80.b bVar = AIOTDevicesBindActivity.this.f61911z;
            DialogAspect.aspectOf().hookDismiss(jl1.c.d(f61941o, this, bVar));
            bVar.dismiss();
        }
    }

    static {
        ajc$preClinit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("9", new Object[]{this})).booleanValue();
        }
        if (ContextCompat.checkSelfPermission(Application.getApplicationContext(), "android.permission.CAMERA") == 0 && ContextCompat.checkSelfPermission(Application.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 && ContextCompat.checkSelfPermission(Application.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            J1();
        } else {
            androidx.core.app.a.f(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.CAMERA"}, 0);
        }
        return true;
    }

    private void H1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this});
            return;
        }
        this.D = (RecyclerView) findViewById(ff0.k.f49672nr);
        c80.d dVar = new c80.d(this, this.I, new d.a() { // from class: f80.c
            @Override // c80.d.a
            public final void a(QueryDeviceInfoByMacAddressResponse.ContentData contentData, ProgressBar progressBar) {
                AIOTDevicesBindActivity.this.lambda$initAdapter$18(contentData, progressBar);
            }
        });
        this.F = dVar;
        this.D.setAdapter(dVar);
        this.D.setLayoutManager(new LinearLayoutManager(this));
        androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(this.D.getContext(), 1);
        iVar.f(getResources().getDrawable(ff0.j.C6));
        this.D.m(iVar);
        this.E = (RecyclerView) findViewById(ff0.k.W1);
        c80.f fVar = new c80.f(this, this.H, new f.a() { // from class: f80.d
            @Override // c80.f.a
            public final void a(Setting setting) {
                AIOTDevicesBindActivity.this.lambda$initAdapter$19(setting);
            }
        });
        this.G = fVar;
        this.E.setAdapter(fVar);
        this.E.setLayoutManager(new LinearLayoutManager(this));
    }

    private void I1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this});
            return;
        }
        e80.b bVar = new e80.b(this);
        this.f61903r = bVar;
        p1(bVar);
        if ("bluetoothScan".equals(this.A)) {
            this.f61903r.d(getApplication());
        }
    }

    private void J1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this});
            return;
        }
        try {
            AliScanView aliScanView = this.f61905t;
            if (aliScanView != null) {
                aliScanView.onResume();
                return;
            }
            AliScanView aliScanView2 = new AliScanView(this);
            this.f61905t = aliScanView2;
            aliScanView2.setOnScanListener(new i());
            this.f61905t.setBorderColor(Color.parseColor("#FF5F00"));
            this.f61905t.i(103, "请对准二维码扫描", 0);
            this.f61904s.addView(this.f61905t);
            Q1();
        } catch (Exception e12) {
            Log.d("TEST", "Exception: " + e12.toString());
        }
    }

    private void K1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this});
            return;
        }
        this.f61906u = (ImageView) findViewById(ff0.k.f49949v8);
        this.f61904s = (FrameLayout) findViewById(ff0.k.Nm);
        this.B = findViewById(ff0.k.V1);
        this.f61907v = (TextView) findViewById(ff0.k.K1);
        this.f61908w = (ProgressBar) findViewById(ff0.k.J1);
        this.C = findViewById(ff0.k.U1);
        if ("bluetoothScan".equals(this.A)) {
            H1();
            U1(me.ele.aiot.home.utils.a.c());
        } else {
            this.B.setVisibility(8);
            this.C.setVisibility(8);
        }
        this.f61906u.setOnClickListener(new View.OnClickListener() { // from class: f80.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIOTDevicesBindActivity.this.lambda$initViews$16(view);
            }
        });
        if (!ql1.c.c().j(this)) {
            ql1.c.c().q(this);
        }
    }

    private boolean L1(PackageManager packageManager) {
        FeatureInfo[] systemAvailableFeatures;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("14", new Object[]{this, packageManager})).booleanValue();
        }
        if (packageManager != null && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo != null && "android.hardware.camera.flash".equals(featureInfo.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this});
            return;
        }
        c80.d dVar = this.F;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    private void N1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this});
        } else {
            new me.ele.td.lib.wrapper.i(pf1.b.d("AIOTDevicesBindActivity"), "unknown").schedule(new h(), LocationConstants.NEED_GET_NET_LOCATION_TIME);
        }
    }

    private void Q1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this});
        } else if (L1(getApplicationContext().getPackageManager()) && "QrCode".equals(this.A) && this.f61905t != null) {
            this.f61906u.setVisibility(0);
        } else {
            this.f61906u.setVisibility(8);
        }
    }

    private void R1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            iSurgeon.surgeon$dispatch("17", new Object[]{this});
            return;
        }
        g80.b bVar = new g80.b(this, r.F, ff0.m.K0);
        Window window = bVar.getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        DialogAspect.aspectOf().hookShow(jl1.c.d(M, this, bVar));
        bVar.show();
        bVar.setCanceledOnTouchOutside(false);
        ((Button) bVar.findViewById(ff0.k.f49431h6)).setOnClickListener(new j(bVar));
        Button button = (Button) bVar.findViewById(ff0.k.f49468i6);
        EditText editText = (EditText) bVar.findViewById(ff0.k.f49503j6);
        editText.setFocusable(true);
        editText.setFilterTouchesWhenObscured(true);
        editText.requestFocus();
        new me.ele.td.lib.wrapper.i(pf1.b.d("AIOTDevicesBindActivity"), "unknown").schedule(new k(editText), 300L);
        button.setOnClickListener(new l(editText));
    }

    private void S1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "19")) {
            iSurgeon.surgeon$dispatch("19", new Object[]{this, str});
            return;
        }
        if (this.f61911z == null) {
            this.f61911z = new g80.b(this, r.f51035h, ff0.m.M0);
        }
        Window window = this.f61911z.getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        g80.b bVar = this.f61911z;
        DialogAspect.aspectOf().hookShow(jl1.c.d(O, this, bVar));
        bVar.show();
        Button button = (Button) this.f61911z.findViewById(ff0.k.f49651n6);
        Button button2 = (Button) this.f61911z.findViewById(ff0.k.f49688o6);
        button.setOnClickListener(new n());
        button2.setOnClickListener(new o());
    }

    private void T1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, str});
            return;
        }
        if (this.f61910y == null) {
            this.f61910y = new g80.b(this, r.f51035h, ff0.m.R0);
        }
        Window window = this.f61910y.getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        g80.b bVar = this.f61910y;
        DialogAspect.aspectOf().hookShow(jl1.c.d(N, this, bVar));
        bVar.show();
        ((TextView) this.f61910y.findViewById(ff0.k.Do)).setText(str);
        new me.ele.td.lib.wrapper.e().postDelayed(new m(), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, Boolean.valueOf(z12)});
            return;
        }
        if (z12) {
            this.C.setVisibility(8);
            this.B.setVisibility(0);
            this.f61907v.setOnClickListener(new View.OnClickListener() { // from class: f80.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AIOTDevicesBindActivity.this.lambda$showScanBluetoothList$17(view);
                }
            });
        } else {
            this.B.setVisibility(8);
            this.C.setVisibility(0);
            this.G.notifyDataSetChanged();
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        jl1.c cVar = new jl1.c("AIOTDevicesBindActivity.java", AIOTDevicesBindActivity.class);
        K = cVar.i("method-call", cVar.h("1", "dismiss", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 278);
        L = cVar.i("method-call", cVar.h("1", "dismiss", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 282);
        M = cVar.i("method-call", cVar.h("1", "show", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 367);
        N = cVar.i("method-call", cVar.h("1", "show", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), FlowControl.STATUS_FLOW_CTRL_ALL);
        O = cVar.i("method-call", cVar.h("1", "show", "me.ele.aiot.home.ui.view.widget.CustomDialog", "", "", "", Constants.VOID), 448);
        P = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$showScanBluetoothList$17", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity", "android.view.View", "v", "", Constants.VOID), 151);
        Q = cVar.i("method-execution", cVar.h(Constant.LOCAL_DISPATCH_TIMEOUT, "lambda$initViews$16", "me.ele.aiot.home.ui.view.AIOTDevicesBindActivity", "android.view.View", "v", "", Constants.VOID), 135);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAdapter$18(QueryDeviceInfoByMacAddressResponse.ContentData contentData, ProgressBar progressBar) {
        O1(contentData.getDeviceCode(), progressBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAdapter$19(Setting setting) {
        P1(setting.isEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$16(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(Q, this, this, view));
        AliScanView aliScanView = this.f61905t;
        if (aliScanView != null) {
            boolean g12 = aliScanView.g();
            h80.a.a().b("event_flashlight_turn", "onClick event turn on or turn off the light isOn = " + g12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showScanBluetoothList$17(View view) {
        ViewAspect.aspectOf().hookOnlickLambda(jl1.c.e(P, this, this, view));
        if (this.f61903r != null) {
            this.f61907v.setEnabled(false);
            this.f61908w.setVisibility(0);
            this.f61903r.d(getApplication());
            N1();
        }
    }

    @Override // d80.b
    public void G0(List<QueryDeviceInfoByMacAddressResponse.ContentData> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this, list});
        } else {
            runOnUiThread(new a(list));
        }
    }

    public void G1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.toUpperCase().trim();
            Log.d("AIOTDevice", "scanResult:" + trim);
            Long l12 = this.f61909x.get(trim);
            if (l12 != null && SystemClock.elapsedRealtime() - l12.longValue() < 3000) {
                this.f61905t.b();
                return;
            }
            this.f61909x.put(trim, Long.valueOf(SystemClock.elapsedRealtime()));
            d80.a aVar = this.f61903r;
            if (aVar != null) {
                aVar.c(trim, me.ele.aiot.home.utils.Constants.f61973a);
            }
        }
    }

    public void O1(String str, ProgressBar progressBar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this, str, progressBar});
            return;
        }
        progressBar.setVisibility(0);
        d80.a aVar = this.f61903r;
        if (aVar != null) {
            aVar.c(str, me.ele.aiot.home.utils.Constants.f61973a);
        }
    }

    public void P1(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, Boolean.valueOf(z12)});
        } else if (z12) {
            T1("蓝牙已开启");
        } else {
            me.ele.aiot.home.utils.a.a(this);
        }
    }

    @Override // d80.b
    public void W(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this, str});
            return;
        }
        h80.a.a().b("event_binded_dialog_show", "show bind result fail message. message is " + str);
        M1();
    }

    @Override // d80.b
    public void b(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this, str});
            return;
        }
        h80.a.a().b("event_binded_dialog_show", "show bind result message. message is success");
        T1("绑定成功");
        M1();
        ql1.c.c().l(new k80.a(str));
        Log.d("AIOTDevice", "showBindedSuccess post event: ");
        finish();
    }

    @Override // d80.b
    public void c0(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "25")) {
            iSurgeon.surgeon$dispatch("25", new Object[]{this, str});
            return;
        }
        try {
            g80.a.o0().t0(str).u0("无法绑定").n0().v0("知道了", new c()).r0(true).s0(false).q0(true).y0(new b()).show(getSupportFragmentManager(), ".ui.view.AIOTDevicesBindActivity");
        } catch (Exception e12) {
            Log.d("AIOTDevice", "showValidateDeviceFailed Exception: " + e12.toString());
        }
    }

    @Override // d80.b
    public void f1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "27")) {
            iSurgeon.surgeon$dispatch("27", new Object[]{this, str});
            return;
        }
        try {
            g80.a.o0().t0("请校对设备的编号\n" + str).u0("确认绑定此设备吗？").v0(ILocalizationService.CANCEL, new f()).A0(ILocalizationService.CONFIRM, new e(str), true).r0(true).s0(true).q0(true).y0(new d()).show(getSupportFragmentManager(), ".ui.view.AIOTDevicesBindActivity");
        } catch (Exception e12) {
            Log.d("AIOTDevice", "showValidateDeviceFailed Exception: " + e12.toString());
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
        setContentView(ff0.m.A);
        this.A = getIntent().getStringExtra("deviceCodeInputType");
        K1();
        if ("Input".equals(this.A)) {
            m1("输入编号");
            R1();
        } else if ("bluetoothScan".equals(this.A)) {
            m1("蓝牙绑定");
            n1(this.J);
        } else {
            m1("扫描设备的二维码");
            if (!me.ele.aiot.home.utils.a.b("android.permission.CAMERA")) {
                S1("");
            } else {
                J1();
            }
        }
        Q1();
        I1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.home.ui.view.b, androidx.appcompat.app.c, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this});
            return;
        }
        super.onDestroy();
        AliScanView aliScanView = this.f61905t;
        if (aliScanView != null) {
            aliScanView.onDestroy();
        }
        d80.a aVar = this.f61903r;
        if (aVar != null) {
            aVar.cancel();
        }
        g80.b bVar = this.f61910y;
        if (bVar != null && bVar.isShowing()) {
            g80.b bVar2 = this.f61910y;
            DialogAspect.aspectOf().hookDismiss(jl1.c.d(K, this, bVar2));
            bVar2.dismiss();
        }
        g80.b bVar3 = this.f61911z;
        if (bVar3 != null && bVar3.isShowing()) {
            g80.b bVar4 = this.f61911z;
            DialogAspect.aspectOf().hookDismiss(jl1.c.d(L, this, bVar4));
            bVar4.dismiss();
        }
        if (ql1.c.c().j(this)) {
            ql1.c.c().s(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(k80.b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "28")) {
            iSurgeon.surgeon$dispatch("28", new Object[]{this, bVar});
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
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this});
            return;
        }
        super.onPause();
        AliScanView aliScanView = this.f61905t;
        if (aliScanView != null) {
            aliScanView.onPause();
        }
        q80.g.x0(getApplication()).Q0();
    }

    @Override // androidx.fragment.app.c, android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i12, @NonNull String[] strArr, @NonNull int[] iArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, Integer.valueOf(i12), strArr, iArr});
            return;
        }
        if (i12 == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("android.permission.CAMERA", 0);
            for (int i13 = 0; i13 < strArr.length; i13++) {
                hashMap.put(strArr[i13], Integer.valueOf(iArr[i13]));
            }
            if (((Integer) hashMap.get("android.permission.CAMERA")).intValue() == 0) {
                J1();
            } else {
                me.ele.aiot.home.utils.a.d(this);
            }
        }
        super.onRequestPermissionsResult(i12, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this});
        } else {
            super.onResume();
        }
    }
}
