package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
class p<V> extends androidx.concurrent.futures.c<V> implements ScheduledFuture<V> {

    /* renamed from: w, reason: collision with root package name */
    private final ScheduledFuture<?> f15493w;

    /* compiled from: DelegatingScheduledFuture.java */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.B(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v5) {
            p.this.A(v5);
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    interface b<T> {
        void a(Throwable th);

        void set(T t5);
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f15493w = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f15493w.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f15493w.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.c
    protected void j() {
        this.f15493w.cancel(E());
    }
}
