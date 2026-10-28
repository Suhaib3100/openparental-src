package com.bumptech.glide.util;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes3.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {
    private int B;

    @Override // androidx.collection.i, java.util.Map
    public void clear() {
        this.B = 0;
        super.clear();
    }

    @Override // androidx.collection.i, java.util.Map
    public int hashCode() {
        if (this.B == 0) {
            this.B = super.hashCode();
        }
        return this.B;
    }

    @Override // androidx.collection.i
    public void m(androidx.collection.i<? extends K, ? extends V> iVar) {
        this.B = 0;
        super.m(iVar);
    }

    @Override // androidx.collection.i
    public V n(int i5) {
        this.B = 0;
        return (V) super.n(i5);
    }

    @Override // androidx.collection.i
    public V p(int i5, V v5) {
        this.B = 0;
        return (V) super.p(i5, v5);
    }

    @Override // androidx.collection.i, java.util.Map
    public V put(K k5, V v5) {
        this.B = 0;
        return (V) super.put(k5, v5);
    }
}
