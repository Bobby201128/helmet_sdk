package me.ele.aiot.indoorguide.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.LinkedHashMap;
import me.ele.aiot.indoorguide.model.IndoorGuideModel;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class ModelInfoResultBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("result")
    private LinkedHashMap<String, LinkedHashMap<String, IndoorGuideModel>> modelInfoHashMap;

    @SerializedName("requestId")
    private String requestId;

    @SerializedName("success")
    private boolean success;

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.code;
    }

    public String getMessage() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.message;
    }

    public LinkedHashMap<String, LinkedHashMap<String, IndoorGuideModel>> getModelInfoHashMap() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (LinkedHashMap) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.modelInfoHashMap;
    }

    public String getRequestId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.requestId;
    }

    public boolean isSuccess() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{this})).booleanValue() : this.success;
    }

    public void setCode(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.code = i12;
        }
    }

    public void setMessage(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.message = str;
        }
    }

    public void setModelInfoHashMap(LinkedHashMap<String, LinkedHashMap<String, IndoorGuideModel>> linkedHashMap) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, linkedHashMap});
        } else {
            this.modelInfoHashMap = linkedHashMap;
        }
    }

    public void setRequestId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
        } else {
            this.requestId = str;
        }
    }

    public void setSuccess(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.success = z12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            return (String) iSurgeon.surgeon$dispatch("11", new Object[]{this});
        }
        return "ModelInfoResultBean{success=" + this.success + ", code=" + this.code + ", message='" + this.message + "', requestId='" + this.requestId + "', modelInfoHashMap=" + this.modelInfoHashMap + '}';
    }
}
