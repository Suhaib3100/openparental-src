package dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AbstractMapFactory.java */
/* loaded from: classes7.dex */
abstract class a<K, V, V2> implements h<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, t<V>> f73672a;

    /* compiled from: AbstractMapFactory.java */
    /* renamed from: dagger.internal.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1017a<K, V, V2> {

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashMap<K, t<V>> f73673a;

        AbstractC1017a(int i4) {
            this.f73673a = d.d(i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        AbstractC1017a<K, V, V2> a(K k4, t<V> tVar) {
            this.f73673a.put(s.c(k4, ProtectedSandApp.s("彮\u0001")), s.c(tVar, ProtectedSandApp.s("彯\u0001")));
            return this;
        }

        AbstractC1017a<K, V, V2> b(t<Map<K, V2>> tVar) {
            if (tVar instanceof f) {
                return b(((f) tVar).a());
            }
            this.f73673a.putAll(((a) tVar).f73672a);
            return this;
        }
    }

    a(Map<K, t<V>> map) {
        this.f73672a = Collections.unmodifiableMap(map);
    }

    final Map<K, t<V>> b() {
        return this.f73672a;
    }
}
