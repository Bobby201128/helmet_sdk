package me.ele.aiot.activityrecognition.nativelib;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.taobao.downloader.Downloader;
import com.taobao.downloader.request.DownloadListener;
import com.taobao.downloader.request.DownloadRequest;
import com.taobao.downloader.request.Item;
import com.taobao.downloader.request.Param;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.ele.aiot.activityrecognition.nativelib.SoModule;
import org.android.agoo.common.AgooConstants;
import p.r.o.x.y.PrivacyApi;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes4.dex */
public class SoLoaderManager {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private Application f61796a;

    /* renamed from: b, reason: collision with root package name */
    private String f61797b;

    /* renamed from: c, reason: collision with root package name */
    private String f61798c;

    /* renamed from: d, reason: collision with root package name */
    private String f61799d;

    /* renamed from: h, reason: collision with root package name */
    private Handler f61803h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f61806k;

    /* renamed from: l, reason: collision with root package name */
    private String f61807l;

    /* renamed from: m, reason: collision with root package name */
    private SoModule f61808m;

    /* renamed from: n, reason: collision with root package name */
    private SoModule f61809n;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, List<j>> f61800e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Integer> f61801f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private boolean f61802g = false;

    /* renamed from: i, reason: collision with root package name */
    private List<SoModule> f61804i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private boolean f61805j = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f61810o = false;

    /* loaded from: classes4.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SoModule f61811a;

        a(SoModule soModule) {
            this.f61811a = soModule;
            me.ele.td.lib.wrapper.a.a();
        }

        protected Void a(Void... voidArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (Void) iSurgeon.surgeon$dispatch("1", new Object[]{this, voidArr});
            }
            pf1.b.j("SoLoaderManager$1");
            synchronized (SoLoaderManager.this.f61804i) {
                try {
                    if (!SoLoaderManager.this.f61802g) {
                        SoLoaderManager.this.T(this.f61811a, true);
                        SoLoaderManager.this.f61802g = true;
                    } else if (!SoLoaderManager.this.f61804i.contains(this.f61811a)) {
                        n70.c.c("HAR_LOAD_SO", "已经有下载任务，先放入缓存队列 " + this.f61811a.f61831a);
                        SoLoaderManager.this.f61804i.add(this.f61811a);
                    } else {
                        n70.c.c("HAR_LOAD_SO", "缓存队列已经存在 " + this.f61811a.f61831a);
                    }
                } catch (Throwable th2) {
                    pf1.b.i();
                    throw th2;
                }
            }
            pf1.b.i();
            return null;
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
            pf1.b.j("SoLoaderManager$1");
            Void a12 = a(voidArr);
            pf1.b.i();
            return a12;
        }
    }

    /* loaded from: classes4.dex */
    public class b extends AsyncTask<Void, Void, Void> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SoModule f61813a;

        b(SoModule soModule) {
            this.f61813a = soModule;
            me.ele.td.lib.wrapper.a.a();
        }

