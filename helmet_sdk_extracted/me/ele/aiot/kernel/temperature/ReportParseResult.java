package me.ele.aiot.kernel.temperature;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.util.List;

/* loaded from: classes4.dex */
public final class ReportParseResult {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    public final Status f61983a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61984b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f61985c;

    /* loaded from: classes4.dex */
    public enum Status {
        INVALID,
        CRC_FAIL,
        WRONG_CMD,
        FINISHED,
        DATA
    }

    private ReportParseResult(Status status, long j12, List<b> list) {
        this.f61983a = status;
        this.f61984b = j12;
        this.f61985c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReportParseResult a() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (ReportParseResult) iSurgeon.surgeon$dispatch("2", new Object[0]) : new ReportParseResult(Status.CRC_FAIL, 0L, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReportParseResult b(long j12, List<b> list) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "5") ? (ReportParseResult) iSurgeon.surgeon$dispatch("5", new Object[]{Long.valueOf(j12), list}) : new ReportParseResult(Status.DATA, j12, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReportParseResult c(long j12) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? (ReportParseResult) iSurgeon.surgeon$dispatch("4", new Object[]{Long.valueOf(j12)}) : new ReportParseResult(Status.FINISHED, j12, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReportParseResult d() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (ReportParseResult) iSurgeon.surgeon$dispatch("1", new Object[0]) : new ReportParseResult(Status.INVALID, 0L, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReportParseResult e() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (ReportParseResult) iSurgeon.surgeon$dispatch("3", new Object[0]) : new ReportParseResult(Status.WRONG_CMD, 0L, null);
    }
}
