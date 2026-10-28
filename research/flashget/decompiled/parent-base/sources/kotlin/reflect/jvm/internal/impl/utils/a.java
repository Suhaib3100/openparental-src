package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: collections.kt */
@r1({"SMAP\ncollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1208#2,2:111\n1238#2,4:113\n1#3:117\n*S KotlinDebug\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n22#1:111,2\n22#1:113,4\n*E\n"})
/* loaded from: classes7.dex */
public final class a {
    public static final <T> void a(@l Collection<T> collection, @m T t4) {
        l0.p(collection, ProtectedSandApp.s("脺\u0001"));
        if (t4 != null) {
            collection.add(t4);
        }
    }

    private static final int b(int i4) {
        if (i4 < 3) {
            return 3;
        }
        return (i4 / 3) + i4 + 1;
    }

    @l
    public static final <T> List<T> c(@l ArrayList<T> arrayList) {
        l0.p(arrayList, ProtectedSandApp.s("脺\u0001"));
        int size = arrayList.size();
        if (size == 0) {
            return j0.f74919b;
        }
        if (size == 1) {
            return w.k(w.B2(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @l
    public static final <K> Map<K, Integer> d(@l Iterable<? extends K> iterable) {
        l0.p(iterable, ProtectedSandApp.s("脺\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i4));
            i4++;
        }
        return linkedHashMap;
    }

    @l
    public static final <K, V> HashMap<K, V> e(int i4) {
        return new HashMap<>(b(i4));
    }

    @l
    public static final <E> HashSet<E> f(int i4) {
        return new HashSet<>(b(i4));
    }

    @l
    public static final <E> LinkedHashSet<E> g(int i4) {
        return new LinkedHashSet<>(b(i4));
    }
}
