package com.google.common.collect;

import com.google.common.collect.u4;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: SortedMultiset.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public interface k6<E> extends l6<E>, g6<E> {
    k6<E> M1(@f5 E e4, x xVar, @f5 E e5, x xVar2);

    k6<E> N2(@f5 E e4, x xVar);

    Comparator<? super E> comparator();

    @Override // com.google.common.collect.l6, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    NavigableSet<E> d();

    k6<E> d3(@f5 E e4, x xVar);

    Set<u4.a<E>> entrySet();

    @zc.a
    u4.a<E> firstEntry();

    Iterator<E> iterator();

    @zc.a
    u4.a<E> lastEntry();

    k6<E> m2();

    @zc.a
    u4.a<E> pollFirstEntry();

    @zc.a
    u4.a<E> pollLastEntry();
}
