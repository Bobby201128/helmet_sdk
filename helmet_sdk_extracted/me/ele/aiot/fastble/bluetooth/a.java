package me.ele.aiot.fastble.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.alibaba.ariver.commonability.bluetooth.ble.BLEManager;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.UUID;
import me.ele.aiot.fastble.exception.GattException;
import me.ele.aiot.fastble.exception.OtherException;
import me.ele.aiot.fastble.exception.TimeoutException;
import me.ele.im.uikit.message.ReadStatusDialog;
import me.ele.td.lib.wrapper.e;
import org.android.agoo.common.AgooConstants;
import x70.d;
import x70.f;
import x70.g;
import x70.h;

@TargetApi(18)
/* loaded from: classes4.dex */
public class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private BluetoothGatt f61875a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothGattService f61876b;

    /* renamed from: c, reason: collision with root package name */
    private BluetoothGattCharacteristic f61877c;

    /* renamed from: d, reason: collision with root package name */
    private BleBluetooth f61878d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f61879e = new HandlerC1135a(Looper.getMainLooper());

    /* renamed from: me.ele.aiot.fastble.bluetooth.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class HandlerC1135a extends e {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        HandlerC1135a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i12 = message.what;
            if (i12 != 49) {
                if (i12 != 50) {
                    if (i12 != 65) {
                        if (i12 != 66) {
                            if (i12 != 81) {
                                if (i12 != 82) {
                                    if (i12 != 97) {
                                        if (i12 != 98) {
                                            switch (i12) {
                                                case 17:
                                                    x70.e eVar = (x70.e) message.obj;
                                                    if (eVar != null) {
                                                        eVar.f(new TimeoutException());
                                                        return;
                                                    }
                                                    return;
                                                case 18:
                                                    a.this.i();
                                                    x70.e eVar2 = (x70.e) message.obj;
                                                    int i13 = message.getData().getInt("notify_status");
                                                    if (eVar2 != null) {
                                                        if (i13 == 0) {
                                                            eVar2.g();
                                                            return;
                                                        } else {
                                                            eVar2.f(new GattException(i13));
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                case 19:
                                                    x70.e eVar3 = (x70.e) message.obj;
                                                    byte[] byteArray = message.getData().getByteArray("notify_value");
                                                    if (eVar3 != null) {
                                                        eVar3.e(byteArray);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    switch (i12) {
                                                        case 33:
                                                            x70.c cVar = (x70.c) message.obj;
                                                            if (cVar != null) {
                                                                cVar.f(new TimeoutException());
                                                                return;
                                                            }
                                                            return;
                                                        case 34:
                                                            a.this.g();
                                                            x70.c cVar2 = (x70.c) message.obj;
                                                            int i14 = message.getData().getInt("indicate_status");
                                                            if (cVar2 != null) {
                                                                if (i14 == 0) {
                                                                    cVar2.g();
                                                                    return;
                                                                } else {
                                                                    cVar2.f(new GattException(i14));
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        case 35:
                                                            x70.c cVar3 = (x70.c) message.obj;
                                                            byte[] byteArray2 = message.getData().getByteArray("indicate_value");
                                                            if (cVar3 != null) {
                                                                cVar3.e(byteArray2);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            return;
                                                    }
                                            }
                                        }
                                        a.this.h();
                                        d dVar = (d) message.obj;
                                        Bundle data = message.getData();
                                        int i15 = data.getInt("mtu_status");
                                        int i16 = data.getInt("mtu_value");
                                        if (dVar != null) {
                                            if (i15 == 0) {
                                                dVar.e(i16);
                                                return;
                                            } else {
                                                dVar.f(new GattException(i15));
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    d dVar2 = (d) message.obj;
                                    if (dVar2 != null) {
                                        dVar2.f(new TimeoutException());
                                        return;
                                    }
                                    return;
                                }
                                a.this.k();
                                g gVar = (g) message.obj;
                                Bundle data2 = message.getData();
                                int i17 = data2.getInt("rssi_status");
                                int i18 = data2.getInt("rssi_value");
                                if (gVar != null) {
                                    if (i17 == 0) {
                                        gVar.f(i18);
                                        return;
                                    } else {
                                        gVar.e(new GattException(i17));
                                        return;
                                    }
                                }
                                return;
                            }
                            g gVar2 = (g) message.obj;
                            if (gVar2 != null) {
                                gVar2.e(new TimeoutException());
                                return;
                            }
                            return;
                        }
                        a.this.j();
                        f fVar = (f) message.obj;
                        Bundle data3 = message.getData();
                        int i19 = data3.getInt(ReadStatusDialog.ReadStatusFragment.KEY_READ_STATUS);
                        byte[] byteArray3 = data3.getByteArray("read_value");
                        if (fVar != null) {
                            if (i19 == 0) {
                                fVar.f(byteArray3);
                                return;
                            } else {
                                fVar.e(new GattException(i19));
                                return;
                            }
                        }
                        return;
                    }
                    f fVar2 = (f) message.obj;
                    if (fVar2 != null) {
                        fVar2.e(new TimeoutException());
                        return;
                    }
                    return;
                }
                a.this.q();
                h hVar = (h) message.obj;
                Bundle data4 = message.getData();
                int i22 = data4.getInt(BLEManager.KEY_WRITE_BUNDLE_STATUS);
                byte[] byteArray4 = data4.getByteArray(BLEManager.KEY_WRITE_BUNDLE_VALUE);
                if (hVar != null) {
                    if (i22 == 0) {
                        hVar.f(1, 1, byteArray4);
                        return;
                    } else {
                        hVar.e(new GattException(i22));
                        return;
                    }
                }
                return;
            }
            h hVar2 = (h) message.obj;
            if (hVar2 != null) {
                hVar2.e(new TimeoutException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(BleBluetooth bleBluetooth) {
        this.f61878d = bleBluetooth;
        this.f61875a = bleBluetooth.F();
    }

    private UUID c(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (UUID) iSurgeon.surgeon$dispatch("3", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return UUID.fromString(str);
    }

    private void d(x70.e eVar, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            iSurgeon.surgeon$dispatch("15", new Object[]{this, eVar, str});
            return;
        }
        if (eVar != null) {
            i();
            eVar.d(str);
            eVar.c(this.f61879e);
            this.f61878d.w(str, eVar);
            Handler handler = this.f61879e;
            handler.sendMessageDelayed(handler.obtainMessage(17, eVar), w70.a.l().o());
        }
    }

    private void e(h hVar, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            iSurgeon.surgeon$dispatch("17", new Object[]{this, hVar, str});
            return;
        }
        if (hVar != null) {
            q();
            hVar.d(str);
            hVar.c(this.f61879e);
            this.f61878d.x(str, hVar);
            Handler handler = this.f61879e;
            handler.sendMessageDelayed(handler.obtainMessage(49, hVar), w70.a.l().o());
        }
    }

    private void f(d dVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            iSurgeon.surgeon$dispatch("20", new Object[]{this, dVar});
            return;
        }
        if (dVar != null) {
            h();
            dVar.c(this.f61879e);
            this.f61878d.v(dVar);
            Handler handler = this.f61879e;
            handler.sendMessageDelayed(handler.obtainMessage(97, dVar), w70.a.l().o());
        }
    }

    private boolean l(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z12, boolean z13, x70.e eVar) {
        BluetoothGattDescriptor descriptor;
        byte[] bArr;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("6", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, Boolean.valueOf(z12), Boolean.valueOf(z13), eVar})).booleanValue();
        }
        try {
            if (bluetoothGatt != null && bluetoothGattCharacteristic != null) {
                if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z13)) {
                    i();
                    if (eVar != null) {
                        eVar.f(new OtherException("gatt setCharacteristicNotification fail"));
                    }
                    return false;
                }
                if (z12) {
                    descriptor = bluetoothGattCharacteristic.getDescriptor(bluetoothGattCharacteristic.getUuid());
                } else {
                    descriptor = bluetoothGattCharacteristic.getDescriptor(c("00002902-0000-1000-8000-00805f9b34fb"));
                }
                if (descriptor == null) {
                    i();
                    if (eVar != null) {
                        eVar.f(new OtherException("descriptor equals null"));
                    }
                    return false;
                }
                if (z13) {
                    bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                } else {
                    bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
                }
                descriptor.setValue(bArr);
                boolean writeDescriptor = bluetoothGatt.writeDescriptor(descriptor);
                if (!writeDescriptor) {
                    i();
                    if (eVar != null) {
                        eVar.f(new OtherException("gatt writeDescriptor fail"));
                    }
                }
                return writeDescriptor;
            }
            i();
            if (eVar != null) {
                eVar.f(new OtherException("gatt or characteristic equal null"));
            }
            return false;
        } catch (Throwable th2) {
            Log.d("bleConnector", "setCharacteristicNotification throwable:" + th2);
            return false;
        }
    }

    private a n(UUID uuid, UUID uuid2) {
        BluetoothGatt bluetoothGatt;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (a) iSurgeon.surgeon$dispatch("1", new Object[]{this, uuid, uuid2});
        }
        if (uuid != null && (bluetoothGatt = this.f61875a) != null) {
            this.f61876b = bluetoothGatt.getService(uuid);
        }
        BluetoothGattService bluetoothGattService = this.f61876b;
        if (bluetoothGattService != null && uuid2 != null) {
            this.f61877c = bluetoothGattService.getCharacteristic(uuid2);
        }
        return this;
    }

    public boolean a(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[]{this, Boolean.valueOf(z12)})).booleanValue();
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f61877c;
        if (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() | 16) <= 0) {
            return false;
        }
        return l(this.f61875a, this.f61877c, z12, false, null);
    }

    public void b(x70.e eVar, String str, boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, eVar, str, Boolean.valueOf(z12)});
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f61877c;
        if (bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() | 16) > 0) {
            d(eVar, str);
            l(this.f61875a, this.f61877c, z12, true, eVar);
        } else if (eVar != null) {
            eVar.f(new OtherException("this characteristic not support notify!"));
        }
    }

    public void g() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this});
        } else {
            this.f61879e.removeMessages(33);
        }
    }

    public void h() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this});
        } else {
            this.f61879e.removeMessages(97);
        }
    }

    public void i() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this});
        } else {
            this.f61879e.removeMessages(17);
        }
    }

    public void j() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this});
        } else {
            this.f61879e.removeMessages(65);
        }
    }

    public void k() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "25")) {
            iSurgeon.surgeon$dispatch("25", new Object[]{this});
        } else {
            this.f61879e.removeMessages(81);
        }
    }

    public void m(int i12, d dVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, Integer.valueOf(i12), dVar});
            return;
        }
        f(dVar);
        if (!this.f61875a.requestMtu(i12)) {
            h();
            if (dVar != null) {
                dVar.f(new OtherException("gatt requestMtu fail"));
            }
        }
    }

    public a o(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (a) iSurgeon.surgeon$dispatch("2", new Object[]{this, str, str2}) : n(c(str), c(str2));
    }

    public void p(byte[] bArr, h hVar, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, bArr, hVar, str});
            return;
        }
        if (bArr != null && bArr.length > 0) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f61877c;
            if (bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() & 12) != 0) {
                if (this.f61877c.setValue(bArr)) {
                    e(hVar, str);
                    if (!this.f61875a.writeCharacteristic(this.f61877c)) {
                        q();
                        if (hVar != null) {
                            hVar.e(new OtherException("gatt writeCharacteristic fail"));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (hVar != null) {
                    hVar.e(new OtherException("Updates the locally stored value of this characteristic fail"));
                    return;
                }
                return;
            }
            if (hVar != null) {
                hVar.e(new OtherException("this characteristic not support write!"));
                return;
            }
            return;
        }
        if (hVar != null) {
            hVar.e(new OtherException("the data to be written is empty"));
        }
    }

    public void q() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this});
        } else {
            this.f61879e.removeMessages(49);
        }
    }
}
