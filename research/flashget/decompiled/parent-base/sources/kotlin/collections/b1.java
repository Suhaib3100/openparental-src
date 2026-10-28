package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapsJVM.kt */
@Metadata(d1 = {"\u0000d\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aP\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012#\u0010\u000b\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0081\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aX\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000f\u001a\u00020\u000e2#\u0010\u000b\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001a\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aA\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b!\u0010\"\u001aG\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010$\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000#¢\u0006\u0004\b%\u0010&\u001a[\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0001\u0010\u00012*\u0010(\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020'\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b)\u0010*\u001ac\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010$\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000#2*\u0010(\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020'\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b+\u0010,\u001a \u0010/\u001a\u00020.*\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0\u0004H\u0087\b¢\u0006\u0004\b/\u00100\u001a8\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0081\b¢\u0006\u0004\b1\u0010\u0018\u001a9\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000¢\u0006\u0004\b2\u0010\u0018\u001a\u0017\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000eH\u0001¢\u0006\u0004\b4\u00105\"\u0014\u00108\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, d2 = {"K", "V", "Lkotlin/q0;", "pair", "", "k", "(Lkotlin/q0;)Ljava/util/Map;", "Lkotlin/Function1;", "", "Lkotlin/k2;", "Lkotlin/u;", "builderAction", "f", "(Lld/l;)Ljava/util/Map;", "", "capacity", "e", "(ILld/l;)Ljava/util/Map;", "g", "()Ljava/util/Map;", "h", "(I)Ljava/util/Map;", "builder", "d", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentMap;", "key", "Lkotlin/Function0;", "defaultValue", "i", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "", "Ljava/util/SortedMap;", "q", "(Ljava/util/Map;)Ljava/util/SortedMap;", "Ljava/util/Comparator;", "comparator", "r", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/SortedMap;", "", "pairs", "m", "([Lkotlin/q0;)Ljava/util/SortedMap;", "l", "(Ljava/util/Comparator;[Lkotlin/q0;)Ljava/util/SortedMap;", "", "Ljava/util/Properties;", "n", "(Ljava/util/Map;)Ljava/util/Properties;", "p", "o", "expectedSize", "j", "(I)I", "a", "I", "INT_MAX_POWER_OF_TWO", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@kotlin.jvm.internal.r1({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* loaded from: classes7.dex */
public class b1 extends a1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f74833a = 1073741824;

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <K, V> Map<K, V> d(@fg.l Map<K, V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("惄\u0001"));
        return ((kotlin.collections.builders.d) map).o();
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    @kotlin.internal.f
    private static final <K, V> Map<K, V> e(int i4, ld.l<? super Map<K, V>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("情\u0001"));
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d(i4);
        lVar.invoke(dVar);
        return d(dVar);
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    @kotlin.internal.f
    private static final <K, V> Map<K, V> f(ld.l<? super Map<K, V>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("情\u0001"));
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        lVar.invoke(dVar);
        return d(dVar);
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <K, V> Map<K, V> g() {
        return new kotlin.collections.builders.d();
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <K, V> Map<K, V> h(int i4) {
        return new kotlin.collections.builders.d(i4);
    }

    public static final <K, V> V i(@fg.l ConcurrentMap<K, V> concurrentMap, K k4, @fg.l ld.a<? extends V> aVar) {
        kotlin.jvm.internal.l0.p(concurrentMap, ProtectedSandApp.s("惆\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("惇\u0001"));
        V v4 = concurrentMap.get(k4);
        if (v4 != null) {
            return v4;
        }
        V invoke = aVar.invoke();
        V putIfAbsent = concurrentMap.putIfAbsent(k4, invoke);
        return putIfAbsent == null ? invoke : putIfAbsent;
    }

    @kotlin.w0
    public static int j(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @fg.l
    public static <K, V> Map<K, V> k(@fg.l kotlin.q0<? extends K, ? extends V> q0Var) {
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("惈\u0001"));
        Map<K, V> singletonMap = Collections.singletonMap(q0Var.e(), q0Var.f());
        kotlin.jvm.internal.l0.o(singletonMap, ProtectedSandApp.s("惉\u0001"));
        return singletonMap;
    }

    @fg.l
    @kotlin.c1(version = "1.4")
    public static final <K, V> SortedMap<K, V> l(@fg.l Comparator<? super K> comparator, @fg.l kotlin.q0<? extends K, ? extends V>... q0VarArr) {
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("惊\u0001"));
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("惋\u0001"));
        TreeMap treeMap = new TreeMap(comparator);
        c1.y0(treeMap, q0VarArr);
        return treeMap;
    }

    @fg.l
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@fg.l kotlin.q0<? extends K, ? extends V>... q0VarArr) {
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("惋\u0001"));
        TreeMap treeMap = new TreeMap();
        c1.y0(treeMap, q0VarArr);
        return treeMap;
    }

    @kotlin.internal.f
    private static final Properties n(Map<String, String> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("惆\u0001"));
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @fg.l
    public static final <K, V> Map<K, V> o(@fg.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("惆\u0001"));
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.l0.o(singletonMap, ProtectedSandApp.s("惌\u0001"));
        return singletonMap;
    }

    @kotlin.internal.f
    private static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("惆\u0001"));
        return o(map);
    }

    @fg.l
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> q(@fg.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("惆\u0001"));
        return new TreeMap(map);
    }

    @fg.l
    public static <K, V> SortedMap<K, V> r(@fg.l Map<? extends K, ? extends V> map, @fg.l Comparator<? super K> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("惆\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("惊\u0001"));
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
