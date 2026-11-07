package me.ele.aiot.codec.v4.serializer;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SerializerUtils {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    private SerializerUtils() {
    }

    public static <T> int getIndexAndUpdate(List<T> list, T t12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{list, t12})).intValue();
        }
        int indexOf = list.indexOf(t12);
        if (indexOf != -1) {
            return indexOf;
        }
        list.add(t12);
        return list.size() - 1;
    }

    public static <T> int getIndexFromMapAndUpdateList(Map<T, Integer> map, List<T> list, T t12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return ((Integer) iSurgeon.surgeon$dispatch("2", new Object[]{map, list, t12})).intValue();
        }
        Integer num = map.get(t12);
        if (num != null) {
            return num.intValue();
        }
        list.add(t12);
        map.put(t12, Integer.valueOf(list.size() - 1));
        return list.size() - 1;
    }

    public static long[] toArray(List<Long> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (long[]) iSurgeon.surgeon$dispatch("3", new Object[]{list});
        }
        long[] jArr = new long[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            jArr[i12] = list.get(i12).longValue();
        }
        return jArr;
    }
}
