package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import com.google.common.util.concurrent.k;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: CombinedFuture.java */
@b0
@d9.b
/* loaded from: classes6.dex */
final class z<V> extends k<Object, V> {

    /* renamed from: r, reason: collision with root package name */
    @zc.a
    private z<V>.c<?> f58060r;

    /* compiled from: CombinedFuture.java */
    private final class a extends z<V>.c<ListenableFuture<V>> {

        /* renamed from: g, reason: collision with root package name */
        private final m<V> f58061g;

        a(m<V> mVar, Executor executor) {
            super(executor);
            mVar.getClass();
            this.f58061g = mVar;
        }

        @Override // com.google.common.util.concurrent.x0
        String f() {
            return this.f58061g.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.x0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<V> e() throws Exception {
            return (ListenableFuture) com.google.common.base.l0.V(this.f58061g.call(), ProtectedSandApp.s("碑"), this.f58061g);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.z.c
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ListenableFuture<V> listenableFuture) {
            z.this.D(listenableFuture);
        }
    }

    /* compiled from: CombinedFuture.java */
    private final class b extends z<V>.c<V> {

        /* renamed from: g, reason: collision with root package name */
        private final Callable<V> f58063g;

        b(Callable<V> callable, Executor executor) {
            super(executor);
            callable.getClass();
            this.f58063g = callable;
        }

        @Override // com.google.common.util.concurrent.x0
        @j1
        V e() throws Exception {
            return this.f58063g.call();
        }

        @Override // com.google.common.util.concurrent.x0
        String f() {
            return this.f58063g.toString();
        }

        @Override // com.google.common.util.concurrent.z.c
        void i(@j1 V v4) {
            z.this.B(v4);
        }
    }

    /* compiled from: CombinedFuture.java */
    private abstract class c<T> extends x0<T> {

        /* renamed from: e, reason: collision with root package name */
        private final Executor f58065e;

        c(Executor executor) {
            executor.getClass();
            this.f58065e = executor;
        }

        @Override // com.google.common.util.concurrent.x0
        final void a(Throwable th) {
            z.this.f58060r = null;
            if (th instanceof ExecutionException) {
                z.this.C(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                z.this.cancel(false);
            } else {
                z.this.C(th);
            }
        }

        @Override // com.google.common.util.concurrent.x0
        final void b(@j1 T t4) {
            z.this.f58060r = null;
            i(t4);
        }

        @Override // com.google.common.util.concurrent.x0
        final boolean d() {
            return z.this.isDone();
        }

        final void h() {
            try {
                this.f58065e.execute(this);
            } catch (RejectedExecutionException e4) {
                z.this.C(e4);
            }
        }

        abstract void i(@j1 T t4);
    }

    z(b3<? extends ListenableFuture<?>> b3Var, boolean z4, Executor executor, m<V> mVar) {
        super(b3Var, z4, false);
        this.f58060r = new a(mVar, executor);
        X();
    }

    @Override // com.google.common.util.concurrent.k
    void R(int i4, @zc.a Object obj) {
    }

    @Override // com.google.common.util.concurrent.k
    void V() {
        z<V>.c<?> cVar = this.f58060r;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // com.google.common.util.concurrent.k
    void e0(k.a aVar) {
        super.e0(aVar);
        if (aVar == k.a.OUTPUT_FUTURE_DONE) {
            this.f58060r = null;
        }
    }

    @Override // com.google.common.util.concurrent.c
    protected void w() {
        z<V>.c<?> cVar = this.f58060r;
        if (cVar != null) {
            cVar.c();
        }
    }

    z(b3<? extends ListenableFuture<?>> b3Var, boolean z4, Executor executor, Callable<V> callable) {
        super(b3Var, z4, false);
        this.f58060r = new b(callable, executor);
        X();
    }
}
