package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.n4;
import com.google.common.collect.o4.j;
import com.google.common.collect.o4.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: MapMakerInternalMap.java */
@d9.c
/* loaded from: classes6.dex */
class o4<K, V, E extends j<K, V, E>, S extends o<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: k, reason: collision with root package name */
    static final int f56005k = 1073741824;

    /* renamed from: l, reason: collision with root package name */
    static final int f56006l = 65536;

    /* renamed from: m, reason: collision with root package name */
    static final int f56007m = 3;

    /* renamed from: n, reason: collision with root package name */
    static final int f56008n = 63;

    /* renamed from: o, reason: collision with root package name */
    static final int f56009o = 16;

    /* renamed from: p, reason: collision with root package name */
    static final long f56010p = 60;

    /* renamed from: q, reason: collision with root package name */
    static final h0<Object, Object, f> f56011q = new a();

    /* renamed from: r, reason: collision with root package name */
    private static final long f56012r = 5;

    /* renamed from: b, reason: collision with root package name */
    final transient int f56013b;

    /* renamed from: c, reason: collision with root package name */
    final transient int f56014c;

    /* renamed from: d, reason: collision with root package name */
    final transient o<K, V, E, S>[] f56015d;

    /* renamed from: e, reason: collision with root package name */
    final int f56016e;

    /* renamed from: f, reason: collision with root package name */
    final com.google.common.base.q<Object> f56017f;

    /* renamed from: g, reason: collision with root package name */
    final transient k<K, V, E, S> f56018g;

    /* renamed from: h, reason: collision with root package name */
    @zc.a
    transient Set<K> f56019h;

    /* renamed from: i, reason: collision with root package name */
    @zc.a
    transient Collection<V> f56020i;

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    transient Set<Map.Entry<K, V>> f56021j;

    /* compiled from: MapMakerInternalMap.java */
    class a implements h0<Object, Object, f> {
        a() {
        }

        @Override // com.google.common.collect.o4.h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0<Object, Object, f> a(ReferenceQueue<Object> referenceQueue, f fVar) {
            return this;
        }

        @Override // com.google.common.collect.o4.h0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f d() {
            return null;
        }

        @Override // com.google.common.collect.o4.h0
        public void clear() {
        }

        @Override // com.google.common.collect.o4.h0
        public Object get() {
            return null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class a0<K> extends d<K, n4.a, a0<K>> implements x<K, n4.a, a0<K>> {

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K> implements k<K, n4.a, a0<K>, b0<K>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?> f56022a = new a<>();

            a() {
            }

            static <K> a<K> h() {
                return (a<K>) f56022a;
            }

            @Override // com.google.common.collect.o4.k
            public q b() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.o4.k
            public void c(o oVar, j jVar, n4.a aVar) {
            }

            @Override // com.google.common.collect.o4.k
            public q e() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.o4.k
            public o f(o4 o4Var, int i4, int i5) {
                return new b0(o4Var, i4, i5);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public a0<K> a(b0<K> b0Var, a0<K> a0Var, @zc.a a0<K> a0Var2) {
                if (a0Var.get() == null) {
                    return null;
                }
                return a0Var.b(((b0) b0Var).f56030i, a0Var2);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public a0<K> d(b0<K> b0Var, K k4, int i4, @zc.a a0<K> a0Var) {
                return new a0<>(((b0) b0Var).f56030i, (Object) k4, i4, a0Var);
            }

            public b0<K> j(o4<K, n4.a, a0<K>, b0<K>> o4Var, int i4, int i5) {
                return new b0<>(o4Var, i4, i5);
            }

            public void k(b0<K> b0Var, a0<K> a0Var, n4.a aVar) {
            }
        }

        a0(ReferenceQueue<K> referenceQueue, K k4, int i4, @zc.a a0<K> a0Var) {
            super(referenceQueue, k4, i4, a0Var);
        }

        a0<K> b(ReferenceQueue<K> referenceQueue, a0<K> a0Var) {
            return new a0<>((ReferenceQueue) referenceQueue, (Object) get(), this.f56036b, a0Var);
        }

        public n4.a c() {
            return n4.a.VALUE;
        }

        void d(n4.a aVar) {
        }

        @Override // com.google.common.collect.o4.j
        public Object getValue() {
            return n4.a.VALUE;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static abstract class b<K, V> extends r1<K, V> implements Serializable {

        /* renamed from: h, reason: collision with root package name */
        private static final long f56023h = 3;

        /* renamed from: b, reason: collision with root package name */
        final q f56024b;

        /* renamed from: c, reason: collision with root package name */
        final q f56025c;

        /* renamed from: d, reason: collision with root package name */
        final com.google.common.base.q<Object> f56026d;

        /* renamed from: e, reason: collision with root package name */
        final com.google.common.base.q<Object> f56027e;

        /* renamed from: f, reason: collision with root package name */
        final int f56028f;

        /* renamed from: g, reason: collision with root package name */
        transient ConcurrentMap<K, V> f56029g;

        b(q qVar, q qVar2, com.google.common.base.q<Object> qVar3, com.google.common.base.q<Object> qVar4, int i4, ConcurrentMap<K, V> concurrentMap) {
            this.f56024b = qVar;
            this.f56025c = qVar2;
            this.f56026d = qVar3;
            this.f56027e = qVar4;
            this.f56028f = i4;
            this.f56029g = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.r1, com.google.common.collect.b2
        /* renamed from: R3 */
        public ConcurrentMap<K, V> u3() {
            return this.f56029g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void S3(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.f56029g.put(readObject, objectInputStream.readObject());
            }
        }

        n4 T3(ObjectInputStream objectInputStream) throws IOException {
            return new n4().g(objectInputStream.readInt()).j(this.f56024b).k(this.f56025c).h(this.f56026d).a(this.f56028f);
        }

        void U3(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f56029g.size());
            for (Map.Entry<K, V> entry : this.f56029g.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class b0<K> extends o<K, n4.a, a0<K>, b0<K>> {

        /* renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<K> f56030i;

        b0(o4<K, n4.a, a0<K>, b0<K>> o4Var, int i4, int i5) {
            super(o4Var, i4, i5);
            this.f56030i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o4.o
        o Q() {
            return this;
        }

        public a0<K> X(j<K, n4.a, ?> jVar) {
            return (a0) jVar;
        }

        b0<K> Y() {
            return this;
        }

        @Override // com.google.common.collect.o4.o
        public j a(j jVar) {
            return (a0) jVar;
        }

        @Override // com.google.common.collect.o4.o
        ReferenceQueue<K> o() {
            return this.f56030i;
        }

        @Override // com.google.common.collect.o4.o
        void w() {
            c(this.f56030i);
        }

        @Override // com.google.common.collect.o4.o
        void x() {
            i(this.f56030i);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static abstract class c<K, V, E extends j<K, V, E>> implements j<K, V, E> {

        /* renamed from: b, reason: collision with root package name */
        final K f56031b;

        /* renamed from: c, reason: collision with root package name */
        final int f56032c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        final E f56033d;

        c(K k4, int i4, @zc.a E e4) {
            this.f56031b = k4;
            this.f56032c = i4;
            this.f56033d = e4;
        }

        @Override // com.google.common.collect.o4.j
        public int getHash() {
            return this.f56032c;
        }

        @Override // com.google.common.collect.o4.j
        public K getKey() {
            return this.f56031b;
        }

        @Override // com.google.common.collect.o4.j
        public E getNext() {
            return this.f56033d;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class c0<K, V> extends d<K, V, c0<K, V>> implements x<K, V, c0<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private volatile V f56034d;

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements k<K, V, c0<K, V>, d0<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f56035a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f56035a;
            }

            @Override // com.google.common.collect.o4.k
            public q b() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.o4.k
            public void c(o oVar, j jVar, Object obj) {
                ((c0) jVar).c(obj);
            }

            @Override // com.google.common.collect.o4.k
            public q e() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.o4.k
            public o f(o4 o4Var, int i4, int i5) {
                return new d0(o4Var, i4, i5);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public c0<K, V> a(d0<K, V> d0Var, c0<K, V> c0Var, @zc.a c0<K, V> c0Var2) {
                if (c0Var.get() == null) {
                    return null;
                }
                return c0Var.b(((d0) d0Var).f56038i, c0Var2);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public c0<K, V> d(d0<K, V> d0Var, K k4, int i4, @zc.a c0<K, V> c0Var) {
                return new c0<>(((d0) d0Var).f56038i, k4, i4, c0Var);
            }

            public d0<K, V> j(o4<K, V, c0<K, V>, d0<K, V>> o4Var, int i4, int i5) {
                return new d0<>(o4Var, i4, i5);
            }

            public void k(d0<K, V> d0Var, c0<K, V> c0Var, V v4) {
                c0Var.c(v4);
            }
        }

        c0(ReferenceQueue<K> referenceQueue, K k4, int i4, @zc.a c0<K, V> c0Var) {
            super(referenceQueue, k4, i4, c0Var);
            this.f56034d = null;
        }

        c0<K, V> b(ReferenceQueue<K> referenceQueue, c0<K, V> c0Var) {
            c0<K, V> c0Var2 = new c0<>(referenceQueue, get(), this.f56036b, c0Var);
            c0Var2.f56034d = this.f56034d;
            return c0Var2;
        }

        void c(V v4) {
            this.f56034d = v4;
        }

        @Override // com.google.common.collect.o4.j
        @zc.a
        public V getValue() {
            return this.f56034d;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static abstract class d<K, V, E extends j<K, V, E>> extends WeakReference<K> implements j<K, V, E> {

        /* renamed from: b, reason: collision with root package name */
        final int f56036b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        final E f56037c;

        d(ReferenceQueue<K> referenceQueue, K k4, int i4, @zc.a E e4) {
            super(k4, referenceQueue);
            this.f56036b = i4;
            this.f56037c = e4;
        }

        @Override // com.google.common.collect.o4.j
        public int getHash() {
            return this.f56036b;
        }

        @Override // com.google.common.collect.o4.j
        public K getKey() {
            return get();
        }

        @Override // com.google.common.collect.o4.j
        public E getNext() {
            return this.f56037c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class d0<K, V> extends o<K, V, c0<K, V>, d0<K, V>> {

        /* renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<K> f56038i;

        d0(o4<K, V, c0<K, V>, d0<K, V>> o4Var, int i4, int i5) {
            super(o4Var, i4, i5);
            this.f56038i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o4.o
        o Q() {
            return this;
        }

        public c0<K, V> X(j<K, V, ?> jVar) {
            return (c0) jVar;
        }

        d0<K, V> Y() {
            return this;
        }

        @Override // com.google.common.collect.o4.o
        public j a(j jVar) {
            return (c0) jVar;
        }

        @Override // com.google.common.collect.o4.o
        ReferenceQueue<K> o() {
            return this.f56038i;
        }

        @Override // com.google.common.collect.o4.o
        void w() {
            c(this.f56038i);
        }

        @Override // com.google.common.collect.o4.o
        void x() {
            i(this.f56038i);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final WeakReference<o4<?, ?, ?, ?>> f56039b;

        public e(o4<?, ?, ?, ?> o4Var) {
            this.f56039b = new WeakReference<>(o4Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            o4<?, ?, ?, ?> o4Var = this.f56039b.get();
            if (o4Var == null) {
                throw new CancellationException();
            }
            for (o<?, ?, ?, ?> oVar : o4Var.f56015d) {
                oVar.O();
            }
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class e0<K, V> extends d<K, V, e0<K, V>> implements g0<K, V, e0<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        private volatile h0<K, V, e0<K, V>> f56040d;

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements k<K, V, e0<K, V>, f0<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f56041a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f56041a;
            }

            @Override // com.google.common.collect.o4.k
            public q b() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.o4.k
            public q e() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.o4.k
            public o f(o4 o4Var, int i4, int i5) {
                return new f0(o4Var, i4, i5);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public e0<K, V> a(f0<K, V> f0Var, e0<K, V> e0Var, @zc.a e0<K, V> e0Var2) {
                if (e0Var.get() == null || o.v(e0Var)) {
                    return null;
                }
                return e0Var.d(((f0) f0Var).f56042i, ((f0) f0Var).f56043j, e0Var2);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public e0<K, V> d(f0<K, V> f0Var, K k4, int i4, @zc.a e0<K, V> e0Var) {
                return new e0<>(((f0) f0Var).f56042i, k4, i4, e0Var);
            }

            public f0<K, V> j(o4<K, V, e0<K, V>, f0<K, V>> o4Var, int i4, int i5) {
                return new f0<>(o4Var, i4, i5);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void c(f0<K, V> f0Var, e0<K, V> e0Var, V v4) {
                e0Var.e(v4, ((f0) f0Var).f56043j);
            }
        }

        e0(ReferenceQueue<K> referenceQueue, K k4, int i4, @zc.a e0<K, V> e0Var) {
            super(referenceQueue, k4, i4, e0Var);
            this.f56040d = o4.t();
        }

        @Override // com.google.common.collect.o4.g0
        public void a() {
            this.f56040d.clear();
        }

        e0<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, e0<K, V> e0Var) {
            e0<K, V> e0Var2 = new e0<>(referenceQueue, get(), this.f56036b, e0Var);
            e0Var2.f56040d = this.f56040d.a(referenceQueue2, e0Var2);
            return e0Var2;
        }

        void e(V v4, ReferenceQueue<V> referenceQueue) {
            h0<K, V, e0<K, V>> h0Var = this.f56040d;
            this.f56040d = new i0(referenceQueue, v4, this);
            h0Var.clear();
        }

        @Override // com.google.common.collect.o4.j
        public V getValue() {
            return this.f56040d.get();
        }

        @Override // com.google.common.collect.o4.g0
        public h0<K, V, e0<K, V>> getValueReference() {
            return this.f56040d;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class f implements j<Object, Object, f> {
        private f() {
            throw new AssertionError();
        }

        public f b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o4.j
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o4.j
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o4.j
        public f getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o4.j
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class f0<K, V> extends o<K, V, e0<K, V>, f0<K, V>> {

        /* renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<K> f56042i;

        /* renamed from: j, reason: collision with root package name */
        private final ReferenceQueue<V> f56043j;

        f0(o4<K, V, e0<K, V>, f0<K, V>> o4Var, int i4, int i5) {
            super(o4Var, i4, i5);
            this.f56042i = new ReferenceQueue<>();
            this.f56043j = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o4.o
        public h0<K, V, e0<K, V>> A(j<K, V, ?> jVar, V v4) {
            return new i0(this.f56043j, v4, (e0) jVar);
        }

        @Override // com.google.common.collect.o4.o
        o Q() {
            return this;
        }

        @Override // com.google.common.collect.o4.o
        public void U(j<K, V, ?> jVar, h0<K, V, ? extends j<K, V, ?>> h0Var) {
            e0 e0Var = (e0) jVar;
            h0 h0Var2 = e0Var.f56040d;
            e0Var.f56040d = h0Var;
            h0Var2.clear();
        }

        public e0<K, V> Y(j<K, V, ?> jVar) {
            return (e0) jVar;
        }

        f0<K, V> Z() {
            return this;
        }

        @Override // com.google.common.collect.o4.o
        public j a(j jVar) {
            return (e0) jVar;
        }

        @Override // com.google.common.collect.o4.o
        ReferenceQueue<K> o() {
            return this.f56042i;
        }

        @Override // com.google.common.collect.o4.o
        ReferenceQueue<V> s() {
            return this.f56043j;
        }

        @Override // com.google.common.collect.o4.o
        public h0<K, V, e0<K, V>> t(j<K, V, ?> jVar) {
            return ((e0) jVar).getValueReference();
        }

        @Override // com.google.common.collect.o4.o
        void w() {
            c(this.f56042i);
        }

        @Override // com.google.common.collect.o4.o
        void x() {
            i(this.f56042i);
            j(this.f56043j);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    final class g extends o4<K, V, E, S>.i<Map.Entry<K, V>> {
        g(o4 o4Var) {
            super();
        }

        public Map.Entry<K, V> f() {
            return c();
        }

        @Override // com.google.common.collect.o4.i, java.util.Iterator
        public Object next() {
            return c();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    interface g0<K, V, E extends j<K, V, E>> extends j<K, V, E> {
        void a();

        h0<K, V, E> getValueReference();
    }

    /* compiled from: MapMakerInternalMap.java */
    final class h extends n<Map.Entry<K, V>> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            o4.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = o4.this.get(key)) != null && o4.this.u().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return o4.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g(o4.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && o4.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o4.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    interface h0<K, V, E extends j<K, V, E>> {
        h0<K, V, E> a(ReferenceQueue<V> referenceQueue, E e4);

        void clear();

        E d();

        @zc.a
        V get();
    }

    /* compiled from: MapMakerInternalMap.java */
    abstract class i<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        int f56045b;

        /* renamed from: c, reason: collision with root package name */
        int f56046c = -1;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        o<K, V, E, S> f56047d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        AtomicReferenceArray<E> f56048e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        E f56049f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        o4<K, V, E, S>.j0 f56050g;

        /* renamed from: h, reason: collision with root package name */
        @zc.a
        o4<K, V, E, S>.j0 f56051h;

        i() {
            this.f56045b = o4.this.f56015d.length - 1;
            a();
        }

        final void a() {
            this.f56050g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i4 = this.f56045b;
                if (i4 < 0) {
                    return;
                }
                o<K, V, E, S>[] oVarArr = o4.this.f56015d;
                this.f56045b = i4 - 1;
                o<K, V, E, S> oVar = oVarArr[i4];
                this.f56047d = oVar;
                if (oVar.f56059c != 0) {
                    this.f56048e = this.f56047d.f56062f;
                    this.f56046c = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(E e4) {
            try {
                Object key = e4.getKey();
                Object i4 = o4.this.i(e4);
                if (i4 == null) {
                    this.f56047d.B();
                    return false;
                }
                this.f56050g = new j0(key, i4);
                this.f56047d.B();
                return true;
            } catch (Throwable th) {
                this.f56047d.B();
                throw th;
            }
        }

        o4<K, V, E, S>.j0 c() {
            o4<K, V, E, S>.j0 j0Var = this.f56050g;
            if (j0Var == null) {
                throw new NoSuchElementException();
            }
            this.f56051h = j0Var;
            a();
            return this.f56051h;
        }

        boolean d() {
            E e4 = this.f56049f;
            if (e4 == null) {
                return false;
            }
            while (true) {
                this.f56049f = (E) e4.getNext();
                E e5 = this.f56049f;
                if (e5 == null) {
                    return false;
                }
                if (b(e5)) {
                    return true;
                }
                e4 = this.f56049f;
            }
        }

        boolean e() {
            while (true) {
                int i4 = this.f56046c;
                if (i4 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f56048e;
                this.f56046c = i4 - 1;
                E e4 = atomicReferenceArray.get(i4);
                this.f56049f = e4;
                if (e4 != null && (b(e4) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56050g != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.b0.e(this.f56051h != null);
            o4.this.remove(this.f56051h.f56054b);
            this.f56051h = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class i0<K, V, E extends j<K, V, E>> extends WeakReference<V> implements h0<K, V, E> {

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        final E f56053b;

        i0(ReferenceQueue<V> referenceQueue, V v4, E e4) {
            super(v4, referenceQueue);
            this.f56053b = e4;
        }

        @Override // com.google.common.collect.o4.h0
        public h0<K, V, E> a(ReferenceQueue<V> referenceQueue, E e4) {
            return new i0(referenceQueue, get(), e4);
        }

        @Override // com.google.common.collect.o4.h0
        public E d() {
            return this.f56053b;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    interface j<K, V, E extends j<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* compiled from: MapMakerInternalMap.java */
    final class j0 extends com.google.common.collect.g<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final K f56054b;

        /* renamed from: c, reason: collision with root package name */
        V f56055c;

        j0(K k4, V v4) {
            this.f56054b = k4;
            this.f56055c = v4;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f56054b.equals(entry.getKey()) && this.f56055c.equals(entry.getValue());
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public K getKey() {
            return this.f56054b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V getValue() {
            return this.f56055c;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public int hashCode() {
            return this.f56054b.hashCode() ^ this.f56055c.hashCode();
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V setValue(V v4) {
            V v5 = (V) o4.this.put(this.f56054b, v4);
            this.f56055c = v4;
            return v5;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    interface k<K, V, E extends j<K, V, E>, S extends o<K, V, E, S>> {
        E a(S s4, E e4, @zc.a E e5);

        q b();

        void c(S s4, E e4, V v4);

        E d(S s4, K k4, int i4, @zc.a E e4);

        q e();

        S f(o4<K, V, E, S> o4Var, int i4, int i5);
    }

    /* compiled from: MapMakerInternalMap.java */
    final class l extends o4<K, V, E, S>.i<K> {
        l(o4 o4Var) {
            super();
        }

        @Override // com.google.common.collect.o4.i, java.util.Iterator
        public K next() {
            return c().f56054b;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    final class m extends n<K> {
        m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            o4.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return o4.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return o4.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new l(o4.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return o4.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o4.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    private static abstract class n<E> extends AbstractSet<E> {
        private n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return o4.r(this).toArray();
        }

        n(a aVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o4.r(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static abstract class o<K, V, E extends j<K, V, E>, S extends o<K, V, E, S>> extends ReentrantLock {

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        final o4<K, V, E, S> f56058b;

        /* renamed from: c, reason: collision with root package name */
        volatile int f56059c;

        /* renamed from: d, reason: collision with root package name */
        int f56060d;

        /* renamed from: e, reason: collision with root package name */
        int f56061e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        volatile AtomicReferenceArray<E> f56062f;

        /* renamed from: g, reason: collision with root package name */
        final int f56063g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicInteger f56064h = new AtomicInteger();

        o(o4<K, V, E, S> o4Var, int i4, int i5) {
            this.f56058b = o4Var;
            this.f56063g = i5;
            u(y(i4));
        }

        static <K, V, E extends j<K, V, E>> boolean v(E e4) {
            return e4.getValue() == null;
        }

        h0<K, V, E> A(j<K, V, ?> jVar, V v4) {
            throw new AssertionError();
        }

        void B() {
            if ((this.f56064h.incrementAndGet() & 63) == 0) {
                O();
            }
        }

        @g9.a("this")
        void C() {
            P();
        }

        /* JADX WARN: Multi-variable type inference failed */
        V D(K k4, int i4, V v4, boolean z4) {
            lock();
            try {
                C();
                int i5 = this.f56059c + 1;
                if (i5 > this.f56061e) {
                    k();
                    i5 = this.f56059c + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                int length = (atomicReferenceArray.length() - 1) & i4;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.getHash() == i4 && key != null && this.f56058b.f56017f.d(k4, key)) {
                        V v5 = (V) jVar2.getValue();
                        if (v5 == null) {
                            this.f56060d++;
                            S(jVar2, v4);
                            this.f56059c = this.f56059c;
                            unlock();
                            return null;
                        }
                        if (z4) {
                            unlock();
                            return v5;
                        }
                        this.f56060d++;
                        S(jVar2, v4);
                        unlock();
                        return v5;
                    }
                }
                this.f56060d++;
                j d5 = this.f56058b.f56018g.d(Q(), k4, i4, jVar);
                S(d5, v4);
                atomicReferenceArray.set(length, d5);
                this.f56059c = i5;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @f9.a
        boolean E(E e4, int i4) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                int length = i4 & (atomicReferenceArray.length() - 1);
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    if (jVar2 == e4) {
                        this.f56060d++;
                        j J = J(jVar, jVar2);
                        int i5 = this.f56059c - 1;
                        atomicReferenceArray.set(length, J);
                        this.f56059c = i5;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @f9.a
        boolean F(K k4, int i4, h0<K, V, E> h0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                int length = (atomicReferenceArray.length() - 1) & i4;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.getHash() == i4 && key != null && this.f56058b.f56017f.d(k4, key)) {
                        if (((g0) jVar2).getValueReference() != h0Var) {
                            return false;
                        }
                        this.f56060d++;
                        j J = J(jVar, jVar2);
                        int i5 = this.f56059c - 1;
                        atomicReferenceArray.set(length, J);
                        this.f56059c = i5;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @f9.a
        V G(Object obj, int i4) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                int length = (atomicReferenceArray.length() - 1) & i4;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.getHash() == i4 && key != null && this.f56058b.f56017f.d(obj, key)) {
                        V v4 = (V) jVar2.getValue();
                        if (v4 == null && !v(jVar2)) {
                            return null;
                        }
                        this.f56060d++;
                        j J = J(jVar, jVar2);
                        int i5 = this.f56059c - 1;
                        atomicReferenceArray.set(length, J);
                        this.f56059c = i5;
                        return v4;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r8.f56058b.u().d(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        
            r8.f56060d++;
            r9 = J(r3, r4);
            r10 = r8.f56059c - 1;
            r0.set(r1, r9);
            r8.f56059c = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (v(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean H(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.C()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.o4$j<K, V, E>> r0 = r8.f56062f     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.o4$j r3 = (com.google.common.collect.o4.j) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                com.google.common.collect.o4<K, V, E extends com.google.common.collect.o4$j<K, V, E>, S extends com.google.common.collect.o4$o<K, V, E, S>> r7 = r8.f56058b     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.q<java.lang.Object> r7 = r7.f56017f     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.o4<K, V, E extends com.google.common.collect.o4$j<K, V, E>, S extends com.google.common.collect.o4$o<K, V, E, S>> r10 = r8.f56058b     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.q r10 = r10.u()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = v(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f56060d     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f56060d = r9     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.o4$j r9 = r8.J(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f56059c     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f56059c = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                com.google.common.collect.o4$j r4 = r4.getNext()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.o4.o.H(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @g9.a("this")
        boolean I(E e4) {
            int hash = e4.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
            int length = hash & (atomicReferenceArray.length() - 1);
            j jVar = (j) atomicReferenceArray.get(length);
            for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                if (jVar2 == e4) {
                    this.f56060d++;
                    j J = J(jVar, jVar2);
                    int i4 = this.f56059c - 1;
                    atomicReferenceArray.set(length, J);
                    this.f56059c = i4;
                    return true;
                }
            }
            return false;
        }

        @g9.a("this")
        E J(E e4, E e5) {
            int i4 = this.f56059c;
            E e6 = (E) e5.getNext();
            while (e4 != e5) {
                E g4 = g(e4, e6);
                if (g4 != null) {
                    e6 = g4;
                } else {
                    i4--;
                }
                e4 = (E) e4.getNext();
            }
            this.f56059c = i4;
            return e6;
        }

        E K(j<K, V, ?> jVar, j<K, V, ?> jVar2) {
            return J(a(jVar), a(jVar2));
        }

        @f9.a
        boolean L(j<K, V, ?> jVar) {
            return I(a(jVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        V M(K k4, int i4, V v4) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                int length = (atomicReferenceArray.length() - 1) & i4;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.getHash() == i4 && key != null && this.f56058b.f56017f.d(k4, key)) {
                        V v5 = (V) jVar2.getValue();
                        if (v5 != null) {
                            this.f56060d++;
                            S(jVar2, v4);
                            return v5;
                        }
                        if (v(jVar2)) {
                            this.f56060d++;
                            j J = J(jVar, jVar2);
                            int i5 = this.f56059c - 1;
                            atomicReferenceArray.set(length, J);
                            this.f56059c = i5;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean N(K k4, int i4, V v4, V v5) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                int length = (atomicReferenceArray.length() - 1) & i4;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.getHash() == i4 && key != null && this.f56058b.f56017f.d(k4, key)) {
                        Object value = jVar2.getValue();
                        if (value != null) {
                            if (!this.f56058b.u().d(v4, value)) {
                                return false;
                            }
                            this.f56060d++;
                            S(jVar2, v5);
                            return true;
                        }
                        if (v(jVar2)) {
                            this.f56060d++;
                            j J = J(jVar, jVar2);
                            int i5 = this.f56059c - 1;
                            atomicReferenceArray.set(length, J);
                            this.f56059c = i5;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void O() {
            P();
        }

        void P() {
            if (tryLock()) {
                try {
                    x();
                    this.f56064h.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S Q();

        void R(int i4, j<K, V, ?> jVar) {
            this.f56062f.set(i4, a(jVar));
        }

        void S(E e4, V v4) {
            this.f56058b.f56018g.c(Q(), e4, v4);
        }

        void T(j<K, V, ?> jVar, V v4) {
            this.f56058b.f56018g.c(Q(), a(jVar), v4);
        }

        void U(j<K, V, ?> jVar, h0<K, V, ? extends j<K, V, ?>> h0Var) {
            throw new AssertionError();
        }

        void V() {
            if (tryLock()) {
                try {
                    x();
                } finally {
                    unlock();
                }
            }
        }

        abstract E a(j<K, V, ?> jVar);

        void b() {
            if (this.f56059c != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    w();
                    this.f56064h.set(0);
                    this.f56060d++;
                    this.f56059c = 0;
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }

        <T> void c(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @f9.a
        boolean d(K k4, int i4, h0<K, V, ? extends j<K, V, ?>> h0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                int length = (atomicReferenceArray.length() - 1) & i4;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.getHash() == i4 && key != null && this.f56058b.f56017f.d(k4, key)) {
                        if (((g0) jVar2).getValueReference() != h0Var) {
                            return false;
                        }
                        atomicReferenceArray.set(length, J(jVar, jVar2));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean e(Object obj, int i4) {
            try {
                boolean z4 = false;
                if (this.f56059c == 0) {
                    return false;
                }
                E p4 = p(obj, i4);
                if (p4 != null) {
                    if (p4.getValue() != null) {
                        z4 = true;
                    }
                }
                return z4;
            } finally {
                B();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d9.d
        boolean f(Object obj) {
            try {
                if (this.f56059c != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
                    int length = atomicReferenceArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        for (E e4 = atomicReferenceArray.get(i4); e4 != null; e4 = e4.getNext()) {
                            Object q4 = q(e4);
                            if (q4 != null && this.f56058b.u().d(obj, q4)) {
                                B();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                B();
            }
        }

        E g(E e4, E e5) {
            return this.f56058b.f56018g.a(Q(), e4, e5);
        }

        E h(j<K, V, ?> jVar, @zc.a j<K, V, ?> jVar2) {
            return this.f56058b.f56018g.a(Q(), a(jVar), a(jVar2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @g9.a("this")
        void i(ReferenceQueue<K> referenceQueue) {
            int i4 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f56058b.n((j) poll);
                i4++;
            } while (i4 != 16);
        }

        @g9.a("this")
        void j(ReferenceQueue<V> referenceQueue) {
            int i4 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f56058b.o((h0) poll);
                i4++;
            } while (i4 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @g9.a("this")
        void k() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f56062f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i4 = this.f56059c;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) y(length << 1);
            this.f56061e = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i5 = 0; i5 < length; i5++) {
                E e4 = atomicReferenceArray.get(i5);
                if (e4 != null) {
                    j next = e4.getNext();
                    int hash = e4.getHash() & length2;
                    if (next == null) {
                        atomicReferenceArray2.set(hash, e4);
                    } else {
                        j jVar = e4;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                jVar = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        atomicReferenceArray2.set(hash, jVar);
                        while (e4 != jVar) {
                            int hash3 = e4.getHash() & length2;
                            j g4 = g(e4, (j) atomicReferenceArray2.get(hash3));
                            if (g4 != null) {
                                atomicReferenceArray2.set(hash3, g4);
                            } else {
                                i4--;
                            }
                            e4 = e4.getNext();
                        }
                    }
                }
            }
            this.f56062f = atomicReferenceArray2;
            this.f56059c = i4;
        }

        V l(Object obj, int i4) {
            try {
                E p4 = p(obj, i4);
                if (p4 == null) {
                    B();
                    return null;
                }
                V v4 = (V) p4.getValue();
                if (v4 == null) {
                    V();
                }
                return v4;
            } finally {
                B();
            }
        }

        E m(Object obj, int i4) {
            if (this.f56059c == 0) {
                return null;
            }
            for (E n4 = n(i4); n4 != null; n4 = (E) n4.getNext()) {
                if (n4.getHash() == i4) {
                    Object key = n4.getKey();
                    if (key == null) {
                        V();
                    } else if (this.f56058b.f56017f.d(obj, key)) {
                        return n4;
                    }
                }
            }
            return null;
        }

        E n(int i4) {
            return this.f56062f.get(i4 & (r0.length() - 1));
        }

        ReferenceQueue<K> o() {
            throw new AssertionError();
        }

        E p(Object obj, int i4) {
            return m(obj, i4);
        }

        @zc.a
        V q(E e4) {
            if (e4.getKey() == null) {
                V();
                return null;
            }
            V v4 = (V) e4.getValue();
            if (v4 != null) {
                return v4;
            }
            V();
            return null;
        }

        @zc.a
        V r(j<K, V, ?> jVar) {
            return q(a(jVar));
        }

        ReferenceQueue<V> s() {
            throw new AssertionError();
        }

        h0<K, V, E> t(j<K, V, ?> jVar) {
            throw new AssertionError();
        }

        void u(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f56061e = length;
            if (length == this.f56063g) {
                this.f56061e = length + 1;
            }
            this.f56062f = atomicReferenceArray;
        }

        void w() {
        }

        @g9.a("this")
        void x() {
        }

        AtomicReferenceArray<E> y(int i4) {
            return new AtomicReferenceArray<>(i4);
        }

        E z(K k4, int i4, @zc.a j<K, V, ?> jVar) {
            return this.f56058b.f56018g.d(Q(), k4, i4, a(jVar));
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    private static final class p<K, V> extends b<K, V> {

        /* renamed from: i, reason: collision with root package name */
        private static final long f56065i = 3;

        p(q qVar, q qVar2, com.google.common.base.q<Object> qVar3, com.google.common.base.q<Object> qVar4, int i4, ConcurrentMap<K, V> concurrentMap) {
            super(qVar, qVar2, qVar3, qVar4, i4, concurrentMap);
        }

        private void V3(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f56029g = T3(objectInputStream).i();
            S3(objectInputStream);
        }

        private Object W3() {
            return this.f56029g;
        }

        private void X3(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            U3(objectOutputStream);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    static abstract class q {
        public static final q STRONG = new a(ProtectedSandApp.s("\uf508"), 0);
        public static final q WEAK = new b(ProtectedSandApp.s("\uf509"), 1);
        private static final /* synthetic */ q[] $VALUES = $values();

        /* compiled from: MapMakerInternalMap.java */
        enum a extends q {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.collect.o4.q
            com.google.common.base.q<Object> defaultEquivalence() {
                return com.google.common.base.q.c();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        enum b extends q {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.collect.o4.q
            com.google.common.base.q<Object> defaultEquivalence() {
                return com.google.common.base.q.g();
            }
        }

        private static /* synthetic */ q[] $values() {
            return new q[]{STRONG, WEAK};
        }

        private q(String str, int i4) {
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) $VALUES.clone();
        }

        abstract com.google.common.base.q<Object> defaultEquivalence();

        /* synthetic */ q(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class r<K> extends c<K, n4.a, r<K>> implements x<K, n4.a, r<K>> {

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K> implements k<K, n4.a, r<K>, s<K>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?> f56066a = new a<>();

            a() {
            }

            static <K> a<K> h() {
                return (a<K>) f56066a;
            }

            @Override // com.google.common.collect.o4.k
            public j a(o oVar, j jVar, @zc.a j jVar2) {
                return ((r) jVar).b((r) jVar2);
            }

            @Override // com.google.common.collect.o4.k
            public q b() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.o4.k
            public void c(o oVar, j jVar, n4.a aVar) {
            }

            @Override // com.google.common.collect.o4.k
            public j d(o oVar, Object obj, int i4, @zc.a j jVar) {
                return new r(obj, i4, (r) jVar);
            }

            @Override // com.google.common.collect.o4.k
            public q e() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.o4.k
            public o f(o4 o4Var, int i4, int i5) {
                return new s(o4Var, i4, i5);
            }

            public r<K> g(s<K> sVar, r<K> rVar, @zc.a r<K> rVar2) {
                return rVar.b(rVar2);
            }

            public r<K> i(s<K> sVar, K k4, int i4, @zc.a r<K> rVar) {
                return new r<>((Object) k4, i4, rVar);
            }

            public s<K> j(o4<K, n4.a, r<K>, s<K>> o4Var, int i4, int i5) {
                return new s<>(o4Var, i4, i5);
            }

            public void k(s<K> sVar, r<K> rVar, n4.a aVar) {
            }
        }

        r(K k4, int i4, @zc.a r<K> rVar) {
            super(k4, i4, rVar);
        }

        r<K> b(r<K> rVar) {
            return new r<>((Object) this.f56031b, this.f56032c, rVar);
        }

        public n4.a c() {
            return n4.a.VALUE;
        }

        void d(n4.a aVar) {
        }

        @Override // com.google.common.collect.o4.j
        public Object getValue() {
            return n4.a.VALUE;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class s<K> extends o<K, n4.a, r<K>, s<K>> {
        s(o4<K, n4.a, r<K>, s<K>> o4Var, int i4, int i5) {
            super(o4Var, i4, i5);
        }

        @Override // com.google.common.collect.o4.o
        o Q() {
            return this;
        }

        public r<K> W(j<K, n4.a, ?> jVar) {
            return (r) jVar;
        }

        s<K> X() {
            return this;
        }

        @Override // com.google.common.collect.o4.o
        public j a(j jVar) {
            return (r) jVar;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class t<K, V> extends c<K, V, t<K, V>> implements x<K, V, t<K, V>> {

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        private volatile V f56067e;

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements k<K, V, t<K, V>, u<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f56068a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f56068a;
            }

            @Override // com.google.common.collect.o4.k
            public j a(o oVar, j jVar, @zc.a j jVar2) {
                return ((t) jVar).b((t) jVar2);
            }

            @Override // com.google.common.collect.o4.k
            public q b() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.o4.k
            public void c(o oVar, j jVar, Object obj) {
                ((t) jVar).c(obj);
            }

            @Override // com.google.common.collect.o4.k
            public j d(o oVar, Object obj, int i4, @zc.a j jVar) {
                return new t(obj, i4, (t) jVar);
            }

            @Override // com.google.common.collect.o4.k
            public q e() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.o4.k
            public o f(o4 o4Var, int i4, int i5) {
                return new u(o4Var, i4, i5);
            }

            public t<K, V> g(u<K, V> uVar, t<K, V> tVar, @zc.a t<K, V> tVar2) {
                return tVar.b(tVar2);
            }

            public t<K, V> i(u<K, V> uVar, K k4, int i4, @zc.a t<K, V> tVar) {
                return new t<>(k4, i4, tVar);
            }

            public u<K, V> j(o4<K, V, t<K, V>, u<K, V>> o4Var, int i4, int i5) {
                return new u<>(o4Var, i4, i5);
            }

            public void k(u<K, V> uVar, t<K, V> tVar, V v4) {
                tVar.c(v4);
            }
        }

        t(K k4, int i4, @zc.a t<K, V> tVar) {
            super(k4, i4, tVar);
            this.f56067e = null;
        }

        t<K, V> b(t<K, V> tVar) {
            t<K, V> tVar2 = new t<>(this.f56031b, this.f56032c, tVar);
            tVar2.f56067e = this.f56067e;
            return tVar2;
        }

        void c(V v4) {
            this.f56067e = v4;
        }

        @Override // com.google.common.collect.o4.j
        @zc.a
        public V getValue() {
            return this.f56067e;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class u<K, V> extends o<K, V, t<K, V>, u<K, V>> {
        u(o4<K, V, t<K, V>, u<K, V>> o4Var, int i4, int i5) {
            super(o4Var, i4, i5);
        }

        @Override // com.google.common.collect.o4.o
        o Q() {
            return this;
        }

        public t<K, V> W(j<K, V, ?> jVar) {
            return (t) jVar;
        }

        u<K, V> X() {
            return this;
        }

        @Override // com.google.common.collect.o4.o
        public j a(j jVar) {
            return (t) jVar;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class v<K, V> extends c<K, V, v<K, V>> implements g0<K, V, v<K, V>> {

        /* renamed from: e, reason: collision with root package name */
        private volatile h0<K, V, v<K, V>> f56069e;

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements k<K, V, v<K, V>, w<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f56070a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f56070a;
            }

            @Override // com.google.common.collect.o4.k
            public q b() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.o4.k
            public j d(o oVar, Object obj, int i4, @zc.a j jVar) {
                return new v(obj, i4, (v) jVar);
            }

            @Override // com.google.common.collect.o4.k
            public q e() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.o4.k
            public o f(o4 o4Var, int i4, int i5) {
                return new w(o4Var, i4, i5);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public v<K, V> a(w<K, V> wVar, v<K, V> vVar, @zc.a v<K, V> vVar2) {
                if (o.v(vVar)) {
                    return null;
                }
                return vVar.d(((w) wVar).f56071i, vVar2);
            }

            public v<K, V> i(w<K, V> wVar, K k4, int i4, @zc.a v<K, V> vVar) {
                return new v<>(k4, i4, vVar);
            }

            public w<K, V> j(o4<K, V, v<K, V>, w<K, V>> o4Var, int i4, int i5) {
                return new w<>(o4Var, i4, i5);
            }

            @Override // com.google.common.collect.o4.k
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void c(w<K, V> wVar, v<K, V> vVar, V v4) {
                vVar.e(v4, ((w) wVar).f56071i);
            }
        }

        v(K k4, int i4, @zc.a v<K, V> vVar) {
            super(k4, i4, vVar);
            this.f56069e = o4.t();
        }

        @Override // com.google.common.collect.o4.g0
        public void a() {
            this.f56069e.clear();
        }

        v<K, V> d(ReferenceQueue<V> referenceQueue, v<K, V> vVar) {
            v<K, V> vVar2 = new v<>(this.f56031b, this.f56032c, vVar);
            vVar2.f56069e = this.f56069e.a(referenceQueue, vVar2);
            return vVar2;
        }

        void e(V v4, ReferenceQueue<V> referenceQueue) {
            h0<K, V, v<K, V>> h0Var = this.f56069e;
            this.f56069e = new i0(referenceQueue, v4, this);
            h0Var.clear();
        }

        @Override // com.google.common.collect.o4.j
        public V getValue() {
            return this.f56069e.get();
        }

        @Override // com.google.common.collect.o4.g0
        public h0<K, V, v<K, V>> getValueReference() {
            return this.f56069e;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class w<K, V> extends o<K, V, v<K, V>, w<K, V>> {

        /* renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<V> f56071i;

        w(o4<K, V, v<K, V>, w<K, V>> o4Var, int i4, int i5) {
            super(o4Var, i4, i5);
            this.f56071i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o4.o
        public h0<K, V, v<K, V>> A(j<K, V, ?> jVar, V v4) {
            return new i0(this.f56071i, v4, (v) jVar);
        }

        @Override // com.google.common.collect.o4.o
        o Q() {
            return this;
        }

        @Override // com.google.common.collect.o4.o
        public void U(j<K, V, ?> jVar, h0<K, V, ? extends j<K, V, ?>> h0Var) {
            v vVar = (v) jVar;
            h0 h0Var2 = vVar.f56069e;
            vVar.f56069e = h0Var;
            h0Var2.clear();
        }

        public v<K, V> X(j<K, V, ?> jVar) {
            return (v) jVar;
        }

        w<K, V> Y() {
            return this;
        }

        @Override // com.google.common.collect.o4.o
        public j a(j jVar) {
            return (v) jVar;
        }

        @Override // com.google.common.collect.o4.o
        ReferenceQueue<V> s() {
            return this.f56071i;
        }

        @Override // com.google.common.collect.o4.o
        public h0<K, V, v<K, V>> t(j<K, V, ?> jVar) {
            return ((v) jVar).getValueReference();
        }

        @Override // com.google.common.collect.o4.o
        void w() {
            c(this.f56071i);
        }

        @Override // com.google.common.collect.o4.o
        void x() {
            j(this.f56071i);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    interface x<K, V, E extends j<K, V, E>> extends j<K, V, E> {
    }

    /* compiled from: MapMakerInternalMap.java */
    final class y extends o4<K, V, E, S>.i<V> {
        y(o4 o4Var) {
            super();
        }

        @Override // com.google.common.collect.o4.i, java.util.Iterator
        public V next() {
            return c().f56055c;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    final class z extends AbstractCollection<V> {
        z() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            o4.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return o4.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return o4.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new y(o4.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return o4.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return o4.r(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o4.r(this).toArray(tArr);
        }
    }

    private o4(n4 n4Var, k<K, V, E, S> kVar) {
        this.f56016e = Math.min(n4Var.b(), 65536);
        this.f56017f = n4Var.d();
        this.f56018g = kVar;
        int min = Math.min(n4Var.c(), 1073741824);
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        int i7 = 1;
        while (i7 < this.f56016e) {
            i6++;
            i7 <<= 1;
        }
        this.f56014c = 32 - i6;
        this.f56013b = i7 - 1;
        this.f56015d = new o[i7];
        int i10 = min / i7;
        while (i5 < (i7 * i10 < min ? i10 + 1 : i10)) {
            i5 <<= 1;
        }
        while (true) {
            o<K, V, E, S>[] oVarArr = this.f56015d;
            if (i4 >= oVarArr.length) {
                return;
            }
            oVarArr[i4] = e(i5, -1);
            i4++;
        }
    }

    static <K, V> o4<K, V, ? extends j<K, V, ?>, ?> d(n4 n4Var) {
        q e4 = n4Var.e();
        q qVar = q.STRONG;
        if (e4 == qVar && n4Var.f() == qVar) {
            return new o4<>(n4Var, t.a.h());
        }
        if (n4Var.e() == qVar && n4Var.f() == q.WEAK) {
            return new o4<>(n4Var, v.a.h());
        }
        q e5 = n4Var.e();
        q qVar2 = q.WEAK;
        if (e5 == qVar2 && n4Var.f() == qVar) {
            return new o4<>(n4Var, c0.a.h());
        }
        if (n4Var.e() == qVar2 && n4Var.f() == qVar2) {
            return new o4<>(n4Var, e0.a.h());
        }
        throw new AssertionError();
    }

    static <K> o4<K, n4.a, ? extends j<K, n4.a, ?>, ?> f(n4 n4Var) {
        q e4 = n4Var.e();
        q qVar = q.STRONG;
        if (e4 == qVar && n4Var.f() == qVar) {
            return new o4<>(n4Var, r.a.h());
        }
        q e5 = n4Var.e();
        q qVar2 = q.WEAK;
        if (e5 == qVar2 && n4Var.f() == qVar) {
            return new o4<>(n4Var, a0.a.h());
        }
        if (n4Var.f() == qVar2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf50a"));
        }
        throw new AssertionError();
    }

    static int p(int i4) {
        int i5 = i4 + ((i4 << 15) ^ (-12931));
        int i6 = i5 ^ (i5 >>> 10);
        int i7 = i6 + (i6 << 3);
        int i10 = i7 ^ (i7 >>> 6);
        int i11 = (i10 << 2) + (i10 << 14) + i10;
        return (i11 >>> 16) ^ i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> r(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        d4.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends j<K, V, E>> h0<K, V, E> t() {
        return (h0<K, V, E>) f56011q;
    }

    @d9.d
    E c(E e4, E e5) {
        return q(e4.getHash()).g(e4, e5);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (o<K, V, E, S> oVar : this.f56015d) {
            oVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@zc.a Object obj) {
        if (obj == null) {
            return false;
        }
        int j4 = j(obj);
        return q(j4).e(obj, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.common.collect.o4$o] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.collect.o4$o<K, V, E extends com.google.common.collect.o4$j<K, V, E>, S extends com.google.common.collect.o4$o<K, V, E, S>>[]] */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@zc.a Object obj) {
        boolean z4 = false;
        if (obj == null) {
            return false;
        }
        o<K, V, E, S>[] oVarArr = this.f56015d;
        long j4 = -1;
        int i4 = 0;
        while (i4 < 3) {
            int length = oVarArr.length;
            long j5 = 0;
            for (?? r10 = z4; r10 < length; r10++) {
                ?? r11 = oVarArr[r10];
                int i5 = r11.f56059c;
                AtomicReferenceArray<E> atomicReferenceArray = r11.f56062f;
                for (?? r13 = z4; r13 < atomicReferenceArray.length(); r13++) {
                    for (E e4 = atomicReferenceArray.get(r13); e4 != null; e4 = e4.getNext()) {
                        Object q4 = r11.q(e4);
                        if (q4 != null && u().d(obj, q4)) {
                            return true;
                        }
                    }
                }
                j5 += r11.f56060d;
                z4 = false;
            }
            if (j5 == j4) {
                return false;
            }
            i4++;
            j4 = j5;
            z4 = false;
        }
        return z4;
    }

    o<K, V, E, S> e(int i4, int i5) {
        return this.f56018g.f(this, i4, i5);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f56021j;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.f56021j = hVar;
        return hVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@zc.a Object obj) {
        if (obj == null) {
            return null;
        }
        int j4 = j(obj);
        return q(j4).l(obj, j4);
    }

    E h(@zc.a Object obj) {
        if (obj == null) {
            return null;
        }
        int j4 = j(obj);
        return q(j4).m(obj, j4);
    }

    V i(E e4) {
        if (e4.getKey() == null) {
            return null;
        }
        return (V) e4.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        o<K, V, E, S>[] oVarArr = this.f56015d;
        long j4 = 0;
        for (int i4 = 0; i4 < oVarArr.length; i4++) {
            if (oVarArr[i4].f56059c != 0) {
                return false;
            }
            j4 += oVarArr[i4].f56060d;
        }
        if (j4 == 0) {
            return true;
        }
        for (int i5 = 0; i5 < oVarArr.length; i5++) {
            if (oVarArr[i5].f56059c != 0) {
                return false;
            }
            j4 -= oVarArr[i5].f56060d;
        }
        return j4 == 0;
    }

    int j(Object obj) {
        return p(this.f56017f.f(obj));
    }

    @d9.d
    boolean k(j<K, V, ?> jVar) {
        return q(jVar.getHash()).r(jVar) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f56019h;
        if (set != null) {
            return set;
        }
        m mVar = new m();
        this.f56019h = mVar;
        return mVar;
    }

    @d9.d
    q l() {
        return this.f56018g.e();
    }

    final o<K, V, E, S>[] m(int i4) {
        return new o[i4];
    }

    void n(E e4) {
        int hash = e4.getHash();
        q(hash).E(e4, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void o(h0<K, V, E> h0Var) {
        E d5 = h0Var.d();
        int hash = d5.getHash();
        q(hash).F(d5.getKey(), hash, h0Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @f9.a
    public V put(K k4, V v4) {
        k4.getClass();
        v4.getClass();
        int j4 = j(k4);
        return q(j4).D(k4, j4, v4, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @f9.a
    public V putIfAbsent(K k4, V v4) {
        k4.getClass();
        v4.getClass();
        int j4 = j(k4);
        return q(j4).D(k4, j4, v4, true);
    }

    o<K, V, E, S> q(int i4) {
        return this.f56015d[(i4 >>> this.f56014c) & this.f56013b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @f9.a
    public V remove(@zc.a Object obj) {
        if (obj == null) {
            return null;
        }
        int j4 = j(obj);
        return q(j4).G(obj, j4);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @f9.a
    public V replace(K k4, V v4) {
        k4.getClass();
        v4.getClass();
        int j4 = j(k4);
        return q(j4).M(k4, j4, v4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j4 = 0;
        for (int i4 = 0; i4 < this.f56015d.length; i4++) {
            j4 += r0[i4].f56059c;
        }
        return com.google.common.primitives.l.x(j4);
    }

    @d9.d
    com.google.common.base.q<Object> u() {
        return this.f56018g.b().defaultEquivalence();
    }

    @d9.d
    q v() {
        return this.f56018g.b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f56020i;
        if (collection != null) {
            return collection;
        }
        z zVar = new z();
        this.f56020i = zVar;
        return zVar;
    }

    Object w() {
        return new p(this.f56018g.e(), this.f56018g.b(), this.f56017f, this.f56018g.b().defaultEquivalence(), this.f56016e, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @f9.a
    public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int j4 = j(obj);
        return q(j4).H(obj, j4, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @f9.a
    public boolean replace(K k4, @zc.a V v4, V v5) {
        k4.getClass();
        v5.getClass();
        if (v4 == null) {
            return false;
        }
        int j4 = j(k4);
        return q(j4).N(k4, j4, v4, v5);
    }
}
