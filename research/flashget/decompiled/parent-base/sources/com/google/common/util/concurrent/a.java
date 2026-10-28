package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.h0;
import java.lang.Throwable;
import java.util.concurrent.Executor;

/* compiled from: AbstractCatchingFuture.java */
@b0
@d9.b
/* loaded from: classes6.dex */
abstract class a<V, X extends Throwable, F, T> extends h0.a<V> implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    ListenableFuture<? extends V> f57663j;

    /* renamed from: k, reason: collision with root package name */
    @zc.a
    Class<X> f57664k;

    /* renamed from: l, reason: collision with root package name */
    @zc.a
    F f57665l;

    /* compiled from: AbstractCatchingFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    private static final class C0884a<V, X extends Throwable> extends a<V, X, n<? super X, ? extends V>, ListenableFuture<? extends V>> {
        C0884a(ListenableFuture<? extends V> listenableFuture, Class<X> cls, n<? super X, ? extends V> nVar) {
            super(listenableFuture, cls, nVar);
        }

        @Override // com.google.common.util.concurrent.a
        void T(Object obj) {
            D((ListenableFuture) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<? extends V> R(n<? super X, ? extends V> nVar, X x4) throws Exception {
            ListenableFuture<? extends V> apply = nVar.apply(x4);
            com.google.common.base.l0.V(apply, ProtectedSandApp.s("礪"), nVar);
            return apply;
        }

        void V(ListenableFuture<? extends V> listenableFuture) {
            D(listenableFuture);
        }
    }

    /* compiled from: AbstractCatchingFuture.java */
    private static final class b<V, X extends Throwable> extends a<V, X, com.google.common.base.x<? super X, ? extends V>, V> {
        b(ListenableFuture<? extends V> listenableFuture, Class<X> cls, com.google.common.base.x<? super X, ? extends V> xVar) {
            super(listenableFuture, cls, xVar);
        }

        @Override // com.google.common.util.concurrent.a
        @j1
        Object R(Object obj, Throwable th) throws Exception {
            return ((com.google.common.base.x) obj).apply(th);
        }

        @Override // com.google.common.util.concurrent.a
        void T(@j1 V v4) {
            B(v4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @j1
        V U(com.google.common.base.x<? super X, ? extends V> xVar, X x4) throws Exception {
            return xVar.apply(x4);
        }
    }

    a(ListenableFuture<? extends V> listenableFuture, Class<X> cls, F f4) {
        listenableFuture.getClass();
        this.f57663j = listenableFuture;
        cls.getClass();
        this.f57664k = cls;
        f4.getClass();
        this.f57665l = f4;
    }

    static <V, X extends Throwable> ListenableFuture<V> P(ListenableFuture<? extends V> listenableFuture, Class<X> cls, com.google.common.base.x<? super X, ? extends V> xVar, Executor executor) {
        b bVar = new b((ListenableFuture) listenableFuture, (Class) cls, xVar);
        listenableFuture.n2(bVar, g1.p(executor, bVar));
        return bVar;
    }

    static <X extends Throwable, V> ListenableFuture<V> Q(ListenableFuture<? extends V> listenableFuture, Class<X> cls, n<? super X, ? extends V> nVar, Executor executor) {
        C0884a c0884a = new C0884a((ListenableFuture) listenableFuture, (Class) cls, nVar);
        listenableFuture.n2(c0884a, g1.p(executor, c0884a));
        return c0884a;
    }

    @f9.g
    @j1
    abstract T R(F f4, X x4) throws Exception;

    @f9.g
    abstract void T(@j1 T t4);

    @Override // com.google.common.util.concurrent.c
    protected final void m() {
        x(this.f57663j);
        this.f57663j = null;
        this.f57664k = null;
        this.f57665l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r10.f57663j
            java.lang.Class<X extends java.lang.Throwable> r1 = r10.f57664k
            F r2 = r10.f57665l
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto Lae
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L21
            goto Lae
        L21:
            r3 = 0
            r10.f57663j = r3
            boolean r4 = r0 instanceof com.google.common.util.concurrent.internal.a     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            com.google.common.util.concurrent.internal.a r4 = (com.google.common.util.concurrent.internal.a) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = com.google.common.util.concurrent.internal.b.a(r4)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.common.util.concurrent.s0.h(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L83
        L3c:
            r5 = r3
            goto L83
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L81
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 35
            int r8 = r4.length()
            int r8 = r8 + r7
            java.lang.String r7 = "諒"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            java.lang.String r9 = "量"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            java.lang.StringBuilder r4 = com.google.common.base.g.a(r8, r7, r6, r9, r4)
            java.lang.String r6 = "勵"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
        L81:
            r4 = r5
            goto L3c
        L83:
            if (r4 != 0) goto L89
            r10.B(r5)
            return
        L89:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L93
            r10.D(r0)
            return
        L93:
            java.lang.Object r0 = r10.R(r2, r4)     // Catch: java.lang.Throwable -> L9f
            r10.f57664k = r3
            r10.f57665l = r3
            r10.T(r0)
            return
        L9f:
            r0 = move-exception
            r10.C(r0)     // Catch: java.lang.Throwable -> La8
            r10.f57664k = r3
            r10.f57665l = r3
            return
        La8:
            r0 = move-exception
            r10.f57664k = r3
            r10.f57665l = r3
            throw r0
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.run():void");
    }

    @Override // com.google.common.util.concurrent.c
    @zc.a
    protected String y() {
        String str;
        ListenableFuture<? extends V> listenableFuture = this.f57663j;
        Class<X> cls = this.f57664k;
        F f4 = this.f57665l;
        String y4 = super.y();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            str = com.google.common.base.h.a(valueOf.length() + 16, ProtectedSandApp.s("呂"), valueOf, ProtectedSandApp.s("女"));
        } else {
            str = "";
        }
        if (cls != null && f4 != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f4);
            return android.support.v4.media.c.a(com.google.common.base.g.a(valueOf3.length() + valueOf2.length() + com.google.android.gms.common.internal.b.a(str, 29), str, ProtectedSandApp.s("廬"), valueOf2, ProtectedSandApp.s("旅")), valueOf3, ProtectedSandApp.s("濾"));
        }
        if (y4 == null) {
            return null;
        }
        String valueOf4 = String.valueOf(str);
        return y4.length() != 0 ? valueOf4.concat(y4) : new String(valueOf4);
    }
}
