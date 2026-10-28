package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.h0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: TrustedListenableFutureTask.java */
@b0
@d9.b
/* loaded from: classes6.dex */
class h2<V> extends h0.a<V> implements RunnableFuture<V> {

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    private volatile x0<?> f57866j;

    /* compiled from: TrustedListenableFutureTask.java */
    private final class a extends x0<ListenableFuture<V>> {

        /* renamed from: e, reason: collision with root package name */
        private final m<V> f57867e;

        a(m<V> mVar) {
            mVar.getClass();
            this.f57867e = mVar;
        }

        @Override // com.google.common.util.concurrent.x0
        void a(Throwable th) {
            h2.this.C(th);
        }

        @Override // com.google.common.util.concurrent.x0
        final boolean d() {
            return h2.this.isDone();
        }

        @Override // com.google.common.util.concurrent.x0
        String f() {
            return this.f57867e.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.x0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void b(ListenableFuture<V> listenableFuture) {
            h2.this.D(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.x0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<V> e() throws Exception {
            return (ListenableFuture) com.google.common.base.l0.V(this.f57867e.call(), ProtectedSandApp.s("離"), this.f57867e);
        }
    }

    /* compiled from: TrustedListenableFutureTask.java */
    private final class b extends x0<V> {

        /* renamed from: e, reason: collision with root package name */
        private final Callable<V> f57869e;

        b(Callable<V> callable) {
            callable.getClass();
            this.f57869e = callable;
        }

        @Override // com.google.common.util.concurrent.x0
        void a(Throwable th) {
            h2.this.C(th);
        }

        @Override // com.google.common.util.concurrent.x0
        void b(@j1 V v4) {
            h2.this.B(v4);
        }

        @Override // com.google.common.util.concurrent.x0
        final boolean d() {
            return h2.this.isDone();
        }

        @Override // com.google.common.util.concurrent.x0
        @j1
        V e() throws Exception {
            return this.f57869e.call();
        }

        @Override // com.google.common.util.concurrent.x0
        String f() {
            return this.f57869e.toString();
        }
    }

    h2(m<V> mVar) {
        this.f57866j = new a(mVar);
    }

    static <V> h2<V> P(m<V> mVar) {
        return new h2<>(mVar);
    }

    static <V> h2<V> Q(Runnable runnable, @j1 V v4) {
        return new h2<>(Executors.callable(runnable, v4));
    }

    static <V> h2<V> R(Callable<V> callable) {
        return new h2<>(callable);
    }

    @Override // com.google.common.util.concurrent.c
    protected void m() {
        x0<?> x0Var;
        if (E() && (x0Var = this.f57866j) != null) {
            x0Var.c();
        }
        this.f57866j = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        x0<?> x0Var = this.f57866j;
        if (x0Var != null) {
            x0Var.run();
        }
        this.f57866j = null;
    }

    @Override // com.google.common.util.concurrent.c
    @zc.a
    protected String y() {
        x0<?> x0Var = this.f57866j;
        if (x0Var == null) {
            return super.y();
        }
        String valueOf = String.valueOf(x0Var);
        return com.google.common.base.h.a(valueOf.length() + 7, ProtectedSandApp.s("匿"), valueOf, ProtectedSandApp.s("溺"));
    }

    h2(Callable<V> callable) {
        this.f57866j = new b(callable);
    }
}
