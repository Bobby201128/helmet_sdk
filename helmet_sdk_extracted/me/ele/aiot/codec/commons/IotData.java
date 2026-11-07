package me.ele.aiot.codec.commons;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class IotData {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private PropertyValue<BaseStation[][]> baseStationProperty;
    private EventValue<Beacon[]> beaconEvent;
    private final Map<String, EventValue<double[]>> doubleEvents;
    private final Map<String, PropertyValue<double[]>> doubleProperties;
    private final Map<String, EventValue<short[]>> enumEvents;
    private final Map<String, PropertyValue<short[]>> enumProperties;
    private final Map<String, EventValue<float[]>> floatEvents;
    private final Map<String, PropertyValue<float[]>> floatProperties;
    private final Map<String, EventValue<long[]>> longEvents;
    private final Map<String, PropertyValue<long[]>> longProperties;
    private final Map<String, String> metas;
    private final Map<String, Step> steps;
    private final Map<String, EventValue<String[]>> textEvents;
    private final Map<String, PropertyValue<String[]>> textProperties;
    private final int version;
    private EventValue<Wifi[][]> wifiEvent;
    private PropertyValue<Wifi[][]> wifiProperty;

    /* loaded from: classes4.dex */
    public static class Step {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private float stepValue;
        private Type type;

        public Step(float f12, Type type) {
            this.stepValue = f12;
            this.type = type;
        }

        public float getStepValue() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? ((Float) iSurgeon.surgeon$dispatch("1", new Object[]{this})).floatValue() : this.stepValue;
        }

        public Type getType() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (Type) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.type;
        }

        public void setStepValue(float f12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Float.valueOf(f12)});
            } else {
                this.stepValue = f12;
            }
        }

        public void setType(Type type) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, type});
            } else {
                this.type = type;
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum Type {
        FLOAT(AbstractStepper.FLOAT_STEPPER_SINGLETON),
        DOUBLE(AbstractStepper.DOUBLE_STEPPER_SINGLETON),
        LONG(AbstractStepper.LONG_STEPPER_SINGLETON);

        private AbstractStepper stepper;

        Type(AbstractStepper abstractStepper) {
            this.stepper = abstractStepper;
        }

        public AbstractStepper getStepper() {
            return this.stepper;
        }
    }

    public IotData(int i12) {
        this.metas = new HashMap();
        this.steps = new HashMap();
        this.floatProperties = new HashMap();
        this.doubleProperties = new HashMap();
        this.longProperties = new HashMap();
        this.enumProperties = new HashMap();
        this.textProperties = new HashMap();
        this.wifiProperty = new PropertyValue<>(0L, 0L, new Wifi[0]);
        this.baseStationProperty = new PropertyValue<>(0L, 0L, new BaseStation[0]);
        this.floatEvents = new HashMap();
        this.doubleEvents = new HashMap();
        this.longEvents = new HashMap();
        this.enumEvents = new HashMap();
        this.textEvents = new HashMap();
        this.beaconEvent = new EventValue<>(new long[0], new Beacon[0]);
        this.wifiEvent = new EventValue<>(new long[0], new Wifi[0]);
        this.version = i12;
    }

    private Type getStepType(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (Type) iSurgeon.surgeon$dispatch("4", new Object[]{this, str});
        }
        if (!this.floatProperties.containsKey(str) && !this.floatEvents.containsKey(str)) {
            if (!this.longProperties.containsKey(str) && !this.longEvents.containsKey(str)) {
                if (!this.doubleProperties.containsKey(str) && !this.doubleEvents.containsKey(str)) {
                    return null;
                }
                return Type.DOUBLE;
            }
            return Type.LONG;
        }
        return Type.FLOAT;
    }

    public PropertyValue<BaseStation[][]> getBaseStationProperty() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "25") ? (PropertyValue) iSurgeon.surgeon$dispatch("25", new Object[]{this}) : this.baseStationProperty;
    }

    public EventValue<Beacon[]> getBeaconEvent() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "19") ? (EventValue) iSurgeon.surgeon$dispatch("19", new Object[]{this}) : this.beaconEvent;
    }

    public Map<String, EventValue<double[]>> getDoubleEvents() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "15") ? (Map) iSurgeon.surgeon$dispatch("15", new Object[]{this}) : this.doubleEvents;
    }

    public Map<String, PropertyValue<double[]>> getDoubleProperties() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (Map) iSurgeon.surgeon$dispatch("9", new Object[]{this}) : this.doubleProperties;
    }

    public Map<String, EventValue<short[]>> getEnumEvents() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "17") ? (Map) iSurgeon.surgeon$dispatch("17", new Object[]{this}) : this.enumEvents;
    }

    public Map<String, PropertyValue<short[]>> getEnumProperties() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "11") ? (Map) iSurgeon.surgeon$dispatch("11", new Object[]{this}) : this.enumProperties;
    }

    public Map<String, EventValue<float[]>> getFloatEvents() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "14") ? (Map) iSurgeon.surgeon$dispatch("14", new Object[]{this}) : this.floatEvents;
    }

    public Map<String, PropertyValue<float[]>> getFloatProperties() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? (Map) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this}) : this.floatProperties;
    }

    public Map<String, EventValue<long[]>> getLongEvents() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "16") ? (Map) iSurgeon.surgeon$dispatch("16", new Object[]{this}) : this.longEvents;
    }

    public Map<String, PropertyValue<long[]>> getLongProperties() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE) ? (Map) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this}) : this.longProperties;
    }

    public Map<String, String> getMetas() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? (Map) iSurgeon.surgeon$dispatch("6", new Object[]{this}) : this.metas;
    }

    public Map<String, Step> getSteps() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (Map) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.steps;
    }

    public Map<String, EventValue<String[]>> getTextEvents() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "18") ? (Map) iSurgeon.surgeon$dispatch("18", new Object[]{this}) : this.textEvents;
    }

    public Map<String, PropertyValue<String[]>> getTextProperties() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "12") ? (Map) iSurgeon.surgeon$dispatch("12", new Object[]{this}) : this.textProperties;
    }

    public int getVersion() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.version;
    }

    public EventValue<Wifi[][]> getWifiEvent() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "20") ? (EventValue) iSurgeon.surgeon$dispatch("20", new Object[]{this}) : this.wifiEvent;
    }

    public PropertyValue<Wifi[][]> getWifiProperty() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "13") ? (PropertyValue) iSurgeon.surgeon$dispatch("13", new Object[]{this}) : this.wifiProperty;
    }

    public void putStep(Map<String, Float> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, map});
            return;
        }
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            ValidationUtils.notNull(entry.getValue(), entry.getKey());
            Type stepType = getStepType(entry.getKey());
            if (entry.getValue().floatValue() > 0.0f && stepType != null) {
                this.steps.put(entry.getKey(), new Step(entry.getValue().floatValue(), stepType));
            }
        }
    }

    public void setBaseStationProperty(PropertyValue<BaseStation[][]> propertyValue) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this, propertyValue});
        } else {
            this.baseStationProperty = propertyValue;
        }
    }

    public void setBeaconEvent(EventValue<Beacon[]> eventValue) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{this, eventValue});
        } else {
            this.beaconEvent = eventValue;
        }
    }

    public void setWifiEvent(EventValue<Wifi[][]> eventValue) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this, eventValue});
        } else {
            this.wifiEvent = eventValue;
        }
    }

    public void setWifiProperty(PropertyValue<Wifi[][]> propertyValue) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this, propertyValue});
        } else {
            this.wifiProperty = propertyValue;
        }
    }

    public void stepValues() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this});
        } else {
            AbstractStepper.step(this, this.steps);
        }
    }

    public void unStepValues() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this});
        } else {
            AbstractStepper.unStep(this, this.steps);
        }
    }

    /* loaded from: classes4.dex */
    public static class EventValue<A> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private long[] times;
        private A values;

        public EventValue(long[] jArr, A a12) {
            ValidationUtils.notNull(jArr, a12);
            this.times = jArr;
            this.values = a12;
        }

        public long[] getTimes() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (long[]) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.times;
        }

        public A getValues() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (A) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.values;
        }

        public void setTimes(long[] jArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, jArr});
            } else {
                this.times = jArr;
            }
        }

        public void setValues(A a12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, a12});
            } else {
                this.values = a12;
            }
        }

        public EventValue() {
        }
    }

    /* loaded from: classes4.dex */
    public static class PropertyValue<A> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private long cycle;
        private long startTime;
        private A values;

        public PropertyValue(long j12, long j13, A a12) {
            ValidationUtils.notNull(a12);
            this.startTime = j12;
            this.cycle = j13;
            this.values = a12;
        }

        public long getCycle() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[]{this})).longValue() : this.cycle;
        }

        public long getStartTime() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? ((Long) iSurgeon.surgeon$dispatch("1", new Object[]{this})).longValue() : this.startTime;
        }

        public A getValues() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? (A) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.values;
        }

        public void setCycle(long j12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Long.valueOf(j12)});
            } else {
                this.cycle = j12;
            }
        }

        public void setStartTime(long j12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Long.valueOf(j12)});
            } else {
                this.startTime = j12;
            }
        }

        public void setValues(A a12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, a12});
            } else {
                this.values = a12;
            }
        }

        public PropertyValue() {
        }
    }

    public IotData() {
        this.metas = new HashMap();
        this.steps = new HashMap();
        this.floatProperties = new HashMap();
        this.doubleProperties = new HashMap();
        this.longProperties = new HashMap();
        this.enumProperties = new HashMap();
        this.textProperties = new HashMap();
        this.wifiProperty = new PropertyValue<>(0L, 0L, new Wifi[0]);
        this.baseStationProperty = new PropertyValue<>(0L, 0L, new BaseStation[0]);
        this.floatEvents = new HashMap();
        this.doubleEvents = new HashMap();
        this.longEvents = new HashMap();
        this.enumEvents = new HashMap();
        this.textEvents = new HashMap();
        this.beaconEvent = new EventValue<>(new long[0], new Beacon[0]);
        this.wifiEvent = new EventValue<>(new long[0], new Wifi[0]);
        this.version = 0;
    }
}
