package androidx.concurrent.futures;

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

/* compiled from: AbstractResolvableFuture.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class b<V> implements ListenableFuture<V> {

    /* renamed from: e, reason: collision with root package name */
    static final boolean f21772e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f21773f = Logger.getLogger(b.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final long f21774g = 1000;

    /* renamed from: h, reason: collision with root package name */
    static final AbstractC0385b f21775h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f21776i;

    /* renamed from: b, reason: collision with root package name */
    @q0
    volatile Object f21777b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    volatile e f21778c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    volatile i f21779d;

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: androidx.concurrent.futures.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0385b {
        private AbstractC0385b() {
        }

        abstract boolean a(b<?> bVar, e eVar, e eVar2);

        abstract boolean b(b<?> bVar, Object obj, Object obj2);

        abstract boolean c(b<?> bVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);

        AbstractC0385b(a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f21780c;

        /* renamed from: d, reason: collision with root package name */
        static final c f21781d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f21782a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        final Throwable f21783b;

        static {
            if (b.f21772e) {
                f21781d = null;
                f21780c = null;
            } else {
                f21781d = new c(false, null);
                f21780c = new c(true, null);
            }
        }

        c(boolean z4, @q0 Throwable th) {
            this.f21782a = z4;
            this.f21783b = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f21784b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f21785a;

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
            this.f21785a = (Throwable) b.d(th);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f21786d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f21787a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f21788b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        e f21789c;

        e(Runnable runnable, Executor executor) {
            this.f21787a = runnable;
            this.f21788b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class f extends AbstractC0385b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f21790a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f21791b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, i> f21792c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, e> f21793d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, Object> f21794e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            this.f21790a = atomicReferenceFieldUpdater;
            this.f21791b = atomicReferenceFieldUpdater2;
            this.f21792c = atomicReferenceFieldUpdater3;
            this.f21793d = atomicReferenceFieldUpdater4;
            this.f21794e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        boolean a(b<?> bVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.c.a(this.f21793d, bVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        boolean b(b<?> bVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.c.a(this.f21794e, bVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        boolean c(b<?> bVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.c.a(this.f21792c, bVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        void d(i iVar, i iVar2) {
            this.f21791b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        void e(i iVar, Thread thread) {
            this.f21790a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class g<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final b<V> f21795b;

        /* renamed from: c, reason: collision with root package name */
        final ListenableFuture<? extends V> f21796c;

        g(b<V> bVar, ListenableFuture<? extends V> listenableFuture) {
            this.f21795b = bVar;
            this.f21796c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21795b.f21777b != this) {
                return;
            }
            if (b.f21775h.b(this.f21795b, this, b.i(this.f21796c))) {
                b.f(this.f21795b);
            }
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class h extends AbstractC0385b {
        h() {
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        boolean a(b<?> bVar, e eVar, e eVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.f21778c != eVar) {
                        return false;
                    }
                    bVar.f21778c = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                try {
                    if (bVar.f21777b != obj) {
                        return false;
                    }
                    bVar.f21777b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        boolean c(b<?> bVar, i iVar, i iVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.f21779d != iVar) {
                        return false;
                    }
                    bVar.f21779d = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        void d(i iVar, i iVar2) {
            iVar.f21799b = iVar2;
        }

        @Override // androidx.concurrent.futures.b.AbstractC0385b
        void e(i iVar, Thread thread) {
            iVar.f21798a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f21797c = new i();

        /* renamed from: a, reason: collision with root package name */
        @q0
        volatile Thread f21798a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        volatile i f21799b;

        i(boolean z4) {
        }

        void a(i iVar) {
            b.f21775h.d(this, iVar);
        }

        void b() {
            Thread thread = this.f21798a;
            if (thread != null) {
                this.f21798a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            b.f21775h.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0385b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(b.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f21775h = hVar;
        if (th != null) {
            f21773f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f21776i = new Object();
    }

    protected b() {
    }

    private void a(StringBuilder sb) {
        try {
            Object j4 = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(j4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    private static CancellationException c(@q0 String str, @q0 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @o0
    static <T> T d(@q0 T t4) {
        t4.getClass();
        return t4;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f21778c;
        } while (!f21775h.a(this, eVar2, e.f21786d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f21789c;
            eVar4.f21789c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void f(b<?> bVar) {
        e eVar = null;
        while (true) {
            bVar.n();
            bVar.b();
            e e4 = bVar.e(eVar);
            while (e4 != null) {
                eVar = e4.f21789c;
                Runnable runnable = e4.f21787a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    bVar = gVar.f21795b;
                    if (bVar.f21777b == gVar) {
                        if (f21775h.b(bVar, gVar, i(gVar.f21796c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, e4.f21788b);
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
            f21773f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f21783b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f21785a);
        }
        if (obj == f21776i) {
            return null;
        }
        return obj;
    }

    static Object i(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof b) {
            Object obj = ((b) listenableFuture).f21777b;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f21782a ? cVar.f21783b != null ? new c(false, cVar.f21783b) : c.f21781d : obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f21772e) && isCancelled) {
            return c.f21781d;
        }
        try {
            Object j4 = j(listenableFuture);
            return j4 == null ? f21776i : j4;
        } catch (CancellationException e4) {
            if (isCancelled) {
                return new c(false, e4);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e4));
        } catch (ExecutionException e5) {
            return new d(e5.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    static <V> V j(Future<V> future) throws ExecutionException {
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
            iVar = this.f21779d;
        } while (!f21775h.c(this, iVar, i.f21797c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f21799b;
        }
    }

    private void o(i iVar) {
        iVar.f21798a = null;
        while (true) {
            i iVar2 = this.f21779d;
            if (iVar2 == i.f21797c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f21799b;
                if (iVar2.f21798a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f21799b = iVar4;
                    if (iVar3.f21798a == null) {
                        break;
                    }
                } else if (!f21775h.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f21777b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f21772e ? new c(z4, new CancellationException("Future.cancel() was called.")) : z4 ? c.f21780c : c.f21781d;
        b<V> bVar = this;
        boolean z5 = false;
        while (true) {
            if (f21775h.b(bVar, obj, cVar)) {
                if (z4) {
                    bVar.k();
                }
                f(bVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f21796c;
                if (!(listenableFuture instanceof b)) {
                    listenableFuture.cancel(z4);
                    return true;
                }
                bVar = (b) listenableFuture;
                obj = bVar.f21777b;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z5 = true;
            } else {
                obj = bVar.f21777b;
                if (!(obj instanceof g)) {
                    return z5;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f21777b;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f21779d;
            if (iVar != i.f21797c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f21775h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f21777b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f21779d;
                    }
                } while (iVar != i.f21797c);
            }
            return h(this.f21777b);
        }
        while (nanos > 0) {
            Object obj3 = this.f21777b;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String bVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder a5 = f0.a("Waited ", j4, " ");
        a5.append(timeUnit.toString().toLowerCase(locale));
        String sb = a5.toString();
        if (nanos + 1000 < 0) {
            String a6 = j.a(sb, " (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
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
        throw new TimeoutException(z3.a(sb, " for ", bVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21777b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f21777b != null);
    }

    protected void k() {
    }

    final void l(@q0 Future<?> future) {
        if ((future != null) && (this.f21777b instanceof c)) {
            future.cancel(t());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @q0
    protected String m() {
        Object obj = this.f21777b;
        if (obj instanceof g) {
            return android.support.v4.media.c.a(new StringBuilder("setFuture=["), s(((g) obj).f21796c), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void n2(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        e eVar = this.f21778c;
        if (eVar != e.f21786d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f21789c = eVar;
                if (f21775h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f21778c;
                }
            } while (eVar != e.f21786d);
        }
        g(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(@q0 V v4) {
        if (v4 == null) {
            v4 = (V) f21776i;
        }
        if (!f21775h.b(this, null, v4)) {
            return false;
        }
        f(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th) {
        th.getClass();
        if (!f21775h.b(this, null, new d(th))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean r(ListenableFuture<? extends V> listenableFuture) {
        d dVar;
        listenableFuture.getClass();
        Object obj = this.f21777b;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f21775h.b(this, null, i(listenableFuture))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, listenableFuture);
            if (f21775h.b(this, null, gVar)) {
                try {
                    listenableFuture.n2(gVar, androidx.concurrent.futures.e.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f21784b;
                    }
                    f21775h.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f21777b;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f21782a);
        }
        return false;
    }

    protected final boolean t() {
        Object obj = this.f21777b;
        return (obj instanceof c) && ((c) obj).f21782a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f21777b instanceof c) {
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
            Object obj2 = this.f21777b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f21779d;
            if (iVar != i.f21797c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f21775h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f21777b;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f21779d;
                } while (iVar != i.f21797c);
            }
            return h(this.f21777b);
        }
        throw new InterruptedException();
    }
}
