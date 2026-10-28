package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import ma.f;
import sun.misc.Unsafe;

/* compiled from: AbstractFuture.java */
@b0
@ma.f(f.a.FULL)
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public abstract class c<V> extends com.google.common.util.concurrent.internal.a implements ListenableFuture<V> {

    /* renamed from: e, reason: collision with root package name */
    static final boolean f57673e;

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f57674f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f57675g = 1000;

    /* renamed from: h, reason: collision with root package name */
    private static final b f57676h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f57677i;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private volatile Object f57678b;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private volatile e f57679c;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private volatile l f57680d;

    /* compiled from: AbstractFuture.java */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(c<?> cVar, @zc.a e eVar, e eVar2);

        abstract boolean b(c<?> cVar, @zc.a Object obj, Object obj2);

        abstract boolean c(c<?> cVar, @zc.a l lVar, @zc.a l lVar2);

        abstract e d(c<?> cVar, e eVar);

        abstract l e(c<?> cVar, l lVar);

        abstract void f(l lVar, @zc.a l lVar2);

        abstract void g(l lVar, Thread thread);

        b(a aVar) {
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$c, reason: collision with other inner class name */
    private static final class C0888c {

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        static final C0888c f57681c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        static final C0888c f57682d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f57683a;

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        final Throwable f57684b;

        static {
            if (c.f57673e) {
                f57682d = null;
                f57681c = null;
            } else {
                f57682d = new C0888c(false, null);
                f57681c = new C0888c(true, null);
            }
        }

        C0888c(boolean z4, @zc.a Throwable th) {
            this.f57683a = z4;
            this.f57684b = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f57685b = new d(new a(ProtectedSandApp.s("連")));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f57686a;

        /* compiled from: AbstractFuture.java */
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
            th.getClass();
            this.f57686a = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f57691a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f57692b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<c, l> f57693c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<c, e> f57694d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<c, Object> f57695e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<c, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<c, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<c, Object> atomicReferenceFieldUpdater5) {
            this.f57691a = atomicReferenceFieldUpdater;
            this.f57692b = atomicReferenceFieldUpdater2;
            this.f57693c = atomicReferenceFieldUpdater3;
            this.f57694d = atomicReferenceFieldUpdater4;
            this.f57695e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean a(c<?> cVar, @zc.a e eVar, e eVar2) {
            return androidx.concurrent.futures.c.a(this.f57694d, cVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean b(c<?> cVar, @zc.a Object obj, Object obj2) {
            return androidx.concurrent.futures.c.a(this.f57695e, cVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean c(c<?> cVar, @zc.a l lVar, @zc.a l lVar2) {
            return androidx.concurrent.futures.c.a(this.f57693c, cVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.c.b
        e d(c<?> cVar, e eVar) {
            return this.f57694d.getAndSet(cVar, eVar);
        }

        @Override // com.google.common.util.concurrent.c.b
        l e(c<?> cVar, l lVar) {
            return this.f57693c.getAndSet(cVar, lVar);
        }

        @Override // com.google.common.util.concurrent.c.b
        void f(l lVar, @zc.a l lVar2) {
            this.f57692b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.c.b
        void g(l lVar, Thread thread) {
            this.f57691a.lazySet(lVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class g<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final c<V> f57696b;

        /* renamed from: c, reason: collision with root package name */
        final ListenableFuture<? extends V> f57697c;

        g(c<V> cVar, ListenableFuture<? extends V> listenableFuture) {
            this.f57696b = cVar;
            this.f57697c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((c) this.f57696b).f57678b != this) {
                return;
            }
            if (c.f57676h.b(this.f57696b, this, c.u(this.f57697c))) {
                c.r(this.f57696b);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class h extends b {
        private h() {
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean a(c<?> cVar, @zc.a e eVar, e eVar2) {
            synchronized (cVar) {
                try {
                    if (((c) cVar).f57679c != eVar) {
                        return false;
                    }
                    ((c) cVar).f57679c = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean b(c<?> cVar, @zc.a Object obj, Object obj2) {
            synchronized (cVar) {
                try {
                    if (((c) cVar).f57678b != obj) {
                        return false;
                    }
                    ((c) cVar).f57678b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean c(c<?> cVar, @zc.a l lVar, @zc.a l lVar2) {
            synchronized (cVar) {
                try {
                    if (((c) cVar).f57680d != lVar) {
                        return false;
                    }
                    ((c) cVar).f57680d = lVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.c.b
        e d(c<?> cVar, e eVar) {
            e eVar2;
            synchronized (cVar) {
                try {
                    eVar2 = ((c) cVar).f57679c;
                    if (eVar2 != eVar) {
                        ((c) cVar).f57679c = eVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.c.b
        l e(c<?> cVar, l lVar) {
            l lVar2;
            synchronized (cVar) {
                try {
                    lVar2 = ((c) cVar).f57680d;
                    if (lVar2 != lVar) {
                        ((c) cVar).f57680d = lVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.c.b
        void f(l lVar, @zc.a l lVar2) {
            lVar.f57706b = lVar2;
        }

        @Override // com.google.common.util.concurrent.c.b
        void g(l lVar, Thread thread) {
            lVar.f57705a = thread;
        }

        h(a aVar) {
        }
    }

    /* compiled from: AbstractFuture.java */
    interface i<V> extends ListenableFuture<V> {
    }

    /* compiled from: AbstractFuture.java */
    static abstract class j<V> extends c<V> implements i<V> {
        j() {
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        @f9.a
        public final boolean cancel(boolean z4) {
            return super.cancel(z4);
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        @f9.a
        @j1
        public final V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.c, com.google.common.util.concurrent.ListenableFuture
        public final void n2(Runnable runnable, Executor executor) {
            super.n2(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        @f9.a
        @j1
        public final V get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j4, timeUnit);
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class k extends b {

        /* renamed from: a, reason: collision with root package name */
        static final Unsafe f57698a;

        /* renamed from: b, reason: collision with root package name */
        static final long f57699b;

        /* renamed from: c, reason: collision with root package name */
        static final long f57700c;

        /* renamed from: d, reason: collision with root package name */
        static final long f57701d;

        /* renamed from: e, reason: collision with root package name */
        static final long f57702e;

        /* renamed from: f, reason: collision with root package name */
        static final long f57703f;

        /* compiled from: AbstractFuture.java */
        class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError(ProtectedSandApp.s("鍊"));
            }
        }

        static {
            Unsafe unsafe;
            String s4 = ProtectedSandApp.s("列");
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e4) {
                    throw new RuntimeException(ProtectedSandApp.s("裂"), e4.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f57700c = unsafe.objectFieldOffset(c.class.getDeclaredField(ProtectedSandApp.s("劣")));
                f57699b = unsafe.objectFieldOffset(c.class.getDeclaredField(ProtectedSandApp.s("咽")));
                f57701d = unsafe.objectFieldOffset(c.class.getDeclaredField(s4));
                f57702e = unsafe.objectFieldOffset(l.class.getDeclaredField(ProtectedSandApp.s("烈")));
                f57703f = unsafe.objectFieldOffset(l.class.getDeclaredField(s4));
                f57698a = unsafe;
            } catch (Exception e5) {
                com.google.common.base.w0.w(e5);
                throw new RuntimeException(e5);
            }
        }

        private k() {
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean a(c<?> cVar, @zc.a e eVar, e eVar2) {
            return com.google.android.gms.internal.play_billing.a.a(f57698a, cVar, f57699b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean b(c<?> cVar, @zc.a Object obj, Object obj2) {
            return com.google.android.gms.internal.play_billing.a.a(f57698a, cVar, f57701d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.c.b
        boolean c(c<?> cVar, @zc.a l lVar, @zc.a l lVar2) {
            return com.google.android.gms.internal.play_billing.a.a(f57698a, cVar, f57700c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.c.b
        e d(c<?> cVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ((c) cVar).f57679c;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(cVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.c.b
        l e(c<?> cVar, l lVar) {
            l lVar2;
            do {
                lVar2 = ((c) cVar).f57680d;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!c(cVar, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.c.b
        void f(l lVar, @zc.a l lVar2) {
            f57698a.putObject(lVar, f57703f, lVar2);
        }

        @Override // com.google.common.util.concurrent.c.b
        void g(l lVar, Thread thread) {
            f57698a.putObject(lVar, f57702e, thread);
        }

        k(a aVar) {
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class l {

        /* renamed from: c, reason: collision with root package name */
        static final l f57704c = new l();

        /* renamed from: a, reason: collision with root package name */
        @zc.a
        volatile Thread f57705a;

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        volatile l f57706b;

        l(boolean z4) {
        }

        void a(@zc.a l lVar) {
            c.f57676h.f(this, lVar);
        }

        void b() {
            Thread thread = this.f57705a;
            if (thread != null) {
                this.f57705a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            c.f57676h.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z4;
        b hVar;
        String s4 = ProtectedSandApp.s("凜");
        try {
            z4 = Boolean.parseBoolean(System.getProperty(ProtectedSandApp.s("凌"), ProtectedSandApp.s("稜")));
        } catch (SecurityException unused) {
            z4 = false;
        }
        f57673e = z4;
        f57674f = Logger.getLogger(c.class.getName());
        Throwable th = null;
        try {
            hVar = new k();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, ProtectedSandApp.s("綾")), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, s4), AtomicReferenceFieldUpdater.newUpdater(c.class, l.class, ProtectedSandApp.s("菱")), AtomicReferenceFieldUpdater.newUpdater(c.class, e.class, ProtectedSandApp.s("陵")), AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, s4));
            } catch (Throwable th3) {
                th = th3;
                hVar = new h();
            }
        }
        f57676h = hVar;
        if (th != null) {
            Logger logger = f57674f;
            Level level = Level.SEVERE;
            logger.log(level, ProtectedSandApp.s("讀"), th);
            logger.log(level, ProtectedSandApp.s("拏"), th);
        }
        f57677i = new Object();
    }

    protected c() {
    }

    private void A(l lVar) {
        lVar.f57705a = null;
        while (true) {
            l lVar2 = this.f57680d;
            if (lVar2 == l.f57704c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f57706b;
                if (lVar2.f57705a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f57706b = lVar4;
                    if (lVar3.f57705a == null) {
                        break;
                    }
                } else if (!f57676h.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void k(StringBuilder sb) {
        String s4 = ProtectedSandApp.s("樂");
        try {
            Object v4 = v(this);
            sb.append(ProtectedSandApp.s("諾"));
            n(sb, v4);
            sb.append(s4);
        } catch (CancellationException unused) {
            sb.append(ProtectedSandApp.s("怒"));
        } catch (RuntimeException e4) {
            sb.append(ProtectedSandApp.s("丹"));
            sb.append(e4.getClass());
            sb.append(ProtectedSandApp.s("寧"));
        } catch (ExecutionException e5) {
            sb.append(ProtectedSandApp.s("率"));
            sb.append(e5.getCause());
            sb.append(s4);
        }
    }

    private void l(StringBuilder sb) {
        String a5;
        int length = sb.length();
        sb.append(ProtectedSandApp.s("異"));
        Object obj = this.f57678b;
        boolean z4 = obj instanceof g;
        String s4 = ProtectedSandApp.s("樂");
        if (z4) {
            sb.append(ProtectedSandApp.s("北"));
            o(sb, ((g) obj).f57697c);
            sb.append(s4);
        } else {
            try {
                a5 = com.google.common.base.t0.c(y());
            } catch (RuntimeException | StackOverflowError e4) {
                String valueOf = String.valueOf(e4.getClass());
                a5 = com.google.common.base.i.a(valueOf.length() + 38, ProtectedSandApp.s("磻"), valueOf);
            }
            if (a5 != null) {
                androidx.concurrent.futures.a.a(sb, ProtectedSandApp.s("便"), a5, s4);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            k(sb);
        }
    }

    private void n(StringBuilder sb, @zc.a Object obj) {
        if (obj == null) {
            sb.append(ProtectedSandApp.s("復"));
        } else {
            if (obj == this) {
                sb.append(ProtectedSandApp.s("不"));
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append(ProtectedSandApp.s("泌"));
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void o(StringBuilder sb, @zc.a Object obj) {
        try {
            if (obj == this) {
                sb.append(ProtectedSandApp.s("不"));
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e4) {
            e = e4;
            sb.append(ProtectedSandApp.s("磻"));
            sb.append(e.getClass());
        } catch (StackOverflowError e5) {
            e = e5;
            sb.append(ProtectedSandApp.s("磻"));
            sb.append(e.getClass());
        }
    }

    private static CancellationException p(String str, @zc.a Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @zc.a
    private e q(@zc.a e eVar) {
        e eVar2 = eVar;
        e d5 = f57676h.d(this, e.f57687d);
        while (d5 != null) {
            e eVar3 = d5.f57690c;
            d5.f57690c = eVar2;
            eVar2 = d5;
            d5 = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(c<?> cVar) {
        e eVar = null;
        while (true) {
            cVar.z();
            cVar.m();
            e q4 = cVar.q(eVar);
            while (q4 != null) {
                eVar = q4.f57690c;
                Runnable runnable = q4.f57688a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    cVar = gVar.f57696b;
                    if (((c) cVar).f57678b == gVar) {
                        if (f57676h.b(cVar, gVar, u(gVar.f57697c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = q4.f57689b;
                    Objects.requireNonNull(executor);
                    s(runnable2, executor);
                }
                q4 = eVar;
            }
            return;
        }
    }

    private static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Logger logger = f57674f;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 57, ProtectedSandApp.s("數"), valueOf, ProtectedSandApp.s("索"), valueOf2), (Throwable) e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j1
    private V t(Object obj) throws ExecutionException {
        if (obj instanceof C0888c) {
            throw p(ProtectedSandApp.s("參"), ((C0888c) obj).f57684b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f57686a);
        }
        if (obj == f57677i) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object u(ListenableFuture<?> listenableFuture) {
        Throwable a5;
        String s4 = ProtectedSandApp.s("塞");
        if (listenableFuture instanceof i) {
            Object obj = ((c) listenableFuture).f57678b;
            if (obj instanceof C0888c) {
                C0888c c0888c = (C0888c) obj;
                if (c0888c.f57683a) {
                    obj = c0888c.f57684b != null ? new C0888c(false, c0888c.f57684b) : C0888c.f57682d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((listenableFuture instanceof com.google.common.util.concurrent.internal.a) && (a5 = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) listenableFuture)) != null) {
            return new d(a5);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f57673e) && isCancelled) {
            C0888c c0888c2 = C0888c.f57682d;
            Objects.requireNonNull(c0888c2);
            return c0888c2;
        }
        try {
            Object v4 = v(listenableFuture);
            if (!isCancelled) {
                return v4 == null ? f57677i : v4;
            }
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 84);
            sb.append(s4);
            sb.append(valueOf);
            return new C0888c(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e4) {
            if (isCancelled) {
                return new C0888c(false, e4);
            }
            String valueOf2 = String.valueOf(listenableFuture);
            return new d(new IllegalArgumentException(com.google.common.base.i.a(valueOf2.length() + 77, ProtectedSandApp.s("省"), valueOf2), e4));
        } catch (ExecutionException e5) {
            if (!isCancelled) {
                return new d(e5.getCause());
            }
            String valueOf3 = String.valueOf(listenableFuture);
            return new C0888c(false, new IllegalArgumentException(com.google.common.base.i.a(valueOf3.length() + 84, s4, valueOf3), e5));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    @j1
    private static <V> V v(Future<V> future) throws ExecutionException {
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

    private void z() {
        for (l e4 = f57676h.e(this, l.f57704c); e4 != null; e4 = e4.f57706b) {
            e4.b();
        }
    }

    @f9.a
    protected boolean B(@j1 V v4) {
        if (v4 == null) {
            v4 = (V) f57677i;
        }
        if (!f57676h.b(this, null, v4)) {
            return false;
        }
        r(this);
        return true;
    }

    @f9.a
    protected boolean C(Throwable th) {
        th.getClass();
        if (!f57676h.b(this, null, new d(th))) {
            return false;
        }
        r(this);
        return true;
    }

    @f9.a
    protected boolean D(ListenableFuture<? extends V> listenableFuture) {
        d dVar;
        listenableFuture.getClass();
        Object obj = this.f57678b;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f57676h.b(this, null, u(listenableFuture))) {
                    return false;
                }
                r(this);
                return true;
            }
            g gVar = new g(this, listenableFuture);
            if (f57676h.b(this, null, gVar)) {
                try {
                    listenableFuture.n2(gVar, a0.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f57685b;
                    }
                    f57676h.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f57678b;
        }
        if (obj instanceof C0888c) {
            listenableFuture.cancel(((C0888c) obj).f57683a);
        }
        return false;
    }

    protected final boolean E() {
        Object obj = this.f57678b;
        return (obj instanceof C0888c) && ((C0888c) obj).f57683a;
    }

    @Override // com.google.common.util.concurrent.internal.a
    @zc.a
    protected final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f57678b;
        if (obj instanceof d) {
            return ((d) obj).f57686a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    @f9.a
    public boolean cancel(boolean z4) {
        C0888c c0888c;
        Object obj = this.f57678b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f57673e) {
            c0888c = new C0888c(z4, new CancellationException(ProtectedSandApp.s("葉")));
        } else {
            c0888c = z4 ? C0888c.f57681c : C0888c.f57682d;
            Objects.requireNonNull(c0888c);
        }
        c<V> cVar = this;
        boolean z5 = false;
        while (true) {
            if (f57676h.b(cVar, obj, c0888c)) {
                if (z4) {
                    cVar.w();
                }
                r(cVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f57697c;
                if (!(listenableFuture instanceof i)) {
                    listenableFuture.cancel(z4);
                    return true;
                }
                cVar = (c) listenableFuture;
                obj = cVar.f57678b;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z5 = true;
            } else {
                obj = cVar.f57678b;
                if (!(obj instanceof g)) {
                    return z5;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @f9.a
    @j1
    public V get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f57678b;
        if ((obj != null) && (!(obj instanceof g))) {
            return t(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f57680d;
            if (lVar != l.f57704c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f57676h.c(this, lVar, lVar2)) {
                        do {
                            i1.a(this, nanos);
                            if (Thread.interrupted()) {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f57678b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return t(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        A(lVar2);
                    } else {
                        lVar = this.f57680d;
                    }
                } while (lVar != l.f57704c);
            }
            Object obj3 = this.f57678b;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f57678b;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return t(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String cVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(lowerCase2, 28));
        sb.append(ProtectedSandApp.s("說"));
        sb.append(j4);
        String s4 = ProtectedSandApp.s("殺");
        sb.append(s4);
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = String.valueOf(sb2).concat(ProtectedSandApp.s("辰"));
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z4 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(com.google.android.gms.common.internal.b.a(lowerCase, valueOf.length() + 21));
                sb3.append(valueOf);
                sb3.append(convert);
                sb3.append(s4);
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z4) {
                    sb4 = String.valueOf(sb4).concat(ProtectedSandApp.s("沈"));
                }
                concat = String.valueOf(sb4).concat(s4);
            }
            if (z4) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(ProtectedSandApp.s("拾"));
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat(ProtectedSandApp.s("若"));
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(ProtectedSandApp.s("掠")));
        }
        throw new TimeoutException(com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(cVar, com.google.android.gms.common.internal.b.a(sb2, 5)), sb2, ProtectedSandApp.s("略"), cVar));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f57678b instanceof C0888c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f57678b != null);
    }

    @d9.a
    @f9.g
    protected void m() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void n2(Runnable runnable, Executor executor) {
        e eVar;
        com.google.common.base.l0.F(runnable, ProtectedSandApp.s("亮"));
        com.google.common.base.l0.F(executor, ProtectedSandApp.s("兩"));
        if (!isDone() && (eVar = this.f57679c) != e.f57687d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f57690c = eVar;
                if (f57676h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f57679c;
                }
            } while (eVar != e.f57687d);
        }
        s(runnable, executor);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith(ProtectedSandApp.s("凉"))) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(ProtectedSandApp.s("梁"));
        if (isCancelled()) {
            sb.append(ProtectedSandApp.s("怒"));
        } else if (isDone()) {
            k(sb);
        } else {
            l(sb);
        }
        sb.append(ProtectedSandApp.s("樂"));
        return sb.toString();
    }

    protected void w() {
    }

    final void x(@zc.a Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(E());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zc.a
    protected String y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append(ProtectedSandApp.s("糧"));
        sb.append(delay);
        sb.append(ProtectedSandApp.s("良"));
        return sb.toString();
    }

    /* compiled from: AbstractFuture.java */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f57687d = new e();

        /* renamed from: a, reason: collision with root package name */
        @zc.a
        final Runnable f57688a;

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        final Executor f57689b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        e f57690c;

        e(Runnable runnable, Executor executor) {
            this.f57688a = runnable;
            this.f57689b = executor;
        }

        e() {
            this.f57688a = null;
            this.f57689b = null;
        }
    }

    @Override // java.util.concurrent.Future
    @f9.a
    @j1
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f57678b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return t(obj2);
            }
            l lVar = this.f57680d;
            if (lVar != l.f57704c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f57676h.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f57678b;
                            } else {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return t(obj);
                    }
                    lVar = this.f57680d;
                } while (lVar != l.f57704c);
            }
            Object obj3 = this.f57678b;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        throw new InterruptedException();
    }
}
