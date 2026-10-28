package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: AbstractIndexedListIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class b<E> extends f7<E> {

    /* renamed from: b, reason: collision with root package name */
    private final int f55372b;

    /* renamed from: c, reason: collision with root package name */
    private int f55373c;

    protected b(int i4, int i5) {
        com.google.common.base.l0.d0(i5, i4);
        this.f55372b = i4;
        this.f55373c = i5;
    }

    @f5
    protected abstract E a(int i4);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f55373c < this.f55372b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f55373c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @f5
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f55373c;
        this.f55373c = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f55373c;
    }

    @Override // java.util.ListIterator
    @f5
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f55373c - 1;
        this.f55373c = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f55373c - 1;
    }

    protected b(int i4) {
        this(i4, 0);
    }
}
