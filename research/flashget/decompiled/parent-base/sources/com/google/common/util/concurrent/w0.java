package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ImmediateFuture.java */
@b0
@d9.b
/* loaded from: classes6.dex */
class w0<V> implements ListenableFuture<V> {

    /* renamed from: c, reason: collision with root package name */
    static final ListenableFuture<?> f57979c = new w0(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f57980d = Logger.getLogger(w0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    @j1
    private final V f57981b;

    /* compiled from: ImmediateFuture.java */
    static final class a<V> extends c.j<V> {

        /* renamed from: j, reason: collision with root package name */
        static final a<Object> f57982j;

        static {
            f57982j = c.f57673e ? null : new a<>();
        }

        a() {
            cancel(false);
        }
    }

    /* compiled from: ImmediateFuture.java */
    static final class b<V> extends c.j<V> {
        b(Throwable th) {
            C(th);
        }
    }

    w0(@j1 V v4) {
        this.f57981b = v4;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @j1
    public V get() {
        return this.f57981b;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void n2(Runnable runnable, Executor executor) {
        com.google.common.base.l0.F(runnable, ProtectedSandApp.s("僧"));
        com.google.common.base.l0.F(executor, ProtectedSandApp.s("免"));
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Logger logger = f57980d;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 57, ProtectedSandApp.s("勉"), valueOf, ProtectedSandApp.s("勤"), valueOf2), (Throwable) e4);
        }
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f57981b);
        return com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(obj, 27), obj, ProtectedSandApp.s("卑"), valueOf, ProtectedSandApp.s("喝"));
    }

    @Override // java.util.concurrent.Future
    @j1
    public V get(long j4, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }
}
