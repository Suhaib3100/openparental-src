package com.google.common.util.concurrent;

import com.google.common.collect.f3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WrappingExecutorService.java */
@b0
@d9.c
@f9.a
/* loaded from: classes6.dex */
abstract class l2 implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f57890b;

    protected l2(ExecutorService executorService) {
        executorService.getClass();
        this.f57890b = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Callable callable) {
        try {
            callable.call();
        } catch (Exception e4) {
            com.google.common.base.w0.w(e4);
            throw new RuntimeException(e4);
        }
    }

    private <T> f3<Callable<T>> e(Collection<? extends Callable<T>> collection) {
        f3.a r4 = f3.r();
        Iterator<? extends Callable<T>> it = collection.iterator();
        while (it.hasNext()) {
            r4.j(d(it.next()));
        }
        return r4.e();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f57890b.awaitTermination(j4, timeUnit);
    }

    protected Runnable c(Runnable runnable) {
        final Callable d5 = d(Executors.callable(runnable, null));
        return new Runnable() { // from class: com.google.common.util.concurrent.k2
            @Override // java.lang.Runnable
            public final void run() {
                l2.b(d5);
            }
        };
    }

    protected abstract <T> Callable<T> d(Callable<T> callable);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f57890b.execute(c(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f57890b.invokeAll(e(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f57890b.invokeAny(e(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f57890b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f57890b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f57890b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f57890b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        ExecutorService executorService = this.f57890b;
        callable.getClass();
        return executorService.submit(d(callable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f57890b.invokeAll(e(collection), j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f57890b.invokeAny(e(collection), j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f57890b.submit(c(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, @j1 T t4) {
        return this.f57890b.submit(c(runnable), t4);
    }
}
