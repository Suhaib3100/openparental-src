package com.google.common.collect;

import com.google.common.collect.r5;
import java.util.Map;

/* compiled from: RegularImmutableBiMap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
final class p5<K, V> extends z2<K, V> {

    /* renamed from: l, reason: collision with root package name */
    static final p5<Object, Object> f56171l = new p5<>();

    /* renamed from: g, reason: collision with root package name */
    @zc.a
    private final transient Object f56172g;

    /* renamed from: h, reason: collision with root package name */
    @d9.d
    final transient Object[] f56173h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f56174i;

    /* renamed from: j, reason: collision with root package name */
    private final transient int f56175j;

    /* renamed from: k, reason: collision with root package name */
    private final transient p5<V, K> f56176k;

    /* JADX WARN: Multi-variable type inference failed */
    private p5() {
        this.f56172g = null;
        this.f56173h = new Object[0];
        this.f56174i = 0;
        this.f56175j = 0;
        this.f56176k = this;
    }

    @Override // com.google.common.collect.z2, com.google.common.collect.w
    public w M2() {
        return this.f56176k;
    }

    @Override // com.google.common.collect.z2
    /* renamed from: O */
    public z2<V, K> M2() {
        return this.f56176k;
    }

    @Override // com.google.common.collect.h3, java.util.Map
    @zc.a
    public V get(@zc.a Object obj) {
        V v4 = (V) r5.N(this.f56172g, this.f56173h, this.f56175j, this.f56174i, obj);
        if (v4 == null) {
            return null;
        }
        return v4;
    }

    @Override // com.google.common.collect.h3
    q3<Map.Entry<K, V>> j() {
        return new r5.a(this, this.f56173h, this.f56174i, this.f56175j);
    }

    @Override // com.google.common.collect.h3
    q3<K> k() {
        return new r5.b(this, new r5.c(this.f56173h, this.f56174i, this.f56175j));
    }

    @Override // com.google.common.collect.h3
    boolean p() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f56175j;
    }

    p5(Object[] objArr, int i4) {
        this.f56173h = objArr;
        this.f56175j = i4;
        this.f56174i = 0;
        int v4 = i4 >= 2 ? q3.v(i4) : 0;
        this.f56172g = r5.M(objArr, i4, v4, 0);
        this.f56176k = new p5<>(r5.M(objArr, i4, v4, 1), objArr, i4, this);
    }

    private p5(@zc.a Object obj, Object[] objArr, int i4, p5<V, K> p5Var) {
        this.f56172g = obj;
        this.f56173h = objArr;
        this.f56174i = 1;
        this.f56175j = i4;
        this.f56176k = p5Var;
    }
}
