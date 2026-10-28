package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.c1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes3.dex */
public class v0<T> {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f39396e = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    private final Set<p0<T>> f39397a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<p0<Throwable>> f39398b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f39399c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.q0
    private volatile t0<T> f39400d;

    /* compiled from: LottieTask.java */
    private class a extends FutureTask<t0<T>> {
        a(Callable<t0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                v0.this.k(get());
            } catch (InterruptedException | ExecutionException e4) {
                v0.this.k(new t0(e4));
            }
        }
    }

    @c1({c1.a.LIBRARY})
    public v0(Callable<t0<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        t0<T> t0Var = this.f39400d;
        if (t0Var == null) {
            return;
        }
        if (t0Var.b() != null) {
            h(t0Var.b());
        } else {
            f(t0Var.a());
        }
    }

    private synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f39398b);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.utils.f.f(ProtectedSandApp.s("˻"), th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p0) it.next()).onResult(th);
        }
    }

    private void g() {
        this.f39399c.post(new Runnable() { // from class: com.airbnb.lottie.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.e();
            }
        });
    }

    private synchronized void h(T t4) {
        Iterator it = new ArrayList(this.f39397a).iterator();
        while (it.hasNext()) {
            ((p0) it.next()).onResult(t4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(@androidx.annotation.q0 t0<T> t0Var) {
        if (this.f39400d != null) {
            throw new IllegalStateException(ProtectedSandApp.s("˼"));
        }
        this.f39400d = t0Var;
        g();
    }

    public synchronized v0<T> c(p0<Throwable> p0Var) {
        try {
            t0<T> t0Var = this.f39400d;
            if (t0Var != null && t0Var.a() != null) {
                p0Var.onResult(t0Var.a());
            }
            this.f39398b.add(p0Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized v0<T> d(p0<T> p0Var) {
        try {
            t0<T> t0Var = this.f39400d;
            if (t0Var != null && t0Var.b() != null) {
                p0Var.onResult(t0Var.b());
            }
            this.f39397a.add(p0Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized v0<T> i(p0<Throwable> p0Var) {
        this.f39398b.remove(p0Var);
        return this;
    }

    public synchronized v0<T> j(p0<T> p0Var) {
        this.f39397a.remove(p0Var);
        return this;
    }

    @c1({c1.a.LIBRARY})
    v0(Callable<t0<T>> callable, boolean z4) {
        this.f39397a = new LinkedHashSet(1);
        this.f39398b = new LinkedHashSet(1);
        this.f39399c = new Handler(Looper.getMainLooper());
        this.f39400d = null;
        if (!z4) {
            f39396e.execute(new a(callable));
            return;
        }
        try {
            k(callable.call());
        } catch (Throwable th) {
            k(new t0<>(th));
        }
    }
}
