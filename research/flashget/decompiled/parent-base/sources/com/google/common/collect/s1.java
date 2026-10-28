package com.google.common.collect;

import java.util.Deque;
import java.util.Iterator;

/* compiled from: ForwardingDeque.java */
@w0
@d9.c
/* loaded from: classes6.dex */
public abstract class s1<E> extends i2<E> implements Deque<E> {
    protected s1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.i2, com.google.common.collect.q1
    /* renamed from: X3, reason: merged with bridge method [inline-methods] */
    public abstract Deque<E> u3();

    @Override // java.util.Deque
    public void addFirst(@f5 E e4) {
        u3().addFirst(e4);
    }

    @Override // java.util.Deque
    public void addLast(@f5 E e4) {
        u3().addLast(e4);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return u3().descendingIterator();
    }

    @Override // java.util.Deque
    @f5
    public E getFirst() {
        return u3().getFirst();
    }

    @Override // java.util.Deque
    @f5
    public E getLast() {
        return u3().getLast();
    }

    @Override // java.util.Deque
    @f9.a
    public boolean offerFirst(@f5 E e4) {
        return u3().offerFirst(e4);
    }

    @Override // java.util.Deque
    @f9.a
    public boolean offerLast(@f5 E e4) {
        return u3().offerLast(e4);
    }

    @Override // java.util.Deque
    @zc.a
    public E peekFirst() {
        return u3().peekFirst();
    }

    @Override // java.util.Deque
    @zc.a
    public E peekLast() {
        return u3().peekLast();
    }

    @Override // java.util.Deque
    @zc.a
    @f9.a
    public E pollFirst() {
        return u3().pollFirst();
    }

    @Override // java.util.Deque
    @zc.a
    @f9.a
    public E pollLast() {
        return u3().pollLast();
    }

    @Override // java.util.Deque
    @f5
    @f9.a
    public E pop() {
        return u3().pop();
    }

    @Override // java.util.Deque
    public void push(@f5 E e4) {
        u3().push(e4);
    }

    @Override // java.util.Deque
    @f5
    @f9.a
    public E removeFirst() {
        return u3().removeFirst();
    }

    @Override // java.util.Deque
    @f9.a
    public boolean removeFirstOccurrence(@zc.a Object obj) {
        return u3().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @f5
    @f9.a
    public E removeLast() {
        return u3().removeLast();
    }

    @Override // java.util.Deque
    @f9.a
    public boolean removeLastOccurrence(@zc.a Object obj) {
        return u3().removeLastOccurrence(obj);
    }
}
