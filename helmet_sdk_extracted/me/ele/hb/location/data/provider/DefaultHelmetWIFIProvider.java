package me.ele.hb.location.data.provider;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import i80.f;
import i80.j;
import java.util.List;
import me.ele.aiot.sensor.internal.data.WifiInfoBean;
import me.ele.aiot.sensor.internal.data.WifiScannedBean;
import me.ele.hb.location.config.Config;
import me.ele.hb.location.model.LimitQueue;
import me.ele.hb.location.model.WiFi;
import me.ele.hb.location.utils.CollectionUtils;

/* loaded from: classes5.dex */
public class DefaultHelmetWIFIProvider implements IWiFiProvider {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    LimitQueue<WiFi> wiFiLimitQueue = new LimitQueue<>(Config.helmetScanWiFiCount());

    public DefaultHelmetWIFIProvider() {
        try {
            j.d(new f() { // from class: me.ele.hb.location.data.provider.DefaultHelmetWIFIProvider.1
                private static transient /* synthetic */ ISurgeon $surgeonFlag;

                public boolean onWifiDataCallback(WifiScannedBean wifiScannedBean) {
                    ISurgeon iSurgeon = $surgeonFlag;
                    if (InstrumentAPI.support(iSurgeon, "1")) {
                        return ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{this, wifiScannedBean})).booleanValue();
                    }
                    DefaultHelmetWIFIProvider.this.clearTimeout();
                    if (wifiScannedBean == null) {
                        return false;
                    }
                    List<WifiInfoBean> wifiList = wifiScannedBean.getWifiList();
                    if (CollectionUtils.isEmpty(wifiList)) {
                        return false;
                    }
                    for (WifiInfoBean wifiInfoBean : wifiList) {
                        if (wifiInfoBean != null) {
                            DefaultHelmetWIFIProvider.this.wiFiLimitQueue.offer(new WiFi(wifiInfoBean.getBssid(), wifiInfoBean.getSsid(), wifiInfoBean.getRssi(), System.currentTimeMillis(), System.currentTimeMillis()));
                        }
                    }
                    return false;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeout() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this});
            return;
        }
        while (!this.wiFiLimitQueue.isEmpty()) {
            WiFi peek = this.wiFiLimitQueue.peek();
            if (peek != null) {
                if (System.currentTimeMillis() - peek.getTimestamp() >= getExpiration()) {
                    this.wiFiLimitQueue.poll();
                } else {
                    return;
                }
            }
        }
    }

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public long getExpiration() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[]{this})).longValue() : Config.helmetWiFiExpiration();
    }

    @Override // me.ele.hb.location.data.provider.IWiFiProvider
    public void stop() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
    }

    @Override // me.ele.hb.location.data.provider.IWiFiProvider
    public boolean updated() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public List<WiFi> getData() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (List) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        clearTimeout();
        return this.wiFiLimitQueue.getList();
    }
}
