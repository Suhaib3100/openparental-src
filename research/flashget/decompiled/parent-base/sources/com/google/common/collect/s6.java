package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: Table.java */
@w0
@d9.b
@f9.f("Use ImmutableTable, HashBasedTable, or another implementation")
/* loaded from: classes6.dex */
public interface s6<R, C, V> {

    /* compiled from: Table.java */
    public interface a<R, C, V> {
        @f5
        R a();

        @f5
        C b();

        boolean equals(@zc.a Object obj);

        @f5
        V getValue();

        int hashCode();
    }

    boolean A2(@f9.c("R") @zc.a Object obj);

    Set<a<R, C, V>> B1();

    @zc.a
    @f9.a
    V D1(@f5 R r4, @f5 C c5, @f5 V v4);

    boolean I2(@f9.c("R") @zc.a Object obj, @f9.c("C") @zc.a Object obj2);

    @zc.a
    V L(@f9.c("R") @zc.a Object obj, @f9.c("C") @zc.a Object obj2);

    boolean S(@f9.c("C") @zc.a Object obj);

    void clear();

    boolean containsValue(@f9.c("V") @zc.a Object obj);

    void e1(s6<? extends R, ? extends C, ? extends V> s6Var);

    boolean equals(@zc.a Object obj);

    int hashCode();

    Set<R> i();

    Map<C, V> i3(@f5 R r4);

    boolean isEmpty();

    Map<C, Map<R, V>> j1();

    Map<R, Map<C, V>> m();

    Map<R, V> n1(@f5 C c5);

    Set<C> q2();

    @zc.a
    @f9.a
    V remove(@f9.c("R") @zc.a Object obj, @f9.c("C") @zc.a Object obj2);

    int size();

    Collection<V> values();
}
