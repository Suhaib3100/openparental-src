package com.annimon.stream.iterator;

import java.util.Iterator;

/* compiled from: IndexedIterator.java */
/* loaded from: classes3.dex */
public class a<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41511b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41512c;

    /* renamed from: d, reason: collision with root package name */
    private int f41513d;

    public a(Iterator<? extends T> it) {
        this(0, 1, it);
    }

    public int a() {
        return this.f41513d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41511b.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.f41511b.next();
        this.f41513d += this.f41512c;
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f41511b.remove();
    }

    public a(int i4, int i5, Iterator<? extends T> it) {
        this.f41511b = it;
        this.f41512c = i5;
        this.f41513d = i4;
    }
}
