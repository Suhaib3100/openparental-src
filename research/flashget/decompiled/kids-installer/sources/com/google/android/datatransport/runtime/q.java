package com.google.android.datatransport.runtime;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes2.dex */
class q implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final Executor f12554o;

    /* compiled from: SafeLoggingExecutor.java */
    static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final Runnable f12555o;

        a(Runnable runnable) {
            this.f12555o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12555o.run();
            } catch (Exception e6) {
                j1.a.f(ProtectedSandApp.s("ऺ"), ProtectedSandApp.s("ऻ"), e6);
            }
        }
    }

    q(Executor executor) {
        this.f12554o = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12554o.execute(new a(runnable));
    }
}
