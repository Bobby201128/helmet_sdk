package me.ele.aiot.kernel.bean;

import android.text.TextUtils;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class DiscoveredBleDeviceBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private String macAddress;
    private int rssi;

    public DiscoveredBleDeviceBean(String str, int i12) {
        this.macAddress = str;
        this.rssi = i12;
    }

    public boolean equals(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DiscoveredBleDeviceBean)) {
            return false;
        }
        DiscoveredBleDeviceBean discoveredBleDeviceBean = (DiscoveredBleDeviceBean) obj;
        if (!TextUtils.isEmpty(this.macAddress) && this.macAddress.equals(discoveredBleDeviceBean.getMacAddress())) {
            return true;
        }
        return false;
    }

    public String getMacAddress() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.macAddress;
    }

    public int getRssi() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.rssi;
    }

    public void setMacAddress(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.macAddress = str;
        }
    }

    public void setRssi(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.rssi = i12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            return (String) iSurgeon.surgeon$dispatch("6", new Object[]{this});
        }
        return "DiscoveredTKXDeviceBean{macAddress='" + this.macAddress + "', rssi=" + this.rssi + '}';
    }
}
