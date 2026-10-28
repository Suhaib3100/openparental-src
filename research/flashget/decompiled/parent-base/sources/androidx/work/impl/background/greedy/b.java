package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.work.f0;
import androidx.work.impl.constraints.c;
import androidx.work.impl.constraints.d;
import androidx.work.impl.e;
import androidx.work.impl.j;
import androidx.work.impl.model.r;
import androidx.work.impl.utils.k;
import androidx.work.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: GreedyScheduler.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b implements e, c, androidx.work.impl.b {

    /* renamed from: j, reason: collision with root package name */
    private static final String f36020j = s.f("GreedyScheduler");

    /* renamed from: b, reason: collision with root package name */
    private final Context f36021b;

    /* renamed from: c, reason: collision with root package name */
    private final j f36022c;

    /* renamed from: d, reason: collision with root package name */
    private final d f36023d;

    /* renamed from: f, reason: collision with root package name */
    private a f36025f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36026g;

    /* renamed from: i, reason: collision with root package name */
    Boolean f36028i;

    /* renamed from: e, reason: collision with root package name */
    private final Set<r> f36024e = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final Object f36027h = new Object();

    public b(@o0 Context context, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor, @o0 j workManagerImpl) {
        this.f36021b = context;
        this.f36022c = workManagerImpl;
        this.f36023d = new d(context, taskExecutor, this);
        this.f36025f = new a(this, configuration.k());
    }

    private void g() {
        this.f36028i = Boolean.valueOf(k.b(this.f36021b, this.f36022c.F()));
    }

    private void h() {
        if (this.f36026g) {
            return;
        }
        this.f36022c.J().c(this);
        this.f36026g = true;
    }

    private void i(@o0 String workSpecId) {
        synchronized (this.f36027h) {
            try {
                Iterator<r> it = this.f36024e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r next = it.next();
                    if (next.f36346a.equals(workSpecId)) {
                        s.c().a(f36020j, String.format("Stopping tracking for %s", workSpecId), new Throwable[0]);
                        this.f36024e.remove(next);
                        this.f36023d.d(this.f36024e);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.e
    public void a(@o0 String workSpecId) {
        if (this.f36028i == null) {
            g();
        }
        if (!this.f36028i.booleanValue()) {
            s.c().d(f36020j, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        s.c().a(f36020j, String.format("Cancelling work ID %s", workSpecId), new Throwable[0]);
        a aVar = this.f36025f;
        if (aVar != null) {
            aVar.b(workSpecId);
        }
        this.f36022c.X(workSpecId);
    }

    @Override // androidx.work.impl.constraints.c
    public void b(@o0 List<String> workSpecIds) {
        for (String str : workSpecIds) {
            s.c().a(f36020j, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f36022c.X(str);
        }
    }

    @Override // androidx.work.impl.e
    public void c(@o0 r... workSpecs) {
        if (this.f36028i == null) {
            g();
        }
        if (!this.f36028i.booleanValue()) {
            s.c().d(f36020j, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (r rVar : workSpecs) {
            long a5 = rVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (rVar.f36347b == f0.a.ENQUEUED) {
                if (currentTimeMillis < a5) {
                    a aVar = this.f36025f;
                    if (aVar != null) {
                        aVar.a(rVar);
                    }
                } else if (!rVar.b()) {
                    s.c().a(f36020j, String.format("Starting work for %s", rVar.f36346a), new Throwable[0]);
                    this.f36022c.U(rVar.f36346a);
                } else if (rVar.f36355j.h()) {
                    s.c().a(f36020j, String.format("Ignoring WorkSpec %s, Requires device idle.", rVar), new Throwable[0]);
                } else if (rVar.f36355j.e()) {
                    s.c().a(f36020j, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", rVar), new Throwable[0]);
                } else {
                    hashSet.add(rVar);
                    hashSet2.add(rVar.f36346a);
                }
            }
        }
        synchronized (this.f36027h) {
            try {
                if (!hashSet.isEmpty()) {
                    s.c().a(f36020j, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f36024e.addAll(hashSet);
                    this.f36023d.d(this.f36024e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.e
    public boolean d() {
        return false;
    }

    @Override // androidx.work.impl.b
    public void e(@o0 String workSpecId, boolean needsReschedule) {
        i(workSpecId);
    }

    @Override // androidx.work.impl.constraints.c
    public void f(@o0 List<String> workSpecIds) {
        for (String str : workSpecIds) {
            s.c().a(f36020j, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f36022c.U(str);
        }
    }

    @m1
    public void j(@o0 a delayedWorkTracker) {
        this.f36025f = delayedWorkTracker;
    }

    @m1
    public b(@o0 Context context, @o0 j workManagerImpl, @o0 d workConstraintsTracker) {
        this.f36021b = context;
        this.f36022c = workManagerImpl;
        this.f36023d = workConstraintsTracker;
    }
}
