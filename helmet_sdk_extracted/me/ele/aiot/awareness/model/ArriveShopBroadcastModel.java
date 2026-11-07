package me.ele.aiot.awareness.model;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class ArriveShopBroadcastModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("eventTime")
    @JSONField(name = "eventTime")
    private long eventTime;

    @SerializedName("shopIds")
    @JSONField(name = "shopIds")
    private List<String> shopIds;

    @SerializedName("signalType")
    @JSONField(name = "signalType")
    private String signalType;

    public ArriveShopBroadcastModel(String str, List<String> list, long j12) {
        this.signalType = str;
        this.shopIds = list;
        this.eventTime = j12;
    }

    public long getEventTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Long) iSurgeon.surgeon$dispatch("5", new Object[]{this})).longValue() : this.eventTime;
    }

    public List<String> getShopIds() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (List) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.shopIds;
    }

    public String getSignalType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.signalType;
    }

    public void setEventTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.eventTime = j12;
        }
    }

    public void setShopIds(List<String> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, list});
        } else {
            this.shopIds = list;
        }
    }

    public void setSignalType(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.signalType = str;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
        }
        return "ArriveShopBroadcastModel{signalType='" + this.signalType + "', shopIds=" + this.shopIds + ", eventTime=" + this.eventTime + '}';
    }
}
