package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProcessUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36495a = androidx.work.s.f("ProcessUtils");

    private k() {
    }

    @q0
    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static String a(@o0 Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, k.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            androidx.work.s.c().a(f36495a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static boolean b(@o0 Context context, @o0 androidx.work.b configuration) {
        String a5 = a(context);
        return !TextUtils.isEmpty(configuration.c()) ? TextUtils.equals(a5, configuration.c()) : TextUtils.equals(a5, context.getApplicationInfo().processName);
    }
}
