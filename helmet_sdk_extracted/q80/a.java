package q80;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f83466c;

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC1650a> f83467a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f83468b = new ConcurrentHashMap();

    /* renamed from: q80.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC1650a {
        void a(String str);
    }

    private a() {
    }

    private void a(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            return;
        }
        j90.c.b("BJSReceiver", "dispatchDeviceCode:" + str);
        Iterator<InterfaceC1650a> it = this.f83467a.iterator();
        while (it.hasNext()) {
            InterfaceC1650a next = it.next();
            if (next != null) {
                try {
                    next.a(str);
                } catch (Throwable th2) {
                    j90.c.b("kSD_THROWABLE", "BJSReceiver dispatchDeviceCode throwable:" + th2);
                }
            }
        }
    }

    public static a b() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (a) iSurgeon.surgeon$dispatch("1", new Object[0]);
        }
        if (f83466c == null) {
            synchronized (a.class) {
                if (f83466c == null) {
                    f83466c = new a();
                }
            }
        }
        return f83466c;
    }

    public void c(String str, long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, str, Long.valueOf(j12)});
            return;
        }
        if (str != null) {
            try {
                if (!str.isEmpty() && !this.f83467a.isEmpty()) {
                    j90.c.b("BJSReceiver", "onDeviceCodeReceived:" + str);
                    long max = Math.max(j12, 3000L);
                    long v12 = rf1.c.v();
                    Long l12 = this.f83468b.get(str);
                    if (l12 != null && v12 - l12.longValue() >= 0 && v12 - l12.longValue() < max) {
                        return;
                    }
                    this.f83468b.put(str, Long.valueOf(v12));
                    a(str);
                }
            } catch (Throwable th2) {
                j90.c.b("kSD_THROWABLE", "BJSReceiver onDeviceCodeReceived throwable:" + th2);
            }
        }
    }

    public void d(InterfaceC1650a interfaceC1650a) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, interfaceC1650a});
            return;
        }
        if (interfaceC1650a != null && this.f83467a.addIfAbsent(interfaceC1650a)) {
            j90.c.b("BJSReceiver", "registerCallback size:" + this.f83467a.size());
        }
    }
}
