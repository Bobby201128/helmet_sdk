package me.ele.hb.voice.spi.params.helmet;

import android.text.TextUtils;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.hb.voice.spi.params.PlayTtsParams;

/* loaded from: classes5.dex */
public class HelmetPlayParams extends PlayTtsParams {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private boolean isHelmetSettingOpen;
    private boolean isRecognizeSettingOpen;
    private long timeout;

    public HelmetPlayParams(String str, String str2, long j12) {
        super(str, str2);
        this.timeout = j12;
    }

    public long getTimeout() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return ((Long) iSurgeon.surgeon$dispatch("1", new Object[]{this})).longValue();
        }
        if (!TextUtils.isEmpty(getText())) {
            return this.timeout + (getText().length() * 160);
        }
        return this.timeout;
    }

    public boolean isHelmetSettingOpen() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Boolean) iSurgeon.surgeon$dispatch("3", new Object[]{this})).booleanValue() : this.isHelmetSettingOpen;
    }

    public boolean isRecognizeSettingOpen() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[]{this})).booleanValue() : this.isRecognizeSettingOpen;
    }

    public void setHelmetSettingOpen(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.isHelmetSettingOpen = z12;
        }
    }

    public void setRecognizeSettingOpen(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.isRecognizeSettingOpen = z12;
        }
    }

    public void setTimeout(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.timeout = j12;
        }
    }
}
