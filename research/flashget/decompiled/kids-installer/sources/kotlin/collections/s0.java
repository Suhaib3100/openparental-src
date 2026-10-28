package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.k1;

/* compiled from: GroupingJVM.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001aZ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u00072\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0081\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"eachCount", "", "K", "", "T", "Lkotlin/collections/Grouping;", "mapValuesInPlace", "", "R", "V", "f", "Lkotlin/Function1;", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
@SourceDebugExtension({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* loaded from: classes5.dex */
class s0 {
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T, K> Map<K, Integer> a(@d5.d Grouping<T, ? extends K> grouping) {
        kotlin.jvm.internal.l0.p(grouping, ProtectedSandApp.s("㠤"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b6 = grouping.b();
        while (b6.hasNext()) {
            K a6 = grouping.a(b6.next());
            Object obj = linkedHashMap.get(a6);
            if (obj == null && !linkedHashMap.containsKey(a6)) {
                obj = new k1.f();
            }
            k1.f fVar = (k1.f) obj;
            fVar.f23570o++;
            linkedHashMap.put(a6, fVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.l0.n(entry, ProtectedSandApp.s("㠥"));
            kotlin.jvm.internal.u1.m(entry).setValue(Integer.valueOf(((k1.f) entry.getValue()).f23570o));
        }
        return kotlin.jvm.internal.u1.k(linkedHashMap);
    }

    @PublishedApi
    @InlineOnly
    private static final <K, V, R> Map<K, R> b(Map<K, V> map, q3.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("㠦"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㠧"));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.jvm.internal.l0.n(entry, ProtectedSandApp.s("㠨"));
            kotlin.jvm.internal.u1.m(entry).setValue(lVar.N(entry));
        }
        return kotlin.jvm.internal.u1.k(map);
    }
}
