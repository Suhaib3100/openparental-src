package com.google.common.graph;

import java.util.Map;

/* compiled from: MapRetrievalCache.java */
@t
/* loaded from: classes6.dex */
final class n0<K, V> extends m0<K, V> {

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private volatile transient a<K, V> f56842c;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private volatile transient a<K, V> f56843d;

    /* compiled from: MapRetrievalCache.java */
    private static final class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f56844a;

        /* renamed from: b, reason: collision with root package name */
        final V f56845b;

        a(K k4, V v4) {
            this.f56844a = k4;
            this.f56845b = v4;
        }
    }

    n0(Map<K, V> map) {
        super(map);
    }

    private void l(a<K, V> aVar) {
        this.f56843d = this.f56842c;
        this.f56842c = aVar;
    }

    private void m(K k4, V v4) {
        l(new a<>(k4, v4));
    }

    @Override // com.google.common.graph.m0
    void d() {
        super.d();
        this.f56842c = null;
        this.f56843d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.m0
    @zc.a
    V f(Object obj) {
        obj.getClass();
        V g4 = g(obj);
        if (g4 != null) {
            return g4;
        }
        V h4 = h(obj);
        if (h4 != null) {
            m(obj, h4);
        }
        return h4;
    }

    @Override // com.google.common.graph.m0
    @zc.a
    V g(@zc.a Object obj) {
        V v4 = (V) super.g(obj);
        if (v4 != null) {
            return v4;
        }
        a<K, V> aVar = this.f56842c;
        if (aVar != null && aVar.f56844a == obj) {
            return aVar.f56845b;
        }
        a<K, V> aVar2 = this.f56843d;
        if (aVar2 == null || aVar2.f56844a != obj) {
            return null;
        }
        l(aVar2);
        return aVar2.f56845b;
    }
}
