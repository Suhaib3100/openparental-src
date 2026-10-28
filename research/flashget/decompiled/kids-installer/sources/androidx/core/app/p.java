package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat.java */
/* loaded from: classes.dex */
public final class p {

    /* compiled from: BundleCompat.java */
    @androidx.annotation.x0(18)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @androidx.annotation.u
        static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* compiled from: BundleCompat.java */
    @SuppressLint({"BanUncheckedReflection"})
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f4146a = "BundleCompatBaseImpl";

        /* renamed from: b, reason: collision with root package name */
        private static Method f4147b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f4148c;

        /* renamed from: d, reason: collision with root package name */
        private static Method f4149d;

        /* renamed from: e, reason: collision with root package name */
        private static boolean f4150e;

        private b() {
        }

        public static IBinder a(Bundle bundle, String str) {
            if (!f4148c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f4147b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f4148c = true;
            }
            Method method2 = f4147b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f4147b = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f4150e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f4149d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f4150e = true;
            }
            Method method2 = f4149d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f4149d = null;
                }
            }
        }
    }

    private p() {
    }

    @androidx.annotation.q0
    public static IBinder a(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str) {
        return a.a(bundle, str);
    }

    public static void b(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.q0 IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
