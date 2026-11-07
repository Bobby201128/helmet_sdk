package me.ele.aiot.codec.v4.encode;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.HashMap;
import java.util.Map;
import me.ele.aiot.codec.commons.BaseStation;
import me.ele.aiot.codec.commons.Beacon;
import me.ele.aiot.codec.commons.IotData;
import me.ele.aiot.codec.commons.ValidationUtils;
import me.ele.aiot.codec.commons.Wifi;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class EncoderV8 {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private final IotData iotData = new IotData(8);
    private final Map<String, Float> steps = new HashMap();

    private <A> EncoderV8 putEvent(String str, long[] jArr, A a12, Map<String, IotData.EventValue<A>> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("16", new Object[]{this, str, jArr, a12, map});
        }
        map.put(str, new IotData.EventValue<>(jArr, a12));
        return this;
    }

    private <A> EncoderV8 putProperty(String str, long j12, long j13, A a12, Map<String, IotData.PropertyValue<A>> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("9", new Object[]{this, str, Long.valueOf(j12), Long.valueOf(j13), a12, map});
        }
        map.put(str, new IotData.PropertyValue<>(j12, j13, a12));
        return this;
    }

    public byte[] encode() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            return (byte[]) iSurgeon.surgeon$dispatch("18", new Object[]{this});
        }
        this.iotData.putStep(this.steps);
        return new IotDataEncoderV8().encode(this.iotData);
    }

    public EncoderV8 putBaseStationProperty(long j12, long j13, BaseStation[][] baseStationArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("17", new Object[]{this, Long.valueOf(j12), Long.valueOf(j13), baseStationArr});
        }
        this.iotData.setBaseStationProperty(new IotData.PropertyValue<>(j12, j13, baseStationArr));
        return this;
    }

    public EncoderV8 putBeaconEvent(long[] jArr, Beacon[] beaconArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("15", new Object[]{this, jArr, beaconArr});
        }
        if (beaconArr.length == 0) {
            return this;
        }
        this.iotData.setBeaconEvent(new IotData.EventValue<>(jArr, beaconArr));
        return this;
    }

    public EncoderV8 putDoubleEvent(String str, long[] jArr, double[] dArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("11", new Object[]{this, str, jArr, dArr});
        }
        if (dArr.length == 0) {
            return this;
        }
        return putEvent(str, jArr, dArr, this.iotData.getDoubleEvents());
    }

    public EncoderV8 putDoubleProperty(String str, long j12, long j13, double[] dArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("4", new Object[]{this, str, Long.valueOf(j12), Long.valueOf(j13), dArr});
        }
        if (dArr.length == 0) {
            return this;
        }
        return putProperty(str, j12, j13, dArr, this.iotData.getDoubleProperties());
    }

    public EncoderV8 putEnumEvent(String str, long[] jArr, short[] sArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("13", new Object[]{this, str, jArr, sArr});
        }
        if (sArr.length == 0) {
            return this;
        }
        return putEvent(str, jArr, sArr, this.iotData.getEnumEvents());
    }

    public EncoderV8 putEnumProperty(String str, long j12, long j13, short[] sArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("6", new Object[]{this, str, Long.valueOf(j12), Long.valueOf(j13), sArr});
        }
        if (sArr.length == 0) {
            return this;
        }
        return putProperty(str, j12, j13, sArr, this.iotData.getEnumProperties());
    }

    public EncoderV8 putFloatEvent(String str, long[] jArr, float[] fArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            return (EncoderV8) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str, jArr, fArr});
        }
        if (fArr.length == 0) {
            return this;
        }
        return putEvent(str, jArr, fArr, this.iotData.getFloatEvents());
    }

    public EncoderV8 putFloatProperty(String str, long j12, long j13, float[] fArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("3", new Object[]{this, str, Long.valueOf(j12), Long.valueOf(j13), fArr});
        }
        if (fArr.length == 0) {
            return this;
        }
        return putProperty(str, j12, j13, fArr, this.iotData.getFloatProperties());
    }

    public EncoderV8 putLongEvent(String str, long[] jArr, long[] jArr2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("12", new Object[]{this, str, jArr, jArr2});
        }
        if (jArr2.length == 0) {
            return this;
        }
        return putEvent(str, jArr, jArr2, this.iotData.getLongEvents());
    }

    public EncoderV8 putLongProperty(String str, long j12, long j13, long[] jArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("5", new Object[]{this, str, Long.valueOf(j12), Long.valueOf(j13), jArr});
        }
        if (jArr.length == 0) {
            return this;
        }
        return putProperty(str, j12, j13, jArr, this.iotData.getLongProperties());
    }

    public EncoderV8 putTextEvent(String str, long[] jArr, String[] strArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("14", new Object[]{this, str, jArr, strArr});
        }
        if (strArr.length == 0) {
            return this;
        }
        return putEvent(str, jArr, strArr, this.iotData.getTextEvents());
    }

    public EncoderV8 putTextProperty(String str, long j12, long j13, String[] strArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("7", new Object[]{this, str, Long.valueOf(j12), Long.valueOf(j13), strArr});
        }
        if (strArr.length == 0) {
            return this;
        }
        return putProperty(str, j12, j13, strArr, this.iotData.getTextProperties());
    }

    public EncoderV8 putWifiProperty(long j12, long j13, Wifi[][] wifiArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            return (EncoderV8) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Long.valueOf(j12), Long.valueOf(j13), wifiArr});
        }
        if (wifiArr != null && wifiArr.length != 0) {
            this.iotData.setWifiProperty(new IotData.PropertyValue<>(j12, j13, wifiArr));
        }
        return this;
    }

    public EncoderV8 setMetaData(Map<String, String> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("1", new Object[]{this, map});
        }
        ValidationUtils.notNull(this.steps);
        this.iotData.getMetas().putAll(map);
        return this;
    }

    public EncoderV8 setSteps(Map<String, Float> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (EncoderV8) iSurgeon.surgeon$dispatch("2", new Object[]{this, map});
        }
        ValidationUtils.notNull(map);
        this.steps.putAll(map);
        return this;
    }
}
