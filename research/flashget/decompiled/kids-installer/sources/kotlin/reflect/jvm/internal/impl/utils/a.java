package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.jvm.internal.l0;

/* compiled from: collections.kt */
/* loaded from: classes5.dex */
public final class a {
    public static final <T> void a(@d5.d Collection<T> collection, @d5.e T t5) {
        l0.p(collection, ProtectedSandApp.s("夁"));
        if (t5 != null) {
            collection.add(t5);
        }
    }

    private static final int b(int i5) {
        if (i5 < 3) {
            return 3;
        }
        return (i5 / 3) + i5 + 1;
    }

    @d5.d
    public static final <T> List<T> c(@d5.d ArrayList<T> arrayList) {
        Object B2;
        List<T> k5;
        l0.p(arrayList, ProtectedSandApp.s("夂"));
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.f23167o;
        }
        if (size != 1) {
            arrayList.trimToSize();
            return arrayList;
        }
        B2 = j0.B2(arrayList);
        k5 = z.k(B2);
        return k5;
    }

    @d5.d
    public static final <K> Map<K, Integer> d(@d5.d Iterable<? extends K> iterable) {
        l0.p(iterable, ProtectedSandApp.s("夃"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i5));
            i5++;
        }
        return linkedHashMap;
    }

    @d5.d
    public static final <K, V> HashMap<K, V> e(int i5) {
        return new HashMap<>(b(i5));
    }

    @d5.d
    public static final <E> HashSet<E> f(int i5) {
        return new HashSet<>(b(i5));
    }

    @d5.d
    public static final <E> LinkedHashSet<E> g(int i5) {
        return new LinkedHashSet<>(b(i5));
    }
}
