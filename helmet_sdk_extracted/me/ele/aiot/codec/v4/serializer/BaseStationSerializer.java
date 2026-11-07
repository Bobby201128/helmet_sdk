package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.LinkedList;
import me.ele.aiot.codec.commons.BaseStation;

/* loaded from: classes4.dex */
public class BaseStationSerializer implements Serializer<BaseStation[][]> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final BaseStationSerializer SINGLETON_INSTANCE = new BaseStationSerializer();
    private static final Serializer<long[]> LONG_SERIALIZER = AbstractPrimarySerializer.LONG_SERIALIZER_SINGLETON;
    private static final Serializer<String[]> STRING_SERIALIZER = AbstractPrimarySerializer.STRING_SERIALIZER_SINGLETON;
    private static final Serializer<short[]> ENUM_SERIALIZER = AbstractPrimarySerializer.ENUM_SERIALIZER_SINGLETON;

    private BaseStation[][] preSerialize(BaseStation[][] baseStationArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (BaseStation[][]) iSurgeon.surgeon$dispatch("1", new Object[]{this, baseStationArr});
        }
        for (int i12 = 0; i12 < baseStationArr.length; i12++) {
            if (baseStationArr[i12] == null) {
                baseStationArr[i12] = new BaseStation[0];
            }
        }
        return baseStationArr;
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public BaseStation[][] deserialize(SerializedData serializedData) {
        SerializedData serializedData2 = serializedData;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (BaseStation[][]) iSurgeon.surgeon$dispatch("3", new Object[]{this, serializedData2});
        }
        if (serializedData2 == null) {
            return new BaseStation[0];
        }
        int i12 = (int) LONG_SERIALIZER.deserialize(serializedData2)[0];
        if (i12 == 0) {
            return new BaseStation[0];
        }
        String[] deserialize = STRING_SERIALIZER.deserialize(serializedData2);
        BaseStation[][] baseStationArr = new BaseStation[i12];
        int i13 = 0;
        while (i13 < i12) {
            Serializer<long[]> serializer = LONG_SERIALIZER;
            long[] deserialize2 = serializer.deserialize(serializedData2);
            long[] deserialize3 = serializer.deserialize(serializedData2);
            long[] deserialize4 = serializer.deserialize(serializedData2);
            long[] deserialize5 = serializer.deserialize(serializedData2);
            long[] deserialize6 = serializer.deserialize(serializedData2);
            long[] deserialize7 = serializer.deserialize(serializedData2);
            short[] deserialize8 = ENUM_SERIALIZER.deserialize(serializedData2);
            BaseStation[] baseStationArr2 = new BaseStation[deserialize8.length];
            int i14 = 0;
            while (i14 < deserialize8.length) {
                long[] jArr = deserialize2;
                baseStationArr2[i14] = new BaseStation((int) deserialize2[i14], (int) deserialize3[i14], deserialize[deserialize8[i14]], (int) deserialize4[i14], deserialize5[i14], (int) deserialize6[i14], (int) deserialize7[i14]);
                i14++;
                i12 = i12;
                deserialize6 = deserialize6;
                i13 = i13;
                deserialize3 = deserialize3;
                deserialize5 = deserialize5;
                deserialize8 = deserialize8;
                deserialize4 = deserialize4;
                deserialize2 = jArr;
            }
            int i15 = i13;
            baseStationArr[i15] = baseStationArr2;
            i13 = i15 + 1;
            serializedData2 = serializedData;
        }
        return baseStationArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, BaseStation[][] baseStationArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData, baseStationArr});
            return;
        }
        BaseStation[][] preSerialize = preSerialize(baseStationArr);
        LONG_SERIALIZER.serialize(serializedData, new long[]{preSerialize.length});
        if (preSerialize.length == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        int length = preSerialize.length;
        int i12 = 0;
        while (i12 < length) {
            BaseStation[] baseStationArr2 = preSerialize[i12];
            long[] jArr = new long[baseStationArr2.length];
            long[] jArr2 = new long[baseStationArr2.length];
            long[] jArr3 = new long[baseStationArr2.length];
            long[] jArr4 = new long[baseStationArr2.length];
            long[] jArr5 = new long[baseStationArr2.length];
            long[] jArr6 = new long[baseStationArr2.length];
            short[] sArr = new short[baseStationArr2.length];
            int i13 = 0;
            while (i13 < baseStationArr2.length) {
                BaseStation baseStation = baseStationArr2[i13];
                jArr[i13] = baseStation.getMnc();
                jArr2[i13] = baseStation.getMcc();
                jArr3[i13] = baseStation.getIsMainCell();
                jArr4[i13] = baseStation.getCellId();
                jArr5[i13] = baseStation.getDbm();
                jArr6[i13] = baseStation.getLac();
                sArr[i13] = (short) SerializerUtils.getIndexAndUpdate(linkedList, baseStation.getNetworkType());
                i13++;
                length = length;
                i12 = i12;
            }
            Serializer<long[]> serializer = LONG_SERIALIZER;
            serializer.serialize(serializedData, jArr);
            serializer.serialize(serializedData, jArr2);
            serializer.serialize(serializedData, jArr3);
            serializer.serialize(serializedData, jArr4);
            serializer.serialize(serializedData, jArr5);
            serializer.serialize(serializedData, jArr6);
            ENUM_SERIALIZER.serialize(serializedData, sArr);
            i12++;
        }
        STRING_SERIALIZER.serialize(serializedData, linkedList.toArray(new String[0]));
    }
}
