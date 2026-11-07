package i80;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.aiot.kernel.wavearrive.ManufactureId;

/* loaded from: classes4.dex */
public class k {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    public static void a(ManufactureId manufactureId, i iVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{manufactureId, iVar});
        } else {
            w80.a.a(manufactureId, iVar);
        }
    }

    public static void b() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[0]);
        } else {
            w80.a.b();
        }
    }
}
