package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.reflect.KProperty;

/* compiled from: MapAccessors.kt */
@p3.i(name = "MapAccessorsKt")
@Metadata(d1 = {"\u0000.\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0001*\u0002H\u0002*\u0015\u0012\u0006\b\u0000\u0012\u00020\u0004\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u00050\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0087\n¢\u0006\u0002\u0010\n\u001aO\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0001*\u0002H\u0002*\u0017\u0012\u0006\b\u0000\u0012\u00020\u0004\u0012\u000b\b\u0001\u0012\u0007H\u0002¢\u0006\u0002\b\u00050\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0087\n¢\u0006\u0004\b\f\u0010\n\u001aF\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0006\b\u0000\u0012\u00020\u0004\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000f\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"getValue", "V1", "V", "", "", "Lkotlin/internal/Exact;", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "", "getVar", "setValue", "", "value", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z0 {
    @InlineOnly
    private static final <V, V1 extends V> V1 a(Map<? super String, ? extends V> map, Object obj, KProperty<?> kProperty) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("㸖"));
        kotlin.jvm.internal.l0.p(kProperty, ProtectedSandApp.s("㸗"));
        return (V1) d1.a(map, kProperty.getName());
    }

    @p3.i(name = "getVar")
    @InlineOnly
    private static final <V, V1 extends V> V1 b(Map<? super String, ? extends V> map, Object obj, KProperty<?> kProperty) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("㸘"));
        kotlin.jvm.internal.l0.p(kProperty, ProtectedSandApp.s("㸙"));
        return (V1) d1.a(map, kProperty.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <V> void c(Map<? super String, ? super V> map, Object obj, KProperty<?> kProperty, V v5) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("㸚"));
        kotlin.jvm.internal.l0.p(kProperty, ProtectedSandApp.s("㸛"));
        map.put(kProperty.getName(), v5);
    }
}
