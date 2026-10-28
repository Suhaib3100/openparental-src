package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExecutionSequencer.java */
@b0
/* loaded from: classes6.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<ListenableFuture<Void>> f57797a = new AtomicReference<>(w0.f57979c);

    /* renamed from: b, reason: collision with root package name */
    private e f57798b = new e();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ExecutionSequencer.java */
    class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f57799a;

        a(f0 f0Var, Callable callable) {
            this.f57799a = callable;
        }

        @Override // com.google.common.util.concurrent.m
        public ListenableFuture<T> call() throws Exception {
            return s0.m(this.f57799a.call());
        }

        public String toString() {
            return this.f57799a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ExecutionSequencer.java */
    class b<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f57800a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f57801b;

        b(f0 f0Var, d dVar, m mVar) {
            this.f57800a = dVar;
            this.f57801b = mVar;
        }

        @Override // com.google.common.util.concurrent.m
        public ListenableFuture<T> call() throws Exception {
            return !this.f57800a.d() ? s0.k() : this.f57801b.call();
        }

        public String toString() {
            return this.f57801b.toString();
        }
    }

    /* compiled from: ExecutionSequencer.java */
    enum c {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExecutionSequencer.java */
    static final class d extends AtomicReference<c> implements Executor, Runnable {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        f0 f57802b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        Executor f57803c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        Runnable f57804d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        Thread f57805e;

        /* synthetic */ d(Executor executor, f0 f0Var, a aVar) {
            this(executor, f0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return compareAndSet(c.NOT_RUN, c.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return compareAndSet(c.NOT_RUN, c.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == c.CANCELLED) {
                this.f57803c = null;
                this.f57802b = null;
                return;
            }
            this.f57805e = Thread.currentThread();
            try {
                f0 f0Var = this.f57802b;
                Objects.requireNonNull(f0Var);
                e eVar = f0Var.f57798b;
                if (eVar.f57806a == this.f57805e) {
                    this.f57802b = null;
                    com.google.common.base.l0.g0(eVar.f57807b == null);
                    eVar.f57807b = runnable;
                    Executor executor = this.f57803c;
                    Objects.requireNonNull(executor);
                    eVar.f57808c = executor;
                    this.f57803c = null;
                } else {
                    Executor executor2 = this.f57803c;
                    Objects.requireNonNull(executor2);
                    this.f57803c = null;
                    this.f57804d = runnable;
                    executor2.execute(this);
                }
                this.f57805e = null;
            } catch (Throwable th) {
                this.f57805e = null;
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread currentThread = Thread.currentThread();
            if (currentThread != this.f57805e) {
                Runnable runnable = this.f57804d;
                Objects.requireNonNull(runnable);
                this.f57804d = null;
                runnable.run();
                return;
            }
            e eVar = new e();
            eVar.f57806a = currentThread;
            f0 f0Var = this.f57802b;
            Objects.requireNonNull(f0Var);
            f0Var.f57798b = eVar;
            this.f57802b = null;
            try {
                Runnable runnable2 = this.f57804d;
                Objects.requireNonNull(runnable2);
                this.f57804d = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = eVar.f57807b;
                    if (runnable3 == null || (executor = eVar.f57808c) == null) {
                        break;
                    }
                    eVar.f57807b = null;
                    eVar.f57808c = null;
                    executor.execute(runnable3);
                }
            } finally {
                eVar.f57806a = null;
            }
        }

        private d(Executor executor, f0 f0Var) {
            super(c.NOT_RUN);
            this.f57803c = executor;
            this.f57802b = f0Var;
        }
    }

    /* compiled from: ExecutionSequencer.java */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        @zc.a
        Thread f57806a;

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        Runnable f57807b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        Executor f57808c;

        private e() {
        }

        e(a aVar) {
        }
    }

    private f0() {
    }

    public static f0 d() {
        return new f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(h2 h2Var, s1 s1Var, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, d dVar) {
        if (h2Var.isDone()) {
            s1Var.D(listenableFuture);
        } else if (listenableFuture2.isCancelled() && dVar.c()) {
            h2Var.cancel(false);
        }
    }

    public <T> ListenableFuture<T> f(Callable<T> callable, Executor executor) {
        callable.getClass();
        executor.getClass();
        return g(new a(this, callable), executor);
    }

    public <T> ListenableFuture<T> g(m<T> mVar, Executor executor) {
        mVar.getClass();
        executor.getClass();
        final d dVar = new d(executor, this, null);
        b bVar = new b(this, dVar, mVar);
        final s1 F = s1.F();
        final ListenableFuture<Void> andSet = this.f57797a.getAndSet(F);
        final h2 P = h2.P(bVar);
        andSet.n2(P, dVar);
        final ListenableFuture<T> q4 = s0.q(P);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.e0
            @Override // java.lang.Runnable
            public final void run() {
                f0.e(h2.this, F, andSet, q4, dVar);
            }
        };
        a0 a0Var = a0.INSTANCE;
        q4.n2(runnable, a0Var);
        P.n2(runnable, a0Var);
        return q4;
    }
}
