package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFutureTarget.java */
/* loaded from: classes3.dex */
public class g<R> implements d<R>, h<R> {

    /* renamed from: y, reason: collision with root package name */
    private static final a f11992y = new a();

    /* renamed from: o, reason: collision with root package name */
    private final int f11993o;

    /* renamed from: p, reason: collision with root package name */
    private final int f11994p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f11995q;

    /* renamed from: r, reason: collision with root package name */
    private final a f11996r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    @b0("this")
    private R f11997s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    @b0("this")
    private e f11998t;

    /* renamed from: u, reason: collision with root package name */
    @b0("this")
    private boolean f11999u;

    /* renamed from: v, reason: collision with root package name */
    @b0("this")
    private boolean f12000v;

    /* renamed from: w, reason: collision with root package name */
    @b0("this")
    private boolean f12001w;

    /* renamed from: x, reason: collision with root package name */
    @q0
    @b0("this")
    private GlideException f12002x;

    /* compiled from: RequestFutureTarget.java */
    @m1
    /* loaded from: classes.dex */
    static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j5) throws InterruptedException {
            obj.wait(j5);
        }
    }

    public g(int i5, int i6) {
        this(i5, i6, true, f11992y);
    }

    private synchronized R e(Long l5) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f11995q && !isDone()) {
            n.a();
        }
        if (this.f11999u) {
            throw new CancellationException();
        }
        if (this.f12001w) {
            throw new ExecutionException(this.f12002x);
        }
        if (this.f12000v) {
            return this.f11997s;
        }
        if (l5 == null) {
            this.f11996r.b(this, 0L);
        } else if (l5.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l5.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                this.f11996r.b(this, longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f12001w) {
            throw new ExecutionException(this.f12002x);
        }
        if (this.f11999u) {
            throw new CancellationException();
        }
        if (!this.f12000v) {
            throw new TimeoutException();
        }
        return this.f11997s;
    }

    @Override // com.bumptech.glide.request.target.p
    public void a(@o0 o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void b(@o0 R r5, @q0 com.bumptech.glide.request.transition.f<? super R> fVar) {
    }

    @Override // com.bumptech.glide.request.h
    public synchronized boolean c(@q0 GlideException glideException, Object obj, p<R> pVar, boolean z5) {
        this.f12001w = true;
        this.f12002x = glideException;
        this.f11996r.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z5) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f11999u = true;
            this.f11996r.a(this);
            e eVar = null;
            if (z5) {
                e eVar2 = this.f11998t;
                this.f11998t = null;
                eVar = eVar2;
            }
            if (eVar != null) {
                eVar.clear();
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.request.h
    public synchronized boolean d(R r5, Object obj, p<R> pVar, com.bumptech.glide.load.a aVar, boolean z5) {
        this.f12000v = true;
        this.f11997s = r5;
        this.f11996r.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return e(null);
        } catch (TimeoutException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void h(@q0 e eVar) {
        this.f11998t = eVar;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f11999u;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z5;
        if (!this.f11999u && !this.f12000v) {
            z5 = this.f12001w;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void k(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void n(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public synchronized e o() {
        return this.f11998t;
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void q(@o0 o oVar) {
        oVar.e(this.f11993o, this.f11994p);
    }

    g(int i5, int i6, boolean z5, a aVar) {
        this.f11993o = i5;
        this.f11994p = i6;
        this.f11995q = z5;
        this.f11996r = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j5, @o0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return e(Long.valueOf(timeUnit.toMillis(j5)));
    }
}
