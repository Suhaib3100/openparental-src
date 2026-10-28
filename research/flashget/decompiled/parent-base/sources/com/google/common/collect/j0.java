package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: Comparators.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public final class j0 {
    private j0() {
    }

    public static <T> boolean a(Iterable<? extends T> iterable, Comparator<T> comparator) {
        comparator.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean b(Iterable<? extends T> iterable, Comparator<T> comparator) {
        comparator.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T, S extends T> Comparator<Iterable<S>> c(Comparator<T> comparator) {
        comparator.getClass();
        return new f4(comparator);
    }

    public static <T extends Comparable<? super T>> T d(T t4, T t5) {
        return t4.compareTo(t5) >= 0 ? t4 : t5;
    }

    @f5
    public static <T> T e(@f5 T t4, @f5 T t5, Comparator<T> comparator) {
        return comparator.compare(t4, t5) >= 0 ? t4 : t5;
    }

    public static <T extends Comparable<? super T>> T f(T t4, T t5) {
        return t4.compareTo(t5) <= 0 ? t4 : t5;
    }

    @f5
    public static <T> T g(@f5 T t4, @f5 T t5, Comparator<T> comparator) {
        return comparator.compare(t4, t5) <= 0 ? t4 : t5;
    }
}
