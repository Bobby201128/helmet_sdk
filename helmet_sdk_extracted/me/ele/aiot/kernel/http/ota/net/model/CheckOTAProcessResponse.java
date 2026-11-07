package me.ele.aiot.kernel.http.ota.net.model;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes4.dex */
public class CheckOTAProcessResponse {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("code")
    private int code;

    @SerializedName("msg")
    private String msg;

    @SerializedName("requestId")
    private String requestId;

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
    }

    public String getMsg() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.msg;
    }

    public String getRequestId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.requestId;
    }

    public void setCode(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.code = i12;
        }
    }

    public void setMsg(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.msg = str;
        }
    }

    public void setRequestId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.requestId = str;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
        }
        return "CheckOTAProcessResponse{code=" + this.code + ", msg='" + this.msg + "', requestId='" + this.requestId + "'}";
    }
}
