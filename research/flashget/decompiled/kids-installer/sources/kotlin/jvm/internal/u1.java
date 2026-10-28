package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import r3.g;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes5.dex */
public class u1 {
    public static int A(Object obj) {
        if (obj instanceof FunctionBase) {
            return ((FunctionBase) obj).getF23323r();
        }
        if (obj instanceof q3.a) {
            return 0;
        }
        if (obj instanceof q3.l) {
            return 1;
        }
        if (obj instanceof q3.p) {
            return 2;
        }
        if (obj instanceof q3.q) {
            return 3;
        }
        if (obj instanceof q3.r) {
            return 4;
        }
        if (obj instanceof q3.s) {
            return 5;
        }
        if (obj instanceof q3.t) {
            return 6;
        }
        if (obj instanceof q3.u) {
            return 7;
        }
        if (obj instanceof q3.v) {
            return 8;
        }
        if (obj instanceof q3.w) {
            return 9;
        }
        if (obj instanceof q3.b) {
            return 10;
        }
        if (obj instanceof q3.c) {
            return 11;
        }
        if (obj instanceof q3.d) {
            return 12;
        }
        if (obj instanceof q3.e) {
            return 13;
        }
        if (obj instanceof q3.f) {
            return 14;
        }
        if (obj instanceof q3.g) {
            return 15;
        }
        if (obj instanceof q3.h) {
            return 16;
        }
        if (obj instanceof q3.i) {
            return 17;
        }
        if (obj instanceof q3.j) {
            return 18;
        }
        if (obj instanceof q3.k) {
            return 19;
        }
        if (obj instanceof q3.m) {
            return 20;
        }
        if (obj instanceof q3.n) {
            return 21;
        }
        return obj instanceof q3.o ? 22 : -1;
    }

    public static boolean B(Object obj, int i5) {
        return (obj instanceof Function) && A(obj) == i5;
    }

    public static boolean C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof r3.a) || (obj instanceof r3.b));
    }

    public static boolean D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof r3.a) || (obj instanceof r3.c));
    }

    public static boolean E(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof r3.a) || (obj instanceof r3.d));
    }

    public static boolean F(Object obj) {
        return (obj instanceof List) && (!(obj instanceof r3.a) || (obj instanceof r3.e));
    }

    public static boolean G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof r3.a) || (obj instanceof r3.f));
    }

    public static boolean H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof r3.a) || (obj instanceof r3.g));
    }

    public static boolean I(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof r3.a) || (obj instanceof g.a));
    }

    public static boolean J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof r3.a) || (obj instanceof r3.h));
    }

    private static <T extends Throwable> T K(T t5) {
        return (T) l0.B(t5, u1.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        N((obj == null ? ProtectedSandApp.s("䆀") : obj.getClass().getName()) + ProtectedSandApp.s("䆁") + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.b)) {
            M(obj, ProtectedSandApp.s("䆂"));
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.b)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.c)) {
            M(obj, ProtectedSandApp.s("䆃"));
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.c)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.d)) {
            M(obj, ProtectedSandApp.s("䆄"));
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.d)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.e)) {
            M(obj, ProtectedSandApp.s("䆅"));
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.e)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.f)) {
            M(obj, ProtectedSandApp.s("䆆"));
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.f)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.g)) {
            M(obj, ProtectedSandApp.s("䆇"));
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.g)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof r3.a) && !(obj instanceof g.a)) {
            M(obj, ProtectedSandApp.s("䆈"));
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof r3.a) && !(obj instanceof g.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.h)) {
            M(obj, ProtectedSandApp.s("䆉"));
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof r3.a) && !(obj instanceof r3.h)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i5) {
        if (obj != null && !B(obj, i5)) {
            M(obj, ProtectedSandApp.s("䆊") + i5);
        }
        return obj;
    }

    public static Object r(Object obj, int i5, String str) {
        if (obj != null && !B(obj, i5)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e6) {
            throw L(e6);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e6) {
            throw L(e6);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e6) {
            throw L(e6);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e6) {
            throw L(e6);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e6) {
            throw L(e6);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e6) {
            throw L(e6);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e6) {
            throw L(e6);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e6) {
            throw L(e6);
        }
    }
}
