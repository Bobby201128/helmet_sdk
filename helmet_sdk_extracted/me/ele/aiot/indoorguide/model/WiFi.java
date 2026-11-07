package me.ele.aiot.indoorguide.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import com.nirvana.tools.logger.cache.db.DBHelpTool;
import java.io.Serializable;
import java.util.Arrays;
import org.android.agoo.common.AgooConstants;

@Keep
/* loaded from: classes4.dex */
public class WiFi implements Serializable, IJson {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName(DispatchConstants.BSSID)
    String bssid;

    @SerializedName("currentTimestamp")
    long currentTimestamp;

    @SerializedName(DBHelpTool.RecordEntry.COLUMN_NAME_LEVEL)
    int level;

    @SerializedName("ssid")
    String ssid;

    @SerializedName("timestamp")
    long timestamp;

    public WiFi(String str, String str2, int i12, long j12, long j13) {
        this.bssid = str;
        this.ssid = str2;
        this.level = i12;
        this.timestamp = j12;
        this.currentTimestamp = j13;
    }

    public boolean equals(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("11", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WiFi wiFi = (WiFi) obj;
        if (this.level == wiFi.level && this.timestamp == wiFi.timestamp && TextUtils.equals(this.bssid, wiFi.bssid) && TextUtils.equals(this.ssid, wiFi.ssid)) {
            return true;
        }
        return false;
    }

    public String getBssid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.bssid;
    }

    public long getCurrentTimestamp() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Long) iSurgeon.surgeon$dispatch("9", new Object[]{this})).longValue() : this.currentTimestamp;
    }

    public int getLevel() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.level;
    }

    public String getSsid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.ssid;
    }

    public long getTimestamp() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Long) iSurgeon.surgeon$dispatch("7", new Object[]{this})).longValue() : this.timestamp;
    }

    public int hashCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "12") ? ((Integer) iSurgeon.surgeon$dispatch("12", new Object[]{this})).intValue() : Arrays.hashCode(new Object[]{this.bssid, this.ssid, Integer.valueOf(this.level), Long.valueOf(this.timestamp)});
    }

    @Override // me.ele.aiot.indoorguide.model.IJson
    public IJson parseJson(JSONObject jSONObject) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            return (IJson) iSurgeon.surgeon$dispatch("15", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this;
        }
        try {
            this.bssid = jSONObject.getString(DispatchConstants.BSSID);
            this.ssid = jSONObject.getString("ssid");
            this.level = jSONObject.getIntValue(DBHelpTool.RecordEntry.COLUMN_NAME_LEVEL);
            this.timestamp = jSONObject.getLongValue("timestamp");
            this.currentTimestamp = jSONObject.getLongValue("currentTimestamp");
        } catch (Throwable unused) {
        }
        return this;
    }

    public void setBssid(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.bssid = str;
        }
    }

    public void setCurrentTimestamp(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Long.valueOf(j12)});
        } else {
            this.currentTimestamp = j12;
        }
    }

    public void setLevel(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.level = i12;
        }
    }

    public void setSsid(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.ssid = str;
        }
    }

    public void setTimestamp(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Long.valueOf(j12)});
        } else {
            this.timestamp = j12;
        }
    }

    @Override // me.ele.aiot.indoorguide.model.IJson
    public JSONObject toJSONObject() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            return (JSONObject) iSurgeon.surgeon$dispatch("14", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DispatchConstants.BSSID, (Object) this.bssid);
        jSONObject.put("ssid", (Object) this.ssid);
        jSONObject.put(DBHelpTool.RecordEntry.COLUMN_NAME_LEVEL, (Object) Integer.valueOf(this.level));
        jSONObject.put("timestamp", (Object) Long.valueOf(this.timestamp));
        jSONObject.put("currentTimestamp", (Object) Long.valueOf(this.currentTimestamp));
        return jSONObject;
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? (String) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : toJSONObject().toJSONString();
    }
}
