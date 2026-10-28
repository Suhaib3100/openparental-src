package com.google.common.collect;

import java.util.Iterator;

/* compiled from: TransformedIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class v6<F, T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    final Iterator<? extends F> f56612b;

    v6(Iterator<? extends F> it) {
        it.getClass();
        this.f56612b = it;
    }

    @f5
    abstract T a(@f5 F f4);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56612b.hasNext();
    }

    @Override // java.util.Iterator
    @f5
    public final T next() {
        return a(this.f56612b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f56612b.remove();
    }
}
