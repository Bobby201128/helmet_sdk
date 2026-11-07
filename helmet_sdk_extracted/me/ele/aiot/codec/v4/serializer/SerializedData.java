package me.ele.aiot.codec.v4.serializer;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import me.ele.lab.iot.compression.Mixing;

/* loaded from: classes4.dex */
public class SerializedData {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private Queue<double[]> doubles;
    private Queue<short[]> enums;
    private Queue<float[]> floats;
    private Queue<long[]> longs;
    private Queue<String[]> strings;

    public SerializedData(Mixing mixing) {
        this.longs = new LinkedList();
        this.floats = new LinkedList();
        this.doubles = new LinkedList();
        this.enums = new LinkedList();
        this.strings = new LinkedList();
        this.longs = listToQueue(mixing.getLongs());
        this.floats = listToQueue(mixing.getFloats());
        this.doubles = listToQueue(mixing.getDoubles());
        this.enums = listToQueue(mixing.getEnums());
        this.strings = listToQueue(mixing.getStrings());
    }

    private static <T> Queue<T> listToQueue(List<T> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (Queue) iSurgeon.surgeon$dispatch("3", new Object[]{list}) : new LinkedList(list);
    }

    private static <T> List<T> queueToList(Queue<T> queue) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (List) iSurgeon.surgeon$dispatch("2", new Object[]{queue}) : new ArrayList(queue);
    }

    public Queue<double[]> getDoubles() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? (Queue) iSurgeon.surgeon$dispatch("6", new Object[]{this}) : this.doubles;
    }

    public Queue<short[]> getEnums() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (Queue) iSurgeon.surgeon$dispatch("7", new Object[]{this}) : this.enums;
    }

    public Queue<float[]> getFloats() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (Queue) iSurgeon.surgeon$dispatch("5", new Object[]{this}) : this.floats;
    }

    public Queue<long[]> getLongs() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (Queue) iSurgeon.surgeon$dispatch("4", new Object[]{this}) : this.longs;
    }

    public Queue<String[]> getStrings() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL) ? (Queue) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this}) : this.strings;
    }

    public Mixing toMixing() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (Mixing) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        return new Mixing(queueToList(this.longs), queueToList(this.enums), queueToList(this.floats), queueToList(this.doubles), queueToList(this.strings));
    }

    public SerializedData() {
        this.longs = new LinkedList();
        this.floats = new LinkedList();
        this.doubles = new LinkedList();
        this.enums = new LinkedList();
        this.strings = new LinkedList();
    }
}
