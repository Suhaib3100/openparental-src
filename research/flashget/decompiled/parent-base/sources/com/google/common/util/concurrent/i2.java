package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: UncaughtExceptionHandlers.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public final class i2 {

    /* compiled from: UncaughtExceptionHandlers.java */
    @d9.d
    static final class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: b, reason: collision with root package name */
        private static final Logger f57875b = Logger.getLogger(a.class.getName());

        /* renamed from: a, reason: collision with root package name */
        private final Runtime f57876a;

        a(Runtime runtime) {
            this.f57876a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                f57875b.log(Level.SEVERE, String.format(Locale.ROOT, ProtectedSandApp.s("吝"), thread), th);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    private i2() {
    }

    public static Thread.UncaughtExceptionHandler a() {
        return new a(Runtime.getRuntime());
    }
}
