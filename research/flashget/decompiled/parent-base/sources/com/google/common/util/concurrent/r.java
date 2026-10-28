package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: Atomics.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public final class r {
    private r() {
    }

    public static <V> AtomicReference<V> a() {
        return new AtomicReference<>();
    }

    public static <V> AtomicReference<V> b(@j1 V v4) {
        return new AtomicReference<>(v4);
    }

    public static <E> AtomicReferenceArray<E> c(int i4) {
        return new AtomicReferenceArray<>(i4);
    }

    public static <E> AtomicReferenceArray<E> d(E[] eArr) {
        return new AtomicReferenceArray<>(eArr);
    }
}
