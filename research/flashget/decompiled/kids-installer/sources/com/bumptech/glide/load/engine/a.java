package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.p;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11137a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f11138b;

    /* renamed from: c, reason: collision with root package name */
    @m1
    final Map<com.bumptech.glide.load.f, d> f11139c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f11140d;

    /* renamed from: e, reason: collision with root package name */
    private p.a f11141e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f11142f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private volatile c f11143g;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0136a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0137a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Runnable f11144o;

            RunnableC0137a(Runnable runnable) {
                this.f11144o = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f11144o.run();
            }
        }

        ThreadFactoryC0136a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@o0 Runnable runnable) {
            return new Thread(new RunnableC0137a(runnable), ProtectedSandApp.s("ę"));
        }
    }

    /* compiled from: ActiveResources.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* compiled from: ActiveResources.java */
    @m1
    interface c {
        void a();
    }

    /* compiled from: ActiveResources.java */
    @m1
    static final class d extends WeakReference<p<?>> {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.f f11147a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f11148b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        u<?> f11149c;

        d(@o0 com.bumptech.glide.load.f fVar, @o0 p<?> pVar, @o0 ReferenceQueue<? super p<?>> referenceQueue, boolean z5) {
            super(pVar, referenceQueue);
            this.f11147a = (com.bumptech.glide.load.f) com.bumptech.glide.util.l.d(fVar);
            this.f11149c = (pVar.e() && z5) ? (u) com.bumptech.glide.util.l.d(pVar.d()) : null;
            this.f11148b = pVar.e();
        }

        void a() {
            this.f11149c = null;
            clear();
        }
    }

    a(boolean z5) {
        this(z5, Executors.newSingleThreadExecutor(new ThreadFactoryC0136a()));
    }

    synchronized void a(com.bumptech.glide.load.f fVar, p<?> pVar) {
        d put = this.f11139c.put(fVar, new d(fVar, pVar, this.f11140d, this.f11137a));
        if (put != null) {
            put.a();
        }
    }

    void b() {
        while (!this.f11142f) {
            try {
                c((d) this.f11140d.remove());
                c cVar = this.f11143g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(@o0 d dVar) {
        u<?> uVar;
        synchronized (this) {
            this.f11139c.remove(dVar.f11147a);
            if (dVar.f11148b && (uVar = dVar.f11149c) != null) {
                this.f11141e.d(dVar.f11147a, new p<>(uVar, true, false, dVar.f11147a, this.f11141e));
            }
        }
    }

    synchronized void d(com.bumptech.glide.load.f fVar) {
        d remove = this.f11139c.remove(fVar);
        if (remove != null) {
            remove.a();
        }
    }

    @q0
    synchronized p<?> e(com.bumptech.glide.load.f fVar) {
        d dVar = this.f11139c.get(fVar);
        if (dVar == null) {
            return null;
        }
        p<?> pVar = dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    @m1
    void f(c cVar) {
        this.f11143g = cVar;
    }

    void g(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f11141e = aVar;
            }
        }
    }

    @m1
    void h() {
        this.f11142f = true;
        Executor executor = this.f11138b;
        if (executor instanceof ExecutorService) {
            com.bumptech.glide.util.f.c((ExecutorService) executor);
        }
    }

    @m1
    a(boolean z5, Executor executor) {
        this.f11139c = new HashMap();
        this.f11140d = new ReferenceQueue<>();
        this.f11137a = z5;
        this.f11138b = executor;
        executor.execute(new b());
    }
}
