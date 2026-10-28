package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: StandardMutableValueGraph.java */
@t
/* loaded from: classes6.dex */
final class z0<N, V> extends b1<N, V> implements r0<N, V> {

    /* renamed from: f, reason: collision with root package name */
    private final s<N> f56889f;

    z0(g<? super N> gVar) {
        super(gVar);
        s<? super N> sVar = gVar.f56810d;
        sVar.getClass();
        this.f56889f = sVar;
    }

    @f9.a
    private b0<N, V> V(N n4) {
        b0<N, V> W = W();
        com.google.common.base.l0.g0(this.f56756d.i(n4, W) == null);
        return W;
    }

    private b0<N, V> W() {
        return e() ? o.x(this.f56889f) : f1.l(this.f56889f);
    }

    @Override // com.google.common.graph.r0
    @zc.a
    @f9.a
    public V C(u<N> uVar, V v4) {
        P(uVar);
        return L(uVar.h(), uVar.i(), v4);
    }

    @Override // com.google.common.graph.r0
    @zc.a
    @f9.a
    public V L(N n4, N n5, V v4) {
        com.google.common.base.l0.F(n4, ProtectedSandApp.s("\uf5e6"));
        com.google.common.base.l0.F(n5, ProtectedSandApp.s("\uf5e7"));
        com.google.common.base.l0.F(v4, ProtectedSandApp.s("\uf5e8"));
        if (!j()) {
            com.google.common.base.l0.u(!n4.equals(n5), ProtectedSandApp.s("\uf5e9"), n4);
        }
        b0<N, V> f4 = this.f56756d.f(n4);
        if (f4 == null) {
            f4 = V(n4);
        }
        V h4 = f4.h(n5, v4);
        b0<N, V> f5 = this.f56756d.f(n5);
        if (f5 == null) {
            f5 = V(n5);
        }
        f5.i(n4, v4);
        if (h4 == null) {
            long j4 = this.f56757e + 1;
            this.f56757e = j4;
            d0.e(j4);
        }
        return h4;
    }

    @Override // com.google.common.graph.r0
    @f9.a
    public boolean o(N n4) {
        com.google.common.base.l0.F(n4, ProtectedSandApp.s("\uf5ea"));
        b0<N, V> f4 = this.f56756d.f(n4);
        if (f4 == null) {
            return false;
        }
        if (j() && f4.e(n4) != null) {
            f4.f(n4);
            this.f56757e--;
        }
        Iterator<N> it = f4.a().iterator();
        while (it.hasNext()) {
            b0<N, V> h4 = this.f56756d.h(it.next());
            Objects.requireNonNull(h4);
            h4.f(n4);
            this.f56757e--;
        }
        if (e()) {
            Iterator<N> it2 = f4.b().iterator();
            while (it2.hasNext()) {
                b0<N, V> h5 = this.f56756d.h(it2.next());
                Objects.requireNonNull(h5);
                com.google.common.base.l0.g0(h5.e(n4) != null);
                this.f56757e--;
            }
        }
        this.f56756d.j(n4);
        d0.c(this.f56757e);
        return true;
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public s<N> p() {
        return this.f56889f;
    }

    @Override // com.google.common.graph.r0
    @f9.a
    public boolean q(N n4) {
        com.google.common.base.l0.F(n4, ProtectedSandApp.s("\uf5ea"));
        if (this.f56756d.e(n4)) {
            return false;
        }
        V(n4);
        return true;
    }

    @Override // com.google.common.graph.r0
    @zc.a
    @f9.a
    public V r(N n4, N n5) {
        com.google.common.base.l0.F(n4, ProtectedSandApp.s("\uf5e6"));
        com.google.common.base.l0.F(n5, ProtectedSandApp.s("\uf5e7"));
        b0<N, V> f4 = this.f56756d.f(n4);
        b0<N, V> f5 = this.f56756d.f(n5);
        if (f4 == null || f5 == null) {
            return null;
        }
        V e4 = f4.e(n5);
        if (e4 != null) {
            f5.f(n4);
            long j4 = this.f56757e - 1;
            this.f56757e = j4;
            d0.c(j4);
        }
        return e4;
    }

    @Override // com.google.common.graph.r0
    @zc.a
    @f9.a
    public V s(u<N> uVar) {
        P(uVar);
        return r(uVar.h(), uVar.i());
    }
}
