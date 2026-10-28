package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: AbstractTransformFuture.java */
@b0
@d9.b
/* loaded from: classes6.dex */
abstract class h<I, O, F, T> extends h0.a<O> implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    ListenableFuture<? extends I> f57864j;

    /* renamed from: k, reason: collision with root package name */
    @zc.a
    F f57865k;

    /* compiled from: AbstractTransformFuture.java */
    private static final class a<I, O> extends h<I, O, n<? super I, ? extends O>, ListenableFuture<? extends O>> {
        a(ListenableFuture<? extends I> listenableFuture, n<? super I, ? extends O> nVar) {
            super(listenableFuture, nVar);
        }

        @Override // com.google.common.util.concurrent.h
        void T(Object obj) {
            D((ListenableFuture) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.h
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<? extends O> R(n<? super I, ? extends O> nVar, @j1 I i4) throws Exception {
            ListenableFuture<? extends O> apply = nVar.apply(i4);
            com.google.common.base.l0.V(apply, ProtectedSandApp.s("泥"), nVar);
            return apply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void V(ListenableFuture<? extends O> listenableFuture) {
            D(listenableFuture);
        }
    }

    /* compiled from: AbstractTransformFuture.java */
    private static final class b<I, O> extends h<I, O, com.google.common.base.x<? super I, ? extends O>, O> {
        b(ListenableFuture<? extends I> listenableFuture, com.google.common.base.x<? super I, ? extends O> xVar) {
            super(listenableFuture, xVar);
        }

        @Override // com.google.common.util.concurrent.h
        @j1
        Object R(Object obj, @j1 Object obj2) throws Exception {
            return ((com.google.common.base.x) obj).apply(obj2);
        }

        @Override // com.google.common.util.concurrent.h
        void T(@j1 O o4) {
            B(o4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @j1
        O U(com.google.common.base.x<? super I, ? extends O> xVar, @j1 I i4) {
            return xVar.apply(i4);
        }
    }

    h(ListenableFuture<? extends I> listenableFuture, F f4) {
        listenableFuture.getClass();
        this.f57864j = listenableFuture;
        f4.getClass();
        this.f57865k = f4;
    }

    static <I, O> ListenableFuture<O> P(ListenableFuture<I> listenableFuture, com.google.common.base.x<? super I, ? extends O> xVar, Executor executor) {
        xVar.getClass();
        b bVar = new b((ListenableFuture) listenableFuture, xVar);
        listenableFuture.n2(bVar, g1.p(executor, bVar));
        return bVar;
    }

    static <I, O> ListenableFuture<O> Q(ListenableFuture<I> listenableFuture, n<? super I, ? extends O> nVar, Executor executor) {
        executor.getClass();
        a aVar = new a((ListenableFuture) listenableFuture, nVar);
        listenableFuture.n2(aVar, g1.p(executor, aVar));
        return aVar;
    }

    @f9.g
    @j1
    abstract T R(F f4, @j1 I i4) throws Exception;

    @f9.g
    abstract void T(@j1 T t4);

    @Override // com.google.common.util.concurrent.c
    protected final void m() {
        x(this.f57864j);
        this.f57864j = null;
        this.f57865k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.f57864j;
        F f4 = this.f57865k;
        if ((isCancelled() | (listenableFuture == null)) || (f4 == null)) {
            return;
        }
        this.f57864j = null;
        if (listenableFuture.isCancelled()) {
            D(listenableFuture);
            return;
        }
        try {
            try {
                Object R = R(f4, s0.h(listenableFuture));
                this.f57865k = null;
                T(R);
            } catch (Throwable th) {
                try {
                    C(th);
                } finally {
                    this.f57865k = null;
                }
            }
        } catch (Error e4) {
            C(e4);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e5) {
            C(e5);
        } catch (ExecutionException e6) {
            C(e6.getCause());
        }
    }

    @Override // com.google.common.util.concurrent.c
    @zc.a
    protected String y() {
        String str;
        ListenableFuture<? extends I> listenableFuture = this.f57864j;
        F f4 = this.f57865k;
        String y4 = super.y();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            str = com.google.common.base.h.a(valueOf.length() + 16, ProtectedSandApp.s("履"), valueOf, ProtectedSandApp.s("易"));
        } else {
            str = "";
        }
        if (f4 != null) {
            String valueOf2 = String.valueOf(f4);
            return com.google.common.base.e.a(valueOf2.length() + com.google.android.gms.common.internal.b.a(str, 11), str, ProtectedSandApp.s("李"), valueOf2, ProtectedSandApp.s("梨"));
        }
        if (y4 == null) {
            return null;
        }
        String valueOf3 = String.valueOf(str);
        return y4.length() != 0 ? valueOf3.concat(y4) : new String(valueOf3);
    }
}
