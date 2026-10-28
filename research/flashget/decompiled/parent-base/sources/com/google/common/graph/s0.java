package com.google.common.graph;

import java.util.Set;

/* compiled from: Network.java */
@d9.a
@f9.f("Use NetworkBuilder to create a real instance")
@t
/* loaded from: classes6.dex */
public interface s0<N, E> extends c1<N>, w0<N> {
    Set<E> D(u<N> uVar);

    @zc.a
    E E(N n4, N n5);

    u<N> F(E e4);

    s<E> H();

    @zc.a
    E I(u<N> uVar);

    Set<E> K(N n4);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable a(Object obj) {
        return a((s0<N, E>) obj);
    }

    Set<N> a(N n4);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.c1
    /* bridge */ /* synthetic */ default Iterable b(Object obj) {
        return b((s0<N, E>) obj);
    }

    @Override // com.google.common.graph.c1
    Set<N> b(N n4);

    Set<E> c();

    boolean d(N n4, N n5);

    boolean e();

    boolean equals(@zc.a Object obj);

    boolean f(u<N> uVar);

    int g(N n4);

    s<N> h();

    int hashCode();

    int i(N n4);

    boolean j();

    Set<N> k(N n4);

    Set<E> l(N n4);

    Set<N> m();

    int n(N n4);

    z<N> t();

    Set<E> v(N n4);

    Set<E> w(E e4);

    Set<E> x(N n4, N n5);

    boolean y();
}
