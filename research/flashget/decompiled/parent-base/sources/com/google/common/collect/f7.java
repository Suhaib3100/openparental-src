package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: UnmodifiableListIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class f7<E> extends e7<E> implements ListIterator<E> {
    protected f7() {
    }

    @Override // java.util.ListIterator
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(@f5 E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(@f5 E e4) {
        throw new UnsupportedOperationException();
    }
}
