package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.z0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: JdkFutureAdapters.java */
@b0
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class z0 {
    private z0() {
    }

    public static <V> ListenableFuture<V> a(Future<V> future) {
        return future instanceof ListenableFuture ? (ListenableFuture) future : new a(future);
    }

    public static <V> ListenableFuture<V> b(Future<V> future, Executor executor) {
        executor.getClass();
        return future instanceof ListenableFuture ? (ListenableFuture) future : new a(future, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JdkFutureAdapters.java */
    static class a<V> extends n0<V> implements ListenableFuture<V> {

        /* renamed from: f, reason: collision with root package name */
        private static final ThreadFactory f58067f;

        /* renamed from: g, reason: collision with root package name */
        private static final Executor f58068g;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f58069b;

        /* renamed from: c, reason: collision with root package name */
        private final d0 f58070c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f58071d;

        /* renamed from: e, reason: collision with root package name */
        private final Future<V> f58072e;

        static {
            ThreadFactory b5 = new e2().e(true).f(ProtectedSandApp.s("社")).b();
            f58067f = b5;
            f58068g = Executors.newCachedThreadPool(b5);
        }

        a(Future<V> future, Executor executor) {
            this.f58070c = new d0();
            this.f58071d = new AtomicBoolean(false);
            future.getClass();
            this.f58072e = future;
            executor.getClass();
            this.f58069b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void E3() {
            try {
                j2.f(this.f58072e);
            } catch (Throwable unused) {
            }
            this.f58070c.b();
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void n2(Runnable runnable, Executor executor) {
            this.f58070c.a(runnable, executor);
            if (this.f58071d.compareAndSet(false, true)) {
                if (this.f58072e.isDone()) {
                    this.f58070c.b();
                } else {
                    this.f58069b.execute(new Runnable() { // from class: com.google.common.util.concurrent.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            z0.a.this.E3();
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.n0, com.google.common.collect.h2
        /* renamed from: v3 */
        public Future<V> u3() {
            return this.f58072e;
        }

        a(Future<V> future) {
            this(future, f58068g);
        }
    }
}
