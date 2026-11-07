package s80;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import de0.e;
import de0.h;
import de0.i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class b implements i<a> {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f86191a = l90.a.m("544B443031353442303041363354B58D62545556");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f86192b = l90.a.m("1111110000000000000000000000000000000000");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f86193c = l90.a.m("544B583031353442303041363354B58D62545556");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f86194d = l90.a.m("1111110000000000000000000000000000000000");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f86195e = l90.a.m("5348453031353442303041363354B58D62545556");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f86196f = l90.a.m("1111110000000000000000000000000000000000");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f86197g = l90.a.m("5348463031353442303041363354B58D62545556");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f86198h = l90.a.m("1111110000000000000000000000000000000000");

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f86199i = l90.a.m("5348503031353442303041363354B58D62545556");

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f86200j = l90.a.m("1111110000000000000000000000000000000000");

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f86201k = l90.a.m("58334C3031353442303041363354B58D62545556");

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f86202l = l90.a.m("1111110000000000000000000000000000000000");

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f86203m = l90.a.m("5353573031353442303041363354B58D62545556");

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f86204n = l90.a.m("1111110000000000000000000000000000000000");

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f86205o = l90.a.m("424A533031353442303041363354B58D62545556");

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f86206p = l90.a.m("1111110000000000000000000000000000000000");

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f86207q = l90.a.m("5348573031353442303041363354B58D62545556");

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f86208r = l90.a.m("1111110000000000000000000000000000000000");

    @Override // de0.i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(h hVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (a) iSurgeon.surgeon$dispatch("2", new Object[]{this, hVar});
        }
        byte[] c12 = hVar.c(4585);
        if (c12 == null) {
            return null;
        }
        try {
            return new a(c12);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // de0.i
    public List<e> getFilters() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (List) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        return Arrays.asList(new e.b().b(4585, f86191a, f86192b).a(), new e.b().b(4585, f86193c, f86194d).a(), new e.b().b(4585, f86195e, f86196f).a(), new e.b().b(4585, f86197g, f86198h).a(), new e.b().b(4585, f86199i, f86200j).a(), new e.b().b(4585, f86201k, f86202l).a(), new e.b().b(4585, f86203m, f86204n).a(), new e.b().b(4585, f86205o, f86206p).a(), new e.b().b(4585, f86207q, f86208r).a());
    }
}
