package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MapWithDefault.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\t\u001aX\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\tH\u0007¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"getOrImplicitDefault", "V", "K", "", "key", "getOrImplicitDefaultNullable", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "withDefault", "defaultValue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "withDefaultMutable", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
/* loaded from: classes5.dex */
class d1 {
    @p3.i(name = "getOrImplicitDefaultNullable")
    @PublishedApi
    public static final <K, V> V a(@d5.d Map<K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("㞢"));
        if (map instanceof MapWithDefault) {
            return (V) ((MapWithDefault) map).o(k5);
        }
        V v5 = map.get(k5);
        if (v5 != null || map.containsKey(k5)) {
            return v5;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("㞣") + k5 + ProtectedSandApp.s("㞤"));
    }

    @d5.d
    public static final <K, V> Map<K, V> b(@d5.d Map<K, ? extends V> map, @d5.d q3.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("㞥"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㞦"));
        return map instanceof MapWithDefault ? b(((MapWithDefault) map).i(), lVar) : new MapWithDefaultImpl(map, lVar);
    }

    @p3.i(name = "withDefaultMutable")
    @d5.d
    public static final <K, V> Map<K, V> c(@d5.d Map<K, V> map, @d5.d q3.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("㞧"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㞨"));
        return map instanceof MutableMapWithDefault ? c(((MutableMapWithDefault) map).i(), lVar) : new MutableMapWithDefaultImpl(map, lVar);
    }
}
