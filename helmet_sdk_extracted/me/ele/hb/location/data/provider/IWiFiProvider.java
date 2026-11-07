package me.ele.hb.location.data.provider;

import java.util.List;
import me.ele.hb.location.model.WiFi;

/* loaded from: classes5.dex */
public interface IWiFiProvider extends IDataProvider<List<WiFi>> {
    void stop();

    boolean updated();
}
