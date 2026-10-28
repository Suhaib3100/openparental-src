package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: FirebaseExecutors.java */
/* loaded from: classes6.dex */
public class z {

    /* compiled from: FirebaseExecutors.java */
    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private z() {
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor, int i4) {
        return new b0(executor, i4);
    }

    public static ExecutorService c(ExecutorService executorService, int i4) {
        return new e0(executorService, i4);
    }

    public static ScheduledExecutorService d(ExecutorService executorService, int i4) {
        return new o(new e0(executorService, i4), ExecutorsRegistrar.f58494d.get());
    }

    public static f0 e(Executor executor) {
        return new g0(false, executor);
    }

    public static h0 f(ExecutorService executorService) {
        return new k0(false, executorService);
    }

    public static l0 g(ScheduledExecutorService scheduledExecutorService) {
        return new m0(f(scheduledExecutorService), ExecutorsRegistrar.f58494d.get());
    }

    public static Executor h(Executor executor) {
        return new n0(executor);
    }
}
