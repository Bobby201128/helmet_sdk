package me.ele.aiot.activityrecognition;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class RecognizedBehaviors implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private List<Behavior> behaviors;
    private long timestamp;

    /* loaded from: classes4.dex */
    public static class Behavior implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private String behaviorStateType;
        private float confidence;

        public Behavior(String str, float f12) {
            this.behaviorStateType = str;
            this.confidence = f12;
        }

        public String getBehaviorStateType() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.behaviorStateType;
        }

        public float getConfidence() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? ((Float) iSurgeon.surgeon$dispatch("3", new Object[]{this})).floatValue() : this.confidence;
        }

        public void setBehaviorStateType(String str) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, str});
            } else {
                this.behaviorStateType = str;
            }
        }

        public void setConfidence(float f12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Float.valueOf(f12)});
            } else {
                this.confidence = f12;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "5")) {
                return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
            }
            return "Behavior{behaviorStateType='" + this.behaviorStateType + "', confidence=" + this.confidence + '}';
        }
    }

    public List<Behavior> getBehaviors() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (List) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.behaviors;
    }

    public long getTimestamp() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Long) iSurgeon.surgeon$dispatch("3", new Object[]{this})).longValue() : this.timestamp;
    }

    public void setBehaviors(List<Behavior> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, list});
        } else {
            this.behaviors = list;
        }
    }

    public void setTimestamp(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, Long.valueOf(j12)});
        } else {
            this.timestamp = j12;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "RecognizedBehaviors{timestamp=" + this.timestamp + ", behaviors=" + this.behaviors + '}';
    }
}
