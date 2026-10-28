package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* compiled from: ProxyNotificationInitializer.java */
/* loaded from: classes6.dex */
final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f60332a = ProtectedSandApp.s("̅\u0001");

    private v0() {
    }

    private static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @androidx.annotation.n1
    static void c(Context context) {
        if (x0.c(context)) {
            return;
        }
        f(new androidx.credentials.k(), context, g(context));
    }

    static boolean d(Context context) {
        String notificationDelegate;
        boolean isAtLeastQ = PlatformVersion.isAtLeastQ();
        String s4 = ProtectedSandApp.s("̃\u0001");
        if (!isAtLeastQ) {
            Log.isLoggable(s4, 3);
            return false;
        }
        if (!b(context)) {
            context.getPackageName();
            return false;
        }
        notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
        if (!ProtectedSandApp.s("̄\u0001").equals(notificationDelegate)) {
            return false;
        }
        Log.isLoggable(s4, 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, boolean z4, TaskCompletionSource taskCompletionSource) {
        String notificationDelegate;
        try {
            if (!b(context)) {
                context.getPackageName();
                return;
            }
            x0.f(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            String s4 = ProtectedSandApp.s("̄\u0001");
            if (z4) {
                notificationManager.setNotificationDelegate(s4);
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if (s4.equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    @TargetApi(29)
    static Task<Void> f(Executor executor, final Context context, final boolean z4) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.e(context, z4, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String s4 = ProtectedSandApp.s("̅\u0001");
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(s4)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(s4);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
