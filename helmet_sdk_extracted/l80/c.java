package l80;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.IOException;
import java.util.Map;
import me.ele.aiot.kernel.http.KnightSmartDeviceEnv;
import me.ele.common.BaseValueProvider;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.i0;

/* loaded from: classes4.dex */
public class c implements b0 {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    public String a() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (String) iSurgeon.surgeon$dispatch("2", new Object[]{this});
        }
        return BaseValueProvider.getLastLongitude() + "," + BaseValueProvider.getLastLatitude();
    }

    @Override // okhttp3.b0
    public i0 intercept(b0.a aVar) throws IOException {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (i0) iSurgeon.surgeon$dispatch("1", new Object[]{this, aVar});
        }
        g0.a h12 = aVar.request().h();
        if (d.f60233a == KnightSmartDeviceEnv.DAILY && d.f60234b != null && !d.f60234b.isEmpty()) {
            for (Map.Entry<String, String> entry : d.f60234b.entrySet()) {
                h12.d(entry.getKey(), entry.getValue());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String a12 = a();
        sb2.append("loc=");
        sb2.append(a12);
        h12.d("x-shard", sb2.toString());
        return aVar.c(h12.b());
    }
}
