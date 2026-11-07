package me.ele.aiot.awareness.algdata.model;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import me.ele.aiot.awareness.api.IJson;

/* loaded from: classes4.dex */
public class PressureModel implements Serializable, IJson {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: al, reason: collision with root package name */
    @SerializedName("al")
    @JSONField(name = "al")
    private float f61854al;

    /* renamed from: p, reason: collision with root package name */
    @SerializedName("p")
    @JSONField(name = "p")
    private float f61855p;

    @SerializedName("utcTimestamp")
    @JSONField(name = "utcTimestamp")
    private long utcTimestamp;

    public float getAl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Float) iSurgeon.surgeon$dispatch("3", new Object[]{this})).floatValue() : this.f61854al;
    }

    public float getP() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Float) iSurgeon.surgeon$dispatch("1", new Object[]{this})).floatValue() : this.f61855p;
    }

    public long getUtcTimestamp() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Long) iSurgeon.surgeon$dispatch("5", new Object[]{this})).longValue() : this.utcTimestamp;
    }

    @Override // me.ele.aiot.awareness.api.IJson
    public IJson parseJson(JSONObject jSONObject) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            return (IJson) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            try {
                this.f61855p = jSONObject.getFloat("p").floatValue();
                this.f61854al = jSONObject.getFloat("al").floatValue();
                this.utcTimestamp = jSONObject.getLong("utcTimestamp").longValue();
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public void setAl(float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Float.valueOf(f12)});
        } else {
            this.f61854al = f12;
        }
    }

    public void setP(float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Float.valueOf(f12)});
        } else {
            this.f61855p = f12;
        }
    }

    public void setUtcTimestamp(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.utcTimestamp = j12;
        }
    }

    @Override // me.ele.aiot.awareness.api.IJson
    public JSONObject toJSONObject() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (JSONObject) iSurgeon.surgeon$dispatch("7", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("p", (Object) Float.valueOf(this.f61855p));
        jSONObject.put("al", (Object) Float.valueOf(this.f61854al));
        jSONObject.put("utcTimestamp", (Object) Long.valueOf(this.utcTimestamp));
        return jSONObject;
    }
}
