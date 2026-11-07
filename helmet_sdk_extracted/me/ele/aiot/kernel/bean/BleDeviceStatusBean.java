package me.ele.aiot.kernel.bean;

import androidx.annotation.NonNull;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.aiot.kernel.constants.BleDeviceStatusEnum;
import me.ele.aiot.kernel.constants.BleDeviceTypeEnum;

/* loaded from: classes4.dex */
public class BleDeviceStatusBean {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    BleDeviceStatusEnum bleDeviceStatusEnum;
    BleDeviceTypeEnum bleDeviceTypeEnum;

    public BleDeviceStatusBean(BleDeviceTypeEnum bleDeviceTypeEnum, BleDeviceStatusEnum bleDeviceStatusEnum) {
        this.bleDeviceTypeEnum = bleDeviceTypeEnum;
        this.bleDeviceStatusEnum = bleDeviceStatusEnum;
    }

    public BleDeviceStatusEnum getBleDeviceStatusEnum() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (BleDeviceStatusEnum) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.bleDeviceStatusEnum;
    }

    public BleDeviceTypeEnum getBleDeviceTypeEnum() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (BleDeviceTypeEnum) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.bleDeviceTypeEnum;
    }

    public void setBleDeviceStatusEnum(BleDeviceStatusEnum bleDeviceStatusEnum) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, bleDeviceStatusEnum});
        } else {
            this.bleDeviceStatusEnum = bleDeviceStatusEnum;
        }
    }

    public void setBleDeviceTypeEnum(BleDeviceTypeEnum bleDeviceTypeEnum) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, bleDeviceTypeEnum});
        } else {
            this.bleDeviceTypeEnum = bleDeviceTypeEnum;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "BleDeviceStatusBean{bleDeviceTypeEnum=" + this.bleDeviceTypeEnum + ", bleDeviceStatusEnum=" + this.bleDeviceStatusEnum + '}';
    }
}
