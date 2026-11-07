package me.ele.aiot.activityrecognition.cache;

import android.content.Context;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.normandie.sampling.config.SharedPreferenceManager;

/* loaded from: classes4.dex */
public class b {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f61787a;

    public static b c() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (b) iSurgeon.surgeon$dispatch("1", new Object[0]);
        }
        if (f61787a == null) {
            synchronized (b.class) {
                if (f61787a == null) {
                    f61787a = new b();
                }
            }
        }
        return f61787a;
    }

    public String a(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "9") ? (String) iSurgeon.surgeon$dispatch("9", new Object[]{this, context}) : c.a(context).d("har_model_hash", "");
    }

    public String b(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "7") ? (String) iSurgeon.surgeon$dispatch("7", new Object[]{this, context}) : c.a(context).d("har_model_info", "");
    }

    public String d(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (String) iSurgeon.surgeon$dispatch("2", new Object[]{this, context}) : c.a(context).d(SharedPreferenceManager.KNIGHT_ID, "");
    }

    public String e(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (String) iSurgeon.surgeon$dispatch("4", new Object[]{this, context}) : c.a(context).d(ParamsConstants.UrlConstant.H5_REQUEST_TOKEN, "");
    }

    public void f(Context context, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, context, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        c.a(context).e("har_model_hash", str);
    }

    public void g(Context context, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, context, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        c.a(context).e("har_model_info", str);
    }

    public void h(Context context, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, context, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        c.a(context).e(SharedPreferenceManager.KNIGHT_ID, str);
    }

    public void i(Context context, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, context, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        c.a(context).e(ParamsConstants.UrlConstant.H5_REQUEST_TOKEN, str);
    }
}
