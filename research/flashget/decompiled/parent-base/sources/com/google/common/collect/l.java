package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: AbstractSequentialIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class l<T> extends e7<T> {

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private T f55889b;

    protected l(@zc.a T t4) {
        this.f55889b = t4;
    }

    @zc.a
    protected abstract T a(T t4);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f55889b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t4 = this.f55889b;
        if (t4 == null) {
            throw new NoSuchElementException();
        }
        this.f55889b = a(t4);
        return t4;
    }
}
