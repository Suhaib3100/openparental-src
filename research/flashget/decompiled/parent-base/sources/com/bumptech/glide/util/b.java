package com.bumptech.glide.util;

import androidx.collection.a3;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes3.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private int f44950b;

    @Override // androidx.collection.a3, java.util.Map
    public void clear() {
        this.f44950b = 0;
        super.clear();
    }

    @Override // androidx.collection.a3, java.util.Map
    public int hashCode() {
        if (this.f44950b == 0) {
            this.f44950b = super.hashCode();
        }
        return this.f44950b;
    }

    @Override // androidx.collection.a3, java.util.Map
    public V put(K k4, V v4) {
        this.f44950b = 0;
        return (V) super.put(k4, v4);
    }

    @Override // androidx.collection.a3
    public void putAll(a3<? extends K, ? extends V> a3Var) {
        this.f44950b = 0;
        super.putAll(a3Var);
    }

    @Override // androidx.collection.a3
    public V removeAt(int i4) {
        this.f44950b = 0;
        return (V) super.removeAt(i4);
    }

    @Override // androidx.collection.a3
    public V setValueAt(int i4, V v4) {
        this.f44950b = 0;
        return (V) super.setValueAt(i4, v4);
    }
}
