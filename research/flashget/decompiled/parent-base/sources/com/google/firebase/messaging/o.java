package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FcmExecutors.java */
/* loaded from: classes6.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f60243a = ProtectedSandApp.s("ˍ\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final String f60244b = ProtectedSandApp.s("ˏ\u0001");

    /* renamed from: c, reason: collision with root package name */
    private static final String f60245c = ProtectedSandApp.s("ˉ\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final String f60246d = ProtectedSandApp.s("ˌ\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final String f60247e = ProtectedSandApp.s("ː\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f60248f = ProtectedSandApp.s("ˋ\u0001");

    /* renamed from: g, reason: collision with root package name */
    static final String f60249g = ProtectedSandApp.s("ˊ\u0001");

    /* renamed from: h, reason: collision with root package name */
    static final String f60250h = ProtectedSandApp.s("ˎ\u0001");

    private o() {
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(ProtectedSandApp.s("ˉ\u0001")));
    }

    static Executor c() {
        return a(ProtectedSandApp.s("ˊ\u0001"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService d() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(ProtectedSandApp.s("ˋ\u0001")));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService e() {
        return com.google.firebase.messaging.threads.b.a().i(new NamedThreadFactory(ProtectedSandApp.s("ˌ\u0001")), com.google.firebase.messaging.threads.c.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(ProtectedSandApp.s("ˍ\u0001")));
    }

    static Executor g() {
        return a(ProtectedSandApp.s("ˎ\u0001"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService h() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(ProtectedSandApp.s("ˏ\u0001")));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService i() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(ProtectedSandApp.s("ː\u0001")));
    }
}
