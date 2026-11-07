package me.ele.aiot.activityrecognition.model;

import androidx.annotation.NonNull;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class HARModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("elevatorHARModel")
    private HARModelInfo elevatorHARModel;

    @SerializedName("escalatorHARModel")
    private HARModelInfo escalatorHARModel;

    @SerializedName("horizontalHARModel")
    private HARModelInfo horizontalHARModel;

    @SerializedName("stairwayHARModel")
    private HARModelInfo stairwayHARModel;

    public HARModelInfo getElevatorHARModel() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (HARModelInfo) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.elevatorHARModel;
    }

    public HARModelInfo getEscalatorHARModel() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (HARModelInfo) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.escalatorHARModel;
    }

    public HARModelInfo getHorizontalHARModel() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (HARModelInfo) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.horizontalHARModel;
    }

    public HARModelInfo getStairwayHARModel() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (HARModelInfo) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.stairwayHARModel;
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "HARModel{horizontalHARModel=" + this.horizontalHARModel + ", elevatorHARModel=" + this.elevatorHARModel + ", escalatorHARModel=" + this.escalatorHARModel + ", stairwayHARModel=" + this.stairwayHARModel + '}';
    }
}
