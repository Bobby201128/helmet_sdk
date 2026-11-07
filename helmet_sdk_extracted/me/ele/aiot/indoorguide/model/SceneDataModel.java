package me.ele.aiot.indoorguide.model;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import me.ele.aiot.indoorguide.database.model.SceneDataInfo;

/* loaded from: classes4.dex */
public class SceneDataModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("modelName")
    private String modelName;

    @SerializedName("data")
    private List<SceneDataInfo> sceneDataInfoList;

    public SceneDataModel(String str, List<SceneDataInfo> list) {
        this.modelName = str;
        this.sceneDataInfoList = list;
    }

    public String getModelName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.modelName;
    }

    public List<SceneDataInfo> getSceneDataInfoList() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (List) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.sceneDataInfoList;
    }

    public void setModelName(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.modelName = str;
        }
    }

    public void setSceneDataInfoList(List<SceneDataInfo> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, list});
        } else {
            this.sceneDataInfoList = list;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "SceneDataModel{modelName='" + this.modelName + "', sceneDataInfoList=" + this.sceneDataInfoList + '}';
    }
}
