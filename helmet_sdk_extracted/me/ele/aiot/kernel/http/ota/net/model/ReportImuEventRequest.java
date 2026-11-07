package me.ele.aiot.kernel.http.ota.net.model;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class ReportImuEventRequest {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("reportList")
    private List<ReportImuItem> reportList;

    @SerializedName("requestId")
    private String requestId;

    /* loaded from: classes4.dex */
    public static class ReportImuItem {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private String collectFrom;
        private long collectTime;
        private String deviceCode;
        private List<detailParam> imuDetails;
        private byte[] imuRaw;

        public String getCollectFrom() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.collectFrom;
        }

        public long getCollectTime() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[]{this})).longValue() : this.collectTime;
        }

        public String getDeviceCode() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.deviceCode;
        }

        public List<detailParam> getImuDetails() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "7") ? (List) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.imuDetails;
        }

        public byte[] getImuRaw() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "9") ? (byte[]) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.imuRaw;
        }

        public void setCollectFrom(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
            } else {
                this.collectFrom = str;
            }
        }

        public void setCollectTime(long j12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Long.valueOf(j12)});
            } else {
                this.collectTime = j12;
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

        public void setImuDetails(List<detailParam> list) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, list});
            } else {
                this.imuDetails = list;
            }
        }

        public void setImuRaw(byte[] bArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
                iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, bArr});
            } else {
                this.imuRaw = bArr;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "11")) {
                return (String) iSurgeon.surgeon$dispatch("11", new Object[]{this});
            }
            return "ReportImuItem{deviceCode='" + this.deviceCode + "', collectTime=" + this.collectTime + ", collectFrom='" + this.collectFrom + "', imuDetails=" + this.imuDetails + ", imuRaw=" + Arrays.toString(this.imuRaw) + '}';
        }
    }

    /* loaded from: classes4.dex */
    public static class detailParam {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private int imuPitch;
        private int imuRoll;
        private long imuTime;
        private int imuX;
        private int imuY;
        private int imuYaw;
        private int imuZ;

        public int getImuPitch() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "9") ? ((Integer) iSurgeon.surgeon$dispatch("9", new Object[]{this})).intValue() : this.imuPitch;
        }

        public int getImuRoll() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "11") ? ((Integer) iSurgeon.surgeon$dispatch("11", new Object[]{this})).intValue() : this.imuRoll;
        }

        public long getImuTime() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? ((Long) iSurgeon.surgeon$dispatch("1", new Object[]{this})).longValue() : this.imuTime;
        }

        public int getImuX() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.imuX;
        }

        public int getImuY() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.imuY;
        }

        public int getImuYaw() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "13") ? ((Integer) iSurgeon.surgeon$dispatch("13", new Object[]{this})).intValue() : this.imuYaw;
        }

        public int getImuZ() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "7") ? ((Integer) iSurgeon.surgeon$dispatch("7", new Object[]{this})).intValue() : this.imuZ;
        }

        public void setImuPitch(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
                iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.imuPitch = i12;
            }
        }

        public void setImuRoll(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "12")) {
                iSurgeon.surgeon$dispatch("12", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.imuRoll = i12;
            }
        }

        public void setImuTime(long j12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Long.valueOf(j12)});
            } else {
                this.imuTime = j12;
            }
        }

        public void setImuX(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.imuX = i12;
            }
        }

        public void setImuY(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.imuY = i12;
            }
        }

        public void setImuYaw(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "14")) {
                iSurgeon.surgeon$dispatch("14", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.imuYaw = i12;
            }
        }

        public void setImuZ(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.imuZ = i12;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "15")) {
                return (String) iSurgeon.surgeon$dispatch("15", new Object[]{this});
            }
            return "detailParam{imuTime=" + this.imuTime + ", imuX=" + this.imuX + ", imuY=" + this.imuY + ", imuZ=" + this.imuZ + ", imuPitch=" + this.imuPitch + ", imuRoll=" + this.imuRoll + ", imuYaw=" + this.imuYaw + '}';
        }
    }

    public List<ReportImuItem> getReportList() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (List) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.reportList;
    }

    public String getRequestId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.requestId;
    }

    public void setReportList(List<ReportImuItem> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, list});
        } else {
            this.reportList = list;
        }
    }

    public void setRequestId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.requestId = str;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "ReportImuEventRequest{requestId='" + this.requestId + "', reportList=" + this.reportList + '}';
    }
}
