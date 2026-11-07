package me.ele.aiot.sensor.internal;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import g90.h;
import java.util.ConcurrentModificationException;
import java.util.UUID;

/* loaded from: classes4.dex */
public enum CharacteristicId {
    SHORT_SEND("4a822a40-cf3a-11e1-9ab4-0002a5d5c52b", "4a822a42-cf3a-11e1-9ab4-0002a5d5c52b", null),
    SHORT_RECEIVE("4a822a40-cf3a-11e1-9ab4-0002a5d5c52b", "4a822a41-cf3a-11e1-9ab4-0002a5d5c52b", g90.n.f53021a);

    private UUID characteristicUUID;
    private h.a parser;
    private UUID serviceUUID;

    CharacteristicId(String str, String str2, h.a aVar) {
        this.serviceUUID = UUID.fromString(str);
        this.characteristicUUID = UUID.fromString(str2);
        this.parser = aVar;
    }

    public static CharacteristicId from(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        for (CharacteristicId characteristicId : values()) {
            if (characteristicId.serviceUUID.equals(bluetoothGattCharacteristic.getService().getUuid()) && characteristicId.characteristicUUID.equals(bluetoothGattCharacteristic.getUuid())) {
                return characteristicId;
            }
        }
        return null;
    }

    public BluetoothGattCharacteristic get(BluetoothGatt bluetoothGatt) {
        BluetoothGattService service;
        if (bluetoothGatt == null) {
            return null;
        }
        while (true) {
            try {
                service = bluetoothGatt.getService(this.serviceUUID);
                break;
            } catch (ConcurrentModificationException unused) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused2) {
                }
            }
        }
        if (service == null) {
            return null;
        }
        return service.getCharacteristic(this.characteristicUUID);
    }

    public UUID getCharacteristicUUID() {
        return this.characteristicUUID;
    }

    public UUID getServiceUUID() {
        return this.serviceUUID;
    }

    public g90.h parseEvent(byte[] bArr) {
        h.a aVar = this.parser;
        if (aVar == null) {
            return null;
        }
        return aVar.a(bArr);
    }
}
