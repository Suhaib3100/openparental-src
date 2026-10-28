package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* compiled from: ProxyNotificationInitializer.java */
/* loaded from: classes2.dex */
final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17368a = ProtectedSandApp.s("ᢳ");

    private q0() {
    }

    private static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @n1
    static void c(Context context) {
        if (r0.b(context)) {
            return;
        }
        f(new h(), context, g(context));
    }

    static boolean d(Context context) {
        String notificationDelegate;
        boolean isAtLeastQ = PlatformVersion.isAtLeastQ();
        String s5 = ProtectedSandApp.s("\u18af");
        if (!isAtLeastQ) {
            Log.isLoggable(s5, 3);
            return false;
        }
        if (!b(context)) {
            context.getPackageName();
            return false;
        }
        notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
        if (!ProtectedSandApp.s("ᢰ").equals(notificationDelegate)) {
            return false;
        }
        Log.isLoggable(s5, 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, boolean z5, TaskCompletionSource taskCompletionSource) {
        String notificationDelegate;
        try {
            if (!b(context)) {
                context.getPackageName();
                return;
            }
            r0.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            String s5 = ProtectedSandApp.s("ᢱ");
            if (z5) {
                notificationManager.setNotificationDelegate(s5);
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if (s5.equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    @TargetApi(29)
    static Task<Void> f(Executor executor, final Context context, final boolean z5) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.p0
            @Override // java.lang.Runnable
            public final void run() {
                q0.e(context, z5, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String s5 = ProtectedSandApp.s("ᢲ");
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(s5)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(s5);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
