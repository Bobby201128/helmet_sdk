package me.ele.aiot.kernel.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import com.taobao.tao.log.statistics.TLogEventConst;
import java.io.Serializable;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class AudioTranscribeDTO implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("asrType")
    private String asrType;

    @SerializedName("audioData")
    private String audioData;

    @SerializedName("contactType")
    private Integer contactType;

    @SerializedName("fileLength")
    private Long fileLength;

    @SerializedName(TLogEventConst.PARAM_UPLOAD_FILE_TYPE)
    private String fileType;

    @SerializedName("knightId")
    private String knightId;

    @SerializedName("requestId")
    private String requestId;

    @SerializedName("time")
    private String time;

    @SerializedName("trackingId")
    private Long trackingId;

    public String getAsrType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.asrType;
    }

    public String getAudioData() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (String) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.audioData;
    }

    public Integer getContactType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "17") ? (Integer) iSurgeon.surgeon$dispatch("17", new Object[]{this}) : this.contactType;
    }

    public Long getFileLength() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (Long) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.fileLength;
    }

    public String getFileType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (String) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.fileType;
    }

    public String getKnightId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.knightId;
    }

    public String getRequestId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.requestId;
    }

    public String getTime() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? (String) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : this.time;
    }

    public Long getTrackingId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? (Long) iSurgeon.surgeon$dispatch("15", new Object[]{this}) : this.trackingId;
    }

    public void setAsrType(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
        } else {
            this.asrType = str;
        }
    }

    public void setAudioData(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, str});
        } else {
            this.audioData = str;
        }
    }

    public void setContactType(Integer num) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, num});
        } else {
            this.contactType = num;
        }
    }

    public void setFileLength(Long l12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, l12});
        } else {
            this.fileLength = l12;
        }
    }

    public void setFileType(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str});
        } else {
            this.fileType = str;
        }
    }

    public void setKnightId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.knightId = str;
        }
    }

    public void setRequestId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        } else {
            this.requestId = str;
        }
    }

    public void setTime(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, str});
        } else {
            this.time = str;
        }
    }

    public void setTrackingId(Long l12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, l12});
        } else {
            this.trackingId = l12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        int i12 = 0;
        if (InstrumentAPI.support(iSurgeon, "19")) {
            return (String) iSurgeon.surgeon$dispatch("19", new Object[]{this});
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioTranscribeDTO{knightId='");
        sb2.append(this.knightId);
        sb2.append('\'');
        sb2.append(", requestId='");
        sb2.append(this.requestId);
        sb2.append('\'');
        sb2.append(", asrType='");
        sb2.append(this.asrType);
        sb2.append('\'');
        sb2.append(", fileType='");
        sb2.append(this.fileType);
        sb2.append('\'');
        sb2.append(", fileLength=");
        sb2.append(this.fileLength);
        sb2.append(", time='");
        sb2.append(this.time);
        sb2.append('\'');
        sb2.append(", trackingId=");
        sb2.append(this.trackingId);
        sb2.append(", contactType=");
        sb2.append(this.contactType);
        sb2.append(", audioDataLength=");
        String str = this.audioData;
        if (str != null) {
            i12 = str.length();
        }
        sb2.append(i12);
        sb2.append('}');
        return sb2.toString();
    }
}
