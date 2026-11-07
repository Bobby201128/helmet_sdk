package me.ele.aiot.home.ui.model;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class DeviceInfo implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private String deviceCode;
    private boolean isConnected;
    private boolean isGuide;
    private boolean isWearComplete;
    private String macAddress;
    private int powerBattery;
    private String productTypeKey;
    private String productTypeKeyDesc;

    public DeviceInfo(String str, String str2, boolean z12) {
        this.powerBattery = -1;
        this.productTypeKey = str;
        this.productTypeKeyDesc = str2;
        this.isGuide = z12;
    }

    public String getDeviceCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.deviceCode;
    }

    public String getMacAddress() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.macAddress;
    }

    public int getPowerBattery() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? ((Integer) iSurgeon.surgeon$dispatch("11", new Object[]{this})).intValue() : this.powerBattery;
    }

    public String getProductTypeKey() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.productTypeKey;
    }

    public String getProductTypeKeyDesc() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.productTypeKeyDesc;
    }

    public boolean isConnected() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Boolean) iSurgeon.surgeon$dispatch("9", new Object[]{this})).booleanValue() : this.isConnected;
    }

    public boolean isGuide() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? ((Boolean) iSurgeon.surgeon$dispatch("15", new Object[]{this})).booleanValue() : this.isGuide;
    }

    public boolean isWearComplete() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? ((Boolean) iSurgeon.surgeon$dispatch("13", new Object[]{this})).booleanValue() : this.isWearComplete;
    }

    public void setConnected(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.isConnected = z12;
        }
    }

    public void setDeviceCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.deviceCode = str;
        }
    }

    public void setGuide(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.isGuide = z12;
        }
    }

    public void setMacAddress(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
        } else {
            this.macAddress = str;
        }
    }

    public void setPowerBattery(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.powerBattery = i12;
        }
    }

    public void setProductTypeKey(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.productTypeKey = str;
        }
    }

    public void setProductTypeKeyDesc(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.productTypeKeyDesc = str;
        }
    }

    public void setWearComplete(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.isWearComplete = z12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            return (String) iSurgeon.surgeon$dispatch("17", new Object[]{this});
        }
        return "DeviceInfo{deviceCode='" + this.deviceCode + "', productTypeKey='" + this.productTypeKey + "', productTypeKeyDesc='" + this.productTypeKeyDesc + "', macAddress='" + this.macAddress + "', isConnected=" + this.isConnected + ", powerBattery=" + this.powerBattery + ", isWearComplete=" + this.isWearComplete + ", isGuide=" + this.isGuide + '}';
    }

    public DeviceInfo(String str, String str2, String str3, String str4, boolean z12, int i12, boolean z13, boolean z14) {
        this.deviceCode = str;
        this.productTypeKey = str2;
        this.productTypeKeyDesc = str3;
        this.macAddress = str4;
        this.isConnected = z12;
        this.powerBattery = i12;
        this.isWearComplete = z13;
        this.isGuide = z14;
    }
}
