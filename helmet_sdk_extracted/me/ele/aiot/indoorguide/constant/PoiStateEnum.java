package me.ele.aiot.indoorguide.constant;

/* loaded from: classes4.dex */
public enum PoiStateEnum {
    PASSED_POINT(1, "已经过点位"),
    CURRENT_POINT(2, "当前点位"),
    UNPASSED_POINT(3, "未经过点位");

    private int poiStateCode;
    private String poiStateDesc;

    PoiStateEnum(int i12, String str) {
        this.poiStateCode = i12;
        this.poiStateDesc = str;
    }

    public int getPoiStateCode() {
        return this.poiStateCode;
    }

    public String getPoiStateDesc() {
        return this.poiStateDesc;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "PoiStateEnum{poiStateCode=" + this.poiStateCode + ", poiStateDesc='" + this.poiStateDesc + "'}";
    }
}
