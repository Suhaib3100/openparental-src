package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ThreadFactoryBuilder.java */
@b0
@d9.c
@f9.a
/* loaded from: classes6.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    @zc.a
    private String f57756a = null;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private Boolean f57757b = null;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private Integer f57758c = null;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private Thread.UncaughtExceptionHandler f57759d = null;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    private ThreadFactory f57760e = null;

    /* compiled from: ThreadFactoryBuilder.java */
    class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f57761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f57762c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicLong f57763d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Boolean f57764e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f57765f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f57766g;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f57761b = threadFactory;
            this.f57762c = str;
            this.f57763d = atomicLong;
            this.f57764e = bool;
            this.f57765f = num;
            this.f57766g = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f57761b.newThread(runnable);
            String str = this.f57762c;
            if (str != null) {
                AtomicLong atomicLong = this.f57763d;
                Objects.requireNonNull(atomicLong);
                newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f57764e;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f57765f;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f57766g;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    static String a(String str, Object[] objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    private static ThreadFactory c(e2 e2Var) {
        String str = e2Var.f57756a;
        Boolean bool = e2Var.f57757b;
        Integer num = e2Var.f57758c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = e2Var.f57759d;
        ThreadFactory threadFactory = e2Var.f57760e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    private static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    @f9.b
    public ThreadFactory b() {
        return c(this);
    }

    public e2 e(boolean z4) {
        this.f57757b = Boolean.valueOf(z4);
        return this;
    }

    public e2 f(String str) {
        d(str, 0);
        this.f57756a = str;
        return this;
    }

    public e2 g(int i4) {
        com.google.common.base.l0.m(i4 >= 1, ProtectedSandApp.s("零"), i4, 1);
        com.google.common.base.l0.m(i4 <= 10, ProtectedSandApp.s("靈"), i4, 10);
        this.f57758c = Integer.valueOf(i4);
        return this;
    }

    public e2 h(ThreadFactory threadFactory) {
        threadFactory.getClass();
        this.f57760e = threadFactory;
        return this;
    }

    public e2 i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        uncaughtExceptionHandler.getClass();
        this.f57759d = uncaughtExceptionHandler;
        return this;
    }
}
