package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MapFactory.java */
/* loaded from: classes4.dex */
public final class l<K, V> extends com.google.android.datatransport.runtime.dagger.internal.a<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final h3.c<Map<Object, Object>> f12479b = j.a(Collections.emptyMap());

    /* compiled from: MapFactory.java */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends a.AbstractC0162a<K, V, V> {
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

        public l<K, V> c() {
            return new l<>(this.f12469a, null);
        }

        public b<K, V> d(K k5, h3.c<V> cVar) {
            super.a(k5, cVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<K, V> e(h3.c<Map<K, V>> cVar) {
            super.b(cVar);
            return this;
        }

        b(int i5, a aVar) {
            super(i5);
        }
    }

    private l(Map<K, h3.c<V>> map) {
        super(map);
    }

    public static <K, V> b<K, V> c(int i5) {
        return new b<>(i5, null);
    }

    public static <K, V> h3.c<Map<K, V>> d() {
        return (h3.c<Map<K, V>>) f12479b;
    }

    @Override // h3.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap d6 = d.d(b().size());
        for (Map.Entry<K, h3.c<V>> entry : b().entrySet()) {
            d6.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(d6);
    }

    l(Map map, a aVar) {
        super(map);
    }
}
