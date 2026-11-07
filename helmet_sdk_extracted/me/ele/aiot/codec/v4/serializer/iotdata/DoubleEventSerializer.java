package me.ele.aiot.codec.v4.serializer.iotdata;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.Map;
import me.ele.aiot.codec.commons.IotData;
import me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer;
import me.ele.aiot.codec.v4.serializer.MapEventSerializer;
import me.ele.aiot.codec.v4.serializer.Serializer;

/* loaded from: classes4.dex */
public class DoubleEventSerializer extends AbstractIotDataSerializer<Map<String, IotData.EventValue<double[]>>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final AbstractIotDataSerializer<Map<String, IotData.EventValue<double[]>>> SINGLETON_INSTANCE = new DoubleEventSerializer();

    private DoubleEventSerializer() {
    }

    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    protected Serializer<Map<String, IotData.EventValue<double[]>>> getSerializer() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (Serializer) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : MapEventSerializer.DOUBLE_EVENT_MAP_SERIALIZER;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    public Map<String, IotData.EventValue<double[]>> get(IotData iotData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (Map) iSurgeon.surgeon$dispatch("2", new Object[]{this, iotData}) : iotData.getDoubleEvents();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    public void set(IotData iotData, Map<String, IotData.EventValue<double[]>> map) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, iotData, map});
        } else {
            iotData.getDoubleEvents().putAll(map);
        }
    }
}
