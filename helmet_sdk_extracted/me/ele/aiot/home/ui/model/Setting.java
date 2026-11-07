package me.ele.aiot.home.ui.model;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class Setting {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    String StatusDesc;
    boolean enable;
    String name;

    public String getName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.name;
    }

    public String getStatusDesc() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.StatusDesc;
    }

    public boolean isEnable() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[]{this})).booleanValue() : this.enable;
    }

    public void setEnable(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.enable = z12;
        }
    }

    public void setName(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public void setStatusDesc(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.StatusDesc = str;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
        }
        return "Setting{StatusDesc='" + this.StatusDesc + "', name='" + this.name + "'}";
    }
}
