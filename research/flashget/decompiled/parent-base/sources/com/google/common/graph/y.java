package com.google.common.graph;

import java.util.Set;

/* compiled from: ForwardingValueGraph.java */
@t
/* loaded from: classes6.dex */
abstract class y<N, V> extends j<N, V> {
    y() {
    }

    @Override // com.google.common.graph.a
    protected long N() {
        return R().c().size();
    }

    abstract i1<N, V> R();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.w0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a((y<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.c1
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b((y<N, V>) obj);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public boolean d(N n4, N n5) {
        return R().d(n4, n5);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public boolean e() {
        return R().e();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public boolean f(u<N> uVar) {
        return R().f(uVar);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public int g(N n4) {
        return R().g(n4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public s<N> h() {
        return R().h();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public int i(N n4) {
        return R().i(n4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public boolean j() {
        return R().j();
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public Set<N> k(N n4) {
        return R().k(n4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public Set<N> m() {
        return R().m();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public int n(N n4) {
        return R().n(n4);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public s<N> p() {
        return R().p();
    }

    @zc.a
    public V u(u<N> uVar, @zc.a V v4) {
        return R().u(uVar, v4);
    }

    @zc.a
    public V z(N n4, N n5, @zc.a V v4) {
        return R().z(n4, n5, v4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.w0
    public Set<N> a(N n4) {
        return R().a((i1<N, V>) n4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.c1
    public Set<N> b(N n4) {
        return R().b((i1<N, V>) n4);
    }
}
