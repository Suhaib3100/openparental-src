package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;

/* compiled from: AlarmManagerCompat.java */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: AlarmManagerCompat.java */
    @androidx.annotation.x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(AlarmManager alarmManager, int i5, long j5, PendingIntent pendingIntent) {
            alarmManager.setExact(i5, j5, pendingIntent);
        }
    }

    /* compiled from: AlarmManagerCompat.java */
    @androidx.annotation.x0(21)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static AlarmManager.AlarmClockInfo a(long j5, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j5, pendingIntent);
        }

        @androidx.annotation.u
        static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* compiled from: AlarmManagerCompat.java */
    @androidx.annotation.x0(23)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(AlarmManager alarmManager, int i5, long j5, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i5, j5, pendingIntent);
        }

        @androidx.annotation.u
        static void b(AlarmManager alarmManager, int i5, long j5, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i5, j5, pendingIntent);
        }
    }

    private k() {
    }

    @SuppressLint({"MissingPermission"})
    public static void a(@androidx.annotation.o0 AlarmManager alarmManager, long j5, @androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 PendingIntent pendingIntent2) {
        b.b(alarmManager, b.a(j5, pendingIntent), pendingIntent2);
    }

    public static void b(@androidx.annotation.o0 AlarmManager alarmManager, int i5, long j5, @androidx.annotation.o0 PendingIntent pendingIntent) {
        c.a(alarmManager, i5, j5, pendingIntent);
    }

    public static void c(@androidx.annotation.o0 AlarmManager alarmManager, int i5, long j5, @androidx.annotation.o0 PendingIntent pendingIntent) {
        a.a(alarmManager, i5, j5, pendingIntent);
    }

    public static void d(@androidx.annotation.o0 AlarmManager alarmManager, int i5, long j5, @androidx.annotation.o0 PendingIntent pendingIntent) {
        c.b(alarmManager, i5, j5, pendingIntent);
    }
}
