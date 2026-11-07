package me.ele.aiot.indoorguide.constant;

/* loaded from: classes4.dex */
public enum PoiTypeEnum {
    STARTING_POINT(1, "起点"),
    SHOP(2, "门店"),
    END_POINT(3, "终点"),
    KEY_SIGNPOST(4, "关键路标"),
    STAIRS(5, "电梯/扶梯/楼梯");

    private int poiTypeCode;
    private String poiTypeDesc;

    PoiTypeEnum(int i12, String str) {
        this.poiTypeCode = i12;
        this.poiTypeDesc = str;
    }

    public int getPoiTypeCode() {
        return this.poiTypeCode;
    }

    public String getPoiTypeDesc() {
        return this.poiTypeDesc;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "PoiTypeEnum{poiTypeCode=" + this.poiTypeCode + ", poiTypeDesc='" + this.poiTypeDesc + "'}";
    }
}
