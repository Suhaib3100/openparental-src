package androidx.arch.core.internal;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.arch.core.internal.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f2083f = new HashMap<>();

    @Override // androidx.arch.core.internal.b
    @q0
    protected b.c<K, V> c(K k4) {
        return this.f2083f.get(k4);
    }

    public boolean contains(K k4) {
        return this.f2083f.containsKey(k4);
    }

    @Override // androidx.arch.core.internal.b
    public V j(@o0 K k4, @o0 V v4) {
        b.c<K, V> c5 = c(k4);
        if (c5 != null) {
            return c5.f2089c;
        }
        this.f2083f.put(k4, i(k4, v4));
        return null;
    }

    @Override // androidx.arch.core.internal.b
    public V l(@o0 K k4) {
        V v4 = (V) super.l(k4);
        this.f2083f.remove(k4);
        return v4;
    }

    @q0
    public Map.Entry<K, V> m(K k4) {
        if (contains(k4)) {
            return this.f2083f.get(k4).f2091e;
        }
        return null;
    }
}
