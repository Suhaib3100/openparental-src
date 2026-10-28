package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: MapBuilder.java */
/* loaded from: classes7.dex */
public final class o<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, V> f73688a;

    private o(int i4) {
        this.f73688a = d.d(i4);
    }

    public static <K, V> o<K, V> b(int i4) {
        return new o<>(i4);
    }

    public Map<K, V> a() {
        return this.f73688a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f73688a);
    }

    public o<K, V> c(K k4, V v4) {
        this.f73688a.put(k4, v4);
        return this;
    }

    public o<K, V> d(Map<K, V> map) {
        this.f73688a.putAll(map);
        return this;
    }
}
