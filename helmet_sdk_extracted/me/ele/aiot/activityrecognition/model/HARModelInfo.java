package me.ele.aiot.activityrecognition.model;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class HARModelInfo implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("modelHash")
    private String modelHash;

    @SerializedName("modelUrl")
    private String modelUrl;

    @SerializedName("modelVersion")
    private int modelVersion;

    public HARModelInfo(String str, String str2, int i12) {
        this.modelUrl = str;
        this.modelHash = str2;
        this.modelVersion = i12;
    }

    public String getModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.modelHash;
    }

    public String getModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.modelUrl;
    }

    public int getModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.modelVersion;
    }

    public void setModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.modelHash = str;
        }
    }

    public void setModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.modelUrl = str;
        }
    }

    public void setModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.modelVersion = i12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
        }
        return "HARModelInfo{modelUrl='" + this.modelUrl + "', modelHash='" + this.modelHash + "', modelVersion=" + this.modelVersion + '}';
    }
}
