package me.ele.aiot.sensor.model;

import androidx.annotation.NonNull;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class TemperatureUploadData implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName("valid")
    private boolean valid;

    public boolean isValid() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{this})).booleanValue() : this.valid;
    }

    public void setValid(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.valid = z12;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (String) iSurgeon.surgeon$dispatch("3", new Object[]{this});
        }
        return "TemperatureUploadData{valid=" + this.valid + '}';
    }
}
