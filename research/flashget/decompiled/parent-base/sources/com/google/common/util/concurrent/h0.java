package com.google.common.util.concurrent;

import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.k1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: FluentFuture.java */
@b0
@d9.b(emulated = true)
@f9.f("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
/* loaded from: classes6.dex */
public abstract class h0<V> extends u0<V> {

    /* compiled from: FluentFuture.java */
    static abstract class a<V> extends h0<V> implements c.i<V> {
        a() {
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        @f9.a
        public final boolean cancel(boolean z4) {
            return super.cancel(z4);
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        @f9.a
        @j1
        public final V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.c, com.google.common.util.concurrent.ListenableFuture
        public final void n2(Runnable runnable, Executor executor) {
            super.n2(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        @f9.a
        @j1
        public final V get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j4, timeUnit);
        }
    }

    h0() {
    }

    @Deprecated
    public static <V> h0<V> I(h0<V> h0Var) {
        h0Var.getClass();
        return h0Var;
    }

    public static <V> h0<V> L(ListenableFuture<V> listenableFuture) {
        return listenableFuture instanceof h0 ? (h0) listenableFuture : new m0(listenableFuture);
    }

    public final void F(r0<? super V> r0Var, Executor executor) {
        s0.a(this, r0Var, executor);
    }

    @d9.a
    @k1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> h0<V> G(Class<X> cls, com.google.common.base.x<? super X, ? extends V> xVar, Executor executor) {
        return (h0) com.google.common.util.concurrent.a.P(this, cls, xVar, executor);
    }

    @d9.a
    @k1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> h0<V> H(Class<X> cls, n<? super X, ? extends V> nVar, Executor executor) {
        return (h0) com.google.common.util.concurrent.a.Q(this, cls, nVar, executor);
    }

    @d9.a
    public final <T> h0<T> M(com.google.common.base.x<? super V, T> xVar, Executor executor) {
        return (h0) h.P(this, xVar, executor);
    }

    @d9.a
    public final <T> h0<T> N(n<? super V, T> nVar, Executor executor) {
        return (h0) h.Q(this, nVar, executor);
    }

    @d9.a
    @d9.c
    public final h0<V> O(long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (h0) s0.D(this, j4, timeUnit, scheduledExecutorService);
    }
}
