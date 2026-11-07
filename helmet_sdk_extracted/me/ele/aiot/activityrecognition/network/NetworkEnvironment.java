package me.ele.aiot.activityrecognition.network;

/* loaded from: classes4.dex */
public enum NetworkEnvironment {
    PRODUCTION("https://aiot.ele.me"),
    PPE("https://ppe-aiot.ele.me"),
    DAILY("https://httpizza.daily.elenet.me");

    private String mDomainName;

    NetworkEnvironment(String str) {
        this.mDomainName = str;
    }

    public String getDomainName() {
        return this.mDomainName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NetworkEnvironment{mDomainName='" + this.mDomainName + "'}";
    }
}
