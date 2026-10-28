package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.model.r;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b implements androidx.work.impl.b {

    /* renamed from: n, reason: collision with root package name */
    static final long f36054n = 600000;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36055b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, androidx.work.impl.b> f36056c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Object f36057d = new Object();

    /* renamed from: f, reason: collision with root package name */
    static final String f36046f = "ACTION_SCHEDULE_WORK";

    /* renamed from: g, reason: collision with root package name */
    static final String f36047g = "ACTION_DELAY_MET";

    /* renamed from: h, reason: collision with root package name */
    static final String f36048h = "ACTION_STOP_WORK";

    /* renamed from: i, reason: collision with root package name */
    static final String f36049i = "ACTION_CONSTRAINTS_CHANGED";

    /* renamed from: j, reason: collision with root package name */
    static final String f36050j = "ACTION_RESCHEDULE";

    /* renamed from: k, reason: collision with root package name */
    static final String f36051k = "ACTION_EXECUTION_COMPLETED";

    /* renamed from: l, reason: collision with root package name */
    private static final String f36052l = "KEY_WORKSPEC_ID";

    /* renamed from: m, reason: collision with root package name */
    private static final String f36053m = "KEY_NEEDS_RESCHEDULE";

    /* renamed from: e, reason: collision with root package name */
    private static final String f36045e = s.f("CommandHandler");

    b(@o0 Context context) {
        this.f36055b = context;
    }

    static Intent a(@o0 Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(@o0 Context context, @o0 String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    static Intent c(@o0 Context context, @o0 String workSpecId, boolean needsReschedule) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", needsReschedule);
        return intent;
    }

    static Intent d(@o0 Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(@o0 Context context, @o0 String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    static Intent g(@o0 Context context, @o0 String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    private void h(@o0 Intent intent, int startId, @o0 e dispatcher) {
        s.c().a(f36045e, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f36055b, startId, dispatcher).a();
    }

    private void i(@o0 Intent intent, int startId, @o0 e dispatcher) {
        Bundle extras = intent.getExtras();
        synchronized (this.f36057d) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                s c5 = s.c();
                String str = f36045e;
                c5.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f36056c.containsKey(string)) {
                    s.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    d dVar = new d(this.f36055b, startId, string, dispatcher);
                    this.f36056c.put(string, dVar);
                    dVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void j(@o0 Intent intent, int startId) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z4 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        s.c().a(f36045e, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(startId)), new Throwable[0]);
        e(string, z4);
    }

    private void k(@o0 Intent intent, int startId, @o0 e dispatcher) {
        s.c().a(f36045e, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(startId)), new Throwable[0]);
        dispatcher.g().R();
    }

    private void l(@o0 Intent intent, int startId, @o0 e dispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        s c5 = s.c();
        String str = f36045e;
        c5.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase M = dispatcher.g().M();
        M.beginTransaction();
        try {
            r k4 = M.k().k(string);
            if (k4 == null) {
                s.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (k4.f36347b.isFinished()) {
                s.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long a5 = k4.a();
            if (k4.b()) {
                s.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a5)), new Throwable[0]);
                a.c(this.f36055b, dispatcher.g(), string, a5);
                dispatcher.k(new e.b(dispatcher, a(this.f36055b), startId));
            } else {
                s.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a5)), new Throwable[0]);
                a.c(this.f36055b, dispatcher.g(), string, a5);
            }
            M.setTransactionSuccessful();
        } finally {
            M.endTransaction();
        }
    }

    private void m(@o0 Intent intent, @o0 e dispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        s.c().a(f36045e, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dispatcher.g().X(string);
        a.a(this.f36055b, dispatcher.g(), string);
        dispatcher.e(string, false);
    }

    private static boolean n(@q0 Bundle bundle, @o0 String... keys) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : keys) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.work.impl.b
    public void e(@o0 String workSpecId, boolean needsReschedule) {
        synchronized (this.f36057d) {
            try {
                androidx.work.impl.b remove = this.f36056c.remove(workSpecId);
                if (remove != null) {
                    remove.e(workSpecId, needsReschedule);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean o() {
        boolean z4;
        synchronized (this.f36057d) {
            z4 = !this.f36056c.isEmpty();
        }
        return z4;
    }

    @n1
    void p(@o0 Intent intent, int startId, @o0 e dispatcher) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, startId, dispatcher);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, startId, dispatcher);
            return;
        }
        if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            s.c().b(f36045e, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, startId, dispatcher);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, startId, dispatcher);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, dispatcher);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, startId);
        } else {
            s.c().h(f36045e, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
