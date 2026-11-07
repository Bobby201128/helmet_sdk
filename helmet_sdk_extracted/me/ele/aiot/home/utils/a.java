package me.ele.aiot.home.utils;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.foundation.Application;

/* loaded from: classes4.dex */
public class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    public static void a(Activity activity) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{activity});
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
                activity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 2);
            }
        } catch (Exception e12) {
            Log.d("AIOTDevice", "enableBluetooth exception:" + e12.getMessage());
        }
    }

    public static boolean b(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{str})).booleanValue();
        }
        try {
            if (ContextCompat.checkSelfPermission(Application.getApplicationContext(), str) == 0) {
                return true;
            }
            return false;
        } catch (Exception e12) {
            e12.printStackTrace();
            return false;
        }
    }

    public static boolean c() {
        BluetoothAdapter defaultAdapter;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("3", new Object[0])).booleanValue();
        }
        try {
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        } catch (Exception e12) {
            Log.d("AIOTDevice", "isBluetoothEnable exception:" + e12.getMessage());
            e12.printStackTrace();
        }
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        Log.d("AIOTDevice", "Device doesn't support Bluetooth");
        return false;
    }

    public static void d(Activity activity) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{activity});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivityForResult(intent, 0);
    }
}
