package me.ele.aiot.awareness.model;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class NfcBroadcastModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("shopId")
    @JSONField(name = "shopId")
    private String shopId;

    @SerializedName("utc")
    @JSONField(name = "utc")
    private long utc;

    public NfcBroadcastModel(String str, long j12) {
        this.shopId = str;
        this.utc = j12;
    }

    public String getShopId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.shopId;
    }

    public long getUtc() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[]{this})).longValue() : this.utc;
    }

    public void setShopId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.shopId = str;
        }
    }

    public void setUtc(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.utc = j12;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "NfcBroadcastModel{shopId='" + this.shopId + "', utc=" + this.utc + '}';
    }
}
