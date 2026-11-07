package me.ele.aiot.sensor.internal.data;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.alipay.user.mobile.authlogin.common.AliAuthLoginConstant;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class BeaconInfoBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("major")
    private String major;

    @SerializedName("minor")
    private String minor;

    @SerializedName("rssi")
    private int rssi;

    @SerializedName(AliAuthLoginConstant.UUID)
    private String uuid;

    public BeaconInfoBean(String str, String str2, String str3, int i12) {
        this.uuid = str;
        this.major = str2;
        this.minor = str3;
        this.rssi = i12;
    }

    public boolean equals(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("9", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeaconInfoBean)) {
            return false;
        }
        return this.uuid.equals(((BeaconInfoBean) obj).uuid);
    }

    public String getMajor() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.major;
    }

    public String getMinor() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.minor;
    }

    public int getRssi() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.rssi;
    }

    public String getUuid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.uuid;
    }

    public void setMajor(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.major = str;
        }
    }

    public void setMinor(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.minor = str;
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

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            return (String) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this});
        }
        return "BeaconInfoBean{uuid=" + this.uuid + ", major=" + this.major + ", minor=" + this.minor + ", rssi=" + this.rssi + '}';
    }
}
