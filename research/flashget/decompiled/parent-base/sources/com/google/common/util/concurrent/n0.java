package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ForwardingFuture.java */
@b0
@f9.a
@d9.b
/* loaded from: classes6.dex */
public abstract class n0<V> extends com.google.common.collect.h2 implements Future<V> {

    /* compiled from: ForwardingFuture.java */
    public static abstract class a<V> extends n0<V> {

        /* renamed from: b, reason: collision with root package name */
        private final Future<V> f57896b;

        protected a(Future<V> future) {
            future.getClass();
            this.f57896b = future;
        }

        @Override // com.google.common.util.concurrent.n0, com.google.common.collect.h2
        protected Object u3() {
            return this.f57896b;
        }

        @Override // com.google.common.util.concurrent.n0
        /* renamed from: v3 */
        protected final Future<V> u3() {
            return this.f57896b;
        }
    }

    protected n0() {
    }

    public boolean cancel(boolean z4) {
        return u3().cancel(z4);
    }

    @Override // java.util.concurrent.Future
    @j1
    public V get() throws InterruptedException, ExecutionException {
        return u3().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return u3().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return u3().isDone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h2
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public abstract Future<? extends V> u3();

    @Override // java.util.concurrent.Future
    @j1
    public V get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return u3().get(j4, timeUnit);
    }
}
