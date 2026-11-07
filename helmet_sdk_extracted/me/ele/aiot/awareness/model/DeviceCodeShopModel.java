package me.ele.aiot.awareness.model;

import androidx.annotation.NonNull;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class DeviceCodeShopModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("deviceCode")
    private String deviceCode;

    @SerializedName("shopId")
    private String shopId;

    public String getDeviceCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.deviceCode;
    }

    public String getShopId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.shopId;
    }

    public void setDeviceCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.deviceCode = str;
        }
    }

    public void setShopId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.shopId = str;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "DeviceCodeShopModel{deviceCode='" + this.deviceCode + "', shopId='" + this.shopId + "'}";
    }
}
