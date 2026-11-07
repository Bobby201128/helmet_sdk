package me.ele.aiot.activityrecognition.nativelib;

import android.annotation.TargetApi;
import android.os.Build;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.alipay.mobile.jsengine.NativeLibs;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.r.o.x.y.PrivacyApi;

/* loaded from: classes4.dex */
public class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private static final String f61839a = a.class.getSimpleName() + "-duqian";

    /* renamed from: b, reason: collision with root package name */
    private static File f61840b = null;

    /* renamed from: me.ele.aiot.activityrecognition.nativelib.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C1134a {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) throws Throwable {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{classLoader, file});
            } else {
                me.ele.aiot.activityrecognition.nativelib.c.a(me.ele.aiot.activityrecognition.nativelib.c.b(classLoader, NativeLibs.FIELD_PATH_LIST).get(classLoader), NativeLibs.FIELD_NATIVE_LIBRARY_DIRECTORIES, new File[]{file});
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) throws Throwable {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{classLoader, file});
                return;
            }
            Object obj = me.ele.aiot.activityrecognition.nativelib.c.b(classLoader, NativeLibs.FIELD_PATH_LIST).get(classLoader);
            List list = (List) me.ele.aiot.activityrecognition.nativelib.c.b(obj, NativeLibs.FIELD_NATIVE_LIBRARY_DIRECTORIES).get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (file.equals((File) it.next()) || file.equals(a.f61840b)) {
                    it.remove();
                    n70.c.c("HAR_LOAD_SO", "dq libDirIt.remove() " + file.getAbsolutePath());
                    break;
                }
            }
            list.add(file);
            List list2 = (List) me.ele.aiot.activityrecognition.nativelib.c.b(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            n70.c.c("HAR_LOAD_SO", "dq systemLibDirs,size=" + list2.size());
            Method c12 = me.ele.aiot.activityrecognition.nativelib.c.c(obj, NativeLibs.METHOD_MAKE_PATH_ELEMENTS, List.class, File.class, List.class);
            ArrayList arrayList = new ArrayList();
            list.addAll(list2);
            Object[] objArr = (Object[]) PrivacyApi.invoke(c12, obj, list, null, arrayList);
            Field b12 = me.ele.aiot.activityrecognition.nativelib.c.b(obj, NativeLibs.FIELD_NATIVE_LIBRARY_PATH_ELEMENTS);
            b12.setAccessible(true);
            b12.set(obj, objArr);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) throws Throwable {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{classLoader, file});
                return;
            }
            Object obj = me.ele.aiot.activityrecognition.nativelib.c.b(classLoader, NativeLibs.FIELD_PATH_LIST).get(classLoader);
            List list = (List) me.ele.aiot.activityrecognition.nativelib.c.b(obj, NativeLibs.FIELD_NATIVE_LIBRARY_DIRECTORIES).get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (file.equals((File) it.next()) || file.equals(a.f61840b)) {
                    it.remove();
                    n70.c.c("HAR_LOAD_SO", "dq libDirIt.remove()" + file.getAbsolutePath());
                    break;
                }
            }
            list.add(file);
            List list2 = (List) me.ele.aiot.activityrecognition.nativelib.c.b(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            n70.c.c("HAR_LOAD_SO", "dq systemLibDirs,size=" + list2.size());
            Method c12 = me.ele.aiot.activityrecognition.nativelib.c.c(obj, NativeLibs.METHOD_MAKE_PATH_ELEMENTS, List.class);
            list.addAll(list2);
            Object[] objArr = (Object[]) PrivacyApi.invoke(c12, obj, list);
            Field b12 = me.ele.aiot.activityrecognition.nativelib.c.b(obj, NativeLibs.FIELD_NATIVE_LIBRARY_PATH_ELEMENTS);
            b12.setAccessible(true);
            b12.set(obj, objArr);
        }
    }

    @TargetApi(23)
    private static int b() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return ((Integer) iSurgeon.surgeon$dispatch("3", new Object[0])).intValue();
        }
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static synchronized boolean c(ClassLoader classLoader, File file) throws Throwable {
        synchronized (a.class) {
            ISurgeon iSurgeon = $surgeonFlag;
            boolean z12 = false;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                return ((Boolean) iSurgeon.surgeon$dispatch("2", new Object[]{classLoader, file})).booleanValue();
            }
            if (classLoader != null && file != null && file.exists()) {
                int i12 = Build.VERSION.SDK_INT;
                if ((i12 == 25 && b() != 0) || i12 > 25) {
                    z12 = true;
                }
                if (z12) {
                    try {
                        try {
                            c.b(classLoader, file);
                        } catch (Throwable unused) {
                            b.b(classLoader, file);
                        }
                    } catch (Throwable unused2) {
                        C1134a.b(classLoader, file);
                    }
                    f61840b = file;
                    return true;
                }
                if (i12 >= 23) {
                    try {
                        b.b(classLoader, file);
                    } catch (Throwable unused3) {
                        C1134a.b(classLoader, file);
                    }
                } else {
                    C1134a.b(classLoader, file);
                }
                f61840b = file;
                return true;
            }
            n70.c.c("HAR_LOAD_SO", "classLoader or folder is illegal " + file);
            return false;
        }
    }

    public static synchronized boolean d(ClassLoader classLoader, String str) throws Throwable {
        synchronized (a.class) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{classLoader, str})).booleanValue();
            }
            return c(classLoader, new File(str));
        }
    }
}
