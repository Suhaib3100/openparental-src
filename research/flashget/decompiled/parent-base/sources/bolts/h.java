package bolts;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Task.java */
/* loaded from: classes3.dex */
public class h<TResult> {

    /* renamed from: l, reason: collision with root package name */
    private static volatile q f36880l;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36886b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36887c;

    /* renamed from: d, reason: collision with root package name */
    private TResult f36888d;

    /* renamed from: e, reason: collision with root package name */
    private Exception f36889e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36890f;

    /* renamed from: g, reason: collision with root package name */
    private bolts.j f36891g;

    /* renamed from: i, reason: collision with root package name */
    public static final ExecutorService f36877i = bolts.b.a();

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f36878j = bolts.b.b();

    /* renamed from: k, reason: collision with root package name */
    public static final Executor f36879k = bolts.a.d();

    /* renamed from: m, reason: collision with root package name */
    private static h<?> f36881m = new h<>((Object) null);

    /* renamed from: n, reason: collision with root package name */
    private static h<Boolean> f36882n = new h<>(Boolean.TRUE);

    /* renamed from: o, reason: collision with root package name */
    private static h<Boolean> f36883o = new h<>(Boolean.FALSE);

    /* renamed from: p, reason: collision with root package name */
    private static h<?> f36884p = new h<>(true);

    /* renamed from: a, reason: collision with root package name */
    private final Object f36885a = new Object();

    /* renamed from: h, reason: collision with root package name */
    private List<bolts.g<TResult, Void>> f36892h = new ArrayList();

    /* compiled from: Task.java */
    class a implements bolts.g<TResult, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.i f36893a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.g f36894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f36895c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ bolts.c f36896d;

