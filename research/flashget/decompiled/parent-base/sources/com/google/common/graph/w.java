package com.google.common.graph;

import java.util.Set;

/* compiled from: ForwardingGraph.java */
@t
/* loaded from: classes6.dex */
abstract class w<N> extends f<N> {
    w() {
    }

    @Override // com.google.common.graph.a
    protected long N() {
        return Q().c().size();
    }

    abstract k<N> Q();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.w0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a((w<N>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.c1
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b((w<N>) obj);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public boolean d(N n4, N n5) {
        return Q().d(n4, n5);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public boolean e() {
        return Q().e();
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public boolean f(u<N> uVar) {
        return Q().f(uVar);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public int g(N n4) {
        return Q().g(n4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public s<N> h() {
        return Q().h();
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public int i(N n4) {
        return Q().i(n4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public boolean j() {
        return Q().j();
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public Set<N> k(N n4) {
        return Q().k(n4);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public Set<u<N>> l(N n4) {
        return Q().l(n4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public Set<N> m() {
        return Q().m();
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public int n(N n4) {
        return Q().n(n4);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public s<N> p() {
        return Q().p();
    }

    @Override // com.google.common.graph.k, com.google.common.graph.w0
    public Set<N> a(N n4) {
        return Q().a((k<N>) n4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.c1
    public Set<N> b(N n4) {
        return Q().b((k<N>) n4);
    }
}
