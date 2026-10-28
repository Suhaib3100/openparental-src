package com.google.common.cache;

import com.google.common.collect.h2;
import com.google.common.collect.h3;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* compiled from: ForwardingCache.java */
@d9.c
@g
/* loaded from: classes6.dex */
public abstract class h<K, V> extends h2 implements c<K, V> {

    /* compiled from: ForwardingCache.java */
    public static abstract class a<K, V> extends h<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final c<K, V> f55159b;

        protected a(c<K, V> cVar) {
            cVar.getClass();
            this.f55159b = cVar;
        }

        @Override // com.google.common.cache.h, com.google.common.collect.h2
        protected Object u3() {
            return this.f55159b;
        }

        @Override // com.google.common.cache.h
        /* renamed from: v3 */
        protected final c<K, V> u3() {
            return this.f55159b;
        }
    }

    protected h() {
    }

    @Override // com.google.common.cache.c
    @zc.a
    public V H1(Object obj) {
        return u3().H1(obj);
    }

    @Override // com.google.common.cache.c
    public ConcurrentMap<K, V> f() {
        return u3().f();
    }

    @Override // com.google.common.cache.c
    public void f2(Iterable<? extends Object> iterable) {
        u3().f2(iterable);
    }

    @Override // com.google.common.cache.c
    public V j0(K k4, Callable<? extends V> callable) throws ExecutionException {
        return u3().j0(k4, callable);
    }

    @Override // com.google.common.cache.c
    public h3<K, V> j3(Iterable<? extends Object> iterable) {
        return u3().j3(iterable);
    }

    @Override // com.google.common.cache.c
    public void l1(Object obj) {
        u3().l1(obj);
    }

    @Override // com.google.common.cache.c
    public void p() {
        u3().p();
    }

    @Override // com.google.common.cache.c
    public void put(K k4, V v4) {
        u3().put(k4, v4);
    }

    @Override // com.google.common.cache.c
    public void putAll(Map<? extends K, ? extends V> map) {
        u3().putAll(map);
    }

    @Override // com.google.common.cache.c
    public f s3() {
        return u3().s3();
    }

    @Override // com.google.common.cache.c
    public long size() {
        return u3().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h2
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public abstract c<K, V> u3();

    @Override // com.google.common.cache.c
    public void x() {
        u3().x();
    }
}
