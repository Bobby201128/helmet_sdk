package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.HashMap;
import java.util.LinkedList;
import me.ele.aiot.codec.commons.Wifi;

/* loaded from: classes4.dex */
public class WifiSerializer2 implements Serializer<Wifi[][]> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final WifiSerializer2 SINGLETON_INSTANCE = new WifiSerializer2();
    private static final Serializer<long[]> LONG_SERIALIZER = AbstractPrimarySerializer.LONG_SERIALIZER_SINGLETON;
    private static final Serializer<String[]> STRING_SERIALIZER = AbstractPrimarySerializer.STRING_SERIALIZER_SINGLETON;
    private static final Serializer<short[]> ENUM_SERIALIZER = AbstractPrimarySerializer.ENUM_SERIALIZER_SINGLETON;

    private WifiSerializer2() {
    }

    private Wifi[][] preSerialize(Wifi[][] wifiArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (Wifi[][]) iSurgeon.surgeon$dispatch("1", new Object[]{this, wifiArr});
        }
        for (int i12 = 0; i12 < wifiArr.length; i12++) {
            if (wifiArr[i12] == null) {
                wifiArr[i12] = new Wifi[0];
            }
        }
        return wifiArr;
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public Wifi[][] deserialize(SerializedData serializedData) {
        SerializedData serializedData2 = serializedData;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (Wifi[][]) iSurgeon.surgeon$dispatch("3", new Object[]{this, serializedData2});
        }
        int i12 = (int) LONG_SERIALIZER.deserialize(serializedData2)[0];
        if (i12 == 0) {
            return new Wifi[0];
        }
        Serializer<String[]> serializer = STRING_SERIALIZER;
        String[] deserialize = serializer.deserialize(serializedData2);
        String[] deserialize2 = serializer.deserialize(serializedData2);
        Wifi[][] wifiArr = new Wifi[i12];
        int i13 = 0;
        while (i13 < i12) {
            Serializer<long[]> serializer2 = LONG_SERIALIZER;
            long[] deserialize3 = serializer2.deserialize(serializedData2);
            long[] deserialize4 = serializer2.deserialize(serializedData2);
            long[] deserialize5 = serializer2.deserialize(serializedData2);
            long[] deserialize6 = serializer2.deserialize(serializedData2);
            Serializer<short[]> serializer3 = ENUM_SERIALIZER;
            short[] deserialize7 = serializer3.deserialize(serializedData2);
            short[] deserialize8 = serializer3.deserialize(serializedData2);
            long[] deserialize9 = serializer2.deserialize(serializedData2);
            Wifi[] wifiArr2 = new Wifi[deserialize7.length];
            int i14 = 0;
            while (i14 < deserialize7.length) {
                wifiArr2[i14] = new Wifi(deserialize2[deserialize8[i14]], deserialize[deserialize7[i14]], (int) deserialize3[i14], (int) deserialize4[i14], deserialize5[i14], deserialize6[i14], (int) deserialize9[i14]);
                i14++;
                deserialize = deserialize;
                deserialize3 = deserialize3;
                i12 = i12;
                deserialize2 = deserialize2;
                deserialize4 = deserialize4;
            }
            wifiArr[i13] = wifiArr2;
            i13++;
            serializedData2 = serializedData;
        }
        return wifiArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, Wifi[][] wifiArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData, wifiArr});
            return;
        }
        Wifi[][] preSerialize = preSerialize(wifiArr);
        LONG_SERIALIZER.serialize(serializedData, new long[]{preSerialize.length});
        if (preSerialize.length == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        int length = preSerialize.length;
        int i12 = 0;
        while (i12 < length) {
            Wifi[] wifiArr2 = preSerialize[i12];
            long[] jArr = new long[wifiArr2.length];
            long[] jArr2 = new long[wifiArr2.length];
            long[] jArr3 = new long[wifiArr2.length];
            long[] jArr4 = new long[wifiArr2.length];
            short[] sArr = new short[wifiArr2.length];
            short[] sArr2 = new short[wifiArr2.length];
            long[] jArr5 = new long[wifiArr2.length];
            Wifi[][] wifiArr3 = preSerialize;
            int i13 = length;
            int i14 = 0;
            while (i14 < wifiArr2.length) {
                Wifi wifi = wifiArr2[i14];
                jArr[i14] = wifi.getType();
                jArr2[i14] = wifi.getRssi();
                jArr3[i14] = wifi.getAge();
                jArr4[i14] = wifi.getScannedTime();
                sArr[i14] = (short) SerializerUtils.getIndexFromMapAndUpdateList(hashMap, linkedList, wifi.getBssid());
                sArr2[i14] = (short) SerializerUtils.getIndexFromMapAndUpdateList(hashMap2, linkedList2, wifi.getSsid());
                jArr5[i14] = wifi.getFrequency();
                i14++;
                wifiArr2 = wifiArr2;
                i12 = i12;
            }
            Serializer<long[]> serializer = LONG_SERIALIZER;
            serializer.serialize(serializedData, jArr);
            serializer.serialize(serializedData, jArr2);
            serializer.serialize(serializedData, jArr3);
            serializer.serialize(serializedData, jArr4);
            Serializer<short[]> serializer2 = ENUM_SERIALIZER;
            serializer2.serialize(serializedData, sArr);
            serializer2.serialize(serializedData, sArr2);
            serializer.serialize(serializedData, jArr5);
            i12++;
            preSerialize = wifiArr3;
            length = i13;
        }
        Serializer<String[]> serializer3 = STRING_SERIALIZER;
        serializer3.serialize(serializedData, linkedList.toArray(new String[0]));
        serializer3.serialize(serializedData, linkedList2.toArray(new String[0]));
    }
}
