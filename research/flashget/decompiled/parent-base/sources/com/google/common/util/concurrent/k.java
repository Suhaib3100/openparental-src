package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import com.google.common.collect.e7;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AggregateFuture.java */
@b0
@d9.b
/* loaded from: classes6.dex */
abstract class k<InputT, OutputT> extends l<OutputT> {

    /* renamed from: q, reason: collision with root package name */
    private static final Logger f57879q = Logger.getLogger(k.class.getName());

    /* renamed from: n, reason: collision with root package name */
    @zc.a
    private b3<? extends ListenableFuture<? extends InputT>> f57880n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f57881o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f57882p;

    /* compiled from: AggregateFuture.java */
    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    k(b3<? extends ListenableFuture<? extends InputT>> b3Var, boolean z4, boolean z5) {
        super(b3Var.size());
        this.f57880n = b3Var;
        this.f57881o = z4;
        this.f57882p = z5;
    }

    private static boolean Q(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void T(int i4, Future<? extends InputT> future) {
        try {
            R(i4, s0.h(future));
        } catch (ExecutionException e4) {
            W(e4.getCause());
        } catch (Throwable th) {
            W(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void a0(@zc.a b3<? extends Future<? extends InputT>> b3Var) {
        int M = M();
        com.google.common.base.l0.h0(M >= 0, ProtectedSandApp.s("麟"));
        if (M == 0) {
            d0(b3Var);
        }
    }

    private void W(Throwable th) {
        th.getClass();
        if (this.f57881o && !C(th) && Q(N(), th)) {
            b0(th);
        } else if (th instanceof Error) {
            b0(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(ListenableFuture listenableFuture, int i4) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f57880n = null;
                cancel(false);
            } else {
                T(i4, listenableFuture);
            }
            a0(null);
        } catch (Throwable th) {
            a0(null);
            throw th;
        }
    }

    private static void b0(Throwable th) {
        f57879q.log(Level.SEVERE, th instanceof Error ? ProtectedSandApp.s("林") : ProtectedSandApp.s("淋"), th);
    }

    private void d0(@zc.a b3<? extends Future<? extends InputT>> b3Var) {
        if (b3Var != null) {
            e7<? extends Future<? extends InputT>> it = b3Var.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    T(i4, next);
                }
                i4++;
            }
        }
        L();
        V();
        e0(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.l
    final void I(Set<Throwable> set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable a5 = a();
        Objects.requireNonNull(a5);
        Q(set, a5);
    }

    abstract void R(int i4, @j1 InputT inputt);

    abstract void V();

    final void X() {
        Objects.requireNonNull(this.f57880n);
        if (this.f57880n.isEmpty()) {
            V();
            return;
        }
        if (!this.f57881o) {
            final b3<? extends ListenableFuture<? extends InputT>> b3Var = this.f57882p ? this.f57880n : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.a0(b3Var);
                }
            };
            e7<? extends ListenableFuture<? extends InputT>> it = this.f57880n.iterator();
            while (it.hasNext()) {
                it.next().n2(runnable, a0.INSTANCE);
            }
            return;
        }
        e7<? extends ListenableFuture<? extends InputT>> it2 = this.f57880n.iterator();
        final int i4 = 0;
        while (it2.hasNext()) {
            final ListenableFuture<? extends InputT> next = it2.next();
            next.n2(new Runnable() { // from class: com.google.common.util.concurrent.i
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.Z(next, i4);
                }
            }, a0.INSTANCE);
            i4++;
        }
    }

    @f9.g
    @f9.r
    void e0(a aVar) {
        aVar.getClass();
        this.f57880n = null;
    }

    @Override // com.google.common.util.concurrent.c
    protected final void m() {
        b3<? extends ListenableFuture<? extends InputT>> b3Var = this.f57880n;
        e0(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (b3Var != null)) {
            boolean E = E();
            e7<? extends ListenableFuture<? extends InputT>> it = b3Var.iterator();
            while (it.hasNext()) {
                it.next().cancel(E);
            }
        }
    }

    @Override // com.google.common.util.concurrent.c
    @zc.a
    protected final String y() {
        b3<? extends ListenableFuture<? extends InputT>> b3Var = this.f57880n;
        if (b3Var == null) {
            return super.y();
        }
        String valueOf = String.valueOf(b3Var);
        return com.google.common.base.i.a(valueOf.length() + 8, ProtectedSandApp.s("臨"), valueOf);
    }
}
