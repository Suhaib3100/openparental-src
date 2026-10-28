package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* compiled from: AbstractMapEntry.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class g<K, V> implements Map.Entry<K, V> {
    g() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return com.google.common.base.f0.a(getKey(), entry.getKey()) && com.google.common.base.f0.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    @f5
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @f5
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    @f5
    public V setValue(@f5 V v4) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return com.google.common.base.h.a(valueOf2.length() + valueOf.length() + 1, valueOf, ProtectedSandApp.s("\uf460"), valueOf2);
    }
}
