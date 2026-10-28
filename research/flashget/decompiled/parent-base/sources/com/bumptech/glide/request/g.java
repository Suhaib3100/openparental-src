package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.material3.z3;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFutureTarget.java */
/* loaded from: classes3.dex */
public class g<R> implements d<R>, h<R> {

    /* renamed from: l, reason: collision with root package name */
    private static final a f44806l = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f44807b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44808c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44809d;

    /* renamed from: e, reason: collision with root package name */
    private final a f44810e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    @b0("this")
    private R f44811f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    @b0("this")
    private e f44812g;

    /* renamed from: h, reason: collision with root package name */
    @b0("this")
    private boolean f44813h;

    /* renamed from: i, reason: collision with root package name */
    @b0("this")
    private boolean f44814i;

    /* renamed from: j, reason: collision with root package name */
    @b0("this")
    private boolean f44815j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    @b0("this")
    private GlideException f44816k;

    /* compiled from: RequestFutureTarget.java */
    @m1
    static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j4) throws InterruptedException {
            obj.wait(j4);
        }
    }

    public g(int i4, int i5) {
        this(i4, i5, true, f44806l);
    }

    private synchronized R d(Long l4) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f44809d && !isDone()) {
                o.a();
            }
            if (this.f44813h) {
                throw new CancellationException();
            }
            if (this.f44815j) {
                throw new ExecutionException(this.f44816k);
            }
            if (this.f44814i) {
                return this.f44811f;
            }
            if (l4 == null) {
                this.f44810e.b(this, 0L);
            } else if (l4.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l4.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f44810e.b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f44815j) {
                throw new ExecutionException(this.f44816k);
            }
            if (this.f44813h) {
                throw new CancellationException();
            }
            if (!this.f44814i) {
                throw new TimeoutException();
            }
            return this.f44811f;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public void a(@o0 com.bumptech.glide.request.target.o oVar) {
    }

    @Override // com.bumptech.glide.request.h
    public synchronized boolean b(@q0 GlideException glideException, Object obj, @o0 p<R> pVar, boolean z4) {
        this.f44815j = true;
        this.f44816k = glideException;
        this.f44810e.a(this);
        return false;
    }

    @Override // com.bumptech.glide.request.h
    public synchronized boolean c(@o0 R r4, @o0 Object obj, p<R> pVar, @o0 com.bumptech.glide.load.a aVar, boolean z4) {
        this.f44814i = true;
        this.f44811f = r4;
        this.f44810e.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f44813h = true;
                this.f44810e.a(this);
                e eVar = null;
                if (z4) {
                    e eVar2 = this.f44812g;
                    this.f44812g = null;
                    eVar = eVar2;
                }
                if (eVar != null) {
                    eVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public void g(@q0 Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return d(null);
        } catch (TimeoutException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public synchronized e h() {
        return this.f44812g;
    }

    @Override // com.bumptech.glide.request.target.p
    public void i(@q0 Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f44813h;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z4;
        if (!this.f44813h && !this.f44814i) {
            z4 = this.f44815j;
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void j(@o0 R r4, @q0 com.bumptech.glide.request.transition.f<? super R> fVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void l(@q0 e eVar) {
        this.f44812g = eVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void m(@q0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@o0 com.bumptech.glide.request.target.o oVar) {
        oVar.d(this.f44807b, this.f44808c);
    }

    public String toString() {
        e eVar;
        String s4;
        String a5 = android.support.v4.media.c.a(new StringBuilder(), super.toString(), ProtectedSandApp.s("\u0a54"));
        synchronized (this) {
            try {
                eVar = null;
                if (this.f44813h) {
                    s4 = ProtectedSandApp.s("\u0a55");
                } else if (this.f44815j) {
                    s4 = ProtectedSandApp.s("\u0a56");
                } else if (this.f44814i) {
                    s4 = ProtectedSandApp.s("\u0a57");
                } else {
                    s4 = ProtectedSandApp.s("\u0a58");
                    eVar = this.f44812g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eVar == null) {
            return z3.a(a5, s4, ProtectedSandApp.s("ਜ਼"));
        }
        return a5 + s4 + ProtectedSandApp.s("ਖ਼") + eVar + ProtectedSandApp.s("ਗ਼");
    }

    g(int i4, int i5, boolean z4, a aVar) {
        this.f44807b = i4;
        this.f44808c = i5;
        this.f44809d = z4;
        this.f44810e = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j4, @o0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return d(Long.valueOf(timeUnit.toMillis(j4)));
    }
}
