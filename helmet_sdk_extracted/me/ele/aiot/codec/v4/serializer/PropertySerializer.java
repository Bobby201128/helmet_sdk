package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Collections;
import java.util.List;
import me.ele.aiot.codec.commons.BaseStation;
import me.ele.aiot.codec.commons.IotData;
import me.ele.aiot.codec.commons.Wifi;

/* loaded from: classes4.dex */
public class PropertySerializer<A> implements Serializer<IotData.PropertyValue<A>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private final Serializer<A> valueSerializer;
    public static final PropertySerializer<Wifi[][]> WIFI_PROPERTY_SERIALIZER = new PropertySerializer<>(WifiSerializer.SINGLETON_INSTANCE);
    public static final PropertySerializer<Wifi[][]> WIFI_PROPERTY_SERIALIZER_2 = new PropertySerializer<>(WifiSerializer2.SINGLETON_INSTANCE);
    public static final PropertySerializer<BaseStation[][]> BASE_STATION_PROPERTY_SERIALIZER = new PropertySerializer<>(BaseStationSerializer.SINGLETON_INSTANCE);

    PropertySerializer(Serializer<A> serializer) {
        this.valueSerializer = serializer;
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public IotData.PropertyValue<A> deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (IotData.PropertyValue) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData}) : new PropertyListSerializer(this.valueSerializer).deserialize(serializedData).get(0);
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, IotData.PropertyValue<A> propertyValue) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, propertyValue});
        } else {
            new PropertyListSerializer(this.valueSerializer).serialize(serializedData, (List) Collections.singletonList(propertyValue));
        }
    }
}
