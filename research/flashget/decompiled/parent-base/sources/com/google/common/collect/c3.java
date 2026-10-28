package com.google.common.collect;

import java.io.Serializable;

/* compiled from: ImmutableEntry.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
class c3<K, V> extends g<K, V> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f55434d = 0;

    /* renamed from: b, reason: collision with root package name */
    @f5
    final K f55435b;

    /* renamed from: c, reason: collision with root package name */
    @f5
    final V f55436c;

    c3(@f5 K k4, @f5 V v4) {
        this.f55435b = k4;
        this.f55436c = v4;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @f5
    public final K getKey() {
        return this.f55435b;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @f5
    public final V getValue() {
        return this.f55436c;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @f5
    public final V setValue(@f5 V v4) {
        throw new UnsupportedOperationException();
    }
}
