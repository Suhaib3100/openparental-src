package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* compiled from: AlarmManagerCompat.java */
/* loaded from: classes3.dex */
public final class g {

    /* compiled from: AlarmManagerCompat.java */
    @androidx.annotation.x0(21)
    static class a {
        private a() {
        }

        static AlarmManager.AlarmClockInfo a(long j4, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j4, pendingIntent);
        }

        static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* compiled from: AlarmManagerCompat.java */
    @androidx.annotation.x0(23)
    static class b {
        private b() {
        }

        static void a(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i4, j4, pendingIntent);
        }

        static void b(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i4, j4, pendingIntent);
        }
    }

    /* compiled from: AlarmManagerCompat.java */
    @androidx.annotation.x0(31)
    static class c {
        private c() {
        }

        static boolean a(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }

    private g() {
    }

    public static boolean a(@androidx.annotation.o0 AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.a(alarmManager);
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    public static void b(@androidx.annotation.o0 AlarmManager alarmManager, long j4, @androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 PendingIntent pendingIntent2) {
        alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j4, pendingIntent), pendingIntent2);
    }

    public static void c(@androidx.annotation.o0 AlarmManager alarmManager, int i4, long j4, @androidx.annotation.o0 PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i4, j4, pendingIntent);
    }

    @androidx.annotation.w0(expression = "alarmManager.setExact(type, triggerAtMillis, operation)")
    @Deprecated
    public static void d(@androidx.annotation.o0 AlarmManager alarmManager, int i4, long j4, @androidx.annotation.o0 PendingIntent pendingIntent) {
        alarmManager.setExact(i4, j4, pendingIntent);
    }

    public static void e(@androidx.annotation.o0 AlarmManager alarmManager, int i4, long j4, @androidx.annotation.o0 PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i4, j4, pendingIntent);
    }
}
