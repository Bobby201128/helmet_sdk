package me.ele.aiot.home.http.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public class QueryDeviceInfoByMacAddressResponse implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private int code;
    private List<ContentData> content;
    private String msg;
    private String requestId;

    /* loaded from: classes4.dex */
    public class ContentData implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        String deviceCode;
        String macAddress;
        String productTypeKey;
        String productTypeKeyDesc;
        int rssi;

        public ContentData() {
        }

        public boolean equals(Object obj) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                return ((Boolean) iSurgeon.surgeon$dispatch("7", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            try {
                if (!(obj instanceof ContentData)) {
                    return false;
                }
                return Objects.equals(this.macAddress, ((ContentData) obj).macAddress);
            } catch (Throwable unused) {
                return false;
            }
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

        public int getRssi() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.rssi;
        }

        public int hashCode() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this})).intValue() : Objects.hash(this.macAddress);
        }

        public void setRssi(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.rssi = i12;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "9")) {
                return (String) iSurgeon.surgeon$dispatch("9", new Object[]{this});
            }
            return "ContentData{macAddress='" + this.macAddress + "', deviceCode='" + this.deviceCode + "', productTypeKey='" + this.productTypeKey + "', productTypeKeyDesc='" + this.productTypeKeyDesc + "'}";
        }
    }

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
    }

    public List<ContentData> getContent() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (List) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.content;
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
