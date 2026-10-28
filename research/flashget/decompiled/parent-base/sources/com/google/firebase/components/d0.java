package com.google.firebase.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes6.dex */
final class d0 implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<b0<?>> f58429a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b0<?>> f58430b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b0<?>> f58431c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<b0<?>> f58432d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<b0<?>> f58433e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f58434f;

    /* renamed from: g, reason: collision with root package name */
    private final d f58435g;

    /* compiled from: RestrictedComponentContainer.java */
    private static class a implements v9.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f58436a;

        /* renamed from: b, reason: collision with root package name */
        private final v9.c f58437b;

        public a(Set<Class<?>> set, v9.c cVar) {
            this.f58436a = set;
            this.f58437b = cVar;
        }

        @Override // v9.c
        public void b(v9.a<?> aVar) {
            if (!this.f58436a.contains(aVar.b())) {
                throw new DependencyException(String.format(ProtectedSandApp.s("ﭯ"), aVar));
            }
            this.f58437b.b(aVar);
        }
    }

    d0(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.j()) {
            if (rVar.f()) {
                if (rVar.h()) {
                    hashSet4.add(rVar.d());
                } else {
                    hashSet.add(rVar.d());
                }
            } else if (rVar.e()) {
                hashSet3.add(rVar.d());
            } else if (rVar.h()) {
                hashSet5.add(rVar.d());
            } else {
                hashSet2.add(rVar.d());
            }
        }
        if (!cVar.n().isEmpty()) {
            hashSet.add(b0.b(v9.c.class));
        }
        this.f58429a = Collections.unmodifiableSet(hashSet);
        this.f58430b = Collections.unmodifiableSet(hashSet2);
        this.f58431c = Collections.unmodifiableSet(hashSet3);
        this.f58432d = Collections.unmodifiableSet(hashSet4);
        this.f58433e = Collections.unmodifiableSet(hashSet5);
        this.f58434f = cVar.n();
        this.f58435g = dVar;
    }

    @Override // com.google.firebase.components.d
    public <T> T a(Class<T> cls) {
        if (!this.f58429a.contains(b0.b(cls))) {
            throw new DependencyException(String.format(ProtectedSandApp.s("ﭰ"), cls));
        }
        T t4 = (T) this.f58435g.a(cls);
        return !cls.equals(v9.c.class) ? t4 : (T) new a(this.f58434f, (v9.c) t4);
    }

    @Override // com.google.firebase.components.d
    public <T> y9.b<T> b(b0<T> b0Var) {
        if (this.f58430b.contains(b0Var)) {
            return this.f58435g.b(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("ﭱ"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> y9.b<Set<T>> d(Class<T> cls) {
        return f(b0.b(cls));
    }

    @Override // com.google.firebase.components.d
    public <T> Set<T> e(b0<T> b0Var) {
        if (this.f58432d.contains(b0Var)) {
            return this.f58435g.e(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("ﭲ"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> y9.b<Set<T>> f(b0<T> b0Var) {
        if (this.f58433e.contains(b0Var)) {
            return this.f58435g.f(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("ﭳ"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> T g(b0<T> b0Var) {
        if (this.f58429a.contains(b0Var)) {
            return (T) this.f58435g.g(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("ﭰ"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> y9.b<T> i(Class<T> cls) {
        return b(b0.b(cls));
    }

    @Override // com.google.firebase.components.d
    public <T> y9.a<T> j(b0<T> b0Var) {
        if (this.f58431c.contains(b0Var)) {
            return this.f58435g.j(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("ﭴ"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> y9.a<T> k(Class<T> cls) {
        return j(b0.b(cls));
    }
}
