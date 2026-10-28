package com.google.common.cache;

import com.google.common.collect.h3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* compiled from: AbstractCache.java */
@g
@d9.b
/* loaded from: classes6.dex */
public abstract class a<K, V> implements c<K, V> {

    /* compiled from: AbstractCache.java */
    /* renamed from: com.google.common.cache.a$a, reason: collision with other inner class name */
    public static final class C0833a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final l f55101a = m.a();

        /* renamed from: b, reason: collision with root package name */
        private final l f55102b = m.a();

        /* renamed from: c, reason: collision with root package name */
        private final l f55103c = m.a();

        /* renamed from: d, reason: collision with root package name */
        private final l f55104d = m.a();

        /* renamed from: e, reason: collision with root package name */
        private final l f55105e = m.a();

        /* renamed from: f, reason: collision with root package name */
        private final l f55106f = m.a();

        private static long h(long j4) {
            if (j4 >= 0) {
                return j4;
            }
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.cache.a.b
        public void a(int i4) {
            this.f55101a.a(i4);
        }

        @Override // com.google.common.cache.a.b
        public void b(int i4) {
            this.f55102b.a(i4);
        }

        @Override // com.google.common.cache.a.b
        public void c() {
            this.f55106f.b();
        }

        @Override // com.google.common.cache.a.b
        public void d(long j4) {
            this.f55104d.b();
            this.f55105e.a(j4);
        }

        @Override // com.google.common.cache.a.b
        public void e(long j4) {
            this.f55103c.b();
            this.f55105e.a(j4);
        }

        @Override // com.google.common.cache.a.b
        public f f() {
            return new f(h(this.f55101a.c()), h(this.f55102b.c()), h(this.f55103c.c()), h(this.f55104d.c()), h(this.f55105e.c()), h(this.f55106f.c()));
        }

        public void g(b bVar) {
            f f4 = bVar.f();
            this.f55101a.a(f4.c());
            this.f55102b.a(f4.j());
            this.f55103c.a(f4.h());
            this.f55104d.a(f4.f());
            this.f55105e.a(f4.n());
            this.f55106f.a(f4.b());
        }
    }

    /* compiled from: AbstractCache.java */
    public interface b {
        void a(int i4);

        void b(int i4);

        void c();

        void d(long j4);

        void e(long j4);

        f f();
    }

    protected a() {
    }

    @Override // com.google.common.cache.c
    public ConcurrentMap<K, V> f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void f2(Iterable<? extends Object> iterable) {
        Iterator<? extends Object> it = iterable.iterator();
        while (it.hasNext()) {
            l1(it.next());
        }
    }

    @Override // com.google.common.cache.c
    public V j0(K k4, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public h3<K, V> j3(Iterable<? extends Object> iterable) {
        V H1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : iterable) {
            if (!linkedHashMap.containsKey(obj) && (H1 = H1(obj)) != null) {
                linkedHashMap.put(obj, H1);
            }
        }
        return h3.i(linkedHashMap);
    }

    @Override // com.google.common.cache.c
    public void l1(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void p() {
    }

    @Override // com.google.common.cache.c
    public void put(K k4, V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.c
    public f s3() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void x() {
        throw new UnsupportedOperationException();
    }
}
