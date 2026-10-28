package com.nostra13.universalimageloader.core;

import com.nostra13.universalimageloader.core.download.b;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ImageLoaderEngine.java */
/* loaded from: classes6.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    final e f70450a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f70451b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f70452c;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Integer, String> f70454e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, ReentrantLock> f70455f = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f70456g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f70457h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f70458i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    private final Object f70459j = new Object();

    /* renamed from: d, reason: collision with root package name */
    private Executor f70453d = com.nostra13.universalimageloader.core.a.i();

    /* compiled from: ImageLoaderEngine.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f70460b;

        a(h hVar) {
            this.f70460b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = f.this.f70450a.f70415o.get(this.f70460b.f70486j);
            boolean z4 = (file != null && file.exists()) || f.this.o(this.f70460b.f70486j);
            f.this.n();
            if (z4) {
                f.this.f70452c.execute(this.f70460b);
            } else {
                f.this.f70451b.execute(this.f70460b);
            }
        }
    }

    f(e eVar) {
        this.f70450a = eVar;
        this.f70451b = eVar.f70407g;
        this.f70452c = eVar.f70408h;
    }

    private Executor f() {
        e eVar = this.f70450a;
        return com.nostra13.universalimageloader.core.a.c(eVar.f70411k, eVar.f70412l, eVar.f70413m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (!this.f70450a.f70409i && ((ExecutorService) this.f70451b).isShutdown()) {
            this.f70451b = f();
        }
        if (this.f70450a.f70410j || !((ExecutorService) this.f70452c).isShutdown()) {
            return;
        }
        this.f70452c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(String str) {
        b.a ofUri = b.a.ofUri(str);
        return ofUri == b.a.ASSETS || ofUri == b.a.FILE || ofUri == b.a.DRAWABLE;
    }

    void e(com.nostra13.universalimageloader.core.imageaware.a aVar) {
        this.f70454e.remove(Integer.valueOf(aVar.a()));
    }

    void g(boolean z4) {
        this.f70457h.set(z4);
    }

    void h(Runnable runnable) {
        this.f70453d.execute(runnable);
    }

    String i(com.nostra13.universalimageloader.core.imageaware.a aVar) {
        return this.f70454e.get(Integer.valueOf(aVar.a()));
    }

    ReentrantLock j(String str) {
        ReentrantLock reentrantLock = this.f70455f.get(str);
        if (reentrantLock != null) {
            return reentrantLock;
        }
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f70455f.put(str, reentrantLock2);
        return reentrantLock2;
    }

    AtomicBoolean k() {
        return this.f70456g;
    }

    Object l() {
        return this.f70459j;
    }

    void m(boolean z4) {
        this.f70458i.set(z4);
    }

    boolean p() {
        return this.f70457h.get();
    }

    boolean q() {
        return this.f70458i.get();
    }

    void r() {
        this.f70456g.set(true);
    }

    void s(com.nostra13.universalimageloader.core.imageaware.a aVar, String str) {
        this.f70454e.put(Integer.valueOf(aVar.a()), str);
    }

    void t() {
        this.f70456g.set(false);
        synchronized (this.f70459j) {
            this.f70459j.notifyAll();
        }
    }

    void u() {
        if (!this.f70450a.f70409i) {
            ((ExecutorService) this.f70451b).shutdownNow();
        }
        if (!this.f70450a.f70410j) {
            ((ExecutorService) this.f70452c).shutdownNow();
        }
        this.f70454e.clear();
        this.f70455f.clear();
    }

    void v(h hVar) {
        this.f70453d.execute(new a(hVar));
    }

    void w(i iVar) {
        n();
        this.f70452c.execute(iVar);
    }
}
