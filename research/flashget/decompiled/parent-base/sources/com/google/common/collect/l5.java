package com.google.common.collect;

import java.lang.Comparable;
import java.util.Map;

/* compiled from: RangeMap.java */
@w0
@d9.c
@d9.a
@f9.f("Use ImmutableRangeMap or TreeRangeMap")
/* loaded from: classes6.dex */
public interface l5<K extends Comparable, V> {
    void a(j5<K> j5Var);

    j5<K> c();

    void clear();

    l5<K, V> d(j5<K> j5Var);

    Map<j5<K>, V> e();

    boolean equals(@zc.a Object obj);

    @zc.a
    Map.Entry<j5<K>, V> f(K k4);

    Map<j5<K>, V> g();

    @zc.a
    V h(K k4);

    int hashCode();

    void i(l5<K, V> l5Var);

    void j(j5<K> j5Var, V v4);

    void k(j5<K> j5Var, V v4);

    String toString();
}
