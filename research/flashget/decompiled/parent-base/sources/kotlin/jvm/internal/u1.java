package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import md.g;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes7.dex */
public class u1 {
    public static int A(Object obj) {
        if (obj instanceof e0) {
            return ((e0) obj).getArity();
        }
        if (obj instanceof ld.a) {
            return 0;
        }
        if (obj instanceof ld.l) {
            return 1;
        }
        if (obj instanceof ld.p) {
            return 2;
        }
        if (obj instanceof ld.q) {
            return 3;
        }
        if (obj instanceof ld.r) {
            return 4;
        }
        if (obj instanceof ld.s) {
            return 5;
        }
        if (obj instanceof ld.t) {
            return 6;
        }
        if (obj instanceof ld.u) {
            return 7;
        }
        if (obj instanceof ld.v) {
            return 8;
        }
        if (obj instanceof ld.w) {
            return 9;
        }
        if (obj instanceof ld.b) {
            return 10;
        }
        if (obj instanceof ld.c) {
            return 11;
        }
        if (obj instanceof ld.d) {
            return 12;
        }
        if (obj instanceof ld.e) {
            return 13;
        }
        if (obj instanceof ld.f) {
            return 14;
        }
        if (obj instanceof ld.g) {
            return 15;
        }
        if (obj instanceof ld.h) {
            return 16;
        }
        if (obj instanceof ld.i) {
            return 17;
        }
        if (obj instanceof ld.j) {
            return 18;
        }
        if (obj instanceof ld.k) {
            return 19;
        }
        if (obj instanceof ld.m) {
            return 20;
        }
        if (obj instanceof ld.n) {
            return 21;
        }
        return obj instanceof ld.o ? 22 : -1;
    }

    public static boolean B(Object obj, int i4) {
        return (obj instanceof kotlin.v) && A(obj) == i4;
    }

    public static boolean C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof md.a) || (obj instanceof md.b));
    }

    public static boolean D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof md.a) || (obj instanceof md.c));
    }

    public static boolean E(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof md.a) || (obj instanceof md.d));
    }

    public static boolean F(Object obj) {
        return (obj instanceof List) && (!(obj instanceof md.a) || (obj instanceof md.e));
    }

    public static boolean G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof md.a) || (obj instanceof md.f));
    }

    public static boolean H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof md.a) || (obj instanceof md.g));
    }

    public static boolean I(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof md.a) || (obj instanceof g.a));
    }

    public static boolean J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof md.a) || (obj instanceof md.h));
    }

    private static <T extends Throwable> T K(T t4) {
        return (T) l0.B(t4, u1.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        N((obj == null ? ProtectedSandApp.s("攅\u0001") : obj.getClass().getName()) + ProtectedSandApp.s("攆\u0001") + str);
    }

    public static void N(String str) {
        throw ((ClassCastException) K(new ClassCastException(str)));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof md.a) && !(obj instanceof md.b)) {
            M(obj, ProtectedSandApp.s("攇\u0001"));
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof md.a) && !(obj instanceof md.b)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof md.a) && !(obj instanceof md.c)) {
            M(obj, ProtectedSandApp.s("攈\u0001"));
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof md.a) && !(obj instanceof md.c)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof md.a) && !(obj instanceof md.d)) {
            M(obj, ProtectedSandApp.s("攉\u0001"));
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof md.a) && !(obj instanceof md.d)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof md.a) && !(obj instanceof md.e)) {
            M(obj, ProtectedSandApp.s("攊\u0001"));
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof md.a) && !(obj instanceof md.e)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof md.a) && !(obj instanceof md.f)) {
            M(obj, ProtectedSandApp.s("攋\u0001"));
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof md.a) && !(obj instanceof md.f)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof md.a) && !(obj instanceof md.g)) {
            M(obj, ProtectedSandApp.s("攌\u0001"));
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof md.a) && !(obj instanceof md.g)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof md.a) && !(obj instanceof g.a)) {
            M(obj, ProtectedSandApp.s("攍\u0001"));
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof md.a) && !(obj instanceof g.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof md.a) && !(obj instanceof md.h)) {
            M(obj, ProtectedSandApp.s("攎\u0001"));
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof md.a) && !(obj instanceof md.h)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i4) {
        if (obj != null && !B(obj, i4)) {
            M(obj, ProtectedSandApp.s("攏\u0001") + i4);
        }
        return obj;
    }

    public static Object r(Object obj, int i4, String str) {
        if (obj != null && !B(obj, i4)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e4) {
            throw ((ClassCastException) K(e4));
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e4) {
            throw ((ClassCastException) K(e4));
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e4) {
            throw ((ClassCastException) K(e4));
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e4) {
            throw ((ClassCastException) K(e4));
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e4) {
            throw ((ClassCastException) K(e4));
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e4) {
            throw ((ClassCastException) K(e4));
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e4) {
            throw ((ClassCastException) K(e4));
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e4) {
            throw ((ClassCastException) K(e4));
        }
    }
}
