package me.ele.aiot.awareness.gray;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class GrayShippingMode implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private boolean isAll;
    private List<String> shippingModeList;

    public List<String> getShippingModeList() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (List) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.shippingModeList;
    }

    public boolean isAll() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Boolean) iSurgeon.surgeon$dispatch("2", new Object[]{this})).booleanValue() : this.isAll;
    }
}
