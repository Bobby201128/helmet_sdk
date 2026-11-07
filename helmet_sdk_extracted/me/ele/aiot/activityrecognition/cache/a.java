package me.ele.aiot.activityrecognition.cache;

import android.text.TextUtils;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.File;
import java.io.IOException;
import okhttp3.e0;
import okhttp3.g;
import okhttp3.g0;
import okhttp3.h;

/* loaded from: classes4.dex */
public class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: me.ele.aiot.activityrecognition.cache.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C1133a implements h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f61784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f61785b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61786c;

        C1133a(b bVar, File file, Object obj) {
            this.f61784a = bVar;
            this.f61785b = file;
            this.f61786c = obj;
        }

        @Override // okhttp3.h
        public void onFailure(g gVar, IOException iOException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, gVar, iOException});
                return;
            }
            b bVar = this.f61784a;
            if (bVar != null) {
                bVar.onFailure(iOException);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // okhttp3.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onResponse(okhttp3.g r17, okhttp3.i0 r18) throws java.io.IOException {
            /*
                r16 = this;
                r1 = r16
                com.alibaba.surgeon.bridge.ISurgeon r0 = me.ele.aiot.activityrecognition.cache.a.C1133a.$surgeonFlag
                java.lang.String r2 = "2"
                boolean r3 = com.alibaba.surgeon.instrument.InstrumentAPI.support(r0, r2)
                r4 = 0
                if (r3 == 0) goto L1c
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r4] = r1
                r4 = 1
                r3[r4] = r17
                r4 = 2
                r3[r4] = r18
                r0.surgeon$dispatch(r2, r3)
                return
            L1c:
                r0 = 2048(0x800, float:2.87E-42)
                byte[] r0 = new byte[r0]
                r2 = 0
                okhttp3.j0 r3 = r18.m()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L82
                java.io.InputStream r3 = r3.byteStream()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L82
                okhttp3.j0 r5 = r18.m()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                long r12 = r5.contentLength()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                java.io.File r6 = r1.f61785b     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                r6 = 0
            L3a:
                int r2 = r3.read(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                r8 = -1
                if (r2 == r8) goto L5e
                r5.write(r0, r4, r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                long r8 = (long) r2     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                long r14 = r6 + r8
                float r2 = (float) r14     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                r6 = 1065353216(0x3f800000, float:1.0)
                float r2 = r2 * r6
                float r6 = (float) r12     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                float r2 = r2 / r6
                r6 = 1120403456(0x42c80000, float:100.0)
                float r2 = r2 * r6
                int r11 = (int) r2     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                me.ele.aiot.activityrecognition.cache.a$b r6 = r1.f61784a     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                if (r6 == 0) goto L5c
                r7 = r14
                r9 = r12
                r6.onProgress(r7, r9, r11)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            L5c:
                r6 = r14
                goto L3a
            L5e:
                r5.flush()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                me.ele.aiot.activityrecognition.cache.a$b r0 = r1.f61784a     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                if (r0 == 0) goto L6c
                java.lang.Object r2 = r1.f61786c     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                java.io.File r4 = r1.f61785b     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                r0.onSuccess(r2, r4)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            L6c:
                r3.close()     // Catch: java.io.IOException -> L6f
            L6f:
                r5.close()     // Catch: java.io.IOException -> L95
                goto L95
            L73:
                r0 = move-exception
                goto L79
            L75:
                r0 = move-exception
                goto L7d
            L77:
                r0 = move-exception
                r5 = r2
            L79:
                r2 = r3
                goto L97
            L7b:
                r0 = move-exception
                r5 = r2
            L7d:
                r2 = r3
                goto L84
            L7f:
                r0 = move-exception
                r5 = r2
                goto L97
            L82:
                r0 = move-exception
                r5 = r2
            L84:
                me.ele.aiot.activityrecognition.cache.a$b r3 = r1.f61784a     // Catch: java.lang.Throwable -> L96
                if (r3 == 0) goto L8b
                r3.onFailure(r0)     // Catch: java.lang.Throwable -> L96
            L8b:
                if (r2 == 0) goto L92
                r2.close()     // Catch: java.io.IOException -> L91
                goto L92
            L91:
            L92:
                if (r5 == 0) goto L95
                goto L6f
            L95:
                return
            L96:
                r0 = move-exception
            L97:
                if (r2 == 0) goto L9e
                r2.close()     // Catch: java.io.IOException -> L9d
                goto L9e
            L9d:
            L9e:
                if (r5 == 0) goto La3
                r5.close()     // Catch: java.io.IOException -> La3
            La3:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: me.ele.aiot.activityrecognition.cache.a.C1133a.onResponse(okhttp3.g, okhttp3.i0):void");
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void onFailure(Throwable th2);

        void onProgress(long j12, long j13, int i12);

        void onSuccess(Object obj, File file);
    }

    public static void a(String str, File file, Object obj, b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{str, file, obj, bVar});
        } else if (!TextUtils.isEmpty(str) && file != null) {
            new e0().a(new g0.a().k(str).b()).r0(new C1133a(bVar, file, obj));
        }
    }
}
