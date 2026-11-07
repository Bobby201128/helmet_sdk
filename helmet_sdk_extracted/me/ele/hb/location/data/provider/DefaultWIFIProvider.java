package me.ele.hb.location.data.provider;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import me.ele.foundation.Application;
import me.ele.hb.location.config.Config;
import me.ele.hb.location.model.WiFi;
import me.ele.hb.location.utils.CollectionUtils;
import me.ele.hb.location.utils.Constants;
import me.ele.hb.location.utils.WIFIUtils;

/* loaded from: classes5.dex */
public class DefaultWIFIProvider implements IWiFiProvider {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    boolean isUpdated = false;
    List<WiFi> lastCache = new ArrayList();

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public long getExpiration() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Long) iSurgeon.surgeon$dispatch("2", new Object[]{this})).longValue() : Config.wifiExpiration();
    }

    @Override // me.ele.hb.location.data.provider.IWiFiProvider
    public void stop() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this});
        }
    }

    @Override // me.ele.hb.location.data.provider.IWiFiProvider
    public boolean updated() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Boolean) iSurgeon.surgeon$dispatch("3", new Object[]{this})).booleanValue() : this.isUpdated;
    }

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public List<WiFi> getData() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (List) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        List<WiFi> wIFIList = WIFIUtils.getWIFIList(Application.getApplicationContext(), getExpiration());
        this.isUpdated = !CollectionUtils.isEqualCollection(this.lastCache, wIFIList);
        TLog.logd(Constants.TAG, "DefaultWIFIProvider", "isUpdated:" + this.isUpdated + ", lastCache: " + this.lastCache.size() + ", current: " + wIFIList.size());
        this.lastCache = wIFIList;
        return wIFIList;
    }
}
