package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: _MapsJvm.kt */
@Metadata(d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ao\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001ap\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010\f\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\nj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`\u000bH\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001ao\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u001ao\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010\f\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\nj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"K", "V", "", "R", "", "Lkotlin/Function1;", "", "selector", "L0", "(Ljava/util/Map;Lld/l;)Ljava/util/Map$Entry;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "M0", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/Map$Entry;", "N0", "O0", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes7.dex */
class d1 extends c1 {
    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.x0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.internal.f
    private static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> L0(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愮\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愯\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = lVar.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R invoke2 = lVar.invoke(entry3);
                    if (invoke.compareTo(invoke2) < 0) {
                        entry2 = entry3;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.x0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.internal.f
    private static final /* synthetic */ <K, V> Map.Entry<K, V> M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愮\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愰\u0001"));
        return (Map.Entry) g0.V3(map.entrySet(), comparator);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.x0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> N0(Map<? extends K, ? extends V> map, ld.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愮\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愯\u0001"));
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = lVar.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R invoke2 = lVar.invoke(entry3);
                    if (invoke.compareTo(invoke2) > 0) {
                        entry2 = entry3;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.x0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Map.Entry O0(Map map, Comparator comparator) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("愮\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愰\u0001"));
        return (Map.Entry) g0.n4(map.entrySet(), comparator);
    }
}
