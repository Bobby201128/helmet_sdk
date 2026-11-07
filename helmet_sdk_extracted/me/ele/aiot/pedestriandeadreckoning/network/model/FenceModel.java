package me.ele.aiot.pedestriandeadreckoning.network.model;

import androidx.annotation.NonNull;
import c90.a;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.alipay.mobile.bqcscanservice.BQCCameraParam;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import me.ele.im.uikit.message.BaseMessageViewHolder;

/* loaded from: classes4.dex */
public class FenceModel implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @SerializedName(BaseMessageViewHolder.EXTRA_LATITUDE)
    private double latitude;

    @SerializedName(BaseMessageViewHolder.EXTRA_LONGITUDE)
    private double longitude;

    @SerializedName(BQCCameraParam.FOCUS_AREA_RADIUS)
    private double radius;

    public boolean equals(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("7", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FenceModel)) {
            return false;
        }
        FenceModel fenceModel = (FenceModel) obj;
        if (Double.compare(fenceModel.latitude, this.latitude) == 0 && Double.compare(fenceModel.longitude, this.longitude) == 0 && Double.compare(fenceModel.radius, this.radius) == 0) {
            return true;
        }
        return false;
    }

    public double getLatitude() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Double) iSurgeon.surgeon$dispatch("1", new Object[]{this})).doubleValue() : this.latitude;
    }

    public double getLongitude() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Double) iSurgeon.surgeon$dispatch("3", new Object[]{this})).doubleValue() : this.longitude;
    }

    public double getRadius() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Double) iSurgeon.surgeon$dispatch("5", new Object[]{this})).doubleValue() : this.radius;
    }

    public int hashCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            return ((Integer) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this})).intValue();
        }
        return (((a.a(this.latitude) * 31) + a.a(this.longitude)) * 31) + a.a(this.radius);
    }

    public void setLatitude(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.latitude = d12;
        }
    }

    public void setLongitude(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.longitude = d12;
        }
    }

    public void setRadius(double d12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Double.valueOf(d12)});
        } else {
            this.radius = d12;
        }
    }

    @NonNull
    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (String) iSurgeon.surgeon$dispatch("9", new Object[]{this});
        }
        return "FenceModel{latitude=" + this.latitude + ", longitude=" + this.longitude + ", radius=" + this.radius + '}';
    }
}
