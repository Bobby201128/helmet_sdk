package me.ele.aiot.indoorguide.database.model;

import android.text.TextUtils;
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
import java.io.File;
import java.io.Serializable;
import org.android.agoo.common.AgooConstants;

@Entity
/* loaded from: classes4.dex */
public class ModelInfo implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("featureModelHash")
    @ColumnInfo
    @JSONField(name = "featureModelHash")
    String featureModelHash;

    @SerializedName("featureModelLocalCachePath")
    @ColumnInfo
    @JSONField(name = "featureModelLocalCachePath")
    String featureModelLocalCachePath;

    @SerializedName("featureModelUrl")
    @ColumnInfo
    @JSONField(name = "featureModelUrl")
    String featureModelUrl;

    @SerializedName("featureModelVersion")
    @ColumnInfo
    @JSONField(name = "featureModelVersion")
    int featureModelVersion;

    @SerializedName("mallModelHash")
    @ColumnInfo
    @JSONField(name = "mallModelHash")
    String mallModelHash;

    @SerializedName("mallModelLocalCachePath")
    @ColumnInfo
    @JSONField(name = "mallModelLocalCachePath")
    String mallModelLocalCachePath;

    @SerializedName("mallModelUrl")
    @ColumnInfo
    @JSONField(name = "mallModelUrl")
    String mallModelUrl;

    @SerializedName("mallModelVersion")
    @ColumnInfo
    @JSONField(name = "mallModelVersion")
    int mallModelVersion;

    @SerializedName("mappingModelHash")
    @ColumnInfo
    @JSONField(name = "mappingModelHash")
    String mappingModelHash;

    @SerializedName("mappingModelLocalCachePath")
    @ColumnInfo
    @JSONField(name = "mappingModelLocalCachePath")
    String mappingModelLocalCachePath;

    @SerializedName("mappingModelUrl")
    @ColumnInfo
    @JSONField(name = "mappingModelUrl")
    String mappingModelUrl;

    @SerializedName("mappingModelVersion")
    @ColumnInfo
    @JSONField(name = "mappingModelVersion")
    int mappingModelVersion;

    @SerializedName("pmmlModelHash")
    @ColumnInfo
    @JSONField(name = "pmmlModelHash")
    String pmmlModelHash;

    @SerializedName("pmmlModelLocalCachePath")
    @ColumnInfo
    @JSONField(name = "pmmlModelLocalCachePath")
    String pmmlModelLocalCachePath;

    @SerializedName("pmmlModelUrl")
    @ColumnInfo
    @JSONField(name = "pmmlModelUrl")
    String pmmlModelUrl;

    @SerializedName("pmmlModelVersion")
    @ColumnInfo
    @JSONField(name = "pmmlModelVersion")
    int pmmlModelVersion;

    @NonNull
    @SerializedName("retailerId")
    @PrimaryKey
    @ColumnInfo
    @JSONField(name = "retailerId")
    String retailerId;

    public ModelInfo(@NonNull String str, String str2, String str3, int i12, String str4, String str5, String str6, int i13, String str7, String str8, String str9, int i14, String str10, String str11, String str12, int i15, String str13) {
        this.retailerId = str;
        this.mallModelUrl = str2;
        this.mallModelHash = str3;
        this.mallModelVersion = i12;
        this.mallModelLocalCachePath = str4;
        this.pmmlModelUrl = str5;
        this.pmmlModelHash = str6;
        this.pmmlModelVersion = i13;
        this.pmmlModelLocalCachePath = str7;
        this.mappingModelUrl = str8;
        this.mappingModelHash = str9;
        this.mappingModelVersion = i14;
        this.mappingModelLocalCachePath = str10;
        this.featureModelUrl = str11;
        this.featureModelHash = str12;
        this.featureModelVersion = i15;
        this.featureModelLocalCachePath = str13;
    }

    public String getFeatureModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "29") ? (String) iSurgeon.surgeon$dispatch("29", new Object[]{this}) : this.featureModelHash;
    }

    public String getFeatureModelLocalCachePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "33") ? (String) iSurgeon.surgeon$dispatch("33", new Object[]{this}) : this.featureModelLocalCachePath;
    }

    public String getFeatureModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "27") ? (String) iSurgeon.surgeon$dispatch("27", new Object[]{this}) : this.featureModelUrl;
    }

    public int getFeatureModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "31") ? ((Integer) iSurgeon.surgeon$dispatch("31", new Object[]{this})).intValue() : this.featureModelVersion;
    }

    public String getMallModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.mallModelHash;
    }

    public String getMallModelLocalCachePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (String) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.mallModelLocalCachePath;
    }

    public String getMallModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.mallModelUrl;
    }

    public int getMallModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.mallModelVersion;
    }

    public String getMappingModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL) ? (String) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this}) : this.mappingModelHash;
    }

    public String getMappingModelLocalCachePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "25") ? (String) iSurgeon.surgeon$dispatch("25", new Object[]{this}) : this.mappingModelLocalCachePath;
    }

    public String getMappingModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "19") ? (String) iSurgeon.surgeon$dispatch("19", new Object[]{this}) : this.mappingModelUrl;
    }

    public int getMappingModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this})).intValue() : this.mappingModelVersion;
    }

    public String getPmmlModelHash() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? (String) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : this.pmmlModelHash;
    }

    public String getPmmlModelLocalCachePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "17") ? (String) iSurgeon.surgeon$dispatch("17", new Object[]{this}) : this.pmmlModelLocalCachePath;
    }

    public String getPmmlModelUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.pmmlModelUrl;
    }

    public int getPmmlModelVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? ((Integer) iSurgeon.surgeon$dispatch("15", new Object[]{this})).intValue() : this.pmmlModelVersion;
    }

    @NonNull
    public String getRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.retailerId;
    }

    public boolean isFeatureModelLocalCacheExists() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "38") ? ((Boolean) iSurgeon.surgeon$dispatch("38", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(getFeatureModelLocalCachePath()) && new File(getFeatureModelLocalCachePath()).exists();
    }

    public boolean isMallModelLocalCacheExists() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "35") ? ((Boolean) iSurgeon.surgeon$dispatch("35", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(getMallModelLocalCachePath()) && new File(getMallModelLocalCachePath()).exists();
    }

    public boolean isMappingModelLocalCacheExists() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "37") ? ((Boolean) iSurgeon.surgeon$dispatch("37", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(getMappingModelLocalCachePath()) && new File(getMappingModelLocalCachePath()).exists();
    }

    public boolean isPmmlModelLocalCacheExists() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "36") ? ((Boolean) iSurgeon.surgeon$dispatch("36", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(getPmmlModelLocalCachePath()) && new File(getPmmlModelLocalCachePath()).exists();
    }

    public void setFeatureModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "30")) {
            iSurgeon.surgeon$dispatch("30", new Object[]{this, str});
        } else {
            this.featureModelHash = str;
        }
    }

    public void setFeatureModelLocalCachePath(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "34")) {
            iSurgeon.surgeon$dispatch("34", new Object[]{this, str});
        } else {
            this.featureModelLocalCachePath = str;
        }
    }

    public void setFeatureModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "28")) {
            iSurgeon.surgeon$dispatch("28", new Object[]{this, str});
        } else {
            this.featureModelUrl = str;
        }
    }

    public void setFeatureModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "32")) {
            iSurgeon.surgeon$dispatch("32", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.featureModelVersion = i12;
        }
    }

    public void setMallModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.mallModelHash = str;
        }
    }

    public void setMallModelLocalCachePath(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str});
        } else {
            this.mallModelLocalCachePath = str;
        }
    }

    public void setMallModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.mallModelUrl = str;
        }
    }

    public void setMallModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.mallModelVersion = i12;
        }
    }

    public void setMappingModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this, str});
        } else {
            this.mappingModelHash = str;
        }
    }

    public void setMappingModelLocalCachePath(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this, str});
        } else {
            this.mappingModelLocalCachePath = str;
        }
    }

    public void setMappingModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, str});
        } else {
            this.mappingModelUrl = str;
        }
    }

    public void setMappingModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.mappingModelVersion = i12;
        }
    }

    public void setPmmlModelHash(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, str});
        } else {
            this.pmmlModelHash = str;
        }
    }

    public void setPmmlModelLocalCachePath(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, str});
        } else {
            this.pmmlModelLocalCachePath = str;
        }
    }

    public void setPmmlModelUrl(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
        } else {
            this.pmmlModelUrl = str;
        }
    }

    public void setPmmlModelVersion(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.pmmlModelVersion = i12;
        }
    }

    public void setRetailerId(@NonNull String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.retailerId = str;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "39")) {
            return (String) iSurgeon.surgeon$dispatch("39", new Object[]{this});
        }
        return "ModelInfo{retailerId='" + this.retailerId + "', mallModelUrl='" + this.mallModelUrl + "', mallModelHash='" + this.mallModelHash + "', mallModelVersion=" + this.mallModelVersion + ", mallModelLocalCachePath='" + this.mallModelLocalCachePath + "', pmmlModelUrl='" + this.pmmlModelUrl + "', pmmlModelHash='" + this.pmmlModelHash + "', pmmlModelVersion=" + this.pmmlModelVersion + ", pmmlModelLocalCachePath='" + this.pmmlModelLocalCachePath + "', mappingModelUrl='" + this.mappingModelUrl + "', mappingModelHash='" + this.mappingModelHash + "', mappingModelVersion=" + this.mappingModelVersion + ", mappingModelLocalCachePath='" + this.mappingModelLocalCachePath + "', featureModelUrl='" + this.featureModelUrl + "', featureModelHash='" + this.featureModelHash + "', featureModelVersion=" + this.featureModelVersion + ", featureModelLocalCachePath='" + this.featureModelLocalCachePath + "'}";
    }

    @Ignore
    public ModelInfo(@NonNull String str) {
        this.retailerId = str;
    }
}
