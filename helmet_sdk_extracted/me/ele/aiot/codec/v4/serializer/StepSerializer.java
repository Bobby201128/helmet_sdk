package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.ArrayList;
import java.util.List;
import me.ele.aiot.codec.commons.IotData;

/* loaded from: classes4.dex */
public class StepSerializer implements Serializer<List<IotData.Step>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final StepSerializer SINGLETON_INSTANCE = new StepSerializer();
    private static final Serializer<float[]> VALUE_SERIALIZER = AbstractPrimarySerializer.FLOAT_SERIALIZER_SINGLETON;
    private static final Serializer<short[]> TYPE_SERIALIZER = AbstractPrimarySerializer.ENUM_SERIALIZER_SINGLETON;

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public List<IotData.Step> deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (List) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData});
        }
        float[] deserialize = VALUE_SERIALIZER.deserialize(serializedData);
        short[] deserialize2 = TYPE_SERIALIZER.deserialize(serializedData);
        ArrayList arrayList = new ArrayList(deserialize.length);
        for (int i12 = 0; i12 < deserialize.length; i12++) {
            arrayList.add(new IotData.Step(deserialize[i12], IotData.Type.values()[deserialize2[i12]]));
        }
        return arrayList;
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, List<IotData.Step> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, list});
            return;
        }
        float[] fArr = new float[list.size()];
        short[] sArr = new short[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            IotData.Step step = list.get(i12);
            fArr[i12] = step.getStepValue();
            sArr[i12] = (short) step.getType().ordinal();
        }
        VALUE_SERIALIZER.serialize(serializedData, fArr);
        TYPE_SERIALIZER.serialize(serializedData, sArr);
    }
}
