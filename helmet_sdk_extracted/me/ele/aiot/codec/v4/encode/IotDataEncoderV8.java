package me.ele.aiot.codec.v4.encode;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.ele.aiot.codec.commons.GzipEncoder;
import me.ele.aiot.codec.commons.IotData;
import me.ele.aiot.codec.commons.IotDataEncoder;
import me.ele.aiot.codec.commons.VersionUtils;
import me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer;
import me.ele.aiot.codec.v4.serializer.SerializedData;
import me.ele.aiot.codec.v4.serializer.iotdata.BaseStationPropertySerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.BeaconEventSerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.DoubleEventSerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.DoublePropertySerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.EnumEventSerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.EnumPropertySerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.FloatEventSerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.FloatPropertySerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.LongEventSerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.LongPropertySerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.MetaSerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.StepMapSerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.TextEventSerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.TextPropertySerializer;
import me.ele.aiot.codec.v4.serializer.iotdata.WifiPropertySerializer2;
import me.ele.lab.iot.compression.MixingCompressor;

/* loaded from: classes4.dex */
public class IotDataEncoderV8 implements IotDataEncoder {
    private static transient /* synthetic */ ISurgeon $surgeonFlag = null;
    public static final List<AbstractIotDataSerializer> SERIALIZER_LIST;
    public static final int VERSION = 8;

    static {
        ArrayList arrayList = new ArrayList(15);
        SERIALIZER_LIST = arrayList;
        arrayList.add(MetaSerializer.SINGLETON_INSTANCE);
        arrayList.add(StepMapSerializer.SINGLETON_INSTANCE);
        arrayList.add(FloatPropertySerializer.SINGLETON_INSTANCE);
        arrayList.add(DoublePropertySerializer.SINGLETON_INSTANCE);
        arrayList.add(LongPropertySerializer.SINGLETON_INSTANCE);
        arrayList.add(EnumPropertySerializer.SINGLETON_INSTANCE);
        arrayList.add(TextPropertySerializer.SINGLETON_INSTANCE);
        arrayList.add(WifiPropertySerializer2.SINGLETON_INSTANCE);
        arrayList.add(FloatEventSerializer.SINGLETON_INSTANCE);
        arrayList.add(DoubleEventSerializer.SINGLETON_INSTANCE);
        arrayList.add(LongEventSerializer.SINGLETON_INSTANCE);
        arrayList.add(EnumEventSerializer.SINGLETON_INSTANCE);
        arrayList.add(TextEventSerializer.SINGLETON_INSTANCE);
        arrayList.add(BeaconEventSerializer.SINGLETON_INSTANCE);
        arrayList.add(BaseStationPropertySerializer.SINGLETON_INSTANCE);
    }

    @Override // me.ele.aiot.codec.commons.IotDataEncoder
    public byte[] encode(IotData iotData) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{this, iotData});
        }
        iotData.stepValues();
        SerializedData serializedData = new SerializedData();
        Iterator<AbstractIotDataSerializer> it = SERIALIZER_LIST.iterator();
        while (it.hasNext()) {
            it.next().serialize(iotData, serializedData);
        }
        return VersionUtils.compose(8, GzipEncoder.encode(new MixingCompressor().compress(serializedData.toMixing())));
    }
}
