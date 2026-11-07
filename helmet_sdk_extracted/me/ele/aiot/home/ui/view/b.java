package me.ele.aiot.home.ui.view;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.uc.crashsdk.export.LogType;
import ff0.j;
import ff0.k;
import me.ele.quicksparrow.t1;
import org.aspectj.lang.a;

/* loaded from: classes4.dex */
public class b extends c {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC1573a f61970q = null;

    /* renamed from: o, reason: collision with root package name */
    private e80.a f61971o;

    /* renamed from: p, reason: collision with root package name */
    private BroadcastReceiver f61972p;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        jl1.c cVar = new jl1.c("BaseActivity.java", b.class);
        f61970q = cVar.i("method-call", cVar.h("1", "registerReceiver", "me.ele.aiot.home.ui.view.BaseActivity", "android.content.BroadcastReceiver:android.content.IntentFilter", "receiver:filter", "", "android.content.Intent"), 32);
    }

    private void q1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this});
            return;
        }
        Window window = getWindow();
        window.addFlags(128);
        window.clearFlags(t1.f72855z);
        window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(9216);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            return;
        }
        Toolbar toolbar = (Toolbar) findViewById(k.f49331eh);
        ((TextView) toolbar.findViewById(k.YA)).setText(str);
        toolbar.setNavigationIcon(j.f49133w5);
        setSupportActionBar(toolbar);
        q1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m1(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, str});
            return;
        }
        Toolbar toolbar = (Toolbar) findViewById(k.f49823ru);
        ((TextView) toolbar.findViewById(k.YA)).setText(str);
        toolbar.setNavigationIcon(j.f48979i0);
        setSupportActionBar(toolbar);
        q1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n1(BroadcastReceiver broadcastReceiver) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, broadcastReceiver});
        } else if (broadcastReceiver != null) {
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
            this.f61972p = broadcastReceiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this});
            return;
        }
        e80.a aVar = this.f61971o;
        if (aVar != null) {
            aVar.cancel();
        }
        BroadcastReceiver broadcastReceiver = this.f61972p;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("6", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p1(e80.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, aVar});
        } else {
            this.f61971o = aVar;
        }
    }
}
