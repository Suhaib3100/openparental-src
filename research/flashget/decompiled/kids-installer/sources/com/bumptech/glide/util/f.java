package com.bumptech.glide.util;

import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Executors.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f12154a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f12155b = new b();

    /* compiled from: Executors.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            n.x(runnable);
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
        return f12155b;
    }

    public static Executor b() {
        return f12154a;
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
                throw new RuntimeException(ProtectedSandApp.s("ȩ"));
            }
        } catch (InterruptedException e6) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e6);
        }
    }
}
