package org.mp4parser.aspectj.runtime.internal;

import org.mp4parser.aspectj.runtime.internal.cflowstack.g;

/* compiled from: CFlowCounter.java */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static org.mp4parser.aspectj.runtime.internal.cflowstack.d f87715b;

    /* renamed from: a, reason: collision with root package name */
    private org.mp4parser.aspectj.runtime.internal.cflowstack.a f87716a = f87715b.a();

    static {
        h();
    }

    private static String b(String str, String str2) {
        try {
            return System.getProperty(str, str2);
        } catch (SecurityException unused) {
            return str2;
        }
    }

    private static org.mp4parser.aspectj.runtime.internal.cflowstack.d c() {
        return new org.mp4parser.aspectj.runtime.internal.cflowstack.f();
    }

    private static org.mp4parser.aspectj.runtime.internal.cflowstack.d d() {
        return new g();
    }

    public static String e() {
        return f87715b.getClass().getName();
    }

    private static void h() {
        String str;
        try {
            str = System.getProperty("aspectj.runtime.cflowstack.usethreadlocal", "unspecified");
        } catch (SecurityException unused) {
            str = "unspecified";
        }
        if (!str.equals("unspecified") ? !(str.equals("yes") || str.equals("true")) : System.getProperty("java.class.version", "0.0").compareTo("46.0") < 0) {
            f87715b = new org.mp4parser.aspectj.runtime.internal.cflowstack.f();
        } else {
            f87715b = new g();
        }
    }

    public void a() {
        this.f87716a.a();
        if (this.f87716a.d()) {
            return;
        }
        this.f87716a.b();
    }

    public void f() {
        this.f87716a.c();
    }

    public boolean g() {
        return this.f87716a.d();
    }
}
