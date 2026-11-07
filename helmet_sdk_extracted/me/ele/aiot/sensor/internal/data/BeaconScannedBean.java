package me.ele.aiot.sensor.internal.data;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import me.ele.normandie.sampling.collector.ModelContainer;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class BeaconScannedBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("appReportTime")
    private long appReportTime;

    @SerializedName("beaconList")
    private List<BeaconInfoBean> beaconList;

    @SerializedName(ModelContainer.CITY_ID)
    private int cityId;

    @SerializedName("dataSource")
    private int dataSource;

    @SerializedName("deviceCode")
    private String deviceCode;

    @SerializedName("reportTime")
    private long reportTime;

    public long getAppReportTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Long) iSurgeon.surgeon$dispatch("7", new Object[]{this})).longValue() : this.appReportTime;
    }

    public List<BeaconInfoBean> getBeaconList() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (List) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.beaconList;
    }

    public int getCityId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.cityId;
    }

    public int getDataSource() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.dataSource;
    }

    public String getDeviceCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (String) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.deviceCode;
    }

    public long getReportTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[]{this})).longValue() : this.reportTime;
    }

    public void setAppReportTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Long.valueOf(j12)});
        } else {
            this.appReportTime = j12;
        }
    }

    public void setBeaconList(List<BeaconInfoBean> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, list});
        } else {
            this.beaconList = list;
        }
    }

    public void setCityId(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.cityId = i12;
        }
    }

    public void setDataSource(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.dataSource = i12;
        }
    }

    public void setDeviceCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str});
        } else {
            this.deviceCode = str;
        }
    }

    public void setReportTime(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.reportTime = j12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            return (String) iSurgeon.surgeon$dispatch("13", new Object[]{this});
        }
        return "BeaconScannedBean{dataSource=" + this.dataSource + ", reportTime=" + this.reportTime + ", beaconList=" + this.beaconList + '}';
    }
}
