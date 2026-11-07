package me.ele.aiot.codec.v4.serializer.iotdata;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Map;
import me.ele.aiot.codec.commons.IotData;
import me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer;
import me.ele.aiot.codec.v4.serializer.MapFusedSerializer;
import me.ele.aiot.codec.v4.serializer.Serializer;

/* loaded from: classes4.dex */
public class DoublePropertySerializer extends AbstractIotDataSerializer<Map<String, IotData.PropertyValue<double[]>>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final AbstractIotDataSerializer<Map<String, IotData.PropertyValue<double[]>>> SINGLETON_INSTANCE = new DoublePropertySerializer();

    private DoublePropertySerializer() {
    }

    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    protected Serializer<Map<String, IotData.PropertyValue<double[]>>> getSerializer() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (Serializer) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : MapFusedSerializer.DOUBLE_PROPERTY_MAP_SERIALIZER;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    public Map<String, IotData.PropertyValue<double[]>> get(IotData iotData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (Map) iSurgeon.surgeon$dispatch("2", new Object[]{this, iotData}) : iotData.getDoubleProperties();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    public void set(IotData iotData, Map<String, IotData.PropertyValue<double[]>> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, iotData, map});
        } else {
            iotData.getDoubleProperties().putAll(map);
        }
    }
}
