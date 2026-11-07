package me.ele.aiot.fastble.bluetooth;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.ele.aiot.fastble.data.BleDevice;
import me.ele.aiot.fastble.utils.BleLruHashMap;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class b {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private final BleLruHashMap<String, BleBluetooth> f61881a = new BleLruHashMap<>(w70.a.l().m());

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, BleBluetooth> f61882b = new HashMap<>();

    /* loaded from: classes4.dex */
    public class a implements Comparator<BleBluetooth> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(BleBluetooth bleBluetooth, BleBluetooth bleBluetooth2) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this, bleBluetooth, bleBluetooth2})).intValue() : bleBluetooth.H().compareToIgnoreCase(bleBluetooth2.H());
        }
    }

    public synchronized void a(BleBluetooth bleBluetooth) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, bleBluetooth});
        } else {
            if (bleBluetooth == null) {
                return;
            }
            if (!this.f61881a.containsKey(bleBluetooth.H())) {
                this.f61881a.put(bleBluetooth.H(), bleBluetooth);
            }
        }
    }

    public synchronized BleBluetooth b(BleDevice bleDevice) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (BleBluetooth) iSurgeon.surgeon$dispatch("1", new Object[]{this, bleDevice});
        }
        BleBluetooth bleBluetooth = new BleBluetooth(bleDevice);
        if (!this.f61882b.containsKey(bleBluetooth.H())) {
            this.f61882b.put(bleBluetooth.H(), bleBluetooth);
        }
        return bleBluetooth;
    }

    public synchronized void c() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this});
            return;
        }
        Iterator<Map.Entry<String, BleBluetooth>> it = this.f61881a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().C();
        }
        this.f61881a.clear();
        Iterator<Map.Entry<String, BleBluetooth>> it2 = this.f61882b.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().C();
        }
        this.f61882b.clear();
    }

    public synchronized void d(BleDevice bleDevice) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, bleDevice});
        } else {
            if (i(bleDevice)) {
                f(bleDevice).D();
            }
        }
    }

    public synchronized void e() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this});
            return;
        }
        Iterator<Map.Entry<String, BleBluetooth>> it = this.f61881a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().D();
        }
        this.f61881a.clear();
    }

    public synchronized BleBluetooth f(BleDevice bleDevice) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (BleBluetooth) iSurgeon.surgeon$dispatch("7", new Object[]{this, bleDevice});
        }
        if (bleDevice != null && this.f61881a.containsKey(bleDevice.getKey())) {
            return this.f61881a.get(bleDevice.getKey());
        }
        return null;
    }

    public synchronized List<BleBluetooth> g() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            return (List) iSurgeon.surgeon$dispatch("11", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.f61881a.values());
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    public synchronized List<BleDevice> h() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            return (List) iSurgeon.surgeon$dispatch("12", new Object[]{this});
        }
        j();
        ArrayList arrayList = new ArrayList();
        for (BleBluetooth bleBluetooth : g()) {
            if (bleBluetooth != null) {
                arrayList.add(bleBluetooth.G());
            }
        }
        return arrayList;
    }

    public synchronized boolean i(BleDevice bleDevice) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[]{this, bleDevice})).booleanValue();
        }
        return bleDevice != null && this.f61881a.containsKey(bleDevice.getKey());
    }

    public void j() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this});
            return;
        }
        List<BleBluetooth> g12 = g();
        for (int i12 = 0; g12 != null && i12 < g12.size(); i12++) {
            BleBluetooth bleBluetooth = g12.get(i12);
            if (!w70.a.l().w(bleBluetooth.G())) {
                k(bleBluetooth);
            }
        }
    }

    public synchronized void k(BleBluetooth bleBluetooth) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, bleBluetooth});
        } else {
            if (bleBluetooth == null) {
                return;
            }
            if (this.f61881a.containsKey(bleBluetooth.H())) {
                this.f61881a.remove(bleBluetooth.H());
            }
        }
    }

    public synchronized void l(BleBluetooth bleBluetooth) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, bleBluetooth});
        } else {
            if (bleBluetooth == null) {
                return;
            }
            if (this.f61882b.containsKey(bleBluetooth.H())) {
                this.f61882b.remove(bleBluetooth.H());
            }
        }
    }
}
