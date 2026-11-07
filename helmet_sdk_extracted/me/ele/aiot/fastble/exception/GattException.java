package me.ele.aiot.fastble.exception;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class GattException extends BleException {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private int gattStatus;

    public GattException(int i12) {
        super(101, "Gatt Exception Occurred! ");
        this.gattStatus = i12;
    }

    public int getGattStatus() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.gattStatus;
    }

    public GattException setGattStatus(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (GattException) iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        }
        this.gattStatus = i12;
        return this;
    }

    @Override // me.ele.aiot.fastble.exception.BleException
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (String) iSurgeon.surgeon$dispatch("3", new Object[]{this});
        }
        return "GattException{gattStatus=" + this.gattStatus + "} " + super.toString();
    }
}
