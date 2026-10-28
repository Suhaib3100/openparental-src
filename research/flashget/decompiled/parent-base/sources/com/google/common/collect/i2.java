package com.google.common.collect;

import java.util.NoSuchElementException;
import java.util.Queue;

/* compiled from: ForwardingQueue.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class i2<E> extends q1<E> implements Queue<E> {
    protected i2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.q1
    /* renamed from: T3, reason: merged with bridge method [inline-methods] */
    public abstract Queue<E> u3();

    protected boolean U3(@f5 E e4) {
        try {
            return add(e4);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @zc.a
    protected E V3() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @zc.a
    protected E W3() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @Override // java.util.Queue
    @f5
    public E element() {
        return u3().element();
    }

    @f9.a
    public boolean offer(@f5 E e4) {
        return u3().offer(e4);
    }

    @Override // java.util.Queue
    @zc.a
    public E peek() {
        return u3().peek();
    }

    @Override // java.util.Queue
    @zc.a
    @f9.a
    public E poll() {
        return u3().poll();
    }

    @Override // java.util.Queue
    @f5
    @f9.a
    public E remove() {
        return u3().remove();
    }
}
