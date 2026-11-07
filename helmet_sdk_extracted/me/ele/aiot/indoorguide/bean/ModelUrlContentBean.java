package me.ele.aiot.indoorguide.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import me.ele.im.base.conversation.EIMConversation;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class ModelUrlContentBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("edges")
    private List<EdgeModel> edges;

    @SerializedName("nodes")
    private List<NodeModel> nodes;

    /* loaded from: classes4.dex */
    public static class EdgeModel implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @SerializedName("source_id")
        private int sourceId;

        @SerializedName("target_id")
        private int targetId;

        @SerializedName("weight")
        private String weight;

        public int getSourceId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.sourceId;
        }

        public int getTargetId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.targetId;
        }

        public String getWeight() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.weight;
        }

        public void setSourceId(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.sourceId = i12;
            }
        }

        public void setTargetId(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.targetId = i12;
            }
        }

        public void setWeight(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            } else {
                this.weight = str;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
            }
            return "EdgeModel{sourceId=" + this.sourceId + ", targetId=" + this.targetId + ", weight='" + this.weight + "'}";
        }
    }

    /* loaded from: classes4.dex */
    public static class NodeModel implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @SerializedName("floor")
        private int floor;

        /* renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private int f61974id;

        @SerializedName("img_thumbnails_url")
        private String imgThumbnailsUrl;

        @SerializedName("img_url")
        private String imgUrl;

        @SerializedName("neighbor")
        private String neighbor;

        @SerializedName("retailer_id")
        private String retailerId;

        @SerializedName(EIMConversation.KEY_SHOP_NAME)
        private String shopName;

        @SerializedName("type")
        private int type;

        public int getFloor() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "9") ? ((Integer) iSurgeon.surgeon$dispatch("9", new Object[]{this})).intValue() : this.floor;
        }

        public int getId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.f61974id;
        }

        public String getImgThumbnailsUrl() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "13") ? (String) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : this.imgThumbnailsUrl;
        }

        public String getImgUrl() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.imgUrl;
        }

        public String getNeighbor() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "15") ? (String) iSurgeon.surgeon$dispatch("15", new Object[]{this}) : this.neighbor;
        }

        public String getRetailerId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.retailerId;
        }

        public String getShopName() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.shopName;
        }

        public int getType() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.type;
        }

        public void setFloor(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
                iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.floor = i12;
            }
        }

        public void setId(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.f61974id = i12;
            }
        }

        public void setImgThumbnailsUrl(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "14")) {
                iSurgeon.surgeon$dispatch("14", new Object[]{this, str});
            } else {
                this.imgThumbnailsUrl = str;
            }
        }

        public void setImgUrl(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "12")) {
                iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
            } else {
                this.imgUrl = str;
            }
        }

        public void setNeighbor(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "16")) {
                iSurgeon.surgeon$dispatch("16", new Object[]{this, str});
            } else {
                this.neighbor = str;
            }
        }

        public void setRetailerId(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            } else {
                this.retailerId = str;
            }
        }

        public void setShopName(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            } else {
                this.shopName = str;
            }
        }

        public void setType(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.type = i12;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "17")) {
                return (String) iSurgeon.surgeon$dispatch("17", new Object[]{this});
            }
            return "NodeModel{id=" + this.f61974id + ", retailerId='" + this.retailerId + "', shopName='" + this.shopName + "', type=" + this.type + ", floor=" + this.floor + ", imgUrl='" + this.imgUrl + "', imgThumbnailsUrl='" + this.imgThumbnailsUrl + "', neighbor='" + this.neighbor + "'}";
        }
    }

    public List<EdgeModel> getEdges() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (List) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.edges;
    }

    public List<NodeModel> getNodes() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (List) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.nodes;
    }

    public void setEdges(List<EdgeModel> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, list});
        } else {
            this.edges = list;
        }
    }

    public void setNodes(List<NodeModel> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, list});
        } else {
            this.nodes = list;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "ModelUrlContentBean{nodes=" + this.nodes + ", edges=" + this.edges + '}';
    }
}
