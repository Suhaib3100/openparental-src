package androidx.concurrent.futures;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractResolvableFuture.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class c<V> implements w1.a<V> {

    /* renamed from: r, reason: collision with root package name */
    static final boolean f1544r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: s, reason: collision with root package name */
    private static final Logger f1545s = Logger.getLogger(c.class.getName());

    /* renamed from: t, reason: collision with root package name */
    private static final long f1546t = 1000;

    /* renamed from: u, reason: collision with root package name */
    static final b f1547u;

    /* renamed from: v, reason: collision with root package name */
    private static final Object f1548v;

    /* renamed from: o, reason: collision with root package name */
    @q0
    volatile Object f1549o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    volatile e f1550p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    volatile i f1551q;

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(c<?> cVar, e eVar, e eVar2);

        abstract boolean b(c<?> cVar, Object obj, Object obj2);

        abstract boolean c(c<?> cVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);

        b(a aVar) {
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0016c {

        /* renamed from: c, reason: collision with root package name */
        static final C0016c f1552c;

        /* renamed from: d, reason: collision with root package name */
        static final C0016c f1553d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f1554a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        final Throwable f1555b;

        static {
            if (c.f1544r) {
                f1553d = null;
                f1552c = null;
            } else {
                f1553d = new C0016c(false, null);
                f1552c = new C0016c(true, null);
            }
        }

        C0016c(boolean z5, @q0 Throwable th) {
            this.f1554a = z5;
            this.f1555b = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f1556b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f1557a;

        /* compiled from: AbstractResolvableFuture.java */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1557a = (Throwable) c.o(th);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f1558d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f1559a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f1560b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        e f1561c;

        e(Runnable runnable, Executor executor) {
            this.f1559a = runnable;
            this.f1560b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1562a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1563b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<c, i> f1564c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<c, e> f1565d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<c, Object> f1566e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<c, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<c, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<c, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f1562a = atomicReferenceFieldUpdater;
            this.f1563b = atomicReferenceFieldUpdater2;
            this.f1564c = atomicReferenceFieldUpdater3;
            this.f1565d = atomicReferenceFieldUpdater4;
            this.f1566e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.c.b
        boolean a(c<?> cVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.d.a(this.f1565d, cVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.c.b
        boolean b(c<?> cVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.d.a(this.f1566e, cVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.c.b
        boolean c(c<?> cVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.d.a(this.f1564c, cVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.c.b
        void d(i iVar, i iVar2) {
            this.f1563b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.c.b
        void e(i iVar, Thread thread) {
            this.f1562a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    private static final class g<V> implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final c<V> f1567o;

        /* renamed from: p, reason: collision with root package name */
        final w1.a<? extends V> f1568p;

        g(c<V> cVar, w1.a<? extends V> aVar) {
            this.f1567o = cVar;
            this.f1568p = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1567o.f1549o != this) {
                return;
            }
            if (c.f1547u.b(this.f1567o, this, c.t(this.f1568p))) {
                c.q(this.f1567o);
            }
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class h extends b {
        h() {
            super(null);
        }

        @Override // androidx.concurrent.futures.c.b
        boolean a(c<?> cVar, e eVar, e eVar2) {
            synchronized (cVar) {
                if (cVar.f1550p != eVar) {
                    return false;
                }
                cVar.f1550p = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.c.b
        boolean b(c<?> cVar, Object obj, Object obj2) {
            synchronized (cVar) {
                if (cVar.f1549o != obj) {
                    return false;
                }
                cVar.f1549o = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.c.b
        boolean c(c<?> cVar, i iVar, i iVar2) {
            synchronized (cVar) {
                if (cVar.f1551q != iVar) {
                    return false;
                }
                cVar.f1551q = iVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.c.b
        void d(i iVar, i iVar2) {
            iVar.f1571b = iVar2;
        }

        @Override // androidx.concurrent.futures.c.b
        void e(i iVar, Thread thread) {
            iVar.f1570a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f1569c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        @q0
        volatile Thread f1570a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        volatile i f1571b;

        i(boolean z5) {
        }

        void a(i iVar) {
            c.f1547u.d(this, iVar);
        }

        void b() {
            Thread thread = this.f1570a;
            if (thread != null) {
                this.f1570a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            c.f1547u.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c.class, i.class, "q"), AtomicReferenceFieldUpdater.newUpdater(c.class, e.class, "p"), AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f1547u = hVar;
        if (th != null) {
            f1545s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1548v = new Object();
    }

    protected c() {
    }

    private String D(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void h(StringBuilder sb) {
        try {
            Object u5 = u(this);
            sb.append("SUCCESS, result=[");
            sb.append(D(u5));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        }
    }

    private static CancellationException l(@q0 String str, @q0 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @o0
    static <T> T o(@q0 T t5) {
        t5.getClass();
        return t5;
    }

    private e p(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1550p;
        } while (!f1547u.a(this, eVar2, e.f1558d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1561c;
            eVar4.f1561c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void q(c<?> cVar) {
        e eVar = null;
        while (true) {
            cVar.y();
            cVar.j();
            e p5 = cVar.p(eVar);
            while (p5 != null) {
                eVar = p5.f1561c;
                Runnable runnable = p5.f1559a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    cVar = gVar.f1567o;
                    if (cVar.f1549o == gVar) {
                        if (f1547u.b(cVar, gVar, t(gVar.f1568p))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    r(runnable, p5.f1560b);
                }
                p5 = eVar;
            }
            return;
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f1545s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V s(Object obj) throws ExecutionException {
        if (obj instanceof C0016c) {
            throw l("Task was cancelled.", ((C0016c) obj).f1555b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1557a);
        }
        if (obj == f1548v) {
            return null;
        }
        return obj;
    }

    static Object t(w1.a<?> aVar) {
        if (aVar instanceof c) {
            Object obj = ((c) aVar).f1549o;
            if (!(obj instanceof C0016c)) {
                return obj;
            }
            C0016c c0016c = (C0016c) obj;
            return c0016c.f1554a ? c0016c.f1555b != null ? new C0016c(false, c0016c.f1555b) : C0016c.f1553d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f1544r) && isCancelled) {
            return C0016c.f1553d;
        }
        try {
            Object u5 = u(aVar);
            return u5 == null ? f1548v : u5;
        } catch (CancellationException e6) {
            if (isCancelled) {
                return new C0016c(false, e6);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e6));
        } catch (ExecutionException e7) {
            return new d(e7.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    static <V> V u(Future<V> future) throws ExecutionException {
        V v5;
        boolean z5 = false;
        while (true) {
            try {
                v5 = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return v5;
    }

    private void y() {
        i iVar;
        do {
            iVar = this.f1551q;
        } while (!f1547u.c(this, iVar, i.f1569c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1571b;
        }
    }

    private void z(i iVar) {
        iVar.f1570a = null;
        while (true) {
            i iVar2 = this.f1551q;
            if (iVar2 == i.f1569c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1571b;
                if (iVar2.f1570a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1571b = iVar4;
                    if (iVar3.f1570a == null) {
                        break;
                    }
                } else if (!f1547u.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean A(@q0 V v5) {
        if (v5 == null) {
            v5 = (V) f1548v;
        }
        if (!f1547u.b(this, null, v5)) {
            return false;
        }
        q(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean B(Throwable th) {
        th.getClass();
        if (!f1547u.b(this, null, new d(th))) {
            return false;
        }
        q(this);
        return true;
    }

    protected boolean C(w1.a<? extends V> aVar) {
        d dVar;
        aVar.getClass();
        Object obj = this.f1549o;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f1547u.b(this, null, t(aVar))) {
                    return false;
                }
                q(this);
                return true;
            }
            g gVar = new g(this, aVar);
            if (f1547u.b(this, null, gVar)) {
                try {
                    aVar.g(gVar, androidx.concurrent.futures.f.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f1556b;
                    }
                    f1547u.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f1549o;
        }
        if (obj instanceof C0016c) {
            aVar.cancel(((C0016c) obj).f1554a);
        }
        return false;
    }

    protected final boolean E() {
        Object obj = this.f1549o;
        return (obj instanceof C0016c) && ((C0016c) obj).f1554a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f1549o;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        C0016c c0016c = f1544r ? new C0016c(z5, new CancellationException("Future.cancel() was called.")) : z5 ? C0016c.f1552c : C0016c.f1553d;
        c<V> cVar = this;
        boolean z6 = false;
        while (true) {
            if (f1547u.b(cVar, obj, c0016c)) {
                if (z5) {
                    cVar.v();
                }
                q(cVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                w1.a<? extends V> aVar = ((g) obj).f1568p;
                if (!(aVar instanceof c)) {
                    aVar.cancel(z5);
                    return true;
                }
                cVar = (c) aVar;
                obj = cVar.f1549o;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z6 = true;
            } else {
                obj = cVar.f1549o;
                if (!(obj instanceof g)) {
                    return z6;
                }
            }
        }
    }

    @Override // w1.a
    public final void g(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        e eVar = this.f1550p;
        if (eVar != e.f1558d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1561c = eVar;
                if (f1547u.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f1550p;
                }
            } while (eVar != e.f1558d);
        }
        r(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j5, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1549o;
        boolean z5 = true;
        if ((obj != null) && (!(obj instanceof g))) {
            return s(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= f1546t) {
            i iVar = this.f1551q;
            if (iVar != i.f1569c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1547u.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                z(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1549o;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return s(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= f1546t);
                        z(iVar2);
                    } else {
                        iVar = this.f1551q;
                    }
                } while (iVar != i.f1569c);
            }
            return s(this.f1549o);
        }
        while (nanos > 0) {
            Object obj3 = this.f1549o;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return s(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String cVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + f1546t < 0) {
            String a6 = androidx.concurrent.futures.b.a(str, " (plus ");
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= f1546t) {
                z5 = false;
            }
            if (convert > 0) {
                String str2 = a6 + convert + " " + lowerCase;
                if (z5) {
                    str2 = androidx.concurrent.futures.b.a(str2, ",");
                }
                a6 = androidx.concurrent.futures.b.a(str2, " ");
            }
            if (z5) {
                a6 = a6 + nanos2 + " nanoseconds ";
            }
            str = androidx.concurrent.futures.b.a(a6, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(androidx.concurrent.futures.b.a(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + cVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1549o instanceof C0016c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f1549o != null);
    }

    protected void j() {
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            try {
                str = x();
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                h(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected void v() {
    }

    final void w(@q0 Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(E());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @q0
    protected String x() {
        Object obj = this.f1549o;
        if (obj instanceof g) {
            return androidx.concurrent.futures.a.a(new StringBuilder("setFuture=["), D(((g) obj).f1568p), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1549o;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return s(obj2);
            }
            i iVar = this.f1551q;
            if (iVar != i.f1569c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1547u.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1549o;
                            } else {
                                z(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return s(obj);
                    }
                    iVar = this.f1551q;
                } while (iVar != i.f1569c);
            }
            return s(this.f1549o);
        }
        throw new InterruptedException();
    }
}
