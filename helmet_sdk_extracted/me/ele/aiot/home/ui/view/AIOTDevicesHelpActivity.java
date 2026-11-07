package me.ele.aiot.home.ui.view;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import ff0.k;
import ff0.m;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import ql1.c;

/* loaded from: classes4.dex */
public class AIOTDevicesHelpActivity extends b {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: r, reason: collision with root package name */
    WebView f61944r;

    /* renamed from: s, reason: collision with root package name */
    TextView f61945s;

    private void r1() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this});
            return;
        }
        this.f61944r = (WebView) findViewById(k.f49168a0);
        TextView textView = (TextView) findViewById(k.f49913u9);
        this.f61945s = textView;
        textView.setText("头盔SDK版本号: 10.11.0");
        this.f61944r.setWebChromeClient(new WebChromeClient());
        this.f61944r.getSettings().setJavaScriptEnabled(true);
        this.f61944r.loadUrl("https://er.fengniaojipei.net/Zy8yLzYyMQ");
        if (!c.c().j(this)) {
            c.c().q(this);
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
        setContentView(m.f50421v);
        m1("帮助");
        r1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.home.ui.view.b, androidx.appcompat.app.c, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this});
            return;
        }
        super.onDestroy();
        WebView webView = this.f61944r;
        if (webView != null) {
            webView.destroy();
        }
        if (c.c().j(this)) {
            c.c().s(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(k80.b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, bVar});
            return;
        }
        if (c.c().j(this)) {
            c.c().s(this);
        }
        finish();
    }
}
