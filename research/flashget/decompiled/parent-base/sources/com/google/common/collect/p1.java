package com.google.common.collect;

import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingBlockingDeque.java */
@w0
@d9.c
@Deprecated
/* loaded from: classes6.dex */
public abstract class p1<E> extends s1<E> implements BlockingDeque<E> {
    protected p1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s1, com.google.common.collect.i2, com.google.common.collect.q1
    /* renamed from: Y3, reason: merged with bridge method [inline-methods] */
    public abstract BlockingDeque<E> u3();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return u3().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e4, long j4, TimeUnit timeUnit) throws InterruptedException {
        return u3().offer(e4, j4, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e4, long j4, TimeUnit timeUnit) throws InterruptedException {
        return u3().offerFirst(e4, j4, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e4, long j4, TimeUnit timeUnit) throws InterruptedException {
        return u3().offerLast(e4, j4, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @zc.a
    public E poll(long j4, TimeUnit timeUnit) throws InterruptedException {
        return u3().poll(j4, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @zc.a
    public E pollFirst(long j4, TimeUnit timeUnit) throws InterruptedException {
        return u3().pollFirst(j4, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @zc.a
    public E pollLast(long j4, TimeUnit timeUnit) throws InterruptedException {
        return u3().pollLast(j4, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e4) throws InterruptedException {
        u3().put(e4);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e4) throws InterruptedException {
        u3().putFirst(e4);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e4) throws InterruptedException {
        u3().putLast(e4);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return u3().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return u3().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return u3().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return u3().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i4) {
        return u3().drainTo(collection, i4);
    }
}
