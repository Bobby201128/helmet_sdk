package me.ele.aiot.activityrecognition.nativelib;

import androidx.annotation.Keep;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.File;
import java.util.Iterator;
import me.ele.aiot.activityrecognition.nativelib.SoModule;

@Keep
/* loaded from: classes4.dex */
public class DelegateSystem {
    private static transient /* synthetic */ ISurgeon $surgeonFlag = null;
    private static final String TAG = "DelegateSystem";

    private static String getCompleteSoName(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (String) iSurgeon.surgeon$dispatch("3", new Object[]{str});
        }
        return "lib" + str + ".so";
    }

    public static void load(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{str});
            return;
        }
        n70.c.c("HAR_LOAD_SO", "into load: " + str);
        System.load(str);
    }

    public static void loadLibrary(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        boolean z12 = false;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{str});
            return;
        }
        n70.c.c("HAR_LOAD_SO", "into loadLibrary: " + str);
        SoModule C = SoLoaderManager.B().C();
        if (C == null) {
            System.loadLibrary(str);
            return;
        }
        String str2 = null;
        Iterator<SoModule.SoFile> it = C.f61833c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SoModule.SoFile next = it.next();
            String completeSoName = getCompleteSoName(str);
            if (next.soNames.contains(completeSoName)) {
                str2 = SoLoaderManager.B().D() + File.separator + completeSoName;
                z12 = true;
                break;
            }
        }
        if (z12) {
            n70.c.c("HAR_LOAD_SO", "isRemoteSo:" + z12 + ",path: " + str2);
            try {
                System.load(str2);
                n70.c.c("HAR_LOAD_SO", str + "load path success");
            } finally {
                try {
                } catch (Throwable th2) {
                }
            }
        } else {
            n70.c.c("HAR_LOAD_SO", "isRemoteSo:" + z12 + ",load system: " + str);
            System.loadLibrary(str);
        }
    }
}
