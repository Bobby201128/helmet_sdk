package me.ele.aiot.indoorguide.constant;

/* loaded from: classes4.dex */
public enum AppTypeEnum {
    CROWED_TEAM("1", "蜂鸟众包App"),
    TALARIS_TEAM("2", "蜂鸟团队App");

    private String appTypeCode;
    private String appTypeDesc;

    AppTypeEnum(String str, String str2) {
        this.appTypeCode = str;
        this.appTypeDesc = str2;
    }

    public String getAppTypeCode() {
        return this.appTypeCode;
    }

    public String getAppTypeDesc() {
        return this.appTypeDesc;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "AppTypeEnum{appTypeCode='" + this.appTypeCode + "', appTypeDesc='" + this.appTypeDesc + "'}";
    }
}
