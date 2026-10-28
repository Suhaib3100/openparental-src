package com.google.common.collect;

import com.google.common.collect.o4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Platform.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class h5 {
    private h5() {
    }

    static void a() {
    }

    static <T> T[] b(Object[] objArr, int i4, int i5, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i4, i5, tArr.getClass());
    }

    static <T> T[] c(T[] tArr, int i4) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i4));
    }

    static <K, V> Map<K, V> d(int i4) {
        return d0.z(i4);
    }

    static <E> Set<E> e(int i4) {
        return e0.q(i4);
    }

    static <K, V> Map<K, V> f(int i4) {
        return g0.i0(i4);
    }

    static <E> Set<E> g(int i4) {
        return h0.e0(i4);
    }

    static <E> Set<E> h() {
        return e0.j();
    }

    static <K, V> Map<K, V> i() {
        return d0.u();
    }

    static int j(int i4) {
        return i4;
    }

    static int k(int i4) {
        return i4;
    }

    static n4 l(n4 n4Var) {
        n4Var.getClass();
        return n4Var.j(o4.q.WEAK);
    }
}
