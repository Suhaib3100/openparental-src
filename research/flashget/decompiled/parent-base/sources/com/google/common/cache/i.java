package com.google.common.cache;

import com.google.common.collect.h3;
import java.util.concurrent.ExecutionException;

/* compiled from: ForwardingLoadingCache.java */
@d9.c
@g
/* loaded from: classes6.dex */
public abstract class i<K, V> extends h<K, V> implements j<K, V> {

    /* compiled from: ForwardingLoadingCache.java */
    public static abstract class a<K, V> extends i<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final j<K, V> f55160b;

        protected a(j<K, V> jVar) {
            jVar.getClass();
            this.f55160b = jVar;
        }

        @Override // com.google.common.cache.i
        /* renamed from: A3 */
        protected final j<K, V> u3() {
            return this.f55160b;
        }

        @Override // com.google.common.cache.i, com.google.common.cache.h, com.google.common.collect.h2
        protected Object u3() {
            return this.f55160b;
        }

        @Override // com.google.common.cache.i, com.google.common.cache.h
        /* renamed from: v3 */
        protected c u3() {
            return this.f55160b;
        }
    }

    protected i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.cache.h
    /* renamed from: A3, reason: merged with bridge method [inline-methods] */
    public abstract j<K, V> u3();

    @Override // com.google.common.cache.j
    public void H2(K k4) {
        u3().H2(k4);
    }

    @Override // com.google.common.cache.j
    public V X(K k4) {
        return u3().X(k4);
    }

    @Override // com.google.common.cache.j, com.google.common.base.x
    public V apply(K k4) {
        return u3().apply(k4);
    }

    @Override // com.google.common.cache.j
    public V get(K k4) throws ExecutionException {
        return u3().get(k4);
    }

    @Override // com.google.common.cache.j
    public h3<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException {
        return u3().r0(iterable);
    }
}
