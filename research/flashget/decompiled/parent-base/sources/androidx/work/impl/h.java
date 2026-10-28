package androidx.work.impl;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: WorkDatabaseMigrations.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f36220a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f36221b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f36222c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f36223d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f36224e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f36225f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f36226g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f36227h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f36228i = 9;

    /* renamed from: j, reason: collision with root package name */
    public static final int f36229j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f36230k = 11;

    /* renamed from: l, reason: collision with root package name */
    public static final int f36231l = 12;

    /* renamed from: p, reason: collision with root package name */
    private static final String f36235p = "DROP TABLE IF EXISTS alarmInfo";

    /* renamed from: q, reason: collision with root package name */
    private static final String f36236q = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";

    /* renamed from: r, reason: collision with root package name */
    private static final String f36237r = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";

    /* renamed from: s, reason: collision with root package name */
    private static final String f36238s = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";

    /* renamed from: t, reason: collision with root package name */
    private static final String f36239t = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";

    /* renamed from: u, reason: collision with root package name */
    private static final String f36240u = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";

    /* renamed from: v, reason: collision with root package name */
    public static final String f36241v = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";

    /* renamed from: w, reason: collision with root package name */
    private static final String f36242w = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";

    /* renamed from: x, reason: collision with root package name */
    private static final String f36243x = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";

    /* renamed from: m, reason: collision with root package name */
    private static final String f36232m = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";

    /* renamed from: n, reason: collision with root package name */
    private static final String f36233n = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";

    /* renamed from: o, reason: collision with root package name */
    private static final String f36234o = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";

    /* renamed from: y, reason: collision with root package name */
    @o0
    public static androidx.room.migration.b f36244y = new a(1, 2);

    /* renamed from: z, reason: collision with root package name */
    @o0
    public static androidx.room.migration.b f36245z = new b(3, 4);

    @o0
    public static androidx.room.migration.b A = new c(4, 5);

    @o0
    public static androidx.room.migration.b B = new d(6, 7);

    @o0
    public static androidx.room.migration.b C = new e(7, 8);

    @o0
    public static androidx.room.migration.b D = new f(8, 9);

    @o0
    public static androidx.room.migration.b E = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    class a extends androidx.room.migration.b {
        a(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            database.b0("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            database.b0("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            database.b0("DROP TABLE IF EXISTS alarmInfo");
            database.b0("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    class b extends androidx.room.migration.b {
        b(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            database.b0("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    class c extends androidx.room.migration.b {
        c(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            database.b0("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            database.b0("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    class d extends androidx.room.migration.b {
        d(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            database.b0("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    class e extends androidx.room.migration.b {
        e(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            database.b0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    class f extends androidx.room.migration.b {
        f(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            database.b0("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    class g extends androidx.room.migration.b {
        g(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            database.b0("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$h, reason: collision with other inner class name */
    public static class C0642h extends androidx.room.migration.b {

        /* renamed from: a, reason: collision with root package name */
        final Context f36246a;

        public C0642h(@o0 Context context, int startVersion, int endVersion) {
            super(startVersion, endVersion);
            this.f36246a = context;
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            if (this.endVersion >= 10) {
                database.I0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f36246a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public static class i extends androidx.room.migration.b {

        /* renamed from: a, reason: collision with root package name */
        final Context f36247a;

        public i(@o0 Context context) {
            super(9, 10);
            this.f36247a = context;
        }

        @Override // androidx.room.migration.b
        public void migrate(@o0 f3.d database) {
            database.b0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            androidx.work.impl.utils.i.d(this.f36247a, database);
            androidx.work.impl.utils.f.a(this.f36247a, database);
        }
    }

    private h() {
    }
}
