package q80;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes4.dex */
public class h extends org.aspectj.runtime.internal.a {
    public h(Object[] objArr) {
        super(objArr);
    }

    @Override // org.aspectj.runtime.internal.a
    public Object run(Object[] objArr) {
        Intent registerReceiver;
        Object[] objArr2 = this.state;
        Application application = (Application) objArr2[1];
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) objArr2[2];
        IntentFilter intentFilter = (IntentFilter) objArr2[3];
        registerReceiver = application.registerReceiver(broadcastReceiver, intentFilter);
        return registerReceiver;
    }
}
