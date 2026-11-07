package me.ele.aiot.codec.commons;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.android.exoplayer2.Format;
import java.util.Map;
import me.ele.aiot.codec.commons.IotData;

/* loaded from: classes4.dex */
public abstract class AbstractStepper<A> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final AbstractStepper<float[]> FLOAT_STEPPER_SINGLETON = new AbstractStepper<float[]>() { // from class: me.ele.aiot.codec.commons.AbstractStepper.1
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @Override // me.ele.aiot.codec.commons.AbstractStepper
        protected Map<String, IotData.EventValue<float[]>> getEventMap(IotData iotData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "4") ? (Map) iSurgeon.surgeon$dispatch("4", new Object[]{this, iotData}) : iotData.getFloatEvents();
        }

        @Override // me.ele.aiot.codec.commons.AbstractStepper
        protected Map<String, IotData.PropertyValue<float[]>> getPropertyMap(IotData iotData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (Map) iSurgeon.surgeon$dispatch("3", new Object[]{this, iotData}) : iotData.getFloatProperties();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // me.ele.aiot.codec.commons.AbstractStepper
        public long[] stepValue(float f12, float[] fArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (long[]) iSurgeon.surgeon$dispatch("1", new Object[]{this, Float.valueOf(f12), fArr});
            }
            long[] jArr = new long[fArr.length];
            for (int i12 = 0; i12 < fArr.length; i12++) {
                jArr[i12] = Float.isNaN(fArr[i12]) ? Format.OFFSET_SAMPLE_RELATIVE : fArr[i12] / f12;
            }
            return jArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // me.ele.aiot.codec.commons.AbstractStepper
        public float[] unStepValue(float f12, long[] jArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                return (float[]) iSurgeon.surgeon$dispatch("2", new Object[]{this, Float.valueOf(f12), jArr});
            }
            float[] fArr = new float[jArr.length];
            for (int i12 = 0; i12 < jArr.length; i12++) {
                long j12 = jArr[i12];
                fArr[i12] = j12 == Format.OFFSET_SAMPLE_RELATIVE ? Float.NaN : ((float) j12) * f12;
            }
            return fArr;
        }
    };
    public static final AbstractStepper<double[]> DOUBLE_STEPPER_SINGLETON = new AbstractStepper<double[]>() { // from class: me.ele.aiot.codec.commons.AbstractStepper.2
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @Override // me.ele.aiot.codec.commons.AbstractStepper
        protected Map<String, IotData.EventValue<double[]>> getEventMap(IotData iotData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "4") ? (Map) iSurgeon.surgeon$dispatch("4", new Object[]{this, iotData}) : iotData.getDoubleEvents();
        }

        @Override // me.ele.aiot.codec.commons.AbstractStepper
        protected Map<String, IotData.PropertyValue<double[]>> getPropertyMap(IotData iotData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (Map) iSurgeon.surgeon$dispatch("3", new Object[]{this, iotData}) : iotData.getDoubleProperties();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // me.ele.aiot.codec.commons.AbstractStepper
        public long[] stepValue(float f12, double[] dArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (long[]) iSurgeon.surgeon$dispatch("1", new Object[]{this, Float.valueOf(f12), dArr});
            }
            long[] jArr = new long[dArr.length];
            for (int i12 = 0; i12 < dArr.length; i12++) {
                jArr[i12] = Double.isNaN(dArr[i12]) ? Format.OFFSET_SAMPLE_RELATIVE : (long) (dArr[i12] / f12);
            }
            return jArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // me.ele.aiot.codec.commons.AbstractStepper
        public double[] unStepValue(float f12, long[] jArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                return (double[]) iSurgeon.surgeon$dispatch("2", new Object[]{this, Float.valueOf(f12), jArr});
            }
            double[] dArr = new double[jArr.length];
            for (int i12 = 0; i12 < jArr.length; i12++) {
                dArr[i12] = jArr[i12] == Format.OFFSET_SAMPLE_RELATIVE ? Double.NaN : ((float) r1) * f12;
            }
            return dArr;
        }
    };
    public static final AbstractStepper<long[]> LONG_STEPPER_SINGLETON = new AbstractStepper<long[]>() { // from class: me.ele.aiot.codec.commons.AbstractStepper.3
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @Override // me.ele.aiot.codec.commons.AbstractStepper
        protected Map<String, IotData.EventValue<long[]>> getEventMap(IotData iotData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "4") ? (Map) iSurgeon.surgeon$dispatch("4", new Object[]{this, iotData}) : iotData.getLongEvents();
        }

        @Override // me.ele.aiot.codec.commons.AbstractStepper
        protected Map<String, IotData.PropertyValue<long[]>> getPropertyMap(IotData iotData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (Map) iSurgeon.surgeon$dispatch("3", new Object[]{this, iotData}) : iotData.getLongProperties();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // me.ele.aiot.codec.commons.AbstractStepper
        public long[] stepValue(float f12, long[] jArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (long[]) iSurgeon.surgeon$dispatch("1", new Object[]{this, Float.valueOf(f12), jArr});
            }
            long[] jArr2 = new long[jArr.length];
            for (int i12 = 0; i12 < jArr.length; i12++) {
                long j12 = jArr[i12];
                if (j12 != Format.OFFSET_SAMPLE_RELATIVE) {
                    jArr2[i12] = j12 / ((int) f12);
                }
            }
            return jArr2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // me.ele.aiot.codec.commons.AbstractStepper
        public long[] unStepValue(float f12, long[] jArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                return (long[]) iSurgeon.surgeon$dispatch("2", new Object[]{this, Float.valueOf(f12), jArr});
            }
            long[] jArr2 = new long[jArr.length];
            for (int i12 = 0; i12 < jArr.length; i12++) {
                long j12 = jArr[i12];
                if (j12 != Format.OFFSET_SAMPLE_RELATIVE) {
                    jArr2[i12] = j12 * ((int) f12);
                }
            }
            return jArr2;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.ele.aiot.codec.commons.AbstractStepper$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$me$ele$aiot$codec$commons$IotData$Type;

        static {
            int[] iArr = new int[IotData.Type.values().length];
            $SwitchMap$me$ele$aiot$codec$commons$IotData$Type = iArr;
            try {
                iArr[IotData.Type.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$me$ele$aiot$codec$commons$IotData$Type[IotData.Type.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$me$ele$aiot$codec$commons$IotData$Type[IotData.Type.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void step(IotData iotData, Map<String, IotData.Step> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{iotData, map});
            return;
        }
        for (Map.Entry<String, IotData.Step> entry : map.entrySet()) {
            entry.getValue().getType().getStepper().step(iotData, entry.getKey(), entry.getValue().getStepValue());
        }
    }

    public static void unStep(IotData iotData, Map<String, IotData.Step> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{iotData, map});
            return;
        }
        for (Map.Entry<String, IotData.Step> entry : map.entrySet()) {
            float stepValue = entry.getValue().getStepValue();
            String key = entry.getKey();
            int i12 = AnonymousClass4.$SwitchMap$me$ele$aiot$codec$commons$IotData$Type[entry.getValue().getType().ordinal()];
            if (i12 == 1) {
                FLOAT_STEPPER_SINGLETON.unStep(iotData, key, stepValue);
            } else if (i12 == 2) {
                DOUBLE_STEPPER_SINGLETON.unStep(iotData, key, stepValue);
            } else if (i12 == 3) {
                LONG_STEPPER_SINGLETON.unStep(iotData, key, stepValue);
            }
        }
    }

    protected abstract Map<String, IotData.EventValue<A>> getEventMap(IotData iotData);

    protected abstract Map<String, IotData.PropertyValue<A>> getPropertyMap(IotData iotData);

    protected abstract long[] stepValue(float f12, A a12);

    protected abstract A unStepValue(float f12, long[] jArr);

    public void step(IotData iotData, String str, float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, iotData, str, Float.valueOf(f12)});
            return;
        }
        IotData.PropertyValue<A> remove = getPropertyMap(iotData).remove(str);
        if (remove != null) {
            iotData.getLongProperties().put(str, new IotData.PropertyValue<>(remove.getStartTime(), remove.getCycle(), stepValue(f12, remove.getValues())));
        } else {
            IotData.EventValue<A> remove2 = getEventMap(iotData).remove(str);
            iotData.getLongEvents().put(str, new IotData.EventValue<>(remove2.getTimes(), stepValue(f12, remove2.getValues())));
        }
    }

    public void unStep(IotData iotData, String str, float f12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, iotData, str, Float.valueOf(f12)});
            return;
        }
        IotData.PropertyValue<long[]> remove = iotData.getLongProperties().remove(str);
        if (remove != null) {
            getPropertyMap(iotData).put(str, new IotData.PropertyValue<>(remove.getStartTime(), remove.getCycle(), unStepValue(f12, remove.getValues())));
        } else {
            IotData.EventValue<long[]> remove2 = iotData.getLongEvents().remove(str);
            getEventMap(iotData).put(str, new IotData.EventValue<>(remove2.getTimes(), unStepValue(f12, remove2.getValues())));
        }
    }
}
