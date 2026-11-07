package me.ele.aiot.activityrecognition.database.model;

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
public class ModelInfo implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("elevatorHARModelHash")
    @ColumnInfo
    @JSONField(name = "elevatorHARModelHash")
    String elevatorHARModelHash;

    @SerializedName("elevatorHARModelLocalCachePath")
    @ColumnInfo
    @JSONField(name = "elevatorHARModelLocalCachePath")
    String elevatorHARModelLocalCachePath;

    @SerializedName("elevatorHARModelUrl")
    @ColumnInfo
    @JSONField(name = "elevatorHARModelUrl")
    String elevatorHARModelUrl;

    @SerializedName("elevatorHARModelVersion")
    @ColumnInfo
    @JSONField(name = "elevatorHARModelVersion")
    int elevatorHARModelVersion;

    @SerializedName("escalatorHARModelHash")
    @ColumnInfo
    @JSONField(name = "escalatorHARModelHash")
    String escalatorHARModelHash;

    @SerializedName("escalatorHARModelLocalCachePath")
    @ColumnInfo
    @JSONField(name = "escalatorHARModelLocalCachePath")
    String escalatorHARModelLocalCachePath;

    @SerializedName("escalatorHARModelUrl")
    @ColumnInfo
    @JSONField(name = "escalatorHARModelUrl")
    String escalatorHARModelUrl;

    @SerializedName("escalatorHARModelVersion")
    @ColumnInfo
    @JSONField(name = "escalatorHARModelVersion")
    int escalatorHARModelVersion;

    @SerializedName("horizontalHarModelHash")
    @ColumnInfo
    @JSONField(name = "horizontalHarModelHash")
    String horizontalHarModelHash;

    @SerializedName("horizontalHarModelLocalCachePath")
    @ColumnInfo
    @JSONField(name = "horizontalHarModelLocalCachePath")
    String horizontalHarModelLocalCachePath;

    @SerializedName("horizontalHarModelUrl")
    @ColumnInfo
    @JSONField(name = "horizontalHarModelUrl")
    String horizontalHarModelUrl;

    @SerializedName("horizontalHarModelVersion")
    @ColumnInfo
    @JSONField(name = "horizontalHarModelVersion")
    int horizontalHarModelVersion;

    @NonNull
    @SerializedName("knightId")
    @PrimaryKey
    @ColumnInfo
    @JSONField(name = "knightId")
    String knightId;

    @SerializedName("stairwayHARModelHash")
    @ColumnInfo
    @JSONField(name = "stairwayHARModelHash")
    String stairwayHARModelHash;

    @SerializedName("stairwayHARModelLocalCachePath")
    @ColumnInfo
    @JSONField(name = "stairwayHARModelLocalCachePath")
    String stairwayHARModelLocalCachePath;

    @SerializedName("stairwayHARModelUrl")
    @ColumnInfo
    @JSONField(name = "stairwayHARModelUrl")
    String stairwayHARModelUrl;

    @SerializedName("stairwayHARModelVersion")
    @ColumnInfo
    @JSONField(name = "stairwayHARModelVersion")
    int stairwayHARModelVersion;

    public ModelInfo(@NonNull String str, String str2, String str3, int i12, String str4, String str5, String str6, int i13, String str7, String str8, String str9, int i14, String str10, String str11, String str12, int i15, String str13) {
        this.knightId = str;
        this.horizontalHarModelUrl = str2;
        this.horizontalHarModelHash = str3;
        this.horizontalHarModelVersion = i12;
        this.horizontalHarModelLocalCachePath = str4;
        this.elevatorHARModelUrl = str5;
        this.elevatorHARModelHash = str6;
        this.elevatorHARModelVersion = i13;
        this.elevatorHARModelLocalCachePath = str7;
        this.escalatorHARModelUrl = str8;
        this.escalatorHARModelHash = str9;
        this.escalatorHARModelVersion = i14;
        this.escalatorHARModelLocalCachePath = str10;
        this.stairwayHARModelUrl = str11;
        this.stairwayHARModelHash = str12;
        this.stairwayHARModelVersion = i15;
        this.stairwayHARModelLocalCachePath = str13;
    }

    public String getElevatorHARModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? (String) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : this.elevatorHARModelHash;
    }

    public String getElevatorHARModelLocalCachePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "17") ? (String) iSurgeon.surgeon$dispatch("17", new Object[]{this}) : this.elevatorHARModelLocalCachePath;
    }

    public String getElevatorHARModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.elevatorHARModelUrl;
    }

    public int getElevatorHARModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? ((Integer) iSurgeon.surgeon$dispatch("15", new Object[]{this})).intValue() : this.elevatorHARModelVersion;
    }

    public String getEscalatorHARModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL) ? (String) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this}) : this.escalatorHARModelHash;
    }

    public String getEscalatorHARModelLocalCachePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "25") ? (String) iSurgeon.surgeon$dispatch("25", new Object[]{this}) : this.escalatorHARModelLocalCachePath;
    }

    public String getEscalatorHARModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "19") ? (String) iSurgeon.surgeon$dispatch("19", new Object[]{this}) : this.escalatorHARModelUrl;
    }

    public int getEscalatorHARModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this})).intValue() : this.escalatorHARModelVersion;
    }

    public String getHorizontalHarModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.horizontalHarModelHash;
    }

    public String getHorizontalHarModelLocalCachePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (String) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.horizontalHarModelLocalCachePath;
    }

    public String getHorizontalHarModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.horizontalHarModelUrl;
    }

    public int getHorizontalHarModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.horizontalHarModelVersion;
    }

    @NonNull
    public String getKnightId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.knightId;
    }

    public String getStairwayHARModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "29") ? (String) iSurgeon.surgeon$dispatch("29", new Object[]{this}) : this.stairwayHARModelHash;
    }

    public String getStairwayHARModelLocalCachePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "33") ? (String) iSurgeon.surgeon$dispatch("33", new Object[]{this}) : this.stairwayHARModelLocalCachePath;
    }

    public String getStairwayHARModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "27") ? (String) iSurgeon.surgeon$dispatch("27", new Object[]{this}) : this.stairwayHARModelUrl;
    }

    public int getStairwayHARModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "31") ? ((Integer) iSurgeon.surgeon$dispatch("31", new Object[]{this})).intValue() : this.stairwayHARModelVersion;
    }

    public void setElevatorHARModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, str});
        } else {
            this.elevatorHARModelHash = str;
        }
    }

    public void setElevatorHARModelLocalCachePath(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, str});
        } else {
            this.elevatorHARModelLocalCachePath = str;
        }
    }

    public void setElevatorHARModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
        } else {
            this.elevatorHARModelUrl = str;
        }
    }

    public void setElevatorHARModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.elevatorHARModelVersion = i12;
        }
    }

    public void setEscalatorHARModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this, str});
        } else {
            this.escalatorHARModelHash = str;
        }
    }

    public void setEscalatorHARModelLocalCachePath(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this, str});
        } else {
            this.escalatorHARModelLocalCachePath = str;
        }
    }

    public void setEscalatorHARModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, str});
        } else {
            this.escalatorHARModelUrl = str;
        }
    }

    public void setEscalatorHARModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.escalatorHARModelVersion = i12;
        }
    }

    public void setHorizontalHarModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.horizontalHarModelHash = str;
        }
    }

    public void setHorizontalHarModelLocalCachePath(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str});
        } else {
            this.horizontalHarModelLocalCachePath = str;
        }
    }

    public void setHorizontalHarModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.horizontalHarModelUrl = str;
        }
    }

    public void setHorizontalHarModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.horizontalHarModelVersion = i12;
        }
    }

    public void setKnightId(@NonNull String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.knightId = str;
        }
    }

    public void setStairwayHARModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "30")) {
            iSurgeon.surgeon$dispatch("30", new Object[]{this, str});
        } else {
            this.stairwayHARModelHash = str;
        }
    }

    public void setStairwayHARModelLocalCachePath(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "34")) {
            iSurgeon.surgeon$dispatch("34", new Object[]{this, str});
        } else {
            this.stairwayHARModelLocalCachePath = str;
        }
    }

    public void setStairwayHARModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "28")) {
            iSurgeon.surgeon$dispatch("28", new Object[]{this, str});
        } else {
            this.stairwayHARModelUrl = str;
        }
    }

    public void setStairwayHARModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "32")) {
            iSurgeon.surgeon$dispatch("32", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.stairwayHARModelVersion = i12;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "35")) {
            return (String) iSurgeon.surgeon$dispatch("35", new Object[]{this});
        }
        return "ModelInfo{knightId='" + this.knightId + "', horizontalHarModelUrl='" + this.horizontalHarModelUrl + "', horizontalHarModelHash='" + this.horizontalHarModelHash + "', horizontalHarModelVersion=" + this.horizontalHarModelVersion + ", horizontalHarModelLocalCachePath='" + this.horizontalHarModelLocalCachePath + "', elevatorHARModelUrl='" + this.elevatorHARModelUrl + "', elevatorHARModelHash='" + this.elevatorHARModelHash + "', elevatorHARModelVersion=" + this.elevatorHARModelVersion + ", elevatorHARModelLocalCachePath='" + this.elevatorHARModelLocalCachePath + "', escalatorHARModelUrl='" + this.escalatorHARModelUrl + "', escalatorHARModelHash='" + this.escalatorHARModelHash + "', escalatorHARModelVersion=" + this.escalatorHARModelVersion + ", escalatorHARModelLocalCachePath='" + this.escalatorHARModelLocalCachePath + "', stairwayHARModelUrl='" + this.stairwayHARModelUrl + "', stairwayHARModelHash='" + this.stairwayHARModelHash + "', stairwayHARModelVersion=" + this.stairwayHARModelVersion + ", stairwayHARModelLocalCachePath='" + this.stairwayHARModelLocalCachePath + "'}";
    }

    @Ignore
    public ModelInfo(@NonNull String str) {
        this.knightId = str;
    }
}
