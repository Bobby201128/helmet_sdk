package me.ele.aiot.kernel.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class QueryBindDeviceInfoResponseBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private int code;
    private List<ContentDTO> content;
    private String msg;
    private String requestId;

    /* loaded from: classes4.dex */
    public static class ContentDTO implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private String appId;
        private String deviceCode;
        private String macAddress;
        private String productKey;
        private String productTypeKey;
        private String productTypeKeyDesc;
        private String userId;

        public String getAppId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.appId;
        }

        public String getDeviceCode() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.deviceCode;
        }

        public String getMacAddress() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "9") ? (String) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.macAddress;
        }

        public String getProductKey() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.productKey;
        }

        public String getProductTypeKey() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.productTypeKey;
        }

        public String getProductTypeKeyDesc() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.productTypeKeyDesc;
        }

        public String getUserId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "13") ? (String) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : this.userId;
        }

        public void setAppId(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "12")) {
                iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
            } else {
                this.appId = str;
            }
        }

        public void setDeviceCode(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
            } else {
                this.deviceCode = str;
            }
        }

        public void setMacAddress(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
                iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str});
            } else {
                this.macAddress = str;
            }
        }

        public void setProductKey(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            } else {
                this.productKey = str;
            }
        }

        public void setProductTypeKey(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            } else {
                this.productTypeKey = str;
            }
        }

        public void setProductTypeKeyDesc(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
            } else {
                this.productTypeKeyDesc = str;
            }
        }

        public void setUserId(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "14")) {
                iSurgeon.surgeon$dispatch("14", new Object[]{this, str});
            } else {
                this.userId = str;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "15")) {
                return (String) iSurgeon.surgeon$dispatch("15", new Object[]{this});
            }
            return "ContentDTO{appId='" + this.appId + "', deviceCode='" + this.deviceCode + "', productKey='" + this.productKey + "', productTypeKey='" + this.productTypeKey + "', productTypeKeyDesc='" + this.productTypeKeyDesc + "', macAddress='" + this.macAddress + "', userId='" + this.userId + "'}";
        }
    }

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
    }

    public List<ContentDTO> getContent() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (List) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.content;
    }

    public String getMsg() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.msg;
    }

    public String getRequestId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.requestId;
    }

    public void setCode(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.code = i12;
        }
    }

    public void setContent(List<ContentDTO> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, list});
        } else {
            this.content = list;
        }
    }

    public void setMsg(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.msg = str;
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

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (String) iSurgeon.surgeon$dispatch("9", new Object[]{this});
        }
        return "QueryBindDeviceInfoResponseBean{code=" + this.code + ", content=" + this.content + ", msg='" + this.msg + "', requestId='" + this.requestId + "'}";
    }
}
