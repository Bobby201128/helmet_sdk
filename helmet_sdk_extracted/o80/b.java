package o80;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import l80.d;
import me.ele.aiot.kernel.http.KnightSmartDeviceEnv;
import me.ele.aiot.sensor.internal.GsonInstance;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes4.dex */
public class b {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private static Retrofit f75827a;

    /* renamed from: b, reason: collision with root package name */
    private static a f75828b;

    private static a a(KnightSmartDeviceEnv knightSmartDeviceEnv) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (a) iSurgeon.surgeon$dispatch("1", new Object[]{knightSmartDeviceEnv});
        }
        Retrofit build = new Retrofit.Builder().baseUrl(knightSmartDeviceEnv.getDomainName()).client(d.g().f()).addConverterFactory(GsonConverterFactory.create(GsonInstance.f62066c)).build();
        f75827a = build;
        return (a) build.create(a.class);
    }

    public static a b() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (a) iSurgeon.surgeon$dispatch("2", new Object[0]);
        }
        if (f75828b == null) {
            f75828b = a(d.f60233a);
        }
        return f75828b;
    }
}
