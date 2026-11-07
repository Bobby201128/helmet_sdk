package me.ele.aiot.activityrecognition.database;

import androidx.room.RoomDatabase;
import androidx.room.d;
import androidx.room.g;
import c0.b;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import d0.b;
import d0.c;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class HARDataBase_Impl extends HARDataBase {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private volatile k70.a f61793a;

    /* loaded from: classes4.dex */
    public class a extends g.a {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        a(int i12) {
            super(i12);
        }

        @Override // androidx.room.g.a
        public void createAllTables(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                iSurgeon.surgeon$dispatch("1", new Object[]{this, bVar});
                return;
            }
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `model_info` (`knightId` TEXT NOT NULL, `horizontalHarModelUrl` TEXT, `horizontalHarModelHash` TEXT, `horizontalHarModelVersion` INTEGER NOT NULL, `horizontalHarModelLocalCachePath` TEXT, `elevatorHARModelUrl` TEXT, `elevatorHARModelHash` TEXT, `elevatorHARModelVersion` INTEGER NOT NULL, `elevatorHARModelLocalCachePath` TEXT, `escalatorHARModelUrl` TEXT, `escalatorHARModelHash` TEXT, `escalatorHARModelVersion` INTEGER NOT NULL, `escalatorHARModelLocalCachePath` TEXT, `stairwayHARModelUrl` TEXT, `stairwayHARModelHash` TEXT, `stairwayHARModelVersion` INTEGER NOT NULL, `stairwayHARModelLocalCachePath` TEXT, PRIMARY KEY(`knightId`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"11cd4e982ac5679269c12e9a932a1da2\")");
        }

        @Override // androidx.room.g.a
        public void dropAllTables(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bVar});
            } else {
                bVar.execSQL("DROP TABLE IF EXISTS `model_info`");
            }
        }

        @Override // androidx.room.g.a
        protected void onCreate(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, bVar});
            } else if (((RoomDatabase) HARDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) HARDataBase_Impl.this).mCallbacks.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((RoomDatabase.b) ((RoomDatabase) HARDataBase_Impl.this).mCallbacks.get(i12)).a(bVar);
                }
            }
        }

        @Override // androidx.room.g.a
        public void onOpen(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, bVar});
                return;
            }
            ((RoomDatabase) HARDataBase_Impl.this).mDatabase = bVar;
            HARDataBase_Impl.this.internalInitInvalidationTracker(bVar);
            if (((RoomDatabase) HARDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) HARDataBase_Impl.this).mCallbacks.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((RoomDatabase.b) ((RoomDatabase) HARDataBase_Impl.this).mCallbacks.get(i12)).b(bVar);
                }
            }
        }

        @Override // androidx.room.g.a
        protected void validateMigration(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "5")) {
                iSurgeon.surgeon$dispatch("5", new Object[]{this, bVar});
                return;
            }
            HashMap hashMap = new HashMap(17);
            hashMap.put("knightId", new b.a("knightId", "TEXT", true, 1));
            hashMap.put("horizontalHarModelUrl", new b.a("horizontalHarModelUrl", "TEXT", false, 0));
            hashMap.put("horizontalHarModelHash", new b.a("horizontalHarModelHash", "TEXT", false, 0));
            hashMap.put("horizontalHarModelVersion", new b.a("horizontalHarModelVersion", "INTEGER", true, 0));
            hashMap.put("horizontalHarModelLocalCachePath", new b.a("horizontalHarModelLocalCachePath", "TEXT", false, 0));
            hashMap.put("elevatorHARModelUrl", new b.a("elevatorHARModelUrl", "TEXT", false, 0));
            hashMap.put("elevatorHARModelHash", new b.a("elevatorHARModelHash", "TEXT", false, 0));
            hashMap.put("elevatorHARModelVersion", new b.a("elevatorHARModelVersion", "INTEGER", true, 0));
            hashMap.put("elevatorHARModelLocalCachePath", new b.a("elevatorHARModelLocalCachePath", "TEXT", false, 0));
            hashMap.put("escalatorHARModelUrl", new b.a("escalatorHARModelUrl", "TEXT", false, 0));
            hashMap.put("escalatorHARModelHash", new b.a("escalatorHARModelHash", "TEXT", false, 0));
            hashMap.put("escalatorHARModelVersion", new b.a("escalatorHARModelVersion", "INTEGER", true, 0));
            hashMap.put("escalatorHARModelLocalCachePath", new b.a("escalatorHARModelLocalCachePath", "TEXT", false, 0));
            hashMap.put("stairwayHARModelUrl", new b.a("stairwayHARModelUrl", "TEXT", false, 0));
            hashMap.put("stairwayHARModelHash", new b.a("stairwayHARModelHash", "TEXT", false, 0));
            hashMap.put("stairwayHARModelVersion", new b.a("stairwayHARModelVersion", "INTEGER", true, 0));
            hashMap.put("stairwayHARModelLocalCachePath", new b.a("stairwayHARModelLocalCachePath", "TEXT", false, 0));
            c0.b bVar2 = new c0.b("model_info", hashMap, new HashSet(0), new HashSet(0));
            c0.b a12 = c0.b.a(bVar, "model_info");
            if (bVar2.equals(a12)) {
                return;
            }
            throw new IllegalStateException("Migration didn't properly handle model_info(me.ele.aiot.activityrecognition.database.model.ModelInfo).\n Expected:\n" + bVar2 + "\n Found:\n" + a12);
        }
    }

    @Override // me.ele.aiot.activityrecognition.database.HARDataBase
    public k70.a b() {
        k70.a aVar;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (k70.a) iSurgeon.surgeon$dispatch("4", new Object[]{this});
        }
        if (this.f61793a != null) {
            return this.f61793a;
        }
        synchronized (this) {
            if (this.f61793a == null) {
                this.f61793a = new k70.b(this);
            }
            aVar = this.f61793a;
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this});
            return;
        }
        super.assertNotMainThread();
        d0.b writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `model_info`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.f("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.C0()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected d createInvalidationTracker() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "2") ? (d) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : new d(this, "model_info");
    }

    @Override // androidx.room.RoomDatabase
    protected c createOpenHelper(androidx.room.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (c) iSurgeon.surgeon$dispatch("1", new Object[]{this, aVar});
        }
        return aVar.f4460a.a(c.b.a(aVar.f4461b).c(aVar.f4462c).b(new g(aVar, new a(3), "11cd4e982ac5679269c12e9a932a1da2", "c08ae26c93d5eb85be7d1051b5ea95b8")).a());
    }
}
