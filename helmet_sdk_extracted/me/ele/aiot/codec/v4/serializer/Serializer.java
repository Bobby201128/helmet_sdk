package me.ele.aiot.codec.v4.serializer;

/* loaded from: classes4.dex */
public interface Serializer<T> {
    T deserialize(SerializedData serializedData);

    void serialize(SerializedData serializedData, T t12);
}
