package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ListenableFutureTask.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public class a1<V> extends FutureTask<V> implements ListenableFuture<V> {

    /* renamed from: b, reason: collision with root package name */
    private final d0 f57666b;

    a1(Callable<V> callable) {
        super(callable);
        this.f57666b = new d0();
    }

    public static <V> a1<V> a(Runnable runnable, @j1 V v4) {
        return new a1<>(runnable, v4);
    }

    public static <V> a1<V> b(Callable<V> callable) {
        return new a1<>(callable);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.f57666b.b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @f9.a
    @j1
    public V get(long j4, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        long nanos = timeUnit.toNanos(j4);
        return nanos <= 2147483647999999999L ? (V) super.get(j4, timeUnit) : (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void n2(Runnable runnable, Executor executor) {
        this.f57666b.a(runnable, executor);
    }

    a1(Runnable runnable, @j1 V v4) {
        super(runnable, v4);
        this.f57666b = new d0();
    }
}
