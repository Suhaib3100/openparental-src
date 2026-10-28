package com.google.common.collect;

import java.util.Queue;

/* compiled from: ConsumingQueueIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class n0<T> extends c<T> {

    /* renamed from: d, reason: collision with root package name */
    private final Queue<T> f55964d;

    n0(Queue<T> queue) {
        queue.getClass();
        this.f55964d = queue;
    }

    @Override // com.google.common.collect.c
    @zc.a
    public T a() {
        return this.f55964d.isEmpty() ? b() : this.f55964d.remove();
    }
}
