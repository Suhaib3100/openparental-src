package com.google.common.graph;

import java.util.Set;

/* compiled from: Graph.java */
@d9.a
@f9.f("Use GraphBuilder to create a real instance")
@t
/* loaded from: classes6.dex */
public interface z<N> extends k<N> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.w0
    /* bridge */ /* synthetic */ default Iterable a(Object obj) {
        return a((z<N>) obj);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.w0
    Set<N> a(N n4);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.c1
    /* bridge */ /* synthetic */ default Iterable b(Object obj) {
        return b((z<N>) obj);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.c1
    Set<N> b(N n4);

    @Override // com.google.common.graph.k
    Set<u<N>> c();

    @Override // com.google.common.graph.k
    boolean d(N n4, N n5);

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    boolean e();

    boolean equals(@zc.a Object obj);

    @Override // com.google.common.graph.k
    boolean f(u<N> uVar);

    @Override // com.google.common.graph.k
    int g(N n4);

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    s<N> h();

    int hashCode();

    @Override // com.google.common.graph.k
    int i(N n4);

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    boolean j();

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    Set<N> k(N n4);

    @Override // com.google.common.graph.k
    Set<u<N>> l(N n4);

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    Set<N> m();

    @Override // com.google.common.graph.k
    int n(N n4);

    @Override // com.google.common.graph.k
    s<N> p();
}
