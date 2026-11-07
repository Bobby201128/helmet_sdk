package l80;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.fastjson.JSON;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.google.gson.Gson;
import com.taobao.tao.log.statistics.TLogEventConst;
import i80.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.ele.aiot.kernel.constants.LibConstant;
import me.ele.aiot.kernel.http.KnightSmartDeviceEnv;
import me.ele.aiot.sensor.model.CollectionDataModel;
import me.ele.aiot.sensor.model.TemperatureUploadData;
import me.ele.aiot.sensor.model.XTOPBaseResponse;
import me.ele.aiot.sensor.model.XTOPResultBaseBean;
import me.ele.okhttp.OkHttpFactory;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.h0;
import okhttp3.i0;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class d {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: b, reason: collision with root package name */
    public static volatile HashMap<String, String> f60234b;

    /* renamed from: d, reason: collision with root package name */
    private static e0 f60236d;

    /* renamed from: a, reason: collision with root package name */
    public static KnightSmartDeviceEnv f60233a = KnightSmartDeviceEnv.PRODUCTION;

    /* renamed from: c, reason: collision with root package name */
    private static final d f60235c = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends com.google.gson.reflect.a<HashMap<String, String>> {
        a() {
        }
    }

    /* loaded from: classes4.dex */
    public class b implements okhttp3.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f60238a;

        b(h hVar) {
            this.f60238a = hVar;
        }

        @Override // okhttp3.h
        public void onFailure(okhttp3.g gVar, IOException iOException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, gVar, iOException});
                return;
            }
            d.this.h(this.f60238a, iOException.getMessage());
            j90.c.b("kSD_HTTP", "queryBindDeviceInfo->onFailure:" + iOException.getMessage());
        }

        @Override // okhttp3.h
        public void onResponse(okhttp3.g gVar, i0 i0Var) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, gVar, i0Var});
                return;
            }
            d.this.i(this.f60238a, i0Var);
            j90.c.b("kSD_HTTP", "queryBindDeviceInfo->onResponse:" + i0Var.D() + "，msg:" + i0Var.o0() + ", Requestid:" + i0Var.J("X-Echo-Requestid"));
        }
    }

    /* loaded from: classes4.dex */
    public class c implements okhttp3.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f60240a;

        c(h hVar) {
            this.f60240a = hVar;
        }

        @Override // okhttp3.h
        public void onFailure(okhttp3.g gVar, IOException iOException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, gVar, iOException});
            } else {
                d.this.h(this.f60240a, iOException.getMessage());
            }
        }

        @Override // okhttp3.h
        public void onResponse(okhttp3.g gVar, i0 i0Var) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, gVar, i0Var});
            } else {
                d.this.i(this.f60240a, i0Var);
            }
        }
    }

    /* renamed from: l80.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C1081d implements okhttp3.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l80.e f60242a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gson f60243b;

        /* renamed from: l80.d$d$a */
        /* loaded from: classes4.dex */
        class a extends com.google.gson.reflect.a<XTOPBaseResponse<TemperatureUploadData, Object>> {
            a() {
            }
        }

        C1081d(l80.e eVar, Gson gson) {
            this.f60242a = eVar;
            this.f60243b = gson;
        }

        @Override // okhttp3.h
        public void onFailure(okhttp3.g gVar, IOException iOException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, gVar, iOException});
                return;
            }
            j90.c.b("kSD_HTTP", "uploadTemperature onFailure:" + iOException.getMessage());
            l80.e eVar = this.f60242a;
            if (eVar != null) {
                eVar.onError(iOException.getMessage());
            }
        }

        @Override // okhttp3.h
        public void onResponse(okhttp3.g gVar, i0 i0Var) {
            String string;
            XTOPResultBaseBean result;
            String id2;
            int code;
            String requestId;
            ISurgeon iSurgeon = $surgeonFlag;
            boolean z12 = true;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, gVar, i0Var});
                return;
            }
            try {
                if (i0Var.m() == null) {
                    string = "";
                } else {
                    string = i0Var.m().string();
                }
                j90.c.b("kSD_HTTP", "uploadTemperature->onResponse:" + i0Var.D() + ", RequestId:" + i0Var.J("X-Echo-Requestid") + ", body:" + string);
                XTOPBaseResponse xTOPBaseResponse = (XTOPBaseResponse) this.f60243b.k(string, new a().getType());
                if (xTOPBaseResponse == null) {
                    result = null;
                } else {
                    result = xTOPBaseResponse.getResult();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("uploadTemperature->parsed, outerId=");
                String str = "null";
                if (xTOPBaseResponse == null) {
                    id2 = "null";
                } else {
                    id2 = xTOPBaseResponse.getId();
                }
                sb2.append(id2);
                sb2.append(", outerCode=");
                if (xTOPBaseResponse == null) {
                    code = -1;
                } else {
                    code = xTOPBaseResponse.getCode();
                }
                sb2.append(code);
                sb2.append(", innerRequestId=");
                if (result == null) {
                    requestId = "null";
                } else {
                    requestId = result.getRequestId();
                }
                sb2.append(requestId);
                j90.c.b("kSD_HTTP", sb2.toString());
                if (result != null && result.getCode() == 200) {
                    TemperatureUploadData temperatureUploadData = (TemperatureUploadData) result.getData();
                    if (temperatureUploadData == null || !temperatureUploadData.isValid()) {
                        z12 = false;
                    }
                    l80.e eVar = this.f60242a;
                    if (eVar != null) {
                        eVar.a(z12);
                        return;
                    }
                    return;
                }
                if (result != null && result.getCode() == 401) {
                    LibConstant.f61980a = l80.f.f60252a;
                }
                l80.e eVar2 = this.f60242a;
                if (eVar2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("uploadTemperature biz fail:");
                    if (xTOPBaseResponse != null) {
                        str = xTOPBaseResponse.toString();
                    }
                    sb3.append(str);
                    eVar2.onError(sb3.toString());
                }
            } catch (Throwable th2) {
                j90.c.b("kSD_HTTP", "uploadTemperature parse ex:" + th2);
                l80.e eVar3 = this.f60242a;
                if (eVar3 != null) {
                    eVar3.onError(th2.getMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class e implements okhttp3.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f60246a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gson f60247b;

        e(h hVar, Gson gson) {
            this.f60246a = hVar;
            this.f60247b = gson;
        }

        @Override // okhttp3.h
        public void onFailure(okhttp3.g gVar, IOException iOException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, gVar, iOException});
            } else {
                d.this.h(this.f60246a, iOException.getMessage());
            }
        }

        @Override // okhttp3.h
        public void onResponse(okhttp3.g gVar, i0 i0Var) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, gVar, i0Var});
                return;
            }
            try {
                j90.c.b("kSD_HTTP", "reportDataCollection->onResponse:" + i0Var.D() + ", RequestId:" + i0Var.J("X-Echo-Requestid"));
                XTOPBaseResponse xTOPBaseResponse = (XTOPBaseResponse) this.f60247b.j(i0Var.m().string(), XTOPBaseResponse.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("reportDataCollection xtopBaseResponse:");
                sb2.append(xTOPBaseResponse);
                j90.c.b("kSD_HTTP", sb2.toString());
                if (xTOPBaseResponse != null && xTOPBaseResponse.getCode() == 200 && xTOPBaseResponse.getResult() != null && xTOPBaseResponse.getResult().getCode() == 200) {
                    d.this.i(this.f60246a, i0Var);
                } else if (xTOPBaseResponse != null && xTOPBaseResponse.getCode() == 401) {
                    LibConstant.f61980a = l80.f.f60252a;
                }
            } catch (Throwable th2) {
                d.this.h(this.f60246a, th2.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class f implements okhttp3.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f60249a;

        f(h hVar) {
            this.f60249a = hVar;
        }

        @Override // okhttp3.h
        public void onFailure(okhttp3.g gVar, IOException iOException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, gVar, iOException});
                return;
            }
            j90.c.b("kSD_HTTP", "reportBraceletData onFailure:" + iOException.getMessage());
            d.this.h(this.f60249a, iOException.getMessage());
        }

        @Override // okhttp3.h
        public void onResponse(okhttp3.g gVar, i0 i0Var) {
            String xTOPBaseResponse;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, gVar, i0Var});
                return;
            }
            try {
                j90.c.b("kSD_HTTP", "reportBraceletData->onResponse:" + i0Var.D() + ", RequestId:" + i0Var.J("X-Echo-Requestid"));
                XTOPBaseResponse xTOPBaseResponse2 = (XTOPBaseResponse) new Gson().j(i0Var.m().string(), XTOPBaseResponse.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("reportBraceletData xtopBaseResponse:");
                sb2.append(xTOPBaseResponse2);
                j90.c.b("kSD_HTTP", sb2.toString());
                if (xTOPBaseResponse2 != null && xTOPBaseResponse2.getCode() == 200 && xTOPBaseResponse2.getResult() != null && xTOPBaseResponse2.getResult().getCode() == 200) {
                    d.this.i(this.f60249a, i0Var);
                    return;
                }
                if (xTOPBaseResponse2 != null && xTOPBaseResponse2.getCode() == 401) {
                    LibConstant.f61980a = l80.f.f60252a;
                    d.this.h(this.f60249a, "reportBraceletData token invalid");
                    return;
                }
                d dVar = d.this;
                h hVar = this.f60249a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("reportBraceletData biz fail:");
                if (xTOPBaseResponse2 == null) {
                    xTOPBaseResponse = "null";
                } else {
                    xTOPBaseResponse = xTOPBaseResponse2.toString();
                }
                sb3.append(xTOPBaseResponse);
                dVar.h(hVar, sb3.toString());
            } catch (Throwable th2) {
                j90.c.b("kSD_HTTP", "reportBraceletData throwable:" + th2.getMessage());
                d.this.h(this.f60249a, th2.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class g implements okhttp3.h {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        g() {
        }

        @Override // okhttp3.h
        public void onFailure(okhttp3.g gVar, IOException iOException) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, gVar, iOException});
                return;
            }
            j90.c.b("kSD_HTTP", "reportEvent onFailure:" + iOException.getMessage());
        }

        @Override // okhttp3.h
        public void onResponse(okhttp3.g gVar, i0 i0Var) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, gVar, i0Var});
                return;
            }
            try {
                j90.c.b("kSD_HTTP", "reportEvent onResponse:" + i0Var.D() + ", Requestid:" + i0Var.J("X-Echo-Requestid"));
                XTOPBaseResponse xTOPBaseResponse = (XTOPBaseResponse) new Gson().j(i0Var.m().string(), XTOPBaseResponse.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("reportEvent xtopBaseResponse:");
                sb2.append(xTOPBaseResponse);
                j90.c.b("kSD_HTTP", sb2.toString());
            } catch (Throwable th2) {
                j90.c.b("kSD_HTTP", "report_event_check throwable:" + th2.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface h {
        void a(i0 i0Var);

        void onError(String str);
    }

    static {
        e0.b newClientBuilder = OkHttpFactory.newClientBuilder(true, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f60236d = newClientBuilder.e(15L, timeUnit).r(15L, timeUnit).n(15L, timeUnit).o(true).a(new l80.f()).a(new l80.c()).c();
    }

    private String c() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            return (String) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this});
        }
        return "expectedProductTypeKeys=" + JSON.toJSONString(LibConstant.f61982c);
    }

    private static List<Map<String, Object>> d(List<me.ele.aiot.kernel.temperature.b> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (List) iSurgeon.surgeon$dispatch("9", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (me.ele.aiot.kernel.temperature.b bVar : list) {
            if (bVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("timestamp", Long.valueOf(bVar.a()));
                hashMap.put("temperature", Float.valueOf(bVar.b()));
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public static KnightSmartDeviceEnv e() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (KnightSmartDeviceEnv) iSurgeon.surgeon$dispatch("4", new Object[0]) : f60233a;
    }

    public static d g() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (d) iSurgeon.surgeon$dispatch("1", new Object[0]) : f60235c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(h hVar, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "14")) {
            iSurgeon.surgeon$dispatch("14", new Object[]{this, hVar, str});
        } else if (hVar != null) {
            hVar.onError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(h hVar, i0 i0Var) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "15")) {
            iSurgeon.surgeon$dispatch("15", new Object[]{this, hVar, i0Var});
        } else if (hVar != null) {
            hVar.a(i0Var);
        }
    }

    public e0 f() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (e0) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : f60236d;
    }

    public void j(h hVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, hVar});
            return;
        }
        try {
            g0.a k12 = new g0.a().k(f60233a.getDomainName() + "/bdi.boxmanager/v2/iot/device/query_iot_device_bind?" + c());
            j90.c.b("kSD_HTTP", "url:" + f60233a.getDomainName() + "/bdi.boxmanager/v2/iot/device/query_iot_device_bind?" + c());
            f60236d.a(k12.b()).r0(new b(hVar));
        } catch (Exception e12) {
            h(hVar, e12.getMessage());
            j90.c.b("kSD_HTTP", "queryBindDeviceInfo message  fail :" + e12.toString());
        }
    }

    public void k(h hVar, String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, hVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("deviceCode", str);
            hashMap2.put("request", hashMap3);
            hashMap.put("params", hashMap2);
            String t12 = new Gson().t(hashMap);
            g0.a g12 = new g0.a().k(f60233a.getDomainName() + "/xtop/xtop.boxmanager.iotDeviceBaseManage.queryIotDeviceConfigV2/1.0").g(h0.create(c0.d("application/json;charset=UTF-8"), t12));
            j90.c.b("kSD_HTTP", "queryIotDeviceConfig->json:" + t12);
            j90.c.b("kSD_HTTP", "url:" + f60233a.getDomainName() + "/xtop/xtop.boxmanager.iotDeviceBaseManage.queryIotDeviceConfigV2/1.0queryIotDeviceConfig->json:" + t12);
            f60236d.a(g12.b()).r0(new c(hVar));
        } catch (Exception e12) {
            h(hVar, e12.getMessage());
            j90.c.b("kSD_HTTP", "queryIotDeviceConfig message  fail :" + e12.toString());
        }
    }

    public void l(String str, String str2, String str3, h hVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "12")) {
            iSurgeon.surgeon$dispatch("12", new Object[]{this, str, str2, str3, hVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("knightId", str);
            if (str2 == null) {
                str2 = "";
            }
            hashMap3.put("deviceCode", str2);
            if (str3 == null) {
                str3 = "";
            }
            hashMap3.put("data", str3);
            hashMap2.put("request", hashMap3);
            hashMap.put("params", hashMap2);
            String t12 = new Gson().t(hashMap);
            g0.a g12 = new g0.a().k(f60233a.getDomainName() + "/xtop/xtop.boxmanager.knight.bracelet.dataReport/1.0").g(h0.create(c0.d("application/json;charset=UTF-8"), t12));
            j90.c.b("kSD_HTTP", "reportBraceletData url:" + f60233a.getDomainName() + "/xtop/xtop.boxmanager.knight.bracelet.dataReport/1.0,json:" + t12);
            f60236d.a(g12.b()).r0(new f(hVar));
        } catch (Exception e12) {
            j90.c.b("kSD_HTTP", "reportBraceletData message fail :" + e12.toString());
            h(hVar, e12.getMessage());
        }
    }

    public void m(CollectionDataModel collectionDataModel, h hVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "11")) {
            iSurgeon.surgeon$dispatch("11", new Object[]{this, collectionDataModel, hVar});
            return;
        }
        if (TextUtils.equals(LibConstant.f61980a, l80.f.f60252a)) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("request", collectionDataModel);
        hashMap.put("params", hashMap2);
        Gson gson = new Gson();
        String t12 = gson.t(hashMap);
        j90.c.b("kSD_HTTP", "reportDataCollection->json:" + t12);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("data", t12);
        k90.b.a("bluetooth_data", hashMap3);
        f60236d.a(new g0.a().k(f60233a.getDomainName() + "/xtop/xtop.aiot.lab.beacon.helmet.uploadHelmetDataCollectionV2/1.0").g(h0.create(c0.d("application/json;charset=UTF-8"), t12)).b()).r0(new e(hVar, gson));
    }

    public void n(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "13")) {
            iSurgeon.surgeon$dispatch("13", new Object[]{this, str});
            return;
        }
        g0.a g12 = new g0.a().k(e().getDomainName() + "/xtop/xtop.aiot.lab.beacon.knight.device.report.event/1.0").g(h0.create(c0.d("application/json;charset=UTF-8"), str));
        j90.c.b("kSD_HTTP", "reportEvent url:" + e().getDomainName() + "/xtop/xtop.aiot.lab.beacon.knight.device.report.event/1.0report_event_check->json:" + str);
        g().f().a(g12.b()).r0(new g());
    }

    public void o(KnightSmartDeviceEnv knightSmartDeviceEnv) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, knightSmartDeviceEnv});
            return;
        }
        if (knightSmartDeviceEnv == null) {
            return;
        }
        f60233a = knightSmartDeviceEnv;
        if (knightSmartDeviceEnv != KnightSmartDeviceEnv.PRODUCTION) {
            try {
                String string = j.f54967b.getSharedPreferences("shared_prefs_bighelper", 0).getString("BG_HEADER", "");
                j90.c.b(RPCDataItems.SWITCH_TAG_LOG, "BG_HEADER : " + string);
                if (!TextUtils.isEmpty(string)) {
                    f60234b = (HashMap) new Gson().k(string, new a().getType());
                }
            } catch (Exception e12) {
                j90.c.b(RPCDataItems.SWITCH_TAG_LOG, "BG_HEADER exception:" + e12.getMessage());
            }
        }
    }

    public void p(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, str});
            return;
        }
        j90.c.a("setHttpToken token = " + str);
        l80.f.f60252a = str;
    }

    public void q(long j12, String str, String str2, int i12, List<me.ele.aiot.kernel.temperature.b> list, l80.e eVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Long.valueOf(j12), str, str2, Integer.valueOf(i12), list, eVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("knightId", Long.valueOf(j12));
            if (str == null) {
                str = "";
            }
            hashMap3.put("deviceCode", str);
            if (str2 == null) {
                str2 = "";
            }
            hashMap3.put("trackingId", str2);
            hashMap3.put(TLogEventConst.PARAM_UPLOAD_STAGE, Integer.valueOf(i12));
            hashMap3.put("temperatureList", d(list));
            hashMap2.put("request", hashMap3);
            hashMap.put("params", hashMap2);
            Gson gson = new Gson();
            String t12 = gson.t(hashMap);
            g0.a g12 = new g0.a().k(f60233a.getDomainName() + "/xtop/xtop.boxmanager.knightdeviceconfig.temperatureValidQuery.uploadAndValidateTemperature/1.0").g(h0.create(c0.d("application/json;charset=UTF-8"), t12));
            j90.c.b("kSD_HTTP", "url:" + f60233a.getDomainName() + "/xtop/xtop.boxmanager.knightdeviceconfig.temperatureValidQuery.uploadAndValidateTemperature/1.0uploadTemperature->json:" + t12);
            f60236d.a(g12.b()).r0(new C1081d(eVar, gson));
        } catch (Exception e12) {
            j90.c.b("kSD_HTTP", "uploadTemperature message fail :" + e12.toString());
            if (eVar != null) {
                eVar.onError(e12.getMessage());
            }
        }
    }
}
