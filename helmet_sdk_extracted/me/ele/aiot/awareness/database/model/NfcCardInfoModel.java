package me.ele.aiot.awareness.database.model;

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
public class NfcCardInfoModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("deviceCode")
    @ColumnInfo
    @JSONField(name = "deviceCode")
    String deviceCode;

    @SerializedName("retailerId")
    @ColumnInfo
    @JSONField(name = "retailerId")
    String retailerId;

    @SerializedName("saveTime")
    @ColumnInfo
    @JSONField(name = "saveTime")
    long saveTime;

    @SerializedName("secret")
    @ColumnInfo
    @JSONField(name = "secret")
    String secret;

    @NonNull
    @SerializedName("uid")
    @PrimaryKey
    @ColumnInfo
    @JSONField(name = "uid")
    String uid;

    public NfcCardInfoModel(@NonNull String str, String str2, String str3, String str4, long j12) {
        this.uid = str;
        this.secret = str2;
        this.deviceCode = str3;
        this.retailerId = str4;
        this.saveTime = j12;
    }

    public String getDeviceCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.deviceCode;
    }

    public String getRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.retailerId;
    }

    public long getSaveTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Long) iSurgeon.surgeon$dispatch("9", new Object[]{this})).longValue() : this.saveTime;
    }

    public String getSecret() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.secret;
    }

    @NonNull
    public String getUid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.uid;
    }

    public void setDeviceCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.deviceCode = str;
        }
    }

    public void setRetailerId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
        } else {
            this.retailerId = str;
        }
    }

    public void setSaveTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Long.valueOf(j12)});
        } else {
            this.saveTime = j12;
        }
    }

    public void setSecret(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.secret = str;
        }
    }

    public void setUid(@NonNull String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.uid = str;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            return (String) iSurgeon.surgeon$dispatch("11", new Object[]{this});
        }
        return "NfcCardInfoModel{uid='" + this.uid + "', secret='" + this.secret + "', deviceCode='" + this.deviceCode + "', retailerId='" + this.retailerId + "', saveTime=" + this.saveTime + '}';
    }

    @Ignore
    public NfcCardInfoModel(@NonNull String str) {
        this.uid = str;
    }
}
