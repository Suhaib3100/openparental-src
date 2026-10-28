package com.google.firebase.components;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Dependency.java */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final b0<?> f58472a;

    /* renamed from: b, reason: collision with root package name */
    private final int f58473b;

    /* renamed from: c, reason: collision with root package name */
    private final int f58474c;

    private r(Class<?> cls, int i4, int i5) {
        this((b0<?>) b0.b(cls), i4, i5);
    }

    public static r a(b0<?> b0Var) {
        return new r(b0Var, 0, 2);
    }

    public static r b(Class<?> cls) {
        return new r(cls, 0, 2);
    }

    private static String c(int i4) {
        if (i4 == 0) {
            return ProtectedSandApp.s("ﮆ");
        }
        if (i4 == 1) {
            return ProtectedSandApp.s("ﮅ");
        }
        if (i4 == 2) {
            return ProtectedSandApp.s("ﮃ");
        }
        throw new AssertionError(android.support.v4.media.a.a(ProtectedSandApp.s("ﮄ"), i4));
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
        return this.f58472a;
    }

    public boolean e() {
        return this.f58474c == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f58472a.equals(rVar.f58472a) && this.f58473b == rVar.f58473b && this.f58474c == rVar.f58474c;
    }

    public boolean f() {
        return this.f58474c == 0;
    }

    public boolean g() {
        return this.f58473b == 1;
    }

    public boolean h() {
        return this.f58473b == 2;
    }

    public int hashCode() {
        return ((((this.f58472a.hashCode() ^ 1000003) * 1000003) ^ this.f58473b) * 1000003) ^ this.f58474c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﮇ"));
        sb.append(this.f58472a);
        sb.append(ProtectedSandApp.s("ﮈ"));
        int i4 = this.f58473b;
        sb.append(i4 == 1 ? ProtectedSandApp.s("ﮉ") : i4 == 0 ? ProtectedSandApp.s("ﮊ") : ProtectedSandApp.s("ﮋ"));
        sb.append(ProtectedSandApp.s("ﮌ"));
        return android.support.v4.media.c.a(sb, c(this.f58474c), ProtectedSandApp.s("ﮍ"));
    }

    private r(b0<?> b0Var, int i4, int i5) {
        this.f58472a = (b0) a0.c(b0Var, ProtectedSandApp.s("ﮂ"));
        this.f58473b = i4;
        this.f58474c = i5;
    }
}
