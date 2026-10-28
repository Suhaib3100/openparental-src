package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: MapBuilder.java */
/* loaded from: classes5.dex */
public final class o<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, V> f22374a;

    private o(int i5) {
        this.f22374a = d.d(i5);
    }

    public static <K, V> o<K, V> b(int i5) {
        return new o<>(i5);
    }

    public Map<K, V> a() {
        return this.f22374a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22374a);
    }

    public o<K, V> c(K k5, V v5) {
        this.f22374a.put(k5, v5);
        return this;
    }

    public o<K, V> d(Map<K, V> map) {
        this.f22374a.putAll(map);
        return this;
    }
}
