package me.ele.aiot.awareness.model;

import androidx.annotation.NonNull;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class UnArrivalOrderNfcModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("deviceInfo")
    private List<NfcDeviceInfoModel> nfcDeviceInfoModelList;

    @SerializedName("platformTrackingId")
    private String platformTrackingId;

    @SerializedName("retailerId")
    private String retailerId;

    public List<NfcDeviceInfoModel> getNfcDeviceInfoModelList() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (List) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.nfcDeviceInfoModelList;
    }

    public String getPlatformTrackingId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.platformTrackingId;
    }

    public String getRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.retailerId;
    }

    public void setNfcDeviceInfoModelList(List<NfcDeviceInfoModel> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, list});
        } else {
            this.nfcDeviceInfoModelList = list;
        }
    }

    public void setPlatformTrackingId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.platformTrackingId = str;
        }
    }

    public void setRetailerId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.retailerId = str;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
        }
        return "UnArrivalOrderNfcModel{platformTrackingId='" + this.platformTrackingId + "', retailerId='" + this.retailerId + "', nfcDeviceInfoModelList=" + this.nfcDeviceInfoModelList + '}';
    }
}
