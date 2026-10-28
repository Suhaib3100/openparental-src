package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes6.dex */
class p<V> extends androidx.concurrent.futures.b<V> implements ScheduledFuture<V> {

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledFuture<?> f58570j;

    /* compiled from: DelegatingScheduledFuture.java */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.q(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v4) {
            p.this.p(v4);
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    interface b<T> {
        void a(Throwable th);

        void set(T t4);
    }

    /* compiled from: DelegatingScheduledFuture.java */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f58570j = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.b
    protected void b() {
        this.f58570j.cancel(t());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f58570j.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f58570j.compareTo(delayed);
    }
}
