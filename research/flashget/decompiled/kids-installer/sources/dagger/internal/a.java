package dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AbstractMapFactory.java */
/* loaded from: classes6.dex */
abstract class a<K, V, V2> implements h<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, t<V>> f22358a;

    /* compiled from: AbstractMapFactory.java */
    /* renamed from: dagger.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC0244a<K, V, V2> {

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashMap<K, t<V>> f22359a;

        AbstractC0244a(int i5) {
            this.f22359a = d.d(i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        AbstractC0244a<K, V, V2> a(K k5, t<V> tVar) {
            this.f22359a.put(s.c(k5, ProtectedSandApp.s("㚿")), s.c(tVar, ProtectedSandApp.s("㛀")));
            return this;
        }

        AbstractC0244a<K, V, V2> b(t<Map<K, V2>> tVar) {
            if (tVar instanceof f) {
                return b(((f) tVar).a());
            }
            this.f22359a.putAll(((a) tVar).f22358a);
            return this;
        }
    }

    a(Map<K, t<V>> map) {
        this.f22358a = Collections.unmodifiableMap(map);
    }

    final Map<K, t<V>> b() {
        return this.f22358a;
    }
}
