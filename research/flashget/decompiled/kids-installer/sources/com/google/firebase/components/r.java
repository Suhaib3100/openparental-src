package com.google.firebase.components;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Dependency.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final b0<?> f15395a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15396b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15397c;

    private r(Class<?> cls, int i5, int i6) {
        this((b0<?>) b0.b(cls), i5, i6);
    }

    public static r a(b0<?> b0Var) {
        return new r(b0Var, 0, 2);
    }

    public static r b(Class<?> cls) {
        return new r(cls, 0, 2);
    }

    private static String c(int i5) {
        if (i5 == 0) {
            return ProtectedSandApp.s("Ꭳ");
        }
        if (i5 == 1) {
            return ProtectedSandApp.s("Ꭲ");
        }
        if (i5 == 2) {
            return ProtectedSandApp.s("Ꭰ");
        }
        throw new AssertionError(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("Ꭱ"), i5));
    }

    @Deprecated
    public static r i(Class<?> cls) {
        return new r(cls, 0, 0);
    }

    public static r j(b0<?> b0Var) {
        return new r(b0Var, 0, 1);
    }

    public static r k(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r l(b0<?> b0Var) {
        return new r(b0Var, 1, 0);
    }

    public static r m(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r n(b0<?> b0Var) {
        return new r(b0Var, 1, 1);
    }

    public static r o(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r p(b0<?> b0Var) {
        return new r(b0Var, 2, 0);
    }

    public static r q(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public static r r(b0<?> b0Var) {
        return new r(b0Var, 2, 1);
    }

    public static r s(Class<?> cls) {
        return new r(cls, 2, 1);
    }

    public b0<?> d() {
        return this.f15395a;
    }

    public boolean e() {
        return this.f15397c == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f15395a.equals(rVar.f15395a) && this.f15396b == rVar.f15396b && this.f15397c == rVar.f15397c;
    }

    public boolean f() {
        return this.f15397c == 0;
    }

    public boolean g() {
        return this.f15396b == 1;
    }

    public boolean h() {
        return this.f15396b == 2;
    }

    public int hashCode() {
        return ((((this.f15395a.hashCode() ^ 1000003) * 1000003) ^ this.f15396b) * 1000003) ^ this.f15397c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ꭴ"));
        sb.append(this.f15395a);
        sb.append(ProtectedSandApp.s("Ꭵ"));
        int i5 = this.f15396b;
        sb.append(i5 == 1 ? ProtectedSandApp.s("Ꭶ") : i5 == 0 ? ProtectedSandApp.s("Ꭷ") : ProtectedSandApp.s("Ꭸ"));
        sb.append(ProtectedSandApp.s("Ꭹ"));
        return androidx.concurrent.futures.a.a(sb, c(this.f15397c), ProtectedSandApp.s("Ꭺ"));
    }

    private r(b0<?> b0Var, int i5, int i6) {
        this.f15395a = (b0) a0.c(b0Var, ProtectedSandApp.s("\u139f"));
        this.f15396b = i5;
        this.f15397c = i6;
    }
}
