package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: ForwardingListIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class z1<E> extends x1<E> implements ListIterator<E> {
    protected z1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.x1
    /* renamed from: A3, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator<E> u3();

    @Override // java.util.ListIterator
    public void add(@f5 E e4) {
        u3().add(e4);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return u3().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return u3().nextIndex();
    }

    @Override // java.util.ListIterator
    @f5
    @f9.a
    public E previous() {
        return u3().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return u3().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@f5 E e4) {
        u3().set(e4);
    }
}
