package me.ele.aiot.kernel.http.ota.net.model;

import androidx.annotation.NonNull;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import com.taobao.accs.common.Constants;
import com.taobao.tao.image.c;
import java.util.List;
import java.util.Map;
import me.ele.normandie.sampling.cache.db.MySQLiteHelper;
import me.ele.normandie.sampling.collector.ModelContainer;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class CheckOTAVersionRequest {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("appId")
    private String appId;

    @SerializedName(ModelContainer.CITY_ID)
    private int cityId;

    @SerializedName("deviceCode")
    private String deviceCode;

    @SerializedName(c.MODULES)
    private List<Map<String, String>> modules;

    @SerializedName(Constants.KEY_OS_TYPE)
    private String osType;

    @SerializedName("productKey")
    private String productKey;

    @SerializedName("productTypeKey")
    private String productTypeKey;

    @SerializedName("requestId")
    private String requestId;

    @SerializedName("selfDeveloped")
    private String selfDeveloped;

    @SerializedName(MySQLiteHelper.CURRENT_SIZE)
    private String size;

    @SerializedName("timestamp")
    private String timestamp;

    public String getDeviceCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.deviceCode;
    }

    public String getProductTypeKey() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? (String) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this}) : this.productTypeKey;
    }

    public String getSize() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.size;
    }

    public void setCityId(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.cityId = i12;
        }
    }

    public void setDeviceCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.deviceCode = str;
        }
    }

    public void setModules(List<Map<String, String>> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, list});
        } else {
            this.modules = list;
        }
    }

    public void setOsType(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
        } else {
            this.osType = str;
        }
    }

    public void setProductKey(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, str});
        } else {
            this.productKey = str;
        }
    }

    public void setProductTypeKey(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this, str});
        } else {
            this.productTypeKey = str;
        }
    }

    public void setRequestId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str});
        } else {
            this.requestId = str;
        }
    }

    public void setSelfDeveloped(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.selfDeveloped = str;
        }
    }

    public void setSize(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, str});
        } else {
            this.size = str;
        }
    }

    public void setTimestamp(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, str});
        } else {
            this.timestamp = str;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            return (String) iSurgeon.surgeon$dispatch("14", new Object[]{this});
        }
        return "CheckOTAVersionRequest{appId='" + this.appId + "', requestId='" + this.requestId + "', timestamp='" + this.timestamp + "', productKey='" + this.productKey + "', productTypeKey='" + this.productTypeKey + "', osType='" + this.osType + "', modules=" + this.modules + ", deviceCode='" + this.deviceCode + "', size='" + this.size + "', selfDeveloped='" + this.selfDeveloped + "', cityId=" + this.cityId + '}';
    }
}
