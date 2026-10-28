package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Preconditions.java */
@o
@d9.b
/* loaded from: classes6.dex */
public final class l0 {
    private l0() {
    }

    public static void A(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3, @zc.a Object obj4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, obj, obj2, obj3, obj4));
        }
    }

    public static void A0(boolean z4, String str, @zc.a Object obj, long j4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, obj, Long.valueOf(j4)));
        }
    }

    public static void B(boolean z4, String str, @zc.a Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, objArr));
        }
    }

    public static void B0(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, obj, obj2));
        }
    }

    @f9.a
    public static int C(int i4, int i5) {
        return D(i4, i5, ProtectedSandApp.s("\uf303"));
    }

    public static void C0(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, obj, obj2, obj3));
        }
    }

    @f9.a
    public static int D(int i4, int i5, String str) {
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(a(i4, i5, str));
        }
        return i4;
    }

    public static void D0(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3, @zc.a Object obj4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, obj, obj2, obj3, obj4));
        }
    }

    @f9.a
    public static <T> T E(@zc.a T t4) {
        t4.getClass();
        return t4;
    }

    public static void E0(boolean z4, @zc.a String str, @zc.a Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, objArr));
        }
    }

    @f9.a
    public static <T> T F(@zc.a T t4, @zc.a Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @f9.a
    public static <T> T G(@zc.a T t4, String str, char c5) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Character.valueOf(c5)));
    }

    @f9.a
    public static <T> T H(@zc.a T t4, String str, char c5, char c6) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Character.valueOf(c5), Character.valueOf(c6)));
    }

    @f9.a
    public static <T> T I(@zc.a T t4, String str, char c5, int i4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Character.valueOf(c5), Integer.valueOf(i4)));
    }

    @f9.a
    public static <T> T J(@zc.a T t4, String str, char c5, long j4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Character.valueOf(c5), Long.valueOf(j4)));
    }

    @f9.a
    public static <T> T K(@zc.a T t4, String str, char c5, @zc.a Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Character.valueOf(c5), obj));
    }

    @f9.a
    public static <T> T L(@zc.a T t4, String str, int i4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Integer.valueOf(i4)));
    }

    @f9.a
    public static <T> T M(@zc.a T t4, String str, int i4, char c5) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Integer.valueOf(i4), Character.valueOf(c5)));
    }

    @f9.a
    public static <T> T N(@zc.a T t4, String str, int i4, int i5) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    @f9.a
    public static <T> T O(@zc.a T t4, String str, int i4, long j4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Integer.valueOf(i4), Long.valueOf(j4)));
    }

    @f9.a
    public static <T> T P(@zc.a T t4, String str, int i4, @zc.a Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Integer.valueOf(i4), obj));
    }

    @f9.a
    public static <T> T Q(@zc.a T t4, String str, long j4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Long.valueOf(j4)));
    }

    @f9.a
    public static <T> T R(@zc.a T t4, String str, long j4, char c5) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Long.valueOf(j4), Character.valueOf(c5)));
    }

    @f9.a
    public static <T> T S(@zc.a T t4, String str, long j4, int i4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Long.valueOf(j4), Integer.valueOf(i4)));
    }

    @f9.a
    public static <T> T T(@zc.a T t4, String str, long j4, long j5) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Long.valueOf(j4), Long.valueOf(j5)));
    }

    @f9.a
    public static <T> T U(@zc.a T t4, String str, long j4, @zc.a Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, Long.valueOf(j4), obj));
    }

    @f9.a
    public static <T> T V(@zc.a T t4, String str, @zc.a Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, obj));
    }

    @f9.a
    public static <T> T W(@zc.a T t4, String str, @zc.a Object obj, char c5) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, obj, Character.valueOf(c5)));
    }

    @f9.a
    public static <T> T X(@zc.a T t4, String str, @zc.a Object obj, int i4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, obj, Integer.valueOf(i4)));
    }

    @f9.a
    public static <T> T Y(@zc.a T t4, String str, @zc.a Object obj, long j4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, obj, Long.valueOf(j4)));
    }

    @f9.a
    public static <T> T Z(@zc.a T t4, String str, @zc.a Object obj, @zc.a Object obj2) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, obj, obj2));
    }

    private static String a(int i4, int i5, String str) {
        if (i4 < 0) {
            return t0.e(ProtectedSandApp.s("\uf304"), str, Integer.valueOf(i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(26, ProtectedSandApp.s("\uf306"), i5));
        }
        return t0.e(ProtectedSandApp.s("\uf305"), str, Integer.valueOf(i4), Integer.valueOf(i5));
    }

    @f9.a
    public static <T> T a0(@zc.a T t4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, obj, obj2, obj3));
    }

    private static String b(int i4, int i5, String str) {
        if (i4 < 0) {
            return t0.e(ProtectedSandApp.s("\uf304"), str, Integer.valueOf(i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(26, ProtectedSandApp.s("\uf306"), i5));
        }
        return t0.e(ProtectedSandApp.s("\uf307"), str, Integer.valueOf(i4), Integer.valueOf(i5));
    }

    @f9.a
    public static <T> T b0(@zc.a T t4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3, @zc.a Object obj4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, obj, obj2, obj3, obj4));
    }

    private static String c(int i4, int i5, int i6) {
        if (i4 < 0 || i4 > i6) {
            return b(i4, i6, ProtectedSandApp.s("\uf30a"));
        }
        if (i5 < 0 || i5 > i6) {
            return b(i5, i6, ProtectedSandApp.s("\uf309"));
        }
        return t0.e(ProtectedSandApp.s("\uf308"), Integer.valueOf(i5), Integer.valueOf(i4));
    }

    @f9.a
    public static <T> T c0(@zc.a T t4, String str, @zc.a Object... objArr) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(t0.e(str, objArr));
    }

    public static void d(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    @f9.a
    public static int d0(int i4, int i5) {
        return e0(i4, i5, ProtectedSandApp.s("\uf303"));
    }

    public static void e(boolean z4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @f9.a
    public static int e0(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(b(i4, i5, str));
        }
        return i4;
    }

    public static void f(boolean z4, String str, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Character.valueOf(c5)));
        }
    }

    public static void f0(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException(c(i4, i5, i6));
        }
    }

    public static void g(boolean z4, String str, char c5, char c6) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Character.valueOf(c5), Character.valueOf(c6)));
        }
    }

    public static void g0(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z4, String str, char c5, int i4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Character.valueOf(c5), Integer.valueOf(i4)));
        }
    }

    public static void h0(boolean z4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void i(boolean z4, String str, char c5, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Character.valueOf(c5), Long.valueOf(j4)));
        }
    }

    public static void i0(boolean z4, String str, char c5) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Character.valueOf(c5)));
        }
    }

    public static void j(boolean z4, String str, char c5, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Character.valueOf(c5), obj));
        }
    }

    public static void j0(boolean z4, String str, char c5, char c6) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Character.valueOf(c5), Character.valueOf(c6)));
        }
    }

    public static void k(boolean z4, String str, int i4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Integer.valueOf(i4)));
        }
    }

    public static void k0(boolean z4, String str, char c5, int i4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Character.valueOf(c5), Integer.valueOf(i4)));
        }
    }

    public static void l(boolean z4, String str, int i4, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Integer.valueOf(i4), Character.valueOf(c5)));
        }
    }

    public static void l0(boolean z4, String str, char c5, long j4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Character.valueOf(c5), Long.valueOf(j4)));
        }
    }

    public static void m(boolean z4, String str, int i4, int i5) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Integer.valueOf(i4), Integer.valueOf(i5)));
        }
    }

    public static void m0(boolean z4, String str, char c5, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Character.valueOf(c5), obj));
        }
    }

    public static void n(boolean z4, String str, int i4, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Integer.valueOf(i4), Long.valueOf(j4)));
        }
    }

    public static void n0(boolean z4, String str, int i4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Integer.valueOf(i4)));
        }
    }

    public static void o(boolean z4, String str, int i4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Integer.valueOf(i4), obj));
        }
    }

    public static void o0(boolean z4, String str, int i4, char c5) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Integer.valueOf(i4), Character.valueOf(c5)));
        }
    }

    public static void p(boolean z4, String str, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Long.valueOf(j4)));
        }
    }

    public static void p0(boolean z4, String str, int i4, int i5) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Integer.valueOf(i4), Integer.valueOf(i5)));
        }
    }

    public static void q(boolean z4, String str, long j4, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Long.valueOf(j4), Character.valueOf(c5)));
        }
    }

    public static void q0(boolean z4, String str, int i4, long j4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Integer.valueOf(i4), Long.valueOf(j4)));
        }
    }

    public static void r(boolean z4, String str, long j4, int i4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Long.valueOf(j4), Integer.valueOf(i4)));
        }
    }

    public static void r0(boolean z4, String str, int i4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Integer.valueOf(i4), obj));
        }
    }

    public static void s(boolean z4, String str, long j4, long j5) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Long.valueOf(j4), Long.valueOf(j5)));
        }
    }

    public static void s0(boolean z4, String str, long j4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Long.valueOf(j4)));
        }
    }

    public static void t(boolean z4, String str, long j4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, Long.valueOf(j4), obj));
        }
    }

    public static void t0(boolean z4, String str, long j4, char c5) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Long.valueOf(j4), Character.valueOf(c5)));
        }
    }

    public static void u(boolean z4, String str, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, obj));
        }
    }

    public static void u0(boolean z4, String str, long j4, int i4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Long.valueOf(j4), Integer.valueOf(i4)));
        }
    }

    public static void v(boolean z4, String str, @zc.a Object obj, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, obj, Character.valueOf(c5)));
        }
    }

    public static void v0(boolean z4, String str, long j4, long j5) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Long.valueOf(j4), Long.valueOf(j5)));
        }
    }

    public static void w(boolean z4, String str, @zc.a Object obj, int i4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, obj, Integer.valueOf(i4)));
        }
    }

    public static void w0(boolean z4, String str, long j4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, Long.valueOf(j4), obj));
        }
    }

    public static void x(boolean z4, String str, @zc.a Object obj, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, obj, Long.valueOf(j4)));
        }
    }

    public static void x0(boolean z4, String str, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, obj));
        }
    }

    public static void y(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, obj, obj2));
        }
    }

    public static void y0(boolean z4, String str, @zc.a Object obj, char c5) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, obj, Character.valueOf(c5)));
        }
    }

    public static void z(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3) {
        if (!z4) {
            throw new IllegalArgumentException(t0.e(str, obj, obj2, obj3));
        }
    }

    public static void z0(boolean z4, String str, @zc.a Object obj, int i4) {
        if (!z4) {
            throw new IllegalStateException(t0.e(str, obj, Integer.valueOf(i4)));
        }
    }
}
