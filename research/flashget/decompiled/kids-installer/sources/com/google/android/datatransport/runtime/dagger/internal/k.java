package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: MapBuilder.java */
/* loaded from: classes2.dex */
public final class k<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, V> f12478a;

    private k(int i5) {
        this.f12478a = d.d(i5);
    }

    public static <K, V> k<K, V> b(int i5) {
        return new k<>(i5);
    }

    public Map<K, V> a() {
        return this.f12478a.size() != 0 ? Collections.unmodifiableMap(this.f12478a) : Collections.emptyMap();
    }

    public k<K, V> c(K k5, V v5) {
        this.f12478a.put(k5, v5);
        return this;
    }

    public k<K, V> d(Map<K, V> map) {
        this.f12478a.putAll(map);
        return this;
    }
}
