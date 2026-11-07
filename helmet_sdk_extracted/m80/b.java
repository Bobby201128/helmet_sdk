package m80;

import androidx.annotation.NonNull;
import me.ele.aiot.kernel.http.ota.net.model.CheckOTAVersionResponse;

/* loaded from: classes4.dex */
public interface b {
    void a(@NonNull CheckOTAVersionResponse.OTAUpgrageVersionInfo oTAUpgrageVersionInfo);

    void onFailure(int i12);

    void onNoNewVersion();
}
