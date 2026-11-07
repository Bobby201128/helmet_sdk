package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.LinkedList;
import me.ele.aiot.codec.commons.Beacon;

/* loaded from: classes4.dex */
public class BeaconSerializer implements Serializer<Beacon[]> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final BeaconSerializer SINGLETON_INSTANCE = new BeaconSerializer();
    private static final Serializer<long[]> LONG_SERIALIZER = AbstractPrimarySerializer.LONG_SERIALIZER_SINGLETON;
    private static final Serializer<String[]> STRING_SERIALIZER = AbstractPrimarySerializer.STRING_SERIALIZER_SINGLETON;

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public Beacon[] deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (Beacon[]) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData});
        }
        String[] deserialize = STRING_SERIALIZER.deserialize(serializedData);
        if (deserialize.length == 0) {
            return new Beacon[0];
        }
        Serializer<long[]> serializer = LONG_SERIALIZER;
        long[] deserialize2 = serializer.deserialize(serializedData);
        long[] deserialize3 = serializer.deserialize(serializedData);
        long[] deserialize4 = serializer.deserialize(serializedData);
        long[] deserialize5 = serializer.deserialize(serializedData);
        long[] deserialize6 = serializer.deserialize(serializedData);
        long[] deserialize7 = serializer.deserialize(serializedData);
        Beacon[] beaconArr = new Beacon[deserialize2.length];
        for (int i12 = 0; i12 < deserialize.length; i12++) {
            beaconArr[i12] = new Beacon(deserialize[(int) deserialize4[i12]], (int) deserialize2[(int) deserialize5[i12]], (int) deserialize3[(int) deserialize6[i12]], (int) deserialize7[i12]);
        }
        return beaconArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, Beacon[] beaconArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, beaconArr});
            return;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        long[] jArr = new long[beaconArr.length];
        long[] jArr2 = new long[beaconArr.length];
        long[] jArr3 = new long[beaconArr.length];
        long[] jArr4 = new long[beaconArr.length];
        for (int i12 = 0; i12 < beaconArr.length; i12++) {
            Beacon beacon = beaconArr[i12];
            jArr[i12] = SerializerUtils.getIndexAndUpdate(linkedList, beacon.getUuid());
            jArr2[i12] = SerializerUtils.getIndexAndUpdate(linkedList2, Long.valueOf(beacon.getMajor()));
            jArr3[i12] = SerializerUtils.getIndexAndUpdate(linkedList3, Long.valueOf(beacon.getMinor()));
            jArr4[i12] = beacon.getRssi();
        }
        STRING_SERIALIZER.serialize(serializedData, linkedList.toArray(new String[0]));
        if (linkedList.isEmpty()) {
            return;
        }
        Serializer<long[]> serializer = LONG_SERIALIZER;
        serializer.serialize(serializedData, SerializerUtils.toArray(linkedList2));
        serializer.serialize(serializedData, SerializerUtils.toArray(linkedList3));
        serializer.serialize(serializedData, jArr);
        serializer.serialize(serializedData, jArr2);
        serializer.serialize(serializedData, jArr3);
        serializer.serialize(serializedData, jArr4);
    }
}
