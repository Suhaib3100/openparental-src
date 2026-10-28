package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.e7;
import com.google.common.collect.f3;
import java.util.Objects;

/* compiled from: StandardMutableNetwork.java */
@t
/* loaded from: classes6.dex */
final class y0<N, E> extends a1<N, E> implements q0<N, E> {
    y0(t0<? super N, ? super E> t0Var) {
        super(t0Var);
    }

    @f9.a
    private u0<N, E> V(N n4) {
        u0<N, E> W = W();
        com.google.common.base.l0.g0(this.f56750f.i(n4, W) == null);
        return W;
    }

    private u0<N, E> W() {
        return e() ? y() ? p.p() : q.n() : y() ? g1.p() : h1.m();
    }

    @Override // com.google.common.graph.q0
    @f9.a
    public boolean A(u<N> uVar, E e4) {
        Q(uVar);
        return M(uVar.h(), uVar.i(), e4);
    }

    @Override // com.google.common.graph.q0
    @f9.a
    public boolean J(E e4) {
        com.google.common.base.l0.F(e4, ProtectedSandApp.s("\uf5df"));
        N f4 = this.f56751g.f(e4);
        boolean z4 = false;
        if (f4 == null) {
            return false;
        }
        u0<N, E> f5 = this.f56750f.f(f4);
        Objects.requireNonNull(f5);
        u0<N, E> u0Var = f5;
        N h4 = u0Var.h(e4);
        u0<N, E> f6 = this.f56750f.f(h4);
        Objects.requireNonNull(f6);
        u0<N, E> u0Var2 = f6;
        u0Var.j(e4);
        if (j() && f4.equals(h4)) {
            z4 = true;
        }
        u0Var2.d(e4, z4);
        this.f56751g.j(e4);
        return true;
    }

    @Override // com.google.common.graph.q0
    @f9.a
    public boolean M(N n4, N n5, E e4) {
        com.google.common.base.l0.F(n4, ProtectedSandApp.s("\uf5e0"));
        com.google.common.base.l0.F(n5, ProtectedSandApp.s("\uf5e1"));
        com.google.common.base.l0.F(e4, ProtectedSandApp.s("\uf5df"));
        if (this.f56751g.e(e4)) {
            u<N> F = F(e4);
            u l4 = u.l(this, n4, n5);
            com.google.common.base.l0.z(F.equals(l4), ProtectedSandApp.s("\uf5e2"), e4, F, l4);
            return false;
        }
        u0<N, E> f4 = this.f56750f.f(n4);
        if (!y()) {
            com.google.common.base.l0.y(f4 == null || !f4.a().contains(n5), ProtectedSandApp.s("\uf5e3"), n4, n5);
        }
        boolean equals = n4.equals(n5);
        if (!j()) {
            com.google.common.base.l0.u(!equals, ProtectedSandApp.s("\uf5e4"), n4);
        }
        if (f4 == null) {
            f4 = V(n4);
        }
        f4.e(e4, n5);
        u0<N, E> f5 = this.f56750f.f(n5);
        if (f5 == null) {
            f5 = V(n5);
        }
        f5.f(e4, n4, equals);
        this.f56751g.i(e4, n4);
        return true;
    }

    @Override // com.google.common.graph.q0
    @f9.a
    public boolean o(N n4) {
        com.google.common.base.l0.F(n4, ProtectedSandApp.s("\uf5e5"));
        u0<N, E> f4 = this.f56750f.f(n4);
        if (f4 == null) {
            return false;
        }
        e7<E> it = f3.x(f4.g()).iterator();
        while (it.hasNext()) {
            J(it.next());
        }
        this.f56750f.j(n4);
        return true;
    }

    @Override // com.google.common.graph.q0
    @f9.a
    public boolean q(N n4) {
        com.google.common.base.l0.F(n4, ProtectedSandApp.s("\uf5e5"));
        if (this.f56750f.e(n4)) {
            return false;
        }
        V(n4);
        return true;
    }
}
