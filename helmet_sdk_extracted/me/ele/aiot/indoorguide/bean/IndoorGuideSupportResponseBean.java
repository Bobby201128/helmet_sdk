package me.ele.aiot.indoorguide.bean;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class IndoorGuideSupportResponseBean {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public final boolean isSupport;
    public final long poiId;
    public final String retailerId;

    /* loaded from: classes4.dex */
    public static class Builder {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        public boolean isSupport;
        public long poiId;
        public String retailerId;

        public Builder() {
        }

        public IndoorGuideSupportResponseBean build() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "4") ? (IndoorGuideSupportResponseBean) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : new IndoorGuideSupportResponseBean(this);
        }

        public Builder setPoiId(long j12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                return (Builder) iSurgeon.surgeon$dispatch("2", new Object[]{this, Long.valueOf(j12)});
            }
            this.poiId = j12;
            return this;
        }

        public Builder setRetailerId(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (Builder) iSurgeon.surgeon$dispatch("1", new Object[]{this, str});
            }
            this.retailerId = str;
            return this;
        }

        public Builder setSupport(boolean z12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                return (Builder) iSurgeon.surgeon$dispatch("3", new Object[]{this, Boolean.valueOf(z12)});
            }
            this.isSupport = z12;
            return this;
        }

        Builder(IndoorGuideSupportResponseBean indoorGuideSupportResponseBean) {
            this.retailerId = indoorGuideSupportResponseBean.retailerId;
            this.poiId = indoorGuideSupportResponseBean.poiId;
            this.isSupport = indoorGuideSupportResponseBean.isSupport;
        }
    }

    public IndoorGuideSupportResponseBean() {
        this(new Builder());
    }

    public long getPoiId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Long) iSurgeon.surgeon$dispatch("2", new Object[]{this})).longValue() : this.poiId;
    }

    public String getRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.retailerId;
    }

    public boolean isSupport() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Boolean) iSurgeon.surgeon$dispatch("3", new Object[]{this})).booleanValue() : this.isSupport;
    }

    public Builder newBuilder() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (Builder) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : new Builder(this);
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "IndoorGuideSupportResponseBean{retailerId=" + this.retailerId + ", poiId=" + this.poiId + ", isSupport=" + this.isSupport + '}';
    }

    public IndoorGuideSupportResponseBean(Builder builder) {
        this.retailerId = builder.retailerId;
        this.poiId = builder.poiId;
        this.isSupport = builder.isSupport;
    }
}
