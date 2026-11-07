package me.ele.aiot.codec.commons;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Objects;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class Beacon {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private int major;
    private int minor;
    private int rssi;
    private String uuid;

    public Beacon(String str, int i12, int i13, int i14) {
        this.uuid = str;
        this.major = i12;
        this.minor = i13;
        this.rssi = i14;
    }

    public boolean equals(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("9", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Beacon beacon = (Beacon) obj;
        if (this.major == beacon.major && this.minor == beacon.minor && this.rssi == beacon.rssi && this.uuid.equals(beacon.uuid)) {
            return true;
        }
        return false;
    }

    public int getMajor() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.major;
    }

    public int getMinor() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.minor;
    }

    public int getRssi() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.rssi;
    }

    public String getUuid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.uuid;
    }

    public int hashCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE) ? ((Integer) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this})).intValue() : Objects.hash(this.uuid, Integer.valueOf(this.major), Integer.valueOf(this.minor), Integer.valueOf(this.rssi));
    }

    public void setMajor(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.major = i12;
        }
    }

    public void setMinor(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.minor = i12;
        }
    }

    public void setRssi(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.rssi = i12;
        }
    }

    public void setUuid(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.uuid = str;
        }
    }

    public Beacon() {
    }
}
