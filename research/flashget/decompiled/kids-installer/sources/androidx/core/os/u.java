package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.x0;
import java.lang.reflect.Method;

/* compiled from: ProcessCompat.java */
/* loaded from: classes.dex */
public final class u {

    /* compiled from: ProcessCompat.java */
    @x0(16)
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f4990a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private static Method f4991b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f4992c;

        private a() {
        }

        @SuppressLint({"PrivateApi"})
        static boolean a(int i5) {
            try {
                synchronized (f4990a) {
                    if (!f4992c) {
                        f4992c = true;
                        f4991b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f4991b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i5));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            return true;
        }
    }

    /* compiled from: ProcessCompat.java */
    @x0(17)
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f4993a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private static Method f4994b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f4995c;

        private b() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        static boolean a(int i5) {
            try {
                synchronized (f4993a) {
                    if (!f4995c) {
                        f4995c = true;
                        f4994b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f4994b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i5));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            return true;
        }
    }

    /* compiled from: ProcessCompat.java */
    @x0(24)
    static class c {
        private c() {
        }

        static boolean a(int i5) {
            return Process.isApplicationUid(i5);
        }
    }

    private u() {
    }

    public static boolean a(int i5) {
        return Process.isApplicationUid(i5);
    }
}
