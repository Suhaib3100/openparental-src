package com.bumptech.glide.util;

import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Executors.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f44961a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f44962b = new b();

    /* compiled from: Executors.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            o.y(runnable);
        }
    }

    /* compiled from: Executors.java */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            runnable.run();
        }
    }

    private f() {
    }

    public static Executor a() {
        return f44962b;
    }

    public static Executor b() {
        return f44961a;
    }

    @m1
    public static void c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException(ProtectedSandApp.s("જ"));
            }
        } catch (InterruptedException e4) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e4);
        }
    }
}
