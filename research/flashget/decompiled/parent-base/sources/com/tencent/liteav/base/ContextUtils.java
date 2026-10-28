package com.tencent.liteav.base;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Process;
import android.preference.PreferenceManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.lang.reflect.Method;

@JNINamespace("base::android")
/* loaded from: classes7.dex */
public class ContextUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = ProtectedSandApp.s("刼\u0001");
    private static Context sApplicationContext;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SharedPreferences f71774a = ContextUtils.fetchAppSharedPreferences();
    }

    public static Activity activityFromContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SharedPreferences fetchAppSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
    }

    public static SharedPreferences getAppSharedPreferences() {
        return a.f71774a;
    }

    public static AssetManager getApplicationAssets() {
        Context applicationContext = getApplicationContext();
        while (applicationContext instanceof ContextWrapper) {
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        return applicationContext.getAssets();
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static void initApplicationContext(Context context) {
        initJavaSideApplicationContext(context);
    }

    public static void initApplicationContextForTests(Context context) {
        initJavaSideApplicationContext(context);
        SharedPreferences unused = a.f71774a = fetchAppSharedPreferences();
    }

    public static void initContextFromNative(String str) {
        try {
            Method method = Class.forName(ProtectedSandApp.s("刽\u0001")).getMethod(ProtectedSandApp.s("刾\u0001"), null);
            method.setAccessible(true);
            Object invoke = method.invoke(null, null);
            Object invoke2 = invoke.getClass().getMethod(ProtectedSandApp.s("刿\u0001"), null).invoke(invoke, null);
            if (invoke2 instanceof Context) {
                initApplicationContext((Context) invoke2);
                setDataDirectorySuffix(str);
            }
        } catch (Exception unused) {
        }
    }

    private static void initJavaSideApplicationContext(Context context) {
        sApplicationContext = context;
    }

    public static boolean isIsolatedProcess() {
        boolean isIsolated;
        isIsolated = Process.isIsolated();
        return isIsolated;
    }

    public static void setDataDirectorySuffix(String str) {
        PathUtils.setPrivateDataDirectorySuffix(str, null);
    }
}
