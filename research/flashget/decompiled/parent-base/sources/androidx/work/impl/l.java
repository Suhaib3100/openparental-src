package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.f0;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.r;
import androidx.work.impl.model.v;
import androidx.work.impl.utils.t;
import androidx.work.impl.utils.u;
import androidx.work.o;
import androidx.work.s;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class l implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    static final String f36272u = s.f("WorkerWrapper");

    /* renamed from: b, reason: collision with root package name */
    Context f36273b;

    /* renamed from: c, reason: collision with root package name */
    private String f36274c;

    /* renamed from: d, reason: collision with root package name */
    private List<e> f36275d;

    /* renamed from: e, reason: collision with root package name */
    private WorkerParameters.a f36276e;

    /* renamed from: f, reason: collision with root package name */
    r f36277f;

    /* renamed from: g, reason: collision with root package name */
    ListenableWorker f36278g;

    /* renamed from: h, reason: collision with root package name */
    androidx.work.impl.utils.taskexecutor.a f36279h;

    /* renamed from: j, reason: collision with root package name */
    private androidx.work.b f36281j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.work.impl.foreground.a f36282k;

    /* renamed from: l, reason: collision with root package name */
    private WorkDatabase f36283l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.work.impl.model.s f36284m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.work.impl.model.b f36285n;

    /* renamed from: o, reason: collision with root package name */
    private v f36286o;

    /* renamed from: p, reason: collision with root package name */
    private List<String> f36287p;

    /* renamed from: q, reason: collision with root package name */
    private String f36288q;

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f36291t;

    /* renamed from: i, reason: collision with root package name */
    @o0
    ListenableWorker.a f36280i = new ListenableWorker.a.C0638a();

    /* renamed from: r, reason: collision with root package name */
    @o0
    androidx.work.impl.utils.futures.c<Boolean> f36289r = androidx.work.impl.utils.futures.c.u();

    /* renamed from: s, reason: collision with root package name */
    @q0
    ListenableFuture<ListenableWorker.a> f36290s = null;

    /* compiled from: WorkerWrapper.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ListenableFuture f36292b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36293c;

        a(final ListenableFuture val$runExpedited, final androidx.work.impl.utils.futures.c val$future) {
            this.f36292b = val$runExpedited;
            this.f36293c = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36292b.get();
                s.c().a(l.f36272u, String.format("Starting work for %s", l.this.f36277f.f36348c), new Throwable[0]);
                l lVar = l.this;
                lVar.f36290s = lVar.f36278g.w();
                this.f36293c.r(l.this.f36290s);
            } catch (Throwable th) {
                this.f36293c.q(th);
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36295b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36296c;

        b(final androidx.work.impl.utils.futures.c val$future, final String val$workDescription) {
            this.f36295b = val$future;
            this.f36296c = val$workDescription;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f36295b.get();
                    if (aVar == null) {
                        s.c().b(l.f36272u, String.format("%s returned a null result. Treating it as a failure.", l.this.f36277f.f36348c), new Throwable[0]);
                    } else {
                        s.c().a(l.f36272u, String.format("%s returned a %s result.", l.this.f36277f.f36348c, aVar), new Throwable[0]);
                        l.this.f36280i = aVar;
                    }
                } catch (InterruptedException e4) {
                    e = e4;
                    s.c().b(l.f36272u, String.format("%s failed because it threw an exception/error", this.f36296c), e);
                } catch (CancellationException e5) {
                    s.c().d(l.f36272u, String.format("%s was cancelled", this.f36296c), e5);
                } catch (ExecutionException e6) {
                    e = e6;
                    s.c().b(l.f36272u, String.format("%s failed because it threw an exception/error", this.f36296c), e);
                }
                l.this.f();
            } catch (Throwable th) {
                l.this.f();
                throw th;
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    @c1({c1.a.LIBRARY_GROUP})
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        Context f36298a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        ListenableWorker f36299b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        androidx.work.impl.foreground.a f36300c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        androidx.work.impl.utils.taskexecutor.a f36301d;

        /* renamed from: e, reason: collision with root package name */
        @o0
        androidx.work.b f36302e;

        /* renamed from: f, reason: collision with root package name */
        @o0
        WorkDatabase f36303f;

        /* renamed from: g, reason: collision with root package name */
        @o0
        String f36304g;

        /* renamed from: h, reason: collision with root package name */
        List<e> f36305h;

        /* renamed from: i, reason: collision with root package name */
        @o0
        WorkerParameters.a f36306i = new WorkerParameters.a();

        public c(@o0 Context context, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a workTaskExecutor, @o0 androidx.work.impl.foreground.a foregroundProcessor, @o0 WorkDatabase database, @o0 String workSpecId) {
            this.f36298a = context.getApplicationContext();
            this.f36301d = workTaskExecutor;
            this.f36300c = foregroundProcessor;
            this.f36302e = configuration;
            this.f36303f = database;
            this.f36304g = workSpecId;
        }

        @o0
        public l a() {
            return new l(this);
        }

        @o0
        public c b(@q0 WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.f36306i = runtimeExtras;
            }
            return this;
        }

        @o0
        public c c(@o0 List<e> schedulers) {
            this.f36305h = schedulers;
            return this;
        }

        @o0
        @m1
        public c d(@o0 ListenableWorker worker) {
            this.f36299b = worker;
            return this;
        }
    }

    l(@o0 c builder) {
        this.f36273b = builder.f36298a;
        this.f36279h = builder.f36301d;
        this.f36282k = builder.f36300c;
        this.f36274c = builder.f36304g;
        this.f36275d = builder.f36305h;
        this.f36276e = builder.f36306i;
        this.f36278g = builder.f36299b;
        this.f36281j = builder.f36302e;
        WorkDatabase workDatabase = builder.f36303f;
        this.f36283l = workDatabase;
        this.f36284m = workDatabase.k();
        this.f36285n = this.f36283l.b();
        this.f36286o = this.f36283l.l();
    }

    private String a(List<String> tags) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f36274c);
        sb.append(", tags={ ");
        boolean z4 = true;
        for (String str : tags) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a result) {
        if (result instanceof ListenableWorker.a.c) {
            s.c().d(f36272u, String.format("Worker result SUCCESS for %s", this.f36288q), new Throwable[0]);
            if (this.f36277f.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (result instanceof ListenableWorker.a.b) {
            s.c().d(f36272u, String.format("Worker result RETRY for %s", this.f36288q), new Throwable[0]);
            g();
            return;
        }
        s.c().d(f36272u, String.format("Worker result FAILURE for %s", this.f36288q), new Throwable[0]);
        if (this.f36277f.d()) {
            h();
        } else {
            l();
        }
    }

    private void e(String workSpecId) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            if (this.f36284m.j(str) != f0.a.CANCELLED) {
                this.f36284m.b(f0.a.FAILED, str);
            }
            linkedList.addAll(this.f36285n.b(str));
        }
    }

    private void g() {
        this.f36283l.beginTransaction();
        try {
            this.f36284m.b(f0.a.ENQUEUED, this.f36274c);
            this.f36284m.F(this.f36274c, System.currentTimeMillis());
            this.f36284m.r(this.f36274c, -1L);
            this.f36283l.setTransactionSuccessful();
        } finally {
            this.f36283l.endTransaction();
            i(true);
        }
    }

    private void h() {
        this.f36283l.beginTransaction();
        try {
            this.f36284m.F(this.f36274c, System.currentTimeMillis());
            this.f36284m.b(f0.a.ENQUEUED, this.f36274c);
            this.f36284m.B(this.f36274c);
            this.f36284m.r(this.f36274c, -1L);
            this.f36283l.setTransactionSuccessful();
        } finally {
            this.f36283l.endTransaction();
            i(false);
        }
    }

    private void i(final boolean needsReschedule) {
        ListenableWorker listenableWorker;
        this.f36283l.beginTransaction();
        try {
            if (!this.f36283l.k().A()) {
                androidx.work.impl.utils.h.c(this.f36273b, RescheduleReceiver.class, false);
            }
            if (needsReschedule) {
                this.f36284m.b(f0.a.ENQUEUED, this.f36274c);
                this.f36284m.r(this.f36274c, -1L);
            }
            if (this.f36277f != null && (listenableWorker = this.f36278g) != null && listenableWorker.o()) {
                this.f36282k.a(this.f36274c);
            }
            this.f36283l.setTransactionSuccessful();
            this.f36283l.endTransaction();
            this.f36289r.p(Boolean.valueOf(needsReschedule));
        } catch (Throwable th) {
            this.f36283l.endTransaction();
            throw th;
        }
    }

    private void j() {
        f0.a j4 = this.f36284m.j(this.f36274c);
        if (j4 == f0.a.RUNNING) {
            s.c().a(f36272u, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f36274c), new Throwable[0]);
            i(true);
        } else {
            s.c().a(f36272u, String.format("Status for %s is %s; not doing any work", this.f36274c, j4), new Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.f b5;
        if (n()) {
            return;
        }
        this.f36283l.beginTransaction();
        try {
            r k4 = this.f36284m.k(this.f36274c);
            this.f36277f = k4;
            if (k4 == null) {
                s.c().b(f36272u, String.format("Didn't find WorkSpec for id %s", this.f36274c), new Throwable[0]);
                i(false);
                this.f36283l.setTransactionSuccessful();
                return;
            }
            if (k4.f36347b != f0.a.ENQUEUED) {
                j();
                this.f36283l.setTransactionSuccessful();
                s.c().a(f36272u, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f36277f.f36348c), new Throwable[0]);
                return;
            }
            if (k4.d() || this.f36277f.c()) {
                long currentTimeMillis = System.currentTimeMillis();
                r rVar = this.f36277f;
                if (rVar.f36359n != 0 && currentTimeMillis < rVar.a()) {
                    s.c().a(f36272u, String.format("Delaying execution for %s because it is being executed before schedule.", this.f36277f.f36348c), new Throwable[0]);
                    i(true);
                    this.f36283l.setTransactionSuccessful();
                    return;
                }
            }
            this.f36283l.setTransactionSuccessful();
            this.f36283l.endTransaction();
            if (this.f36277f.d()) {
                b5 = this.f36277f.f36350e;
            } else {
                o b6 = this.f36281j.f().b(this.f36277f.f36349d);
                if (b6 == null) {
                    s.c().b(f36272u, String.format("Could not create Input Merger %s", this.f36277f.f36349d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f36277f.f36350e);
                    arrayList.addAll(this.f36284m.n(this.f36274c));
                    b5 = b6.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f36274c), b5, this.f36287p, this.f36276e, this.f36277f.f36356k, this.f36281j.e(), this.f36279h, this.f36281j.m(), new androidx.work.impl.utils.v(this.f36283l, this.f36279h), new u(this.f36283l, this.f36282k, this.f36279h));
            if (this.f36278g == null) {
                this.f36278g = this.f36281j.m().b(this.f36273b, this.f36277f.f36348c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f36278g;
            if (listenableWorker == null) {
                s.c().b(f36272u, String.format("Could not create Worker %s", this.f36277f.f36348c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.q()) {
                s.c().b(f36272u, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f36277f.f36348c), new Throwable[0]);
                l();
                return;
            }
            this.f36278g.v();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            androidx.work.impl.utils.futures.c u4 = androidx.work.impl.utils.futures.c.u();
            t tVar = new t(this.f36273b, this.f36277f, this.f36278g, workerParameters.b(), this.f36279h);
            this.f36279h.a().execute(tVar);
            ListenableFuture<Void> a5 = tVar.a();
            a5.n2(new a(a5, u4), this.f36279h.a());
            u4.n2(new b(u4, this.f36288q), this.f36279h.d());
        } finally {
            this.f36283l.endTransaction();
        }
    }

    private void m() {
        this.f36283l.beginTransaction();
        try {
            this.f36284m.b(f0.a.SUCCEEDED, this.f36274c);
            this.f36284m.u(this.f36274c, ((ListenableWorker.a.c) this.f36280i).c());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f36285n.b(this.f36274c)) {
                if (this.f36284m.j(str) == f0.a.BLOCKED && this.f36285n.c(str)) {
                    s.c().d(f36272u, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f36284m.b(f0.a.ENQUEUED, str);
                    this.f36284m.F(str, currentTimeMillis);
                }
            }
            this.f36283l.setTransactionSuccessful();
            this.f36283l.endTransaction();
            i(false);
        } catch (Throwable th) {
            this.f36283l.endTransaction();
            i(false);
            throw th;
        }
    }

    private boolean n() {
        if (!this.f36291t) {
            return false;
        }
        s.c().a(f36272u, String.format("Work interrupted for %s", this.f36288q), new Throwable[0]);
        if (this.f36284m.j(this.f36274c) == null) {
            i(false);
        } else {
            i(!r0.isFinished());
        }
        return true;
    }

    private boolean o() {
        boolean z4;
        this.f36283l.beginTransaction();
        try {
            if (this.f36284m.j(this.f36274c) == f0.a.ENQUEUED) {
                this.f36284m.b(f0.a.RUNNING, this.f36274c);
                this.f36284m.E(this.f36274c);
                z4 = true;
            } else {
                z4 = false;
            }
            this.f36283l.setTransactionSuccessful();
            this.f36283l.endTransaction();
            return z4;
        } catch (Throwable th) {
            this.f36283l.endTransaction();
            throw th;
        }
    }

    @o0
    public ListenableFuture<Boolean> b() {
        return this.f36289r;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void d() {
        boolean z4;
        this.f36291t = true;
        n();
        ListenableFuture<ListenableWorker.a> listenableFuture = this.f36290s;
        if (listenableFuture != null) {
            z4 = listenableFuture.isDone();
            this.f36290s.cancel(true);
        } else {
            z4 = false;
        }
        ListenableWorker listenableWorker = this.f36278g;
        if (listenableWorker != null && !z4) {
            listenableWorker.x();
        } else {
            s.c().a(f36272u, String.format("WorkSpec %s is already done. Not interrupting.", this.f36277f), new Throwable[0]);
        }
    }

    void f() {
        if (!n()) {
            this.f36283l.beginTransaction();
            try {
                f0.a j4 = this.f36284m.j(this.f36274c);
                this.f36283l.j().a(this.f36274c);
                if (j4 == null) {
                    i(false);
                } else if (j4 == f0.a.RUNNING) {
                    c(this.f36280i);
                } else if (!j4.isFinished()) {
                    g();
                }
                this.f36283l.setTransactionSuccessful();
                this.f36283l.endTransaction();
            } catch (Throwable th) {
                this.f36283l.endTransaction();
                throw th;
            }
        }
        List<e> list = this.f36275d;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(this.f36274c);
            }
            f.b(this.f36281j, this.f36283l, this.f36275d);
        }
    }

    @m1
    void l() {
        this.f36283l.beginTransaction();
        try {
            e(this.f36274c);
            this.f36284m.u(this.f36274c, ((ListenableWorker.a.C0638a) this.f36280i).c());
            this.f36283l.setTransactionSuccessful();
        } finally {
            this.f36283l.endTransaction();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    @n1
    public void run() {
        List<String> a5 = this.f36286o.a(this.f36274c);
        this.f36287p = a5;
        this.f36288q = a(a5);
        k();
    }
}
