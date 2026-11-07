package me.ele.aiot.awareness.algdata.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import me.ele.aiot.awareness.api.IJson;

/* loaded from: classes4.dex */
public class IoStatusModel implements Serializable, IJson {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("status")
    @JSONField(name = "status")
    private int status;

    @SerializedName("utcTimestamp")
    @JSONField(name = "utcTimestamp")
    private long utcTimestamp;

    public int getStatus() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.status;
    }

    public long getUtcTimestamp() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[]{this})).longValue() : this.utcTimestamp;
    }

    @Override // me.ele.aiot.awareness.api.IJson
    public IJson parseJson(JSONObject jSONObject) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            return (IJson) iSurgeon.surgeon$dispatch("6", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            try {
                this.status = jSONObject.getInteger("status").intValue();
                this.utcTimestamp = jSONObject.getLong("utcTimestamp").longValue();
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public void setStatus(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.status = i12;
        }
    }

    public void setUtcTimestamp(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.utcTimestamp = j12;
        }
    }

    @Override // me.ele.aiot.awareness.api.IJson
    public JSONObject toJSONObject() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (JSONObject) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) Integer.valueOf(this.status));
        jSONObject.put("utcTimestamp", (Object) Long.valueOf(this.utcTimestamp));
        return jSONObject;
    }
}
