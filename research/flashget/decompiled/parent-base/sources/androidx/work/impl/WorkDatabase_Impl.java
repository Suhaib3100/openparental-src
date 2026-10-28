package androidx.work.impl;

import androidx.room.c2;
import androidx.room.f2;
import androidx.room.m0;
import androidx.room.n;
import androidx.room.util.g;
import androidx.work.impl.model.m;
import androidx.work.impl.model.p;
import androidx.work.impl.model.q;
import androidx.work.impl.model.s;
import androidx.work.impl.model.t;
import androidx.work.impl.model.v;
import androidx.work.impl.model.w;
import f3.e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: d, reason: collision with root package name */
    private volatile s f36004d;

    /* renamed from: e, reason: collision with root package name */
    private volatile androidx.work.impl.model.b f36005e;

    /* renamed from: f, reason: collision with root package name */
    private volatile v f36006f;

    /* renamed from: g, reason: collision with root package name */
    private volatile androidx.work.impl.model.j f36007g;

    /* renamed from: h, reason: collision with root package name */
    private volatile m f36008h;

    /* renamed from: i, reason: collision with root package name */
    private volatile p f36009i;

    /* renamed from: j, reason: collision with root package name */
    private volatile androidx.work.impl.model.e f36010j;

    /* renamed from: k, reason: collision with root package name */
    private volatile androidx.work.impl.model.g f36011k;

    class a extends f2.b {
        a(int version) {
            super(version);
        }

        @Override // androidx.room.f2.b
        public void createAllTables(f3.d _db) {
            _db.b0("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.b0("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            _db.b0("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            _db.b0("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            _db.b0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            _db.b0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            _db.b0("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.b0("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            _db.b0("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.b0("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.b0("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            _db.b0("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.b0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            _db.b0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            _db.b0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.f2.b
        public void dropAllTables(f3.d _db) {
            _db.b0("DROP TABLE IF EXISTS `Dependency`");
            _db.b0("DROP TABLE IF EXISTS `WorkSpec`");
            _db.b0("DROP TABLE IF EXISTS `WorkTag`");
            _db.b0("DROP TABLE IF EXISTS `SystemIdInfo`");
            _db.b0("DROP TABLE IF EXISTS `WorkName`");
            _db.b0("DROP TABLE IF EXISTS `WorkProgress`");
            _db.b0("DROP TABLE IF EXISTS `Preference`");
            if (((c2) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((c2) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((c2.b) ((c2) WorkDatabase_Impl.this).mCallbacks.get(i4)).b(_db);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f2.b
        public void onCreate(f3.d _db) {
            if (((c2) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((c2) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((c2.b) ((c2) WorkDatabase_Impl.this).mCallbacks.get(i4)).a(_db);
                }
            }
        }

        @Override // androidx.room.f2.b
        public void onOpen(f3.d _db) {
            ((c2) WorkDatabase_Impl.this).mDatabase = _db;
            _db.b0("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(_db);
            if (((c2) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((c2) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((c2.b) ((c2) WorkDatabase_Impl.this).mCallbacks.get(i4)).c(_db);
                }
            }
        }

        @Override // androidx.room.f2.b
        public void onPostMigrate(f3.d _db) {
        }

        @Override // androidx.room.f2.b
        public void onPreMigrate(f3.d _db) {
            androidx.room.util.b.b(_db);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f2.b
        public f2.c onValidateSchema(f3.d _db) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new g.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.f("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new g.f("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            androidx.room.util.g gVar = new androidx.room.util.g("Dependency", hashMap, hashSet, hashSet2);
            g.Companion companion = androidx.room.util.g.INSTANCE;
            androidx.room.util.g a5 = companion.a(_db, "Dependency");
            if (!gVar.equals(a5)) {
                return new f2.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + a5);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new g.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new g.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new g.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new g.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new g.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new g.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new g.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new g.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new g.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new g.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new g.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new g.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new g.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new g.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new g.f("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new g.f("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            androidx.room.util.g gVar2 = new androidx.room.util.g("WorkSpec", hashMap2, hashSet3, hashSet4);
            androidx.room.util.g a6 = companion.a(_db, "WorkSpec");
            if (!gVar2.equals(a6)) {
                return new f2.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + a6);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new g.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.f("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            androidx.room.util.g gVar3 = new androidx.room.util.g("WorkTag", hashMap3, hashSet5, hashSet6);
            androidx.room.util.g a7 = companion.a(_db, "WorkTag");
            if (!gVar3.equals(a7)) {
                return new f2.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + a7);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            androidx.room.util.g gVar4 = new androidx.room.util.g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            androidx.room.util.g a8 = companion.a(_db, "SystemIdInfo");
            if (!gVar4.equals(a8)) {
                return new f2.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + a8);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new g.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.f("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            androidx.room.util.g gVar5 = new androidx.room.util.g("WorkName", hashMap5, hashSet8, hashSet9);
            androidx.room.util.g a10 = companion.a(_db, "WorkName");
            if (!gVar5.equals(a10)) {
                return new f2.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + a10);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new g.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            androidx.room.util.g gVar6 = new androidx.room.util.g("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            androidx.room.util.g a11 = companion.a(_db, "WorkProgress");
            if (!gVar6.equals(a11)) {
                return new f2.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar6 + "\n Found:\n" + a11);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new g.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new g.a("long_value", "INTEGER", false, 0, null, 1));
            androidx.room.util.g gVar7 = new androidx.room.util.g("Preference", hashMap7, new HashSet(0), new HashSet(0));
            androidx.room.util.g a12 = companion.a(_db, "Preference");
            if (gVar7.equals(a12)) {
                return new f2.c(true, null);
            }
            return new f2.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar7 + "\n Found:\n" + a12);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.b b() {
        androidx.work.impl.model.b bVar;
        if (this.f36005e != null) {
            return this.f36005e;
        }
        synchronized (this) {
            try {
                if (this.f36005e == null) {
                    this.f36005e = new androidx.work.impl.model.c(this);
                }
                bVar = this.f36005e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.room.c2
    public void clearAllTables() {
        super.assertNotMainThread();
        f3.d O2 = super.getOpenHelper().O2();
        try {
            super.beginTransaction();
            O2.b0("PRAGMA defer_foreign_keys = TRUE");
            O2.b0("DELETE FROM `Dependency`");
            O2.b0("DELETE FROM `WorkSpec`");
            O2.b0("DELETE FROM `WorkTag`");
            O2.b0("DELETE FROM `SystemIdInfo`");
            O2.b0("DELETE FROM `WorkName`");
            O2.b0("DELETE FROM `WorkProgress`");
            O2.b0("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            O2.U2("PRAGMA wal_checkpoint(FULL)").close();
            if (!O2.m3()) {
                O2.b0("VACUUM");
            }
        }
    }

    @Override // androidx.room.c2
    protected m0 createInvalidationTracker() {
        return new m0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.c2
    protected f3.e createOpenHelper(n configuration) {
        return configuration.sqliteOpenHelperFactory.a(e.b.a(configuration.context).d(configuration.name).c(new f2(configuration, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.e f() {
        androidx.work.impl.model.e eVar;
        if (this.f36010j != null) {
            return this.f36010j;
        }
        synchronized (this) {
            try {
                if (this.f36010j == null) {
                    this.f36010j = new androidx.work.impl.model.f(this);
                }
                eVar = this.f36010j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.g g() {
        androidx.work.impl.model.g gVar;
        if (this.f36011k != null) {
            return this.f36011k;
        }
        synchronized (this) {
            try {
                if (this.f36011k == null) {
                    this.f36011k = new androidx.work.impl.model.h(this);
                }
                gVar = this.f36011k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.j h() {
        androidx.work.impl.model.j jVar;
        if (this.f36007g != null) {
            return this.f36007g;
        }
        synchronized (this) {
            try {
                if (this.f36007g == null) {
                    this.f36007g = new androidx.work.impl.model.k(this);
                }
                jVar = this.f36007g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public m i() {
        m mVar;
        if (this.f36008h != null) {
            return this.f36008h;
        }
        synchronized (this) {
            try {
                if (this.f36008h == null) {
                    this.f36008h = new androidx.work.impl.model.n(this);
                }
                mVar = this.f36008h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public p j() {
        p pVar;
        if (this.f36009i != null) {
            return this.f36009i;
        }
        synchronized (this) {
            try {
                if (this.f36009i == null) {
                    this.f36009i = new q(this);
                }
                pVar = this.f36009i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public s k() {
        s sVar;
        if (this.f36004d != null) {
            return this.f36004d;
        }
        synchronized (this) {
            try {
                if (this.f36004d == null) {
                    this.f36004d = new t(this);
                }
                sVar = this.f36004d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public v l() {
        v vVar;
        if (this.f36006f != null) {
            return this.f36006f;
        }
        synchronized (this) {
            try {
                if (this.f36006f == null) {
                    this.f36006f = new w(this);
                }
                vVar = this.f36006f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }
}
