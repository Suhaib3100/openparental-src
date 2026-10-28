package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes6.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.firebase.components.u<ScheduledExecutorService> f58491a = new com.google.firebase.components.u<>((y9.b) new r());

    /* renamed from: b, reason: collision with root package name */
    static final com.google.firebase.components.u<ScheduledExecutorService> f58492b = new com.google.firebase.components.u<>((y9.b) new s());

    /* renamed from: c, reason: collision with root package name */
    static final com.google.firebase.components.u<ScheduledExecutorService> f58493c = new com.google.firebase.components.u<>((y9.b) new t());

    /* renamed from: d, reason: collision with root package name */
    static final com.google.firebase.components.u<ScheduledExecutorService> f58494d = new com.google.firebase.components.u<>((y9.b) new u());

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i4 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i4 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i4) {
        return new b(str, i4, null);
    }

    private static ThreadFactory k(String str, int i4, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i4, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(com.google.firebase.components.d dVar) {
        return f58491a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(com.google.firebase.components.d dVar) {
        return f58493c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(com.google.firebase.components.d dVar) {
        return f58492b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, new b(ProtectedSandApp.s("ﮏ"), 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b(ProtectedSandApp.s("ﮐ"), 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j(ProtectedSandApp.s("ﮑ"), 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j(ProtectedSandApp.s("ﮒ"), 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f58494d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.c.g(new com.google.firebase.components.b0(l9.a.class, ScheduledExecutorService.class), new com.google.firebase.components.b0(l9.a.class, ExecutorService.class), new com.google.firebase.components.b0(l9.a.class, Executor.class)).f(new v()).d(), com.google.firebase.components.c.g(new com.google.firebase.components.b0(l9.b.class, ScheduledExecutorService.class), new com.google.firebase.components.b0(l9.b.class, ExecutorService.class), new com.google.firebase.components.b0(l9.b.class, Executor.class)).f(new w()).d(), com.google.firebase.components.c.g(new com.google.firebase.components.b0(l9.c.class, ScheduledExecutorService.class), new com.google.firebase.components.b0(l9.c.class, ExecutorService.class), new com.google.firebase.components.b0(l9.c.class, Executor.class)).f(new x()).d(), com.google.firebase.components.c.f(new com.google.firebase.components.b0(l9.d.class, Executor.class)).f(new y()).d());
    }
}
