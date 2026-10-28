package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes2.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17354a = ProtectedSandApp.s("ᢧ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f17355b = ProtectedSandApp.s("ᢨ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f17356c = ProtectedSandApp.s("ᢩ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f17357d = ProtectedSandApp.s("ᢪ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f17358e = ProtectedSandApp.s("\u18ab");

    /* renamed from: f, reason: collision with root package name */
    private static final String f17359f = ProtectedSandApp.s("\u18ac");

    /* renamed from: g, reason: collision with root package name */
    static final String f17360g = ProtectedSandApp.s("\u18ad");

    /* renamed from: h, reason: collision with root package name */
    static final String f17361h = ProtectedSandApp.s("\u18ae");

    private o() {
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(ProtectedSandApp.s("ᢟ")));
    }

    static Executor c() {
        return a(ProtectedSandApp.s("ᢠ"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService d() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(ProtectedSandApp.s("ᢡ")));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService e() {
        return com.google.firebase.messaging.threads.b.a().i(new NamedThreadFactory(ProtectedSandApp.s("ᢢ")), com.google.firebase.messaging.threads.c.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(ProtectedSandApp.s("ᢣ")));
    }

    static Executor g() {
        return a(ProtectedSandApp.s("ᢤ"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService h() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(ProtectedSandApp.s("ᢥ")));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService i() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(ProtectedSandApp.s("ᢦ")));
    }
}
