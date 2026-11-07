package me.ele.aiot.indoorguide.database;

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
import me.ele.im.base.conversation.EIMConversation;
import me.ele.normandie.sampling.collector.ModelContainer;

/* loaded from: classes4.dex */
public class IndoorGuideDataBase_Impl extends IndoorGuideDataBase {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

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
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `model_info` (`retailerId` TEXT NOT NULL, `mallModelUrl` TEXT, `mallModelHash` TEXT, `mallModelVersion` INTEGER NOT NULL, `mallModelLocalCachePath` TEXT, `pmmlModelUrl` TEXT, `pmmlModelHash` TEXT, `pmmlModelVersion` INTEGER NOT NULL, `pmmlModelLocalCachePath` TEXT, `mappingModelUrl` TEXT, `mappingModelHash` TEXT, `mappingModelVersion` INTEGER NOT NULL, `mappingModelLocalCachePath` TEXT, `featureModelUrl` TEXT, `featureModelHash` TEXT, `featureModelVersion` INTEGER NOT NULL, `featureModelLocalCachePath` TEXT, PRIMARY KEY(`retailerId`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `node_info` (`id` INTEGER NOT NULL, `retailer_id` TEXT NOT NULL, `shop_name` TEXT, `type` INTEGER NOT NULL, `floor` INTEGER NOT NULL, `img_url` TEXT, `img_thumbnails_url` TEXT, `neighbor` TEXT, `associated_retailerId` TEXT, PRIMARY KEY(`retailer_id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `config_info` (`ntpTime` INTEGER NOT NULL, `cityId` INTEGER NOT NULL, `enable` INTEGER NOT NULL, `useNewUploadLogic` INTEGER NOT NULL, `uploadLogCount` INTEGER NOT NULL, `cacheMaxLogCount` INTEGER NOT NULL, `uploadLogInterval` INTEGER NOT NULL, `orientationRefreshInterval` INTEGER NOT NULL, PRIMARY KEY(`ntpTime`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `scene_data_info` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scene_type` TEXT NOT NULL, `request_ntp_time` INTEGER NOT NULL, `request_params` TEXT NOT NULL, `response_ntp_time` INTEGER NOT NULL, `response_params` TEXT NOT NULL)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"cd8123cd18d9df916ddaf0a8d10fa80a\")");
        }

        @Override // androidx.room.g.a
        public void dropAllTables(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, bVar});
                return;
            }
            bVar.execSQL("DROP TABLE IF EXISTS `model_info`");
            bVar.execSQL("DROP TABLE IF EXISTS `node_info`");
            bVar.execSQL("DROP TABLE IF EXISTS `config_info`");
            bVar.execSQL("DROP TABLE IF EXISTS `scene_data_info`");
        }

        @Override // androidx.room.g.a
        protected void onCreate(b bVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "3")) {
                iSurgeon.surgeon$dispatch("3", new Object[]{this, bVar});
            } else if (((RoomDatabase) IndoorGuideDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) IndoorGuideDataBase_Impl.this).mCallbacks.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((RoomDatabase.b) ((RoomDatabase) IndoorGuideDataBase_Impl.this).mCallbacks.get(i12)).a(bVar);
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
            ((RoomDatabase) IndoorGuideDataBase_Impl.this).mDatabase = bVar;
            IndoorGuideDataBase_Impl.this.internalInitInvalidationTracker(bVar);
            if (((RoomDatabase) IndoorGuideDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) IndoorGuideDataBase_Impl.this).mCallbacks.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((RoomDatabase.b) ((RoomDatabase) IndoorGuideDataBase_Impl.this).mCallbacks.get(i12)).b(bVar);
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
            hashMap.put("retailerId", new b.a("retailerId", "TEXT", true, 1));
            hashMap.put("mallModelUrl", new b.a("mallModelUrl", "TEXT", false, 0));
            hashMap.put("mallModelHash", new b.a("mallModelHash", "TEXT", false, 0));
            hashMap.put("mallModelVersion", new b.a("mallModelVersion", "INTEGER", true, 0));
            hashMap.put("mallModelLocalCachePath", new b.a("mallModelLocalCachePath", "TEXT", false, 0));
            hashMap.put("pmmlModelUrl", new b.a("pmmlModelUrl", "TEXT", false, 0));
            hashMap.put("pmmlModelHash", new b.a("pmmlModelHash", "TEXT", false, 0));
            hashMap.put("pmmlModelVersion", new b.a("pmmlModelVersion", "INTEGER", true, 0));
            hashMap.put("pmmlModelLocalCachePath", new b.a("pmmlModelLocalCachePath", "TEXT", false, 0));
            hashMap.put("mappingModelUrl", new b.a("mappingModelUrl", "TEXT", false, 0));
            hashMap.put("mappingModelHash", new b.a("mappingModelHash", "TEXT", false, 0));
            hashMap.put("mappingModelVersion", new b.a("mappingModelVersion", "INTEGER", true, 0));
            hashMap.put("mappingModelLocalCachePath", new b.a("mappingModelLocalCachePath", "TEXT", false, 0));
            hashMap.put("featureModelUrl", new b.a("featureModelUrl", "TEXT", false, 0));
            hashMap.put("featureModelHash", new b.a("featureModelHash", "TEXT", false, 0));
            hashMap.put("featureModelVersion", new b.a("featureModelVersion", "INTEGER", true, 0));
            hashMap.put("featureModelLocalCachePath", new b.a("featureModelLocalCachePath", "TEXT", false, 0));
            c0.b bVar2 = new c0.b("model_info", hashMap, new HashSet(0), new HashSet(0));
            c0.b a12 = c0.b.a(bVar, "model_info");
            if (bVar2.equals(a12)) {
                HashMap hashMap2 = new HashMap(9);
                hashMap2.put("id", new b.a("id", "INTEGER", true, 0));
                hashMap2.put("retailer_id", new b.a("retailer_id", "TEXT", true, 1));
                hashMap2.put(EIMConversation.KEY_SHOP_NAME, new b.a(EIMConversation.KEY_SHOP_NAME, "TEXT", false, 0));
                hashMap2.put("type", new b.a("type", "INTEGER", true, 0));
                hashMap2.put("floor", new b.a("floor", "INTEGER", true, 0));
                hashMap2.put("img_url", new b.a("img_url", "TEXT", false, 0));
                hashMap2.put("img_thumbnails_url", new b.a("img_thumbnails_url", "TEXT", false, 0));
                hashMap2.put("neighbor", new b.a("neighbor", "TEXT", false, 0));
                hashMap2.put("associated_retailerId", new b.a("associated_retailerId", "TEXT", false, 0));
                c0.b bVar3 = new c0.b("node_info", hashMap2, new HashSet(0), new HashSet(0));
                c0.b a13 = c0.b.a(bVar, "node_info");
                if (bVar3.equals(a13)) {
                    HashMap hashMap3 = new HashMap(8);
                    hashMap3.put("ntpTime", new b.a("ntpTime", "INTEGER", true, 1));
                    hashMap3.put(ModelContainer.CITY_ID, new b.a(ModelContainer.CITY_ID, "INTEGER", true, 0));
                    hashMap3.put("enable", new b.a("enable", "INTEGER", true, 0));
                    hashMap3.put("useNewUploadLogic", new b.a("useNewUploadLogic", "INTEGER", true, 0));
                    hashMap3.put("uploadLogCount", new b.a("uploadLogCount", "INTEGER", true, 0));
                    hashMap3.put("cacheMaxLogCount", new b.a("cacheMaxLogCount", "INTEGER", true, 0));
                    hashMap3.put("uploadLogInterval", new b.a("uploadLogInterval", "INTEGER", true, 0));
                    hashMap3.put("orientationRefreshInterval", new b.a("orientationRefreshInterval", "INTEGER", true, 0));
                    c0.b bVar4 = new c0.b("config_info", hashMap3, new HashSet(0), new HashSet(0));
                    c0.b a14 = c0.b.a(bVar, "config_info");
                    if (bVar4.equals(a14)) {
                        HashMap hashMap4 = new HashMap(6);
                        hashMap4.put("id", new b.a("id", "INTEGER", true, 1));
                        hashMap4.put("scene_type", new b.a("scene_type", "TEXT", true, 0));
                        hashMap4.put("request_ntp_time", new b.a("request_ntp_time", "INTEGER", true, 0));
                        hashMap4.put("request_params", new b.a("request_params", "TEXT", true, 0));
                        hashMap4.put("response_ntp_time", new b.a("response_ntp_time", "INTEGER", true, 0));
                        hashMap4.put("response_params", new b.a("response_params", "TEXT", true, 0));
                        c0.b bVar5 = new c0.b("scene_data_info", hashMap4, new HashSet(0), new HashSet(0));
                        c0.b a15 = c0.b.a(bVar, "scene_data_info");
                        if (bVar5.equals(a15)) {
                            return;
                        }
                        throw new IllegalStateException("Migration didn't properly handle scene_data_info(me.ele.aiot.indoorguide.database.model.SceneDataInfo).\n Expected:\n" + bVar5 + "\n Found:\n" + a15);
                    }
                    throw new IllegalStateException("Migration didn't properly handle config_info(me.ele.aiot.indoorguide.database.model.ConfigInfo).\n Expected:\n" + bVar4 + "\n Found:\n" + a14);
                }
                throw new IllegalStateException("Migration didn't properly handle node_info(me.ele.aiot.indoorguide.database.model.NodeInfo).\n Expected:\n" + bVar3 + "\n Found:\n" + a13);
            }
            throw new IllegalStateException("Migration didn't properly handle model_info(me.ele.aiot.indoorguide.database.model.ModelInfo).\n Expected:\n" + bVar2 + "\n Found:\n" + a12);
        }
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
            writableDatabase.execSQL("DELETE FROM `node_info`");
            writableDatabase.execSQL("DELETE FROM `config_info`");
            writableDatabase.execSQL("DELETE FROM `scene_data_info`");
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
        return InstrumentAPI.support(iSurgeon, "2") ? (d) iSurgeon.surgeon$dispatch("2", new Object[]{this}) : new d(this, "model_info", "node_info", "config_info", "scene_data_info");
    }

    @Override // androidx.room.RoomDatabase
    protected c createOpenHelper(androidx.room.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (c) iSurgeon.surgeon$dispatch("1", new Object[]{this, aVar});
        }
        return aVar.f4460a.a(c.b.a(aVar.f4461b).c(aVar.f4462c).b(new g(aVar, new a(1), "cd8123cd18d9df916ddaf0a8d10fa80a", "124e3306b549a762c264959e6ee3a522")).a());
    }
}
