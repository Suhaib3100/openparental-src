package com.google.common.collect;

import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AbstractMultiset.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class i<E> extends AbstractCollection<E> implements u4<E> {

    /* renamed from: b, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Set<E> f55813b;

    /* renamed from: c, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Set<u4.a<E>> f55814c;

    /* compiled from: AbstractMultiset.java */
    class a extends v4.h<E> {
        a() {
        }

        @Override // com.google.common.collect.v4.h
        u4<E> i() {
            return i.this;
        }

        @Override // com.google.common.collect.v4.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return i.this.h();
        }
    }

    /* compiled from: AbstractMultiset.java */
    class b extends v4.i<E> {
        b() {
        }

        @Override // com.google.common.collect.v4.i
        u4<E> i() {
            return i.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<u4.a<E>> iterator() {
            return i.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.f();
        }
    }

    i() {
    }

    @f9.a
    public int W1(@zc.a Object obj, int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    @f9.a
    public final boolean add(@f5 E e4) {
        d2(e4, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @f9.a
    public final boolean addAll(Collection<? extends E> collection) {
        return v4.c(this, collection);
    }

    Set<E> b() {
        return new a();
    }

    Set<u4.a<E>> c() {
        return new b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public boolean contains(@zc.a Object obj) {
        return W2(obj) > 0;
    }

    public Set<E> d() {
        Set<E> set = this.f55813b;
        if (set != null) {
            return set;
        }
        Set<E> b5 = b();
        this.f55813b = b5;
        return b5;
    }

    @f9.a
    public int d2(@f5 E e4, int i4) {
        throw new UnsupportedOperationException();
    }

    public Set<u4.a<E>> entrySet() {
        Set<u4.a<E>> set = this.f55814c;
        if (set != null) {
            return set;
        }
        Set<u4.a<E>> c5 = c();
        this.f55814c = c5;
        return c5;
    }

    @Override // java.util.Collection, com.google.common.collect.u4
    public final boolean equals(@zc.a Object obj) {
        return v4.i(this, obj);
    }

    abstract int f();

    abstract Iterator<E> h();

    @Override // java.util.Collection, com.google.common.collect.u4
    public final int hashCode() {
        return entrySet().hashCode();
    }

    abstract Iterator<u4.a<E>> i();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @f9.a
    public int o0(@f5 E e4, int i4) {
        return v4.v(this, e4, i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    @f9.a
    public final boolean remove(@zc.a Object obj) {
        return W1(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    @f9.a
    public final boolean removeAll(Collection<?> collection) {
        return v4.p(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    @f9.a
    public final boolean retainAll(Collection<?> collection) {
        return v4.s(this, collection);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.u4
    public final String toString() {
        return entrySet().toString();
    }

    @f9.a
    public boolean x2(@f5 E e4, int i4, int i5) {
        return v4.w(this, e4, i4, i5);
    }
}
