package com.tencent.mmkv;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes7.dex */
class MMKVProcessUtil {
    private static String currentProcessName = "";

    MMKVProcessUtil() {
    }

    public static String getCurrentProcessName(@o0 Context context) {
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        String currentProcessNameByApplication = getCurrentProcessNameByApplication();
        currentProcessName = currentProcessNameByApplication;
        if (!TextUtils.isEmpty(currentProcessNameByApplication)) {
            return currentProcessName;
        }
        String currentProcessNameByActivityThread = getCurrentProcessNameByActivityThread();
        currentProcessName = currentProcessNameByActivityThread;
        if (!TextUtils.isEmpty(currentProcessNameByActivityThread)) {
            return currentProcessName;
        }
        String currentProcessNameByActivityManager = getCurrentProcessNameByActivityManager(context);
        currentProcessName = currentProcessNameByActivityManager;
        return currentProcessNameByActivityManager;
    }

    private static String getCurrentProcessNameByActivityManager(@o0 Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ProtectedSandApp.s("墭\u0001"));
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    @o0
    private static String getCurrentProcessNameByActivityThread() {
        try {
            Method declaredMethod = Class.forName(ProtectedSandApp.s("墮\u0001")).getDeclaredMethod(ProtectedSandApp.s("墯\u0001"), null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            return invoke instanceof String ? (String) invoke : "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @o0
    private static String getCurrentProcessNameByApplication() {
        String processName;
        if (Build.VERSION.SDK_INT < 28) {
            return "";
        }
        processName = Application.getProcessName();
        return processName;
    }
}
