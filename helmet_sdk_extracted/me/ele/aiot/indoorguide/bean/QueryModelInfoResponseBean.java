package me.ele.aiot.indoorguide.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class QueryModelInfoResponseBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("code")
    private int code;

    @SerializedName("error")
    private String error;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private String f61975id;

    @SerializedName("result")
    private ModelInfoResultBean resultBean;

    public int getCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.code;
    }

    public String getError() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.error;
    }

    public String getId() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.f61975id;
    }

    public ModelInfoResultBean getResultBean() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (ModelInfoResultBean) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.resultBean;
    }

    public void setCode(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Integer.valueOf(i12)});
        } else {
            this.code = i12;
        }
    }

    public void setError(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str});
        } else {
            this.error = str;
        }
    }

    public void setId(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
        } else {
            this.f61975id = str;
        }
    }

    public void setResultBean(ModelInfoResultBean modelInfoResultBean) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, modelInfoResultBean});
        } else {
            this.resultBean = modelInfoResultBean;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (String) iSurgeon.surgeon$dispatch("9", new Object[]{this});
        }
        return "QueryModelInfoResponseBean{id='" + this.f61975id + "', code='" + this.code + "', resultBean=" + this.resultBean + ", error='" + this.error + "'}";
    }
}
