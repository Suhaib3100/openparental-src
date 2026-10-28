package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* compiled from: AppOpsManagerCompat.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4142a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4143b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4144c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4145d = 3;

    /* compiled from: AppOpsManagerCompat.java */
    @androidx.annotation.x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(AppOpsManager appOpsManager, String str, int i5, String str2) {
            return appOpsManager.noteOp(str, i5, str2);
        }

        @androidx.annotation.u
        static int b(AppOpsManager appOpsManager, String str, int i5, String str2) {
            return appOpsManager.noteOpNoThrow(str, i5, str2);
        }
    }

    /* compiled from: AppOpsManagerCompat.java */
    @androidx.annotation.x0(23)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @androidx.annotation.u
        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @androidx.annotation.u
        static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @androidx.annotation.u
        static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: AppOpsManagerCompat.java */
    @androidx.annotation.x0(29)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static int a(@androidx.annotation.q0 AppOpsManager appOpsManager, @androidx.annotation.o0 String str, int i5, @androidx.annotation.o0 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i5, str2);
        }

        @androidx.annotation.u
        @androidx.annotation.o0
        static String b(@androidx.annotation.o0 Context context) {
            String opPackageName;
            opPackageName = context.getOpPackageName();
            return opPackageName;
        }

        @androidx.annotation.q0
        @androidx.annotation.u
        static AppOpsManager c(@androidx.annotation.o0 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private n() {
    }

    public static int a(@androidx.annotation.o0 Context context, int i5, @androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return e(context, str, str2);
        }
        AppOpsManager c6 = c.c(context);
        int a6 = c.a(c6, str, Binder.getCallingUid(), str2);
        return a6 != 0 ? a6 : c.a(c6, str, i5, c.b(context));
    }

    public static int b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, int i5, @androidx.annotation.o0 String str2) {
        return a.a((AppOpsManager) context.getSystemService("appops"), str, i5, str2);
    }

    public static int c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, int i5, @androidx.annotation.o0 String str2) {
        return a.b((AppOpsManager) context.getSystemService("appops"), str, i5, str2);
    }

    public static int d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        return b.b((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
    }

    public static int e(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        return b.c((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
    }

    @androidx.annotation.q0
    public static String f(@androidx.annotation.o0 String str) {
        return b.d(str);
    }
}
