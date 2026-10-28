package com.google.firebase.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes3.dex */
final class d0 implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<b0<?>> f15352a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b0<?>> f15353b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b0<?>> f15354c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<b0<?>> f15355d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<b0<?>> f15356e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f15357f;

    /* renamed from: g, reason: collision with root package name */
    private final d f15358g;

    /* compiled from: RestrictedComponentContainer.java */
    private static class a implements l2.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f15359a;

        /* renamed from: b, reason: collision with root package name */
        private final l2.c f15360b;

        public a(Set<Class<?>> set, l2.c cVar) {
            this.f15359a = set;
            this.f15360b = cVar;
        }

        @Override // l2.c
        public void c(l2.a<?> aVar) {
            if (!this.f15359a.contains(aVar.b())) {
                throw new DependencyException(String.format(ProtectedSandApp.s("⟋"), aVar));
            }
            this.f15360b.c(aVar);
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
            hashSet.add(b0.b(l2.c.class));
        }
        this.f15352a = Collections.unmodifiableSet(hashSet);
        this.f15353b = Collections.unmodifiableSet(hashSet2);
        this.f15354c = Collections.unmodifiableSet(hashSet3);
        this.f15355d = Collections.unmodifiableSet(hashSet4);
        this.f15356e = Collections.unmodifiableSet(hashSet5);
        this.f15357f = cVar.n();
        this.f15358g = dVar;
    }

    @Override // com.google.firebase.components.d
    public <T> T a(Class<T> cls) {
        if (!this.f15352a.contains(b0.b(cls))) {
            throw new DependencyException(String.format(ProtectedSandApp.s("⟌"), cls));
        }
        T t5 = (T) this.f15358g.a(cls);
        return !cls.equals(l2.c.class) ? t5 : (T) new a(this.f15357f, (l2.c) t5);
    }

    @Override // com.google.firebase.components.d
    public <T> o2.b<T> b(b0<T> b0Var) {
        if (this.f15353b.contains(b0Var)) {
            return this.f15358g.b(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("⟍"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> o2.b<T> c(Class<T> cls) {
        return b(b0.b(cls));
    }

    @Override // com.google.firebase.components.d
    public <T> o2.b<Set<T>> e(Class<T> cls) {
        return g(b0.b(cls));
    }

    @Override // com.google.firebase.components.d
    public <T> Set<T> f(b0<T> b0Var) {
        if (this.f15355d.contains(b0Var)) {
            return this.f15358g.f(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("⟎"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> o2.b<Set<T>> g(b0<T> b0Var) {
        if (this.f15356e.contains(b0Var)) {
            return this.f15358g.g(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("⟏"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> T h(b0<T> b0Var) {
        if (this.f15352a.contains(b0Var)) {
            return (T) this.f15358g.h(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("⟐"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> o2.a<T> j(b0<T> b0Var) {
        if (this.f15354c.contains(b0Var)) {
            return this.f15358g.j(b0Var);
        }
        throw new DependencyException(String.format(ProtectedSandApp.s("⟑"), b0Var));
    }

    @Override // com.google.firebase.components.d
    public <T> o2.a<T> k(Class<T> cls) {
        return j(b0.b(cls));
    }
}
