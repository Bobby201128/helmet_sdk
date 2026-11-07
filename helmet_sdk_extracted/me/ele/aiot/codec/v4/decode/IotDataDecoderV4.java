package me.ele.aiot.codec.v4.decode;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Iterator;
import me.ele.aiot.codec.commons.GzipDecoder;
import me.ele.aiot.codec.commons.IotData;
import me.ele.aiot.codec.commons.IotDataDecoder;
import me.ele.aiot.codec.v4.encode.IotDataEncoderV4;
import me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer;
import me.ele.aiot.codec.v4.serializer.SerializedData;
import me.ele.lab.iot.compression.MixingCompressor;

/* loaded from: classes4.dex */
public class IotDataDecoderV4 implements IotDataDecoder {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    @Override // me.ele.aiot.codec.commons.IotDataDecoder
    public IotData decode(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (IotData) iSurgeon.surgeon$dispatch("1", new Object[]{this, bArr});
        }
        SerializedData serializedData = new SerializedData(new MixingCompressor().decompress(GzipDecoder.decode(bArr)));
        IotData iotData = new IotData(4);
        Iterator<AbstractIotDataSerializer> it = IotDataEncoderV4.SERIALIZER_LIST.iterator();
        while (it.hasNext()) {
            it.next().deserialize(iotData, serializedData);
        }
        iotData.unStepValues();
        return iotData;
    }
}
