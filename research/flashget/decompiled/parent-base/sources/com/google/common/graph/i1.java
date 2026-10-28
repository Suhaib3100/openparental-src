package com.google.common.graph;

import java.util.Set;

/* compiled from: ValueGraph.java */
@d9.a
@t
/* loaded from: classes6.dex */
public interface i1<N, V> extends k<N> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.w0
    /* bridge */ /* synthetic */ default Iterable a(Object obj) {
        return a((i1<N, V>) obj);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.w0
    Set<N> a(N n4);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.c1
    /* bridge */ /* synthetic */ default Iterable b(Object obj) {
        return b((i1<N, V>) obj);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.c1
    Set<N> b(N n4);

    @Override // com.google.common.graph.k
    Set<u<N>> c();

    @Override // com.google.common.graph.k
    boolean d(N n4, N n5);

    boolean e();

    boolean equals(@zc.a Object obj);

    @Override // com.google.common.graph.k
    boolean f(u<N> uVar);

    @Override // com.google.common.graph.k
    int g(N n4);

    s<N> h();

    int hashCode();

    @Override // com.google.common.graph.k
    int i(N n4);

    boolean j();

    Set<N> k(N n4);

    @Override // com.google.common.graph.k
    Set<u<N>> l(N n4);

    Set<N> m();

    @Override // com.google.common.graph.k
    int n(N n4);

    @Override // com.google.common.graph.k
    s<N> p();

    z<N> t();

    @zc.a
    V u(u<N> uVar, @zc.a V v4);

    @zc.a
    V z(N n4, N n5, @zc.a V v4);
}
