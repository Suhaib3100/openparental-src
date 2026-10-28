package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ForwardingListenableFuture.java */
@b0
@f9.a
@d9.b
/* loaded from: classes6.dex */
public abstract class o0<V> extends n0<V> implements ListenableFuture<V> {

    /* compiled from: ForwardingListenableFuture.java */
    public static abstract class a<V> extends o0<V> {

        /* renamed from: b, reason: collision with root package name */
        private final ListenableFuture<V> f57900b;

        protected a(ListenableFuture<V> listenableFuture) {
            listenableFuture.getClass();
            this.f57900b = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.o0
        /* renamed from: A3 */
        protected final ListenableFuture<V> u3() {
            return this.f57900b;
        }

        @Override // com.google.common.util.concurrent.o0, com.google.common.util.concurrent.n0, com.google.common.collect.h2
        protected Object u3() {
            return this.f57900b;
        }

        @Override // com.google.common.util.concurrent.o0, com.google.common.util.concurrent.n0
        /* renamed from: v3 */
        protected Future u3() {
            return this.f57900b;
        }
    }

    protected o0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.n0
    /* renamed from: A3, reason: merged with bridge method [inline-methods] */
    public abstract ListenableFuture<? extends V> u3();

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void n2(Runnable runnable, Executor executor) {
        u3().n2(runnable, executor);
    }
}
