package me.ele.aiot.home.ui.view;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes4.dex */
public class a extends org.aspectj.runtime.internal.a {
    public a(Object[] objArr) {
        super(objArr);
    }

    @Override // org.aspectj.runtime.internal.a
    public Object run(Object[] objArr) {
        Intent registerReceiver;
        Object[] objArr2 = this.state;
        b bVar = (b) objArr2[1];
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) objArr2[2];
        IntentFilter intentFilter = (IntentFilter) objArr2[3];
        registerReceiver = bVar.registerReceiver(broadcastReceiver, intentFilter);
        return registerReceiver;
    }
}
