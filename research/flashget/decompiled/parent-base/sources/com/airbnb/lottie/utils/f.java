package com.airbnb.lottie.utils;

import com.airbnb.lottie.q0;

/* compiled from: Logger.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static q0 f39375a = new e();

    public static void a(String str) {
        f39375a.debug(str);
    }

    public static void b(String str, Throwable th) {
        f39375a.d(str, th);
    }

    public static void c(String str, Throwable th) {
        f39375a.b(str, th);
    }

    public static void d(q0 q0Var) {
        f39375a = q0Var;
    }

    public static void e(String str) {
        f39375a.a(str);
    }

    public static void f(String str, Throwable th) {
        f39375a.c(str, th);
    }
}
