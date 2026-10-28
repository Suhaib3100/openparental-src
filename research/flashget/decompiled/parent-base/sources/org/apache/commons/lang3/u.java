package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: EnumUtils.java */
/* loaded from: classes6.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static final String f86405a = "null elements not permitted";

    /* renamed from: b, reason: collision with root package name */
    private static final String f86406b = "Cannot store %s %s values in %s bits";

    /* renamed from: c, reason: collision with root package name */
    private static final String f86407c = "%s does not seem to be an Enum type";

    /* renamed from: d, reason: collision with root package name */
    private static final String f86408d = "EnumClass must be defined.";

    private static <E extends Enum<E>> Class<E> a(Class<E> cls) {
        k1.b0(cls, "EnumClass must be defined.", new Object[0]);
        k1.B(cls.isEnum(), "%s does not seem to be an Enum type", cls);
        return cls;
    }

    private static <E extends Enum<E>> Class<E> b(Class<E> cls) {
        Enum[] enumArr = (Enum[]) a(cls).getEnumConstants();
        k1.B(enumArr.length <= 64, "Cannot store %s %s values in %s bits", Integer.valueOf(enumArr.length), cls.getSimpleName(), 64);
        return cls;
    }

    public static <E extends Enum<E>> long c(Class<E> cls, Iterable<? extends E> iterable) {
        b(cls);
        k1.a0(iterable);
        long j4 = 0;
        for (E e4 : iterable) {
            k1.b0(e4, "null elements not permitted", new Object[0]);
            j4 |= 1 << e4.ordinal();
        }
        return j4;
    }

    @SafeVarargs
    public static <E extends Enum<E>> long d(Class<E> cls, E... eArr) {
        k1.M(eArr);
        return c(cls, Arrays.asList(eArr));
    }

    public static <E extends Enum<E>> long[] e(Class<E> cls, Iterable<? extends E> iterable) {
        a(cls);
        k1.a0(iterable);
        EnumSet noneOf = EnumSet.noneOf(cls);
        for (E e4 : iterable) {
            k1.b0(e4, "null elements not permitted", new Object[0]);
            noneOf.add(e4);
        }
        long[] jArr = new long[androidx.appcompat.widget.a.a(cls.getEnumConstants().length, 1, 64, 1)];
        Iterator it = noneOf.iterator();
        while (it.hasNext()) {
            Enum r02 = (Enum) it.next();
            int ordinal = r02.ordinal() / 64;
            jArr[ordinal] = jArr[ordinal] | (1 << (r02.ordinal() % 64));
        }
        e.Y3(jArr);
        return jArr;
    }

    @SafeVarargs
    public static <E extends Enum<E>> long[] f(Class<E> cls, E... eArr) {
        a(cls);
        k1.M(eArr);
        EnumSet noneOf = EnumSet.noneOf(cls);
        Collections.addAll(noneOf, eArr);
        long[] jArr = new long[androidx.appcompat.widget.a.a(cls.getEnumConstants().length, 1, 64, 1)];
        Iterator it = noneOf.iterator();
        while (it.hasNext()) {
            Enum r02 = (Enum) it.next();
            int ordinal = r02.ordinal() / 64;
            jArr[ordinal] = jArr[ordinal] | (1 << (r02.ordinal() % 64));
        }
        e.Y3(jArr);
        return jArr;
    }

    public static <E extends Enum<E>> E g(Class<E> cls, String str) {
        return (E) h(cls, str, null);
    }

    public static <E extends Enum<E>> E h(Class<E> cls, String str, E e4) {
        if (str == null) {
            return e4;
        }
        try {
            return (E) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            return e4;
        }
    }

    public static <E extends Enum<E>> E i(Class<E> cls, String str) {
        return (E) j(cls, str, null);
    }

    public static <E extends Enum<E>> E j(Class<E> cls, String str, E e4) {
        if (str != null && cls.isEnum()) {
            for (E e5 : cls.getEnumConstants()) {
                if (e5.name().equalsIgnoreCase(str)) {
                    return e5;
                }
            }
        }
        return e4;
    }

    public static <E extends Enum<E>> List<E> k(Class<E> cls) {
        return new ArrayList(Arrays.asList(cls.getEnumConstants()));
    }

    public static <E extends Enum<E>> Map<String, E> l(Class<E> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (E e4 : cls.getEnumConstants()) {
            linkedHashMap.put(e4.name(), e4);
        }
        return linkedHashMap;
    }

    public static <E extends Enum<E>> boolean m(Class<E> cls, String str) {
        return h(cls, str, null) != null;
    }

    public static <E extends Enum<E>> boolean n(Class<E> cls, String str) {
        return j(cls, str, null) != null;
    }

    public static <E extends Enum<E>> EnumSet<E> o(Class<E> cls, long j4) {
        b(cls).getEnumConstants();
        return p(cls, j4);
    }

    public static <E extends Enum<E>> EnumSet<E> p(Class<E> cls, long... jArr) {
        EnumSet<E> noneOf = EnumSet.noneOf(a(cls));
        long[] Q = e.Q((long[]) k1.a0(jArr));
        e.Y3(Q);
        for (E e4 : cls.getEnumConstants()) {
            int ordinal = e4.ordinal() / 64;
            if (ordinal < Q.length && (Q[ordinal] & (1 << (e4.ordinal() % 64))) != 0) {
                noneOf.add(e4);
            }
        }
        return noneOf;
    }
}
