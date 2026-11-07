package me.ele.aiot.awareness.database;

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
public final class AwarenessDataBase_Impl extends AwarenessDataBase {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    private volatile r70.a f61857a;

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
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `nfc_card_info` (`uid` TEXT NOT NULL, `secret` TEXT, `deviceCode` TEXT, `retailerId` TEXT, `saveTime` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c77da3a43bca0cab0cae92167112fc98\")");
        }

        @Override // androidx.room.g.a
        public void dropAllTables(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bVar});
            } else {
                bVar.execSQL("DROP TABLE IF EXISTS `nfc_card_info`");
            }
        }

        @Override // androidx.room.g.a
        protected void onCreate(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, bVar});
            } else if (((RoomDatabase) AwarenessDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AwarenessDataBase_Impl.this).mCallbacks.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((RoomDatabase.b) ((RoomDatabase) AwarenessDataBase_Impl.this).mCallbacks.get(i12)).a(bVar);
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
            ((RoomDatabase) AwarenessDataBase_Impl.this).mDatabase = bVar;
            AwarenessDataBase_Impl.this.internalInitInvalidationTracker(bVar);
            if (((RoomDatabase) AwarenessDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AwarenessDataBase_Impl.this).mCallbacks.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((RoomDatabase.b) ((RoomDatabase) AwarenessDataBase_Impl.this).mCallbacks.get(i12)).b(bVar);
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
            HashMap hashMap = new HashMap(5);
            hashMap.put("uid", new b.a("uid", "TEXT", true, 1));
            hashMap.put("secret", new b.a("secret", "TEXT", false, 0));
            hashMap.put("deviceCode", new b.a("deviceCode", "TEXT", false, 0));
            hashMap.put("retailerId", new b.a("retailerId", "TEXT", false, 0));
            hashMap.put("saveTime", new b.a("saveTime", "INTEGER", true, 0));
            c0.b bVar2 = new c0.b("nfc_card_info", hashMap, new HashSet(0), new HashSet(0));
            c0.b a12 = c0.b.a(bVar, "nfc_card_info");
            if (bVar2.equals(a12)) {
                return;
            }
            throw new IllegalStateException("Migration didn't properly handle nfc_card_info(me.ele.aiot.awareness.database.model.NfcCardInfoModel).\n Expected:\n" + bVar2 + "\n Found:\n" + a12);
        }
    }

    @Override // me.ele.aiot.awareness.database.AwarenessDataBase
    public r70.a b() {
        r70.a aVar;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (r70.a) iSurgeon.surgeon$dispatch("4", new Object[]{this});
        }
        if (this.f61857a != null) {
            return this.f61857a;
        }
        synchronized (this) {
            if (this.f61857a == null) {
                this.f61857a = new r70.b(this);
            }
            aVar = this.f61857a;
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
            writableDatabase.execSQL("DELETE FROM `nfc_card_info`");
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
        return InstrumentAPI.support(iSurgeon, "2") ? (d) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : new d(this, "nfc_card_info");
    }

    @Override // androidx.room.RoomDatabase
    protected c createOpenHelper(androidx.room.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (c) iSurgeon.surgeon$dispatch("1", new Object[]{this, aVar});
        }
        return aVar.f4460a.a(c.b.a(aVar.f4461b).c(aVar.f4462c).b(new g(aVar, new a(1), "c77da3a43bca0cab0cae92167112fc98", "6439e65f3158b2a5ab409b638babee07")).a());
    }
}
