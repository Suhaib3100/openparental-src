package com.nostra13.universalimageloader.core.assist.deque;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingDeque.java */
/* loaded from: classes6.dex */
public interface a<E> extends BlockingQueue<E>, b<E> {
    @Override // java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Collection, com.nostra13.universalimageloader.core.assist.deque.b
    boolean add(E e4);

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    void addFirst(E e4);

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    void addLast(E e4);

    @Override // java.util.concurrent.BlockingQueue, java.util.Collection, com.nostra13.universalimageloader.core.assist.deque.b
    boolean contains(Object obj);

    @Override // java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.b
    E element();

    @Override // java.util.Collection, java.lang.Iterable, com.nostra13.universalimageloader.core.assist.deque.b
    Iterator<E> iterator();

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.b
    boolean offer(E e4);

    @Override // java.util.concurrent.BlockingQueue
    boolean offer(E e4, long j4, TimeUnit timeUnit) throws InterruptedException;

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    boolean offerFirst(E e4);

    boolean offerFirst(E e4, long j4, TimeUnit timeUnit) throws InterruptedException;

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    boolean offerLast(E e4);

    boolean offerLast(E e4, long j4, TimeUnit timeUnit) throws InterruptedException;

    @Override // java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.b
    E peek();

    @Override // java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.b
    E poll();

    @Override // java.util.concurrent.BlockingQueue
    E poll(long j4, TimeUnit timeUnit) throws InterruptedException;

    E pollFirst(long j4, TimeUnit timeUnit) throws InterruptedException;

    E pollLast(long j4, TimeUnit timeUnit) throws InterruptedException;

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    void push(E e4);

    @Override // java.util.concurrent.BlockingQueue
    void put(E e4) throws InterruptedException;

    void putFirst(E e4) throws InterruptedException;

    void putLast(E e4) throws InterruptedException;

    @Override // java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.b
    E remove();

    @Override // java.util.concurrent.BlockingQueue, java.util.Collection, com.nostra13.universalimageloader.core.assist.deque.b
    boolean remove(Object obj);

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    boolean removeFirstOccurrence(Object obj);

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    boolean removeLastOccurrence(Object obj);

    @Override // java.util.Collection, com.nostra13.universalimageloader.core.assist.deque.b
    int size();

    @Override // java.util.concurrent.BlockingQueue
    E take() throws InterruptedException;

    E takeFirst() throws InterruptedException;

    E takeLast() throws InterruptedException;
}
