package me.ele.aiot.fastble.bluetooth;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.LinkedList;
import java.util.Queue;
import me.ele.aiot.fastble.exception.BleException;
import me.ele.aiot.fastble.exception.OtherException;
import me.ele.td.lib.wrapper.e;
import me.ele.td.lib.wrapper.f;
import x70.h;

/* loaded from: classes4.dex */
public class c {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f61884a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f61885b;

    /* renamed from: c, reason: collision with root package name */
    private BleBluetooth f61886c;

    /* renamed from: d, reason: collision with root package name */
    private String f61887d;

    /* renamed from: e, reason: collision with root package name */
    private String f61888e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f61889f;

    /* renamed from: g, reason: collision with root package name */
    private int f61890g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f61891h;

    /* renamed from: i, reason: collision with root package name */
    private long f61892i;

    /* renamed from: j, reason: collision with root package name */
    private h f61893j;

    /* renamed from: k, reason: collision with root package name */
    private Queue<byte[]> f61894k;

    /* renamed from: l, reason: collision with root package name */
    private int f61895l;

    /* loaded from: classes4.dex */
    public class a extends e {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what == 51) {
                c.this.l();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b extends h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        b() {
        }

        @Override // x70.h
        public void e(BleException bleException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bleException});
                return;
            }
            if (c.this.f61893j != null) {
                c.this.f61893j.e(new OtherException("exception occur while writing: " + bleException.getDescription()));
            }
            if (c.this.f61891h) {
                c.this.f61885b.sendMessageDelayed(c.this.f61885b.obtainMessage(51), c.this.f61892i);
            }
        }

        @Override // x70.h
        public void f(int i12, int i13, byte[] bArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12), Integer.valueOf(i13), bArr});
                return;
            }
            int size = c.this.f61895l - c.this.f61894k.size();
            if (c.this.f61893j != null) {
                c.this.f61893j.f(size, c.this.f61895l, bArr);
            }
            if (c.this.f61891h) {
                c.this.f61885b.sendMessageDelayed(c.this.f61885b.obtainMessage(51), c.this.f61892i);
            }
        }
    }

    public c() {
        f fVar = new f("splitWriter");
        this.f61884a = fVar;
        of1.b.b(fVar, "unknown");
        fVar.start();
        this.f61885b = new a(this.f61884a.getLooper());
    }

    private void h() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this});
        } else {
            this.f61884a.quit();
            this.f61885b.removeCallbacksAndMessages(null);
        }
    }

    private static Queue<byte[]> i(byte[] bArr, int i12) {
        int round;
        int length;
        byte[] bArr2;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (Queue) iSurgeon.surgeon$dispatch("5", new Object[]{bArr, Integer.valueOf(i12)});
        }
        if (i12 > 20) {
            me.ele.aiot.fastble.utils.a.c("Be careful: split count beyond 20! Ensure MTU higher than 23!");
        }
        LinkedList linkedList = new LinkedList();
        if (bArr.length % i12 == 0) {
            round = bArr.length / i12;
        } else {
            round = Math.round((bArr.length / i12) + 1);
        }
        if (round > 0) {
            for (int i13 = 0; i13 < round; i13++) {
                if (round != 1 && i13 != round - 1) {
                    bArr2 = new byte[i12];
                    System.arraycopy(bArr, i13 * i12, bArr2, 0, i12);
                } else {
                    if (bArr.length % i12 == 0) {
                        length = i12;
                    } else {
                        length = bArr.length % i12;
                    }
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr, i13 * i12, bArr3, 0, length);
                    bArr2 = bArr3;
                }
                linkedList.offer(bArr2);
            }
        }
        return linkedList;
    }

    private void j() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this});
            return;
        }
        byte[] bArr = this.f61889f;
        if (bArr != null) {
            int i12 = this.f61890g;
            if (i12 >= 1) {
                Queue<byte[]> i13 = i(bArr, i12);
                this.f61894k = i13;
                this.f61895l = i13.size();
                l();
                return;
            }
            throw new IllegalArgumentException("split count should higher than 0!");
        }
        throw new IllegalArgumentException("data is Null!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this});
            return;
        }
        if (this.f61894k.peek() == null) {
            h();
            return;
        }
        this.f61886c.I().o(this.f61887d, this.f61888e).p(this.f61894k.poll(), new b(), this.f61888e);
        if (!this.f61891h) {
            this.f61885b.sendMessageDelayed(this.f61885b.obtainMessage(51), this.f61892i);
        }
    }

    public void k(BleBluetooth bleBluetooth, String str, String str2, byte[] bArr, boolean z12, long j12, h hVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, bleBluetooth, str, str2, bArr, Boolean.valueOf(z12), Long.valueOf(j12), hVar});
            return;
        }
        this.f61886c = bleBluetooth;
        this.f61887d = str;
        this.f61888e = str2;
        this.f61889f = bArr;
        this.f61891h = z12;
        this.f61892i = j12;
        this.f61890g = w70.a.l().r();
        this.f61893j = hVar;
        j();
    }
}
