package com.google.firebase.components;

/* compiled from: Preconditions.java */
/* loaded from: classes6.dex */
public final class a0 {
    public static void a(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    @f9.a
    public static <T> T b(T t4) {
        t4.getClass();
        return t4;
    }

    @f9.a
    public static <T> T c(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z4, String str) {
        if (!z4) {
            throw new IllegalStateException(str);
        }
    }
}
