package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics.java */
/* loaded from: classes7.dex */
public class l0 {

    /* compiled from: Intrinsics.java */
    @kotlin.c1(version = "1.4")
    public static class a {
        private a() {
        }
    }

    private l0() {
    }

    private static <T extends Throwable> T A(T t4) {
        return (T) B(t4, l0.class.getName());
    }

    static <T extends Throwable> T B(T t4, String str) {
        StackTraceElement[] stackTrace = t4.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i4 = i5;
            }
        }
        t4.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i4 + 1, length));
        return t4;
    }

    public static String C(String str, Object obj) {
        return str + obj;
    }

    public static void D() {
        throw ((AssertionError) A(new AssertionError()));
    }

    public static void E(String str) {
        throw ((AssertionError) A(new AssertionError(str)));
    }

    public static void F() {
        throw ((IllegalArgumentException) A(new IllegalArgumentException()));
    }

    public static void G(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(str)));
    }

    public static void H() {
        throw ((IllegalStateException) A(new IllegalStateException()));
    }

    public static void I(String str) {
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    @kotlin.c1(version = "1.4")
    public static void J() {
        throw ((NullPointerException) A(new NullPointerException()));
    }

    @kotlin.c1(version = "1.4")
    public static void K(String str) {
        throw ((NullPointerException) A(new NullPointerException(str)));
    }

    public static void L() {
        throw ((KotlinNullPointerException) A(new KotlinNullPointerException()));
    }

    public static void M(String str) {
        throw ((KotlinNullPointerException) A(new KotlinNullPointerException(str)));
    }

    private static void N(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(v(str))));
    }

    private static void O(String str) {
        throw ((NullPointerException) A(new NullPointerException(v(str))));
    }

    public static void P() {
        Q(ProtectedSandApp.s("擫\u0001"));
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        throw ((UninitializedPropertyAccessException) A(new UninitializedPropertyAccessException(str)));
    }

    public static void S(String str) {
        R(ProtectedSandApp.s("擬\u0001") + str + ProtectedSandApp.s("擭\u0001"));
    }

    @kotlin.c1(version = "1.1")
    public static boolean a(double d5, Double d6) {
        return d6 != null && d5 == d6.doubleValue();
    }

    @kotlin.c1(version = "1.1")
    public static boolean b(float f4, Float f5) {
        return f5 != null && f4 == f5.floatValue();
    }

    @kotlin.c1(version = "1.1")
    public static boolean c(Double d5, double d6) {
        return d5 != null && d5.doubleValue() == d6;
    }

    @kotlin.c1(version = "1.1")
    public static boolean d(Double d5, Double d6) {
        if (d5 == null) {
            if (d6 != null) {
                return false;
            }
        } else if (d6 == null || d5.doubleValue() != d6.doubleValue()) {
            return false;
        }
        return true;
    }

    @kotlin.c1(version = "1.1")
    public static boolean e(Float f4, float f5) {
        return f4 != null && f4.floatValue() == f5;
    }

    @kotlin.c1(version = "1.1")
    public static boolean f(Float f4, Float f5) {
        if (f4 == null) {
            if (f5 != null) {
                return false;
            }
        } else if (f5 == null || f4.floatValue() != f5.floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(androidx.compose.runtime.changelist.j.a(str, ProtectedSandApp.s("擮\u0001")))));
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void j(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(androidx.fragment.app.y.a(ProtectedSandApp.s("擯\u0001"), str, ProtectedSandApp.s("擰\u0001"), str2))));
        }
    }

    public static void k(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e4) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException(android.support.v4.media.d.a(ProtectedSandApp.s("擱\u0001"), replace, ProtectedSandApp.s("擲\u0001")), e4)));
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e4) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException(androidx.fragment.app.y.a(ProtectedSandApp.s("擱\u0001"), replace, ProtectedSandApp.s("擳\u0001"), str2), e4)));
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            J();
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            K(str);
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) A(new NullPointerException(androidx.compose.runtime.changelist.j.a(str, ProtectedSandApp.s("擮\u0001")))));
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            O(str);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            N(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void s(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(androidx.fragment.app.y.a(ProtectedSandApp.s("擴\u0001"), str, ProtectedSandApp.s("擰\u0001"), str2))));
        }
    }

    public static int t(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    public static int u(long j4, long j5) {
        if (j4 < j5) {
            return -1;
        }
        return j4 == j5 ? 0 : 1;
    }

    private static String v(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = l0.class.getName();
        int i4 = 0;
        while (!stackTrace[i4].getClassName().equals(name)) {
            i4++;
        }
        while (stackTrace[i4].getClassName().equals(name)) {
            i4++;
        }
        StackTraceElement stackTraceElement = stackTrace[i4];
        StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("擵\u0001"), stackTraceElement.getClassName(), ProtectedSandApp.s("擰\u0001"), stackTraceElement.getMethodName(), ProtectedSandApp.s("擶\u0001"));
        a5.append(str);
        return a5.toString();
    }

    public static void w() {
        P();
    }

    public static void x(String str) {
        Q(str);
    }

    public static void y(int i4, String str) {
        P();
    }

    public static void z(int i4, String str, String str2) {
        Q(str2);
    }
}
