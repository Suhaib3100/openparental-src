package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.x0;
import java.lang.reflect.Method;

/* compiled from: ProcessCompat.java */
/* loaded from: classes3.dex */
public final class c0 {

    /* compiled from: ProcessCompat.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f26500a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private static Method f26501b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f26502c;

        private a() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        static boolean a(int i4) {
            try {
                synchronized (f26500a) {
                    try {
                        if (!f26502c) {
                            f26502c = true;
                            f26501b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } finally {
                    }
                }
                Method method = f26501b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i4));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return true;
        }
    }

    /* compiled from: ProcessCompat.java */
    @x0(24)
    static class b {
        private b() {
        }

        static boolean a(int i4) {
            return Process.isApplicationUid(i4);
        }
    }

    private c0() {
    }

    public static boolean a(int i4) {
        return Process.isApplicationUid(i4);
    }
}
