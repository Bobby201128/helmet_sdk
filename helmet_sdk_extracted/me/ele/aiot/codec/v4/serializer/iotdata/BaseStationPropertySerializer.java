package me.ele.aiot.codec.v4.serializer.iotdata;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.aiot.codec.commons.BaseStation;
import me.ele.aiot.codec.commons.IotData;
import me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer;
import me.ele.aiot.codec.v4.serializer.PropertySerializer;
import me.ele.aiot.codec.v4.serializer.Serializer;

/* loaded from: classes4.dex */
public class BaseStationPropertySerializer extends AbstractIotDataSerializer<IotData.PropertyValue<BaseStation[][]>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final AbstractIotDataSerializer<IotData.PropertyValue<BaseStation[][]>> SINGLETON_INSTANCE = new BaseStationPropertySerializer();

    private BaseStationPropertySerializer() {
    }

    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    protected Serializer<IotData.PropertyValue<BaseStation[][]>> getSerializer() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (Serializer) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : PropertySerializer.BASE_STATION_PROPERTY_SERIALIZER;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    public IotData.PropertyValue<BaseStation[][]> get(IotData iotData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (IotData.PropertyValue) iSurgeon.surgeon$dispatch("2", new Object[]{this, iotData}) : iotData.getBaseStationProperty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    public void set(IotData iotData, IotData.PropertyValue<BaseStation[][]> propertyValue) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, iotData, propertyValue});
        } else {
            iotData.setBaseStationProperty(propertyValue);
        }
    }
}
