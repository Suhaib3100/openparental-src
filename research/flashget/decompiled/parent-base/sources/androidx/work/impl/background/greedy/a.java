package androidx.work.impl.background.greedy;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.d0;
import androidx.work.impl.model.r;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DelayedWorkTracker.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    static final String f36014d = s.f("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final b f36015a;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f36016b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Runnable> f36017c = new HashMap();

    /* compiled from: DelayedWorkTracker.java */
    /* renamed from: androidx.work.impl.background.greedy.a$a, reason: collision with other inner class name */
    class RunnableC0640a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f36018b;

        RunnableC0640a(final r val$workSpec) {
            this.f36018b = val$workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.c().a(a.f36014d, String.format("Scheduling work %s", this.f36018b.f36346a), new Throwable[0]);
            a.this.f36015a.c(this.f36018b);
        }
    }

    public a(@o0 b scheduler, @o0 d0 runnableScheduler) {
        this.f36015a = scheduler;
        this.f36016b = runnableScheduler;
    }

    public void a(@o0 final r workSpec) {
        Runnable remove = this.f36017c.remove(workSpec.f36346a);
        if (remove != null) {
            this.f36016b.a(remove);
        }
        RunnableC0640a runnableC0640a = new RunnableC0640a(workSpec);
        this.f36017c.put(workSpec.f36346a, runnableC0640a);
        this.f36016b.b(workSpec.a() - System.currentTimeMillis(), runnableC0640a);
    }

    public void b(@o0 String workSpecId) {
        Runnable remove = this.f36017c.remove(workSpecId);
        if (remove != null) {
            this.f36016b.a(remove);
        }
    }
}
