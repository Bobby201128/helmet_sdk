package me.ele.aiot.indoorguide.database.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import me.ele.normandie.sampling.collector.ModelContainer;
import org.android.agoo.common.AgooConstants;

@Entity
/* loaded from: classes4.dex */
public class ConfigInfo implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("cacheMaxLogCount")
    @ColumnInfo
    @JSONField(name = "cacheMaxLogCount")
    int cacheMaxLogCount;

    @SerializedName(ModelContainer.CITY_ID)
    @ColumnInfo
    @JSONField(name = ModelContainer.CITY_ID)
    int cityId;

    @SerializedName("enable")
    @ColumnInfo
    @JSONField(name = "enable")
    boolean enable;

    @NonNull
    @SerializedName("ntpTime")
    @PrimaryKey
    @ColumnInfo
    @JSONField(name = "ntpTime")
    long ntpTime;

    @SerializedName("orientationRefreshInterval")
    @ColumnInfo
    @JSONField(name = "orientationRefreshInterval")
    int orientationRefreshInterval;

    @SerializedName("uploadLogCount")
    @ColumnInfo
    @JSONField(name = "uploadLogCount")
    int uploadLogCount;

    @SerializedName("uploadLogInterval")
    @ColumnInfo
    @JSONField(name = "uploadLogInterval")
    int uploadLogInterval;

    @SerializedName("useNewUploadLogic")
    @ColumnInfo
    @JSONField(name = "useNewUploadLogic")
    boolean useNewUploadLogic;

    public ConfigInfo(long j12, int i12, boolean z12, boolean z13, int i13, int i14, int i15, int i16) {
        this.ntpTime = j12;
        this.cityId = i12;
        this.enable = z12;
        this.useNewUploadLogic = z13;
        this.uploadLogCount = i13;
        this.cacheMaxLogCount = i14;
        this.uploadLogInterval = i15;
        this.orientationRefreshInterval = i16;
    }

    public int getCacheMaxLogCount() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? ((Integer) iSurgeon.surgeon$dispatch("11", new Object[]{this})).intValue() : this.cacheMaxLogCount;
    }

    public int getCityId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.cityId;
    }

    public long getNtpTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Long) iSurgeon.surgeon$dispatch("1", new Object[]{this})).longValue() : this.ntpTime;
    }

    public int getOrientationRefreshInterval() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? ((Integer) iSurgeon.surgeon$dispatch("15", new Object[]{this})).intValue() : this.orientationRefreshInterval;
    }

    public int getUploadLogCount() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Integer) iSurgeon.surgeon$dispatch("9", new Object[]{this})).intValue() : this.uploadLogCount;
    }

    public int getUploadLogInterval() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? ((Integer) iSurgeon.surgeon$dispatch("13", new Object[]{this})).intValue() : this.uploadLogInterval;
    }

    public boolean isEnable() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[]{this})).booleanValue() : this.enable;
    }

    public boolean isUseNewUploadLogic() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Boolean) iSurgeon.surgeon$dispatch("7", new Object[]{this})).booleanValue() : this.useNewUploadLogic;
    }

    public void setCacheMaxLogCount(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.cacheMaxLogCount = i12;
        }
    }

    public void setCityId(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.cityId = i12;
        }
    }

    public void setEnable(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.enable = z12;
        }
    }

    public void setNtpTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.ntpTime = j12;
        }
    }

    public void setOrientationRefreshInterval(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.orientationRefreshInterval = i12;
        }
    }

    public void setUploadLogCount(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.uploadLogCount = i12;
        }
    }

    public void setUploadLogInterval(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.uploadLogInterval = i12;
        }
    }

    public void setUseNewUploadLogic(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.useNewUploadLogic = z12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            return (String) iSurgeon.surgeon$dispatch("17", new Object[]{this});
        }
        return "ConfigInfo{ntpTime=" + this.ntpTime + ", cityId=" + this.cityId + ", enable=" + this.enable + ", useNewUploadLogic=" + this.useNewUploadLogic + ", uploadLogCount=" + this.uploadLogCount + ", cacheMaxLogCount=" + this.cacheMaxLogCount + ", uploadLogInterval=" + this.uploadLogInterval + ", orientationRefreshInterval=" + this.orientationRefreshInterval + '}';
    }
}
