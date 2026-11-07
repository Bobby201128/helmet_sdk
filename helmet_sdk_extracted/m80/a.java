package m80;

import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.taobao.tao.log.statistics.TLogEventConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import me.ele.aiot.kernel.http.ota.net.model.CheckOTAProcessRequest;
import me.ele.aiot.kernel.http.ota.net.model.CheckOTAProcessResponse;
import me.ele.aiot.kernel.http.ota.net.model.CheckOTAVersionRequest;
import me.ele.aiot.kernel.http.ota.net.model.CheckOTAVersionResponse;
import org.android.agoo.common.AgooConstants;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes4.dex */
public class a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f61464g;

    /* renamed from: b, reason: collision with root package name */
    private n80.a f61466b;

    /* renamed from: c, reason: collision with root package name */
    private CheckOTAVersionRequest f61467c;

    /* renamed from: d, reason: collision with root package name */
    private List<CheckOTAVersionResponse.OTAUpgrageVersionInfo> f61468d;

    /* renamed from: f, reason: collision with root package name */
    private m80.b f61470f;

    /* renamed from: a, reason: collision with root package name */
    private n80.b f61465a = new n80.b();

    /* renamed from: e, reason: collision with root package name */
    private boolean f61469e = false;

    /* renamed from: m80.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C1122a implements Callback<CheckOTAVersionResponse> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        C1122a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<CheckOTAVersionResponse> call, Throwable th2) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, call, th2});
                return;
            }
            j90.c.e("checkOTAVersion onFailure->" + th2.getMessage());
            a.this.i(3);
            a.this.f61469e = false;
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<CheckOTAVersionResponse> call, Response<CheckOTAVersionResponse> response) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, call, response});
                return;
            }
            if (response != null && response.isSuccessful()) {
                CheckOTAVersionResponse body = response.body();
                if (body != null) {
                    j90.c.e("checkOTAVersion CheckOTAVersionResponse:" + body);
                    if (body.getCode() == 200) {
                        a.this.f61468d = body.getOTAdata();
                        if (a.this.f61468d != null && a.this.f61468d.size() > 0 && a.this.f61468d.get(0) != null) {
                            a aVar = a.this;
                            aVar.k((CheckOTAVersionResponse.OTAUpgrageVersionInfo) aVar.f61468d.get(0));
                        } else {
                            a.this.l();
                        }
                    } else {
                        a.this.i(body.getCode());
                    }
                } else {
                    a.this.i(2);
                }
            } else {
                a.this.i(2);
            }
            a.this.f61469e = false;
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Callback<CheckOTAProcessResponse> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<CheckOTAProcessResponse> call, Throwable th2) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, call, th2});
                return;
            }
            j90.c.b("kSD_HTTP", "report_upgrade_process check: CheckOTAProcessResponse onFailure" + th2.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<CheckOTAProcessResponse> call, Response<CheckOTAProcessResponse> response) {
            CheckOTAProcessResponse body;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, call, response});
                return;
            }
            j90.c.b("kSD_HTTP", "report_upgrade_process:" + response);
            if (response.isSuccessful() && (body = response.body()) != null) {
                j90.c.b("kSD_HTTP", "report_upgrade_process" + body);
                if (body.getCode() == 200) {
                    j90.c.b("kSD_HTTP", "report_upgrade_process b SUCCESS");
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class c implements Callback<CheckOTAProcessResponse> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<CheckOTAProcessResponse> call, Throwable th2) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, call, th2});
                return;
            }
            j90.c.b("kSD_HTTP", "otaUpgrade check: reportAppDownFail onFailure" + th2.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<CheckOTAProcessResponse> call, Response<CheckOTAProcessResponse> response) {
            CheckOTAProcessResponse body;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, call, response});
                return;
            }
            j90.c.b("kSD_HTTP", "reportAppDownFail:" + response);
            if (response.isSuccessful() && (body = response.body()) != null) {
                j90.c.b("kSD_HTTP", "reportAppDownFail:" + body.toString());
                if (body.getCode() == 200) {
                    j90.c.b("kSD_HTTP", "reportAppDownFail:OTAUpgrade b SUCCESS");
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d implements Callback<CheckOTAProcessResponse> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        d() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<CheckOTAProcessResponse> call, Throwable th2) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, call, th2});
                return;
            }
            j90.c.b("kSD_HTTP", " reportOTAProcess onFailure" + th2.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<CheckOTAProcessResponse> call, Response<CheckOTAProcessResponse> response) {
            CheckOTAProcessResponse body;
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, call, response});
                return;
            }
            j90.c.b("kSD_HTTP", "reportOTAProcess" + response);
            if (response.isSuccessful() && (body = response.body()) != null) {
                j90.c.b("kSD_HTTP", "reportOTAProcess" + body);
                if (body.getCode() == 200) {
                    j90.c.b("kSD_HTTP", "reportOTAProcess OTAUpgrade b SUCCESS");
                }
            }
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            iSurgeon.surgeon$dispatch("7", new Object[]{this, Integer.valueOf(i12)});
            return;
        }
        m80.b bVar = this.f61470f;
        if (bVar != null) {
            bVar.onFailure(i12);
        }
        this.f61469e = false;
    }

    public static a j() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (a) iSurgeon.surgeon$dispatch("1", new Object[0]);
        }
        if (f61464g == null) {
            synchronized (a.class) {
                if (f61464g == null) {
                    f61464g = new a();
                }
            }
        }
        return f61464g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(@NonNull CheckOTAVersionResponse.OTAUpgrageVersionInfo oTAUpgrageVersionInfo) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, oTAUpgrageVersionInfo});
            return;
        }
        m80.b bVar = this.f61470f;
        if (bVar != null) {
            bVar.a(oTAUpgrageVersionInfo);
        }
        this.f61469e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this});
            return;
        }
        m80.b bVar = this.f61470f;
        if (bVar != null) {
            bVar.onNoNewVersion();
        }
        this.f61469e = false;
    }

    public synchronized a g(m80.b bVar, int i12, int i13, String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (a) iSurgeon.surgeon$dispatch("4", new Object[]{this, bVar, Integer.valueOf(i12), Integer.valueOf(i13), str, str2});
        }
        if (this.f61469e) {
            j90.c.e("check->isChecking");
            if (bVar != null) {
                j90.c.e("upgrageListener != null");
                i(1);
            }
            return this;
        }
        this.f61469e = true;
        j90.c.e("check->isNotChecking");
        if (this.f61467c == null) {
            j90.c.e("check->this.checkOTAVersionRequest == null");
            this.f61467c = new CheckOTAVersionRequest();
        }
        this.f61470f = bVar;
        this.f61467c.setRequestId(UUID.randomUUID().toString());
        this.f61467c.setTimestamp(String.valueOf(rf1.c.v()));
        this.f61467c.setOsType("android");
        this.f61467c.setProductKey(str);
        this.f61467c.setProductTypeKey(str2);
        this.f61467c.setSize("");
        this.f61467c.setSelfDeveloped(Integer.toString(i12));
        this.f61467c.setCityId(i13);
        j90.c.e("checkOTAVersionRequest:" + this.f61467c.toString());
        o80.b.b().b(this.f61467c).enqueue(new C1122a());
        return this;
    }

    public void h(@NonNull CheckOTAVersionResponse.OTAUpgrageVersionInfo oTAUpgrageVersionInfo, n80.a aVar) {
        long fileSize;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, oTAUpgrageVersionInfo, aVar});
            return;
        }
        if (oTAUpgrageVersionInfo != null) {
            this.f61466b = aVar;
            n80.b bVar = this.f61465a;
            String url = oTAUpgrageVersionInfo.getUrl();
            if (oTAUpgrageVersionInfo.getFileSize() == 0) {
                fileSize = 100;
            } else {
                fileSize = oTAUpgrageVersionInfo.getFileSize();
            }
            bVar.d(url, fileSize, aVar);
        }
    }

    public synchronized a m(String str, String str2, String str3, String str4) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "9")) {
            return (a) iSurgeon.surgeon$dispatch("9", new Object[]{this, str, str2, str3, str4});
        }
        CheckOTAProcessRequest checkOTAProcessRequest = new CheckOTAProcessRequest();
        checkOTAProcessRequest.setDeviceCode(str);
        checkOTAProcessRequest.setRequestId(UUID.randomUUID().toString());
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put("modelType", str4);
        List<CheckOTAVersionResponse.OTAUpgrageVersionInfo> list = this.f61468d;
        if (list != null && list.get(0) != null) {
            hashMap.put("upgradeOtaRecordId", this.f61468d.get(0).getUpgradeOtaRecordId());
            hashMap.put("version", this.f61468d.get(0).getVersion());
        }
        hashMap.put("upgradeOtaRecordStatus", "FAILED");
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(TLogEventConst.PARAM_UPLOAD_STAGE, "downloadToApp");
        hashMap2.put("stageTime", str2);
        hashMap2.put(RVParams.PROGRESS, "30");
        arrayList2.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(TLogEventConst.PARAM_UPLOAD_STAGE, "downloadToAppFail");
        hashMap3.put("stageTime", str3);
        hashMap3.put(RVParams.PROGRESS, "30");
        arrayList2.add(hashMap3);
        hashMap.put("detailParams", arrayList2);
        arrayList.add(hashMap);
        checkOTAProcessRequest.setRecordParams(arrayList);
        j90.c.b("kSD_HTTP", "reportAppDownFail" + checkOTAProcessRequest);
        o80.b.b().a(checkOTAProcessRequest).enqueue(new c());
        return this;
    }

    public synchronized a n(String str, String str2, String str3, String str4) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
            return (a) iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, str, str2, str3, str4});
        }
        CheckOTAProcessRequest checkOTAProcessRequest = new CheckOTAProcessRequest();
        checkOTAProcessRequest.setDeviceCode(str);
        checkOTAProcessRequest.setRequestId(UUID.randomUUID().toString());
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put("modelType", str4);
        List<CheckOTAVersionResponse.OTAUpgrageVersionInfo> list = this.f61468d;
        if (list != null && list.get(0) != null) {
            hashMap.put("upgradeOtaRecordId", this.f61468d.get(0).getUpgradeOtaRecordId());
            hashMap.put("version", this.f61468d.get(0).getVersion());
        }
        hashMap.put("upgradeOtaRecordStatus", "PROCESS");
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(TLogEventConst.PARAM_UPLOAD_STAGE, "downloadToHelmetProcess");
        hashMap2.put("stageTime", str2);
        hashMap2.put(RVParams.PROGRESS, str3);
        arrayList2.add(hashMap2);
        hashMap.put("detailParams", arrayList2);
        arrayList.add(hashMap);
        checkOTAProcessRequest.setRecordParams(arrayList);
        j90.c.b("kSD_HTTP", "reportOTAProcess" + checkOTAProcessRequest.toString());
        o80.b.b().a(checkOTAProcessRequest).enqueue(new d());
        return this;
    }

    public synchronized a o(String str, String str2, String str3, String str4, String str5) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            return (a) iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, str, str2, str3, str4, str5});
        }
        CheckOTAProcessRequest checkOTAProcessRequest = new CheckOTAProcessRequest();
        checkOTAProcessRequest.setDeviceCode(str);
        checkOTAProcessRequest.setRequestId(UUID.randomUUID().toString());
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put("modelType", str5);
        List<CheckOTAVersionResponse.OTAUpgrageVersionInfo> list = this.f61468d;
        if (list != null && list.get(0) != null) {
            hashMap.put("upgradeOtaRecordId", this.f61468d.get(0).getUpgradeOtaRecordId());
            hashMap.put("version", this.f61468d.get(0).getVersion());
        }
        hashMap.put("upgradeOtaRecordStatus", "SUCCESS");
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(TLogEventConst.PARAM_UPLOAD_STAGE, "downloadToApp");
        hashMap2.put("stageTime", str2);
        hashMap2.put(RVParams.PROGRESS, "30");
        arrayList2.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(TLogEventConst.PARAM_UPLOAD_STAGE, "downloadToHelmet");
        hashMap3.put("stageTime", str3);
        hashMap3.put(RVParams.PROGRESS, "60");
        arrayList2.add(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(TLogEventConst.PARAM_UPLOAD_STAGE, "done");
        hashMap4.put("stageTime", str4);
        hashMap4.put(RVParams.PROGRESS, "100");
        arrayList2.add(hashMap4);
        hashMap.put("detailParams", arrayList2);
        arrayList.add(hashMap);
        checkOTAProcessRequest.setRecordParams(arrayList);
        j90.c.b("kSD_HTTP", "report_upgrade_process" + checkOTAProcessRequest);
        o80.b.b().a(checkOTAProcessRequest).enqueue(new b());
        return this;
    }

    public synchronized a p(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, ArrayList<String> arrayList) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (a) iSurgeon.surgeon$dispatch("3", new Object[]{this, str, str2, str3, str4, arrayList});
        }
        if (this.f61467c == null) {
            this.f61467c = new CheckOTAVersionRequest();
        }
        if (!this.f61469e) {
            this.f61467c.setDeviceCode(str);
            ArrayList arrayList2 = new ArrayList();
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (arrayList.get(i12) != null) {
                        if (arrayList.get(i12).contains("bluetooth")) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("modelType", arrayList.get(i12));
                            hashMap.put("modelSoftwareVersion", str3);
                            hashMap.put("modelHardwareVersion", str2);
                            hashMap.put("modelSn", "");
                            arrayList2.add(hashMap);
                        } else if (arrayList.get(i12).contains("voice")) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("modelType", arrayList.get(i12));
                            hashMap2.put("modelSoftwareVersion", str4);
                            hashMap2.put("modelHardwareVersion", str2);
                            hashMap2.put("modelSn", "");
                            arrayList2.add(hashMap2);
                        }
                    }
                }
            }
            this.f61467c.setModules(arrayList2);
        }
        return this;
    }
}
