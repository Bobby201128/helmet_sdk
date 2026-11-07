package me.ele.aiot.indoorguide.bean;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class IndoorGuidePathRequestBean {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public final String endPointRetailerId;
    public final String startingPointRetailerId;

    /* loaded from: classes4.dex */
    public static class Builder {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        public String endPointRetailerId;
        public String startingPointRetailerId;

        public Builder() {
        }

        public IndoorGuidePathRequestBean build() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (IndoorGuidePathRequestBean) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : new IndoorGuidePathRequestBean(this);
        }

        public Builder setEndPointRetailerId(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                return (Builder) iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
            }
            this.endPointRetailerId = str;
            return this;
        }

        public Builder setStartingPointRetailerId(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (Builder) iSurgeon.surgeon$dispatch("1", new Object[]{this, str});
            }
            this.startingPointRetailerId = str;
            return this;
        }

        Builder(IndoorGuidePathRequestBean indoorGuidePathRequestBean) {
            this.startingPointRetailerId = indoorGuidePathRequestBean.startingPointRetailerId;
            this.endPointRetailerId = indoorGuidePathRequestBean.endPointRetailerId;
        }
    }

    public IndoorGuidePathRequestBean() {
        this(new Builder());
    }

    public String getEndPointRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.endPointRetailerId;
    }

    public String getStartingPointRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.startingPointRetailerId;
    }

    public Builder newBuilder() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (Builder) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : new Builder(this);
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (String) iSurgeon.surgeon$dispatch("3", new Object[]{this});
        }
        return "IndoorGuidePathRequestBean{startingPointRetailerId=" + this.startingPointRetailerId + ", endPointRetailerId=" + this.endPointRetailerId + '}';
    }

    public IndoorGuidePathRequestBean(Builder builder) {
        this.startingPointRetailerId = builder.startingPointRetailerId;
        this.endPointRetailerId = builder.endPointRetailerId;
    }
}
