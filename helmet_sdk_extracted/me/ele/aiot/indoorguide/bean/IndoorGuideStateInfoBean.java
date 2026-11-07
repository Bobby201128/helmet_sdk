package me.ele.aiot.indoorguide.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class IndoorGuideStateInfoBean {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public final int floor;
    public final String imageUrl;
    public String poiDesc;
    public final long poiId;
    public final String poiName;
    public final int poiState;
    public int poiType;
    public final String retailerId;
    public final String thumbnailUrl;

    /* loaded from: classes4.dex */
    public static class Builder {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        public int floor;
        public String imageUrl;
        public long poiId;
        public String poiName;
        public int poiState;
        public String retailerId;
        public String thumbnailUrl;

        public Builder() {
        }

        public IndoorGuideStateInfoBean build() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? (IndoorGuideStateInfoBean) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this}) : new IndoorGuideStateInfoBean(this);
        }

        public Builder setFloor(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                return (Builder) iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
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

        public Builder setPoiState(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                return (Builder) iSurgeon.surgeon$dispatch("7", new Object[]{this, Integer.valueOf(i12)});
            }
            this.poiState = i12;
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

        public Builder setThumbnailUrl(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                return (Builder) iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            }
            this.thumbnailUrl = str;
            return this;
        }

        Builder(IndoorGuideStateInfoBean indoorGuideStateInfoBean) {
            this.retailerId = indoorGuideStateInfoBean.retailerId;
            this.poiId = indoorGuideStateInfoBean.poiId;
            this.imageUrl = indoorGuideStateInfoBean.imageUrl;
            this.thumbnailUrl = indoorGuideStateInfoBean.thumbnailUrl;
            this.poiName = indoorGuideStateInfoBean.poiName;
            this.floor = indoorGuideStateInfoBean.floor;
            this.poiState = indoorGuideStateInfoBean.poiState;
        }
    }

    public IndoorGuideStateInfoBean() {
        this(new Builder());
    }

    public int getFloor() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this})).intValue() : this.floor;
    }

    public String getImageUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (String) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.imageUrl;
    }

    public String getPoiDesc() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.poiDesc;
    }

    public long getPoiId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Long) iSurgeon.surgeon$dispatch("2", new Object[]{this})).longValue() : this.poiId;
    }

    public String getPoiName() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.poiName;
    }

    public int getPoiState() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.poiState;
    }

    public int getPoiType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? ((Integer) iSurgeon.surgeon$dispatch("6", new Object[]{this})).intValue() : this.poiType;
    }

    public String getRetailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.retailerId;
    }

    public String getThumbnailUrl() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.thumbnailUrl;
    }

    public Builder newBuilder() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "12") ? (Builder) iSurgeon.surgeon$dispatch("12", new Object[]{this}) : new Builder(this);
    }

    public void setPoiDesc(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str});
        } else {
            this.poiDesc = str;
        }
    }

    public void setPoiType(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.poiType = i12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            return (String) iSurgeon.surgeon$dispatch("13", new Object[]{this});
        }
        return "IndoorGuideStateInfoBean{retailerId='" + this.retailerId + "', poiName='" + this.poiName + "', floor=" + this.floor + ", poiType=" + this.poiType + ", poiState=" + this.poiState + ", poiDesc='" + this.poiDesc + "'}";
    }

    public IndoorGuideStateInfoBean(Builder builder) {
        this.retailerId = builder.retailerId;
        this.poiId = builder.poiId;
        this.imageUrl = builder.imageUrl;
        this.thumbnailUrl = builder.thumbnailUrl;
        this.poiName = builder.poiName;
        this.floor = builder.floor;
        this.poiState = builder.poiState;
    }
}
