package me.ele.aiot.fastble.exception;

import android.bluetooth.BluetoothGatt;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class ConnectException extends BleException {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private BluetoothGatt bluetoothGatt;
    private int gattStatus;

    public ConnectException(BluetoothGatt bluetoothGatt, int i12) {
        super(101, "Gatt Exception Occurred! ");
        this.bluetoothGatt = bluetoothGatt;
        this.gattStatus = i12;
    }

    public BluetoothGatt getBluetoothGatt() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (BluetoothGatt) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.bluetoothGatt;
    }

    public int getGattStatus() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.gattStatus;
    }

    public ConnectException setBluetoothGatt(BluetoothGatt bluetoothGatt) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (ConnectException) iSurgeon.surgeon$dispatch("4", new Object[]{this, bluetoothGatt});
        }
        this.bluetoothGatt = bluetoothGatt;
        return this;
    }

    public ConnectException setGattStatus(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (ConnectException) iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        }
        this.gattStatus = i12;
        return this;
    }

    @Override // me.ele.aiot.fastble.exception.BleException
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "ConnectException{gattStatus=" + this.gattStatus + ", bluetoothGatt=" + this.bluetoothGatt + "} " + super.toString();
    }
}
