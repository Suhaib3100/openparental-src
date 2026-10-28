package com.google.common.collect;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class e7<E> implements Iterator<E> {
    protected e7() {
    }

    @Override // java.util.Iterator
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
