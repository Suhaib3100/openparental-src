package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: FirebaseExecutors.java */
/* loaded from: classes2.dex */
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

    public static Executor b(Executor executor, int i5) {
        return new b0(executor, i5);
    }

    public static ExecutorService c(ExecutorService executorService, int i5) {
        return new e0(executorService, i5);
    }

    public static ScheduledExecutorService d(ExecutorService executorService, int i5) {
        return new o(new e0(executorService, i5), ExecutorsRegistrar.f15417d.get());
    }

    public static f0 e(Executor executor) {
        return new g0(false, executor);
    }

    public static h0 f(ExecutorService executorService) {
        return new k0(false, executorService);
    }

    public static l0 g(ScheduledExecutorService scheduledExecutorService) {
        return new m0(f(scheduledExecutorService), ExecutorsRegistrar.f15417d.get());
    }

    public static Executor h(Executor executor) {
        return new n0(executor);
    }
}
