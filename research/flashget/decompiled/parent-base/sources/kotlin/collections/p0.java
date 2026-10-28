package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: GroupingJVM.kt */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\u001a7\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aa\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\t\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u00020\nH\u0081\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"T", "K", "Lkotlin/collections/n0;", "", "", "a", "(Lkotlin/collections/n0;)Ljava/util/Map;", "V", "R", "", "Lkotlin/Function1;", "", "f", "b", "(Ljava/util/Map;Lld/l;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
@kotlin.jvm.internal.r1({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* loaded from: classes7.dex */
class p0 {
    @fg.l
    @kotlin.c1(version = "1.1")
    public static final <T, K> Map<K, Integer> a(@fg.l n0<T, ? extends K> n0Var) {
        kotlin.jvm.internal.l0.p(n0Var, ProtectedSandApp.s("懵\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b5 = n0Var.b();
        while (b5.hasNext()) {
            K a5 = n0Var.a(b5.next());
            Object obj = linkedHashMap.get(a5);
            if (obj == null && !linkedHashMap.containsKey(a5)) {
                obj = new k1.f();
            }
            k1.f fVar = (k1.f) obj;
            fVar.f75327b++;
            linkedHashMap.put(a5, fVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.l0.n(entry, ProtectedSandApp.s("懶\u0001"));
            kotlin.jvm.internal.u1.m(entry).setValue(Integer.valueOf(((k1.f) entry.getValue()).f75327b));
        }
        return kotlin.jvm.internal.u1.k(linkedHashMap);
    }

    @kotlin.w0
    @kotlin.internal.f
    private static final <K, V, R> Map<K, R> b(Map<K, V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("懵\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("懷\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.jvm.internal.l0.n(entry, ProtectedSandApp.s("懶\u0001"));
            kotlin.jvm.internal.u1.m(entry).setValue(lVar.invoke(entry));
        }
        return kotlin.jvm.internal.u1.k(map);
    }
}
