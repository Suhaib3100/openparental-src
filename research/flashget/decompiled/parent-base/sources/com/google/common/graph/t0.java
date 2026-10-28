package com.google.common.graph;

import com.google.common.graph.i0;

/* compiled from: NetworkBuilder.java */
@d9.a
@t
/* loaded from: classes6.dex */
public final class t0<N, E> extends g<N> {

    /* renamed from: f, reason: collision with root package name */
    boolean f56878f;

    /* renamed from: g, reason: collision with root package name */
    s<? super E> f56879g;

    /* renamed from: h, reason: collision with root package name */
    com.google.common.base.g0<Integer> f56880h;

    private t0(boolean z4) {
        super(z4);
        this.f56878f = false;
        this.f56879g = s.d();
        this.f56880h = com.google.common.base.g0.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, E1 extends E> t0<N1, E1> d() {
        return this;
    }

    public static t0<Object, Object> e() {
        return new t0<>(true);
    }

    public static <N, E> t0<N, E> i(s0<N, E> s0Var) {
        t0<N, E> t0Var = new t0<>(s0Var.e());
        t0Var.f56878f = s0Var.y();
        t0Var.f56808b = s0Var.j();
        s<N> h4 = s0Var.h();
        h4.getClass();
        t0Var.f56809c = h4;
        s<E> H = s0Var.H();
        H.getClass();
        t0Var.f56879g = H;
        return t0Var;
    }

    public static t0<Object, Object> l() {
        return new t0<>(false);
    }

    public t0<N, E> a(boolean z4) {
        this.f56878f = z4;
        return this;
    }

    public t0<N, E> b(boolean z4) {
        this.f56808b = z4;
        return this;
    }

    public <N1 extends N, E1 extends E> q0<N1, E1> c() {
        return new y0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E1 extends E> t0<N, E1> f(s<E1> sVar) {
        sVar.getClass();
        this.f56879g = sVar;
        return this;
    }

    public t0<N, E> g(int i4) {
        this.f56880h = com.google.common.base.g0.f(Integer.valueOf(d0.b(i4)));
        return this;
    }

    public t0<N, E> h(int i4) {
        this.f56811e = com.google.common.base.g0.f(Integer.valueOf(d0.b(i4)));
        return this;
    }

    public <N1 extends N, E1 extends E> i0.a<N1, E1> j() {
        return new i0.a<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <N1 extends N> t0<N1, E> k(s<N1> sVar) {
        sVar.getClass();
        this.f56809c = sVar;
        return this;
    }
}
