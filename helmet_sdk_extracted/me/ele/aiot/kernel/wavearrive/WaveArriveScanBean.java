package me.ele.aiot.kernel.wavearrive;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import org.android.agoo.common.AgooConstants;
import rf1.c;

/* loaded from: classes4.dex */
public class WaveArriveScanBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private String deviceId;
    private ManufactureId manufactureId;
    private String manufacturerData;
    private String name;
    private long timestamp = c.v();

    public WaveArriveScanBean(String str, String str2, String str3, ManufactureId manufactureId) {
        this.name = str;
        this.deviceId = str2;
        this.manufacturerData = str3;
        this.manufactureId = manufactureId;
    }

    public String getDeviceId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.deviceId;
    }

    public ManufactureId getManufactureId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (ManufactureId) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.manufactureId;
    }

    public String getManufacturerData() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.manufacturerData;
    }

    public String getName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.name;
    }

    public long getTimestamp() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? ((Long) iSurgeon.surgeon$dispatch("6", new Object[]{this})).longValue() : this.timestamp;
    }

    public void setDeviceId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, str});
        } else {
            this.deviceId = str;
        }
    }

    public void setManufactureId(ManufactureId manufactureId) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, manufactureId});
        } else {
            this.manufactureId = manufactureId;
        }
    }

    public void setManufacturerData(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
        } else {
            this.manufacturerData = str;
        }
    }

    public void setName(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public void setTimestamp(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.timestamp = j12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            return (String) iSurgeon.surgeon$dispatch("11", new Object[]{this});
        }
        return "WaveArriveScanBean{name='" + this.name + "', deviceId='" + this.deviceId + "', manufacturerData='" + this.manufacturerData + "', manufactureId=" + this.manufactureId + ", timestamp=" + this.timestamp + '}';
    }
}
