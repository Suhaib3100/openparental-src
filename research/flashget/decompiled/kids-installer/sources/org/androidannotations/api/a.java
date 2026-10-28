package org.androidannotations.api;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BackgroundExecutor.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f31742a = "BackgroundExecutor";

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f31743b;

    /* renamed from: c, reason: collision with root package name */
    private static Executor f31744c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f31745d;

    /* renamed from: e, reason: collision with root package name */
    private static d f31746e;

    /* renamed from: f, reason: collision with root package name */
    private static final List<c> f31747f;

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<String> f31748g;

    /* compiled from: BackgroundExecutor.java */
    /* renamed from: org.androidannotations.api.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static class C0493a implements d {
        C0493a() {
        }

        @Override // org.androidannotations.api.a.d
        public void a(String str, String... strArr) {
            if (str == null) {
                str = "anonymous";
            }
            throw new IllegalStateException("Method invocation is expected from one of serials " + Arrays.toString(strArr) + ", but it was called from " + str + " serial");
        }

        @Override // org.androidannotations.api.a.d
        public void b() {
            throw new IllegalStateException("Method invocation is expected from the UI thread");
        }

        @Override // org.androidannotations.api.a.d
        public void c(String... strArr) {
            if (strArr.length != 0) {
                throw new IllegalStateException(androidx.concurrent.futures.a.a(new StringBuilder("Method invocation is expected from one of serials "), Arrays.toString(strArr), ", but it was called from the UI thread"));
            }
            throw new IllegalStateException("Method invocation is expected from a background thread, but it was called from the UI thread");
        }
    }

    /* compiled from: BackgroundExecutor.java */
    /* loaded from: classes6.dex */
    static class b extends c {

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Runnable f31749v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j5, String str2, Runnable runnable) {
            super(str, j5, str2);
            this.f31749v = runnable;
        }

        @Override // org.androidannotations.api.a.c
        public void j() {
            this.f31749v.run();
        }
    }

    /* compiled from: BackgroundExecutor.java */
    public static abstract class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private String f31750o;

        /* renamed from: p, reason: collision with root package name */
        private long f31751p;

        /* renamed from: q, reason: collision with root package name */
        private long f31752q;

        /* renamed from: r, reason: collision with root package name */
        private String f31753r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f31754s;

        /* renamed from: t, reason: collision with root package name */
        private Future<?> f31755t;

        /* renamed from: u, reason: collision with root package name */
        private AtomicBoolean f31756u = new AtomicBoolean();

        public c(String str, long j5, String str2) {
            if (!"".equals(str)) {
                this.f31750o = str;
            }
            if (j5 > 0) {
                this.f31751p = j5;
                this.f31752q = SystemClock.elapsedRealtime() + j5;
            }
            if ("".equals(str2)) {
                return;
            }
            this.f31753r = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            c p5;
            if (this.f31750o == null && this.f31753r == null) {
                return;
            }
            a.f31748g.set(null);
            synchronized (a.class) {
                a.f31747f.remove(this);
                String str = this.f31753r;
                if (str != null && (p5 = a.p(str)) != null) {
                    if (p5.f31751p != 0) {
                        p5.f31751p = Math.max(0L, p5.f31752q - SystemClock.elapsedRealtime());
                    }
                    a.l(p5);
                }
            }
        }

        public abstract void j();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31756u.getAndSet(true)) {
                return;
            }
            try {
                a.f31748g.set(this.f31753r);
                j();
            } finally {
                k();
            }
        }
    }

    /* compiled from: BackgroundExecutor.java */
    public interface d {
        void a(String str, String... strArr);

        void b();

        void c(String... strArr);
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        f31743b = newScheduledThreadPool;
        f31744c = newScheduledThreadPool;
        C0493a c0493a = new C0493a();
        f31745d = c0493a;
        f31746e = c0493a;
        f31747f = new ArrayList();
        f31748g = new ThreadLocal<>();
    }

    private a() {
    }

    public static synchronized void d(String str, boolean z5) {
        synchronized (a.class) {
            for (int size = f31747f.size() - 1; size >= 0; size--) {
                List<c> list = f31747f;
                c cVar = list.get(size);
                if (str.equals(cVar.f31750o)) {
                    if (cVar.f31755t != null) {
                        cVar.f31755t.cancel(z5);
                        if (!cVar.f31756u.getAndSet(true)) {
                            cVar.k();
                        }
                    } else if (cVar.f31754s) {
                        String unused = cVar.f31750o;
                    } else {
                        list.remove(size);
                    }
                }
            }
        }
    }

    public static void e(String... strArr) {
        if (strArr.length == 0) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                f31746e.c(strArr);
                return;
            }
            return;
        }
        String str = f31748g.get();
        if (str == null) {
            f31746e.a(null, strArr);
            return;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return;
            }
        }
        f31746e.a(str, strArr);
    }

    public static void f() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            f31746e.b();
        }
    }

    private static Future<?> g(Runnable runnable, long j5) {
        if (j5 > 0) {
            Executor executor = f31744c;
            if (executor instanceof ScheduledExecutorService) {
                return ((ScheduledExecutorService) executor).schedule(runnable, j5, TimeUnit.MILLISECONDS);
            }
            throw new IllegalArgumentException("The executor set does not support scheduling");
        }
        Executor executor2 = f31744c;
        if (executor2 instanceof ExecutorService) {
            return ((ExecutorService) executor2).submit(runnable);
        }
        executor2.execute(runnable);
        return null;
    }

    public static void h(Runnable runnable) {
        g(runnable, 0L);
    }

    public static void i(Runnable runnable, long j5) {
        g(runnable, j5);
    }

    public static void j(Runnable runnable, String str, long j5, String str2) {
        l(new b(str, j5, str2, runnable));
    }

    public static void k(Runnable runnable, String str, String str2) {
        j(runnable, str, 0L, str2);
    }

    public static synchronized void l(c cVar) {
        synchronized (a.class) {
            if (cVar.f31750o != null || cVar.f31753r != null) {
                f31747f.add(cVar);
            }
            if (cVar.f31753r == null || !m(cVar.f31753r)) {
                cVar.f31754s = true;
                cVar.f31755t = g(cVar, cVar.f31751p);
            }
        }
    }

    private static boolean m(String str) {
        for (c cVar : f31747f) {
            if (cVar.f31754s && str.equals(cVar.f31753r)) {
                return true;
            }
        }
        return false;
    }

    public static void n(Executor executor) {
        f31744c = executor;
    }

    public static void o(d dVar) {
        f31746e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c p(String str) {
        int size = f31747f.size();
        for (int i5 = 0; i5 < size; i5++) {
            List<c> list = f31747f;
            if (str.equals(list.get(i5).f31753r)) {
                return list.remove(i5);
            }
        }
        return null;
    }
}
