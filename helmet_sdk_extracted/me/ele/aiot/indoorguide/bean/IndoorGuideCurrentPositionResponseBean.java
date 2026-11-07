package me.ele.aiot.indoorguide.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class IndoorGuideCurrentPositionResponseBean {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public final int floor;
    public final String imageUrl;
    public final long poiId;
    public final String poiName;
    public final int poiType;
    public final String retailerId;
    public final String shopName;
    public final String thumbnailUrl;

    /* loaded from: classes4.dex */
    public static class Builder {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        public int floor;
        public String imageUrl;
        public long poiId;
        public String poiName;
        public int poiType;
        public String retailerId;
        public String shopName;
        public String thumbnailUrl;

        public Builder() {
        }

        public IndoorGuideCurrentPositionResponseBean build() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "9") ? (IndoorGuideCurrentPositionResponseBean) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : new IndoorGuideCurrentPositionResponseBean(this);
        }

        public Builder setFloor(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                return (Builder) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
            }
            this.floor = i12;
            return this;
        }

        public Builder setImageUrl(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                return (Builder) iSurgeon.surgeon$dispatch("3", new Object[]{this, str});
            }
            this.imageUrl = str;
            return this;
        }

        public Builder setPoiId(long j12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                return (Builder) iSurgeon.surgeon$dispatch("2", new Object[]{this, Long.valueOf(j12)});
            }
            this.poiId = j12;
            return this;
        }

        public Builder setPoiName(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "5")) {
                return (Builder) iSurgeon.surgeon$dispatch("5", new Object[]{this, str});
            }
            this.poiName = str;
            return this;
        }

        public Builder setPoiType(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                return (Builder) iSurgeon.surgeon$dispatch("7", new Object[]{this, Integer.valueOf(i12)});
            }
            this.poiType = i12;
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
            if (InstrumentAPI.support(iSurgeon, "6")) {
                return (Builder) iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            }
            this.shopName = str;
            return this;
        }

        public Builder setThumbnailUrl(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                return (Builder) iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            }
            this.thumbnailUrl = str;
            return this;
        }

        Builder(IndoorGuideCurrentPositionResponseBean indoorGuideCurrentPositionResponseBean) {
            this.retailerId = indoorGuideCurrentPositionResponseBean.retailerId;
            this.poiId = indoorGuideCurrentPositionResponseBean.poiId;
            this.imageUrl = indoorGuideCurrentPositionResponseBean.imageUrl;
            this.thumbnailUrl = indoorGuideCurrentPositionResponseBean.thumbnailUrl;
            this.poiName = indoorGuideCurrentPositionResponseBean.poiName;
            this.shopName = indoorGuideCurrentPositionResponseBean.shopName;
            this.poiType = indoorGuideCurrentPositionResponseBean.poiType;
            this.floor = indoorGuideCurrentPositionResponseBean.floor;
        }
    }

    public IndoorGuideCurrentPositionResponseBean() {
        this(new Builder());
    }

    public int getFloor() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this})).intValue() : this.floor;
    }

    public String getImageUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.imageUrl;
    }

    public long getPoiId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Long) iSurgeon.surgeon$dispatch("2", new Object[]{this})).longValue() : this.poiId;
    }

    public String getPoiName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.poiName;
    }

    public int getPoiType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.poiType;
    }

    public String getRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.retailerId;
    }

    public String getShopName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? (String) iSurgeon.surgeon$dispatch("6", new Object[]{this}) : this.shopName;
    }

    public String getThumbnailUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (String) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.thumbnailUrl;
    }

    public Builder newBuilder() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (Builder) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : new Builder(this);
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            return (String) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this});
        }
        return "IndoorGuideCurrentPositionResponseBean{retailerId='" + this.retailerId + "', poiId=" + this.poiId + ", imageUrl='" + this.imageUrl + "', thumbnailUrl='" + this.thumbnailUrl + "', poiName='" + this.poiName + "', shopName='" + this.shopName + "', poiType=" + this.poiType + ", floor=" + this.floor + '}';
    }

    public IndoorGuideCurrentPositionResponseBean(Builder builder) {
        this.retailerId = builder.retailerId;
        this.poiId = builder.poiId;
        this.imageUrl = builder.imageUrl;
        this.thumbnailUrl = builder.thumbnailUrl;
        this.poiName = builder.poiName;
        this.shopName = builder.shopName;
        this.poiType = builder.poiType;
        this.floor = builder.floor;
    }
}
