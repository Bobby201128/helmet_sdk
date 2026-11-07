package me.ele.aiot.awareness.gray;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class NoGrayMobile implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private List<String> mobileInfoList;

    public List<String> getMobileInfoList() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (List) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.mobileInfoList;
    }
}
