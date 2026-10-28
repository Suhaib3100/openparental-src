package dagger.internal;

import dagger.internal.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MapProviderFactory.java */
/* loaded from: classes6.dex */
public final class q<K, V> extends dagger.internal.a<K, V, t<V>> implements d3.e<Map<K, t<V>>> {

    /* compiled from: MapProviderFactory.java */
    /* loaded from: classes5.dex */
    public static final class b<K, V> extends a.AbstractC0244a<K, V, t<V>> {

        /* compiled from: MapProviderFactory.java */
        /* loaded from: classes6.dex */
        class a implements t<Map<K, t<V>>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h3.c f22376a;

            a(h3.c cVar) {
                this.f22376a = cVar;
            }

            @Override // h3.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<K, t<V>> get() {
                Map map = (Map) this.f22376a.get();
                if (map.isEmpty()) {
                    return Collections.emptyMap();
                }
                LinkedHashMap d6 = d.d(map.size());
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    d6.put(entry.getKey(), v.a((h3.c) entry.getValue()));
                }
                return Collections.unmodifiableMap(d6);
            }
        }

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

        public q<K, V> c() {
            return new q<>(this.f22359a, null);
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
        public b<K, V> f(t<Map<K, t<V>>> tVar) {
            super.b(tVar);
            return this;
        }

        @Deprecated
        public b<K, V> g(h3.c<Map<K, h3.c<V>>> cVar) {
            super.b(new a(cVar));
            return this;
        }

        b(int i5, a aVar) {
            super(i5);
        }
    }

    private q(Map<K, t<V>> map) {
        super(map);
    }

    public static <K, V> b<K, V> c(int i5) {
        return new b<>(i5, null);
    }

    public Map<K, t<V>> d() {
        return b();
    }

    @Override // h3.c
    public Object get() {
        return b();
    }

    q(Map map, a aVar) {
        super(map);
    }
}
