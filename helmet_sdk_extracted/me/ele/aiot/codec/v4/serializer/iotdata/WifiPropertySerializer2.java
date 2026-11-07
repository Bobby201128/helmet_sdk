package me.ele.aiot.codec.v4.serializer.iotdata;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.aiot.codec.commons.IotData;
import me.ele.aiot.codec.commons.Wifi;
import me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer;
import me.ele.aiot.codec.v4.serializer.PropertySerializer;
import me.ele.aiot.codec.v4.serializer.Serializer;

/* loaded from: classes4.dex */
public class WifiPropertySerializer2 extends AbstractIotDataSerializer<IotData.PropertyValue<Wifi[][]>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    public static final AbstractIotDataSerializer<IotData.PropertyValue<Wifi[][]>> SINGLETON_INSTANCE = new WifiPropertySerializer2();

    private WifiPropertySerializer2() {
    }

    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    protected Serializer<IotData.PropertyValue<Wifi[][]>> getSerializer() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (Serializer) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : PropertySerializer.WIFI_PROPERTY_SERIALIZER_2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    public IotData.PropertyValue<Wifi[][]> get(IotData iotData) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (IotData.PropertyValue) iSurgeon.surgeon$dispatch("2", new Object[]{this, iotData}) : iotData.getWifiProperty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // me.ele.aiot.codec.v4.serializer.AbstractIotDataSerializer
    public void set(IotData iotData, IotData.PropertyValue<Wifi[][]> propertyValue) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, iotData, propertyValue});
        } else {
            iotData.setWifiProperty(propertyValue);
        }
    }
}
