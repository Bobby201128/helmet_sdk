package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.ele.aiot.codec.commons.IotData;

/* loaded from: classes4.dex */
public class PropertyListSerializer<A> implements Serializer<List<IotData.PropertyValue<A>>> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private static final Serializer<long[]> LONG_SERIALIZER = AbstractPrimarySerializer.LONG_SERIALIZER_SINGLETON;
    private final Serializer<A> valueSerializer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PropertyListSerializer(Serializer<A> serializer) {
        this.valueSerializer = serializer;
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public List<IotData.PropertyValue<A>> deserialize(SerializedData serializedData) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (List) iSurgeon.surgeon$dispatch("2", new Object[]{this, serializedData});
        }
        Serializer<long[]> serializer = LONG_SERIALIZER;
        long[] deserialize = serializer.deserialize(serializedData);
        if (deserialize != null && deserialize.length != 0) {
            long[] deserialize2 = serializer.deserialize(serializedData);
            ArrayList arrayList = new ArrayList(deserialize.length);
            for (int i12 = 0; i12 < deserialize.length; i12++) {
                arrayList.add(new IotData.PropertyValue(deserialize[i12], deserialize2[i12], this.valueSerializer.deserialize(serializedData)));
            }
            return arrayList;
        }
        return Collections.singletonList(new IotData.PropertyValue(0L, 0L, this.valueSerializer.deserialize(null)));
    }

    @Override // me.ele.aiot.codec.v4.serializer.Serializer
    public void serialize(SerializedData serializedData, List<IotData.PropertyValue<A>> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, serializedData, list});
            return;
        }
        long[] jArr = new long[list.size()];
        long[] jArr2 = new long[list.size()];
        ArrayList arrayList = new ArrayList(list.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            IotData.PropertyValue<A> propertyValue = list.get(i12);
            jArr[i12] = propertyValue.getStartTime();
            jArr2[i12] = propertyValue.getCycle();
            arrayList.add(propertyValue.getValues());
        }
        Serializer<long[]> serializer = LONG_SERIALIZER;
        serializer.serialize(serializedData, jArr);
        serializer.serialize(serializedData, jArr2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.valueSerializer.serialize(serializedData, it.next());
        }
    }
}
