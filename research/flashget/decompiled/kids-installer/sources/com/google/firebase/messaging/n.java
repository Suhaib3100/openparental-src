package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: FcmBroadcastProcessor.java */
@KeepForSdk
/* loaded from: classes2.dex */
public class n {

    /* renamed from: c, reason: collision with root package name */
    private static final String f17348c = ProtectedSandApp.s("ᢙ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f17349d = ProtectedSandApp.s("ᢚ");

    /* renamed from: e, reason: collision with root package name */
    private static final Object f17350e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private static m1 f17351f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17352a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f17353b;

    public n(Context context) {
        this.f17352a = context;
        this.f17353b = new h();
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    private static Task<Integer> e(Context context, Intent intent, boolean z5) {
        Log.isLoggable(ProtectedSandApp.s("ᢛ"), 3);
        m1 f6 = f(context, ProtectedSandApp.s("ᢜ"));
        if (!z5) {
            return f6.c(intent).continueWith(new h(), new Continuation() { // from class: com.google.firebase.messaging.m
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return n.c(task);
                }
            });
        }
        if (w0.b().e(context)) {
            h1.i(context, f6, intent);
        } else {
            f6.c(intent);
        }
        return Tasks.forResult(-1);
    }

    private static m1 f(Context context, String str) {
        m1 m1Var;
        synchronized (f17350e) {
            if (f17351f == null) {
                f17351f = new m1(context, str);
            }
            m1Var = f17351f;
        }
        return m1Var;
    }

    private static /* synthetic */ Integer g(Task task) throws Exception {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) throws Exception {
        return Integer.valueOf(w0.b().h(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(Task task) throws Exception {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task j(Context context, Intent intent, boolean z5, Task task) throws Exception {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z5).continueWith(new h(), new Continuation() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Integer i5;
                i5 = n.i(task2);
                return i5;
            }
        }) : task;
    }

    @androidx.annotation.m1
    public static void l() {
        synchronized (f17350e) {
            f17351f = null;
        }
    }

    @androidx.annotation.m1
    public static void m(m1 m1Var) {
        synchronized (f17350e) {
            f17351f = m1Var;
        }
    }

    @KeepForSdk
    public Task<Integer> k(Intent intent) {
        String s5 = ProtectedSandApp.s("ᢝ");
        String stringExtra = intent.getStringExtra(s5);
        if (stringExtra != null) {
            intent.putExtra(ProtectedSandApp.s("ᢞ"), Base64.decode(stringExtra, 0));
            intent.removeExtra(s5);
        }
        return n(this.f17352a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> n(final Context context, final Intent intent) {
        boolean z5 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z6 = (intent.getFlags() & 268435456) != 0;
        return (!z5 || z6) ? Tasks.call(this.f17353b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h5;
                h5 = n.h(context, intent);
                return h5;
            }
        }).continueWithTask(this.f17353b, new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task j5;
                j5 = n.j(context, intent, z6, task);
                return j5;
            }
        }) : e(context, intent, z6);
    }

    public n(Context context, ExecutorService executorService) {
        this.f17352a = context;
        this.f17353b = executorService;
    }
}
