package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import me.ele.aiot.codec.commons.IotData;

/* loaded from: classes4.dex */
public class MapEventSerializer<V> implements Serializer<Map<String, IotData.EventValue<V>>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private static final Serializer<String[]> KEY_SERIALIZER;
    public static final MapEventSerializer<String[]> STRING_EVENT_MAP_SERIALIZER;
    private final EventSerializer<V> valueSerializer;
    public static final MapEventSerializer<float[]> FLOAT_EVENT_MAP_SERIALIZER = new MapEventSerializer<>(AbstractPrimarySerializer.FLOAT_SERIALIZER_SINGLETON);
    public static final MapEventSerializer<double[]> DOUBLE_EVENT_MAP_SERIALIZER = new MapEventSerializer<>(AbstractPrimarySerializer.DOUBLE_SERIALIZER_SINGLETON);
    public static final MapEventSerializer<long[]> LONG_EVENT_MAP_SERIALIZER = new MapEventSerializer<>(AbstractPrimarySerializer.LONG_SERIALIZER_SINGLETON);
    public static final MapEventSerializer<short[]> ENUM_EVENT_MAP_SERIALIZER = new MapEventSerializer<>(AbstractPrimarySerializer.ENUM_SERIALIZER_SINGLETON);

    static {
        AbstractPrimarySerializer<String[]> abstractPrimarySerializer = AbstractPrimarySerializer.STRING_SERIALIZER_SINGLETON;
        STRING_EVENT_MAP_SERIALIZER = new MapEventSerializer<>(abstractPrimarySerializer);
        KEY_SERIALIZER = abstractPrimarySerializer;
    }

    private MapEventSerializer(AbstractPrimarySerializer<V> abstractPrimarySerializer) {
        this.valueSerializer = new EventSerializer<>(abstractPrimarySerializer);
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public Map<String, IotData.EventValue<V>> deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (Map) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData});
        }
        String[] deserialize = KEY_SERIALIZER.deserialize(serializedData);
        HashMap hashMap = new HashMap(deserialize.length);
        for (String str : deserialize) {
            hashMap.put(str, this.valueSerializer.deserialize(serializedData));
        }
        return hashMap;
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, Map<String, IotData.EventValue<V>> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, map});
            return;
        }
        KEY_SERIALIZER.serialize(serializedData, (String[]) map.keySet().toArray(new String[0]));
        Iterator<IotData.EventValue<V>> it = map.values().iterator();
        while (it.hasNext()) {
            this.valueSerializer.serialize(serializedData, it.next());
        }
    }
}
