package me.ele.aiot.fastble.data;

/* loaded from: classes4.dex */
public enum BleScanState {
    STATE_IDLE(-1),
    STATE_SCANNING(1);

    private int code;

    BleScanState(int i12) {
        this.code = i12;
    }

    public int getCode() {
        return this.code;
    }
}
