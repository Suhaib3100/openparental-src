package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.j;
import androidx.work.impl.model.i;
import androidx.work.s;

/* compiled from: Alarms.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36044a = s.f("Alarms");

    private a() {
    }

    public static void a(@o0 Context context, @o0 j workManager, @o0 String workSpecId) {
        androidx.work.impl.model.j h4 = workManager.M().h();
        i a5 = h4.a(workSpecId);
        if (a5 != null) {
            b(context, workSpecId, a5.f36323b);
            s.c().a(f36044a, String.format("Removing SystemIdInfo for workSpecId (%s)", workSpecId), new Throwable[0]);
            h4.d(workSpecId);
        }
    }

    private static void b(@o0 Context context, @o0 String workSpecId, int alarmId) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, alarmId, b.b(context, workSpecId), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        s.c().a(f36044a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", workSpecId, Integer.valueOf(alarmId)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(@o0 Context context, @o0 j workManager, @o0 String workSpecId, long triggerAtMillis) {
        WorkDatabase M = workManager.M();
        androidx.work.impl.model.j h4 = M.h();
        i a5 = h4.a(workSpecId);
        if (a5 != null) {
            b(context, workSpecId, a5.f36323b);
            d(context, workSpecId, a5.f36323b, triggerAtMillis);
        } else {
            int b5 = new androidx.work.impl.utils.f(M).b();
            h4.c(new i(workSpecId, b5));
            d(context, workSpecId, b5, triggerAtMillis);
        }
    }

    private static void d(@o0 Context context, @o0 String workSpecId, int alarmId, long triggerAtMillis) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, alarmId, b.b(context, workSpecId), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, triggerAtMillis, service);
        }
    }
}
