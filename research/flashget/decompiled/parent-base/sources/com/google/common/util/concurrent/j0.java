package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingBlockingQueue.java */
@b0
@d9.c
@f9.a
/* loaded from: classes6.dex */
public abstract class j0<E> extends com.google.common.collect.i2<E> implements BlockingQueue<E> {
    protected j0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.i2, com.google.common.collect.q1
    /* renamed from: X3, reason: merged with bridge method [inline-methods] */
    public abstract BlockingQueue<E> u3();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i4) {
        return u3().drainTo(collection, i4);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e4, long j4, TimeUnit timeUnit) throws InterruptedException {
        return u3().offer(e4, j4, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @zc.a
    public E poll(long j4, TimeUnit timeUnit) throws InterruptedException {
        return u3().poll(j4, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e4) throws InterruptedException {
        u3().put(e4);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return u3().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return u3().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return u3().drainTo(collection);
    }
}
