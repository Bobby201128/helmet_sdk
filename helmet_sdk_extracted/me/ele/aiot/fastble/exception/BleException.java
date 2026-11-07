package me.ele.aiot.fastble.exception;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class BleException implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag = null;
    public static final int ERROR_CODE_GATT = 101;
    public static final int ERROR_CODE_OTHER = 102;
    public static final int ERROR_CODE_TIMEOUT = 100;
    private static final long serialVersionUID = 8004414918500865564L;
    private int code;
    private String description;

    public BleException(int i12, String str) {
        this.code = i12;
        this.description = str;
    }

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.code;
    }

    public String getDescription() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (String) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.description;
    }

    public BleException setCode(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (BleException) iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
        }
        this.code = i12;
        return this;
    }

    public BleException setDescription(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (BleException) iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        }
        this.description = str;
        return this;
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "BleException { code=" + this.code + ", description='" + this.description + "'}";
    }
}
