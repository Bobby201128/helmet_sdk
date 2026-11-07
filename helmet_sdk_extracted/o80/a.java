package o80;

import me.ele.aiot.kernel.http.ota.net.model.CheckOTAProcessRequest;
import me.ele.aiot.kernel.http.ota.net.model.CheckOTAProcessResponse;
import me.ele.aiot.kernel.http.ota.net.model.CheckOTAVersionRequest;
import me.ele.aiot.kernel.http.ota.net.model.CheckOTAVersionResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* loaded from: classes4.dex */
public interface a {
    @POST("/bdi.boxmanager/v1/iot/device/report_upgrade_process")
    Call<CheckOTAProcessResponse> a(@Body CheckOTAProcessRequest checkOTAProcessRequest);

    @POST("/bdi.boxmanager/v1/iot/device/check_module_version")
    Call<CheckOTAVersionResponse> b(@Body CheckOTAVersionRequest checkOTAVersionRequest);
}
