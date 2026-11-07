package me.ele.aiot.awareness.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.e;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.foundation.Application;

@Database
/* loaded from: classes4.dex */
public abstract class AwarenessDataBase extends RoomDatabase {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final AwarenessDataBase f61856a = (AwarenessDataBase) e.a(Application.getApplicationContext(), AwarenessDataBase.class, "awareness.db").a(new b0.a[0]).c().b();
    }

    public static AwarenessDataBase a() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (AwarenessDataBase) iSurgeon.surgeon$dispatch("1", new Object[0]) : a.f61856a;
    }

    public abstract r70.a b();
}
