package dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Preconditions.java */
/* loaded from: classes7.dex */
public final class s {
    private s() {
    }

    public static <T> void a(T t4, Class<T> cls) {
        if (t4 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + ProtectedSandApp.s("彺\u0001"));
    }

    public static <T> T b(T t4) {
        t4.getClass();
        return t4;
    }

    public static <T> T c(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    public static <T> T d(T t4, String str, Object obj) {
        if (t4 != null) {
            return t4;
        }
        String s4 = ProtectedSandApp.s("彻\u0001");
        if (!str.contains(s4)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("彽\u0001"));
        }
        if (str.indexOf(s4) == str.lastIndexOf(s4)) {
            throw new NullPointerException(str.replace(s4, obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("彼\u0001"));
    }

    public static <T> T e(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(ProtectedSandApp.s("彾\u0001"));
    }

    public static <T> T f(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(ProtectedSandApp.s("彿\u0001"));
    }
}
