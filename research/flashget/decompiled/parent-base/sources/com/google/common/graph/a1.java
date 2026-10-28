package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.q3;
import com.google.common.graph.m0;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: StandardNetwork.java */
@t
/* loaded from: classes6.dex */
class a1<N, E> extends h<N, E> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f56745a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f56746b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f56747c;

    /* renamed from: d, reason: collision with root package name */
    private final s<N> f56748d;

    /* renamed from: e, reason: collision with root package name */
    private final s<E> f56749e;

    /* renamed from: f, reason: collision with root package name */
    final m0<N, u0<N, E>> f56750f;

    /* renamed from: g, reason: collision with root package name */
    final m0<E, N> f56751g;

    a1(t0<? super N, ? super E> t0Var, Map<N, u0<N, E>> map, Map<E, N> map2) {
        this.f56745a = t0Var.f56807a;
        this.f56746b = t0Var.f56878f;
        this.f56747c = t0Var.f56808b;
        s<? super N> sVar = t0Var.f56809c;
        sVar.getClass();
        this.f56748d = sVar;
        s<? super Object> sVar2 = t0Var.f56879g;
        sVar2.getClass();
        this.f56749e = sVar2;
        this.f56750f = map instanceof TreeMap ? new n0<>(map) : new m0<>(map);
        this.f56751g = new m0<>(map2);
    }

    @Override // com.google.common.graph.s0
    public u<N> F(E e4) {
        N S = S(e4);
        u0<N, E> f4 = this.f56750f.f(S);
        Objects.requireNonNull(f4);
        return u.l(this, S, f4.h(e4));
    }

    @Override // com.google.common.graph.s0
    public s<E> H() {
        return this.f56749e;
    }

    @Override // com.google.common.graph.s0
    public Set<E> K(N n4) {
        return R(n4).i();
    }

    final u0<N, E> R(N n4) {
        u0<N, E> f4 = this.f56750f.f(n4);
        if (f4 != null) {
            return f4;
        }
        n4.getClass();
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\uf5ad"), n4));
    }

    final N S(E e4) {
        N f4 = this.f56751g.f(e4);
        if (f4 != null) {
            return f4;
        }
        e4.getClass();
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\uf5ae"), e4));
    }

    final boolean T(E e4) {
        return this.f56751g.e(e4);
    }

    final boolean U(N n4) {
        return this.f56750f.e(n4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.s0, com.google.common.graph.w0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a((a1<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.s0, com.google.common.graph.c1
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b((a1<N, E>) obj);
    }

    @Override // com.google.common.graph.s0
    public Set<E> c() {
        m0<E, N> m0Var = this.f56751g;
        m0Var.getClass();
        return new m0.a();
    }

    @Override // com.google.common.graph.s0
    public boolean e() {
        return this.f56745a;
    }

    @Override // com.google.common.graph.s0
    public s<N> h() {
        return this.f56748d;
    }

    @Override // com.google.common.graph.s0
    public boolean j() {
        return this.f56747c;
    }

    @Override // com.google.common.graph.s0
    public Set<N> k(N n4) {
        return R(n4).c();
    }

    @Override // com.google.common.graph.s0
    public Set<E> l(N n4) {
        return R(n4).g();
    }

    @Override // com.google.common.graph.s0
    public Set<N> m() {
        m0<N, u0<N, E>> m0Var = this.f56750f;
        m0Var.getClass();
        return new m0.a();
    }

    @Override // com.google.common.graph.s0
    public Set<E> v(N n4) {
        return R(n4).k();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public Set<E> x(N n4, N n5) {
        u0<N, E> R = R(n4);
        if (!this.f56747c && n4 == n5) {
            return q3.I();
        }
        com.google.common.base.l0.u(this.f56750f.e(n5), ProtectedSandApp.s("\uf5ad"), n5);
        return R.l(n5);
    }

    @Override // com.google.common.graph.s0
    public boolean y() {
        return this.f56746b;
    }

    @Override // com.google.common.graph.s0, com.google.common.graph.w0
    public Set<N> a(N n4) {
        return R(n4).b();
    }

    @Override // com.google.common.graph.s0, com.google.common.graph.c1
    public Set<N> b(N n4) {
        return R(n4).a();
    }

    a1(t0<? super N, ? super E> t0Var) {
        this(t0Var, t0Var.f56809c.c(t0Var.f56811e.i(10).intValue()), t0Var.f56879g.c(t0Var.f56880h.i(20).intValue()));
    }
}
