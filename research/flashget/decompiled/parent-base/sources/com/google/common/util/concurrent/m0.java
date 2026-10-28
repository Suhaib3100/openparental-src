package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ForwardingFluentFuture.java */
@b0
@d9.b
/* loaded from: classes6.dex */
final class m0<V> extends h0<V> {

    /* renamed from: j, reason: collision with root package name */
    private final ListenableFuture<V> f57891j;

    m0(ListenableFuture<V> listenableFuture) {
        listenableFuture.getClass();
        this.f57891j = listenableFuture;
    }

    @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return this.f57891j.cancel(z4);
    }

    @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
    @j1
    public V get() throws InterruptedException, ExecutionException {
        return this.f57891j.get();
    }

    @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f57891j.isCancelled();
    }

    @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
    public boolean isDone() {
        return this.f57891j.isDone();
    }

    @Override // com.google.common.util.concurrent.c, com.google.common.util.concurrent.ListenableFuture
    public void n2(Runnable runnable, Executor executor) {
        this.f57891j.n2(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.c
    public String toString() {
        return this.f57891j.toString();
    }

    @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
    @j1
    public V get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f57891j.get(j4, timeUnit);
    }
}