        a(bolts.i iVar, bolts.g gVar, Executor executor, bolts.c cVar) {
            this.f36893a = iVar;
            this.f36894b = gVar;
            this.f36895c = executor;
            this.f36896d = cVar;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<TResult> hVar) {
            h.l(this.f36893a, this.f36894b, hVar, this.f36895c, this.f36896d);
            return null;
        }
    }

    /* compiled from: Task.java */
    class b implements bolts.g<TResult, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.i f36898a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.g f36899b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f36900c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ bolts.c f36901d;

        b(bolts.i iVar, bolts.g gVar, Executor executor, bolts.c cVar) {
            this.f36898a = iVar;
            this.f36899b = gVar;
            this.f36900c = executor;
            this.f36901d = cVar;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<TResult> hVar) {
            h.k(this.f36898a, this.f36899b, hVar, this.f36900c, this.f36901d);
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    /* compiled from: Task.java */
    class c<TContinuationResult> implements bolts.g<TResult, h<TContinuationResult>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.c f36903a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.g f36904b;

        c(bolts.c cVar, bolts.g gVar) {
            this.f36903a = cVar;
            this.f36904b = gVar;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<TContinuationResult> then(h<TResult> hVar) {
            bolts.c cVar = this.f36903a;
            return (cVar == null || !cVar.a()) ? hVar.J() ? h.C(hVar.E()) : hVar.H() ? h.i() : hVar.q(this.f36904b) : h.i();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    /* compiled from: Task.java */
    class d<TContinuationResult> implements bolts.g<TResult, h<TContinuationResult>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.c f36906a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.g f36907b;

        d(bolts.c cVar, bolts.g gVar) {
            this.f36906a = cVar;
            this.f36907b = gVar;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<TContinuationResult> then(h<TResult> hVar) {
            bolts.c cVar = this.f36906a;
            return (cVar == null || !cVar.a()) ? hVar.J() ? h.C(hVar.E()) : hVar.H() ? h.i() : hVar.u(this.f36907b) : h.i();
        }
    }

    /* compiled from: Task.java */
    static class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.c f36909b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.i f36910c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ bolts.g f36911d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f36912e;

        e(bolts.c cVar, bolts.i iVar, bolts.g gVar, h hVar) {
            this.f36909b = cVar;
            this.f36910c = iVar;
            this.f36911d = gVar;
            this.f36912e = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f36909b;
            if (cVar != null && cVar.a()) {
                this.f36910c.b();
                return;
            }
            try {
                this.f36910c.d(this.f36911d.then(this.f36912e));
            } catch (CancellationException unused) {
                this.f36910c.b();
            } catch (Exception e4) {
                this.f36910c.c(e4);
            }
        }
    }

    /* compiled from: Task.java */
    static class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.c f36913b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.i f36914c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ bolts.g f36915d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f36916e;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* compiled from: Task.java */
        class a<TContinuationResult> implements bolts.g<TContinuationResult, Void> {
            a() {
            }

            @Override // bolts.g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void then(h<TContinuationResult> hVar) {
                bolts.c cVar = f.this.f36913b;
                if (cVar != null && cVar.a()) {
                    f.this.f36914c.b();
                    return null;
                }
                if (hVar.H()) {
                    f.this.f36914c.b();
                } else if (hVar.J()) {
                    f.this.f36914c.c(hVar.E());
                } else {
                    f.this.f36914c.d(hVar.F());
                }
                return null;
            }
        }

        f(bolts.c cVar, bolts.i iVar, bolts.g gVar, h hVar) {
            this.f36913b = cVar;
            this.f36914c = iVar;
            this.f36915d = gVar;
            this.f36916e = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f36913b;
            if (cVar != null && cVar.a()) {
                this.f36914c.b();
                return;
            }
            try {
                h hVar = (h) this.f36915d.then(this.f36916e);
                if (hVar == null) {
                    this.f36914c.d(null);
                } else {
                    hVar.q(new a());
                }
            } catch (CancellationException unused) {
                this.f36914c.b();
            } catch (Exception e4) {
                this.f36914c.c(e4);
            }
        }
    }

    /* compiled from: Task.java */
    static class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.i f36918b;

        g(bolts.i iVar) {
            this.f36918b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36918b.g(null);
        }
    }

    /* compiled from: Task.java */
    /* renamed from: bolts.h$h, reason: collision with other inner class name */
    static class RunnableC0658h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ScheduledFuture f36919b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.i f36920c;

        RunnableC0658h(ScheduledFuture scheduledFuture, bolts.i iVar) {
            this.f36919b = scheduledFuture;
            this.f36920c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36919b.cancel(true);
            this.f36920c.e();
        }
    }

    /* compiled from: Task.java */
    class i implements bolts.g<TResult, h<Void>> {
        i() {
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<Void> then(h<TResult> hVar) throws Exception {
            return hVar.H() ? h.i() : hVar.J() ? h.C(hVar.E()) : h.D(null);
        }
    }

    /* compiled from: Task.java */
    static class j implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.c f36922b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.i f36923c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callable f36924d;

        j(bolts.c cVar, bolts.i iVar, Callable callable) {
            this.f36922b = cVar;
            this.f36923c = iVar;
            this.f36924d = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f36922b;
            if (cVar != null && cVar.a()) {
                this.f36923c.b();
                return;
            }
            try {
                this.f36923c.d(this.f36924d.call());
            } catch (CancellationException unused) {
                this.f36923c.b();
            } catch (Exception e4) {
                this.f36923c.c(e4);
            }
        }
    }

    /* compiled from: Task.java */
    static class k implements bolts.g<TResult, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f36925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.i f36926b;

        k(AtomicBoolean atomicBoolean, bolts.i iVar) {
            this.f36925a = atomicBoolean;
            this.f36926b = iVar;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<TResult> hVar) {
            if (this.f36925a.compareAndSet(false, true)) {
                this.f36926b.d(hVar);
                return null;
            }
            hVar.E();
            return null;
        }
    }

    /* compiled from: Task.java */
    static class l implements bolts.g<Object, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f36927a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.i f36928b;

        l(AtomicBoolean atomicBoolean, bolts.i iVar) {
            this.f36927a = atomicBoolean;
            this.f36928b = iVar;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<Object> hVar) {
            if (this.f36927a.compareAndSet(false, true)) {
                this.f36928b.d(hVar);
                return null;
            }
            hVar.E();
            return null;
        }
    }

    /* compiled from: Task.java */
    static class m implements bolts.g<Void, List<TResult>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f36929a;

        m(Collection collection) {
            this.f36929a = collection;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<TResult> then(h<Void> hVar) throws Exception {
            if (this.f36929a.size() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f36929a.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).F());
            }
            return arrayList;
        }
    }

    /* compiled from: Task.java */
    static class n implements bolts.g<Object, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f36930a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f36931b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f36932c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f36933d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ bolts.i f36934e;

        n(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, bolts.i iVar) {
            this.f36930a = obj;
            this.f36931b = arrayList;
            this.f36932c = atomicBoolean;
            this.f36933d = atomicInteger;
            this.f36934e = iVar;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<Object> hVar) {
            if (hVar.J()) {
                synchronized (this.f36930a) {
                    this.f36931b.add(hVar.E());
                }
            }
            if (hVar.H()) {
                this.f36932c.set(true);
            }
            if (this.f36933d.decrementAndGet() == 0) {
                if (this.f36931b.size() != 0) {
                    if (this.f36931b.size() == 1) {
                        this.f36934e.c((Exception) this.f36931b.get(0));
                    } else {
                        this.f36934e.c(new AggregateException(String.format(ProtectedSandApp.s("ß"), Integer.valueOf(this.f36931b.size())), this.f36931b));
                    }
                } else if (this.f36932c.get()) {
                    this.f36934e.b();
                } else {
                    this.f36934e.d(null);
                }
            }
            return null;
        }
    }

    /* compiled from: Task.java */
    class o implements bolts.g<Void, h<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.c f36935a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f36936b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.g f36937c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Executor f36938d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ bolts.f f36939e;

        o(bolts.c cVar, Callable callable, bolts.g gVar, Executor executor, bolts.f fVar) {
            this.f36935a = cVar;
            this.f36936b = callable;
            this.f36937c = gVar;
            this.f36938d = executor;
            this.f36939e = fVar;
        }

        @Override // bolts.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<Void> then(h<Void> hVar) throws Exception {
            bolts.c cVar = this.f36935a;
            return (cVar == null || !cVar.a()) ? ((Boolean) this.f36936b.call()).booleanValue() ? h.D(null).R(this.f36937c, this.f36938d).R((bolts.g) this.f36939e.a(), this.f36938d) : h.D(null) : h.i();
        }
    }

    /* compiled from: Task.java */
    public class p extends bolts.i<TResult> {
        p() {
        }
    }

    /* compiled from: Task.java */
    public interface q {
        void a(h<?> hVar, UnobservedTaskException unobservedTaskException);
    }

    h() {
    }

    public static h<Void> A(long j4, bolts.c cVar) {
        return B(j4, bolts.b.d(), cVar);
    }

    static h<Void> B(long j4, ScheduledExecutorService scheduledExecutorService, bolts.c cVar) {
        if (cVar != null && cVar.a()) {
            return f36884p;
        }
        if (j4 <= 0) {
            return D(null);
        }
        bolts.i iVar = new bolts.i();
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new g(iVar), j4, TimeUnit.MILLISECONDS);
        if (cVar != null) {
            cVar.b(new RunnableC0658h(schedule, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> C(Exception exc) {
        bolts.i iVar = new bolts.i();
        iVar.c(exc);
        return iVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> h<TResult> D(TResult tresult) {
        if (tresult == 0) {
            return (h<TResult>) f36881m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (h<TResult>) f36882n : (h<TResult>) f36883o;
        }
        bolts.i iVar = new bolts.i();
        iVar.d(tresult);
        return iVar.a();
    }

    public static q G() {
        return f36880l;
    }

    private void T() {
        synchronized (this.f36885a) {
            Iterator<bolts.g<TResult, Void>> it = this.f36892h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().then(this);
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception e5) {
                    throw new RuntimeException(e5);
                }
            }
            this.f36892h = null;
        }
    }

    public static void U(q qVar) {
        f36880l = qVar;
    }

    public static h<Void> a0(Collection<? extends h<?>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        bolts.i iVar = new bolts.i();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends h<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().q(new n(obj, arrayList, atomicBoolean, atomicInteger, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<List<TResult>> b0(Collection<? extends h<TResult>> collection) {
        return (h<List<TResult>>) a0(collection).L(new m(collection));
    }

    public static <TResult> h<TResult> c(Callable<TResult> callable) {
        return f(callable, f36878j, null);
    }

    public static h<h<?>> c0(Collection<? extends h<?>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        bolts.i iVar = new bolts.i();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends h<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().q(new l(atomicBoolean, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> d(Callable<TResult> callable, bolts.c cVar) {
        return f(callable, f36878j, cVar);
    }

    public static <TResult> h<h<TResult>> d0(Collection<? extends h<TResult>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        bolts.i iVar = new bolts.i();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends h<TResult>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().q(new k(atomicBoolean, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> e(Callable<TResult> callable, Executor executor) {
        return f(callable, executor, null);
    }

    public static <TResult> h<TResult> f(Callable<TResult> callable, Executor executor, bolts.c cVar) {
        bolts.i iVar = new bolts.i();
        try {
            executor.execute(new j(cVar, iVar, callable));
        } catch (Exception e4) {
            iVar.c(new ExecutorException(e4));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> g(Callable<TResult> callable) {
        return f(callable, f36877i, null);
    }

    public static <TResult> h<TResult> h(Callable<TResult> callable, bolts.c cVar) {
        return f(callable, f36877i, cVar);
    }

    public static <TResult> h<TResult> i() {
        return (h<TResult>) f36884p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void k(bolts.i<TContinuationResult> iVar, bolts.g<TResult, h<TContinuationResult>> gVar, h<TResult> hVar, Executor executor, bolts.c cVar) {
        try {
            executor.execute(new f(cVar, iVar, gVar, hVar));
        } catch (Exception e4) {
            iVar.c(new ExecutorException(e4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void l(bolts.i<TContinuationResult> iVar, bolts.g<TResult, TContinuationResult> gVar, h<TResult> hVar, Executor executor, bolts.c cVar) {
        try {
            executor.execute(new e(cVar, iVar, gVar, hVar));
        } catch (Exception e4) {
            iVar.c(new ExecutorException(e4));
        }
    }

    public static <TResult> h<TResult>.p y() {
        return new p();
    }

    public static h<Void> z(long j4) {
        return B(j4, bolts.b.d(), null);
    }

    public Exception E() {
        Exception exc;
        synchronized (this.f36885a) {
            try {
                if (this.f36889e != null) {
                    this.f36890f = true;
                    bolts.j jVar = this.f36891g;
                    if (jVar != null) {
                        jVar.a();
                        this.f36891g = null;
                    }
                }
                exc = this.f36889e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public TResult F() {
        TResult tresult;
        synchronized (this.f36885a) {
            tresult = this.f36888d;
        }
        return tresult;
    }

    public boolean H() {
        boolean z4;
        synchronized (this.f36885a) {
            z4 = this.f36887c;
        }
        return z4;
    }

    public boolean I() {
        boolean z4;
        synchronized (this.f36885a) {
            z4 = this.f36886b;
        }
        return z4;
    }

    public boolean J() {
        boolean z4;
        synchronized (this.f36885a) {
            z4 = E() != null;
        }
        return z4;
    }

    public h<Void> K() {
        return u(new i());
    }

    public <TContinuationResult> h<TContinuationResult> L(bolts.g<TResult, TContinuationResult> gVar) {
        return O(gVar, f36878j, null);
    }

    public <TContinuationResult> h<TContinuationResult> M(bolts.g<TResult, TContinuationResult> gVar, bolts.c cVar) {
        return O(gVar, f36878j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> N(bolts.g<TResult, TContinuationResult> gVar, Executor executor) {
        return O(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> O(bolts.g<TResult, TContinuationResult> gVar, Executor executor, bolts.c cVar) {
        return w(new c(cVar, gVar), executor);
    }

    public <TContinuationResult> h<TContinuationResult> P(bolts.g<TResult, h<TContinuationResult>> gVar) {
        return R(gVar, f36878j);
    }

    public <TContinuationResult> h<TContinuationResult> Q(bolts.g<TResult, h<TContinuationResult>> gVar, bolts.c cVar) {
        return S(gVar, f36878j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> R(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor) {
        return S(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> S(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor, bolts.c cVar) {
        return w(new d(cVar, gVar), executor);
    }

    boolean V() {
        synchronized (this.f36885a) {
            try {
                if (this.f36886b) {
                    return false;
                }
                this.f36886b = true;
                this.f36887c = true;
                this.f36885a.notifyAll();
                T();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean W(Exception exc) {
        synchronized (this.f36885a) {
            try {
                if (this.f36886b) {
                    return false;
                }
                this.f36886b = true;
                this.f36889e = exc;
                this.f36890f = false;
                this.f36885a.notifyAll();
                T();
                if (!this.f36890f && f36880l != null) {
                    this.f36891g = new bolts.j(this);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean X(TResult tresult) {
        synchronized (this.f36885a) {
            try {
                if (this.f36886b) {
                    return false;
                }
                this.f36886b = true;
                this.f36888d = tresult;
                this.f36885a.notifyAll();
                T();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Y() throws InterruptedException {
        synchronized (this.f36885a) {
            try {
                if (!I()) {
                    this.f36885a.wait();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean Z(long j4, TimeUnit timeUnit) throws InterruptedException {
        boolean I;
        synchronized (this.f36885a) {
            try {
                if (!I()) {
                    this.f36885a.wait(timeUnit.toMillis(j4));
                }
                I = I();
            } catch (Throwable th) {
                throw th;
            }
        }
        return I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> h<TOut> j() {
        return this;
    }

    public h<Void> m(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar) {
        return p(callable, gVar, f36878j, null);
    }

    public h<Void> n(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, bolts.c cVar) {
        return p(callable, gVar, f36878j, cVar);
    }

    public h<Void> o(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, Executor executor) {
        return p(callable, gVar, executor, null);
    }

    public h<Void> p(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, Executor executor, bolts.c cVar) {
        bolts.f fVar = new bolts.f();
        fVar.b(new o(cVar, callable, gVar, executor, fVar));
        return K().w((bolts.g) fVar.a(), executor);
    }

    public <TContinuationResult> h<TContinuationResult> q(bolts.g<TResult, TContinuationResult> gVar) {
        return t(gVar, f36878j, null);
    }

    public <TContinuationResult> h<TContinuationResult> r(bolts.g<TResult, TContinuationResult> gVar, bolts.c cVar) {
        return t(gVar, f36878j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> s(bolts.g<TResult, TContinuationResult> gVar, Executor executor) {
        return t(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> t(bolts.g<TResult, TContinuationResult> gVar, Executor executor, bolts.c cVar) {
        boolean I;
        bolts.i iVar = new bolts.i();
        synchronized (this.f36885a) {
            try {
                I = I();
                if (!I) {
                    this.f36892h.add(new a(iVar, gVar, executor, cVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (I) {
            l(iVar, gVar, this, executor, cVar);
        }
        return iVar.a();
    }

    public <TContinuationResult> h<TContinuationResult> u(bolts.g<TResult, h<TContinuationResult>> gVar) {
        return x(gVar, f36878j, null);
    }

    public <TContinuationResult> h<TContinuationResult> v(bolts.g<TResult, h<TContinuationResult>> gVar, bolts.c cVar) {
        return x(gVar, f36878j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> w(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor) {
        return x(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> x(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor, bolts.c cVar) {
        boolean I;
        bolts.i iVar = new bolts.i();
        synchronized (this.f36885a) {
            try {
                I = I();
                if (!I) {
                    this.f36892h.add(new b(iVar, gVar, executor, cVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (I) {
            k(iVar, gVar, this, executor, cVar);
        }
        return iVar.a();
    }

    private h(TResult tresult) {
        X(tresult);
    }

    private h(boolean z4) {
        if (z4) {
            V();
        } else {
            X(null);
        }
    }
}
