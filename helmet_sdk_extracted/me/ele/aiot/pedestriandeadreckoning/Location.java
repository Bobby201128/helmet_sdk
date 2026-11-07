package me.ele.aiot.pedestriandeadreckoning;

import androidx.annotation.NonNull;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class Location implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("address")
    private String address;

    @SerializedName("adjusted")
    private boolean adjusted;

    @SerializedName("adjustedType")
    private int adjustedType;

    @SerializedName("Altitude")
    private double altitude;

    @SerializedName("CacheType")
    private int cacheType;

    @SerializedName("cityCode")
    private String cityCode;

    @SerializedName("cityName")
    private String cityName;

    @SerializedName("correctTime")
    private long correctTime;

    @SerializedName("Course")
    private double course;

    @SerializedName("from")
    private int from;

    @SerializedName("gpsCount")
    private int gpsCount;

    @SerializedName("gpsTime")
    private long gpsTime;

    @SerializedName("HAccuracy")
    private double hAccuracy;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private String f62054id;

    @SerializedName("inWorkarea")
    private int inWorkarea;

    @SerializedName("Latitude")
    private double latitude;

    @SerializedName("LocationType")
    private int locationType;

    @SerializedName("Longitude")
    private double longitude;

    @SerializedName("motionAltitude")
    private double motionAltitude;

    @SerializedName("Speed")
    private double speed;

    @SerializedName("strategyType")
    private int strategyType;

    @SerializedName("time")
    private long time;

    @SerializedName("uploadStage")
    private int uploadStage;

    @SerializedName("userId")
    private String userId;

    @SerializedName("UTC")
    private long utc;

    @SerializedName("workStatus")
    private int workStatus;

    public String getAddress() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.address;
    }

    public int getAdjustedType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.adjustedType;
    }

    public double getAltitude() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Double) iSurgeon.surgeon$dispatch("9", new Object[]{this})).doubleValue() : this.altitude;
    }

    public int getCacheType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? ((Integer) iSurgeon.surgeon$dispatch("13", new Object[]{this})).intValue() : this.cacheType;
    }

    public String getCityCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? (String) iSurgeon.surgeon$dispatch("15", new Object[]{this}) : this.cityCode;
    }

    public String getCityName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "17") ? (String) iSurgeon.surgeon$dispatch("17", new Object[]{this}) : this.cityName;
    }

    public long getCorrectTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "19") ? ((Long) iSurgeon.surgeon$dispatch("19", new Object[]{this})).longValue() : this.correctTime;
    }

    public double getCourse() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? ((Double) iSurgeon.surgeon$dispatch("11", new Object[]{this})).doubleValue() : this.course;
    }

    public int getFrom() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL) ? ((Integer) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this})).intValue() : this.from;
    }

    public int getGpsCount() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this})).intValue() : this.gpsCount;
    }

    public long getGpsTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "25") ? ((Long) iSurgeon.surgeon$dispatch("25", new Object[]{this})).longValue() : this.gpsTime;
    }

    public double getHAccuracy() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Double) iSurgeon.surgeon$dispatch("1", new Object[]{this})).doubleValue() : this.hAccuracy;
    }

    public String getId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "27") ? (String) iSurgeon.surgeon$dispatch("27", new Object[]{this}) : this.f62054id;
    }

    public int getInWorkarea() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "29") ? ((Integer) iSurgeon.surgeon$dispatch("29", new Object[]{this})).intValue() : this.inWorkarea;
    }

    public double getLatitude() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "31") ? ((Double) iSurgeon.surgeon$dispatch("31", new Object[]{this})).doubleValue() : this.latitude;
    }

    public int getLocationType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "33") ? ((Integer) iSurgeon.surgeon$dispatch("33", new Object[]{this})).intValue() : this.locationType;
    }

    public double getLongitude() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "35") ? ((Double) iSurgeon.surgeon$dispatch("35", new Object[]{this})).doubleValue() : this.longitude;
    }

    public double getMotionAltitude() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "37") ? ((Double) iSurgeon.surgeon$dispatch("37", new Object[]{this})).doubleValue() : this.motionAltitude;
    }

    public double getSpeed() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "39") ? ((Double) iSurgeon.surgeon$dispatch("39", new Object[]{this})).doubleValue() : this.speed;
    }

    public int getStrategyType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "41") ? ((Integer) iSurgeon.surgeon$dispatch("41", new Object[]{this})).intValue() : this.strategyType;
    }

    public long getTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "43") ? ((Long) iSurgeon.surgeon$dispatch("43", new Object[]{this})).longValue() : this.time;
    }

    public int getUploadStage() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "45") ? ((Integer) iSurgeon.surgeon$dispatch("45", new Object[]{this})).intValue() : this.uploadStage;
    }

    public String getUserId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "47") ? (String) iSurgeon.surgeon$dispatch("47", new Object[]{this}) : this.userId;
    }

    public long getUtc() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "49") ? ((Long) iSurgeon.surgeon$dispatch("49", new Object[]{this})).longValue() : this.utc;
    }

    public int getWorkStatus() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "51") ? ((Integer) iSurgeon.surgeon$dispatch("51", new Object[]{this})).intValue() : this.workStatus;
    }

    public boolean isAdjusted() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[]{this})).booleanValue() : this.adjusted;
    }

    public void setAddress(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.address = str;
        }
    }

    public void setAdjusted(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.adjusted = z12;
        }
    }

    public void setAdjustedType(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.adjustedType = i12;
        }
    }

    public void setAltitude(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Double.valueOf(d12)});
        } else {
            this.altitude = d12;
        }
    }

    public void setCacheType(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.cacheType = i12;
        }
    }

    public void setCityCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, str});
        } else {
            this.cityCode = str;
        }
    }

    public void setCityName(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, str});
        } else {
            this.cityName = str;
        }
    }

    public void setCorrectTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.correctTime = j12;
        }
    }

    public void setCourse(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.course = d12;
        }
    }

    public void setFrom(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.from = i12;
        }
    }

    public void setGpsCount(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.gpsCount = i12;
        }
    }

    public void setGpsTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.gpsTime = j12;
        }
    }

    public void setHAccuracy(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.hAccuracy = d12;
        }
    }

    public void setId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "28")) {
            iSurgeon.surgeon$dispatch("28", new Object[]{this, str});
        } else {
            this.f62054id = str;
        }
    }

    public void setInWorkarea(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "30")) {
            iSurgeon.surgeon$dispatch("30", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.inWorkarea = i12;
        }
    }

    public void setLatitude(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "32")) {
            iSurgeon.surgeon$dispatch("32", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.latitude = d12;
        }
    }

    public void setLocationType(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "34")) {
            iSurgeon.surgeon$dispatch("34", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.locationType = i12;
        }
    }

    public void setLongitude(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "36")) {
            iSurgeon.surgeon$dispatch("36", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.longitude = d12;
        }
    }

    public void setMotionAltitude(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "38")) {
            iSurgeon.surgeon$dispatch("38", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.motionAltitude = d12;
        }
    }

    public void setSpeed(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "40")) {
            iSurgeon.surgeon$dispatch("40", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.speed = d12;
        }
    }

    public void setStrategyType(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "42")) {
            iSurgeon.surgeon$dispatch("42", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.strategyType = i12;
        }
    }

    public void setTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "44")) {
            iSurgeon.surgeon$dispatch("44", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.time = j12;
        }
    }

    public void setUploadStage(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "46")) {
            iSurgeon.surgeon$dispatch("46", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.uploadStage = i12;
        }
    }

    public void setUserId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "48")) {
            iSurgeon.surgeon$dispatch("48", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public void setUtc(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "50")) {
            iSurgeon.surgeon$dispatch("50", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.utc = j12;
        }
    }

    public void setWorkStatus(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "52")) {
            iSurgeon.surgeon$dispatch("52", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.workStatus = i12;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "53")) {
            return (String) iSurgeon.surgeon$dispatch("53", new Object[]{this});
        }
        return "Location{latitude:" + this.latitude + ", longitude:" + this.longitude + ", hAccuracy:" + this.hAccuracy + ", locationType:" + this.locationType + ", utc:" + this.utc + ", time:" + this.time + ", userId:'" + this.userId + "', workStatus:" + this.workStatus + '}';
    }
}
