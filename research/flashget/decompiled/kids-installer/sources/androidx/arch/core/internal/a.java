package androidx.arch.core.internal;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.arch.core.internal.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: s, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f1424s = new HashMap<>();

    public boolean contains(K k5) {
        return this.f1424s.containsKey(k5);
    }

    @Override // androidx.arch.core.internal.b
    protected b.c<K, V> f(K k5) {
        return this.f1424s.get(k5);
    }

    @Override // androidx.arch.core.internal.b
    public V o(@o0 K k5, @o0 V v5) {
        b.c<K, V> f6 = f(k5);
        if (f6 != null) {
            return f6.f1430p;
        }
        this.f1424s.put(k5, i(k5, v5));
        return null;
    }

    @Override // androidx.arch.core.internal.b
    public V p(@o0 K k5) {
        V v5 = (V) super.p(k5);
        this.f1424s.remove(k5);
        return v5;
    }

    public Map.Entry<K, V> q(K k5) {
        if (contains(k5)) {
            return this.f1424s.get(k5).f1432r;
        }
        return null;
    }
}
