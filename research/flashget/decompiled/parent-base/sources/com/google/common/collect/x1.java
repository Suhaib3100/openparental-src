package com.google.common.collect;

import java.util.Iterator;

/* compiled from: ForwardingIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class x1<T> extends h2 implements Iterator<T> {
    protected x1() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return u3().hasNext();
    }

    @f5
    @f9.a
    public T next() {
        return u3().next();
    }

    public void remove() {
        u3().remove();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h2
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> u3();
}
