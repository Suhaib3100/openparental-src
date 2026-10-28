package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.f;

/* compiled from: EventBusBuilder.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: n, reason: collision with root package name */
    private static final ExecutorService f32156n = Executors.newCachedThreadPool();

    /* renamed from: e, reason: collision with root package name */
    boolean f32161e;

    /* renamed from: g, reason: collision with root package name */
    boolean f32163g;

    /* renamed from: h, reason: collision with root package name */
    boolean f32164h;

    /* renamed from: j, reason: collision with root package name */
    List<Class<?>> f32166j;

    /* renamed from: k, reason: collision with root package name */
    List<org.greenrobot.eventbus.meta.d> f32167k;

    /* renamed from: l, reason: collision with root package name */
    f f32168l;

    /* renamed from: m, reason: collision with root package name */
    g f32169m;

    /* renamed from: a, reason: collision with root package name */
    boolean f32157a = true;

    /* renamed from: b, reason: collision with root package name */
    boolean f32158b = true;

    /* renamed from: c, reason: collision with root package name */
    boolean f32159c = true;

    /* renamed from: d, reason: collision with root package name */
    boolean f32160d = true;

    /* renamed from: f, reason: collision with root package name */
    boolean f32162f = true;

    /* renamed from: i, reason: collision with root package name */
    ExecutorService f32165i = f32156n;

    d() {
    }

    public d a(org.greenrobot.eventbus.meta.d dVar) {
        if (this.f32167k == null) {
            this.f32167k = new ArrayList();
        }
        this.f32167k.add(dVar);
        return this;
    }

    public c b() {
        return new c(this);
    }

    public d c(boolean z5) {
        this.f32162f = z5;
        return this;
    }

    public d d(ExecutorService executorService) {
        this.f32165i = executorService;
        return this;
    }

    f e() {
        f fVar = this.f32168l;
        return fVar != null ? fVar : f.a.a();
    }

    g f() {
        g gVar = this.f32169m;
        if (gVar != null) {
            return gVar;
        }
        if (c5.a.a()) {
            return c5.a.b().f10690b;
        }
        return null;
    }

    public d g(boolean z5) {
        this.f32163g = z5;
        return this;
    }

    public c h() {
        c cVar;
        synchronized (c.class) {
            if (c.f32127t != null) {
                throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
            c.f32127t = b();
            cVar = c.f32127t;
        }
        return cVar;
    }

    public d i(boolean z5) {
        this.f32158b = z5;
        return this;
    }

    public d j(boolean z5) {
        this.f32157a = z5;
        return this;
    }

    public d k(f fVar) {
        this.f32168l = fVar;
        return this;
    }

    public d l(boolean z5) {
        this.f32160d = z5;
        return this;
    }

    public d m(boolean z5) {
        this.f32159c = z5;
        return this;
    }

    public d n(Class<?> cls) {
        if (this.f32166j == null) {
            this.f32166j = new ArrayList();
        }
        this.f32166j.add(cls);
        return this;
    }

    public d o(boolean z5) {
        this.f32164h = z5;
        return this;
    }

    public d p(boolean z5) {
        this.f32161e = z5;
        return this;
    }
}
