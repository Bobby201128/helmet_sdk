package me.ele.aiot.indoorguide.database.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.android.agoo.common.AgooConstants;

@Entity
/* loaded from: classes4.dex */
public class SceneDataInfo implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: id, reason: collision with root package name */
    @NonNull
    @SerializedName("id")
    @PrimaryKey
    @ColumnInfo
    int f61978id;

    @SerializedName("request_ntp_time")
    @ColumnInfo
    @JSONField(name = "request_ntp_time")
    long request_ntp_time;

    @NonNull
    @SerializedName("request_params")
    @ColumnInfo
    @JSONField(name = "request_params")
    String request_params;

    @SerializedName("response_ntp_time")
    @ColumnInfo
    @JSONField(name = "response_ntp_time")
    long response_ntp_time;

    @NonNull
    @SerializedName("response_params")
    @ColumnInfo
    @JSONField(name = "response_params")
    String response_params;

    @NonNull
    @SerializedName("scene_type")
    @ColumnInfo
    @JSONField(name = "scene_type")
    String scene_type;

    public SceneDataInfo(int i12, @NonNull String str, @NonNull long j12, @NonNull String str2, @NonNull long j13, @NonNull String str3) {
        this.f61978id = i12;
        this.scene_type = str;
        this.request_ntp_time = j12;
        this.request_params = str2;
        this.response_ntp_time = j13;
        this.response_params = str3;
    }

    public int getId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.f61978id;
    }

    @NonNull
    public long getRequest_ntp_time() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Long) iSurgeon.surgeon$dispatch("5", new Object[]{this})).longValue() : this.request_ntp_time;
    }

    @NonNull
    public String getRequest_params() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.request_params;
    }

    @NonNull
    public long getResponse_ntp_time() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Long) iSurgeon.surgeon$dispatch("9", new Object[]{this})).longValue() : this.response_ntp_time;
    }

    @NonNull
    public String getResponse_params() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.response_params;
    }

    @NonNull
    public String getScene_type() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.scene_type;
    }

    public void setId(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.f61978id = i12;
        }
    }

    public void setRequest_ntp_time(@NonNull long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.request_ntp_time = j12;
        }
    }

    public void setRequest_params(@NonNull String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
        } else {
            this.request_params = str;
        }
    }

    public void setResponse_ntp_time(@NonNull long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Long.valueOf(j12)});
        } else {
            this.response_ntp_time = j12;
        }
    }

    public void setResponse_params(@NonNull String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
        } else {
            this.response_params = str;
        }
    }

    public void setScene_type(@NonNull String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.scene_type = str;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            return (String) iSurgeon.surgeon$dispatch("13", new Object[]{this});
        }
        return "SceneDataInfo{id=" + this.f61978id + ", scene_type='" + this.scene_type + "', request_ntp_time='" + this.request_ntp_time + "', request_params='" + this.request_params + "', response_ntp_time='" + this.response_ntp_time + "', response_params='" + this.response_params + "'}";
    }

    @Ignore
    public SceneDataInfo(@NonNull String str, @NonNull long j12, @NonNull String str2, @NonNull long j13, @NonNull String str3) {
        this.scene_type = str;
        this.request_ntp_time = j12;
        this.request_params = str2;
        this.response_ntp_time = j13;
        this.response_params = str3;
    }
}
