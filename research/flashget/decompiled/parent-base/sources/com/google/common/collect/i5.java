package com.google.common.collect;

import com.google.common.collect.r6;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: Queues.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class i5 {
    private i5() {
    }

    @d9.c
    @f9.a
    @d9.a
    public static <E> int a(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i4, long j4, TimeUnit timeUnit) throws InterruptedException {
        collection.getClass();
        long nanos = timeUnit.toNanos(j4) + System.nanoTime();
        int i5 = 0;
        while (i5 < i4) {
            i5 += blockingQueue.drainTo(collection, i4 - i5);
            if (i5 < i4) {
                E poll = blockingQueue.poll(nanos - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (poll == null) {
                    break;
                }
                collection.add(poll);
                i5++;
            }
        }
        return i5;
    }

    @d9.a
    @d9.c
    @f9.a
    public static <E> int b(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i4, long j4, TimeUnit timeUnit) {
        E poll;
        collection.getClass();
        long nanos = timeUnit.toNanos(j4) + System.nanoTime();
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i4) {
            try {
                i5 += blockingQueue.drainTo(collection, i4 - i5);
                if (i5 < i4) {
                    while (true) {
                        try {
                            poll = blockingQueue.poll(nanos - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z4 = true;
                        }
                    }
                    if (poll == null) {
                        break;
                    }
                    collection.add(poll);
                    i5++;
                }
            } finally {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return i5;
    }

    @d9.c
    public static <E> ArrayBlockingQueue<E> c(int i4) {
        return new ArrayBlockingQueue<>(i4);
    }

    public static <E> ArrayDeque<E> d() {
        return new ArrayDeque<>();
    }

    public static <E> ArrayDeque<E> e(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayDeque<>((Collection) iterable);
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        c4.a(arrayDeque, iterable);
        return arrayDeque;
    }

    @d9.c
    public static <E> ConcurrentLinkedQueue<E> f() {
        return new ConcurrentLinkedQueue<>();
    }

    @d9.c
    public static <E> ConcurrentLinkedQueue<E> g(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ConcurrentLinkedQueue<>((Collection) iterable);
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        c4.a(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    @d9.c
    public static <E> LinkedBlockingDeque<E> h() {
        return new LinkedBlockingDeque<>();
    }

    @d9.c
    public static <E> LinkedBlockingDeque<E> i(int i4) {
        return new LinkedBlockingDeque<>(i4);
    }

    @d9.c
    public static <E> LinkedBlockingDeque<E> j(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingDeque<>((Collection) iterable);
        }
        LinkedBlockingDeque<E> linkedBlockingDeque = new LinkedBlockingDeque<>();
        c4.a(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    @d9.c
    public static <E> LinkedBlockingQueue<E> k() {
        return new LinkedBlockingQueue<>();
    }

    @d9.c
    public static <E> LinkedBlockingQueue<E> l(int i4) {
        return new LinkedBlockingQueue<>(i4);
    }

    @d9.c
    public static <E> LinkedBlockingQueue<E> m(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingQueue<>((Collection) iterable);
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        c4.a(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    @d9.c
    public static <E extends Comparable> PriorityBlockingQueue<E> n() {
        return new PriorityBlockingQueue<>();
    }

    @d9.c
    public static <E extends Comparable> PriorityBlockingQueue<E> o(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityBlockingQueue<>((Collection) iterable);
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        c4.a(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    public static <E extends Comparable> PriorityQueue<E> p() {
        return new PriorityQueue<>();
    }

    public static <E extends Comparable> PriorityQueue<E> q(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityQueue<>((Collection) iterable);
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        c4.a(priorityQueue, iterable);
        return priorityQueue;
    }

    @d9.c
    public static <E> SynchronousQueue<E> r() {
        return new SynchronousQueue<>();
    }

    public static <E> Deque<E> s(Deque<E> deque) {
        return new r6.g((Object) deque, (Object) null);
    }

    public static <E> Queue<E> t(Queue<E> queue) {
        return r6.t(queue, null);
    }
}
