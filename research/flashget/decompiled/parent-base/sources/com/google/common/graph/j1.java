package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.graph.k0;
import com.google.common.graph.s;

/* compiled from: ValueGraphBuilder.java */
@d9.a
@t
/* loaded from: classes6.dex */
public final class j1<N, V> extends g<N> {
    private j1(boolean z4) {
        super(z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, V1 extends V> j1<N1, V1> c() {
        return this;
    }

    public static j1<Object, Object> e() {
        return new j1<>(true);
    }

    public static <N, V> j1<N, V> g(i1<N, V> i1Var) {
        j1 j1Var = new j1(i1Var.e());
        j1Var.f56808b = i1Var.j();
        s<N> h4 = i1Var.h();
        h4.getClass();
        j1Var.f56809c = h4;
        return j1Var.i(i1Var.p());
    }

    public static j1<Object, Object> k() {
        return new j1<>(false);
    }

    public j1<N, V> a(boolean z4) {
        this.f56808b = z4;
        return this;
    }

    public <N1 extends N, V1 extends V> r0<N1, V1> b() {
        return new z0(this);
    }

    j1<N, V> d() {
        j1<N, V> j1Var = new j1<>(this.f56807a);
        j1Var.f56808b = this.f56808b;
        j1Var.f56809c = this.f56809c;
        j1Var.f56811e = this.f56811e;
        j1Var.f56810d = this.f56810d;
        return j1Var;
    }

    public j1<N, V> f(int i4) {
        this.f56811e = com.google.common.base.g0.f(Integer.valueOf(d0.b(i4)));
        return this;
    }

    public <N1 extends N, V1 extends V> k0.a<N1, V1> h() {
        return new k0.a<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <N1 extends N> j1<N1, V> i(s<N1> sVar) {
        com.google.common.base.l0.u(sVar.h() == s.b.UNORDERED || sVar.h() == s.b.STABLE, ProtectedSandApp.s("\uf5ce"), sVar);
        this.f56810d = sVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <N1 extends N> j1<N1, V> j(s<N1> sVar) {
        sVar.getClass();
        this.f56809c = sVar;
        return this;
    }
}
