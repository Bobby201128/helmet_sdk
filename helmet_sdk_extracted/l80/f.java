package l80;

import android.text.TextUtils;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import i80.j;
import java.io.IOException;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.i0;

/* loaded from: classes4.dex */
public class f implements b0 {
    private static transient /* synthetic */ ISurgeon $surgeonFlag = null;

    /* renamed from: a, reason: collision with root package name */
    public static String f60252a = "";

    @Override // okhttp3.b0
    public i0 intercept(b0.a aVar) throws IOException {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (i0) iSurgeon.surgeon$dispatch("1", new Object[]{this, aVar});
        }
        g0.a h12 = aVar.request().h();
        if (!TextUtils.isEmpty(f60252a)) {
            if (j.f54968c) {
                h12.d("token", f60252a);
                h12.d("http-access-token", f60252a);
                h12.a("http-app-type", "2");
            } else {
                h12.d("x-token", f60252a);
                h12.a("http-app-type", "1");
            }
            h12.d("http-access-token", f60252a);
            h12.a("upload-time", String.valueOf(rf1.c.v()));
        }
        return aVar.c(h12.b());
    }
}
