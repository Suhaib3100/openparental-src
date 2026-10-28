package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: AppLaunchChecker.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f25756a = "android.support.AppLaunchChecker";

    /* renamed from: b, reason: collision with root package name */
    private static final String f25757b = "startedFromLauncher";

    @Deprecated
    public i() {
    }

    public static boolean a(@androidx.annotation.o0 Context context) {
        return context.getSharedPreferences("android.support.AppLaunchChecker", 0).getBoolean("startedFromLauncher", false);
    }

    public static void b(@androidx.annotation.o0 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("android.support.AppLaunchChecker", 0);
        if (sharedPreferences.getBoolean("startedFromLauncher", false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory("android.intent.category.LEANBACK_LAUNCHER")) {
            sharedPreferences.edit().putBoolean("startedFromLauncher", true).apply();
        }
    }
}
