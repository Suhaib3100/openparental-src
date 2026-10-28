package org.apache.commons.lang3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* compiled from: Validate.java */
/* loaded from: classes6.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f86041a = "The validated value is not a number";

    /* renamed from: b, reason: collision with root package name */
    private static final String f86042b = "The value is invalid: %f";

    /* renamed from: c, reason: collision with root package name */
    private static final String f86043c = "The value %s is not in the specified exclusive range of %s to %s";

    /* renamed from: d, reason: collision with root package name */
    private static final String f86044d = "The value %s is not in the specified inclusive range of %s to %s";

    /* renamed from: e, reason: collision with root package name */
    private static final String f86045e = "The string %s does not match the pattern %s";

    /* renamed from: f, reason: collision with root package name */
    private static final String f86046f = "The validated object is null";

    /* renamed from: g, reason: collision with root package name */
    private static final String f86047g = "The validated expression is false";

    /* renamed from: h, reason: collision with root package name */
    private static final String f86048h = "The validated array contains null element at index: %d";

    /* renamed from: i, reason: collision with root package name */
    private static final String f86049i = "The validated collection contains null element at index: %d";

    /* renamed from: j, reason: collision with root package name */
    private static final String f86050j = "The validated character sequence is blank";

    /* renamed from: k, reason: collision with root package name */
    private static final String f86051k = "The validated array is empty";

    /* renamed from: l, reason: collision with root package name */
    private static final String f86052l = "The validated character sequence is empty";

    /* renamed from: m, reason: collision with root package name */
    private static final String f86053m = "The validated collection is empty";

    /* renamed from: n, reason: collision with root package name */
    private static final String f86054n = "The validated map is empty";

    /* renamed from: o, reason: collision with root package name */
    private static final String f86055o = "The validated array index is invalid: %d";

    /* renamed from: p, reason: collision with root package name */
    private static final String f86056p = "The validated character sequence index is invalid: %d";

    /* renamed from: q, reason: collision with root package name */
    private static final String f86057q = "The validated collection index is invalid: %d";

    /* renamed from: r, reason: collision with root package name */
    private static final String f86058r = "The validated state is false";

    /* renamed from: s, reason: collision with root package name */
    private static final String f86059s = "Cannot assign a %s to a %s";

    /* renamed from: t, reason: collision with root package name */
    private static final String f86060t = "Expected type: %s, actual: %s";

    public static void A(boolean z4, String str, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, Long.valueOf(j4)));
        }
    }

    public static void B(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void I(CharSequence charSequence, String str) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format("The string %s does not match the pattern %s", charSequence, str));
        }
    }

    public static void J(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format(str2, objArr));
        }
    }

    public static <T extends Iterable<?>> T K(T t4) {
        return (T) L(t4, "The validated collection contains null element at index: %d", new Object[0]);
    }

    public static <T extends Iterable<?>> T L(T t4, String str, Object... objArr) {
        a0(t4);
        Iterator it = t4.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException(String.format(str, e.z(objArr, Integer.valueOf(i4))));
            }
            i4++;
        }
        return t4;
    }

    public static <T> T[] M(T[] tArr) {
        return (T[]) N(tArr, "The validated array contains null element at index: %d", new Object[0]);
    }

    public static <T> T[] N(T[] tArr, String str, Object... objArr) {
        a0(tArr);
        for (int i4 = 0; i4 < tArr.length; i4++) {
            if (tArr[i4] == null) {
                throw new IllegalArgumentException(String.format(str, e.o(objArr, Integer.valueOf(i4))));
            }
        }
        return tArr;
    }

    public static <T extends CharSequence> T O(T t4) {
        return (T) P(t4, "The validated character sequence is blank", new Object[0]);
    }

    public static <T extends CharSequence> T P(T t4, final String str, final Object... objArr) {
        Objects.requireNonNull(t4, (Supplier<String>) new Supplier() { // from class: org.apache.commons.lang3.f1
            @Override // java.util.function.Supplier
            public final Object get() {
                return String.format(str, objArr);
            }
        });
        if (b1.F0(t4)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t4;
    }

    public static <T extends CharSequence> T Q(T t4) {
        return (T) R(t4, "The validated character sequence is empty", new Object[0]);
    }

    public static <T extends CharSequence> T R(T t4, final String str, final Object... objArr) {
        Objects.requireNonNull(t4, (Supplier<String>) new Supplier() { // from class: org.apache.commons.lang3.h1
            @Override // java.util.function.Supplier
            public final Object get() {
                return String.format(str, objArr);
            }
        });
        if (t4.length() != 0) {
            return t4;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T extends Collection<?>> T S(T t4) {
        return (T) T(t4, "The validated collection is empty", new Object[0]);
    }

    public static <T extends Collection<?>> T T(T t4, final String str, final Object... objArr) {
        Objects.requireNonNull(t4, (Supplier<String>) new Supplier() { // from class: org.apache.commons.lang3.i1
            @Override // java.util.function.Supplier
            public final Object get() {
                return String.format(str, objArr);
            }
        });
        if (t4.isEmpty()) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t4;
    }

    public static <T extends Map<?, ?>> T U(T t4) {
        return (T) V(t4, "The validated map is empty", new Object[0]);
    }

    public static <T extends Map<?, ?>> T V(T t4, final String str, final Object... objArr) {
        Objects.requireNonNull(t4, (Supplier<String>) new Supplier() { // from class: org.apache.commons.lang3.e1
            @Override // java.util.function.Supplier
            public final Object get() {
                return String.format(str, objArr);
            }
        });
        if (t4.isEmpty()) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t4;
    }

    public static <T> T[] W(T[] tArr) {
        return (T[]) X(tArr, "The validated array is empty", new Object[0]);
    }

    public static <T> T[] X(T[] tArr, final String str, final Object... objArr) {
        Objects.requireNonNull(tArr, (Supplier<String>) new Supplier() { // from class: org.apache.commons.lang3.j1
            @Override // java.util.function.Supplier
            public final Object get() {
                return String.format(str, objArr);
            }
        });
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void Y(double d5) {
        Z(d5, "The validated value is not a number", new Object[0]);
    }

    public static void Z(double d5, String str, Object... objArr) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T a0(T t4) {
        return (T) b0(t4, "The validated object is null", new Object[0]);
    }

    public static <T> T b0(T t4, final String str, final Object... objArr) {
        Objects.requireNonNull(t4, (Supplier<String>) new Supplier() { // from class: org.apache.commons.lang3.g1
            @Override // java.util.function.Supplier
            public final Object get() {
                return String.format(str, objArr);
            }
        });
        return t4;
    }

    public static <T extends CharSequence> T c0(T t4, int i4) {
        return (T) d0(t4, i4, "The validated character sequence index is invalid: %d", Integer.valueOf(i4));
    }

    public static <T extends CharSequence> T d0(T t4, int i4, String str, Object... objArr) {
        a0(t4);
        if (i4 < 0 || i4 >= t4.length()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t4;
    }

    public static <T extends Collection<?>> T e0(T t4, int i4) {
        return (T) f0(t4, i4, "The validated collection index is invalid: %d", Integer.valueOf(i4));
    }

    public static <T extends Collection<?>> T f0(T t4, int i4, String str, Object... objArr) {
        a0(t4);
        if (i4 < 0 || i4 >= t4.size()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t4;
    }

    public static void g(double d5, double d6, double d7) {
        if (d7 <= d5 || d7 >= d6) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified exclusive range of %s to %s", Double.valueOf(d7), Double.valueOf(d5), Double.valueOf(d6)));
        }
    }

    public static <T> T[] g0(T[] tArr, int i4) {
        return (T[]) h0(tArr, i4, "The validated array index is invalid: %d", Integer.valueOf(i4));
    }

    public static void h(double d5, double d6, double d7, String str) {
        if (d7 <= d5 || d7 >= d6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T[] h0(T[] tArr, int i4, String str, Object... objArr) {
        a0(tArr);
        if (i4 < 0 || i4 >= tArr.length) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return tArr;
    }

    public static void i(long j4, long j5, long j6) {
        if (j6 <= j4 || j6 >= j5) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified exclusive range of %s to %s", Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j5)));
        }
    }

    public static void i0(boolean z4) {
        if (!z4) {
            throw new IllegalStateException("The validated state is false");
        }
    }

    public static void j(long j4, long j5, long j6, String str) {
        if (j6 <= j4 || j6 >= j5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void j0(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> void k(T t4, T t5, Comparable<T> comparable) {
        if (comparable.compareTo(t4) <= 0 || comparable.compareTo(t5) >= 0) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified exclusive range of %s to %s", comparable, t4, t5));
        }
    }

    public static <T> void l(T t4, T t5, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t4) <= 0 || comparable.compareTo(t5) >= 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void m(double d5) {
        n(d5, "The value is invalid: %f", Double.valueOf(d5));
    }

    public static void n(double d5, String str, Object... objArr) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void o(double d5, double d6, double d7) {
        if (d7 < d5 || d7 > d6) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified inclusive range of %s to %s", Double.valueOf(d7), Double.valueOf(d5), Double.valueOf(d6)));
        }
    }

    public static void p(double d5, double d6, double d7, String str) {
        if (d7 < d5 || d7 > d6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void q(long j4, long j5, long j6) {
        if (j6 < j4 || j6 > j5) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified inclusive range of %s to %s", Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j5)));
        }
    }

    public static void r(long j4, long j5, long j6, String str) {
        if (j6 < j4 || j6 > j5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> void s(T t4, T t5, Comparable<T> comparable) {
        if (comparable.compareTo(t4) < 0 || comparable.compareTo(t5) > 0) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified inclusive range of %s to %s", comparable, t4, t5));
        }
    }

    public static <T> void t(T t4, T t5, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t4) < 0 || comparable.compareTo(t5) > 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void u(Class<?> cls, Class<?> cls2) {
        if (cls.isAssignableFrom(cls2)) {
        } else {
            throw new IllegalArgumentException(String.format("Cannot assign a %s to a %s", cls2 == null ? "null" : cls2.getName(), cls.getName()));
        }
    }

    public static void v(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void w(Class<?> cls, Object obj) {
        if (cls.isInstance(obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Expected type: %s, actual: %s", cls.getName(), obj == null ? "null" : obj.getClass().getName()));
        }
    }

    public static void x(Class<?> cls, Object obj, String str, Object... objArr) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void y(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException("The validated expression is false");
        }
    }

    public static void z(boolean z4, String str, double d5) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, Double.valueOf(d5)));
        }
    }
}
