package ed;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import kd.i;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;

/* compiled from: Collections.kt */
@i(name = "CollectionsJDK8Kt")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aC\u0010\u0006\u001a\u00028\u0001\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000\"\u0004\b\u0001\u0010\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aJ\u0010\u000b\u001a\u00020\n\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000\"\t\b\u0001\u0010\u0002¢\u0006\u0002\b\u0000*\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0087\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/internal/j;", "K", "V", "", "key", "defaultValue", "a", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "value", "", "b", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @c1(version = "1.2")
    @f
    private static final <K, V> V a(Map<? extends K, ? extends V> map, K k4, V v4) {
        l0.p(map, ProtectedSandApp.s("总\u0001"));
        return map.getOrDefault(k4, v4);
    }

    @c1(version = "1.2")
    @f
    private static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k4, V v4) {
        l0.p(map, ProtectedSandApp.s("总\u0001"));
        return u1.k(map).remove(k4, v4);
    }
}
