package me.ele.aiot.home.http.bean;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class BindOrUnbindResponse implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private int code;
    private String msg;
    private String requestId;

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
    }

    public String getMessage() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.msg;
    }

    public String getRequestId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.requestId;
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (String) iSurgeon.surgeon$dispatch("4", new Object[]{this});
        }
        return "BindOrUnbindResponse{code=" + this.code + ", msg='" + this.msg + "', requestId='" + this.requestId + "'}";
    }
}
