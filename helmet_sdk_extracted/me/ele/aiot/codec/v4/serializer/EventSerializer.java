package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.aiot.codec.commons.Beacon;
import me.ele.aiot.codec.commons.IotData;

/* loaded from: classes4.dex */
public class EventSerializer<A> implements Serializer<IotData.EventValue<A>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final EventSerializer<Beacon[]> BEACON_EVENT_SERIALIZER = new EventSerializer<>(BeaconSerializer.SINGLETON_INSTANCE);
    private static final Serializer<long[]> LONG_SERIALIZER = AbstractPrimarySerializer.LONG_SERIALIZER_SINGLETON;
    private final Serializer<A> serializer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventSerializer(Serializer<A> serializer) {
        this.serializer = serializer;
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public IotData.EventValue<A> deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (IotData.EventValue) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData}) : new IotData.EventValue<>(LONG_SERIALIZER.deserialize(serializedData), this.serializer.deserialize(serializedData));
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, IotData.EventValue<A> eventValue) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, eventValue});
        } else {
            LONG_SERIALIZER.serialize(serializedData, eventValue.getTimes());
            this.serializer.serialize(serializedData, eventValue.getValues());
        }
    }
}
