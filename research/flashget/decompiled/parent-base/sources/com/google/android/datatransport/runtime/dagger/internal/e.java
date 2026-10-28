package com.google.android.datatransport.runtime.dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Preconditions.java */
/* loaded from: classes5.dex */
public final class e {
    private e() {
    }

    public static <T> void a(T t4, Class<T> cls) {
        if (t4 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + ProtectedSandApp.s("엤"));
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
        String s4 = ProtectedSandApp.s("엥");
        if (!str.contains(s4)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("엧"));
        }
        if (str.indexOf(s4) == str.lastIndexOf(s4)) {
            throw new NullPointerException(str.replace(s4, obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("엦"));
    }

    public static <T> T e(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(ProtectedSandApp.s("엨"));
    }

    public static <T> T f(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(ProtectedSandApp.s("엩"));
    }
}
