package me.ele.aiot.indoorguide.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSONObject;

@Keep
/* loaded from: classes4.dex */
public interface IJson {
    IJson parseJson(JSONObject jSONObject);

    JSONObject toJSONObject();
}
