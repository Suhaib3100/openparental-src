package dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Preconditions.java */
/* loaded from: classes5.dex */
public final class s {
    private s() {
    }

    public static <T> void a(T t5, Class<T> cls) {
        if (t5 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + ProtectedSandApp.s("㛋"));
    }

    public static <T> T b(T t5) {
        t5.getClass();
        return t5;
    }

    public static <T> T c(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }

    public static <T> T d(T t5, String str, Object obj) {
        if (t5 != null) {
            return t5;
        }
        String s5 = ProtectedSandApp.s("㛌");
        if (!str.contains(s5)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㛎"));
        }
        if (str.indexOf(s5) == str.lastIndexOf(s5)) {
            throw new NullPointerException(str.replace(s5, obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㛍"));
    }

    public static <T> T e(T t5) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(ProtectedSandApp.s("㛏"));
    }

    public static <T> T f(T t5) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(ProtectedSandApp.s("㛐"));
    }
}
