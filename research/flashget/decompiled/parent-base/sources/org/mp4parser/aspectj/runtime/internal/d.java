package org.mp4parser.aspectj.runtime.internal;

import java.util.Stack;
import org.mp4parser.aspectj.lang.NoAspectBoundException;
import org.mp4parser.aspectj.runtime.internal.cflowstack.g;

/* compiled from: CFlowStack.java */
/* loaded from: classes9.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static org.mp4parser.aspectj.runtime.internal.cflowstack.d f87732b;

    /* renamed from: a, reason: collision with root package name */
    private org.mp4parser.aspectj.runtime.internal.cflowstack.c f87733a = f87732b.b();

    static {
        p();
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

    private Stack e() {
        return this.f87733a.a();
    }

    public static String f() {
        return f87732b.getClass().getName();
    }

    private static void p() {
        String str;
        try {
            str = System.getProperty("aspectj.runtime.cflowstack.usethreadlocal", "unspecified");
        } catch (SecurityException unused) {
            str = "unspecified";
        }
        if (!str.equals("unspecified") ? !(str.equals("yes") || str.equals("true")) : System.getProperty("java.class.version", "0.0").compareTo("46.0") < 0) {
            f87732b = new org.mp4parser.aspectj.runtime.internal.cflowstack.f();
        } else {
            f87732b = new g();
        }
    }

    public Object a(int i4) {
        mg.a i5 = i();
        if (i5 == null) {
            return null;
        }
        return i5.a(i4);
    }

    public boolean g() {
        return !this.f87733a.a().isEmpty();
    }

    public Object h() {
        Stack a5 = this.f87733a.a();
        if (a5.isEmpty()) {
            throw new NoAspectBoundException();
        }
        return a5.peek();
    }

    public mg.a i() {
        Stack a5 = this.f87733a.a();
        if (a5.isEmpty()) {
            return null;
        }
        return (mg.a) a5.peek();
    }

    public Object j() {
        mg.a i4 = i();
        if (i4 != null) {
            return i4.b();
        }
        throw new NoAspectBoundException();
    }

    public mg.a k() {
        Stack a5 = this.f87733a.a();
        if (a5.isEmpty()) {
            return null;
        }
        return (mg.a) a5.elementAt(0);
    }

    public void l() {
        Stack a5 = this.f87733a.a();
        a5.pop();
        if (a5.isEmpty()) {
            this.f87733a.b();
        }
    }

    public void m(Object obj) {
        this.f87733a.a().push(obj);
    }

    public void n(Object[] objArr) {
        this.f87733a.a().push(new c(objArr));
    }

    public void o(Object obj) {
        this.f87733a.a().push(new mg.a(obj));
    }
}
