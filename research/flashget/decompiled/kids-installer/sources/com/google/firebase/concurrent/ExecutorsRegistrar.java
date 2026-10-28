package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.firebase.components.u<ScheduledExecutorService> f15414a = new com.google.firebase.components.u<>(new o2.b() { // from class: com.google.firebase.concurrent.v
        @Override // o2.b
        public final Object get() {
            ScheduledExecutorService p5;
            p5 = ExecutorsRegistrar.p();
            return p5;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final com.google.firebase.components.u<ScheduledExecutorService> f15415b = new com.google.firebase.components.u<>(new o2.b() { // from class: com.google.firebase.concurrent.w
        @Override // o2.b
        public final Object get() {
            ScheduledExecutorService q5;
            q5 = ExecutorsRegistrar.q();
            return q5;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final com.google.firebase.components.u<ScheduledExecutorService> f15416c = new com.google.firebase.components.u<>(new o2.b() { // from class: com.google.firebase.concurrent.x
        @Override // o2.b
        public final Object get() {
            ScheduledExecutorService r5;
            r5 = ExecutorsRegistrar.r();
            return r5;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final com.google.firebase.components.u<ScheduledExecutorService> f15417d = new com.google.firebase.components.u<>(new o2.b() { // from class: com.google.firebase.concurrent.y
        @Override // o2.b
        public final Object get() {
            ScheduledExecutorService s5;
            s5 = ExecutorsRegistrar.s();
            return s5;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i5 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i5 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i5) {
        return new b(str, i5, null);
    }

    private static ThreadFactory k(String str, int i5, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i5, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(com.google.firebase.components.d dVar) {
        return f15414a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(com.google.firebase.components.d dVar) {
        return f15416c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(com.google.firebase.components.d dVar) {
        return f15415b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, new b(ProtectedSandApp.s("⟘"), 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b(ProtectedSandApp.s("⟙"), 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j(ProtectedSandApp.s("⟚"), 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j(ProtectedSandApp.s("⟛"), 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f15417d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.c.g(new com.google.firebase.components.b0(b2.a.class, ScheduledExecutorService.class), new com.google.firebase.components.b0(b2.a.class, ExecutorService.class), new com.google.firebase.components.b0(b2.a.class, Executor.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.concurrent.r
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                ScheduledExecutorService l5;
                l5 = ExecutorsRegistrar.l(dVar);
                return l5;
            }
        }).d(), com.google.firebase.components.c.g(new com.google.firebase.components.b0(b2.b.class, ScheduledExecutorService.class), new com.google.firebase.components.b0(b2.b.class, ExecutorService.class), new com.google.firebase.components.b0(b2.b.class, Executor.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.concurrent.s
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                ScheduledExecutorService m5;
                m5 = ExecutorsRegistrar.m(dVar);
                return m5;
            }
        }).d(), com.google.firebase.components.c.g(new com.google.firebase.components.b0(b2.c.class, ScheduledExecutorService.class), new com.google.firebase.components.b0(b2.c.class, ExecutorService.class), new com.google.firebase.components.b0(b2.c.class, Executor.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.concurrent.t
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                ScheduledExecutorService n5;
                n5 = ExecutorsRegistrar.n(dVar);
                return n5;
            }
        }).d(), com.google.firebase.components.c.f(new com.google.firebase.components.b0(b2.d.class, Executor.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.concurrent.u
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                Executor executor;
                executor = o0.INSTANCE;
                return executor;
            }
        }).d());
    }
}
