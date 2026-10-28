package dagger.internal;

import dagger.internal.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MapFactory.java */
/* loaded from: classes6.dex */
public final class p<K, V> extends dagger.internal.a<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final t<Map<Object, Object>> f22375b = l.a(Collections.emptyMap());

    /* compiled from: MapFactory.java */
    /* loaded from: classes5.dex */
    public static final class b<K, V> extends a.AbstractC0244a<K, V, V> {
        private b(int i5) {
            super(i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.a.AbstractC0244a
        public a.AbstractC0244a a(Object obj, t tVar) {
            super.a(obj, tVar);
            return this;
        }

        @Override // dagger.internal.a.AbstractC0244a
        public a.AbstractC0244a b(t tVar) {
            super.b(tVar);
            return this;
        }

        public p<K, V> c() {
            return new p<>(this.f22359a, null);
        }

        public b<K, V> d(K k5, t<V> tVar) {
            super.a(k5, tVar);
            return this;
        }

        @Deprecated
        public b<K, V> e(K k5, h3.c<V> cVar) {
            super.a(k5, v.a(cVar));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<K, V> f(t<Map<K, V>> tVar) {
            super.b(tVar);
            return this;
        }

        @Deprecated
        public b<K, V> g(h3.c<Map<K, V>> cVar) {
            super.b(v.a(cVar));
            return this;
        }

        b(int i5, a aVar) {
            super(i5);
        }
    }

    private p(Map<K, t<V>> map) {
        super(map);
    }

    public static <K, V> b<K, V> c(int i5) {
        return new b<>(i5, null);
    }

    public static <K, V> t<Map<K, V>> d() {
        return (t<Map<K, V>>) f22375b;
    }

    @Override // h3.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap d6 = d.d(b().size());
        for (Map.Entry<K, t<V>> entry : b().entrySet()) {
            d6.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(d6);
    }

    p(Map map, a aVar) {
        super(map);
    }
}
