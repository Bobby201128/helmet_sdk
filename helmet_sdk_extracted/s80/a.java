package s80;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Arrays;
import rf1.c;

/* loaded from: classes4.dex */
public class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f86185a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothDevice f86186b;

    /* renamed from: c, reason: collision with root package name */
    private int f86187c;

    /* renamed from: d, reason: collision with root package name */
    private long f86188d;

    /* renamed from: e, reason: collision with root package name */
    private int f86189e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f86190f;

    public a(byte[] bArr) {
        if (bArr != null && bArr.length == 20) {
            this.f86190f = bArr;
            this.f86185a = Arrays.copyOfRange(bArr, 0, 13);
            this.f86188d = c.v();
            this.f86189e = bArr[19];
            Log.d("BlueScan", "BLUETOOTH_SCAN_HELP deviceCode: " + b() + ", manufacturerData: " + l90.a.a(bArr) + " flagBit: " + this.f86189e);
        }
    }

    public BluetoothDevice a() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (BluetoothDevice) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.f86186b;
    }

    public String b() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (String) iSurgeon.surgeon$dispatch("2", new Object[]{this});
        }
        byte[] bArr = this.f86185a;
        if (bArr != null && bArr.length > 0) {
            return new String(bArr);
        }
        return "";
    }

    public int c() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this})).intValue() : this.f86189e;
    }

    public byte[] d() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.f86190f;
    }

    public int e() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.f86187c;
    }

    public long f() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Long) iSurgeon.surgeon$dispatch("7", new Object[]{this})).longValue() : this.f86188d;
    }

    public void g(BluetoothDevice bluetoothDevice) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, bluetoothDevice});
        } else {
            this.f86186b = bluetoothDevice;
        }
    }

    public void h(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.f86187c = i12;
        }
    }
}
