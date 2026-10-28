package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ExecutionList.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public final class d0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f57745c = Logger.getLogger(d0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    @g9.a("this")
    @zc.a
    private a f57746a;

    /* renamed from: b, reason: collision with root package name */
    @g9.a("this")
    private boolean f57747b;

    /* compiled from: ExecutionList.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f57748a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f57749b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        a f57750c;

        a(Runnable runnable, Executor executor, @zc.a a aVar) {
            this.f57748a = runnable;
            this.f57749b = executor;
            this.f57750c = aVar;
        }
    }

    private static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Logger logger = f57745c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 57, ProtectedSandApp.s("怜"), valueOf, ProtectedSandApp.s("玲"), valueOf2), (Throwable) e4);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        com.google.common.base.l0.F(runnable, ProtectedSandApp.s("瑩"));
        com.google.common.base.l0.F(executor, ProtectedSandApp.s("羚"));
        synchronized (this) {
            try {
                if (this.f57747b) {
                    c(runnable, executor);
                } else {
                    this.f57746a = new a(runnable, executor, this.f57746a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this) {
            try {
                if (this.f57747b) {
                    return;
                }
                this.f57747b = true;
                a aVar = this.f57746a;
                a aVar2 = null;
                this.f57746a = null;
                while (aVar != null) {
                    a aVar3 = aVar.f57750c;
                    aVar.f57750c = aVar2;
                    aVar2 = aVar;
                    aVar = aVar3;
                }
                while (aVar2 != null) {
                    c(aVar2.f57748a, aVar2.f57749b);
                    aVar2 = aVar2.f57750c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
