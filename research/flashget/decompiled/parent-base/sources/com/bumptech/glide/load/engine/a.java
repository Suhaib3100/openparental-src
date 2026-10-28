package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.p;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: classes3.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43845a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f43846b;

    /* renamed from: c, reason: collision with root package name */
    @m1
    final Map<com.bumptech.glide.load.f, d> f43847c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f43848d;

    /* renamed from: e, reason: collision with root package name */
    private p.a f43849e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f43850f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private volatile c f43851g;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0735a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0736a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f43852b;

            RunnableC0736a(Runnable runnable) {
                this.f43852b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f43852b.run();
            }
        }

        ThreadFactoryC0735a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@o0 Runnable runnable) {
            return new Thread(new RunnableC0736a(runnable), ProtectedSandApp.s("\u0896"));
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
        final com.bumptech.glide.load.f f43855a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f43856b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        u<?> f43857c;

        d(@o0 com.bumptech.glide.load.f fVar, @o0 p<?> pVar, @o0 ReferenceQueue<? super p<?>> referenceQueue, boolean z4) {
            super(pVar, referenceQueue);
            String s4 = ProtectedSandApp.s("\u0897");
            this.f43855a = (com.bumptech.glide.load.f) com.bumptech.glide.util.m.f(fVar, s4);
            this.f43857c = (pVar.d() && z4) ? (u) com.bumptech.glide.util.m.f(pVar.c(), s4) : null;
            this.f43856b = pVar.d();
        }

        void a() {
            this.f43857c = null;
            clear();
        }
    }

    a(boolean z4) {
        this(z4, Executors.newSingleThreadExecutor(new ThreadFactoryC0735a()));
    }

    synchronized void a(com.bumptech.glide.load.f fVar, p<?> pVar) {
        d put = this.f43847c.put(fVar, new d(fVar, pVar, this.f43848d, this.f43845a));
        if (put != null) {
            put.a();
        }
    }

    void b() {
        while (!this.f43850f) {
            try {
                c((d) this.f43848d.remove());
                c cVar = this.f43851g;
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
            this.f43847c.remove(dVar.f43855a);
            if (dVar.f43856b && (uVar = dVar.f43857c) != null) {
                this.f43849e.d(dVar.f43855a, new p<>(uVar, true, false, dVar.f43855a, this.f43849e));
            }
        }
    }

    synchronized void d(com.bumptech.glide.load.f fVar) {
        d remove = this.f43847c.remove(fVar);
        if (remove != null) {
            remove.a();
        }
    }

    @q0
    synchronized p<?> e(com.bumptech.glide.load.f fVar) {
        d dVar = this.f43847c.get(fVar);
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
        this.f43851g = cVar;
    }

    void g(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f43849e = aVar;
            }
        }
    }

    @m1
    void h() {
        this.f43850f = true;
        Executor executor = this.f43846b;
        if (executor instanceof ExecutorService) {
            com.bumptech.glide.util.f.c((ExecutorService) executor);
        }
    }

    @m1
    a(boolean z4, Executor executor) {
        this.f43847c = new HashMap();
        this.f43848d = new ReferenceQueue<>();
        this.f43845a = z4;
        this.f43846b = executor;
        executor.execute(new b());
    }
}
