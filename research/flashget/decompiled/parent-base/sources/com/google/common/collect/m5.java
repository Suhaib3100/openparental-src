package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;

/* compiled from: RangeSet.java */
@w0
@d9.c
@d9.a
@f9.f("Use ImmutableRangeSet or TreeRangeSet")
/* loaded from: classes6.dex */
public interface m5<C extends Comparable> {
    void a(j5<C> j5Var);

    boolean b(C c5);

    j5<C> c();

    void clear();

    void d(j5<C> j5Var);

    m5<C> e();

    boolean equals(@zc.a Object obj);

    boolean f(j5<C> j5Var);

    void g(Iterable<j5<C>> iterable);

    void h(m5<C> m5Var);

    int hashCode();

    void i(Iterable<j5<C>> iterable);

    boolean isEmpty();

    boolean j(m5<C> m5Var);

    @zc.a
    j5<C> k(C c5);

    boolean l(j5<C> j5Var);

    boolean m(Iterable<j5<C>> iterable);

    m5<C> n(j5<C> j5Var);

    Set<j5<C>> o();

    Set<j5<C>> p();

    void q(m5<C> m5Var);

    String toString();
}
