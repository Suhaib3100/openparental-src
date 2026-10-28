package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* compiled from: WakeLockHolder.java */
/* loaded from: classes2.dex */
final class h1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17301a = ProtectedSandApp.s("\u181a");

    /* renamed from: b, reason: collision with root package name */
    static final long f17302b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f17303c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("WakeLockHolder.syncObject")
    private static WakeLock f17304d;

    h1() {
    }

    @x1.s(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void b(Intent intent, long j5) {
        synchronized (f17303c) {
            if (f17304d != null) {
                j(intent, true);
                f17304d.acquire(j5);
            }
        }
    }

    @androidx.annotation.b0("WakeLockHolder.syncObject")
    private static void c(Context context) {
        if (f17304d == null) {
            WakeLock wakeLock = new WakeLock(context, 1, ProtectedSandApp.s("\u181b"));
            f17304d = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@androidx.annotation.o0 Intent intent) {
        synchronized (f17303c) {
            if (f17304d != null && f(intent)) {
                j(intent, false);
                f17304d.release();
            }
        }
    }

    @x1.s(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void e(Context context) {
        synchronized (f17303c) {
            c(context);
        }
    }

    @androidx.annotation.m1
    static boolean f(@androidx.annotation.o0 Intent intent) {
        return intent.getBooleanExtra(ProtectedSandApp.s("\u181c"), false);
    }

    @x1.s(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void h() {
        synchronized (f17303c) {
            f17304d = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    static void i(Context context, m1 m1Var, final Intent intent) {
        synchronized (f17303c) {
            c(context);
            boolean f6 = f(intent);
            j(intent, true);
            if (!f6) {
                f17304d.acquire(f17302b);
            }
            m1Var.c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.g1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    h1.d(intent);
                }
            });
        }
    }

    private static void j(@androidx.annotation.o0 Intent intent, boolean z5) {
        intent.putExtra(ProtectedSandApp.s("\u181d"), z5);
    }

    static ComponentName k(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Intent intent) {
        synchronized (f17303c) {
            c(context);
            boolean f6 = f(intent);
            j(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!f6) {
                f17304d.acquire(f17302b);
            }
            return startService;
        }
    }
}
