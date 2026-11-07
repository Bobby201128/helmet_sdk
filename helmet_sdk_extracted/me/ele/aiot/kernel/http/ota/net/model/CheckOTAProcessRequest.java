package me.ele.aiot.kernel.http.ota.net.model;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class CheckOTAProcessRequest {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("deviceCode")
    private String deviceCode;

    @SerializedName("recordParams")
    private List<Map> recordParams;

    @SerializedName("requestId")
    private String requestId;

    /* loaded from: classes4.dex */
    public static class detailParam {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private String progress;
        private String stage;
        private String stageTime;

        public String getProgress() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.progress;
        }

        public String getStage() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.stage;
        }

        public String getStageTime() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.stageTime;
        }

        public void setProgress(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            } else {
                this.progress = str;
            }
        }

        public void setStage(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
            } else {
                this.stage = str;
            }
        }

        public void setStageTime(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            } else {
                this.stageTime = str;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
            }
            return "detailParam{stage='" + this.stage + "', stageTime='" + this.stageTime + "', progress='" + this.progress + "'}";
        }
    }

    /* loaded from: classes4.dex */
    public static class recordParam {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private List<detailParam> detailParams;
        private String modelType;
        private String upgradeOtaRecordId;
        private String upgradeOtaRecordStatus;
        private String version;

        public List<detailParam> getDetailParams() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "9") ? (List) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.detailParams;
        }

        public String getModelType() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.modelType;
        }

        public String getUpgradeOtaRecordId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.upgradeOtaRecordId;
        }

        public String getUpgradeOtaRecordStatus() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.upgradeOtaRecordStatus;
        }

        public String getVersion() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.version;
        }

        public void setDetailParams(List<detailParam> list) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
                iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, list});
            } else {
                this.detailParams = list;
            }
        }

        public void setModelType(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
            } else {
                this.modelType = str;
            }
        }

        public void setUpgradeOtaRecordId(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            } else {
                this.upgradeOtaRecordId = str;
            }
        }

        public void setUpgradeOtaRecordStatus(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
            } else {
                this.upgradeOtaRecordStatus = str;
            }
        }

        public void setVersion(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            } else {
                this.version = str;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "11")) {
                return (String) iSurgeon.surgeon$dispatch("11", new Object[]{this});
            }
            return "recordParam{modelType='" + this.modelType + "', version='" + this.version + "', upgradeOtaRecordId='" + this.upgradeOtaRecordId + "', upgradeOtaRecordStatus='" + this.upgradeOtaRecordStatus + "', detailParams=" + this.detailParams + '}';
        }
    }

    public String getDeviceCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (String) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.deviceCode;
    }

    public Map<String, Object> getParamMap() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (Map) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceCode", this.deviceCode);
        hashMap.put("recordParams", this.recordParams);
        return hashMap;
    }

    public List<Map> getRecordParams() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? (List) iSurgeon.surgeon$dispatch("6", new Object[]{this}) : this.recordParams;
    }

    public String getRequestId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : this.requestId;
    }

    public void setDeviceCode(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, str});
        } else {
            this.deviceCode = str;
        }
    }

    public void setRecordParams(List<Map> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, list});
        } else {
            this.recordParams = list;
        }
    }

    public void setRequestId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, str});
        } else {
            this.requestId = str;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            return (String) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this});
        }
        return "CheckOTAProcessRequest{deviceCode='" + this.deviceCode + "', requestId='" + this.requestId + "', recordParams=" + this.recordParams + '}';
    }
}
