package me.ele.aiot.indoorguide.constant;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public enum ModelTypeEnum {
    MALL("mall"),
    PMML("pmml"),
    MAPPING("mapping"),
    FEATURE("feature");

    private String modelTypeName;

    ModelTypeEnum(String str) {
        this.modelTypeName = str;
    }

    public static ModelTypeEnum from(String str) {
        for (ModelTypeEnum modelTypeEnum : values()) {
            if (TextUtils.equals(modelTypeEnum.getModelTypeName(), str)) {
                return modelTypeEnum;
            }
        }
        return null;
    }

    public String getModelTypeName() {
        return this.modelTypeName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "ModelTypeEnum{modelTypeName='" + this.modelTypeName + "'}";
    }
}
