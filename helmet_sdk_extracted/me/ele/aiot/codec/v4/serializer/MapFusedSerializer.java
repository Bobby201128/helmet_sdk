package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.ele.aiot.codec.commons.IotData;

/* loaded from: classes4.dex */
public class MapFusedSerializer<V> implements Serializer<Map<String, V>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private static final Serializer<String[]> KEY_SERIALIZER;
    public static final MapFusedSerializer<IotData.PropertyValue<String[]>> STRING_PROPERTY_MAP_SERIALIZER;
    private final Serializer<List<V>> valueSerializer;
    public static final MapFusedSerializer<String> STRING_MAP_SERIALIZER = new MapFusedSerializer<>(StringListSerializer.SINGLETON_INSTANCE);
    public static final MapFusedSerializer<IotData.Step> STRING_STEP_MAP_SERIALIZER = new MapFusedSerializer<>(StepSerializer.SINGLETON_INSTANCE);
    public static final MapFusedSerializer<IotData.PropertyValue<float[]>> FLOAT_PROPERTY_MAP_SERIALIZER = instanceOfPropertySerializer(AbstractPrimarySerializer.FLOAT_SERIALIZER_SINGLETON);
    public static final MapFusedSerializer<IotData.PropertyValue<double[]>> DOUBLE_PROPERTY_MAP_SERIALIZER = instanceOfPropertySerializer(AbstractPrimarySerializer.DOUBLE_SERIALIZER_SINGLETON);
    public static final MapFusedSerializer<IotData.PropertyValue<long[]>> LONG_PROPERTY_MAP_SERIALIZER = instanceOfPropertySerializer(AbstractPrimarySerializer.LONG_SERIALIZER_SINGLETON);
    public static final MapFusedSerializer<IotData.PropertyValue<short[]>> ENUM_PROPERTY_MAP_SERIALIZER = instanceOfPropertySerializer(AbstractPrimarySerializer.ENUM_SERIALIZER_SINGLETON);

    static {
        AbstractPrimarySerializer<String[]> abstractPrimarySerializer = AbstractPrimarySerializer.STRING_SERIALIZER_SINGLETON;
        STRING_PROPERTY_MAP_SERIALIZER = instanceOfPropertySerializer(abstractPrimarySerializer);
        KEY_SERIALIZER = abstractPrimarySerializer;
    }

    private MapFusedSerializer(Serializer<List<V>> serializer) {
        this.valueSerializer = serializer;
    }

    private static <A> MapFusedSerializer<IotData.PropertyValue<A>> instanceOfPropertySerializer(Serializer<A> serializer) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (MapFusedSerializer) iSurgeon.surgeon$dispatch("3", new Object[]{serializer}) : new MapFusedSerializer<>(new PropertyListSerializer(serializer));
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public Map<String, V> deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (Map) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData});
        }
        String[] deserialize = KEY_SERIALIZER.deserialize(serializedData);
        HashMap hashMap = new HashMap(deserialize.length);
        if (deserialize.length > 0) {
            List<V> deserialize2 = this.valueSerializer.deserialize(serializedData);
            for (int i12 = 0; i12 < deserialize.length; i12++) {
                hashMap.put(deserialize[i12], deserialize2.get(i12));
            }
        }
        return hashMap;
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, Map<String, V> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, map});
            return;
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        KEY_SERIALIZER.serialize(serializedData, strArr);
        if (strArr.length > 0) {
            this.valueSerializer.serialize(serializedData, new ArrayList(map.values()));
        }
    }
}
