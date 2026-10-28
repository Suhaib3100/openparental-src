package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics.java */
/* loaded from: classes5.dex */
public class l0 {

    /* compiled from: Intrinsics.java */
    @SinceKotlin(version = "1.4")
    public static class a {
        private a() {
        }
    }

    private l0() {
    }

    private static <T extends Throwable> T A(T t5) {
        return (T) B(t5, l0.class.getName());
    }

    static <T extends Throwable> T B(T t5, String str) {
        StackTraceElement[] stackTrace = t5.getStackTrace();
        int length = stackTrace.length;
        int i5 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            if (str.equals(stackTrace[i6].getClassName())) {
                i5 = i6;
            }
        }
        t5.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i5 + 1, length));
        return t5;
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

    @SinceKotlin(version = "1.4")
    public static void J() {
        throw ((NullPointerException) A(new NullPointerException()));
    }

    @SinceKotlin(version = "1.4")
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
        Q(ProtectedSandApp.s("䅟"));
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        throw ((UninitializedPropertyAccessException) A(new UninitializedPropertyAccessException(str)));
    }

    public static void S(String str) {
        R(ProtectedSandApp.s("䅠") + str + ProtectedSandApp.s("䅡"));
    }

    @SinceKotlin(version = "1.1")
    public static boolean a(double d6, Double d7) {
        return d7 != null && d6 == d7.doubleValue();
    }

    @SinceKotlin(version = "1.1")
    public static boolean b(float f6, Float f7) {
        return f7 != null && f6 == f7.floatValue();
    }

    @SinceKotlin(version = "1.1")
    public static boolean c(Double d6, double d7) {
        return d6 != null && d6.doubleValue() == d7;
    }

    @SinceKotlin(version = "1.1")
    public static boolean d(Double d6, Double d7) {
        if (d6 == null) {
            if (d7 == null) {
                return true;
            }
        } else if (d7 != null && d6.doubleValue() == d7.doubleValue()) {
            return true;
        }
        return false;
    }

    @SinceKotlin(version = "1.1")
    public static boolean e(Float f6, float f7) {
        return f6 != null && f6.floatValue() == f7;
    }

    @SinceKotlin(version = "1.1")
    public static boolean f(Float f6, Float f7) {
        if (f6 == null) {
            if (f7 == null) {
                return true;
            }
        } else if (f7 != null && f6.floatValue() == f7.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("䅢")))));
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void j(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(ProtectedSandApp.s("䅣") + str + ProtectedSandApp.s("䅤") + str2)));
    }

    public static void k(String str) throws ClassNotFoundException {
        String replace = str.replace(org.apache.commons.io.n.f32060b, org.apache.commons.io.k.f32026a);
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e6) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException(androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("䅥"), replace, ProtectedSandApp.s("䅦")), e6)));
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace(org.apache.commons.io.n.f32060b, org.apache.commons.io.k.f32026a);
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e6) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException(ProtectedSandApp.s("䅧") + replace + ProtectedSandApp.s("䅨") + str2, e6)));
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
            throw ((NullPointerException) A(new NullPointerException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("䅩")))));
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
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(ProtectedSandApp.s("䅪") + str + ProtectedSandApp.s("䅫") + str2)));
    }

    public static int t(int i5, int i6) {
        if (i5 < i6) {
            return -1;
        }
        return i5 == i6 ? 0 : 1;
    }

    public static int u(long j5, long j6) {
        if (j5 < j6) {
            return -1;
        }
        return j5 == j6 ? 0 : 1;
    }

    private static String v(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = l0.class.getName();
        int i5 = 0;
        while (!stackTrace[i5].getClassName().equals(name)) {
            i5++;
        }
        while (stackTrace[i5].getClassName().equals(name)) {
            i5++;
        }
        StackTraceElement stackTraceElement = stackTrace[i5];
        return ProtectedSandApp.s("䅬") + stackTraceElement.getClassName() + ProtectedSandApp.s("䅭") + stackTraceElement.getMethodName() + ProtectedSandApp.s("䅮") + str;
    }

    public static void w() {
        P();
    }

    public static void x(String str) {
        Q(str);
    }

    public static void y(int i5, String str) {
        P();
    }

    public static void z(int i5, String str, String str2) {
        Q(str2);
    }
}
