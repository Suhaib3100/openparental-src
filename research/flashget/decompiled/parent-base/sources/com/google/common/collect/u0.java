package com.google.common.collect;

import com.google.common.collect.m6;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: DescendingMultiset.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class u0<E> extends e2<E> implements k6<E> {

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private transient Comparator<? super E> f56537b;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private transient NavigableSet<E> f56538c;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private transient Set<u4.a<E>> f56539d;

    /* compiled from: DescendingMultiset.java */
    class a extends v4.i<E> {
        a() {
        }

        @Override // com.google.common.collect.v4.i
        u4<E> i() {
            return u0.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<u4.a<E>> iterator() {
            return u0.this.d4();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u0.this.e4().entrySet().size();
        }
    }

    u0() {
    }

    @Override // com.google.common.collect.k6
    public k6<E> M1(@f5 E e4, x xVar, @f5 E e5, x xVar2) {
        return e4().M1(e5, xVar2, e4, xVar).m2();
    }

    @Override // com.google.common.collect.k6
    public k6<E> N2(@f5 E e4, x xVar) {
        return e4().d3(e4, xVar).m2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.e2, com.google.common.collect.q1
    /* renamed from: T3 */
    public u4<E> u3() {
        return e4();
    }

    Set<u4.a<E>> c4() {
        return new a();
    }

    @Override // com.google.common.collect.k6, com.google.common.collect.g6
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f56537b;
        if (comparator != null) {
            return comparator;
        }
        e5 v02 = e5.u(e4().comparator()).v0();
        this.f56537b = v02;
        return v02;
    }

    @Override // com.google.common.collect.k6
    public k6<E> d3(@f5 E e4, x xVar) {
        return e4().N2(e4, xVar).m2();
    }

    abstract Iterator<u4.a<E>> d4();

    abstract k6<E> e4();

    @Override // com.google.common.collect.e2, com.google.common.collect.u4, com.google.common.collect.k6
    public Set<u4.a<E>> entrySet() {
        Set<u4.a<E>> set = this.f56539d;
        if (set != null) {
            return set;
        }
        Set<u4.a<E>> c42 = c4();
        this.f56539d = c42;
        return c42;
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> firstEntry() {
        return e4().lastEntry();
    }

    @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return v4.n(this);
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> lastEntry() {
        return e4().firstEntry();
    }

    @Override // com.google.common.collect.k6
    public k6<E> m2() {
        return e4();
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> pollFirstEntry() {
        return e4().pollLastEntry();
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> pollLastEntry() {
        return e4().pollFirstEntry();
    }

    @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return Q3();
    }

    @Override // com.google.common.collect.h2
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) R3(tArr);
    }

    @Override // com.google.common.collect.e2, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public NavigableSet<E> d() {
        NavigableSet<E> navigableSet = this.f56538c;
        if (navigableSet != null) {
            return navigableSet;
        }
        m6.b bVar = new m6.b(this);
        this.f56538c = bVar;
        return bVar;
    }
}
