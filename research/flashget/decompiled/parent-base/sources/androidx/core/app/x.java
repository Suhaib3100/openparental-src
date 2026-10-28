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
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f25938a = "NavUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final String f25939b = "android.support.PARENT_ACTIVITY";

    private x() {
    }

    @androidx.annotation.q0
    public static Intent a(@androidx.annotation.o0 Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String d5 = d(activity);
        if (d5 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d5);
        try {
            return e(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @androidx.annotation.q0
    public static Intent b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e4 = e(context, componentName);
        if (e4 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e4);
        return e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @androidx.annotation.q0
    public static Intent c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Class<?> cls) throws PackageManager.NameNotFoundException {
        String e4 = e(context, new ComponentName(context, cls));
        if (e4 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e4);
        return e(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @androidx.annotation.q0
    public static String d(@androidx.annotation.o0 Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IllegalArgumentException(e4);
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
        Intent a5 = a(activity);
        if (a5 != null) {
            activity.navigateUpTo(a5);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    @androidx.annotation.w0(expression = "sourceActivity.navigateUpTo(upIntent)")
    @Deprecated
    public static void g(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 Intent intent) {
        activity.navigateUpTo(intent);
    }

    @androidx.annotation.w0(expression = "sourceActivity.shouldUpRecreateTask(targetIntent)")
    @Deprecated
    public static boolean h(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
