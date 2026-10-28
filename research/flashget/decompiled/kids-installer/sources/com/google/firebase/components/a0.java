package com.google.firebase.components;

/* compiled from: Preconditions.java */
/* loaded from: classes2.dex */
public final class a0 {
    public static void a(boolean z5, String str) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    @x1.a
    public static <T> T b(T t5) {
        t5.getClass();
        return t5;
    }

    @x1.a
    public static <T> T c(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z5, String str) {
        if (!z5) {
            throw new IllegalStateException(str);
        }
    }
}
