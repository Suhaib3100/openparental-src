package com.google.firebase.crashlytics.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes6.dex */
class g0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f58703a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.k f58704b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f58705c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f58706d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f58707e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    interface a {
        void a(com.google.firebase.crashlytics.internal.settings.k kVar, Thread thread, Throwable th);
    }

    public g0(a aVar, com.google.firebase.crashlytics.internal.settings.k kVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.a aVar2) {
        this.f58703a = aVar;
        this.f58704b = kVar;
        this.f58705c = uncaughtExceptionHandler;
        this.f58706d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ﰓ"));
            return false;
        }
        if (th == null) {
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ﰔ"));
            return false;
        }
        if (!this.f58706d.b()) {
            return true;
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﰕ"));
        return false;
    }

    boolean a() {
        return this.f58707e.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        com.google.firebase.crashlytics.internal.g.f().b(r0);
        java.lang.System.exit(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r7.f58705c == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r7.f58705c != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        com.google.firebase.crashlytics.internal.g.f().b(r1);
        r7.f58705c.uncaughtException(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        r7.f58707e.set(false);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ﰖ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r1 = "ﰗ"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f58707e
            r3 = 1
            r2.set(r3)
            r2 = 0
            boolean r4 = r7.b(r8, r9)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            if (r4 == 0) goto L25
            com.google.firebase.crashlytics.internal.common.g0$a r4 = r7.f58703a     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            com.google.firebase.crashlytics.internal.settings.k r5 = r7.f58704b     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r4.a(r5, r8, r9)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            goto L32
        L21:
            r4 = move-exception
            goto L66
        L23:
            r4 = move-exception
            goto L53
        L25:
            com.google.firebase.crashlytics.internal.g r4 = com.google.firebase.crashlytics.internal.g.f()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            java.lang.String r5 = "ﰘ"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r4.b(r5)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
        L32:
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f58705c
            if (r4 == 0) goto L43
        L36:
            com.google.firebase.crashlytics.internal.g r0 = com.google.firebase.crashlytics.internal.g.f()
            r0.b(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f58705c
            r0.uncaughtException(r8, r9)
            goto L4d
        L43:
            com.google.firebase.crashlytics.internal.g r8 = com.google.firebase.crashlytics.internal.g.f()
            r8.b(r0)
            java.lang.System.exit(r3)
        L4d:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f58707e
            r8.set(r2)
            goto L65
        L53:
            com.google.firebase.crashlytics.internal.g r5 = com.google.firebase.crashlytics.internal.g.f()     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "ﰙ"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L21
            r5.e(r6, r4)     // Catch: java.lang.Throwable -> L21
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f58705c
            if (r4 == 0) goto L43
            goto L36
        L65:
            return
        L66:
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.f58705c
            if (r5 == 0) goto L77
            com.google.firebase.crashlytics.internal.g r0 = com.google.firebase.crashlytics.internal.g.f()
            r0.b(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f58705c
            r0.uncaughtException(r8, r9)
            goto L81
        L77:
            com.google.firebase.crashlytics.internal.g r8 = com.google.firebase.crashlytics.internal.g.f()
            r8.b(r0)
            java.lang.System.exit(r3)
        L81:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f58707e
            r8.set(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.g0.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
