package me.ele.aiot.indoorguide.bean;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.List;

/* loaded from: classes4.dex */
public class IndoorGuideStateResponseBean {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private List<IndoorGuideStateInfoBean> indoorGuideStateInfoBeanList;
    private boolean isActiveCall;
    private boolean isDeviation;

    public IndoorGuideStateResponseBean() {
    }

    public List<IndoorGuideStateInfoBean> getIndoorGuideStateInfoBeanList() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (List) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.indoorGuideStateInfoBeanList;
    }

    public boolean isActiveCall() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Boolean) iSurgeon.surgeon$dispatch("5", new Object[]{this})).booleanValue() : this.isActiveCall;
    }

    public boolean isDeviation() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Boolean) iSurgeon.surgeon$dispatch("3", new Object[]{this})).booleanValue() : this.isDeviation;
    }

    public void setActiveCall(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.isActiveCall = z12;
        }
    }

    public void setDeviation(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.isDeviation = z12;
        }
    }

    public void setIndoorGuideStateInfoBeanList(List<IndoorGuideStateInfoBean> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, list});
        } else {
            this.indoorGuideStateInfoBeanList = list;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
        }
        return "IndoorGuideStateResponseBean{indoorGuideStateInfoBeanList=" + this.indoorGuideStateInfoBeanList + ", isDeviation=" + this.isDeviation + ", isActiveCall=" + this.isActiveCall + '}';
    }

    public IndoorGuideStateResponseBean(List<IndoorGuideStateInfoBean> list, boolean z12, boolean z13) {
        this.indoorGuideStateInfoBeanList = list;
        this.isDeviation = z12;
        this.isActiveCall = z13;
    }
}
