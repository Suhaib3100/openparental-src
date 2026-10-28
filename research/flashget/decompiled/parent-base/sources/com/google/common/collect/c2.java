package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* compiled from: ForwardingMapEntry.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class c2<K, V> extends h2 implements Map.Entry<K, V> {
    protected c2() {
    }

    protected boolean A3(@zc.a Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return com.google.common.base.f0.a(getKey(), entry.getKey()) && com.google.common.base.f0.a(getValue(), entry.getValue());
    }

    protected int E3() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @d9.a
    protected String F3() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return com.google.common.base.h.a(valueOf2.length() + valueOf.length() + 1, valueOf, ProtectedSandApp.s("\uf441"), valueOf2);
    }

    @Override // java.util.Map.Entry
    public boolean equals(@zc.a Object obj) {
        return u3().equals(obj);
    }

    @Override // java.util.Map.Entry
    @f5
    public K getKey() {
        return u3().getKey();
    }

    @Override // java.util.Map.Entry
    @f5
    public V getValue() {
        return u3().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return u3().hashCode();
    }

    @f5
    public V setValue(@f5 V v4) {
        return u3().setValue(v4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h2
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry<K, V> u3();
}
