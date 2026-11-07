package me.ele.aiot.kernel.constants;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes4.dex */
public enum ClickEventEnum {
    ONCE_CLICK(HiAnalyticsConstant.KeyAndValue.NUMBER_01, "单击");

    private String clickCode;
    private String clickDesc;

    ClickEventEnum(String str, String str2) {
        this.clickCode = str;
        this.clickDesc = str2;
    }

    public String getClickCode() {
        return this.clickCode;
    }

    public String getClickDesc() {
        return this.clickDesc;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "ClickEventEnum{clickCode='" + this.clickCode + "', clickDesc='" + this.clickDesc + "'}";
    }
}
