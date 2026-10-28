package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.a;
import java.util.Map;

/* compiled from: MapProviderFactory.java */
/* loaded from: classes4.dex */
public final class m<K, V> extends com.google.android.datatransport.runtime.dagger.internal.a<K, V, h3.c<V>> implements h1.e<Map<K, h3.c<V>>> {

    /* compiled from: MapProviderFactory.java */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends a.AbstractC0162a<K, V, h3.c<V>> {
        private b(int i5) {
            super(i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.a.AbstractC0162a
        public a.AbstractC0162a a(Object obj, h3.c cVar) {
            super.a(obj, cVar);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.a.AbstractC0162a
        public a.AbstractC0162a b(h3.c cVar) {
            super.b(cVar);
            return this;
        }

        public m<K, V> c() {
            return new m<>(this.f12469a, null);
        }

        public b<K, V> d(K k5, h3.c<V> cVar) {
            super.a(k5, cVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<K, V> e(h3.c<Map<K, h3.c<V>>> cVar) {
            super.b(cVar);
            return this;
        }

        b(int i5, a aVar) {
            super(i5);
        }
    }

    private m(Map<K, h3.c<V>> map) {
        super(map);
    }

    public static <K, V> b<K, V> c(int i5) {
        return new b<>(i5, null);
    }

    public Map<K, h3.c<V>> d() {
        return b();
    }

    @Override // h3.c
    public Object get() {
        return b();
    }

    m(Map map, a aVar) {
        super(map);
    }
}
