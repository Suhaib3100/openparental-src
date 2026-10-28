package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: BackgroundInitializer.java */
/* loaded from: classes6.dex */
public abstract class d<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f85880a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f85881b;

    /* renamed from: c, reason: collision with root package name */
    private Future<T> f85882c;

    /* compiled from: BackgroundInitializer.java */
    private class a implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        private final ExecutorService f85883a;

        a(ExecutorService executorService) {
            this.f85883a = executorService;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                return (T) d.this.g();
            } finally {
                ExecutorService executorService = this.f85883a;
                if (executorService != null) {
                    executorService.shutdown();
                }
            }
        }
    }

    protected d() {
        this(null);
    }

    private ExecutorService a() {
        return Executors.newFixedThreadPool(f());
    }

    private Callable<T> b(ExecutorService executorService) {
        return new a(executorService);
    }

    protected final synchronized ExecutorService c() {
        return this.f85881b;
    }

    public final synchronized ExecutorService d() {
        return this.f85880a;
    }

    public synchronized Future<T> e() {
        Future<T> future;
        future = this.f85882c;
        if (future == null) {
            throw new IllegalStateException("start() must be called first!");
        }
        return future;
    }

    protected int f() {
        return 1;
    }

    protected abstract T g() throws Exception;

    @Override // org.apache.commons.lang3.concurrent.i
    public T get() throws ConcurrentException {
        try {
            return e().get();
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            throw new ConcurrentException(e4);
        } catch (ExecutionException e5) {
            j.g(e5);
            return null;
        }
    }

    public synchronized boolean h() {
        return this.f85882c != null;
    }

    public final synchronized void i(ExecutorService executorService) {
        if (h()) {
            throw new IllegalStateException("Cannot set ExecutorService after start()!");
        }
        this.f85880a = executorService;
    }

    public synchronized boolean j() {
        ExecutorService executorService;
        try {
            if (h()) {
                return false;
            }
            ExecutorService d5 = d();
            this.f85881b = d5;
            if (d5 == null) {
                executorService = a();
                this.f85881b = executorService;
            } else {
                executorService = null;
            }
            this.f85882c = this.f85881b.submit(new a(executorService));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    protected d(ExecutorService executorService) {
        i(executorService);
    }
}
