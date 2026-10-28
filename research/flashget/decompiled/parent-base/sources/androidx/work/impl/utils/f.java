package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.impl.WorkDatabase;

/* compiled from: IdGenerator.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final int f36449b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final String f36450c = "androidx.work.util.id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f36451d = "next_job_scheduler_id";

    /* renamed from: e, reason: collision with root package name */
    public static final String f36452e = "next_alarm_manager_id";

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f36453a;

    public f(@o0 WorkDatabase workDatabase) {
        this.f36453a = workDatabase;
    }

    public static void a(@o0 Context context, @o0 f3.d sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i4 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i5 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.R();
            try {
                sqLiteDatabase.I0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i4)});
                sqLiteDatabase.I0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.G0();
            } finally {
                sqLiteDatabase.Y0();
            }
        }
    }

    private int c(String key) {
        this.f36453a.beginTransaction();
        try {
            Long c5 = this.f36453a.f().c(key);
            int i4 = 0;
            int intValue = c5 != null ? c5.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i4 = intValue + 1;
            }
            e(key, i4);
            this.f36453a.setTransactionSuccessful();
            this.f36453a.endTransaction();
            return intValue;
        } catch (Throwable th) {
            this.f36453a.endTransaction();
            throw th;
        }
    }

    private void e(String key, int value) {
        this.f36453a.f().b(new androidx.work.impl.model.d(key, value));
    }

    public int b() {
        int c5;
        synchronized (f.class) {
            c5 = c("next_alarm_manager_id");
        }
        return c5;
    }

    public int d(int minInclusive, int maxInclusive) {
        synchronized (f.class) {
            int c5 = c("next_job_scheduler_id");
            if (c5 >= minInclusive && c5 <= maxInclusive) {
                minInclusive = c5;
            }
            e("next_job_scheduler_id", minInclusive + 1);
        }
        return minInclusive;
    }
}
