package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.f;

/* compiled from: EventBusBuilder.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: n, reason: collision with root package name */
    private static final ExecutorService f86829n = Executors.newCachedThreadPool();

    /* renamed from: e, reason: collision with root package name */
    boolean f86834e;

    /* renamed from: g, reason: collision with root package name */
    boolean f86836g;

    /* renamed from: h, reason: collision with root package name */
    boolean f86837h;

    /* renamed from: j, reason: collision with root package name */
    List<Class<?>> f86839j;

    /* renamed from: k, reason: collision with root package name */
    List<org.greenrobot.eventbus.meta.d> f86840k;

    /* renamed from: l, reason: collision with root package name */
    f f86841l;

    /* renamed from: m, reason: collision with root package name */
    g f86842m;

    /* renamed from: a, reason: collision with root package name */
    boolean f86830a = true;

    /* renamed from: b, reason: collision with root package name */
    boolean f86831b = true;

    /* renamed from: c, reason: collision with root package name */
    boolean f86832c = true;

    /* renamed from: d, reason: collision with root package name */
    boolean f86833d = true;

    /* renamed from: f, reason: collision with root package name */
    boolean f86835f = true;

    /* renamed from: i, reason: collision with root package name */
    ExecutorService f86838i = f86829n;

    d() {
    }

    public d a(org.greenrobot.eventbus.meta.d dVar) {
        if (this.f86840k == null) {
            this.f86840k = new ArrayList();
        }
        this.f86840k.add(dVar);
        return this;
    }

    public c b() {
        return new c(this);
    }

    public d c(boolean z4) {
        this.f86835f = z4;
        return this;
    }

    public d d(ExecutorService executorService) {
        this.f86838i = executorService;
        return this;
    }

    f e() {
        f fVar = this.f86841l;
        return fVar != null ? fVar : f.a.a();
    }

    g f() {
        g gVar = this.f86842m;
        if (gVar != null) {
            return gVar;
        }
        if (dg.a.a()) {
            return dg.a.b().f73730b;
        }
        return null;
    }

    public d g(boolean z4) {
        this.f86836g = z4;
        return this;
    }

    public c h() {
        c cVar;
        synchronized (c.class) {
            try {
                if (c.f86800t != null) {
                    throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
                }
                c.f86800t = b();
                cVar = c.f86800t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public d i(boolean z4) {
        this.f86831b = z4;
        return this;
    }

    public d j(boolean z4) {
        this.f86830a = z4;
        return this;
    }

    public d k(f fVar) {
        this.f86841l = fVar;
        return this;
    }

    public d l(boolean z4) {
        this.f86833d = z4;
        return this;
    }

    public d m(boolean z4) {
        this.f86832c = z4;
        return this;
    }

    public d n(Class<?> cls) {
        if (this.f86839j == null) {
            this.f86839j = new ArrayList();
        }
        this.f86839j.add(cls);
        return this;
    }

    public d o(boolean z4) {
        this.f86837h = z4;
        return this;
    }

    public d p(boolean z4) {
        this.f86834e = z4;
        return this;
    }
}
