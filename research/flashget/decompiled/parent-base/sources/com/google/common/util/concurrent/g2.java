package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.h0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: TimeoutFuture.java */
@b0
@d9.c
/* loaded from: classes6.dex */
final class g2<V> extends h0.a<V> {

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    private ListenableFuture<V> f57861j;

    /* renamed from: k, reason: collision with root package name */
    @zc.a
    private ScheduledFuture<?> f57862k;

    /* compiled from: TimeoutFuture.java */
    private static final class b<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        g2<V> f57863b;

        b(g2<V> g2Var) {
            this.f57863b = g2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<? extends V> listenableFuture;
            String s4 = ProtectedSandApp.s("輪");
            g2<V> g2Var = this.f57863b;
            if (g2Var == null || (listenableFuture = ((g2) g2Var).f57861j) == null) {
                return;
            }
            this.f57863b = null;
            if (listenableFuture.isDone()) {
                g2Var.D(listenableFuture);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = ((g2) g2Var).f57862k;
                ((g2) g2Var).f57862k = null;
                String s5 = ProtectedSandApp.s("律");
                if (scheduledFuture != null) {
                    try {
                        long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            StringBuilder sb = new StringBuilder(s5.length() + 66);
                            sb.append(s4);
                            sb.append(abs);
                            sb.append(ProtectedSandApp.s("慄"));
                            s5 = sb.toString();
                        }
                    } catch (Throwable th) {
                        g2Var.C(new c(s5));
                        throw th;
                    }
                }
                String valueOf = String.valueOf(s5);
                String valueOf2 = String.valueOf(listenableFuture);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
                sb2.append(valueOf);
                sb2.append(ProtectedSandApp.s("栗"));
                sb2.append(valueOf2);
                g2Var.C(new c(sb2.toString()));
            } finally {
                listenableFuture.cancel(true);
            }
        }
    }

    /* compiled from: TimeoutFuture.java */
    private static final class c extends TimeoutException {
        private c(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        c(String str, a aVar) {
            super(str);
        }
    }

    private g2(ListenableFuture<V> listenableFuture) {
        listenableFuture.getClass();
        this.f57861j = listenableFuture;
    }

    static <V> ListenableFuture<V> T(ListenableFuture<V> listenableFuture, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        g2 g2Var = new g2(listenableFuture);
        b bVar = new b(g2Var);
        g2Var.f57862k = scheduledExecutorService.schedule(bVar, j4, timeUnit);
        listenableFuture.n2(bVar, a0.INSTANCE);
        return g2Var;
    }

    @Override // com.google.common.util.concurrent.c
    protected void m() {
        x(this.f57861j);
        ScheduledFuture<?> scheduledFuture = this.f57862k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f57861j = null;
        this.f57862k = null;
    }

    @Override // com.google.common.util.concurrent.c
    @zc.a
    protected String y() {
        ListenableFuture<V> listenableFuture = this.f57861j;
        ScheduledFuture<?> scheduledFuture = this.f57862k;
        if (listenableFuture == null) {
            return null;
        }
        String valueOf = String.valueOf(listenableFuture);
        String a5 = com.google.common.base.h.a(valueOf.length() + 14, ProtectedSandApp.s("率"), valueOf, ProtectedSandApp.s("隆"));
        if (scheduledFuture == null) {
            return a5;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return a5;
        }
        String valueOf2 = String.valueOf(a5);
        StringBuilder sb = new StringBuilder(valueOf2.length() + 43);
        sb.append(valueOf2);
        sb.append(ProtectedSandApp.s("利"));
        sb.append(delay);
        sb.append(ProtectedSandApp.s("吏"));
        return sb.toString();
    }
}
