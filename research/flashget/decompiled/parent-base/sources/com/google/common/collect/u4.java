package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Multiset.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public interface u4<E> extends Collection<E> {

    /* compiled from: Multiset.java */
    public interface a<E> {
        boolean equals(@zc.a Object obj);

        int getCount();

        @f5
        E getElement();

        int hashCode();

        String toString();
    }

    @f9.a
    int W1(@f9.c("E") @zc.a Object obj, int i4);

    int W2(@f9.c("E") @zc.a Object obj);

    @f9.a
    boolean add(@f5 E e4);

    boolean contains(@zc.a Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    Set<E> d();

    @f9.a
    int d2(@f5 E e4, int i4);

    Set<a<E>> entrySet();

    boolean equals(@zc.a Object obj);

    int hashCode();

    Iterator<E> iterator();

    @f9.a
    int o0(@f5 E e4, int i4);

    @f9.a
    boolean remove(@zc.a Object obj);

    @f9.a
    boolean removeAll(Collection<?> collection);

    @f9.a
    boolean retainAll(Collection<?> collection);

    int size();

    String toString();

    @f9.a
    boolean x2(@f5 E e4, int i4, int i5);
}
