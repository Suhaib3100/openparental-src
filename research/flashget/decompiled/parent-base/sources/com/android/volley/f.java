package com.android.volley;

import android.os.Process;
import androidx.annotation.m1;
import com.android.volley.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.BlockingQueue;

/* compiled from: CacheDispatcher.java */
/* loaded from: classes3.dex */
public class f extends Thread {

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f40870h = t.f40943b;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<n<?>> f40871b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue<n<?>> f40872c;

    /* renamed from: d, reason: collision with root package name */
    private final e f40873d;

    /* renamed from: e, reason: collision with root package name */
    private final r f40874e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f40875f = false;

    /* renamed from: g, reason: collision with root package name */
    private final u f40876g;

    /* compiled from: CacheDispatcher.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f40877b;

        a(n nVar) {
            this.f40877b = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.f40872c.put(this.f40877b);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public f(BlockingQueue<n<?>> blockingQueue, BlockingQueue<n<?>> blockingQueue2, e eVar, r rVar) {
        this.f40871b = blockingQueue;
        this.f40872c = blockingQueue2;
        this.f40873d = eVar;
        this.f40874e = rVar;
        this.f40876g = new u(this, blockingQueue2, rVar);
    }

    private void b() throws InterruptedException {
        c(this.f40871b.take());
    }

    @m1
    void c(n<?> nVar) throws InterruptedException {
        nVar.addMarker(ProtectedSandApp.s("ٻ"));
        nVar.sendEvent(1);
        try {
            if (nVar.isCanceled()) {
                nVar.finish(ProtectedSandApp.s("ټ"));
                return;
            }
            e.a aVar = this.f40873d.get(nVar.getCacheKey());
            if (aVar == null) {
                nVar.addMarker(ProtectedSandApp.s("ٽ"));
                if (!this.f40876g.c(nVar)) {
                    this.f40872c.put(nVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar.b(currentTimeMillis)) {
                nVar.addMarker(ProtectedSandApp.s("پ"));
                nVar.setCacheEntry(aVar);
                if (!this.f40876g.c(nVar)) {
                    this.f40872c.put(nVar);
                }
                return;
            }
            nVar.addMarker(ProtectedSandApp.s("ٿ"));
            q<?> parseNetworkResponse = nVar.parseNetworkResponse(new l(aVar.f40862a, aVar.f40868g));
            nVar.addMarker(ProtectedSandApp.s("ڀ"));
            if (!parseNetworkResponse.b()) {
                nVar.addMarker(ProtectedSandApp.s("ځ"));
                this.f40873d.d(nVar.getCacheKey(), true);
                nVar.setCacheEntry(null);
                if (!this.f40876g.c(nVar)) {
                    this.f40872c.put(nVar);
                }
                return;
            }
            if (aVar.d(currentTimeMillis)) {
                nVar.addMarker(ProtectedSandApp.s("ڂ"));
                nVar.setCacheEntry(aVar);
                parseNetworkResponse.f40941d = true;
                if (this.f40876g.c(nVar)) {
                    this.f40874e.a(nVar, parseNetworkResponse);
                } else {
                    this.f40874e.b(nVar, parseNetworkResponse, new a(nVar));
                }
            } else {
                this.f40874e.a(nVar, parseNetworkResponse);
            }
        } finally {
            nVar.sendEvent(2);
        }
    }

    public void d() {
        this.f40875f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f40870h) {
            t.f(ProtectedSandApp.s("ڃ"), new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f40873d.c();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f40875f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                t.c(ProtectedSandApp.s("ڄ"), new Object[0]);
            }
        }
    }
}
