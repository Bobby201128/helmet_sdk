package me.ele.aiot.codec.commons;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Objects;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class BaseStation {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private long cellId;
    private int dbm;
    private int isMainCell;
    private int lac;
    private int mcc;
    private int mnc;
    private String networkType;

    public BaseStation(int i12, int i13, String str, int i14, long j12, int i15, int i16) {
        this.mnc = i12;
        this.mcc = i13;
        this.networkType = str;
        this.isMainCell = i14;
        this.cellId = j12;
        this.dbm = i15;
        this.lac = i16;
    }

    public boolean equals(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("15", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseStation baseStation = (BaseStation) obj;
        if (this.mnc == baseStation.mnc && this.mcc == baseStation.mcc && this.networkType.equals(baseStation.networkType) && this.isMainCell == baseStation.isMainCell && this.cellId == baseStation.cellId && this.dbm == baseStation.dbm && this.lac == baseStation.lac) {
            return true;
        }
        return false;
    }

    public long getCellId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE) ? ((Long) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this})).longValue() : this.cellId;
    }

    public int getDbm() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "12") ? ((Integer) iSurgeon.surgeon$dispatch("12", new Object[]{this})).intValue() : this.dbm;
    }

    public int getIsMainCell() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? ((Integer) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this})).intValue() : this.isMainCell;
    }

    public int getLac() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "14") ? ((Integer) iSurgeon.surgeon$dispatch("14", new Object[]{this})).intValue() : this.lac;
    }

    public int getMcc() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? ((Integer) iSurgeon.surgeon$dispatch("4", new Object[]{this})).intValue() : this.mcc;
    }

    public int getMnc() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Integer) iSurgeon.surgeon$dispatch("2", new Object[]{this})).intValue() : this.mnc;
    }

    public String getNetworkType() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? (String) iSurgeon.surgeon$dispatch("6", new Object[]{this}) : this.networkType;
    }

    public int hashCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "16") ? ((Integer) iSurgeon.surgeon$dispatch("16", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(this.mnc), Integer.valueOf(this.mcc), this.networkType, Integer.valueOf(this.isMainCell), Long.valueOf(this.cellId), Integer.valueOf(this.dbm), Integer.valueOf(this.lac));
    }

    public void setCellId(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            iSurgeon.surgeon$dispatch("9", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.cellId = j12;
        }
    }

    public void setDbm(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.dbm = i12;
        }
    }

    public void setIsMainCell(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.isMainCell = i12;
        }
    }

    public void setLac(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.lac = i12;
        }
    }

    public void setMcc(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.mcc = i12;
        }
    }

    public void setMnc(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.mnc = i12;
        }
    }

    public void setNetworkType(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, str});
        } else {
            this.networkType = str;
        }
    }

    public BaseStation() {
    }

    public BaseStation(int i12, int i13) {
        this.mnc = i12;
        this.mcc = i13;
        this.networkType = "";
        this.isMainCell = 0;
        this.cellId = 0L;
        this.dbm = 0;
        this.lac = 0;
    }
}
