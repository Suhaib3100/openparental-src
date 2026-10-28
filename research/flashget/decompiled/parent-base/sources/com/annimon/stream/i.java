package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: Objects.java */
/* loaded from: classes3.dex */
public final class i {
    private i() {
    }

    public static <T> int a(T t4, T t5, Comparator<? super T> comparator) {
        if (t4 == t5) {
            return 0;
        }
        return comparator.compare(t4, t5);
    }

    public static int b(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    public static int c(long j4, long j5) {
        if (j4 < j5) {
            return -1;
        }
        return j4 == j5 ? 0 : 1;
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == obj2 || !(obj == null || obj2 == null || !Arrays.deepEquals(new Object[]{obj}, new Object[]{obj2}));
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int f(Object... objArr) {
        if (objArr == null) {
            return 0;
        }
        int i4 = 1;
        for (Object obj : objArr) {
            i4 = (i4 * 31) + g(obj);
        }
        return i4;
    }

    public static int g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static boolean h(Object obj) {
        return obj == null;
    }

    public static boolean i(Object obj) {
        return obj != null;
    }

    public static <T> T j(T t4) {
        t4.getClass();
        return t4;
    }

    public static <T> T k(T t4, a1<String> a1Var) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(a1Var.get());
    }

    public static <T> T l(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    public static <T> Collection<T> m(Collection<T> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        return collection;
    }

    public static <T> T n(T t4, T t5) {
        return t4 != null ? t4 : (T) l(t5, ProtectedSandApp.s("ߓ"));
    }

    public static <T> T o(T t4, a1<? extends T> a1Var) {
        return t4 != null ? t4 : (T) l(((a1) l(a1Var, ProtectedSandApp.s("ߔ"))).get(), ProtectedSandApp.s("ߕ"));
    }

    public static String p(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
