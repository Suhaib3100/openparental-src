package org.greenrobot.eventbus;

import java.util.logging.Level;

/* compiled from: BackgroundPoster.java */
/* loaded from: classes6.dex */
final class b implements Runnable, k {

    /* renamed from: b, reason: collision with root package name */
    private final j f86796b = new j();

    /* renamed from: c, reason: collision with root package name */
    private final c f86797c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f86798d;

    b(c cVar) {
        this.f86797c = cVar;
    }

    @Override // org.greenrobot.eventbus.k
    public void a(p pVar, Object obj) {
        i a5 = i.a(pVar, obj);
        synchronized (this) {
            try {
                this.f86796b.a(a5);
                if (!this.f86798d) {
                    this.f86798d = true;
                    this.f86797c.g().execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    i c5 = this.f86796b.c(1000);
                    if (c5 == null) {
                        synchronized (this) {
                            c5 = this.f86796b.b();
                            if (c5 == null) {
                                this.f86798d = false;
                                this.f86798d = false;
                                return;
                            }
                        }
                    }
                    this.f86797c.l(c5);
                } catch (InterruptedException e4) {
                    this.f86797c.h().a(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e4);
                    this.f86798d = false;
                    return;
                }
            } catch (Throwable th) {
                this.f86798d = false;
                throw th;
            }
        }
    }
}
