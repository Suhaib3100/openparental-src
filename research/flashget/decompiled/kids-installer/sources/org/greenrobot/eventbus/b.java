package org.greenrobot.eventbus;

import java.util.logging.Level;

/* compiled from: BackgroundPoster.java */
/* loaded from: classes6.dex */
final class b implements Runnable, k {

    /* renamed from: o, reason: collision with root package name */
    private final j f32123o = new j();

    /* renamed from: p, reason: collision with root package name */
    private final c f32124p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f32125q;

    b(c cVar) {
        this.f32124p = cVar;
    }

    @Override // org.greenrobot.eventbus.k
    public void a(p pVar, Object obj) {
        i a6 = i.a(pVar, obj);
        synchronized (this) {
            this.f32123o.a(a6);
            if (!this.f32125q) {
                this.f32125q = true;
                this.f32124p.g().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                i c6 = this.f32123o.c(1000);
                if (c6 == null) {
                    synchronized (this) {
                        c6 = this.f32123o.b();
                        if (c6 == null) {
                            return;
                        }
                    }
                }
                this.f32124p.l(c6);
            } catch (InterruptedException e6) {
                this.f32124p.h().b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e6);
                return;
            } finally {
                this.f32125q = false;
            }
        }
    }
}
