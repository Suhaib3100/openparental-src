package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: FcmBroadcastProcessor.java */
@KeepForSdk
/* loaded from: classes6.dex */
public class n {

    /* renamed from: c, reason: collision with root package name */
    private static final String f60227c = ProtectedSandApp.s("ˀ\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final String f60228d = ProtectedSandApp.s("ˁ\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final Object f60229e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private static s1 f60230f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f60231a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f60232b;

    public n(Context context) {
        this.f60231a = context;
        this.f60232b = new androidx.credentials.k();
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer d(Task task) {
        return 403;
    }

    private static Task<Integer> e(Context context, Intent intent, boolean z4) {
        Log.isLoggable(ProtectedSandApp.s("˂\u0001"), 3);
        s1 f4 = f(context, ProtectedSandApp.s("˃\u0001"));
        if (!z4) {
            return f4.d(intent).continueWith(new androidx.credentials.k(), new m());
        }
        if (c1.b().e(context)) {
            n1.i(context, f4, intent);
        } else {
            f4.d(intent);
        }
        return Tasks.forResult(-1);
    }

    private static s1 f(Context context, String str) {
        s1 s1Var;
        synchronized (f60229e) {
            try {
                if (f60230f == null) {
                    f60230f = new s1(context, str);
                }
                s1Var = f60230f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s1Var;
    }

    private static /* synthetic */ Integer g(Task task) throws Exception {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) throws Exception {
        return Integer.valueOf(c1.b().h(context, intent));
    }

    private static /* synthetic */ Integer i(Task task) throws Exception {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task j(Context context, Intent intent, boolean z4, Task task) throws Exception {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z4).continueWith(new androidx.credentials.k(), new j()) : task;
    }

    @androidx.annotation.m1
    public static void l() {
        synchronized (f60229e) {
            f60230f = null;
        }
    }

    @androidx.annotation.m1
    public static void m(s1 s1Var) {
        synchronized (f60229e) {
            f60230f = s1Var;
        }
    }

    @KeepForSdk
    public Task<Integer> k(Intent intent) {
        String s4 = ProtectedSandApp.s("ˁ\u0001");
        String stringExtra = intent.getStringExtra(s4);
        if (stringExtra != null) {
            intent.putExtra(ProtectedSandApp.s("ˀ\u0001"), Base64.decode(stringExtra, 0));
            intent.removeExtra(s4);
        }
        return n(this.f60231a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> n(final Context context, final Intent intent) {
        boolean z4 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z5 = (intent.getFlags() & ClientDefaults.MAX_MSG_SIZE) != 0;
        return (!z4 || z5) ? Tasks.call(this.f60232b, new Callable() { // from class: com.google.firebase.messaging.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h4;
                h4 = n.h(context, intent);
                return h4;
            }
        }).continueWithTask(this.f60232b, new Continuation() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task j4;
                j4 = n.j(context, intent, z5, task);
                return j4;
            }
        }) : e(context, intent, z5);
    }

    public n(Context context, ExecutorService executorService) {
        this.f60231a = context;
        this.f60232b = executorService;
    }
}
