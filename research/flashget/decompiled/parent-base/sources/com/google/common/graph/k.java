package com.google.common.graph;

import java.util.Set;

/* compiled from: BaseGraph.java */
@t
/* loaded from: classes6.dex */
interface k<N> extends c1<N>, w0<N> {
    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable a(Object obj) {
        return a((k<N>) obj);
    }

    Set<N> a(N n4);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.c1
    /* bridge */ /* synthetic */ default Iterable b(Object obj) {
        return b((k<N>) obj);
    }

    @Override // com.google.common.graph.c1
    Set<N> b(N n4);

    Set<u<N>> c();

    boolean d(N n4, N n5);

    boolean e();

    boolean f(u<N> uVar);

    int g(N n4);

    s<N> h();

    int i(N n4);

    boolean j();

    Set<N> k(N n4);

    Set<u<N>> l(N n4);

    Set<N> m();

    int n(N n4);

    s<N> p();
}
