package me.ele.aiot.indoorguide.model;

import com.ali.alihadeviceevaluator.AliAIHardware;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class PredictPOIModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("mapingId")
    private int mapingId;

    @SerializedName("name")
    private String name = "";

    @SerializedName("probability")
    private double probability;

    @SerializedName("retailerId")
    private String retailerId;

    @SerializedName(AliAIHardware.K_SCORE)
    private double score;

    @SerializedName("thresholdSmart")
    private double thresholdSmart;

    public PredictPOIModel(String str, double d12, int i12) {
        this.retailerId = str;
        this.probability = d12;
        this.mapingId = i12;
    }

    public int getMapingId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.mapingId;
    }

    public String getName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.name;
    }

    public double getProbability() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Double) iSurgeon.surgeon$dispatch("3", new Object[]{this})).doubleValue() : this.probability;
    }

    public String getRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.retailerId;
    }

    public double getScore() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Double) iSurgeon.surgeon$dispatch("9", new Object[]{this})).doubleValue() : this.score;
    }

    public double getThresholdSmart() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? ((Double) iSurgeon.surgeon$dispatch("11", new Object[]{this})).doubleValue() : this.thresholdSmart;
    }

    public void setMapingId(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.mapingId = i12;
        }
    }

    public void setName(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public void setProbability(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.probability = d12;
        }
    }

    public void setRetailerId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.retailerId = str;
        }
    }

    public void setScore(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Double.valueOf(d12)});
        } else {
            this.score = d12;
        }
    }

    public void setThresholdSmart(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.thresholdSmart = d12;
        }
    }
}
