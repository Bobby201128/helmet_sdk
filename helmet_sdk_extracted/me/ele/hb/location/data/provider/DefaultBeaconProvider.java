package me.ele.hb.location.data.provider;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.ArrayList;
import java.util.List;
import me.ele.hb.location.config.Config;
import me.ele.hb.location.data.database.HBBeaconDataBase;
import me.ele.hb.location.data.model.BeaconModel;
import me.ele.hb.location.model.Beacon;
import me.ele.hb.location.utils.TimeUtils;

/* loaded from: classes5.dex */
public class DefaultBeaconProvider implements IBeaconProvider {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    private List<Beacon> convert(List<BeaconModel> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (List) iSurgeon.surgeon$dispatch("3", new Object[]{this, list});
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (BeaconModel beaconModel : list) {
                arrayList.add(new Beacon(beaconModel.getBeaconId(), beaconModel.getRssi(), beaconModel.getUuid(), beaconModel.getMajor(), beaconModel.getMinor(), beaconModel.getDetectedAt()));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public long getExpiration() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? ((Long) iSurgeon.surgeon$dispatch("2", new Object[]{this})).longValue() : Config.beaconDataExpiration();
    }

    @Override // me.ele.hb.location.data.provider.IDataProvider
    public List<Beacon> getData() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (List) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : convert(HBBeaconDataBase.getDefault().getBeaconModelDao().queryBeaconByDetectedTime(BeaconModel.SOURCE_PHONE, TimeUtils.now() - getExpiration()));
    }
}
