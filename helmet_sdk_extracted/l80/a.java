package l80;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import me.ele.aiot.kernel.bean.AsrTaskResultDTO;
import me.ele.aiot.kernel.bean.AudioTranscribeDTO;
import me.ele.hunter.battery.metrics.network.okhttp.OkHttpAspect;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.g;
import okhttp3.g0;
import okhttp3.h;
import okhttp3.h0;
import okhttp3.i0;
import org.aspectj.lang.a;

/* loaded from: classes4.dex */
public class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private static final c0 f60226a;

    /* renamed from: b, reason: collision with root package name */
    private static final Gson f60227b;

    /* renamed from: c, reason: collision with root package name */
    private static final e0 f60228c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC1573a f60229d = null;

    /* renamed from: l80.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C1079a implements h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f60230a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f60231b;

        /* renamed from: l80.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C1080a extends com.google.gson.reflect.a<HashMap<String, Object>> {
            C1080a() {
            }
        }

        C1079a(File file, b bVar) {
            this.f60230a = file;
            this.f60231b = bVar;
        }

        @Override // okhttp3.h
        public void onFailure(g gVar, IOException iOException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, gVar, iOException});
                return;
            }
            j90.c.b("AudioTranscribeService", "submitAudioTranscribe onFailure: " + iOException.getMessage());
            a.h(this.f60230a, this.f60231b, "SYS_ASR_CALL_FAILED", "ASR 服务调用异常: " + iOException.getMessage());
        }

        @Override // okhttp3.h
        public void onResponse(g gVar, i0 i0Var) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, gVar, i0Var});
                return;
            }
            try {
                if (i0Var.m() != null) {
                    str = i0Var.m().string();
                } else {
                    str = "";
                }
                j90.c.b("AudioTranscribeService", "submitAudioTranscribe onResponse: code=" + i0Var.D() + ", body=" + str);
                if (!i0Var.b0()) {
                    a.h(this.f60230a, this.f60231b, "SYS_ASR_CALL_FAILED", "HTTP 请求失败: " + i0Var.D());
                    return;
                }
                HashMap hashMap = (HashMap) a.f60227b.k(str, new C1080a().getType());
                if (hashMap == null) {
                    a.h(this.f60230a, this.f60231b, "SYS_ASR_CALL_FAILED", "响应解析失败");
                    return;
                }
                Object obj = hashMap.get("code");
                if (a.j(obj) != 200) {
                    if (hashMap.get("error") != null) {
                        str5 = String.valueOf(hashMap.get("error"));
                    } else {
                        str5 = "接口返回失败,顶层code=" + obj;
                    }
                    a.h(this.f60230a, this.f60231b, "SYS_ASR_CALL_FAILED", str5);
                    return;
                }
                Object obj2 = hashMap.get("result");
                if (!(obj2 instanceof Map)) {
                    a.h(this.f60230a, this.f60231b, "SYS_ASR_CALL_FAILED", "接口返回失败,result为空");
                    return;
                }
                Map map = (Map) obj2;
                Object obj3 = map.get("code");
                if (a.j(obj3) != 200) {
                    if (map.get("message") != null) {
                        str4 = String.valueOf(map.get("message"));
                    } else if (hashMap.get("error") != null) {
                        str4 = String.valueOf(hashMap.get("error"));
                    } else {
                        str4 = "业务失败,code=" + obj3;
                    }
                    a.h(this.f60230a, this.f60231b, "SYS_ASR_CALL_FAILED", str4);
                    return;
                }
                AsrTaskResultDTO asrTaskResultDTO = new AsrTaskResultDTO();
                String str6 = null;
                if (obj3 != null) {
                    str2 = String.valueOf(obj3);
                } else {
                    str2 = null;
                }
                asrTaskResultDTO.setCode(str2);
                if (map.get("requestId") != null) {
                    str3 = String.valueOf(map.get("requestId"));
                } else {
                    str3 = null;
                }
                asrTaskResultDTO.setRequestId(str3);
                if (map.get("traceId") != null) {
                    str6 = String.valueOf(map.get("traceId"));
                }
                asrTaskResultDTO.setTraceId(str6);
                j90.c.b("AudioTranscribeService", "submitAudioTranscribe success: " + asrTaskResultDTO);
                a.i(this.f60230a, this.f60231b, asrTaskResultDTO);
            } catch (Exception e12) {
                j90.c.b("AudioTranscribeService", "submitAudioTranscribe parse error: " + e12.getMessage());
                a.h(this.f60230a, this.f60231b, "SYS_ASR_CALL_FAILED", "响应解析异常: " + e12.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(AsrTaskResultDTO asrTaskResultDTO);

        void onError(String str, String str2);
    }

    static {
        e();
        f60226a = c0.d("application/json;charset=UTF-8");
        f60227b = new Gson();
        e0 f12 = d.g().f();
        e0.b bVar = (e0.b) OkHttpAspect.aspectOf().hookNewBuilder(new l80.b(new Object[]{f12, jl1.c.d(f60229d, null, f12)}).linkClosureAndJoinPoint(16));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f60228c = bVar.e(15L, timeUnit).r(30L, timeUnit).n(120L, timeUnit).c();
    }

    private static /* synthetic */ void e() {
        jl1.c cVar = new jl1.c("AudioTranscribeService.java", a.class);
        f60229d = cVar.i("method-call", cVar.h("1", "newBuilder", "okhttp3.OkHttpClient", "", "", "", "okhttp3.OkHttpClient$Builder"), 81);
    }

    private static void f(File file) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{file});
            return;
        }
        if (file == null) {
            return;
        }
        try {
            if (!file.exists()) {
                return;
            }
            j90.c.b("AudioTranscribeService", "deleteAudioFileSafely path=" + file.getAbsolutePath() + ", deleted=" + file.delete());
        } catch (Exception e12) {
            j90.c.b("AudioTranscribeService", "deleteAudioFileSafely exception: " + e12.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(File file, b bVar, String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{file, bVar, str, str2});
            return;
        }
        j90.c.b("AudioTranscribeService", "submitAudioTranscribe error: " + str + " - " + str2);
        f(file);
        if (bVar != null) {
            bVar.onError(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(File file, b bVar, AsrTaskResultDTO asrTaskResultDTO) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{file, bVar, asrTaskResultDTO});
            return;
        }
        f(file);
        if (bVar != null) {
            bVar.a(asrTaskResultDTO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{obj})).intValue();
        }
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(String.valueOf(obj).trim());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static byte[] k(File file) throws IOException {
        ISurgeon iSurgeon = $surgeonFlag;
        int i12 = 0;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (byte[]) iSurgeon.surgeon$dispatch("2", new Object[]{file});
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            while (length > 0) {
                int read = fileInputStream.read(bArr, i12, length);
                if (read == -1) {
                    break;
                }
                i12 += read;
                length -= read;
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public static void l(File file, String str, String str2, String str3, long j12, int i12, b bVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{file, str, str2, str3, Long.valueOf(j12), Integer.valueOf(i12), bVar});
            return;
        }
        if (file != null && file.exists()) {
            if (file.length() == 0) {
                h(file, bVar, "BIZ_AUDIO_DATA_EMPTY", "音频数据不能为空");
                return;
            }
            try {
                String encodeToString = Base64.getEncoder().encodeToString(k(file));
                AudioTranscribeDTO audioTranscribeDTO = new AudioTranscribeDTO();
                audioTranscribeDTO.setKnightId(str);
                audioTranscribeDTO.setRequestId(UUID.randomUUID().toString());
                audioTranscribeDTO.setAudioData(encodeToString);
                audioTranscribeDTO.setAsrType(str2);
                audioTranscribeDTO.setFileType(str3);
                audioTranscribeDTO.setFileLength(Long.valueOf(file.length()));
                audioTranscribeDTO.setTime(String.valueOf(System.currentTimeMillis()));
                audioTranscribeDTO.setTrackingId(Long.valueOf(j12));
                audioTranscribeDTO.setContactType(Integer.valueOf(i12));
                HashMap hashMap = new HashMap();
                hashMap.put("request", audioTranscribeDTO);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("params", hashMap);
                String t12 = f60227b.t(hashMap2);
                j90.c.b("AudioTranscribeService", "submitAudioTranscribe json:" + t12);
                String str4 = d.e().getDomainName() + "/xtop/xtop.aiot.xiaoZhi.submitAudioTranscribe/1.0";
                j90.c.b("AudioTranscribeService", "submitAudioTranscribe url=" + str4);
                f60228c.a(new g0.a().k(str4).g(h0.create(f60226a, t12)).b()).r0(new C1079a(file, bVar));
                return;
            } catch (Exception e12) {
                j90.c.b("AudioTranscribeService", "submitAudioTranscribe exception: " + e12.getMessage());
                h(file, bVar, "SYS_ASR_CALL_FAILED", "提交转写任务异常: " + e12.getMessage());
                return;
            }
        }
        h(null, bVar, "BIZ_AUDIO_DATA_EMPTY", "音频文件不存在");
    }
}
