package me.ele.aiot.kernel.http.ota.net.model;

import androidx.annotation.NonNull;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class CheckOTAVersionResponse {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("code")
    private int code;

    @SerializedName("content")
    private List<OTAUpgrageVersionInfo> content;

    @SerializedName("msg")
    private String msg;

    @SerializedName("requestId")
    private String requestId;

    /* loaded from: classes4.dex */
    public static class OTAUpgrageVersionInfo {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @SerializedName("fileSize")
        private int fileSize;

        @SerializedName(Constant.IN_KEY_FACE_MD5)
        private String md5;

        @SerializedName("modelType")
        private String modelType;

        @SerializedName("upgradeOtaRecordId")
        private String upgradeOtaRecordId;

        @SerializedName("url")
        private String url;

        @SerializedName("version")
        private String version;

        public int getFileSize() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.fileSize;
        }

        public String getMd5() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.md5;
        }

        public String getModelType() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "11") ? (String) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.modelType;
        }

        public String getUpgradeOtaRecordId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "6") ? (String) iSurgeon.surgeon$dispatch("6", new Object[]{this}) : this.upgradeOtaRecordId;
        }

        public String getUrl() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.url;
        }

        public String getVersion() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.version;
        }

        public void setFileSize(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "9")) {
                iSurgeon.surgeon$dispatch("9", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.fileSize = i12;
            }
        }

        public void setMd5(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
            } else {
                this.md5 = str;
            }
        }

        public void setModelType(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "12")) {
                iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
            } else {
                this.modelType = str;
            }
        }

        public void setUpgradeOtaRecordId(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                iSurgeon.surgeon$dispatch("7", new Object[]{this, str});
            } else {
                this.upgradeOtaRecordId = str;
            }
        }

        public void setUrl(@NonNull String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            } else {
                this.url = str;
            }
        }

        public void setVersion(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
                iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str});
            } else {
                this.version = str;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "13")) {
                return (String) iSurgeon.surgeon$dispatch("13", new Object[]{this});
            }
            return "OTAUpgrageVersionInfo{url='" + this.url + "', md5='" + this.md5 + "', fileSize=" + this.fileSize + ", version='" + this.version + "', modelType='" + this.modelType + "', upgradeOtaRecordId='" + this.upgradeOtaRecordId + "'}";
        }
    }

    CheckOTAVersionResponse(int i12, String str, String str2, List<OTAUpgrageVersionInfo> list) {
        this.code = i12;
        this.requestId = str;
        this.msg = str2;
        this.content = list;
    }

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
    }

    public String getMsg() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.msg;
    }

    public List<OTAUpgrageVersionInfo> getOTAdata() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (List) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.content;
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
        return "CheckOTAVersionResponse{code=" + this.code + ", msg='" + this.msg + "', requestId='" + this.requestId + "', content=" + this.content.toString() + '}';
    }
}
