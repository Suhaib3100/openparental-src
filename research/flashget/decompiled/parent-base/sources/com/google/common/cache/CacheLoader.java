package com.google.common.cache;

import com.google.common.base.u0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.a1;
import com.google.common.util.concurrent.s0;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@g
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public abstract class CacheLoader<K, V> {

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    class a extends CacheLoader<K, V> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f55093c;

        /* renamed from: com.google.common.cache.CacheLoader$a$a, reason: collision with other inner class name */
        class CallableC0832a implements Callable<V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f55094a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f55095b;

            CallableC0832a(Object obj, Object obj2) {
                this.f55094a = obj;
                this.f55095b = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
                return CacheLoader.this.f(this.f55094a, this.f55095b).get();
            }
        }

        a(Executor executor) {
            this.f55093c = executor;
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(K k4) throws Exception {
            return (V) CacheLoader.this.d(k4);
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> e(Iterable<? extends K> iterable) throws Exception {
            return CacheLoader.this.e(iterable);
        }

        @Override // com.google.common.cache.CacheLoader
        public ListenableFuture<V> f(K k4, V v4) throws Exception {
            a1 b5 = a1.b(new CallableC0832a(k4, v4));
            this.f55093c.execute(b5);
            return b5;
        }
    }

    private static final class b<K, V> extends CacheLoader<K, V> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55097c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.common.base.x<K, V> f55098b;

        public b(com.google.common.base.x<K, V> xVar) {
            xVar.getClass();
            this.f55098b = xVar;
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(K k4) {
            com.google.common.base.x<K, V> xVar = this.f55098b;
            k4.getClass();
            return xVar.apply(k4);
        }
    }

    private static final class c<V> extends CacheLoader<Object, V> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55099c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final u0<V> f55100b;

        public c(u0<V> u0Var) {
            u0Var.getClass();
            this.f55100b = u0Var;
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(Object obj) {
            obj.getClass();
            return this.f55100b.get();
        }
    }

    protected CacheLoader() {
    }

    @f9.b
    @d9.c
    public static <K, V> CacheLoader<K, V> a(CacheLoader<K, V> cacheLoader, Executor executor) {
        cacheLoader.getClass();
        executor.getClass();
        return cacheLoader.new a(executor);
    }

    @f9.b
    public static <K, V> CacheLoader<K, V> b(com.google.common.base.x<K, V> xVar) {
        return new b(xVar);
    }

    @f9.b
    public static <V> CacheLoader<Object, V> c(u0<V> u0Var) {
        return new c(u0Var);
    }

    public abstract V d(K k4) throws Exception;

    public Map<K, V> e(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    @d9.c
    public ListenableFuture<V> f(K k4, V v4) throws Exception {
        k4.getClass();
        v4.getClass();
        return s0.m(d(k4));
    }
}
