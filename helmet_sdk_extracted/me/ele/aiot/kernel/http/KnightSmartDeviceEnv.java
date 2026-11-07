package me.ele.aiot.kernel.http;

/* loaded from: classes4.dex */
public enum KnightSmartDeviceEnv {
    PRODUCTION("https://aiot.ele.me"),
    PPE("https://ppe-aiot.ele.me"),
    DAILY("https://aiot.daily.elenet.me");

    private String domainName;

    KnightSmartDeviceEnv(String str) {
        this.domainName = str;
    }

    public String getDomainName() {
        return this.domainName;
    }
}
