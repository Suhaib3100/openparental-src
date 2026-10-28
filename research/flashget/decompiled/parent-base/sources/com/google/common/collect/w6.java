package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: TransformedListIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class w6<F, T> extends v6<F, T> implements ListIterator<T> {
    w6(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> b() {
        return (ListIterator) this.f56612b;
    }

    @Override // java.util.ListIterator
    public void add(@f5 T t4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f56612b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f56612b).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    @f5
    public final T previous() {
        return (T) a(((ListIterator) this.f56612b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f56612b).previousIndex();
    }

    public void set(@f5 T t4) {
        throw new UnsupportedOperationException();
    }
}
