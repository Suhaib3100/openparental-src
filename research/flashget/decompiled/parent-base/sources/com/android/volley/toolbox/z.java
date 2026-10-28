package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.android.volley.q;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFuture.java */
/* loaded from: classes3.dex */
public class z<T> implements Future<T>, q.b<T>, q.a {

    /* renamed from: b, reason: collision with root package name */
    private com.android.volley.n<?> f41079b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41080c = false;

    /* renamed from: d, reason: collision with root package name */
    private T f41081d;

    /* renamed from: e, reason: collision with root package name */
    private VolleyError f41082e;

    private z() {
    }

    private synchronized T b(Long l4) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.f41082e != null) {
            throw new ExecutionException(this.f41082e);
        }
        if (this.f41080c) {
            return this.f41081d;
        }
        if (l4 == null) {
            while (!isDone()) {
                wait(0L);
            }
        } else if (l4.longValue() > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long longValue = l4.longValue() + uptimeMillis;
            while (!isDone() && uptimeMillis < longValue) {
                wait(longValue - uptimeMillis);
                uptimeMillis = SystemClock.uptimeMillis();
            }
        }
        if (this.f41082e != null) {
            throw new ExecutionException(this.f41082e);
        }
        if (!this.f41080c) {
            throw new TimeoutException();
        }
        return this.f41081d;
    }

    public static <E> z<E> c() {
        return new z<>();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z4) {
        if (this.f41079b == null) {
            return false;
        }
        if (isDone()) {
            return false;
        }
        this.f41079b.cancel();
        return true;
    }

    public void d(com.android.volley.n<?> nVar) {
        this.f41079b = nVar;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        try {
            return b(null);
        } catch (TimeoutException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        com.android.volley.n<?> nVar = this.f41079b;
        if (nVar == null) {
            return false;
        }
        return nVar.isCanceled();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z4;
        if (!this.f41080c && this.f41082e == null) {
            z4 = isCancelled();
        }
        return z4;
    }

    @Override // com.android.volley.q.a
    public synchronized void onErrorResponse(VolleyError volleyError) {
        this.f41082e = volleyError;
        notifyAll();
    }

    @Override // com.android.volley.q.b
    public synchronized void onResponse(T t4) {
        this.f41080c = true;
        this.f41081d = t4;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public T get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return b(Long.valueOf(TimeUnit.MILLISECONDS.convert(j4, timeUnit)));
    }
}
