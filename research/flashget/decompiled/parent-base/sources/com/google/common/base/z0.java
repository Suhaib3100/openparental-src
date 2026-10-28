package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Verify.java */
@o
@d9.b
/* loaded from: classes6.dex */
public final class z0 {
    private z0() {
    }

    public static void a(boolean z4) {
        if (!z4) {
            throw new VerifyException();
        }
    }

    public static void b(boolean z4, String str, char c5) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Character.valueOf(c5)));
        }
    }

    public static void c(boolean z4, String str, char c5, char c6) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Character.valueOf(c5), Character.valueOf(c6)));
        }
    }

    public static void d(boolean z4, String str, char c5, int i4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Character.valueOf(c5), Integer.valueOf(i4)));
        }
    }

    public static void e(boolean z4, String str, char c5, long j4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Character.valueOf(c5), Long.valueOf(j4)));
        }
    }

    public static void f(boolean z4, String str, char c5, @zc.a Object obj) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Character.valueOf(c5), obj));
        }
    }

    public static void g(boolean z4, String str, int i4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Integer.valueOf(i4)));
        }
    }

    public static void h(boolean z4, String str, int i4, char c5) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Integer.valueOf(i4), Character.valueOf(c5)));
        }
    }

    public static void i(boolean z4, String str, int i4, int i5) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Integer.valueOf(i4), Integer.valueOf(i5)));
        }
    }

    public static void j(boolean z4, String str, int i4, long j4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Integer.valueOf(i4), Long.valueOf(j4)));
        }
    }

    public static void k(boolean z4, String str, int i4, @zc.a Object obj) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Integer.valueOf(i4), obj));
        }
    }

    public static void l(boolean z4, String str, long j4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Long.valueOf(j4)));
        }
    }

    public static void m(boolean z4, String str, long j4, char c5) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Long.valueOf(j4), Character.valueOf(c5)));
        }
    }

    public static void n(boolean z4, String str, long j4, int i4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Long.valueOf(j4), Integer.valueOf(i4)));
        }
    }

    public static void o(boolean z4, String str, long j4, long j5) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Long.valueOf(j4), Long.valueOf(j5)));
        }
    }

    public static void p(boolean z4, String str, long j4, @zc.a Object obj) {
        if (!z4) {
            throw new VerifyException(t0.e(str, Long.valueOf(j4), obj));
        }
    }

    public static void q(boolean z4, String str, @zc.a Object obj) {
        if (!z4) {
            throw new VerifyException(t0.e(str, obj));
        }
    }

    public static void r(boolean z4, String str, @zc.a Object obj, char c5) {
        if (!z4) {
            throw new VerifyException(t0.e(str, obj, Character.valueOf(c5)));
        }
    }

    public static void s(boolean z4, String str, @zc.a Object obj, int i4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, obj, Integer.valueOf(i4)));
        }
    }

    public static void t(boolean z4, String str, @zc.a Object obj, long j4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, obj, Long.valueOf(j4)));
        }
    }

    public static void u(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2) {
        if (!z4) {
            throw new VerifyException(t0.e(str, obj, obj2));
        }
    }

    public static void v(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3) {
        if (!z4) {
            throw new VerifyException(t0.e(str, obj, obj2, obj3));
        }
    }

    public static void w(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3, @zc.a Object obj4) {
        if (!z4) {
            throw new VerifyException(t0.e(str, obj, obj2, obj3, obj4));
        }
    }

    public static void x(boolean z4, String str, @zc.a Object... objArr) {
        if (!z4) {
            throw new VerifyException(t0.e(str, objArr));
        }
    }

    @f9.a
    public static <T> T y(@zc.a T t4) {
        return (T) z(t4, ProtectedSandApp.s("\uf3cd"), new Object[0]);
    }

    @f9.a
    public static <T> T z(@zc.a T t4, String str, @zc.a Object... objArr) {
        if (t4 != null) {
            return t4;
        }
        throw new VerifyException(t0.e(str, objArr));
    }
}
