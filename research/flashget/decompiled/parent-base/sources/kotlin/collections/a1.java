package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: MapWithDefault.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aX\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b\u001aZ\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"K", "V", "", "key", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "defaultValue", "b", "(Ljava/util/Map;Lld/l;)Ljava/util/Map;", "", "c", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@kotlin.jvm.internal.r1({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
/* loaded from: classes7.dex */
class a1 {
    @kd.i(name = "getOrImplicitDefaultNullable")
    @kotlin.w0
    public static final <K, V> V a(@fg.l Map<K, ? extends V> map, K k4) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("悸\u0001"));
        if (map instanceof x0) {
            return (V) ((x0) map).e2(k4);
        }
        V v4 = map.get(k4);
        if (v4 != null || map.containsKey(k4)) {
            return v4;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("悹\u0001") + k4 + ProtectedSandApp.s("悺\u0001"));
    }

    @fg.l
    public static final <K, V> Map<K, V> b(@fg.l Map<K, ? extends V> map, @fg.l ld.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("悸\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悻\u0001"));
        return map instanceof x0 ? b(((x0) map).getMap(), lVar) : new y0(map, lVar);
    }

    @fg.l
    @kd.i(name = "withDefaultMutable")
    public static final <K, V> Map<K, V> c(@fg.l Map<K, V> map, @fg.l ld.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("悸\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悻\u0001"));
        return map instanceof g1 ? c(((g1) map).getMap(), lVar) : new h1(map, lVar);
    }
}
