package me.ele.aiot.sensor.internal;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public abstract class MainThreadBluetoothGattCallback extends BluetoothGattCallback {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f62067a = new me.ele.td.lib.wrapper.e(Looper.getMainLooper());

    private void A(@NonNull Runnable runnable) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, runnable});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f62067a.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onCharacteristicChanged$4(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onCharacteristicRead$2(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr, int i12);

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(@NonNull final BluetoothGatt bluetoothGatt, @NonNull final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic});
        } else {
            final byte[] value = bluetoothGattCharacteristic.getValue();
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.p
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onCharacteristicChanged$4(bluetoothGatt, bluetoothGattCharacteristic, value);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(@NonNull final BluetoothGatt bluetoothGatt, @NonNull final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, Integer.valueOf(i12)});
        } else {
            final byte[] value = bluetoothGattCharacteristic.getValue();
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.j
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onCharacteristicRead$2(bluetoothGatt, bluetoothGattCharacteristic, value, i12);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(@NonNull final BluetoothGatt bluetoothGatt, @NonNull final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, Integer.valueOf(i12)});
        } else {
            final byte[] value = bluetoothGattCharacteristic.getValue();
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onCharacteristicWrite$3(bluetoothGatt, bluetoothGattCharacteristic, value, i12);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(@NonNull final BluetoothGatt bluetoothGatt, final int i12, final int i13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
        } else {
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onConnectionStateChange$0(bluetoothGatt, i12, i13);
                }
            });
        }
    }

    @Keep
    @RequiresApi
    public final void onConnectionUpdated(@NonNull final BluetoothGatt bluetoothGatt, @IntRange final int i12, @IntRange final int i13, @IntRange final int i14, final int i15) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)});
        } else {
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.g
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onConnectionUpdated$12(bluetoothGatt, i12, i13, i14, i15);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(@NonNull final BluetoothGatt bluetoothGatt, @NonNull final BluetoothGattDescriptor bluetoothGattDescriptor, final int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, bluetoothGatt, bluetoothGattDescriptor, Integer.valueOf(i12)});
        } else {
            final byte[] value = bluetoothGattDescriptor.getValue();
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.n
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onDescriptorRead$5(bluetoothGatt, bluetoothGattDescriptor, value, i12);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(@NonNull final BluetoothGatt bluetoothGatt, @NonNull final BluetoothGattDescriptor bluetoothGattDescriptor, final int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, bluetoothGatt, bluetoothGattDescriptor, Integer.valueOf(i12)});
        } else {
            final byte[] value = bluetoothGattDescriptor.getValue();
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onDescriptorWrite$6(bluetoothGatt, bluetoothGattDescriptor, value, i12);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @RequiresApi
    public final void onMtuChanged(@NonNull final BluetoothGatt bluetoothGatt, @IntRange final int i12, final int i13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
        } else {
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.h
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onMtuChanged$9(bluetoothGatt, i12, i13);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @RequiresApi
    public final void onPhyRead(@NonNull final BluetoothGatt bluetoothGatt, final int i12, final int i13, final int i14) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
        } else {
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.o
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onPhyRead$10(bluetoothGatt, i12, i13, i14);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @RequiresApi
    public final void onPhyUpdate(@NonNull final BluetoothGatt bluetoothGatt, final int i12, final int i13, final int i14) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
        } else {
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.m
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onPhyUpdate$11(bluetoothGatt, i12, i13, i14);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(@NonNull final BluetoothGatt bluetoothGatt, @IntRange final int i12, final int i13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
        } else {
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onReadRemoteRssi$7(bluetoothGatt, i12, i13);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(@NonNull final BluetoothGatt bluetoothGatt, final int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, bluetoothGatt, Integer.valueOf(i12)});
        } else {
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onReliableWriteCompleted$8(bluetoothGatt, i12);
                }
            });
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(@NonNull final BluetoothGatt bluetoothGatt, final int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, bluetoothGatt, Integer.valueOf(i12)});
        } else {
            A(new Runnable() { // from class: me.ele.aiot.sensor.internal.i
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadBluetoothGattCallback.this.lambda$onServicesDiscovered$1(bluetoothGatt, i12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onCharacteristicWrite$3(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable byte[] bArr, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onConnectionStateChange$0(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onConnectionUpdated$12(@NonNull BluetoothGatt bluetoothGatt, @IntRange int i12, @IntRange int i13, @IntRange int i14, int i15);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onDescriptorRead$5(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, @Nullable byte[] bArr, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onDescriptorWrite$6(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, @Nullable byte[] bArr, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onMtuChanged$9(@NonNull BluetoothGatt bluetoothGatt, @IntRange int i12, int i13);

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onPhyRead$10(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onPhyUpdate$11(@NonNull BluetoothGatt bluetoothGatt, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onReadRemoteRssi$7(@NonNull BluetoothGatt bluetoothGatt, @IntRange int i12, int i13);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onReliableWriteCompleted$8(@NonNull BluetoothGatt bluetoothGatt, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$onServicesDiscovered$1(@NonNull BluetoothGatt bluetoothGatt, int i12);
}
