package me.ele.aiot.awareness.algdata.model;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.amap.api.maps.model.MyLocationStyle;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import me.ele.aiot.awareness.api.IJson;
import me.ele.im.uikit.message.BaseMessageViewHolder;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class PointModel implements Serializable, IJson {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("accuracy")
    @JSONField(name = "accuracy")
    private double accuracy;

    @SerializedName(BaseMessageViewHolder.EXTRA_LATITUDE)
    @JSONField(name = BaseMessageViewHolder.EXTRA_LATITUDE)
    private double latitude;

    @SerializedName(MyLocationStyle.LOCATION_TYPE)
    @JSONField(name = MyLocationStyle.LOCATION_TYPE)
    private int locationType;

    @SerializedName(BaseMessageViewHolder.EXTRA_LONGITUDE)
    @JSONField(name = BaseMessageViewHolder.EXTRA_LONGITUDE)
    private double longitude;

    @SerializedName("recordTime")
    @JSONField(name = "recordTime")
    private long recordTime;

    @SerializedName("speed")
    @JSONField(name = "speed")
    private double speed;

    public double getAccuracy() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Double) iSurgeon.surgeon$dispatch("9", new Object[]{this})).doubleValue() : this.accuracy;
    }

    public double getLatitude() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Double) iSurgeon.surgeon$dispatch("3", new Object[]{this})).doubleValue() : this.latitude;
    }

    public int getLocationType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.locationType;
    }

    public double getLongitude() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Double) iSurgeon.surgeon$dispatch("1", new Object[]{this})).doubleValue() : this.longitude;
    }

    public long getRecordTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? ((Long) iSurgeon.surgeon$dispatch("11", new Object[]{this})).longValue() : this.recordTime;
    }

    public double getSpeed() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Double) iSurgeon.surgeon$dispatch("7", new Object[]{this})).doubleValue() : this.speed;
    }

    @Override // me.ele.aiot.awareness.api.IJson
    public IJson parseJson(JSONObject jSONObject) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            return (IJson) iSurgeon.surgeon$dispatch("14", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this;
        }
        try {
            this.longitude = jSONObject.getDoubleValue(BaseMessageViewHolder.EXTRA_LONGITUDE);
            this.latitude = jSONObject.getDoubleValue(BaseMessageViewHolder.EXTRA_LATITUDE);
            this.accuracy = jSONObject.getDoubleValue("accuracy");
            this.locationType = jSONObject.getIntValue(MyLocationStyle.LOCATION_TYPE);
            this.speed = jSONObject.getDoubleValue("speed");
            this.recordTime = jSONObject.getLongValue("recordTime");
        } catch (Throwable unused) {
        }
        return this;
    }

    public void setAccuracy(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Double.valueOf(d12)});
        } else {
            this.accuracy = d12;
        }
    }

    public void setLatitude(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.latitude = d12;
        }
    }

    public void setLocationType(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.locationType = i12;
        }
    }

    public void setLongitude(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.longitude = d12;
        }
    }

    public void setRecordTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.recordTime = j12;
        }
    }

    public void setSpeed(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Double.valueOf(d12)});
        } else {
            this.speed = d12;
        }
    }

    @Override // me.ele.aiot.awareness.api.IJson
    public JSONObject toJSONObject() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            return (JSONObject) iSurgeon.surgeon$dispatch("13", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseMessageViewHolder.EXTRA_LONGITUDE, (Object) Double.valueOf(this.longitude));
        jSONObject.put(BaseMessageViewHolder.EXTRA_LATITUDE, (Object) Double.valueOf(this.latitude));
        jSONObject.put("accuracy", (Object) Double.valueOf(this.accuracy));
        jSONObject.put(MyLocationStyle.LOCATION_TYPE, (Object) Integer.valueOf(this.locationType));
        jSONObject.put("speed", (Object) Double.valueOf(this.speed));
        jSONObject.put("recordTime", (Object) Long.valueOf(this.recordTime));
        return jSONObject;
    }
}
