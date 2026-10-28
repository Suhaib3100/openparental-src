package com.google.firebase.crashlytics.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes2.dex */
class x implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f15754a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.j f15755b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f15756c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f15757d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f15758e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    interface a {
        void a(com.google.firebase.crashlytics.internal.settings.j jVar, Thread thread, Throwable th);
    }

    public x(a aVar, com.google.firebase.crashlytics.internal.settings.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.a aVar2) {
        this.f15754a = aVar;
        this.f15755b = jVar;
        this.f15756c = uncaughtExceptionHandler;
        this.f15757d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ᒟ"));
            return false;
        }
        if (th == null) {
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ᒠ"));
            return false;
        }
        if (!this.f15757d.b()) {
            return true;
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᒡ"));
        return false;
    }

    boolean a() {
        return this.f15758e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String s5 = ProtectedSandApp.s("ᒢ");
        this.f15758e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f15754a.a(this.f15755b, thread, th);
                } else {
                    com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᒣ"));
                }
            } catch (Exception e6) {
                com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᒤ"), e6);
            }
        } finally {
            com.google.firebase.crashlytics.internal.g.f().b(s5);
            this.f15756c.uncaughtException(thread, th);
            this.f15758e.set(false);
        }
    }
}
