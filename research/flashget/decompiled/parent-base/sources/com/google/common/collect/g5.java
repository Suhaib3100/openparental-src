package com.google.common.collect;

import java.util.Iterator;

/* compiled from: PeekingIterator.java */
@w0
@f9.f("Use Iterators.peekingIterator")
@d9.b
/* loaded from: classes6.dex */
public interface g5<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @f5
    @f9.a
    E next();

    @f5
    E peek();

    @Override // java.util.Iterator
    void remove();
}
