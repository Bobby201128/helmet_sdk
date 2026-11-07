package me.ele.aiot.sensor.model;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import me.ele.normandie.sampling.collector.ModelContainer;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class HeartBeatModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("angle")
    private int angle;

    @SerializedName("battery")
    private int battery;

    @SerializedName("bluetoothVersion")
    private String bluetoothVersion;

    @SerializedName("cautionLightMode")
    private int cautionLightMode;

    @SerializedName(ModelContainer.CITY_ID)
    private int cityId;

    @SerializedName("collectIndex")
    private long collectIndex;

    @SerializedName("collectTime")
    private long collectTime;

    @SerializedName(ModelContainer.DEVICE_BRAND)
    private String deviceBrand;

    @SerializedName("deviceCode")
    private String deviceCode;

    @SerializedName("fallOverValue")
    private int fallOverValue;

    @SerializedName("frequency")
    private int frequency;

    @SerializedName("hardwareVersion")
    private String hardwareVersion;

    @SerializedName("infraredDetectionState")
    private int infraredDetectionState;

    @SerializedName("isBleBroadcast")
    private boolean isBleBroadcast;

    @SerializedName("lightIntensity")
    private int lightIntensity;

    @SerializedName("pdrDetails")
    private List<PdrDetailModel> pdrDetailModelList;

    @SerializedName("platform")
    private String platform;

    @SerializedName("pressure")
    private float pressure;

    @SerializedName("runStatus")
    private String runStatus;

    @SerializedName("sdkVersion")
    private String sdkVersion;

    @SerializedName(ModelContainer.SYSTEMVERSION)
    private String systemVersion;

    @SerializedName("temperature")
    private float temperature;

    @SerializedName("wearStatus")
    private int wearStatus;

    @SerializedName("wearingPosture")
    private int wearingPosture;

    public int getAngle() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "27") ? ((Integer) iSurgeon.surgeon$dispatch("27", new Object[]{this})).intValue() : this.angle;
    }

    public int getBattery() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? ((Integer) iSurgeon.surgeon$dispatch("11", new Object[]{this})).intValue() : this.battery;
    }

    public String getBluetoothVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "31") ? (String) iSurgeon.surgeon$dispatch("31", new Object[]{this}) : this.bluetoothVersion;
    }

    public int getCautionLightMode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Integer) iSurgeon.surgeon$dispatch("9", new Object[]{this})).intValue() : this.cautionLightMode;
    }

    public int getCityId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "35") ? ((Integer) iSurgeon.surgeon$dispatch("35", new Object[]{this})).intValue() : this.cityId;
    }

    public long getCollectIndex() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[]{this})).longValue() : this.collectIndex;
    }

    public long getCollectTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Long) iSurgeon.surgeon$dispatch("5", new Object[]{this})).longValue() : this.collectTime;
    }

    public String getDeviceBrand() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "43") ? (String) iSurgeon.surgeon$dispatch("43", new Object[]{this}) : this.deviceBrand;
    }

    public String getDeviceCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "29") ? (String) iSurgeon.surgeon$dispatch("29", new Object[]{this}) : this.deviceCode;
    }

    public int getFallOverValue() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL) ? ((Integer) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this})).intValue() : this.fallOverValue;
    }

    public int getFrequency() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.frequency;
    }

    public String getHardwareVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "33") ? (String) iSurgeon.surgeon$dispatch("33", new Object[]{this}) : this.hardwareVersion;
    }

    public int getInfraredDetectionState() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "25") ? ((Integer) iSurgeon.surgeon$dispatch("25", new Object[]{this})).intValue() : this.infraredDetectionState;
    }

    public int getLightIntensity() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? ((Integer) iSurgeon.surgeon$dispatch("13", new Object[]{this})).intValue() : this.lightIntensity;
    }

    public List<PdrDetailModel> getPdrDetailModelList() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "45") ? (List) iSurgeon.surgeon$dispatch("45", new Object[]{this}) : this.pdrDetailModelList;
    }

    public String getPlatform() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "39") ? (String) iSurgeon.surgeon$dispatch("39", new Object[]{this}) : this.platform;
    }

    public float getPressure() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? ((Float) iSurgeon.surgeon$dispatch("15", new Object[]{this})).floatValue() : this.pressure;
    }

    public String getRunStatus() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "19") ? (String) iSurgeon.surgeon$dispatch("19", new Object[]{this}) : this.runStatus;
    }

    public String getSdkVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "41") ? (String) iSurgeon.surgeon$dispatch("41", new Object[]{this}) : this.sdkVersion;
    }

    public String getSystemVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "37") ? (String) iSurgeon.surgeon$dispatch("37", new Object[]{this}) : this.systemVersion;
    }

    public float getTemperature() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "17") ? ((Float) iSurgeon.surgeon$dispatch("17", new Object[]{this})).floatValue() : this.temperature;
    }

    public int getWearStatus() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.wearStatus;
    }

    public int getWearingPosture() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this})).intValue() : this.wearingPosture;
    }

    public boolean isBleBroadcast() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "47") ? ((Boolean) iSurgeon.surgeon$dispatch("47", new Object[]{this})).booleanValue() : this.isBleBroadcast;
    }

    public void setAngle(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "28")) {
            iSurgeon.surgeon$dispatch("28", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.angle = i12;
        }
    }

    public void setBattery(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.battery = i12;
        }
    }

    public void setBleBroadcast(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "48")) {
            iSurgeon.surgeon$dispatch("48", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.isBleBroadcast = z12;
        }
    }

    public void setBluetoothVersion(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "32")) {
            iSurgeon.surgeon$dispatch("32", new Object[]{this, str});
        } else {
            this.bluetoothVersion = str;
        }
    }

    public void setCautionLightMode(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.cautionLightMode = i12;
        }
    }

    public void setCityId(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "36")) {
            iSurgeon.surgeon$dispatch("36", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.cityId = i12;
        }
    }

    public void setCollectIndex(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.collectIndex = j12;
        }
    }

    public void setCollectTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.collectTime = j12;
        }
    }

    public void setDeviceBrand(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "44")) {
            iSurgeon.surgeon$dispatch("44", new Object[]{this, str});
        } else {
            this.deviceBrand = str;
        }
    }

    public void setDeviceCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "30")) {
            iSurgeon.surgeon$dispatch("30", new Object[]{this, str});
        } else {
            this.deviceCode = str;
        }
    }

    public void setFallOverValue(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.fallOverValue = i12;
        }
    }

    public void setFrequency(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.frequency = i12;
        }
    }

    public void setHardwareVersion(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "34")) {
            iSurgeon.surgeon$dispatch("34", new Object[]{this, str});
        } else {
            this.hardwareVersion = str;
        }
    }

    public void setInfraredDetectionState(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.infraredDetectionState = i12;
        }
    }

    public void setLightIntensity(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.lightIntensity = i12;
        }
    }

    public void setPdrDetailModelList(List<PdrDetailModel> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "46")) {
            iSurgeon.surgeon$dispatch("46", new Object[]{this, list});
        } else {
            this.pdrDetailModelList = list;
        }
    }

    public void setPlatform(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "40")) {
            iSurgeon.surgeon$dispatch("40", new Object[]{this, str});
        } else {
            this.platform = str;
        }
    }

    public void setPressure(float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, Float.valueOf(f12)});
        } else {
            this.pressure = f12;
        }
    }

    public void setRunStatus(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, str});
        } else {
            this.runStatus = str;
        }
    }

    public void setSdkVersion(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "42")) {
            iSurgeon.surgeon$dispatch("42", new Object[]{this, str});
        } else {
            this.sdkVersion = str;
        }
    }

    public void setSystemVersion(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "38")) {
            iSurgeon.surgeon$dispatch("38", new Object[]{this, str});
        } else {
            this.systemVersion = str;
        }
    }

    public void setTemperature(float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, Float.valueOf(f12)});
        } else {
            this.temperature = f12;
        }
    }

    public void setWearStatus(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.wearStatus = i12;
        }
    }

    public void setWearingPosture(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.wearingPosture = i12;
        }
    }
}