        protected Void a(Void... voidArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (Void) iSurgeon.surgeon$dispatch("1", new Object[]{this, voidArr});
            }
            pf1.b.j("SoLoaderManager$2");
            SoLoaderManager.this.T(this.f61813a, false);
            pf1.b.i();
            return null;
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
            pf1.b.j("SoLoaderManager$2");
            Void a12 = a(voidArr);
            pf1.b.i();
            return a12;
        }
    }

    /* loaded from: classes4.dex */
    public class c extends AsyncTask<Void, Void, Boolean> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f61815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SoModule f61816b;

        c(List list, SoModule soModule) {
            this.f61815a = list;
            this.f61816b = soModule;
            me.ele.td.lib.wrapper.a.a();
        }

        protected Boolean a(Void... voidArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{this, voidArr});
            }
            pf1.b.j("SoLoaderManager$4");
            n70.c.c("HAR_LOAD_SO", "处理解压文件 " + this.f61815a.toString());
            Iterator it = this.f61815a.iterator();
            while (it.hasNext()) {
                File file = new File(SoLoaderManager.this.f61799d, (String) it.next());
                if (file.exists()) {
                    try {
                        SoLoaderManager.w(file, SoLoaderManager.this.f61798c);
                    } catch (IOException unused) {
                        return Boolean.FALSE;
                    } finally {
                        pf1.b.i();
                    }
                }
            }
            SoLoaderManager.this.r(this.f61816b);
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bool});
                return;
            }
            super.onPostExecute(bool);
            n70.c.c("HAR_LOAD_SO", "rename " + bool);
            if (bool.booleanValue()) {
                synchronized (SoLoaderManager.this.f61801f) {
                    SoLoaderManager.this.f61801f.put(this.f61816b.f61831a, 1);
                    SoLoaderManager.this.F();
                    SoLoaderManager.this.M(this.f61816b.f61831a, 20000);
                }
                return;
            }
            SoLoaderManager.this.L(this.f61816b.f61831a, 2);
            SoLoaderManager.this.f61801f.put(this.f61816b.f61831a, 3);
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            pf1.b.j("SoLoaderManager$4");
            Boolean a12 = a(voidArr);
            pf1.b.i();
            return a12;
        }
    }

    /* loaded from: classes4.dex */
    public class d extends AsyncTask<Void, Void, Void> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SoModule f61818a;

        d(SoModule soModule) {
            this.f61818a = soModule;
            me.ele.td.lib.wrapper.a.a();
        }

        protected Void a(Void... voidArr) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (Void) iSurgeon.surgeon$dispatch("1", new Object[]{this, voidArr});
            }
            pf1.b.j("SoLoaderManager$5");
            SoLoaderManager.this.y(this.f61818a);
            pf1.b.i();
            return null;
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
            pf1.b.j("SoLoaderManager$5");
            Void a12 = a(voidArr);
            pf1.b.i();
            return a12;
        }
    }

    /* loaded from: classes4.dex */
    public class e implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ j f61820n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f61821o;

        e(j jVar, int i12) {
            this.f61820n = jVar;
            this.f61821o = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                this.f61820n.a(this.f61821o);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class f implements Runnable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ j f61823n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f61824o;

        f(j jVar, String str) {
            this.f61823n = jVar;
            this.f61824o = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this});
            } else {
                this.f61823n.onSuccess(this.f61824o);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class g implements j {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f61826a;

        g(k kVar) {
            this.f61826a = kVar;
        }

        @Override // me.ele.aiot.activityrecognition.nativelib.SoLoaderManager.j
        public void a(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12)});
                return;
            }
            SoLoaderManager.this.f61810o = false;
            SoLoaderManager.B().O("pytorch", this);
            this.f61826a.OnSoLoaderFailure();
            n70.c.c("HAR_LOAD_SO", "startCheckPytorchSo addListener SoLoaderManager onDownloadError");
        }

        @Override // me.ele.aiot.activityrecognition.nativelib.SoLoaderManager.j
        public void onSuccess(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
                return;
            }
            SoLoaderManager.this.f61810o = false;
            SoLoaderManager.B().O("pytorch", this);
            this.f61826a.OnSoLoaderSuccess();
            n70.c.c("HAR_LOAD_SO", "startCheckPytorchSo addListener SoLoaderManager onSuccess");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        static SoLoaderManager f61830a = new SoLoaderManager();
    }

    /* loaded from: classes4.dex */
    public interface j {
        void a(int i12);

        void onSuccess(String str);
    }

    /* loaded from: classes4.dex */
    public interface k {
        void OnSoLoaderFailure();

        void OnSoLoaderSuccess();
    }

    public static File A(File file) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "28")) {
            return (File) iSurgeon.surgeon$dispatch("28", new Object[]{file});
        }
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return file;
    }

    public static SoLoaderManager B() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (SoLoaderManager) iSurgeon.surgeon$dispatch("1", new Object[0]) : i.f61830a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this});
            return;
        }
        try {
            me.ele.aiot.activityrecognition.nativelib.a.d(getClass().getClassLoader(), this.f61797b);
            n70.c.c("HAR_LOAD_SO", "hook path success");
        } catch (Throwable unused) {
            n70.c.c("HAR_LOAD_SO", "hook error");
        }
    }

    public static boolean G(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "25")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("25", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Process.is64Bit();
        }
        return J(context);
    }

    private boolean H(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "20")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("20", new Object[]{this, str, str2})).booleanValue();
        }
        File file = new File(this.f61797b, str);
        if (file.exists() && ox.c.c(str2, file.getAbsolutePath())) {
            return true;
        }
        return false;
    }

    private boolean I(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_MESSAGE_NULL)) {
            return ((Boolean) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_MESSAGE_NULL, new Object[]{this, str, str2})).booleanValue();
        }
        File file = new File(this.f61799d, str);
        if (file.exists() && ox.c.c(str2, file.getAbsolutePath())) {
            return true;
        }
        return false;
    }

    private static boolean J(Context context) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "26")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("26", new Object[]{context})).booleanValue();
        }
        try {
            Object invoke = PrivacyApi.invoke(ClassLoader.class.getDeclaredMethod("findLibrary", String.class), context.getClassLoader(), "art");
            if (invoke == null) {
                return false;
            }
            return ((String) invoke).contains("lib64");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "18")) {
            iSurgeon.surgeon$dispatch("18", new Object[]{this, str, Integer.valueOf(i12)});
            return;
        }
        synchronized (this.f61800e) {
            List<j> list = this.f61800e.get(str);
            if (list != null) {
                Iterator<j> it = list.iterator();
                while (it.hasNext()) {
                    this.f61803h.post(new e(it.next(), i12));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str, int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "19")) {
            iSurgeon.surgeon$dispatch("19", new Object[]{this, str, Integer.valueOf(i12)});
            return;
        }
        synchronized (this.f61800e) {
            List<j> list = this.f61800e.get(str);
            if (list != null) {
                Iterator<j> it = list.iterator();
                while (it.hasNext()) {
                    this.f61803h.postDelayed(new f(it.next(), str), i12);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(final SoModule soModule, final boolean z12) {
        boolean z13;
        boolean z14;
        List<SoModule.SoFile> list;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, soModule, Boolean.valueOf(z12)});
            return;
        }
        synchronized (this.f61801f) {
            if (soModule == null) {
                return;
            }
            if (this.f61801f.get(soModule.f61831a) != null && this.f61801f.get(soModule.f61831a).intValue() == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            n70.c.c("HAR_LOAD_SO", "start down soModuleSuccess " + soModule.f61831a + " " + z13);
            if (z13) {
                if (z12) {
                    z();
                }
                return;
            }
            if (!s(soModule)) {
                L(soModule.f61831a, 1);
                if (z12) {
                    z();
                    return;
                }
                return;
            }
            synchronized (this.f61801f) {
                if (this.f61801f.get(soModule.f61831a) != null && this.f61801f.get(soModule.f61831a).intValue() == 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n70.c.c("HAR_LOAD_SO", "start down isDowning " + soModule.f61831a + " " + z14);
                if (z14) {
                    return;
                }
                this.f61801f.put(soModule.f61831a, 2);
                final h q12 = q(this.f61808m);
                if (q12.f61828a.isEmpty() && q12.f61829b.isEmpty()) {
                    n70.c.c("HAR_LOAD_SO", "已经全部下载");
                    if (z12) {
                        z();
                        return;
                    }
                    return;
                }
                SoModule soModule2 = this.f61808m;
                if (soModule2 != null && (list = soModule2.f61833c) != null && list.size() > 0 && q12.f61828a.isEmpty() && !q12.f61829b.isEmpty()) {
                    v(soModule, q12.f61829b);
                    n70.c.c("HAR_LOAD_SO", "已经全部下载,仅需要解压");
                    if (z12) {
                        z();
                        return;
                    }
                    return;
                }
                n70.c.c("HAR_LOAD_SO", "start down " + soModule.f61831a);
                DownloadRequest downloadRequest = new DownloadRequest();
                downloadRequest.downloadList = q12.f61828a;
                Param param = new Param();
                param.notificationUI = false;
                param.network = 7;
                param.fileStorePath = this.f61799d;
                param.bizId = "nativeLibDownload";
                param.priority = soModule.f61838h;
                downloadRequest.downloadParam = param;
                final long currentTimeMillis = System.currentTimeMillis();
                final int[] iArr = {-1};
                final String[] strArr = {"none"};
                Downloader.getInstance().download(downloadRequest, new DownloadListener() { // from class: me.ele.aiot.activityrecognition.nativelib.SoLoaderManager.3
                    private static transient /* synthetic */ ISurgeon $surgeonFlag;

                    @Override // com.taobao.downloader.request.DownloadListener
                    public void onDownloadError(String str, int i12, String str2) {
                        ISurgeon iSurgeon2 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon2, "2")) {
                            iSurgeon2.surgeon$dispatch("2", new Object[]{this, str, Integer.valueOf(i12), str2});
                            return;
                        }
                        n70.c.c("HAR_LOAD_SO", "down error " + str + " : " + i12 + " : " + str2);
                        iArr[0] = i12;
                        strArr[0] = str2;
                    }

                    @Override // com.taobao.downloader.request.DownloadListener
                    public void onDownloadFinish(String str, String str2) {
                        ISurgeon iSurgeon2 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon2, "3")) {
                            iSurgeon2.surgeon$dispatch("3", new Object[]{this, str, str2});
                        }
                    }

                    @Override // com.taobao.downloader.request.DownloadListener
                    public void onDownloadProgress(int i12) {
                        ISurgeon iSurgeon2 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon2, "1")) {
                            iSurgeon2.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12)});
                        }
                    }

                    @Override // com.taobao.downloader.request.DownloadListener
                    public void onDownloadStateChange(String str, boolean z15) {
                        ISurgeon iSurgeon2 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon2, "4")) {
                            iSurgeon2.surgeon$dispatch("4", new Object[]{this, str, Boolean.valueOf(z15)});
                        }
                    }

                    @Override // com.taobao.downloader.request.DownloadListener
                    public void onFinish(boolean z15) {
                        ISurgeon iSurgeon2 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon2, "5")) {
                            iSurgeon2.surgeon$dispatch("5", new Object[]{this, Boolean.valueOf(z15)});
                            return;
                        }
                        n70.c.c("HAR_LOAD_SO", "down finish " + soModule.f61831a + " " + z15);
                        if (z15) {
                            n70.c.c("HAR_LOAD_SO", "down finish " + soModule.f61831a + " SoDownCost = " + (System.currentTimeMillis() - currentTimeMillis));
                            ArrayList arrayList = new ArrayList();
                            if (!q12.f61829b.isEmpty()) {
                                arrayList.addAll(q12.f61829b);
                            }
                            Iterator it = q12.f61828a.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Item) it.next()).name);
                            }
                            SoLoaderManager.this.v(soModule, arrayList);
                        } else {
                            try {
                                n70.c.c("HAR_LOAD_SO", "report error " + soModule.f61831a + " " + iArr[0] + " " + strArr[0]);
                            } catch (Throwable unused) {
                            }
                            SoLoaderManager.this.f61801f.put(soModule.f61831a, 3);
                            SoLoaderManager.this.L(soModule.f61831a, iArr[0]);
                        }
                        if (z12) {
                            SoLoaderManager.this.z();
                        }
                    }

                    @Override // com.taobao.downloader.request.DownloadListener
                    public void onNetworkLimit(int i12, Param param2, DownloadListener.a aVar) {
                        ISurgeon iSurgeon2 = $surgeonFlag;
                        if (InstrumentAPI.support(iSurgeon2, "6")) {
                            iSurgeon2.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12), param2, aVar});
                        } else {
                            iArr[0] = -10000;
                            strArr[0] = "onNetworkLimit";
                        }
                    }
                });
            }
        }
    }

    private h q(SoModule soModule) {
        ISurgeon iSurgeon = $surgeonFlag;
        boolean z12 = true;
        if (InstrumentAPI.support(iSurgeon, "17")) {
            return (h) iSurgeon.surgeon$dispatch("17", new Object[]{this, soModule});
        }
        a aVar = null;
        if (soModule == null) {
            return new h(aVar);
        }
        h hVar = new h(aVar);
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList();
        String str = soModule.f61834d;
        if (str != null && str.contains(this.f61807l)) {
            String name = new File(soModule.f61834d).getName();
            String lastPathSegment = Uri.parse(soModule.f61836f).getLastPathSegment();
            for (SoModule.SoFile soFile : soModule.f61833c) {
                if (!H(soFile.soNames, soFile.soMd5)) {
                    z12 = false;
                }
            }
            if (!z12) {
                if (I(name, soModule.f61835e)) {
                    arrayList2.add(lastPathSegment);
                } else {
                    Item item = new Item();
                    item.url = soModule.f61836f;
                    item.name = lastPathSegment;
                    n70.c.c("HAR_LOAD_SO", "add down item " + soModule.f61836f);
                    arrayList.add(item);
                }
            }
        }
        hVar.f61828a = arrayList;
        hVar.f61829b = arrayList2;
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(SoModule soModule) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "16")) {
            iSurgeon.surgeon$dispatch("16", new Object[]{this, soModule});
        } else {
            new d(soModule).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    private static boolean s(SoModule soModule) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_ENCRYPT_FAIL) ? ((Boolean) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_ENCRYPT_FAIL, new Object[]{soModule})).booleanValue() : SoModule.b(soModule);
    }

    private boolean t(SoModule soModule) {
        ISurgeon iSurgeon = $surgeonFlag;
        int i12 = 1;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            return ((Boolean) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, soModule})).booleanValue();
        }
        if (soModule == null) {
            n70.c.c("HAR_LOAD_SO", "mNativeLibInfos is empty");
            return true;
        }
        y(soModule);
        File[] listFiles = new File(this.f61797b).listFiles();
        File file = new File(this.f61796a.getApplicationInfo().nativeLibraryDir);
        ArrayList arrayList = new ArrayList(soModule.f61832b);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.exists() && file2.length() > 0 && arrayList.remove(file2.getName())) {
                    n70.c.c("HAR_LOAD_SO", "module local has file " + soModule.f61831a + "  " + file2.getAbsolutePath());
                }
            }
        }
        File[] listFiles2 = file.listFiles();
        if (listFiles2 != null) {
            for (File file3 : listFiles2) {
                if (file3.exists() && file3.length() > 0 && arrayList.remove(file3.getName())) {
                    n70.c.c("HAR_LOAD_SO", "module apk local has file " + soModule.f61831a + "  " + file3.getAbsolutePath());
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        synchronized (this.f61801f) {
            Map<String, Integer> map = this.f61801f;
            String str = soModule.f61831a;
            if (!isEmpty) {
                i12 = 4;
            }
            map.put(str, Integer.valueOf(i12));
        }
        n70.c.c("HAR_LOAD_SO", "module init " + soModule.f61831a + "  " + isEmpty);
        return isEmpty;
    }

    public static void u(Closeable closeable) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "29")) {
            iSurgeon.surgeon$dispatch("29", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e12) {
                throw e12;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(SoModule soModule, List<String> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            iSurgeon.surgeon$dispatch("15", new Object[]{this, soModule, list});
        } else {
            new c(list, soModule).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static boolean w(File file, String str) throws IOException {
        InputStream inputStream;
        Closeable closeable;
        ?? r62;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "27")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("27", new Object[]{file, str})).booleanValue();
        }
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            str = str + str2;
        }
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                inputStream = null;
                while (entries.hasMoreElements()) {
                    try {
                        ZipEntry nextElement = entries.nextElement();
                        String name = nextElement.getName();
                        if (name == null || !name.contains("../")) {
                            File file2 = new File(str + name);
                            if (nextElement.isDirectory()) {
                                A(file2);
                            } else {
                                if (!file2.getParentFile().exists()) {
                                    A(file2.getParentFile());
                                }
                                r62 = new FileOutputStream(file2);
                                try {
                                    InputStream inputStream2 = zipFile2.getInputStream(nextElement);
                                    try {
                                        byte[] bArr = new byte[8192];
                                        while (true) {
                                            int read = inputStream2.read(bArr);
                                            if (-1 == read) {
                                                break;
                                            }
                                            r62.write(bArr, 0, read);
                                        }
                                        u(r62);
                                        u(inputStream2);
                                        inputStream = inputStream2;
                                        zipFile = r62;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream = inputStream2;
                                        zipFile = zipFile2;
                                        closeable = r62;
                                        if (zipFile != null) {
                                            zipFile.close();
                                        }
                                        u(closeable);
                                        u(inputStream);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r62 = zipFile;
                    }
                }
                zipFile2.close();
                u(zipFile);
                u(inputStream);
                return true;
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                r62 = 0;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            closeable = null;
        }
    }

    private void x() {
        List<SoModule.SoFile> list;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this});
            return;
        }
        File[] listFiles = new File(this.f61797b).listFiles();
        ArrayList arrayList = new ArrayList();
        SoModule soModule = this.f61808m;
        if (soModule != null && (list = soModule.f61833c) != null && list.size() != 0) {
            for (SoModule.SoFile soFile : this.f61808m.f61833c) {
                if (listFiles != null && listFiles.length != 0) {
                    for (File file : listFiles) {
                        if (soFile.soNames.contains(file.getName())) {
                            arrayList.add(file.getName());
                        }
                    }
                } else {
                    return;
                }
            }
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (!arrayList.contains(file2.getName())) {
                        file2.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(SoModule soModule) {
        String str;
        String d12;
        ISurgeon iSurgeon = $surgeonFlag;
        int i12 = 0;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("9", new Object[]{this, soModule})).booleanValue();
        }
        File[] listFiles = new File(this.f61797b).listFiles();
        boolean z12 = true;
        for (SoModule.SoFile soFile : soModule.f61833c) {
            if (listFiles != null && listFiles.length != 0) {
                if (soFile == null || soFile.soNames == null) {
                    break;
                }
                String str2 = "so_md5_check_v2";
                Application application = this.f61796a;
                if (this.f61806k) {
                    str2 = "so_md5_check_v2" + this.f61807l;
                }
                SharedPreferences sharedPreferences = application.getSharedPreferences(str2, i12);
                int length = listFiles.length;
                int i13 = 0;
                while (i13 < length) {
                    File file = listFiles[i13];
                    String str3 = soFile.soNames;
                    if (str3 != null && str3.equals(file.getName()) && (str = soFile.soNames) != null) {
                        String string = sharedPreferences.getString(str, null);
                        if (TextUtils.isEmpty(string)) {
                            n70.c.c("HAR_LOAD_SO", "lastMD5 null ");
                            try {
                                d12 = me.ele.aiot.activityrecognition.nativelib.b.d(file);
                            } catch (FileNotFoundException e12) {
                                n70.c.c("HAR_LOAD_SO", "so md5 " + e12.getMessage());
                            }
                            if (soFile.soMd5.equals(d12)) {
                                sharedPreferences.edit().putString(soFile.soNames, d12).apply();
                                n70.c.c("HAR_LOAD_SO", "so md5 same " + soFile.soNames + "fileMd5 = " + d12);
                            } else {
                                file.delete();
                                n70.c.c("HAR_LOAD_SO", "so md5 not same " + soFile.soNames + "fileMd5 = " + d12);
                                new File(this.f61799d, Uri.parse(soModule.f61836f).getLastPathSegment()).delete();
                                z12 = false;
                            }
                        } else if (!soFile.soMd5.equals(string)) {
                            file.delete();
                            n70.c.c("HAR_LOAD_SO", "so md5 not same " + soFile.soNames);
                            new File(this.f61799d, Uri.parse(soModule.f61836f).getLastPathSegment()).delete();
                            sharedPreferences.edit().putString(soFile.soNames, "").apply();
                            z12 = false;
                        } else {
                            n70.c.c("HAR_LOAD_SO", "so md5 same " + soFile.soNames);
                        }
                    }
                    i13++;
                    i12 = 0;
                }
            } else {
                return true;
            }
        }
        return z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this});
            return;
        }
        synchronized (this.f61804i) {
            this.f61802g = false;
            if (!this.f61804i.isEmpty()) {
                SoModule remove = this.f61804i.remove(0);
                n70.c.c("HAR_LOAD_SO", "下载完成 开始下一个任务 " + remove.f61831a);
                R(remove);
            } else {
                n70.c.c("HAR_LOAD_SO", "下载完成 没有下一个任务 ");
            }
        }
    }

    public SoModule C() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_DUPLICATE_FAIL) ? (SoModule) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_DUPLICATE_FAIL, new Object[]{this}) : this.f61808m;
    }

    public String D() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, AgooConstants.REPORT_NOT_ENCRYPT) ? (String) iSurgeon.surgeon$dispatch(AgooConstants.REPORT_NOT_ENCRYPT, new Object[]{this}) : this.f61797b;
    }

    public void E(Application application) {
        String str;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, application});
            return;
        }
        synchronized (this) {
            if (!this.f61805j) {
                n70.c.c("HAR_LOAD_SO", "so load manager init start");
                this.f61796a = application;
                this.f61803h = new me.ele.td.lib.wrapper.e(Looper.getMainLooper());
                this.f61806k = G(application);
                n70.c.c("HAR_LOAD_SO", "so load manager init start is64Bit =" + this.f61806k);
                if (this.f61806k) {
                    str = "arm64-v8a";
                } else {
                    str = "armeabi-v7a";
                }
                this.f61807l = str;
                n70.c.c("HAR_LOAD_SO", "supportAbi " + this.f61807l);
                if (this.f61806k) {
                    this.f61797b = application.getFilesDir().getAbsolutePath() + "/pytorch-lib/arm64-v8a";
                    this.f61799d = application.getFilesDir().getAbsolutePath() + "/pytorchtmp/arm64-v8a/";
                } else {
                    this.f61797b = application.getFilesDir().getAbsolutePath() + "/pytorch-lib/armeabi-v7a";
                    this.f61799d = application.getFilesDir().getAbsolutePath() + "/pytorchtmp/armeabi-v7a/";
                }
                this.f61798c = application.getFilesDir().getAbsolutePath() + "/pytorch-lib";
                x();
                F();
                this.f61805j = true;
                P();
                n70.c.c("HAR_LOAD_SO", "so load manager init success");
            }
        }
    }

    public boolean K(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        boolean z12 = true;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            return ((Boolean) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str})).booleanValue();
        }
        synchronized (this) {
            if (!this.f61805j) {
                return false;
            }
            synchronized (this.f61801f) {
                if (this.f61801f.get(str) == null || this.f61801f.get(str).intValue() != 1) {
                    z12 = false;
                }
            }
            return z12;
        }
    }

    public boolean N(SoModule soModule) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("6", new Object[]{this, soModule})).booleanValue();
        }
        if (!this.f61805j) {
            E(this.f61796a);
        }
        synchronized (this.f61801f) {
            if (this.f61801f.get(soModule.f61831a) == null) {
                return t(soModule);
            }
            return K(soModule.f61831a);
        }
    }

    public void O(String str, j jVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str, jVar});
            return;
        }
        synchronized (this.f61800e) {
            List<j> list = this.f61800e.get(str);
            if (list != null) {
                list.remove(jVar);
            }
        }
    }

    public void P() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "30")) {
            iSurgeon.surgeon$dispatch("30", new Object[]{this});
            return;
        }
        if (this.f61809n == null) {
            SoModule soModule = new SoModule();
            this.f61809n = soModule;
            soModule.f61831a = "pytorch";
            soModule.f61832b = new ArrayList();
            this.f61809n.f61832b.add("libpytorch_jni.so");
            this.f61809n.f61832b.add("libfbjni.so");
            this.f61809n.f61832b.add("libc++_shared.so");
            this.f61809n.f61833c = new ArrayList();
            if (this.f61806k) {
                SoModule.SoFile soFile = new SoModule.SoFile("libpytorch_jni.so", "94f067a8708bfcac5bd4bc563e3550fc");
                SoModule.SoFile soFile2 = new SoModule.SoFile("libfbjni.so", "77ed0894b56e249e92f7786456f32c0d");
                SoModule.SoFile soFile3 = new SoModule.SoFile("libc++_shared.so", "4cb0208100ef45c4ebe30414ae59c01e");
                this.f61809n.f61833c.add(soFile);
                this.f61809n.f61833c.add(soFile2);
                this.f61809n.f61833c.add(soFile3);
                SoModule soModule2 = this.f61809n;
                soModule2.f61834d = "files/pytorchtmp/arm64-v8a/arm64-v8a.zip";
                soModule2.f61835e = "e942d7a1ff568a4c52f896787223e861";
                soModule2.f61836f = "https://bdi-robot-scheduler-zbprod-zb1-oss-1.oss-cn-zhangjiakou.aliyuncs.com/pytorch/arm64-v8a/arm64-v8a.zip";
            } else {
                SoModule.SoFile soFile4 = new SoModule.SoFile("libpytorch_jni.so", "59183cb534703ad1f0147a7b6dceb12d");
                SoModule.SoFile soFile5 = new SoModule.SoFile("libfbjni.so", "c7db4801c93f0e6fdaf8c51b5658d969");
                SoModule.SoFile soFile6 = new SoModule.SoFile("libc++_shared.so", "572000fe6fa0609fd8080e6a3529832f");
                this.f61809n.f61833c.add(soFile4);
                this.f61809n.f61833c.add(soFile5);
                this.f61809n.f61833c.add(soFile6);
                SoModule soModule3 = this.f61809n;
                soModule3.f61834d = "files/pytorchtmp/armeabi-v7a/armeabi-v7a.zip";
                soModule3.f61835e = "685969f762c30f82cb89514cb0e36b50";
                soModule3.f61836f = "https://bdi-robot-scheduler-zbprod-zb1-oss-1.oss-cn-zhangjiakou.aliyuncs.com/pytorch/armeabi-v7a/armeabi-v7a.zip";
            }
            this.f61808m = this.f61809n;
        }
    }

    public void Q(k kVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "31")) {
            iSurgeon.surgeon$dispatch("31", new Object[]{this, kVar});
            return;
        }
        if (kVar != null && this.f61809n != null) {
            if (!this.f61810o) {
                this.f61809n.c(B().N(this.f61809n));
            }
            if (this.f61809n.a()) {
                kVar.OnSoLoaderSuccess();
                n70.c.c("HAR_LOAD_SO", "startCheckPytorchSo pytorchModule isSoLoadSuccess");
            } else {
                p("pytorch", new g(kVar));
                this.f61810o = true;
                S(this.f61809n);
            }
        }
    }

    public void R(SoModule soModule) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, soModule});
        } else if (!N(soModule)) {
            new a(soModule).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void S(SoModule soModule) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, soModule});
        } else {
            new b(soModule).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void p(String str, j jVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, str, jVar});
            return;
        }
        synchronized (this.f61800e) {
            List<j> list = this.f61800e.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f61800e.put(str, list);
            }
            list.add(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private List<Item> f61828a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f61829b;

        private h() {
            this.f61828a = new ArrayList();
            this.f61829b = new ArrayList();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }
}
