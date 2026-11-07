package me.ele.aiot.fastble.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.ariver.commonability.bluetooth.ble.BLEManager;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import me.ele.aiot.fastble.data.BleDevice;
import me.ele.aiot.fastble.exception.ConnectException;
import me.ele.aiot.fastble.exception.OtherException;
import me.ele.aiot.fastble.exception.TimeoutException;
import me.ele.im.uikit.message.ReadStatusDialog;
import org.android.agoo.common.AgooConstants;
import p.r.o.x.y.PrivacyApi;
import x70.d;
import x70.e;
import x70.f;
import x70.g;
import x70.h;

@TargetApi(18)
/* loaded from: classes4.dex */
public class BleBluetooth {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private x70.b f61859a;

    /* renamed from: b, reason: collision with root package name */
    private g f61860b;

    /* renamed from: c, reason: collision with root package name */
    private d f61861c;

    /* renamed from: h, reason: collision with root package name */
    private LastState f61866h;

    /* renamed from: j, reason: collision with root package name */
    private final BleDevice f61868j;

    /* renamed from: k, reason: collision with root package name */
    private BluetoothGatt f61869k;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, e> f61862d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, x70.c> f61863e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, h> f61864f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, f> f61865g = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private boolean f61867i = false;

    /* renamed from: l, reason: collision with root package name */
    private final b f61870l = new b(Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    private int f61871m = 0;

    /* renamed from: n, reason: collision with root package name */
    private BluetoothGattCallback f61872n = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum LastState {
        CONNECT_IDLE,
        CONNECT_CONNECTING,
        CONNECT_CONNECTED,
        CONNECT_FAILURE,
        CONNECT_DISCONNECT
    }

    /* loaded from: classes4.dex */
    public class a extends BluetoothGattCallback {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Handler a12;
            Handler a13;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic});
                return;
            }
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            Iterator it = BleBluetooth.this.f61862d.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof e) {
                    e eVar = (e) value;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(eVar.b()) && (a13 = eVar.a()) != null) {
                        Message obtainMessage = a13.obtainMessage();
                        obtainMessage.what = 19;
                        obtainMessage.obj = eVar;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("notify_value", bluetoothGattCharacteristic.getValue());
                        obtainMessage.setData(bundle);
                        a13.sendMessage(obtainMessage);
                    }
                }
            }
            Iterator it2 = BleBluetooth.this.f61863e.entrySet().iterator();
            while (it2.hasNext()) {
                Object value2 = ((Map.Entry) it2.next()).getValue();
                if (value2 instanceof x70.c) {
                    x70.c cVar = (x70.c) value2;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(cVar.b()) && (a12 = cVar.a()) != null) {
                        Message obtainMessage2 = a12.obtainMessage();
                        obtainMessage2.what = 35;
                        obtainMessage2.obj = cVar;
                        Bundle bundle2 = new Bundle();
                        bundle2.putByteArray("indicate_value", bluetoothGattCharacteristic.getValue());
                        obtainMessage2.setData(bundle2);
                        a12.sendMessage(obtainMessage2);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i12) {
            Handler a12;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, Integer.valueOf(i12)});
                return;
            }
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i12);
            Iterator it = BleBluetooth.this.f61865g.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof f) {
                    f fVar = (f) value;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(fVar.b()) && (a12 = fVar.a()) != null) {
                        Message obtainMessage = a12.obtainMessage();
                        obtainMessage.what = 66;
                        obtainMessage.obj = fVar;
                        Bundle bundle = new Bundle();
                        bundle.putInt(ReadStatusDialog.ReadStatusFragment.KEY_READ_STATUS, i12);
                        bundle.putByteArray("read_value", bluetoothGattCharacteristic.getValue());
                        obtainMessage.setData(bundle);
                        a12.sendMessage(obtainMessage);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i12) {
            Handler a12;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "5")) {
                iSurgeon.surgeon$dispatch("5", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, Integer.valueOf(i12)});
                return;
            }
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i12);
            Iterator it = BleBluetooth.this.f61864f.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof h) {
                    h hVar = (h) value;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(hVar.b()) && (a12 = hVar.a()) != null) {
                        Message obtainMessage = a12.obtainMessage();
                        obtainMessage.what = 50;
                        obtainMessage.obj = hVar;
                        Bundle bundle = new Bundle();
                        bundle.putInt(BLEManager.KEY_WRITE_BUNDLE_STATUS, i12);
                        bundle.putByteArray(BLEManager.KEY_WRITE_BUNDLE_VALUE, bluetoothGattCharacteristic.getValue());
                        obtainMessage.setData(bundle);
                        a12.sendMessage(obtainMessage);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i12, int i13) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
                return;
            }
            super.onConnectionStateChange(bluetoothGatt, i12, i13);
            me.ele.aiot.fastble.utils.a.b("BluetoothGattCallback：onConnectionStateChange \nstatus: " + i12 + "\nnewState: " + i13 + "\ncurrentThread: " + Thread.currentThread().getId());
            BleBluetooth.this.f61869k = bluetoothGatt;
            BleBluetooth.this.f61870l.removeMessages(7);
            if (i13 == 2) {
                Message obtainMessage = BleBluetooth.this.f61870l.obtainMessage();
                obtainMessage.what = 4;
                BleBluetooth.this.f61870l.sendMessageDelayed(obtainMessage, 500L);
                return;
            }
            if (i13 == 0) {
                if (BleBluetooth.this.f61866h == LastState.CONNECT_CONNECTING) {
                    Message obtainMessage2 = BleBluetooth.this.f61870l.obtainMessage();
                    obtainMessage2.what = 1;
                    obtainMessage2.obj = new y70.a(i12);
                    BleBluetooth.this.f61870l.sendMessage(obtainMessage2);
                    return;
                }
                if (BleBluetooth.this.f61866h == LastState.CONNECT_CONNECTED) {
                    Message obtainMessage3 = BleBluetooth.this.f61870l.obtainMessage();
                    obtainMessage3.what = 2;
                    y70.a aVar = new y70.a(i12);
                    aVar.c(BleBluetooth.this.f61867i);
                    obtainMessage3.obj = aVar;
                    BleBluetooth.this.f61870l.sendMessage(obtainMessage3);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i12) {
            Handler a12;
            Handler a13;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, bluetoothGatt, bluetoothGattDescriptor, Integer.valueOf(i12)});
                return;
            }
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i12);
            Iterator it = BleBluetooth.this.f61862d.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof e) {
                    e eVar = (e) value;
                    if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equalsIgnoreCase(eVar.b()) && (a13 = eVar.a()) != null) {
                        Message obtainMessage = a13.obtainMessage();
                        obtainMessage.what = 18;
                        obtainMessage.obj = eVar;
                        Bundle bundle = new Bundle();
                        bundle.putInt("notify_status", i12);
                        obtainMessage.setData(bundle);
                        a13.sendMessage(obtainMessage);
                    }
                }
            }
            Iterator it2 = BleBluetooth.this.f61863e.entrySet().iterator();
            while (it2.hasNext()) {
                Object value2 = ((Map.Entry) it2.next()).getValue();
                if (value2 instanceof x70.c) {
                    x70.c cVar = (x70.c) value2;
                    if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equalsIgnoreCase(cVar.b()) && (a12 = cVar.a()) != null) {
                        Message obtainMessage2 = a12.obtainMessage();
                        obtainMessage2.what = 34;
                        obtainMessage2.obj = cVar;
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("indicate_status", i12);
                        obtainMessage2.setData(bundle2);
                        a12.sendMessage(obtainMessage2);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i12, int i13) {
            Handler a12;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
                return;
            }
            super.onMtuChanged(bluetoothGatt, i12, i13);
            if (BleBluetooth.this.f61861c != null && (a12 = BleBluetooth.this.f61861c.a()) != null) {
                Message obtainMessage = a12.obtainMessage();
                obtainMessage.what = 98;
                obtainMessage.obj = BleBluetooth.this.f61861c;
                Bundle bundle = new Bundle();
                bundle.putInt("mtu_status", i13);
                bundle.putInt("mtu_value", i12);
                obtainMessage.setData(bundle);
                a12.sendMessage(obtainMessage);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i12, int i13) {
            Handler a12;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                iSurgeon.surgeon$dispatch("7", new Object[]{this, bluetoothGatt, Integer.valueOf(i12), Integer.valueOf(i13)});
                return;
            }
            super.onReadRemoteRssi(bluetoothGatt, i12, i13);
            if (BleBluetooth.this.f61860b != null && (a12 = BleBluetooth.this.f61860b.a()) != null) {
                Message obtainMessage = a12.obtainMessage();
                obtainMessage.what = 82;
                obtainMessage.obj = BleBluetooth.this.f61860b;
                Bundle bundle = new Bundle();
                bundle.putInt("rssi_status", i13);
                bundle.putInt("rssi_value", i12);
                obtainMessage.setData(bundle);
                a12.sendMessage(obtainMessage);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bluetoothGatt, Integer.valueOf(i12)});
                return;
            }
            super.onServicesDiscovered(bluetoothGatt, i12);
            me.ele.aiot.fastble.utils.a.b("BluetoothGattCallback：onServicesDiscovered \nstatus: " + i12 + "\ncurrentThread: " + Thread.currentThread().getId());
            BleBluetooth.this.f61869k = bluetoothGatt;
            if (i12 == 0) {
                Message obtainMessage = BleBluetooth.this.f61870l.obtainMessage();
                obtainMessage.what = 6;
                obtainMessage.obj = new y70.a(i12);
                BleBluetooth.this.f61870l.sendMessage(obtainMessage);
                return;
            }
            Message obtainMessage2 = BleBluetooth.this.f61870l.obtainMessage();
            obtainMessage2.what = 5;
            BleBluetooth.this.f61870l.sendMessage(obtainMessage2);
        }
    }

    /* loaded from: classes4.dex */
    public final class b extends me.ele.td.lib.wrapper.e {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, message});
                return;
            }
            switch (message.what) {
                case 1:
                    BleBluetooth.this.E();
                    BleBluetooth.this.J();
                    BleBluetooth.this.z();
                    if (BleBluetooth.this.f61871m < w70.a.l().p()) {
                        me.ele.aiot.fastble.utils.a.a("Connect fail, try reconnect " + w70.a.l().q() + " millisecond later");
                        BleBluetooth.k(BleBluetooth.this);
                        Message obtainMessage = BleBluetooth.this.f61870l.obtainMessage();
                        obtainMessage.what = 3;
                        BleBluetooth.this.f61870l.sendMessageDelayed(obtainMessage, w70.a.l().q());
                        return;
                    }
                    BleBluetooth.this.f61866h = LastState.CONNECT_FAILURE;
                    w70.a.l().n().l(BleBluetooth.this);
                    int a12 = ((y70.a) message.obj).a();
                    if (BleBluetooth.this.f61859a != null) {
                        BleBluetooth.this.f61859a.a(BleBluetooth.this.f61868j, new ConnectException(BleBluetooth.this.f61869k, a12));
                        return;
                    }
                    return;
                case 2:
                    BleBluetooth.this.f61866h = LastState.CONNECT_DISCONNECT;
                    w70.a.l().n().k(BleBluetooth.this);
                    BleBluetooth.this.D();
                    BleBluetooth.this.J();
                    BleBluetooth.this.z();
                    BleBluetooth.this.N();
                    BleBluetooth.this.L();
                    BleBluetooth.this.y();
                    BleBluetooth.this.f61870l.removeCallbacksAndMessages(null);
                    y70.a aVar = (y70.a) message.obj;
                    boolean b12 = aVar.b();
                    int a13 = aVar.a();
                    if (BleBluetooth.this.f61859a != null) {
                        BleBluetooth.this.f61859a.c(b12, BleBluetooth.this.f61868j, BleBluetooth.this.f61869k, a13);
                        return;
                    }
                    return;
                case 3:
                    BleBluetooth bleBluetooth = BleBluetooth.this;
                    bleBluetooth.B(bleBluetooth.f61868j, false, BleBluetooth.this.f61859a, BleBluetooth.this.f61871m);
                    return;
                case 4:
                    if (BleBluetooth.this.f61869k != null) {
                        if (!BleBluetooth.this.f61869k.discoverServices()) {
                            Message obtainMessage2 = BleBluetooth.this.f61870l.obtainMessage();
                            obtainMessage2.what = 5;
                            BleBluetooth.this.f61870l.sendMessage(obtainMessage2);
                            return;
                        }
                        return;
                    }
                    Message obtainMessage3 = BleBluetooth.this.f61870l.obtainMessage();
                    obtainMessage3.what = 5;
                    BleBluetooth.this.f61870l.sendMessage(obtainMessage3);
                    return;
                case 5:
                    BleBluetooth.this.E();
                    BleBluetooth.this.J();
                    BleBluetooth.this.z();
                    BleBluetooth.this.f61866h = LastState.CONNECT_FAILURE;
                    w70.a.l().n().l(BleBluetooth.this);
                    if (BleBluetooth.this.f61859a != null) {
                        BleBluetooth.this.f61859a.a(BleBluetooth.this.f61868j, new OtherException("GATT discover services exception occurred!"));
                        return;
                    }
                    return;
                case 6:
                    BleBluetooth.this.f61866h = LastState.CONNECT_CONNECTED;
                    BleBluetooth.this.f61867i = false;
                    w70.a.l().n().l(BleBluetooth.this);
                    w70.a.l().n().a(BleBluetooth.this);
                    int a14 = ((y70.a) message.obj).a();
                    if (BleBluetooth.this.f61859a != null) {
                        BleBluetooth.this.f61859a.b(BleBluetooth.this.f61868j, BleBluetooth.this.f61869k, a14);
                        return;
                    }
                    return;
                case 7:
                    BleBluetooth.this.E();
                    BleBluetooth.this.J();
                    BleBluetooth.this.z();
                    BleBluetooth.this.f61866h = LastState.CONNECT_FAILURE;
                    w70.a.l().n().l(BleBluetooth.this);
                    if (BleBluetooth.this.f61859a != null) {
                        BleBluetooth.this.f61859a.a(BleBluetooth.this.f61868j, new TimeoutException());
                        return;
                    }
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    public BleBluetooth(BleDevice bleDevice) {
        this.f61868j = bleDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void E() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this});
            return;
        }
        BluetoothGatt bluetoothGatt = this.f61869k;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.disconnect();
            } catch (Throwable th2) {
                me.ele.aiot.fastble.utils.a.b("disconnectGatt throwable:" + th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void J() {
        BluetoothGatt bluetoothGatt;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "25")) {
            iSurgeon.surgeon$dispatch("25", new Object[]{this});
            return;
        }
        try {
            Method method = BluetoothGatt.class.getMethod("refresh", new Class[0]);
            if (method != null && (bluetoothGatt = this.f61869k) != null) {
                me.ele.aiot.fastble.utils.a.b("refreshDeviceCache, is success:  " + ((Boolean) PrivacyApi.invoke(method, bluetoothGatt, new Object[0])).booleanValue());
            }
        } catch (Exception e12) {
            me.ele.aiot.fastble.utils.a.b("exception occur while refreshing device: " + e12.getMessage());
            e12.printStackTrace();
        }
    }

    static /* synthetic */ int k(BleBluetooth bleBluetooth) {
        int i12 = bleBluetooth.f61871m + 1;
        bleBluetooth.f61871m = i12;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void z() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            iSurgeon.surgeon$dispatch("26", new Object[]{this});
            return;
        }
        BluetoothGatt bluetoothGatt = this.f61869k;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
        }
    }

    public synchronized BluetoothGatt A(BleDevice bleDevice, boolean z12, x70.b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            return (BluetoothGatt) iSurgeon.surgeon$dispatch("20", new Object[]{this, bleDevice, Boolean.valueOf(z12), bVar});
        }
        return B(bleDevice, z12, bVar, 0);
    }

    public synchronized BluetoothGatt B(BleDevice bleDevice, boolean z12, x70.b bVar, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            return (BluetoothGatt) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this, bleDevice, Boolean.valueOf(z12), bVar, Integer.valueOf(i12)});
        }
        me.ele.aiot.fastble.utils.a.b("connect device: " + bleDevice.getName() + "\nmac: " + bleDevice.getMac() + "\nautoConnect: " + z12 + "\ncurrentThread: " + Thread.currentThread().getId() + "\nconnectCount:" + (i12 + 1));
        if (i12 == 0) {
            this.f61871m = 0;
        }
        u(bVar);
        this.f61866h = LastState.CONNECT_CONNECTING;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f61869k = bleDevice.getDevice().connectGatt(w70.a.l().k(), z12, this.f61872n, 2);
        } else {
            this.f61869k = bleDevice.getDevice().connectGatt(w70.a.l().k(), z12, this.f61872n);
        }
        if (this.f61869k != null) {
            x70.b bVar2 = this.f61859a;
            if (bVar2 != null) {
                bVar2.d();
            }
            Message obtainMessage = this.f61870l.obtainMessage();
            obtainMessage.what = 7;
            this.f61870l.sendMessageDelayed(obtainMessage, w70.a.l().i());
        } else {
            E();
            J();
            z();
            this.f61866h = LastState.CONNECT_FAILURE;
            w70.a.l().n().l(this);
            x70.b bVar3 = this.f61859a;
            if (bVar3 != null) {
                bVar3.a(bleDevice, new OtherException("GATT connect exception occurred!"));
            }
        }
        return this.f61869k;
    }

    public synchronized void C() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this});
            return;
        }
        this.f61866h = LastState.CONNECT_IDLE;
        E();
        J();
        z();
        K();
        N();
        L();
        y();
        this.f61870l.removeCallbacksAndMessages(null);
    }

    public synchronized void D() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this});
        } else {
            this.f61867i = true;
            E();
        }
    }

    public BluetoothGatt F() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "19") ? (BluetoothGatt) iSurgeon.surgeon$dispatch("19", new Object[]{this}) : this.f61869k;
    }

    public BleDevice G() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "18") ? (BleDevice) iSurgeon.surgeon$dispatch("18", new Object[]{this}) : this.f61868j;
    }

    public String H() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "17") ? (String) iSurgeon.surgeon$dispatch("17", new Object[]{this}) : this.f61868j.getKey();
    }

    public me.ele.aiot.fastble.bluetooth.a I() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (me.ele.aiot.fastble.bluetooth.a) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : new me.ele.aiot.fastble.bluetooth.a(this);
    }

    public synchronized void K() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this});
        } else {
            this.f61859a = null;
        }
    }

    public synchronized void L() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this});
        } else {
            this.f61861c = null;
        }
    }

    public synchronized void M(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
        } else {
            if (this.f61862d.containsKey(str)) {
                this.f61862d.remove(str);
            }
        }
    }

    public synchronized void N() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this});
        } else {
            this.f61860b = null;
        }
    }

    public synchronized void u(x70.b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, bVar});
        } else {
            this.f61859a = bVar;
        }
    }

    public synchronized void v(d dVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            iSurgeon.surgeon$dispatch("15", new Object[]{this, dVar});
        } else {
            this.f61861c = dVar;
        }
    }

    public synchronized void w(String str, e eVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str, eVar});
        } else {
            this.f61862d.put(str, eVar);
        }
    }

    public synchronized void x(String str, h hVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str, hVar});
        } else {
            this.f61864f.put(str, hVar);
        }
    }

    public synchronized void y() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this});
            return;
        }
        this.f61862d.clear();
        this.f61863e.clear();
        this.f61864f.clear();
        this.f61865g.clear();
    }
}
