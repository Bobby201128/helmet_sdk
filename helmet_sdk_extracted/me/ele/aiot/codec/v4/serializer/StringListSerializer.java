package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class StringListSerializer implements Serializer<List<String>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final StringListSerializer SINGLETON_INSTANCE = new StringListSerializer();

    private StringListSerializer() {
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public List<String> deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (List) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData}) : Arrays.asList(AbstractPrimarySerializer.STRING_SERIALIZER_SINGLETON.deserialize(serializedData));
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, List<String> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, list});
        } else {
            AbstractPrimarySerializer.STRING_SERIALIZER_SINGLETON.serialize(serializedData, list.toArray(new String[0]));
        }
    }
}
