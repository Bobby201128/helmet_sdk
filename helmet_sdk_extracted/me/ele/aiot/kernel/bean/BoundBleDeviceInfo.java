package me.ele.aiot.kernel.bean;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class BoundBleDeviceInfo implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName(Constants.KYE_MAC_ADDRESS)
    private String macAddress;

    @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_RESULT)
    private String statusCode;

    @SerializedName("typeCode")
    private int typeCode;

    public BoundBleDeviceInfo(String str, int i12, String str2) {
        this.macAddress = str;
        this.typeCode = i12;
        this.statusCode = str2;
    }

    public String getMacAddress() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.macAddress;
    }

    public String getStatusCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.statusCode;
    }

    public int getTypeCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.typeCode;
    }

    public void setMacAddress(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.macAddress = str;
        }
    }

    public void setStatusCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.statusCode = str;
        }
    }

    public void setTypeCode(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.typeCode = i12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
        }
        return "BoundBleDeviceInfo{macAddress='" + this.macAddress + "', typeCode=" + this.typeCode + ", statusCode='" + this.statusCode + "'}";
    }
}
