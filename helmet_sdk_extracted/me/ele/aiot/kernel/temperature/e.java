package me.ele.aiot.kernel.temperature;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import de0.e;
import de0.h;
import de0.i;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class e implements i<d> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f62042a = l90.a.m("54444C3031353442303041363354B58D62545556");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f62043b = l90.a.m("1111110000000000000000000000000000000000");

    @Override // de0.i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(h hVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (d) iSurgeon.surgeon$dispatch("2", new Object[]{this, hVar});
        }
        byte[] c12 = hVar.c(4585);
        if (c12 == null) {
            return null;
        }
        try {
            return new d(c12);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // de0.i
    public List<de0.e> getFilters() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (List) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        return Collections.singletonList(new e.b().b(4585, f62042a, f62043b).a());
    }
}
