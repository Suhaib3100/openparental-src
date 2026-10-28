package com.google.common.graph;

import com.google.common.graph.c0;

/* compiled from: StandardMutableGraph.java */
@t
/* loaded from: classes6.dex */
final class x0<N> extends w<N> implements p0<N> {

    /* renamed from: a, reason: collision with root package name */
    private final r0<N, c0.a> f56888a;

    x0(g<? super N> gVar) {
        this.f56888a = new z0(gVar);
    }

    @Override // com.google.common.graph.p0
    public boolean B(u<N> uVar) {
        P(uVar);
        return G(uVar.h(), uVar.i());
    }

    @Override // com.google.common.graph.p0
    public boolean G(N n4, N n5) {
        return this.f56888a.L(n4, n5, c0.a.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.w
    k<N> Q() {
        return this.f56888a;
    }

    @Override // com.google.common.graph.p0
    public boolean o(N n4) {
        return this.f56888a.o(n4);
    }

    @Override // com.google.common.graph.p0
    public boolean q(N n4) {
        return this.f56888a.q(n4);
    }

    @Override // com.google.common.graph.p0
    public boolean r(N n4, N n5) {
        return this.f56888a.r(n4, n5) != null;
    }

    @Override // com.google.common.graph.p0
    public boolean s(u<N> uVar) {
        P(uVar);
        return r(uVar.h(), uVar.i());
    }
}
