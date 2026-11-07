package me.ele.aiot.indoorguide.model;

import android.content.Context;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class IndoorRequest {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private Context context;
    private String featureModeFilePath;
    private String mappingFilePath;
    private String pmmlModeFilePath;
    private long requestAt;
    private long responseAt;

    public IndoorRequest(String str, String str2, String str3, Context context) {
        this.pmmlModeFilePath = str;
        this.featureModeFilePath = str2;
        this.mappingFilePath = str3;
        this.context = context;
    }

    public Context getContext() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (Context) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.context;
    }

    public String getFeatureModeFilePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.featureModeFilePath;
    }

    public String getMappingFilePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.mappingFilePath;
    }

    public String getPmmlModeFilePath() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.pmmlModeFilePath;
    }

    public long getRequestAt() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Long) iSurgeon.surgeon$dispatch("5", new Object[]{this})).longValue() : this.requestAt;
    }

    public long getResponseAt() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Long) iSurgeon.surgeon$dispatch("7", new Object[]{this})).longValue() : this.responseAt;
    }

    public void setRequestAt(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.requestAt = j12;
        }
    }

    public void setResponseAt(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Long.valueOf(j12)});
        } else {
            this.responseAt = j12;
        }
    }
}
