package me.ele.aiot.pedestriandeadreckoning.algdata.model;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.alipay.rdssecuritysdk.constant.DictionaryKeys;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import me.ele.aiot.pedestriandeadreckoning.api.IJson;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class MagModel implements Serializable, IJson {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("utcTimestamp")
    @JSONField(name = "utcTimestamp")
    private long utcTimestamp;

    /* renamed from: x, reason: collision with root package name */
    @SerializedName(DictionaryKeys.CTRLXY_X)
    @JSONField(name = DictionaryKeys.CTRLXY_X)
    private float f62061x;

    /* renamed from: y, reason: collision with root package name */
    @SerializedName(DictionaryKeys.CTRLXY_Y)
    @JSONField(name = DictionaryKeys.CTRLXY_Y)
    private float f62062y;

    /* renamed from: z, reason: collision with root package name */
    @SerializedName("z")
    @JSONField(name = "z")
    private float f62063z;

    public long getUtcTimestamp() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Long) iSurgeon.surgeon$dispatch("7", new Object[]{this})).longValue() : this.utcTimestamp;
    }

    public float getX() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Float) iSurgeon.surgeon$dispatch("1", new Object[]{this})).floatValue() : this.f62061x;
    }

    public float getY() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Float) iSurgeon.surgeon$dispatch("3", new Object[]{this})).floatValue() : this.f62062y;
    }

    public float getZ() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Float) iSurgeon.surgeon$dispatch("5", new Object[]{this})).floatValue() : this.f62063z;
    }

    @Override // me.ele.aiot.pedestriandeadreckoning.api.IJson
    public IJson parseJson(JSONObject jSONObject) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            return (IJson) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            try {
                this.f62061x = jSONObject.getFloat(DictionaryKeys.CTRLXY_X).floatValue();
                this.f62062y = jSONObject.getFloat(DictionaryKeys.CTRLXY_Y).floatValue();
                this.f62063z = jSONObject.getFloat("z").floatValue();
                this.utcTimestamp = jSONObject.getLong("utcTimestamp").longValue();
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public void setUtcTimestamp(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Long.valueOf(j12)});
        } else {
            this.utcTimestamp = j12;
        }
    }

    public void setX(float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Float.valueOf(f12)});
        } else {
            this.f62061x = f12;
        }
    }

    public void setY(float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Float.valueOf(f12)});
        } else {
            this.f62062y = f12;
        }
    }

    public void setZ(float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Float.valueOf(f12)});
        } else {
            this.f62063z = f12;
        }
    }

    @Override // me.ele.aiot.pedestriandeadreckoning.api.IJson
    public JSONObject toJSONObject() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (JSONObject) iSurgeon.surgeon$dispatch("9", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DictionaryKeys.CTRLXY_X, (Object) Float.valueOf(this.f62061x));
        jSONObject.put(DictionaryKeys.CTRLXY_Y, (Object) Float.valueOf(this.f62062y));
        jSONObject.put("z", (Object) Float.valueOf(this.f62063z));
        jSONObject.put("utcTimestamp", (Object) Long.valueOf(this.utcTimestamp));
        return jSONObject;
    }
}
