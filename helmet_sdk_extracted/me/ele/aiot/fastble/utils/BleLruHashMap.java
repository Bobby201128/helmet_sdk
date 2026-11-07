package me.ele.aiot.fastble.utils;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.LinkedHashMap;
import java.util.Map;
import me.ele.aiot.fastble.bluetooth.BleBluetooth;

/* loaded from: classes4.dex */
public class BleLruHashMap<K, V> extends LinkedHashMap<K, V> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private final int MAX_SIZE;

    public BleLruHashMap(int i12) {
        super(((int) Math.ceil(i12 / 0.75d)) + 1, 0.75f, true);
        this.MAX_SIZE = i12;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry entry) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{this, entry})).booleanValue();
        }
        if (size() > this.MAX_SIZE && (entry.getValue() instanceof BleBluetooth)) {
            ((BleBluetooth) entry.getValue()).D();
        }
        if (size() > this.MAX_SIZE) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (String) iSurgeon.surgeon$dispatch("2", new Object[]{this});
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<K, V> entry : entrySet()) {
            sb2.append(String.format("%s:%s ", entry.getKey(), entry.getValue()));
        }
        return sb2.toString();
    }
}
