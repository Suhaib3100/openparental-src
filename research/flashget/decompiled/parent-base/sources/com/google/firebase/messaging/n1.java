package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* compiled from: WakeLockHolder.java */
/* loaded from: classes6.dex */
final class n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f60239a = ProtectedSandApp.s("ʾ\u0001");

    /* renamed from: b, reason: collision with root package name */
    static final long f60240b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f60241c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("WakeLockHolder.syncObject")
    private static WakeLock f60242d;

    n1() {
    }

    @f9.t(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void b(Intent intent, long j4) {
        synchronized (f60241c) {
            try {
                if (f60242d != null) {
                    j(intent, true);
                    f60242d.acquire(j4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.b0("WakeLockHolder.syncObject")
    private static void c(Context context) {
        if (f60242d == null) {
            WakeLock wakeLock = new WakeLock(context, 1, ProtectedSandApp.s("ʿ\u0001"));
            f60242d = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@androidx.annotation.o0 Intent intent) {
        synchronized (f60241c) {
            try {
                if (f60242d != null && f(intent)) {
                    j(intent, false);
                    f60242d.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @f9.t(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void e(Context context) {
        synchronized (f60241c) {
            c(context);
        }
    }

    @androidx.annotation.m1
    static boolean f(@androidx.annotation.o0 Intent intent) {
        return intent.getBooleanExtra(ProtectedSandApp.s("ʾ\u0001"), false);
    }

    @f9.t(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void h() {
        synchronized (f60241c) {
            f60242d = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    static void i(Context context, s1 s1Var, final Intent intent) {
        synchronized (f60241c) {
            try {
                c(context);
                boolean f4 = f(intent);
                j(intent, true);
                if (!f4) {
                    f60242d.acquire(f60240b);
                }
                s1Var.d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.m1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        n1.d(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void j(@androidx.annotation.o0 Intent intent, boolean z4) {
        intent.putExtra(ProtectedSandApp.s("ʾ\u0001"), z4);
    }

    static ComponentName k(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Intent intent) {
        synchronized (f60241c) {
            try {
                c(context);
                boolean f4 = f(intent);
                j(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!f4) {
                    f60242d.acquire(f60240b);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
