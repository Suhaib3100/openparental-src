package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ObjectArrays.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class b5 {
    private b5() {
    }

    @f9.a
    static Object a(@zc.a Object obj, int i4) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(com.google.android.gms.internal.location.a.a(20, ProtectedSandApp.s("\uf45c"), i4));
    }

    @f9.a
    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    @f9.a
    static Object[] c(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            a(objArr[i5], i5);
        }
        return objArr;
    }

    public static <T> T[] d(@f5 T t4, T[] tArr) {
        T[] tArr2 = (T[]) h5.c(tArr, tArr.length + 1);
        tArr2[0] = t4;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] e(T[] tArr, @f5 T t4) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t4;
        return tArr2;
    }

    @d9.c
    public static <T> T[] f(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    static Object[] g(Object[] objArr, int i4, int i5) {
        com.google.common.base.l0.f0(i4, i4 + i5, objArr.length);
        if (i5 == 0) {
            return new Object[0];
        }
        Object[] objArr2 = new Object[i5];
        System.arraycopy(objArr, i4, objArr2, 0, i5);
        return objArr2;
    }

    @f9.a
    private static Object[] h(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
        return objArr;
    }

    @d9.c
    public static <T> T[] i(Class<T> cls, int i4) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i4));
    }

    public static <T> T[] j(T[] tArr, int i4) {
        return (T[]) h5.c(tArr, i4);
    }

    static void k(Object[] objArr, int i4, int i5) {
        Object obj = objArr[i4];
        objArr[i4] = objArr[i5];
        objArr[i5] = obj;
    }

    static Object[] l(Collection<?> collection) {
        return h(collection, new Object[collection.size()]);
    }

    static <T> T[] m(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) h5.c(tArr, size);
        }
        h(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    static <T> T[] n(Object[] objArr, int i4, int i5, T[] tArr) {
        com.google.common.base.l0.f0(i4, i4 + i5, objArr.length);
        if (tArr.length < i5) {
            tArr = (T[]) h5.c(tArr, i5);
        } else if (tArr.length > i5) {
            tArr[i5] = null;
        }
        System.arraycopy(objArr, i4, tArr, 0, i5);
        return tArr;
    }
}
