package me.ele.aiot.codec.commons;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Objects;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class Wifi {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private long age;
    private String bssid;
    private int frequency;
    private int rssi;
    private long scannedTime;
    private String ssid;
    private int type;

    public Wifi(String str, String str2, int i12, long j12) {
        this.ssid = str == null ? "" : str;
        this.bssid = str2 == null ? "" : str2;
        this.rssi = i12;
        this.age = j12;
        this.scannedTime = 0L;
    }

    public boolean equals(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("15", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Wifi wifi = (Wifi) obj;
        if (this.type == wifi.type && this.rssi == wifi.rssi && this.age == wifi.age && this.scannedTime == wifi.scannedTime && this.ssid.equals(wifi.ssid) && this.bssid.equals(wifi.bssid) && this.frequency == wifi.frequency) {
            return true;
        }
        return false;
    }

    public long getAge() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Long) iSurgeon.surgeon$dispatch("9", new Object[]{this})).longValue() : this.age;
    }

    public String getBssid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.bssid;
    }

    public int getFrequency() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? ((Integer) iSurgeon.surgeon$dispatch("13", new Object[]{this})).intValue() : this.frequency;
    }

    public int getRssi() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.rssi;
    }

    public long getScannedTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? ((Long) iSurgeon.surgeon$dispatch("11", new Object[]{this})).longValue() : this.scannedTime;
    }

    public String getSsid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.ssid;
    }

    public int getType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.type;
    }

    public int hashCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "16") ? ((Integer) iSurgeon.surgeon$dispatch("16", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(this.type), this.ssid, this.bssid, Integer.valueOf(this.rssi), Long.valueOf(this.age), Long.valueOf(this.scannedTime));
    }

    public void setAge(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Long.valueOf(j12)});
        } else {
            this.age = j12;
        }
    }

    public void setBssid(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.bssid = str;
    }

    public void setFrequency(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.frequency = i12;
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

    public void setScannedTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.scannedTime = j12;
        }
    }

    public void setSsid(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.ssid = str;
    }

    public void setType(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.type = i12;
        }
    }

    public Wifi(String str, String str2, int i12, int i13, long j12, long j13) {
        this.ssid = str == null ? "" : str;
        this.bssid = str2 == null ? "" : str2;
        this.type = i12;
        this.rssi = i13;
        this.age = j12;
        this.scannedTime = j13;
    }

    public Wifi() {
    }

    public Wifi(String str, String str2, int i12, int i13, long j12) {
        this.ssid = str == null ? "" : str;
        this.bssid = str2 == null ? "" : str2;
        this.type = i12;
        this.rssi = i13;
        this.age = j12;
        this.scannedTime = 0L;
    }

    public Wifi(String str, String str2, int i12, long j12, long j13) {
        this.ssid = str == null ? "" : str;
        this.bssid = str2 == null ? "" : str2;
        this.type = 0;
        this.rssi = i12;
        this.age = j12;
        this.scannedTime = j13;
    }

    public Wifi(String str, String str2, int i12, int i13, long j12, long j13, int i14) {
        this.ssid = str == null ? "" : str;
        this.bssid = str2 == null ? "" : str2;
        this.type = i12;
        this.rssi = i13;
        this.age = j12;
        this.scannedTime = j13;
        this.frequency = i14;
    }
}
