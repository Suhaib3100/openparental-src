package androidx.work.impl.utils.futures;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.material3.z3;
import androidx.compose.runtime.changelist.j;
import androidx.compose.runtime.snapshots.f0;
import com.google.common.util.concurrent.ListenableFuture;
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

/* compiled from: AbstractFuture.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class a<V> implements ListenableFuture<V> {

    /* renamed from: e, reason: collision with root package name */
    static final boolean f36454e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f36455f = Logger.getLogger(a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final long f36456g = 1000;

    /* renamed from: h, reason: collision with root package name */
    static final b f36457h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f36458i;

    /* renamed from: b, reason: collision with root package name */
    @q0
    volatile Object f36459b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    volatile e f36460c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    volatile i f36461d;

    /* compiled from: AbstractFuture.java */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> future, e expect, e update);

        abstract boolean b(a<?> future, Object expect, Object update);

        abstract boolean c(a<?> future, i expect, i update);

        abstract void d(i waiter, i newValue);

        abstract void e(i waiter, Thread newValue);

        b(C0644a c0644a) {
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f36462c;

        /* renamed from: d, reason: collision with root package name */
        static final c f36463d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f36464a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        final Throwable f36465b;

        static {
            if (a.f36454e) {
                f36463d = null;
                f36462c = null;
            } else {
                f36463d = new c(false, null);
                f36462c = new c(true, null);
            }
        }

        c(boolean wasInterrupted, @q0 Throwable cause) {
            this.f36464a = wasInterrupted;
            this.f36465b = cause;
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f36466b = new d(new C0645a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f36467a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0645a extends Throwable {
            C0645a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable exception) {
            this.f36467a = (Throwable) a.d(exception);
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f36468d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f36469a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f36470b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        e f36471c;

        e(Runnable task, Executor executor) {
            this.f36469a = task;
            this.f36470b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f36472a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f36473b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f36474c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f36475d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f36476e;

        f(AtomicReferenceFieldUpdater<i, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<i, i> waiterNextUpdater, AtomicReferenceFieldUpdater<a, i> waitersUpdater, AtomicReferenceFieldUpdater<a, e> listenersUpdater, AtomicReferenceFieldUpdater<a, Object> valueUpdater) {
            this.f36472a = waiterThreadUpdater;
            this.f36473b = waiterNextUpdater;
            this.f36474c = waitersUpdater;
            this.f36475d = listenersUpdater;
            this.f36476e = valueUpdater;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> future, e expect, e update) {
            return androidx.concurrent.futures.c.a(this.f36475d, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> future, Object expect, Object update) {
            return androidx.concurrent.futures.c.a(this.f36476e, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> future, i expect, i update) {
            return androidx.concurrent.futures.c.a(this.f36474c, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i waiter, i newValue) {
            this.f36473b.lazySet(waiter, newValue);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i waiter, Thread newValue) {
            this.f36472a.lazySet(waiter, newValue);
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class g<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final a<V> f36477b;

        /* renamed from: c, reason: collision with root package name */
        final ListenableFuture<? extends V> f36478c;

        g(a<V> owner, ListenableFuture<? extends V> future) {
            this.f36477b = owner;
            this.f36478c = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36477b.f36459b != this) {
                return;
            }
            if (a.f36457h.b(this.f36477b, this, a.i(this.f36478c))) {
                a.f(this.f36477b);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class h extends b {
        h() {
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> future, e expect, e update) {
            synchronized (future) {
                try {
                    if (future.f36460c != expect) {
                        return false;
                    }
                    future.f36460c = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> future, Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.f36459b != expect) {
                        return false;
                    }
                    future.f36459b = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> future, i expect, i update) {
            synchronized (future) {
                try {
                    if (future.f36461d != expect) {
                        return false;
                    }
                    future.f36461d = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i waiter, i newValue) {
            waiter.f36481b = newValue;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i waiter, Thread newValue) {
            waiter.f36480a = newValue;
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f36479c = new i();

        /* renamed from: a, reason: collision with root package name */
        @q0
        volatile Thread f36480a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        volatile i f36481b;

        i(boolean unused) {
        }

        void a(i next) {
            a.f36457h.d(this, next);
        }

        void b() {
            Thread thread = this.f36480a;
            if (thread != null) {
                this.f36480a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f36457h.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f36457h = hVar;
        if (th != null) {
            f36455f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f36458i = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder builder) {
        try {
            Object j4 = j(this);
            builder.append("SUCCESS, result=[");
            builder.append(s(j4));
            builder.append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e4) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e4.getClass());
            builder.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            builder.append("FAILURE, cause=[");
            builder.append(e5.getCause());
            builder.append("]");
        }
    }

    private static CancellationException c(@q0 String message, @q0 Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    @o0
    static <T> T d(@q0 T reference) {
        reference.getClass();
        return reference;
    }

    private e e(e onto) {
        e eVar;
        do {
            eVar = this.f36460c;
        } while (!f36457h.a(this, eVar, e.f36468d));
        e eVar2 = onto;
        e eVar3 = eVar;
        while (eVar3 != null) {
            e eVar4 = eVar3.f36471c;
            eVar3.f36471c = eVar2;
            eVar2 = eVar3;
            eVar3 = eVar4;
        }
        return eVar2;
    }

    static void f(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e e4 = aVar.e(eVar);
            while (e4 != null) {
                eVar = e4.f36471c;
                Runnable runnable = e4.f36469a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f36477b;
                    if (aVar.f36459b == gVar) {
                        if (f36457h.b(aVar, gVar, i(gVar.f36478c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, e4.f36470b);
                }
                e4 = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f36455f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f36465b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f36467a);
        }
        if (obj == f36458i) {
            return null;
        }
        return obj;
    }

    static Object i(ListenableFuture<?> future) {
        if (future instanceof a) {
            Object obj = ((a) future).f36459b;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f36464a ? cVar.f36465b != null ? new c(false, cVar.f36465b) : c.f36463d : obj;
        }
        boolean isCancelled = future.isCancelled();
        if ((!f36454e) && isCancelled) {
            return c.f36463d;
        }
        try {
            Object j4 = j(future);
            return j4 == null ? f36458i : j4;
        } catch (CancellationException e4) {
            if (isCancelled) {
                return new c(false, e4);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e4));
        } catch (ExecutionException e5) {
            return new d(e5.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
        V v4;
        boolean z4 = false;
        while (true) {
            try {
                v4 = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return v4;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f36461d;
        } while (!f36457h.c(this, iVar, i.f36479c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f36481b;
        }
    }

    private void o(i node) {
        node.f36480a = null;
        while (true) {
            i iVar = this.f36461d;
            if (iVar == i.f36479c) {
                return;
            }
            i iVar2 = null;
            while (iVar != null) {
                i iVar3 = iVar.f36481b;
                if (iVar.f36480a != null) {
                    iVar2 = iVar;
                } else if (iVar2 != null) {
                    iVar2.f36481b = iVar3;
                    if (iVar2.f36480a == null) {
                        break;
                    }
                } else if (!f36457h.c(this, iVar, iVar3)) {
                    break;
                }
                iVar = iVar3;
            }
            return;
        }
    }

    private String s(Object o4) {
        return o4 == this ? "this future" : String.valueOf(o4);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        Object obj = this.f36459b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f36454e ? new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called.")) : mayInterruptIfRunning ? c.f36462c : c.f36463d;
        a<V> aVar = this;
        boolean z4 = false;
        while (true) {
            if (f36457h.b(aVar, obj, cVar)) {
                if (mayInterruptIfRunning) {
                    aVar.k();
                }
                f(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f36478c;
                if (!(listenableFuture instanceof a)) {
                    listenableFuture.cancel(mayInterruptIfRunning);
                    return true;
                }
                aVar = (a) listenableFuture;
                obj = aVar.f36459b;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z4 = true;
            } else {
                obj = aVar.f36459b;
                if (!(obj instanceof g)) {
                    return z4;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f36459b;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f36461d;
            if (iVar != i.f36479c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f36457h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f36459b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f36461d;
                    }
                } while (iVar != i.f36479c);
            }
            return h(this.f36459b);
        }
        while (nanos > 0) {
            Object obj3 = this.f36459b;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = unit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder a5 = f0.a("Waited ", timeout, " ");
        a5.append(unit.toString().toLowerCase(locale));
        String sb = a5.toString();
        if (nanos + 1000 < 0) {
            String a6 = j.a(sb, " (plus ");
            long j4 = -nanos;
            long convert = unit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - unit.toNanos(convert);
            boolean z4 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = a6 + convert + " " + lowerCase;
                if (z4) {
                    str = j.a(str, ",");
                }
                a6 = j.a(str, " ");
            }
            if (z4) {
                a6 = a6 + nanos2 + " nanoseconds ";
            }
            sb = j.a(a6, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(j.a(sb, " but future completed as timeout expired"));
        }
        throw new TimeoutException(z3.a(sb, " for ", aVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36459b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f36459b != null);
    }

    protected void k() {
    }

    final void l(@q0 Future<?> related) {
        if ((related != null) && (this.f36459b instanceof c)) {
            related.cancel(t());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @q0
    protected String m() {
        Object obj = this.f36459b;
        if (obj instanceof g) {
            return android.support.v4.media.c.a(new StringBuilder("setFuture=["), s(((g) obj).f36478c), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void n2(Runnable listener, Executor executor) {
        listener.getClass();
        executor.getClass();
        e eVar = this.f36460c;
        if (eVar != e.f36468d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.f36471c = eVar;
                if (f36457h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f36460c;
                }
            } while (eVar != e.f36468d);
        }
        g(listener, executor);
    }

    protected boolean p(@q0 V v4) {
        if (v4 == null) {
            v4 = (V) f36458i;
        }
        if (!f36457h.b(this, null, v4)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean q(Throwable throwable) {
        throwable.getClass();
        if (!f36457h.b(this, null, new d(throwable))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean r(ListenableFuture<? extends V> future) {
        d dVar;
        future.getClass();
        Object obj = this.f36459b;
        if (obj == null) {
            if (future.isDone()) {
                if (!f36457h.b(this, null, i(future))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, future);
            if (f36457h.b(this, null, gVar)) {
                try {
                    future.n2(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f36466b;
                    }
                    f36457h.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f36459b;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f36464a);
        }
        return false;
    }

    protected final boolean t() {
        Object obj = this.f36459b;
        return (obj instanceof c) && ((c) obj).f36464a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f36459b instanceof c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = m();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                androidx.concurrent.futures.a.a(sb, "PENDING, info=[", str, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f36459b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f36461d;
            if (iVar != i.f36479c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f36457h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f36459b;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f36461d;
                } while (iVar != i.f36479c);
            }
            return h(this.f36459b);
        }
        throw new InterruptedException();
    }
}
