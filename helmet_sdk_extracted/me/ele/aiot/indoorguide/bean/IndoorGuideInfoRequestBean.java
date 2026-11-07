package me.ele.aiot.indoorguide.bean;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public class IndoorGuideInfoRequestBean {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public final long poiId;
    public final String retailerId;
    public final String shopName;

    /* loaded from: classes4.dex */
    public static class Builder {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        public long poiId;
        public String retailerId;
        public String shopName;

        public Builder() {
        }

        public IndoorGuideInfoRequestBean build() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "4") ? (IndoorGuideInfoRequestBean) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : new IndoorGuideInfoRequestBean(this);
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

        public Builder setShopName(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                return (Builder) iSurgeon.surgeon$dispatch("3", new Object[]{this, str});
            }
            this.shopName = str;
            return this;
        }

        Builder(IndoorGuideInfoRequestBean indoorGuideInfoRequestBean) {
            this.retailerId = indoorGuideInfoRequestBean.retailerId;
            this.poiId = indoorGuideInfoRequestBean.poiId;
            this.shopName = indoorGuideInfoRequestBean.shopName;
        }
    }

    public IndoorGuideInfoRequestBean() {
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

    public String getShopName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.shopName;
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
        return "IndoorGuideInfoRequestBean{retailerId=" + this.retailerId + ", poiId=" + this.poiId + ", shopName='" + this.shopName + "'}";
    }

    public IndoorGuideInfoRequestBean(Builder builder) {
        this.retailerId = builder.retailerId;
        this.poiId = builder.poiId;
        this.shopName = builder.shopName;
    }
}
