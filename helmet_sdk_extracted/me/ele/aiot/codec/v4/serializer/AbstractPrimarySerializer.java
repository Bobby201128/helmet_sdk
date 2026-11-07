package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Queue;

/* loaded from: classes4.dex */
public abstract class AbstractPrimarySerializer<T> implements Serializer<T> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final AbstractPrimarySerializer<double[]> DOUBLE_SERIALIZER_SINGLETON = new AbstractPrimarySerializer<double[]>() { // from class: me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer.1
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @Override // me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer
        protected Queue<double[]> getQueue(SerializedData serializedData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (Queue) iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData}) : serializedData.getDoubles();
        }
    };
    public static final AbstractPrimarySerializer<float[]> FLOAT_SERIALIZER_SINGLETON = new AbstractPrimarySerializer<float[]>() { // from class: me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer.2
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @Override // me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer
        protected Queue<float[]> getQueue(SerializedData serializedData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (Queue) iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData}) : serializedData.getFloats();
        }
    };
    public static final AbstractPrimarySerializer<long[]> LONG_SERIALIZER_SINGLETON = new AbstractPrimarySerializer<long[]>() { // from class: me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer.3
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @Override // me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer
        protected Queue<long[]> getQueue(SerializedData serializedData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (Queue) iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData}) : serializedData.getLongs();
        }
    };
    public static final AbstractPrimarySerializer<short[]> ENUM_SERIALIZER_SINGLETON = new AbstractPrimarySerializer<short[]>() { // from class: me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer.4
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @Override // me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer
        protected Queue<short[]> getQueue(SerializedData serializedData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (Queue) iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData}) : serializedData.getEnums();
        }
    };
    public static final AbstractPrimarySerializer<String[]> STRING_SERIALIZER_SINGLETON = new AbstractPrimarySerializer<String[]>() { // from class: me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer.5
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        @Override // me.ele.aiot.codec.v4.serializer.AbstractPrimarySerializer
        protected Queue<String[]> getQueue(SerializedData serializedData) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (Queue) iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData}) : serializedData.getStrings();
        }
    };

    private AbstractPrimarySerializer() {
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public T deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (T) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData}) : getQueue(serializedData).poll();
    }

    protected abstract Queue<T> getQueue(SerializedData serializedData);

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, T t12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, t12});
        } else {
            getQueue(serializedData).offer(t12);
        }
    }
}
