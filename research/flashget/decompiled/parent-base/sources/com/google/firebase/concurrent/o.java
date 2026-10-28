package com.google.firebase.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: DelegatingScheduledExecutorService.java */
/* loaded from: classes6.dex */
class o implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f58568b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f58569c;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f58568b = executorService;
        this.f58569c = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(final Runnable runnable, final p.b bVar) {
        this.f58568b.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                o.D(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture C(final Runnable runnable, long j4, long j5, TimeUnit timeUnit, final p.b bVar) {
        return this.f58569c.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                o.this.B(runnable, bVar);
            }
        }, j4, j5, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e4) {
            bVar.a(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e4) {
            bVar.a(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(final Runnable runnable, final p.b bVar) {
        this.f58568b.execute(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                o.n(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture q(final Runnable runnable, long j4, TimeUnit timeUnit, final p.b bVar) {
        return this.f58569c.schedule(new Runnable() { // from class: com.google.firebase.concurrent.g
            @Override // java.lang.Runnable
            public final void run() {
                o.this.o(runnable, bVar);
            }
        }, j4, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e4) {
            bVar.a(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future t(final Callable callable, final p.b bVar) throws Exception {
        return this.f58568b.submit(new Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                o.s(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture u(final Callable callable, long j4, TimeUnit timeUnit, final p.b bVar) {
        return this.f58569c.schedule(new Callable() { // from class: com.google.firebase.concurrent.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future t4;
                t4 = o.this.t(callable, bVar);
                return t4;
            }
        }, j4, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e4) {
            bVar.a(e4);
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(final Runnable runnable, final p.b bVar) {
        this.f58568b.execute(new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                o.x(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture z(final Runnable runnable, long j4, long j5, TimeUnit timeUnit, final p.b bVar) {
        return this.f58569c.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.f
            @Override // java.lang.Runnable
            public final void run() {
                o.this.y(runnable, bVar);
            }
        }, j4, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f58568b.awaitTermination(j4, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f58568b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f58568b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f58568b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f58568b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f58568b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j4, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture q4;
                q4 = o.this.q(runnable, j4, timeUnit, bVar);
                return q4;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j4, final long j5, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture z4;
                z4 = o.this.z(runnable, j4, j5, timeUnit, bVar);
                return z4;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j4, final long j5, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.j
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture C;
                C = o.this.C(runnable, j4, j5, timeUnit, bVar);
                return C;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ﮗ"));
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ﮗ"));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f58568b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f58568b.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f58568b.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j4, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.k
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture u4;
                u4 = o.this.u(callable, j4, timeUnit, bVar);
                return u4;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t4) {
        return this.f58568b.submit(runnable, t4);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f58568b.submit(runnable);
    }
}
