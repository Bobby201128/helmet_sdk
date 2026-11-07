package me.ele.aiot.activityrecognition.constant;

import androidx.annotation.NonNull;
import com.taobao.accs.flowcontrol.FlowControl;

/* loaded from: classes4.dex */
public enum BehaviorsRecognizeTypeEnum {
    HORIZONTAL("HORIZONTAL", "骑行步行静止"),
    ELEVATOR("ELEVATOR", "电梯直梯"),
    ESCALATOR("ESCALATOR", "电梯扶梯"),
    STAIRWAY("STAIRWAY", "步行楼梯"),
    ALL(FlowControl.SERVICE_ALL, "全部行为");

    private final String behaviorsRecognizeTypeDesc;
    private final String behaviorsRecognizeTypeName;

    BehaviorsRecognizeTypeEnum(String str, String str2) {
        this.behaviorsRecognizeTypeName = str;
        this.behaviorsRecognizeTypeDesc = str2;
    }

    public static BehaviorsRecognizeTypeEnum from(String str) {
        for (BehaviorsRecognizeTypeEnum behaviorsRecognizeTypeEnum : values()) {
            if (str.equals(behaviorsRecognizeTypeEnum.getBehaviorsRecognizeTypeName())) {
                return behaviorsRecognizeTypeEnum;
            }
        }
        return null;
    }

    public String getBehaviorsRecognizeTypeName() {
        return this.behaviorsRecognizeTypeName;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return "BehaviorsRecognizeTypeEnum{behaviorsRecognizeTypeName='" + this.behaviorsRecognizeTypeName + "', behaviorsRecognizeTypeDesc='" + this.behaviorsRecognizeTypeDesc + "'}";
    }
}
