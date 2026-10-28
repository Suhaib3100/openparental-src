package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.view.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c0;
import androidx.work.e0;
import androidx.work.f0;
import androidx.work.g0;
import androidx.work.h0;
import androidx.work.i0;
import androidx.work.impl.model.r;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.m;
import androidx.work.impl.utils.o;
import androidx.work.impl.utils.p;
import androidx.work.impl.utils.q;
import androidx.work.s;
import androidx.work.u;
import androidx.work.w;
import androidx.work.z;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManagerImpl.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class j extends g0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int f36252l = 22;

    /* renamed from: m, reason: collision with root package name */
    public static final int f36253m = 23;

    /* renamed from: a, reason: collision with root package name */
    private Context f36258a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.b f36259b;

    /* renamed from: c, reason: collision with root package name */
    private WorkDatabase f36260c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.work.impl.utils.taskexecutor.a f36261d;

    /* renamed from: e, reason: collision with root package name */
    private List<e> f36262e;

    /* renamed from: f, reason: collision with root package name */
    private d f36263f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.work.impl.utils.i f36264g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36265h;

    /* renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f36266i;

    /* renamed from: j, reason: collision with root package name */
    private volatile androidx.work.multiprocess.e f36267j;

    /* renamed from: n, reason: collision with root package name */
    public static final String f36254n = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* renamed from: k, reason: collision with root package name */
    private static final String f36251k = s.f("WorkManagerImpl");

    /* renamed from: o, reason: collision with root package name */
    private static j f36255o = null;

    /* renamed from: p, reason: collision with root package name */
    private static j f36256p = null;

    /* renamed from: q, reason: collision with root package name */
    private static final Object f36257q = new Object();

    /* compiled from: WorkManagerImpl.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f36268b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.i f36269c;

        a(final androidx.work.impl.utils.futures.c val$future, final androidx.work.impl.utils.i val$preferenceUtils) {
            this.f36268b = val$future;
            this.f36269c = val$preferenceUtils;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36268b.p(Long.valueOf(this.f36269c.a()));
            } catch (Throwable th) {
                this.f36268b.q(th);
            }
        }
    }

    /* compiled from: WorkManagerImpl.java */
    class b implements i.a<List<r.c>, f0> {
        b() {
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 apply(List<r.c> input) {
            if (input == null || input.size() <= 0) {
                return null;
            }
            return input.get(0).a();
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public j(@o0 Context context, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a workTaskExecutor) {
        this(context, configuration, workTaskExecutor, context.getResources().getBoolean(c0.a.f35947d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (androidx.work.impl.j.f36256p != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        androidx.work.impl.j.f36256p = new androidx.work.impl.j(r4, r5, new androidx.work.impl.utils.taskexecutor.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        androidx.work.impl.j.f36255o = androidx.work.impl.j.f36256p;
     */
    @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A(@androidx.annotation.o0 android.content.Context r4, @androidx.annotation.o0 androidx.work.b r5) {
        /*
            java.lang.Object r0 = androidx.work.impl.j.f36257q
            monitor-enter(r0)
            androidx.work.impl.j r1 = androidx.work.impl.j.f36255o     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            androidx.work.impl.j r2 = androidx.work.impl.j.f36256p     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L36
        L16:
            if (r1 != 0) goto L34
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.j r1 = androidx.work.impl.j.f36256p     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L30
            androidx.work.impl.j r1 = new androidx.work.impl.j     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.utils.taskexecutor.b r2 = new androidx.work.impl.utils.taskexecutor.b     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.j.f36256p = r1     // Catch: java.lang.Throwable -> L14
        L30:
            androidx.work.impl.j r4 = androidx.work.impl.j.f36256p     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.j.f36255o = r4     // Catch: java.lang.Throwable -> L14
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.j.A(android.content.Context, androidx.work.b):void");
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP})
    @Deprecated
    public static j G() {
        synchronized (f36257q) {
            try {
                j jVar = f36255o;
                if (jVar != null) {
                    return jVar;
                }
                return f36256p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static j H(@o0 Context context) {
        j G;
        synchronized (f36257q) {
            try {
                G = G();
                if (G == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof b.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    A(applicationContext, ((b.c) applicationContext).a());
                    G = H(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G;
    }

    private void P(@o0 Context context, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a workTaskExecutor, @o0 WorkDatabase workDatabase, @o0 List<e> schedulers, @o0 d processor) {
        Context applicationContext = context.getApplicationContext();
        this.f36258a = applicationContext;
        this.f36259b = configuration;
        this.f36261d = workTaskExecutor;
        this.f36260c = workDatabase;
        this.f36262e = schedulers;
        this.f36263f = processor;
        this.f36264g = new androidx.work.impl.utils.i(workDatabase);
        this.f36265h = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f36261d.b(new ForceStopRunnable(applicationContext, this));
    }

    @c1({c1.a.LIBRARY_GROUP})
    public static void S(@q0 j delegate) {
        synchronized (f36257q) {
            f36255o = delegate;
        }
    }

    private void Y() {
        try {
            this.f36267j = (androidx.work.multiprocess.e) Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, j.class).newInstance(this.f36258a, this);
        } catch (Throwable th) {
            s.c().a(f36251k, "Unable to initialize multi-process support", th);
        }
    }

    @Override // androidx.work.g0
    @o0
    public w B() {
        androidx.work.impl.utils.l lVar = new androidx.work.impl.utils.l(this);
        this.f36261d.b(lVar);
        return lVar.a();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public List<e> C(@o0 Context context, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        return Arrays.asList(f.a(context, this), new androidx.work.impl.background.greedy.b(context, configuration, taskExecutor, this));
    }

    @o0
    public g D(@o0 String uniqueWorkName, @o0 androidx.work.j existingPeriodicWorkPolicy, @o0 z periodicWork) {
        return new g(this, uniqueWorkName, existingPeriodicWorkPolicy == androidx.work.j.KEEP ? androidx.work.k.KEEP : androidx.work.k.REPLACE, Collections.singletonList(periodicWork), null);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public Context E() {
        return this.f36258a;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public androidx.work.b F() {
        return this.f36259b;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public androidx.work.impl.utils.i I() {
        return this.f36264g;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public d J() {
        return this.f36263f;
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public androidx.work.multiprocess.e K() {
        if (this.f36267j == null) {
            synchronized (f36257q) {
                try {
                    if (this.f36267j == null) {
                        Y();
                        if (this.f36267j == null && !TextUtils.isEmpty(this.f36259b.c())) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f36267j;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public List<e> L() {
        return this.f36262e;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public WorkDatabase M() {
        return this.f36260c;
    }

    LiveData<List<f0>> N(@o0 List<String> workSpecIds) {
        return androidx.work.impl.utils.g.a(this.f36260c.k().D(workSpecIds), r.f36345u, this.f36261d);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public androidx.work.impl.utils.taskexecutor.a O() {
        return this.f36261d;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void Q() {
        synchronized (f36257q) {
            try {
                this.f36265h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f36266i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f36266i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void R() {
        androidx.work.impl.background.systemjob.g.b(E());
        M().k().q();
        f.b(F(), M(), L());
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void T(@o0 BroadcastReceiver.PendingResult rescheduleReceiverResult) {
        synchronized (f36257q) {
            try {
                this.f36266i = rescheduleReceiverResult;
                if (this.f36265h) {
                    rescheduleReceiverResult.finish();
                    this.f36266i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void U(@o0 String workSpecId) {
        V(workSpecId, null);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void V(@o0 String workSpecId, @q0 WorkerParameters.a runtimeExtras) {
        this.f36261d.b(new o(this, workSpecId, runtimeExtras));
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void W(@o0 String workSpecId) {
        this.f36261d.b(new q(this, workSpecId, true));
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void X(@o0 String workSpecId) {
        this.f36261d.b(new q(this, workSpecId, false));
    }

    @Override // androidx.work.g0
    @o0
    public e0 b(@o0 String uniqueWorkName, @o0 androidx.work.k existingWorkPolicy, @o0 List<u> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new g(this, uniqueWorkName, existingWorkPolicy, work, null);
    }

    @Override // androidx.work.g0
    @o0
    public e0 d(@o0 List<u> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new g(this, work);
    }

    @Override // androidx.work.g0
    @o0
    public w e() {
        androidx.work.impl.utils.a b5 = androidx.work.impl.utils.a.b(this);
        this.f36261d.b(b5);
        return b5.f();
    }

    @Override // androidx.work.g0
    @o0
    public w f(@o0 final String tag) {
        androidx.work.impl.utils.a e4 = androidx.work.impl.utils.a.e(tag, this);
        this.f36261d.b(e4);
        return e4.f();
    }

    @Override // androidx.work.g0
    @o0
    public w g(@o0 String uniqueWorkName) {
        androidx.work.impl.utils.a d5 = androidx.work.impl.utils.a.d(uniqueWorkName, this, true);
        this.f36261d.b(d5);
        return d5.f();
    }

    @Override // androidx.work.g0
    @o0
    public w h(@o0 UUID id2) {
        androidx.work.impl.utils.a c5 = androidx.work.impl.utils.a.c(id2, this);
        this.f36261d.b(c5);
        return c5.f();
    }

    @Override // androidx.work.g0
    @o0
    public PendingIntent i(@o0 UUID id2) {
        return PendingIntent.getService(this.f36258a, 0, androidx.work.impl.foreground.b.a(this.f36258a, id2.toString()), androidx.core.os.b.i() ? 167772160 : 134217728);
    }

    @Override // androidx.work.g0
    @o0
    public w k(@o0 List<? extends i0> requests) {
        if (requests.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, requests).c();
    }

    @Override // androidx.work.g0
    @o0
    public w l(@o0 String uniqueWorkName, @o0 androidx.work.j existingPeriodicWorkPolicy, @o0 z periodicWork) {
        return D(uniqueWorkName, existingPeriodicWorkPolicy, periodicWork).c();
    }

    @Override // androidx.work.g0
    @o0
    public w n(@o0 String uniqueWorkName, @o0 androidx.work.k existingWorkPolicy, @o0 List<u> work) {
        return new g(this, uniqueWorkName, existingWorkPolicy, work, null).c();
    }

    @Override // androidx.work.g0
    @o0
    public ListenableFuture<Long> q() {
        androidx.work.impl.utils.futures.c u4 = androidx.work.impl.utils.futures.c.u();
        this.f36261d.b(new a(u4, this.f36264g));
        return u4;
    }

    @Override // androidx.work.g0
    @o0
    public LiveData<Long> r() {
        return this.f36264g.b();
    }

    @Override // androidx.work.g0
    @o0
    public ListenableFuture<f0> s(@o0 UUID id2) {
        p<f0> c5 = p.c(this, id2);
        this.f36261d.d().execute(c5);
        return c5.f();
    }

    @Override // androidx.work.g0
    @o0
    public LiveData<f0> t(@o0 UUID id2) {
        return androidx.work.impl.utils.g.a(this.f36260c.k().D(Collections.singletonList(id2.toString())), new b(), this.f36261d);
    }

    @Override // androidx.work.g0
    @o0
    public ListenableFuture<List<f0>> u(@o0 h0 workQuery) {
        p<List<f0>> e4 = p.e(this, workQuery);
        this.f36261d.d().execute(e4);
        return e4.f();
    }

    @Override // androidx.work.g0
    @o0
    public ListenableFuture<List<f0>> v(@o0 String tag) {
        p<List<f0>> b5 = p.b(this, tag);
        this.f36261d.d().execute(b5);
        return b5.f();
    }

    @Override // androidx.work.g0
    @o0
    public LiveData<List<f0>> w(@o0 String tag) {
        return androidx.work.impl.utils.g.a(this.f36260c.k().y(tag), r.f36345u, this.f36261d);
    }

    @Override // androidx.work.g0
    @o0
    public ListenableFuture<List<f0>> x(@o0 String uniqueWorkName) {
        p<List<f0>> d5 = p.d(this, uniqueWorkName);
        this.f36261d.d().execute(d5);
        return d5.f();
    }

    @Override // androidx.work.g0
    @o0
    public LiveData<List<f0>> y(@o0 String uniqueWorkName) {
        return androidx.work.impl.utils.g.a(this.f36260c.k().w(uniqueWorkName), r.f36345u, this.f36261d);
    }

    @Override // androidx.work.g0
    @o0
    public LiveData<List<f0>> z(@o0 h0 workQuery) {
        return androidx.work.impl.utils.g.a(this.f36260c.g().a(m.b(workQuery)), r.f36345u, this.f36261d);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public j(@o0 Context context, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a workTaskExecutor, boolean useTestDatabase) {
        this(context, configuration, workTaskExecutor, WorkDatabase.a(context.getApplicationContext(), workTaskExecutor.d(), useTestDatabase));
    }

    @c1({c1.a.LIBRARY_GROUP})
    public j(@o0 Context context, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a workTaskExecutor, @o0 WorkDatabase database) {
        Context applicationContext = context.getApplicationContext();
        s.e(new s.a(configuration.j()));
        List<e> C = C(applicationContext, configuration, workTaskExecutor);
        P(context, configuration, workTaskExecutor, database, C, new d(context, configuration, workTaskExecutor, database, C));
    }

    @c1({c1.a.LIBRARY_GROUP})
    public j(@o0 Context context, @o0 androidx.work.b configuration, @o0 androidx.work.impl.utils.taskexecutor.a workTaskExecutor, @o0 WorkDatabase workDatabase, @o0 List<e> schedulers, @o0 d processor) {
        P(context, configuration, workTaskExecutor, workDatabase, schedulers, processor);
    }
}
