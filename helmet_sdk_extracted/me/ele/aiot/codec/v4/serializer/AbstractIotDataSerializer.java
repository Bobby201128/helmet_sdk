package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.aiot.codec.commons.IotData;

/* loaded from: classes4.dex */
public abstract class AbstractIotDataSerializer<T> implements Serializer<T> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    public void deserialize(IotData iotData, SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, iotData, serializedData});
        } else {
            set(iotData, deserialize(serializedData));
        }
    }

    protected abstract T get(IotData iotData);

    protected abstract Serializer<T> getSerializer();

    public void serialize(IotData iotData, SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, iotData, serializedData});
        } else {
            serialize(serializedData, (SerializedData) get(iotData));
        }
    }

    protected abstract void set(IotData iotData, T t12);

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public T deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (T) iSurgeon.surgeon$dispatch("4", new Object[]{this, serializedData}) : getSerializer().deserialize(serializedData);
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, T t12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, serializedData, t12});
        } else {
            getSerializer().serialize(serializedData, t12);
        }
    }
}
