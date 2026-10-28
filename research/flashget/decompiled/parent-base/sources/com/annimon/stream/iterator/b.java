package com.annimon.stream.iterator;

import java.util.Iterator;

/* compiled from: LazyIterator.java */
/* loaded from: classes3.dex */
public class b<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterable<? extends T> f41514b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator<? extends T> f41515c;

    public b(Iterable<? extends T> iterable) {
        this.f41514b = iterable;
    }

    private void a() {
        if (this.f41515c != null) {
            return;
        }
        this.f41515c = this.f41514b.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a();
        return this.f41515c.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        a();
        return this.f41515c.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        a();
        this.f41515c.remove();
    }
}
