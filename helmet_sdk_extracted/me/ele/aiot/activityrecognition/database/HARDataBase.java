package me.ele.aiot.activityrecognition.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.e;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import me.ele.foundation.Application;

@Database
/* loaded from: classes4.dex */
public abstract class HARDataBase extends RoomDatabase {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final HARDataBase f61792a = (HARDataBase) e.a(Application.getApplicationContext(), HARDataBase.class, "activity_recognition.db").a(new b0.a[0]).c().b();
    }

    public static HARDataBase a() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (HARDataBase) iSurgeon.surgeon$dispatch("1", new Object[0]) : a.f61792a;
    }

    public abstract k70.a b();
}
