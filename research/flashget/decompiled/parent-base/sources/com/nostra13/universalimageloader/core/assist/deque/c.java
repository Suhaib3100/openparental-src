package com.nostra13.universalimageloader.core.assist.deque;

/* compiled from: LIFOLinkedBlockingDeque.java */
/* loaded from: classes6.dex */
public class c<T> extends d<T> {

    /* renamed from: j, reason: collision with root package name */
    private static final long f70262j = -4114786347960826192L;

    @Override // com.nostra13.universalimageloader.core.assist.deque.d, java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.a, java.util.concurrent.BlockingQueue, com.nostra13.universalimageloader.core.assist.deque.b
    public boolean offer(T t4) {
        return super.offerFirst(t4);
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.d, java.util.AbstractQueue, java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public T remove() {
        return (T) super.removeFirst();
    }
}
