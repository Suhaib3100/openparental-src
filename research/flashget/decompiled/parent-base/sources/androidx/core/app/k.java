package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* compiled from: AppOpsManagerCompat.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25764a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f25765b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f25766c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f25767d = 3;

    /* compiled from: AppOpsManagerCompat.java */
    @androidx.annotation.x0(23)
    static class a {
        private a() {
        }

        static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: AppOpsManagerCompat.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        static int a(@androidx.annotation.q0 AppOpsManager appOpsManager, @androidx.annotation.o0 String str, int i4, @androidx.annotation.o0 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i4, str2);
        }

        @androidx.annotation.o0
        static String b(@androidx.annotation.o0 Context context) {
            return context.getOpPackageName();
        }

        @androidx.annotation.q0
        static AppOpsManager c(@androidx.annotation.o0 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private k() {
    }

    public static int a(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return e(context, str, str2);
        }
        AppOpsManager c5 = b.c(context);
        int a5 = b.a(c5, str, Binder.getCallingUid(), str2);
        return a5 != 0 ? a5 : b.a(c5, str, i4, b.b(context));
    }

    public static int b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, int i4, @androidx.annotation.o0 String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i4, str2);
    }

    public static int c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, int i4, @androidx.annotation.o0 String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i4, str2);
    }

    public static int d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static int e(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    @androidx.annotation.q0
    public static String f(@androidx.annotation.o0 String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
