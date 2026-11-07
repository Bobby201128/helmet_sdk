package me.ele.aiot.kernel.bean;

import androidx.annotation.NonNull;
import com.ali.user.open.ucc.data.ApiConstants;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import com.taobao.accs.common.Constants;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class BondedHeadset implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName(ApiConstants.ApiField.DEVICE_NAME)
    private String deviceName;

    @SerializedName(Constants.KYE_MAC_ADDRESS)
    private String macAddress;

    public String getDeviceName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.deviceName;
    }

    public String getMacAddress() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (String) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.macAddress;
    }

    public void setDeviceName(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, str});
        } else {
            this.deviceName = str;
        }
    }

    public void setMacAddress(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.macAddress = str;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "BondedHeadset{deviceName='" + this.deviceName + "', macAddress='" + this.macAddress + "'}";
    }
}
