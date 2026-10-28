package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.view.LiveData;
import androidx.view.f1;
import androidx.work.impl.WorkDatabase;

/* compiled from: PreferenceUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final String f36490b = "androidx.work.util.preferences";

    /* renamed from: c, reason: collision with root package name */
    public static final String f36491c = "last_cancel_all_time_ms";

    /* renamed from: d, reason: collision with root package name */
    public static final String f36492d = "reschedule_needed";

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f36493a;

    /* compiled from: PreferenceUtils.java */
    class a implements i.a<Long, Long> {
        a() {
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(Long value) {
            return Long.valueOf(value != null ? value.longValue() : 0L);
        }
    }

    public i(@o0 WorkDatabase workDatabase) {
        this.f36493a = workDatabase;
    }

    public static void d(@o0 Context context, @o0 f3.d sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j4 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j5 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sqLiteDatabase.R();
            try {
                sqLiteDatabase.I0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j4)});
                sqLiteDatabase.I0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j5)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.G0();
            } finally {
                sqLiteDatabase.Y0();
            }
        }
    }

    public long a() {
        Long c5 = this.f36493a.f().c("last_cancel_all_time_ms");
        if (c5 != null) {
            return c5.longValue();
        }
        return 0L;
    }

    @o0
    public LiveData<Long> b() {
        return f1.b(this.f36493a.f().a("last_cancel_all_time_ms"), new a());
    }

    public boolean c() {
        Long c5 = this.f36493a.f().c("reschedule_needed");
        return c5 != null && c5.longValue() == 1;
    }

    public void e(final long timeMillis) {
        this.f36493a.f().b(new androidx.work.impl.model.d("last_cancel_all_time_ms", timeMillis));
    }

    public void f(boolean needsReschedule) {
        this.f36493a.f().b(new androidx.work.impl.model.d("reschedule_needed", needsReschedule));
    }
}
