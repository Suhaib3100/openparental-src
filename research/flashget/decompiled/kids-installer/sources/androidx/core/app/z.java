package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: NavUtils.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4512a = "NavUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4513b = "android.support.PARENT_ACTIVITY";

    /* compiled from: NavUtils.java */
    @androidx.annotation.x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @androidx.annotation.u
        static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @androidx.annotation.u
        static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    private z() {
    }

    @androidx.annotation.q0
    public static Intent a(@androidx.annotation.o0 Activity activity) {
        Intent a6 = a.a(activity);
        if (a6 != null) {
            return a6;
        }
        String d6 = d(activity);
        if (d6 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d6);
        try {
            return e(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @androidx.annotation.q0
    public static Intent b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e6 = e(context, componentName);
        if (e6 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e6);
        return e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @androidx.annotation.q0
    public static Intent c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Class<?> cls) throws PackageManager.NameNotFoundException {
        String e6 = e(context, new ComponentName(context, cls));
        if (e6 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e6);
        return e(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @androidx.annotation.q0
    public static String d(@androidx.annotation.o0 Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    @androidx.annotation.q0
    public static String e(@androidx.annotation.o0 Context context, @androidx.annotation.o0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void f(@androidx.annotation.o0 Activity activity) {
        Intent a6 = a(activity);
        if (a6 != null) {
            a.b(activity, a6);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    public static void g(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 Intent intent) {
        a.b(activity, intent);
    }

    public static boolean h(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 Intent intent) {
        return a.c(activity, intent);
    }
}
