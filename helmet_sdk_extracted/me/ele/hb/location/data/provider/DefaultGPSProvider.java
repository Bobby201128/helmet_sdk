package me.ele.hb.location.data.provider;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.taobao.aranger.constant.Constants;
import jl1.c;
import me.ele.hb.location.DataProviderManager;
import me.ele.hb.location.model.Gps;
import me.ele.hunter.battery.metrics.location.LocationServiceAspect;
import org.aspectj.lang.a;

@Deprecated
/* loaded from: classes5.dex */
public class DefaultGPSProvider implements IGPSProvider, LocationListener {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private static final /* synthetic */ a.InterfaceC1573a ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        c cVar = new c("DefaultGPSProvider.java", DefaultGPSProvider.class);
        ajc$tjp_0 = cVar.i("method-execution", cVar.h("1", "onLocationChanged", "me.ele.hb.location.data.provider.DefaultGPSProvider", "android.location.Location", "location", "", Constants.VOID), 0);
    }

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public long getExpiration() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return ((Long) iSurgeon.surgeon$dispatch("2", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        LocationServiceAspect.aspectOf().hookOnLocationChanged(c.e(ajc$tjp_0, this, this, location));
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, location});
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        }
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, str});
        }
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i12, Bundle bundle) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str, Integer.valueOf(i12), bundle});
        }
    }

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public Gps getData() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (Gps) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        try {
            IGPSProvider punchProvider = DataProviderManager.getInstance().getPunchProvider();
            if (punchProvider == null) {
                return null;
            }
            return punchProvider.getData();
        } catch (Throwable unused) {
            return null;
        }
    }
}
