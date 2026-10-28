package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.f0;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    @m1
    static final int f36429g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f36430h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final long f36431i = 300;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36433b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.j f36434c;

    /* renamed from: d, reason: collision with root package name */
    private int f36435d = 0;

    /* renamed from: f, reason: collision with root package name */
    @m1
    static final String f36428f = "ACTION_FORCE_STOP_RESCHEDULE";

    /* renamed from: e, reason: collision with root package name */
    private static final String f36427e = androidx.work.s.f("ForceStopRunnable");

    /* renamed from: j, reason: collision with root package name */
    private static final long f36432j = TimeUnit.DAYS.toMillis(3650);

    @c1({c1.a.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f36436a = androidx.work.s.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@o0 Context context, @q0 Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            androidx.work.s.c().g(f36436a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(@o0 Context context, @o0 androidx.work.impl.j workManager) {
        this.f36433b = context.getApplicationContext();
        this.f36434c = workManager;
    }

    @m1
    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int flags) {
        return PendingIntent.getBroadcast(context, -1, c(context), flags);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d5 = d(context, androidx.core.os.b.i() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f36432j;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d5);
        }
    }

    @m1
    public boolean a() {
        boolean i4 = androidx.work.impl.background.systemjob.g.i(this.f36433b, this.f36434c);
        WorkDatabase M = this.f36434c.M();
        androidx.work.impl.model.s k4 = M.k();
        androidx.work.impl.model.p j4 = M.j();
        M.beginTransaction();
        try {
            List<androidx.work.impl.model.r> x4 = k4.x();
            boolean z4 = (x4 == null || x4.isEmpty()) ? false : true;
            if (z4) {
                for (androidx.work.impl.model.r rVar : x4) {
                    k4.b(f0.a.ENQUEUED, rVar.f36346a);
                    k4.r(rVar.f36346a, -1L);
                }
            }
            j4.c();
            M.setTransactionSuccessful();
            M.endTransaction();
            return z4 || i4;
        } catch (Throwable th) {
            M.endTransaction();
            throw th;
        }
    }

    @m1
    public void b() {
        boolean a5 = a();
        if (h()) {
            androidx.work.s.c().a(f36427e, "Rescheduling Workers.", new Throwable[0]);
            this.f36434c.R();
            this.f36434c.I().f(false);
        } else if (e()) {
            androidx.work.s.c().a(f36427e, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f36434c.R();
        } else if (a5) {
            androidx.work.s.c().a(f36427e, "Found unfinished work, scheduling it.", new Throwable[0]);
            androidx.work.impl.f.b(this.f36434c.F(), this.f36434c.M(), this.f36434c.L());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @m1
    public boolean e() {
        List historicalProcessExitReasons;
        int reason;
        try {
            PendingIntent d5 = d(this.f36433b, androidx.core.os.b.i() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d5 != null) {
                    d5.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f36433b.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        reason = d.a(historicalProcessExitReasons.get(i4)).getReason();
                        if (reason == 10) {
                            return true;
                        }
                    }
                }
            } else if (d5 == null) {
                g(this.f36433b);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e4) {
            e = e4;
            androidx.work.s.c().h(f36427e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e5) {
            e = e5;
            androidx.work.s.c().h(f36427e, "Ignoring exception", e);
            return true;
        }
    }

    @m1
    public boolean f() {
        androidx.work.b F = this.f36434c.F();
        if (TextUtils.isEmpty(F.c())) {
            androidx.work.s.c().a(f36427e, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b5 = k.b(this.f36433b, F);
        androidx.work.s.c().a(f36427e, String.format("Is default app process = %s", Boolean.valueOf(b5)), new Throwable[0]);
        return b5;
    }

    @m1
    boolean h() {
        return this.f36434c.I().c();
    }

    @m1
    public void i(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i4;
        try {
            if (f()) {
                while (true) {
                    androidx.work.impl.i.e(this.f36433b);
                    androidx.work.s.c().a(f36427e, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e4) {
                        i4 = this.f36435d + 1;
                        this.f36435d = i4;
                        if (i4 >= 3) {
                            androidx.work.s c5 = androidx.work.s.c();
                            String str = f36427e;
                            c5.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                            androidx.work.n d5 = this.f36434c.F().d();
                            if (d5 == null) {
                                throw illegalStateException;
                            }
                            androidx.work.s.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                            d5.a(illegalStateException);
                        } else {
                            androidx.work.s.c().a(f36427e, String.format("Retrying after %s", Long.valueOf(i4 * f36431i)), e4);
                            i(this.f36435d * f36431i);
                        }
                    }
                    androidx.work.s.c().a(f36427e, String.format("Retrying after %s", Long.valueOf(i4 * f36431i)), e4);
                    i(this.f36435d * f36431i);
                }
            }
        } finally {
            this.f36434c.Q();
        }
    }
}
