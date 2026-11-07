package me.ele.aiot.indoorguide.bean;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class RetailerIdsBean implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private List<Long> retailerIds;

    public List<Long> getRetailerIds() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (List) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.retailerIds;
    }

    public void setRetailerIds(List<Long> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, list});
        } else {
            this.retailerIds = list;
        }
    }
}
