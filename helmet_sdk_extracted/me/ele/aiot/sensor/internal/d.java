package me.ele.aiot.sensor.internal;

import android.os.Handler;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.Gson;
import f90.a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class d {
    private static transient /* synthetic */ ISurgeon $surgeonFlag = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f62122b = false;

    /* renamed from: d, reason: collision with root package name */
    private static Handler f62124d;

    /* renamed from: a, reason: collision with root package name */
    private String f62129a;

    /* renamed from: c, reason: collision with root package name */
    private static final Gson f62123c = new Gson();

    /* renamed from: e, reason: collision with root package name */
    private static Queue<e> f62125e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private static HashMap<String, f> f62126f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static boolean f62127g = false;

    /* renamed from: h, reason: collision with root package name */
    private static final Runnable f62128h = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                d.b();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Runnable f62130n;

        b(Runnable runnable) {
            this.f62130n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            d.f62125e.offer(new e(d.this.f62129a, this.f62130n));
            if (d.f62127g) {
                return;
            }
            boolean unused = d.f62127g = true;
            d.b();
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
            Queue<e> queue = d.f62125e;
            Queue unused = d.f62125e = new ArrayDeque();
            for (e eVar : queue) {
                if (!d.this.f62129a.equals(eVar.f62135a)) {
                    d.f62125e.offer(eVar);
                }
            }
            d.f62126f.remove(d.this.f62129a);
        }
    }

    /* renamed from: me.ele.aiot.sensor.internal.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC1137d implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ CharacteristicId f62133n;

        RunnableC1137d(CharacteristicId characteristicId) {
            this.f62133n = characteristicId;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
                return;
            }
            f fVar = (f) d.f62126f.get(d.this.f62129a);
            if (fVar != null && this.f62133n.equals(fVar.f62137a)) {
                d.f62126f.remove(d.this.f62129a);
                Iterator<e> it = fVar.f62138b.iterator();
                while (it.hasNext()) {
                    d.f62125e.offer(it.next());
                }
                d.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        String f62135a;

        /* renamed from: b, reason: collision with root package name */
        Runnable f62136b;

        e(String str, Runnable runnable) {
            this.f62135a = str;
            this.f62136b = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        CharacteristicId f62137a;

        /* renamed from: b, reason: collision with root package name */
        Queue<e> f62138b = new ArrayDeque();

        f(CharacteristicId characteristicId) {
            this.f62137a = characteristicId;
        }
    }

    public d(String str) {
        this.f62129a = str;
        if (f62124d == null) {
            f62124d = new me.ele.td.lib.wrapper.e(me.ele.aiot.sensor.internal.e.e().getLooper());
        }
    }

    private void a(Runnable runnable) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, runnable});
        } else {
            l90.b.a(f62124d, new b(runnable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[0]);
            return;
        }
        Handler handler = f62124d;
        Runnable runnable = f62128h;
        handler.removeCallbacks(runnable);
        e poll = f62125e.poll();
        if (poll != null) {
            if (f62126f.containsKey(poll.f62135a)) {
                if (f62126f.containsKey(poll.f62135a)) {
                    f62126f.get(poll.f62135a).f62138b.offer(poll);
                }
                b();
                return;
            }
            if (f62122b) {
                f62124d.postDelayed(runnable, 10L);
            } else {
                f62124d.postDelayed(runnable, 20L);
            }
            Runnable runnable2 = poll.f62136b;
            if (runnable2 instanceof a.RunnableC0763a) {
                ((a.RunnableC0763a) runnable2).a();
            }
            poll.f62136b.run();
            return;
        }
        f62127g = false;
    }

    public void j(CharacteristicId characteristicId) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, characteristicId});
        } else {
            o(characteristicId);
        }
    }

    public void k() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this});
        } else {
            l90.b.a(f62124d, new c());
        }
    }

    public void l(Runnable runnable) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, runnable});
        } else {
            a(runnable);
        }
    }

    public Handler m() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (Handler) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : f62124d;
    }

    public boolean n(CharacteristicId characteristicId) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Boolean) iSurgeon.surgeon$dispatch("9", new Object[]{this, characteristicId})).booleanValue() : f62126f.containsKey(this.f62129a) && f62126f.get(this.f62129a).f62137a.equals(characteristicId);
    }

    public void o(CharacteristicId characteristicId) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, characteristicId});
        } else {
            l90.b.a(f62124d, new RunnableC1137d(characteristicId));
        }
    }

    public void p() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this});
        } else {
            l90.b.a(f62124d, f62128h);
        }
    }

    public void q(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            f62122b = z12;
        }
    }

    public void r(CharacteristicId characteristicId) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, characteristicId});
        } else {
            f62126f.put(this.f62129a, new f(characteristicId));
        }
    }
}
