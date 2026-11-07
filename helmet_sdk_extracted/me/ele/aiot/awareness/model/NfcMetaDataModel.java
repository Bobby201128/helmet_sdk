package me.ele.aiot.awareness.model;

import androidx.annotation.NonNull;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class NfcMetaDataModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("deviceCode")
    private final String deviceCode;

    @SerializedName("retailerId")
    private final String retailerId;

    @SerializedName("secret")
    private final String secret;

    @SerializedName("uid")
    private final String uid;

    public NfcMetaDataModel(String str, String str2, String str3, String str4) {
        this.uid = str;
        this.secret = str2;
        this.deviceCode = str3;
        this.retailerId = str4;
    }

    public String getDeviceCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.deviceCode;
    }

    public String getRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (String) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.retailerId;
    }

    public String getSecret() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.secret;
    }

    public String getUid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.uid;
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "NfcMetaDataModel{uid='" + this.uid + "', secret='" + this.secret + "', deviceCode='" + this.deviceCode + "', retailerId='" + this.retailerId + "'}";
    }
}
