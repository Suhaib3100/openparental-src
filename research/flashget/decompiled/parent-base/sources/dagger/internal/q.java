package dagger.internal;

import dagger.internal.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MapProviderFactory.java */
/* loaded from: classes7.dex */
public final class q<K, V> extends dagger.internal.a<K, V, t<V>> implements vc.e<Map<K, t<V>>> {

    /* compiled from: MapProviderFactory.java */
    public static final class b<K, V> extends a.AbstractC1017a<K, V, t<V>> {

        /* compiled from: MapProviderFactory.java */
        class a implements t<Map<K, t<V>>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ cd.c f73690a;

            a(cd.c cVar) {
                this.f73690a = cVar;
            }

            @Override // cd.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<K, t<V>> get() {
                Map map = (Map) this.f73690a.get();
                if (map.isEmpty()) {
                    return Collections.emptyMap();
                }
                LinkedHashMap d5 = d.d(map.size());
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    d5.put(entry.getKey(), v.a((cd.c) entry.getValue()));
                }
                return Collections.unmodifiableMap(d5);
            }
        }

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

        public q<K, V> c() {
            return new q<>(this.f73673a);
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
        public b<K, V> f(cd.c<Map<K, cd.c<V>>> cVar) {
            super.b(new a(cVar));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<K, V> g(t<Map<K, t<V>>> tVar) {
            super.b(tVar);
            return this;
        }

        b(int i4, a aVar) {
            super(i4);
        }
    }

    private q(Map<K, t<V>> map) {
        super(map);
    }

    public static <K, V> b<K, V> c(int i4) {
        return new b<>(i4);
    }

    public Map<K, t<V>> d() {
        return b();
    }

    @Override // cd.c
    public Object get() {
        return b();
    }

    q(Map map, a aVar) {
        super(map);
    }
}
