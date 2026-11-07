package me.ele.aiot.activityrecognition.constant;

import me.ele.hunter.core.black.HBBlackRecordModel;

/* loaded from: classes4.dex */
public enum BehaviorStateEnum {
    UNKNOWN(0, HBBlackRecordModel.UNKNOWN),
    MOTIONLESS(1, "静止"),
    WALKING(2, "步行"),
    RUNNING(3, "急行"),
    RIDE(4, "骑行"),
    VERTICAL_LADDER_UPWARD(5, "直梯上行"),
    VERTICAL_LADDER_DOWN(6, "直梯下行"),
    ESCALATOR_UPWARD(7, "扶梯上行"),
    ESCALATOR_DOWN(8, "扶梯下行"),
    STAIRS_UPWARD(9, "楼梯上行"),
    STAIRS_DOWN(10, "楼梯下行");

    private int behaviorStateCode;
    private String behaviorStateDesc;

    BehaviorStateEnum(int i12, String str) {
        this.behaviorStateCode = i12;
        this.behaviorStateDesc = str;
    }

    public static BehaviorStateEnum from(int i12) {
        for (BehaviorStateEnum behaviorStateEnum : values()) {
            if (i12 == behaviorStateEnum.getBehaviorStateCode()) {
                return behaviorStateEnum;
            }
        }
        return null;
    }

    public int getBehaviorStateCode() {
        return this.behaviorStateCode;
    }
}
