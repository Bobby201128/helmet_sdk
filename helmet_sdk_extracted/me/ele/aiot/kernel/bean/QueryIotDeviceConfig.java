package me.ele.aiot.kernel.bean;

import androidx.annotation.NonNull;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.ArrayList;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class QueryIotDeviceConfig implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private int code;
    private ErrorResult error;

    /* renamed from: id, reason: collision with root package name */
    private String f61979id;
    private IotDeviceConfigResult result;

    /* loaded from: classes4.dex */
    public class ErrorResult implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private String gracefulMsg;
        private String message;
        private String meta;
        private String name;

        public ErrorResult() {
        }

        public String getGracefulMsg() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.gracefulMsg;
        }

        public String getMessage() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.message;
        }

        public String getMeta() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.meta;
        }

        public String getName() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.name;
        }

        public void setGracefulMsg(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
            } else {
                this.gracefulMsg = str;
            }
        }

        public void setMessage(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
            } else {
                this.message = str;
            }
        }

        public void setMeta(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            } else {
                this.meta = str;
            }
        }

        public void setName(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
            } else {
                this.name = str;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "9")) {
                return (String) iSurgeon.surgeon$dispatch("9", new Object[]{this});
            }
            return "ErrorResult{name='" + this.name + "', message='" + this.message + "', meta=" + this.meta + ", gracefulMsg='" + this.gracefulMsg + "'}";
        }
    }

    /* loaded from: classes4.dex */
    public class IotDeviceConfigResult implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private int code;
        private ContentIOTSecret content;
        private String msg;
        private String requestId;

        /* loaded from: classes4.dex */
        public class ContentIOTSecret implements Serializable {
            private static transient /* synthetic */ ISurgeon $surgeonFlag;
            private int manufacturerId;
            private ArrayList<String> modelTypes;
            private String productKey;
            private String productSeriesType;
            private String productTypeKey;
            private String secret;
            private int selfDeveloped;
            private String thingModelProductKey;

            public ContentIOTSecret() {
            }

            public int getManufacturerId() {
                ISurgeon iSurgeon = $surgeonFlag;
                return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.manufacturerId;
            }

            public ArrayList<String> getModelTypes() {
                ISurgeon iSurgeon = $surgeonFlag;
                return InstrumentAPI.support(iSurgeon, "13") ? (ArrayList) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : this.modelTypes;
            }

            public String getProductKey() {
                ISurgeon iSurgeon = $surgeonFlag;
                return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? (String) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this}) : this.productKey;
            }

            public String getProductSeriesType() {
                ISurgeon iSurgeon = $surgeonFlag;
                return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.productSeriesType;
            }

            public String getProductTypeKey() {
                ISurgeon iSurgeon = $surgeonFlag;
                return InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE) ? (String) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this}) : this.productTypeKey;
            }

            public String getSecret() {
                ISurgeon iSurgeon = $surgeonFlag;
                return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.secret;
            }

            public int getSelfDeveloped() {
                ISurgeon iSurgeon = $surgeonFlag;
                return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.selfDeveloped;
            }

            public String getThingModelProductKey() {
                ISurgeon iSurgeon = $surgeonFlag;
                return InstrumentAPI.support(iSurgeon, "15") ? (String) iSurgeon.surgeon$dispatch("15", new Object[]{this}) : this.thingModelProductKey;
            }

            public void setManufacturerId(int i12) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "2")) {
                    iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
                } else {
                    this.manufacturerId = i12;
                }
            }

            public void setModelTypes(ArrayList<String> arrayList) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "14")) {
                    iSurgeon.surgeon$dispatch("14", new Object[]{this, arrayList});
                } else {
                    this.modelTypes = arrayList;
                }
            }

            public void setProductKey(String str) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "9")) {
                    iSurgeon.surgeon$dispatch("9", new Object[]{this, str});
                } else {
                    this.productKey = str;
                }
            }

            public void setProductSeriesType(String str) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "12")) {
                    iSurgeon.surgeon$dispatch("12", new Object[]{this, str});
                } else {
                    this.productSeriesType = str;
                }
            }

            public void setProductTypeKey(String str) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "11")) {
                    iSurgeon.surgeon$dispatch("11", new Object[]{this, str});
                } else {
                    this.productTypeKey = str;
                }
            }

            public void setSecret(String str) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "4")) {
                    iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
                } else {
                    this.secret = str;
                }
            }

            public void setSelfDeveloped(int i12) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "6")) {
                    iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
                } else {
                    this.selfDeveloped = i12;
                }
            }

            public void setThingModelProductKey(String str) {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "16")) {
                    iSurgeon.surgeon$dispatch("16", new Object[]{this, str});
                } else {
                    this.thingModelProductKey = str;
                }
            }

            @NonNull
            public String toString() {
                ISurgeon iSurgeon = $surgeonFlag;
                if (InstrumentAPI.support(iSurgeon, "17")) {
                    return (String) iSurgeon.surgeon$dispatch("17", new Object[]{this});
                }
                return "ContentIOTSecret{manufacturerId=" + this.manufacturerId + ", secret='" + this.secret + "', selfDeveloped=" + this.selfDeveloped + ", productSeriesType='" + this.productSeriesType + "', productKey='" + this.productKey + "', productTypeKey='" + this.productTypeKey + "', modelTypes=" + this.modelTypes + ", thingModelProductKey='" + this.thingModelProductKey + "'}";
            }
        }

        public IotDeviceConfigResult() {
        }

        public int getCode() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
        }

        public ContentIOTSecret getContent() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (ContentIOTSecret) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.content;
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

        public void setContent(ContentIOTSecret contentIOTSecret) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, contentIOTSecret});
            } else {
                this.content = contentIOTSecret;
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

        @NonNull
        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "9")) {
                return (String) iSurgeon.surgeon$dispatch("9", new Object[]{this});
            }
            return "IotDeviceConfigResult{code=" + this.code + ", content=" + this.content + ", msg='" + this.msg + "', requestId='" + this.requestId + "'}";
        }
    }

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
    }

    public ErrorResult getError() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (ErrorResult) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.error;
    }

    public String getId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.f61979id;
    }

    public IotDeviceConfigResult getResult() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (IotDeviceConfigResult) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.result;
    }

    public void setCode(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.code = i12;
        }
    }

    public void setError(ErrorResult errorResult) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, errorResult});
        } else {
            this.error = errorResult;
        }
    }

    public void setId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.f61979id = str;
        }
    }

    public void setResult(IotDeviceConfigResult iotDeviceConfigResult) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, iotDeviceConfigResult});
        } else {
            this.result = iotDeviceConfigResult;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (String) iSurgeon.surgeon$dispatch("9", new Object[]{this});
        }
        return "QueryIotDeviceConfig{code=" + this.code + ", id='" + this.f61979id + "', result=" + this.result + ", error='" + this.error + "'}";
    }
}
