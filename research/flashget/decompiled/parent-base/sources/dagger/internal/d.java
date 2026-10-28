package dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: DaggerCollections.java */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f73678a = 1073741824;

    private d() {
    }

    private static int a(int i4) {
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    static <T> HashSet<T> c(int i4) {
        return new HashSet<>(a(i4));
    }

    public static <K, V> LinkedHashMap<K, V> d(int i4) {
        return new LinkedHashMap<>(a(i4));
    }

    public static <T> List<T> e(int i4) {
        return i4 == 0 ? Collections.emptyList() : new ArrayList(i4);
    }
}
