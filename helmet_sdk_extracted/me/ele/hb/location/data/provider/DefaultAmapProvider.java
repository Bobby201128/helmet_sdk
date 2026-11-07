package me.ele.hb.location.data.provider;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.hb.location.model.Gps;

/* loaded from: classes5.dex */
public class DefaultAmapProvider implements IGPSProvider {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public Gps getData() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (Gps) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        return null;
    }

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public long getExpiration() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return ((Long) iSurgeon.surgeon$dispatch("2", new Object[]{this})).longValue();
        }
        return 0L;
    }
}
