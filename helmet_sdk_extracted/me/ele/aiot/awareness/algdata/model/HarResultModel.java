package me.ele.aiot.awareness.algdata.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import od1.a;

/* loaded from: classes4.dex */
public class HarResultModel implements a {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private final String harResult;
    private final long timestamp;

    public HarResultModel(String str, long j12) {
        this.harResult = str;
        this.timestamp = j12;
    }

    @Override // od1.a
    public JSONObject toJson() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (JSONObject) iSurgeon.surgeon$dispatch("1", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("harResult", (Object) this.harResult);
        jSONObject.put("timestamp", (Object) Long.valueOf(this.timestamp));
        return jSONObject;
    }
}
