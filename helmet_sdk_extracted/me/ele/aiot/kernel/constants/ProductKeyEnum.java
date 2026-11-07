package me.ele.aiot.kernel.constants;

import androidx.annotation.NonNull;
import me.ele.hunter.core.black.HBBlackRecordModel;

/* loaded from: classes4.dex */
public enum ProductKeyEnum {
    UNKNOWN("", HBBlackRecordModel.UNKNOWN, 0),
    TKX("TKX", "智能夏盔", 1),
    TKD("TKD", "智能冬盔", 1),
    SHE("SHE", "智能头盔耳机E1", 2),
    SHF("SHF", "智能头盔", 1),
    SHP("SHP", "智能头盔耳机E1P", 2),
    X3L("X3L", "智能头盔X3L", 3),
    SHW("SHW", "智能冬盔", 1),
    NONE("NONE", "", 0);

    private int productTypeCode;
    private String productTypeKey;
    private String productTypeKeyDesc;

    ProductKeyEnum(String str, String str2, int i12) {
        this.productTypeKey = str;
        this.productTypeKeyDesc = str2;
        this.productTypeCode = i12;
    }

    public static ProductKeyEnum from(String str) {
        for (ProductKeyEnum productKeyEnum : values()) {
            if (str != null && str.equals(productKeyEnum.getProductTypeKey())) {
                return productKeyEnum;
            }
        }
        return UNKNOWN;
    }

    public int getProductTypeCode() {
        return this.productTypeCode;
    }

    public String getProductTypeKey() {
        return this.productTypeKey;
    }

    public String getProductTypeKeyDesc() {
        return this.productTypeKeyDesc;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return "ProductKeyEnum{productTypeKey='" + this.productTypeKey + "', productTypeKeyDesc='" + this.productTypeKeyDesc + "', productTypeCode=" + this.productTypeCode + '}';
    }
}
