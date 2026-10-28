package com.google.firebase.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: LimitedConcurrencyExecutorService.java */
/* loaded from: classes6.dex */
final class e0 extends b0 implements ExecutorService {

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f58519e;

    e0(ExecutorService executorService, int i4) {
        super(executorService, i4);
        this.f58519e = executorService;
    }

    public static /* synthetic */ Object e(Runnable runnable, Object obj) {
        runnable.run();
        return obj;
    }

    public static /* synthetic */ Object f(Runnable runnable) {
        runnable.run();
        return null;
    }

    private static /* synthetic */ Object g(Runnable runnable, Object obj) throws Exception {
        runnable.run();
        return obj;
    }

    private static /* synthetic */ Object h(Runnable runnable) throws Exception {
        runnable.run();
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f58519e.awaitTermination(j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f58519e.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f58519e.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f58519e.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f58519e.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ﮕ"));
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ﮕ"));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f58519e.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f58519e.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable runnable, final T t4) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Runnable runnable2 = runnable;
                Object obj = t4;
                runnable2.run();
                return obj;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                runnable.run();
                return null;
            }
        });
    }
}
