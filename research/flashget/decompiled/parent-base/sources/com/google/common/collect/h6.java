package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: SortedIterables.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class h6 {
    private h6() {
    }

    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? x4.f56632f : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof g6)) {
                return false;
            }
            comparator2 = ((g6) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
