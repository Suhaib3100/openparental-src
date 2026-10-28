package dagger.internal;

import dagger.internal.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MapFactory.java */
/* loaded from: classes7.dex */
public final class p<K, V> extends dagger.internal.a<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final t<Map<Object, Object>> f73689b = l.a(Collections.emptyMap());

    /* compiled from: MapFactory.java */
    public static final class b<K, V> extends a.AbstractC1017a<K, V, V> {
        private b(int i4) {
            super(i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.a.AbstractC1017a
        public a.AbstractC1017a a(Object obj, t tVar) {
            super.a(obj, tVar);
            return this;
        }

        @Override // dagger.internal.a.AbstractC1017a
        public a.AbstractC1017a b(t tVar) {
            super.b(tVar);
            return this;
        }

        public p<K, V> c() {
            return new p<>(this.f73673a);
        }

        @Deprecated
        public b<K, V> d(K k4, cd.c<V> cVar) {
            super.a(k4, v.a(cVar));
            return this;
        }

        public b<K, V> e(K k4, t<V> tVar) {
            super.a(k4, tVar);
            return this;
        }

        @Deprecated
        public b<K, V> f(cd.c<Map<K, V>> cVar) {
            super.b(v.a(cVar));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<K, V> g(t<Map<K, V>> tVar) {
            super.b(tVar);
            return this;
        }

        b(int i4, a aVar) {
            super(i4);
        }
    }

    private p(Map<K, t<V>> map) {
        super(map);
    }

    public static <K, V> b<K, V> c(int i4) {
        return new b<>(i4);
    }

    public static <K, V> t<Map<K, V>> d() {
        return (t<Map<K, V>>) f73689b;
    }

    @Override // cd.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap d5 = d.d(b().size());
        for (Map.Entry<K, t<V>> entry : b().entrySet()) {
            d5.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(d5);
    }

    p(Map map, a aVar) {
        super(map);
    }
}
