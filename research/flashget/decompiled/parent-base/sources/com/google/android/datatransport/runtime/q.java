package com.google.android.datatransport.runtime;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes5.dex */
class q implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f52084b;

    /* compiled from: SafeLoggingExecutor.java */
    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f52085b;

        a(Runnable runnable) {
            this.f52085b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f52085b.run();
            } catch (Exception e4) {
                n8.a.f(ProtectedSandApp.s("였"), ProtectedSandApp.s("영"), e4);
            }
        }
    }

    q(Executor executor) {
        this.f52084b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f52084b.execute(new a(runnable));
    }
}
