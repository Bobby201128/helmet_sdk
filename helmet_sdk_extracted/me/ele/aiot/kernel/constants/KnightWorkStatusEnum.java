package me.ele.aiot.kernel.constants;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import me.ele.hunter.core.black.HBBlackRecordModel;

/* loaded from: classes4.dex */
public enum KnightWorkStatusEnum {
    OFFWORK("00", "未开工"),
    WORK(HiAnalyticsConstant.KeyAndValue.NUMBER_01, "开工"),
    RESTING("02", "小休"),
    UNKNOWN("03", HBBlackRecordModel.UNKNOWN);

    private final String statusCode;
    private final String statusDesc;

    KnightWorkStatusEnum(String str, String str2) {
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static KnightWorkStatusEnum from(String str) {
        for (KnightWorkStatusEnum knightWorkStatusEnum : values()) {
            if (TextUtils.equals(knightWorkStatusEnum.statusCode, str)) {
                return knightWorkStatusEnum;
            }
        }
        return OFFWORK;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return "KnightWorkStatusEnum{statusCode='" + this.statusCode + "', statusDesc='" + this.statusDesc + "'}";
    }
}
