package me.ele.aiot.indoorguide.database.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import me.ele.im.base.conversation.EIMConversation;
import org.android.agoo.common.AgooConstants;

@Entity
/* loaded from: classes4.dex */
public class NodeInfo implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("associated_retailerId")
    @ColumnInfo
    @JSONField(name = "associated_retailerId")
    String associated_retailerId;

    @SerializedName("floor")
    @ColumnInfo
    @JSONField(name = "floor")
    int floor;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    @ColumnInfo
    @JSONField(name = "id")
    int f61977id;

    @SerializedName("img_thumbnails_url")
    @ColumnInfo
    @JSONField(name = "img_thumbnails_url")
    String img_thumbnails_url;

    @SerializedName("img_url")
    @ColumnInfo
    @JSONField(name = "img_url")
    String img_url;

    @SerializedName("neighbor")
    @ColumnInfo
    @JSONField(name = "neighbor")
    String neighbor;

    @NonNull
    @SerializedName("retailer_id")
    @PrimaryKey
    @ColumnInfo
    @JSONField(name = "retailer_id")
    String retailer_id;

    @SerializedName(EIMConversation.KEY_SHOP_NAME)
    @ColumnInfo
    @JSONField(name = EIMConversation.KEY_SHOP_NAME)
    String shop_name;

    @SerializedName("type")
    @ColumnInfo
    @JSONField(name = "type")
    int type;

    public NodeInfo(int i12, @NonNull String str, String str2, int i13, int i14, String str3, String str4, String str5, String str6) {
        this.f61977id = i12;
        this.retailer_id = str;
        this.shop_name = str2;
        this.type = i13;
        this.floor = i14;
        this.img_url = str3;
        this.img_thumbnails_url = str4;
        this.neighbor = str5;
        this.associated_retailerId = str6;
    }

    public String getAssociated_retailerId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "17") ? (String) iSurgeon.surgeon$dispatch("17", new Object[]{this}) : this.associated_retailerId;
    }

    public int getFloor() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? ((Integer) iSurgeon.surgeon$dispatch("9", new Object[]{this})).intValue() : this.floor;
    }

    public int getId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.f61977id;
    }

    public String getImg_thumbnails_url() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? (String) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : this.img_thumbnails_url;
    }

    public String getImg_url() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.img_url;
    }

    public String getNeighbor() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? (String) iSurgeon.surgeon$dispatch("15", new Object[]{this}) : this.neighbor;
    }

    @NonNull
    public String getRetailer_id() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.retailer_id;
    }

    public String getShop_name() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.shop_name;
    }

    public int getType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.type;
    }

    public void setAssociated_retailerId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, str});
        } else {
            this.associated_retailerId = str;
        }
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
            this.f61977id = i12;
        }
    }

    public void setImg_thumbnails_url(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, str});
        } else {
            this.img_thumbnails_url = str;
        }
    }

    public void setImg_url(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
        } else {
            this.img_url = str;
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

    public void setRetailer_id(@NonNull String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.retailer_id = str;
        }
    }

    public void setShop_name(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.shop_name = str;
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
        if (InstrumentAPI.support(iSurgeon, "19")) {
            return (String) iSurgeon.surgeon$dispatch("19", new Object[]{this});
        }
        return "NodeInfo{id=" + this.f61977id + ", retailer_id='" + this.retailer_id + "', shop_name='" + this.shop_name + "', type=" + this.type + ", floor=" + this.floor + ", img_url='" + this.img_url + "', img_thumbnails_url='" + this.img_thumbnails_url + "', neighbor='" + this.neighbor + "', associated_retailerId='" + this.associated_retailerId + "'}";
    }
}
