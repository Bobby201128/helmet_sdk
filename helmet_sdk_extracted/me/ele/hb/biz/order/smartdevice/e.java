package me.ele.hb.biz.order.smartdevice;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes5.dex */
public class e implements me.ele.hb.biz.order.smartdevice.a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: d, reason: collision with root package name */
    private b f65058d;

    /* renamed from: e, reason: collision with root package name */
    private long f65059e;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f65055a = false;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f65056b = false;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f65057c = false;

    /* renamed from: f, reason: collision with root package name */
    private Handler f65060f = new me.ele.td.lib.wrapper.e(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private Runnable f65061g = new a();

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            e eVar = e.this;
            eVar.f65055a = true;
            if (!eVar.f65057c && eVar.f65058d != null) {
                e.this.f65058d.timeout();
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(e eVar);

        void timeout();
    }

    public e(b bVar, long j12) {
        this.f65059e = j12;
        if (bVar != null) {
            this.f65058d = bVar;
            c();
            bVar.a(this);
        }
    }

    private void c() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this});
        } else {
            this.f65060f.postDelayed(this.f65061g, this.f65059e);
        }
    }

    @Override // me.ele.hb.biz.order.smartdevice.a
    public void a() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this});
        } else {
            this.f65057c = true;
        }
    }
}
