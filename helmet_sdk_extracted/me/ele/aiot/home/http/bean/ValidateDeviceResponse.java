package me.ele.aiot.home.http.bean;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class ValidateDeviceResponse implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private int code;
    private ContentData content;
    private String msg;
    private String requestId;

    /* loaded from: classes4.dex */
    public class ContentData implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        String deviceCode;
        String macAddress;
        String productTypeKey;
        String productTypeKeyDesc;

        public ContentData() {
        }

        public String getDeviceCode() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.deviceCode;
        }

        public String getMacAddress() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.macAddress;
        }

        public String getProductTypeKey() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.productTypeKey;
        }

        public String getProductTypeKeyDesc() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "4") ? (String) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.productTypeKeyDesc;
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "5")) {
                return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
            }
            return "ContentData{macAddress='" + this.macAddress + "', deviceCode='" + this.deviceCode + "', productTypeKey='" + this.productTypeKey + "', productTypeKeyDesc='" + this.productTypeKeyDesc + "'}";
        }
    }

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
    }

    public ContentData getContent() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (ContentData) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.content;
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
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "ValidateDeviceResponse{code=" + this.code + ", msg='" + this.msg + "', requestId='" + this.requestId + "', content=" + this.content + '}';
    }
}
