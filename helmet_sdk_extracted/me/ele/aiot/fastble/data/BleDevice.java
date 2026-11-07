package me.ele.aiot.fastble.data;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class BleDevice implements Parcelable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final Parcelable.Creator<BleDevice> CREATOR = new a();

    /* renamed from: n, reason: collision with root package name */
    private BluetoothDevice f61898n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f61899o;

    /* renamed from: p, reason: collision with root package name */
    private int f61900p;

    /* renamed from: q, reason: collision with root package name */
    private long f61901q;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator<BleDevice> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BleDevice createFromParcel(Parcel parcel) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (BleDevice) iSurgeon.surgeon$dispatch("1", new Object[]{this, parcel}) : new BleDevice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BleDevice[] newArray(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "2") ? (BleDevice[]) iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)}) : new BleDevice[i12];
        }
    }

    public BleDevice(BluetoothDevice bluetoothDevice) {
        this.f61898n = bluetoothDevice;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return ((Integer) iSurgeon.surgeon$dispatch("2", new Object[]{this})).intValue();
        }
        return 0;
    }

    public BluetoothDevice getDevice() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? (BluetoothDevice) iSurgeon.surgeon$dispatch("6", new Object[]{this}) : this.f61898n;
    }

    public String getKey() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        if (this.f61898n != null) {
            return this.f61898n.getName() + this.f61898n.getAddress();
        }
        return "";
    }

    public String getMac() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (String) iSurgeon.surgeon$dispatch("4", new Object[]{this});
        }
        BluetoothDevice bluetoothDevice = this.f61898n;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getAddress();
        }
        return null;
    }

    public String getName() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (String) iSurgeon.surgeon$dispatch("3", new Object[]{this});
        }
        BluetoothDevice bluetoothDevice = this.f61898n;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getName();
        }
        return null;
    }

    public int getRssi() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE) ? ((Integer) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this})).intValue() : this.f61900p;
    }

    public byte[] getScanRecord() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? (byte[]) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this}) : this.f61899o;
    }

    public long getTimestampNanos() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "12") ? ((Long) iSurgeon.surgeon$dispatch("12", new Object[]{this})).longValue() : this.f61901q;
    }

    public void setDevice(BluetoothDevice bluetoothDevice) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, bluetoothDevice});
        } else {
            this.f61898n = bluetoothDevice;
        }
    }

    public void setRssi(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.f61900p = i12;
        }
    }

    public void setScanRecord(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this, bArr});
        } else {
            this.f61899o = bArr;
        }
    }

    public void setTimestampNanos(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.f61901q = j12;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, parcel, Integer.valueOf(i12)});
            return;
        }
        parcel.writeParcelable(this.f61898n, i12);
        parcel.writeByteArray(this.f61899o);
        parcel.writeInt(this.f61900p);
        parcel.writeLong(this.f61901q);
    }

    public BleDevice(BluetoothDevice bluetoothDevice, int i12, byte[] bArr, long j12) {
        this.f61898n = bluetoothDevice;
        this.f61899o = bArr;
        this.f61900p = i12;
        this.f61901q = j12;
    }

    protected BleDevice(Parcel parcel) {
        this.f61898n = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f61899o = parcel.createByteArray();
        this.f61900p = parcel.readInt();
        this.f61901q = parcel.readLong();
    }
}
