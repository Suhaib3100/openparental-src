package com.annimon.stream.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: Compat.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final long f41488a = 2147483639;

    /* renamed from: b, reason: collision with root package name */
    private static final String f41489b = ProtectedSandApp.s("ߖ");

    static void a(long j4) {
        if (j4 >= f41488a) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ߖ"));
        }
    }

    @SafeVarargs
    public static <E> E[] b(int i4, E... eArr) {
        try {
            return (E[]) Arrays.copyOf(eArr, i4);
        } catch (NoSuchMethodError unused) {
            return (E[]) c(eArr, i4);
        }
    }

    public static <E> E[] c(E[] eArr, int i4) {
        E[] eArr2 = (E[]) ((Object[]) Array.newInstance(eArr.getClass().getComponentType(), i4));
        System.arraycopy(eArr, 0, eArr2, 0, Math.min(i4, eArr.length));
        return eArr2;
    }

    public static <T> Queue<T> d() {
        try {
            return new ArrayDeque();
        } catch (NoClassDefFoundError unused) {
            return new LinkedList();
        }
    }
}
