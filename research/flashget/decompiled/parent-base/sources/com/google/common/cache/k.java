package com.google.common.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.s0;
import com.google.common.base.x0;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.a;
import com.google.common.cache.d;
import com.google.common.collect.d4;
import com.google.common.collect.h3;
import com.google.common.collect.q3;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.g1;
import com.google.common.util.concurrent.j2;
import com.google.common.util.concurrent.s1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: LocalCache.java */
@d9.b(emulated = true)
/* loaded from: classes6.dex */
class k<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final int A = 63;
    static final int B = 16;
    static final Logger C = Logger.getLogger(k.class.getName());
    static final a0<Object, Object> D = new a();
    static final Queue<?> E = new b();

    /* renamed from: x, reason: collision with root package name */
    static final int f55161x = 1073741824;

    /* renamed from: y, reason: collision with root package name */
    static final int f55162y = 65536;

    /* renamed from: z, reason: collision with root package name */
    static final int f55163z = 3;

    /* renamed from: b, reason: collision with root package name */
    final int f55164b;

    /* renamed from: c, reason: collision with root package name */
    final int f55165c;

    /* renamed from: d, reason: collision with root package name */
    final r<K, V>[] f55166d;

    /* renamed from: e, reason: collision with root package name */
    final int f55167e;

    /* renamed from: f, reason: collision with root package name */
    final com.google.common.base.q<Object> f55168f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.common.base.q<Object> f55169g;

    /* renamed from: h, reason: collision with root package name */
    final t f55170h;

    /* renamed from: i, reason: collision with root package name */
    final t f55171i;

    /* renamed from: j, reason: collision with root package name */
    final long f55172j;

    /* renamed from: k, reason: collision with root package name */
    final com.google.common.cache.x<K, V> f55173k;

    /* renamed from: l, reason: collision with root package name */
    final long f55174l;

    /* renamed from: m, reason: collision with root package name */
    final long f55175m;

    /* renamed from: n, reason: collision with root package name */
    final long f55176n;

    /* renamed from: o, reason: collision with root package name */
    final Queue<com.google.common.cache.v<K, V>> f55177o;

    /* renamed from: p, reason: collision with root package name */
    final com.google.common.cache.r<K, V> f55178p;

    /* renamed from: q, reason: collision with root package name */
    final x0 f55179q;

    /* renamed from: r, reason: collision with root package name */
    final f f55180r;

    /* renamed from: s, reason: collision with root package name */
    final a.b f55181s;

    /* renamed from: t, reason: collision with root package name */
    @zc.a
    final CacheLoader<? super K, V> f55182t;

    /* renamed from: u, reason: collision with root package name */
    @zc.a
    @ma.h
    Set<K> f55183u;

    /* renamed from: v, reason: collision with root package name */
    @zc.a
    @ma.h
    Collection<V> f55184v;

    /* renamed from: w, reason: collision with root package name */
    @zc.a
    @ma.h
    Set<Map.Entry<K, V>> f55185w;

    /* compiled from: LocalCache.java */
    class a implements a0<Object, Object> {
        a() {
        }

        @Override // com.google.common.cache.k.a0
        public int a() {
            return 0;
        }

        @Override // com.google.common.cache.k.a0
        public boolean c() {
            return false;
        }

        @Override // com.google.common.cache.k.a0
        public com.google.common.cache.p<Object, Object> d() {
            return null;
        }

        @Override // com.google.common.cache.k.a0
        public void e(Object obj) {
        }

        @Override // com.google.common.cache.k.a0
        public a0<Object, Object> f(ReferenceQueue<Object> referenceQueue, @zc.a Object obj, com.google.common.cache.p<Object, Object> pVar) {
            return this;
        }

        @Override // com.google.common.cache.k.a0
        public Object g() {
            return null;
        }

        @Override // com.google.common.cache.k.a0
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.k.a0
        public boolean isActive() {
            return false;
        }
    }

    /* compiled from: LocalCache.java */
    interface a0<K, V> {
        int a();

        boolean c();

        @zc.a
        com.google.common.cache.p<K, V> d();

        void e(@zc.a V v4);

        a0<K, V> f(ReferenceQueue<V> referenceQueue, @zc.a V v4, com.google.common.cache.p<K, V> pVar);

        V g() throws ExecutionException;

        @zc.a
        V get();

        boolean isActive();
    }

    /* compiled from: LocalCache.java */
    class b extends AbstractQueue<Object> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return q3.I().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* compiled from: LocalCache.java */
    final class b0 extends AbstractCollection<V> {
        b0() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return k.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return k.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new z(k.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return k.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return k.U(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) k.U(this).toArray(eArr);
        }
    }

    /* compiled from: LocalCache.java */
    abstract class c<T> extends AbstractSet<T> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return k.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return k.U(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) k.U(this).toArray(eArr);
        }
    }

    /* compiled from: LocalCache.java */
    static final class c0<K, V> extends e0<K, V> {

        /* renamed from: e, reason: collision with root package name */
        volatile long f55188e;

        /* renamed from: f, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55189f;

        /* renamed from: g, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55190g;

        c0(ReferenceQueue<K> referenceQueue, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            super(referenceQueue, k4, i4, pVar);
            this.f55188e = Long.MAX_VALUE;
            this.f55189f = k.F();
            this.f55190g = q.INSTANCE;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public long getAccessTime() {
            return this.f55188e;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInAccessQueue() {
            return this.f55189f;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInAccessQueue() {
            return this.f55190g;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setAccessTime(long j4) {
            this.f55188e = j4;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setNextInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55189f = pVar;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setPreviousInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55190g = pVar;
        }
    }

    /* compiled from: LocalCache.java */
    static abstract class d<K, V> implements com.google.common.cache.p<K, V> {
        d() {
        }

        @Override // com.google.common.cache.p
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public a0<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public void setAccessTime(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public void setNextInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public void setNextInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public void setPreviousInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public void setPreviousInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public void setValueReference(a0<K, V> a0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public void setWriteTime(long j4) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: LocalCache.java */
    static final class d0<K, V> extends e0<K, V> {

        /* renamed from: e, reason: collision with root package name */
        volatile long f55191e;

        /* renamed from: f, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55192f;

        /* renamed from: g, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55193g;

        /* renamed from: h, reason: collision with root package name */
        volatile long f55194h;

        /* renamed from: i, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55195i;

        /* renamed from: j, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55196j;

        d0(ReferenceQueue<K> referenceQueue, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            super(referenceQueue, k4, i4, pVar);
            this.f55191e = Long.MAX_VALUE;
            this.f55192f = k.F();
            q qVar = q.INSTANCE;
            this.f55193g = qVar;
            this.f55194h = Long.MAX_VALUE;
            this.f55195i = qVar;
            this.f55196j = qVar;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public long getAccessTime() {
            return this.f55191e;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInAccessQueue() {
            return this.f55192f;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInWriteQueue() {
            return this.f55195i;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInAccessQueue() {
            return this.f55193g;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInWriteQueue() {
            return this.f55196j;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public long getWriteTime() {
            return this.f55194h;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setAccessTime(long j4) {
            this.f55191e = j4;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setNextInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55192f = pVar;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setNextInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55195i = pVar;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setPreviousInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55193g = pVar;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setPreviousInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55196j = pVar;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setWriteTime(long j4) {
            this.f55194h = j4;
        }
    }

    /* compiled from: LocalCache.java */
    static final class e<K, V> extends AbstractQueue<com.google.common.cache.p<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.cache.p<K, V> f55197b = new a(this);

        /* compiled from: LocalCache.java */
        class a extends d<K, V> {

            /* renamed from: b, reason: collision with root package name */
            @ma.i
            com.google.common.cache.p<K, V> f55198b = this;

            /* renamed from: c, reason: collision with root package name */
            @ma.i
            com.google.common.cache.p<K, V> f55199c = this;

            a(e eVar) {
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public com.google.common.cache.p<K, V> getNextInAccessQueue() {
                return this.f55198b;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public com.google.common.cache.p<K, V> getPreviousInAccessQueue() {
                return this.f55199c;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public void setAccessTime(long j4) {
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public void setNextInAccessQueue(com.google.common.cache.p<K, V> pVar) {
                this.f55198b = pVar;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public void setPreviousInAccessQueue(com.google.common.cache.p<K, V> pVar) {
                this.f55199c = pVar;
            }
        }

        /* compiled from: LocalCache.java */
        class b extends com.google.common.collect.l<com.google.common.cache.p<K, V>> {
            b(com.google.common.cache.p pVar) {
                super(pVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.p<K, V> a(com.google.common.cache.p<K, V> pVar) {
                com.google.common.cache.p<K, V> nextInAccessQueue = pVar.getNextInAccessQueue();
                if (nextInAccessQueue == e.this.f55197b) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        e() {
        }

        @Override // java.util.Queue
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.p<K, V> pVar) {
            k.d(pVar.getPreviousInAccessQueue(), pVar.getNextInAccessQueue());
            k.d(this.f55197b.getPreviousInAccessQueue(), pVar);
            k.d(pVar, this.f55197b);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.p<K, V> peek() {
            com.google.common.cache.p<K, V> nextInAccessQueue = this.f55197b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f55197b) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.p<K, V> nextInAccessQueue = this.f55197b.getNextInAccessQueue();
            while (true) {
                com.google.common.cache.p<K, V> pVar = this.f55197b;
                if (nextInAccessQueue == pVar) {
                    pVar.setNextInAccessQueue(pVar);
                    com.google.common.cache.p<K, V> pVar2 = this.f55197b;
                    pVar2.setPreviousInAccessQueue(pVar2);
                    return;
                } else {
                    com.google.common.cache.p<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    k.H(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.p) obj).getNextInAccessQueue() != q.INSTANCE;
        }

        @Override // java.util.Queue
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.p<K, V> poll() {
            com.google.common.cache.p<K, V> nextInAccessQueue = this.f55197b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f55197b) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f55197b.getNextInAccessQueue() == this.f55197b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.p<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.p pVar = (com.google.common.cache.p) obj;
            com.google.common.cache.p<K, V> previousInAccessQueue = pVar.getPreviousInAccessQueue();
            com.google.common.cache.p<K, V> nextInAccessQueue = pVar.getNextInAccessQueue();
            k.d(previousInAccessQueue, nextInAccessQueue);
            k.H(pVar);
            return nextInAccessQueue != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i4 = 0;
            for (com.google.common.cache.p<K, V> nextInAccessQueue = this.f55197b.getNextInAccessQueue(); nextInAccessQueue != this.f55197b; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i4++;
            }
            return i4;
        }
    }

    /* compiled from: LocalCache.java */
    static class e0<K, V> extends WeakReference<K> implements com.google.common.cache.p<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final int f55201b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        final com.google.common.cache.p<K, V> f55202c;

        /* renamed from: d, reason: collision with root package name */
        volatile a0<K, V> f55203d;

        e0(ReferenceQueue<K> referenceQueue, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            super(k4, referenceQueue);
            this.f55203d = k.V();
            this.f55201b = i4;
            this.f55202c = pVar;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public int getHash() {
            return this.f55201b;
        }

        @Override // com.google.common.cache.p
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNext() {
            return this.f55202c;
        }

        public com.google.common.cache.p<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.p<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.p<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.p<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public a0<K, V> getValueReference() {
            return this.f55203d;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j4) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.p
        public void setValueReference(a0<K, V> a0Var) {
            this.f55203d = a0Var;
        }

        public void setWriteTime(long j4) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocalCache.java */
    static abstract class f {
        private static final /* synthetic */ f[] $VALUES;
        static final int ACCESS_MASK = 1;
        public static final f STRONG;
        public static final f STRONG_ACCESS;
        public static final f STRONG_ACCESS_WRITE;
        public static final f STRONG_WRITE;
        public static final f WEAK;
        public static final f WEAK_ACCESS;
        public static final f WEAK_ACCESS_WRITE;
        static final int WEAK_MASK = 4;
        public static final f WEAK_WRITE;
        static final int WRITE_MASK = 2;
        static final f[] factories;

        /* compiled from: LocalCache.java */
        enum a extends f {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
                return new w(k4, i4, pVar);
            }
        }

        /* compiled from: LocalCache.java */
        enum b extends f {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> copyEntry(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
                com.google.common.cache.p<K, V> copyEntry = super.copyEntry(rVar, pVar, pVar2);
                copyAccessEntry(pVar, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
                return new u(k4, i4, pVar);
            }
        }

        /* compiled from: LocalCache.java */
        enum c extends f {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> copyEntry(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
                com.google.common.cache.p<K, V> copyEntry = super.copyEntry(rVar, pVar, pVar2);
                copyWriteEntry(pVar, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
                return new y(k4, i4, pVar);
            }
        }

        /* compiled from: LocalCache.java */
        enum d extends f {
            d(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> copyEntry(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
                com.google.common.cache.p<K, V> copyEntry = super.copyEntry(rVar, pVar, pVar2);
                copyAccessEntry(pVar, copyEntry);
                copyWriteEntry(pVar, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
                return new v(k4, i4, pVar);
            }
        }

        /* compiled from: LocalCache.java */
        enum e extends f {
            e(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
                return new e0(rVar.f55259i, k4, i4, pVar);
            }
        }

        /* compiled from: LocalCache.java */
        /* renamed from: com.google.common.cache.k$f$f, reason: collision with other inner class name */
        enum C0836f extends f {
            C0836f(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> copyEntry(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
                com.google.common.cache.p<K, V> copyEntry = super.copyEntry(rVar, pVar, pVar2);
                copyAccessEntry(pVar, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
                return new c0(rVar.f55259i, k4, i4, pVar);
            }
        }

        /* compiled from: LocalCache.java */
        enum g extends f {
            g(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> copyEntry(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
                com.google.common.cache.p<K, V> copyEntry = super.copyEntry(rVar, pVar, pVar2);
                copyWriteEntry(pVar, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
                return new g0(rVar.f55259i, k4, i4, pVar);
            }
        }

        /* compiled from: LocalCache.java */
        enum h extends f {
            h(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> copyEntry(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
                com.google.common.cache.p<K, V> copyEntry = super.copyEntry(rVar, pVar, pVar2);
                copyAccessEntry(pVar, copyEntry);
                copyWriteEntry(pVar, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.k.f
            <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
                return new d0(rVar.f55259i, k4, i4, pVar);
            }
        }

        private static /* synthetic */ f[] $values() {
            return new f[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        static {
            a aVar = new a(ProtectedSandApp.s("\uf420"), 0);
            STRONG = aVar;
            b bVar = new b(ProtectedSandApp.s("\uf421"), 1);
            STRONG_ACCESS = bVar;
            c cVar = new c(ProtectedSandApp.s("\uf422"), 2);
            STRONG_WRITE = cVar;
            d dVar = new d(ProtectedSandApp.s("\uf423"), 3);
            STRONG_ACCESS_WRITE = dVar;
            e eVar = new e(ProtectedSandApp.s("\uf424"), 4);
            WEAK = eVar;
            C0836f c0836f = new C0836f(ProtectedSandApp.s("\uf425"), 5);
            WEAK_ACCESS = c0836f;
            g gVar = new g(ProtectedSandApp.s("\uf426"), 6);
            WEAK_WRITE = gVar;
            h hVar = new h(ProtectedSandApp.s("\uf427"), 7);
            WEAK_ACCESS_WRITE = hVar;
            $VALUES = $values();
            factories = new f[]{aVar, bVar, cVar, dVar, eVar, c0836f, gVar, hVar};
        }

        private f(String str, int i4) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        static f getFactory(t tVar, boolean z4, boolean z5) {
            return factories[(tVar == t.WEAK ? (char) 4 : (char) 0) | (z4 ? 1 : 0) | (z5 ? 2 : 0)];
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }

        <K, V> void copyAccessEntry(com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
            pVar2.setAccessTime(pVar.getAccessTime());
            k.d(pVar.getPreviousInAccessQueue(), pVar2);
            k.d(pVar2, pVar.getNextInAccessQueue());
            k.H(pVar);
        }

        <K, V> com.google.common.cache.p<K, V> copyEntry(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
            return newEntry(rVar, pVar.getKey(), pVar.getHash(), pVar2);
        }

        <K, V> void copyWriteEntry(com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
            pVar2.setWriteTime(pVar.getWriteTime());
            k.e(pVar.getPreviousInWriteQueue(), pVar2);
            k.e(pVar2, pVar.getNextInWriteQueue());
            k.I(pVar);
        }

        abstract <K, V> com.google.common.cache.p<K, V> newEntry(r<K, V> rVar, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar);

        /* synthetic */ f(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* compiled from: LocalCache.java */
    static class f0<K, V> extends WeakReference<V> implements a0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.cache.p<K, V> f55204b;

        f0(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar) {
            super(v4, referenceQueue);
            this.f55204b = pVar;
        }

        @Override // com.google.common.cache.k.a0
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.k.a0
        public boolean c() {
            return false;
        }

        @Override // com.google.common.cache.k.a0
        public com.google.common.cache.p<K, V> d() {
            return this.f55204b;
        }

        @Override // com.google.common.cache.k.a0
        public void e(V v4) {
        }

        @Override // com.google.common.cache.k.a0
        public a0<K, V> f(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar) {
            return new f0(referenceQueue, v4, pVar);
        }

        @Override // com.google.common.cache.k.a0
        public V g() {
            return get();
        }

        @Override // com.google.common.cache.k.a0
        public boolean isActive() {
            return true;
        }
    }

    /* compiled from: LocalCache.java */
    final class g extends k<K, V>.i<Map.Entry<K, V>> {
        g(k kVar) {
            super();
        }

        public Map.Entry<K, V> f() {
            return c();
        }

        @Override // com.google.common.cache.k.i, java.util.Iterator
        public Object next() {
            return c();
        }
    }

    /* compiled from: LocalCache.java */
    static final class g0<K, V> extends e0<K, V> {

        /* renamed from: e, reason: collision with root package name */
        volatile long f55205e;

        /* renamed from: f, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55206f;

        /* renamed from: g, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55207g;

        g0(ReferenceQueue<K> referenceQueue, K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            super(referenceQueue, k4, i4, pVar);
            this.f55205e = Long.MAX_VALUE;
            this.f55206f = k.F();
            this.f55207g = q.INSTANCE;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInWriteQueue() {
            return this.f55206f;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInWriteQueue() {
            return this.f55207g;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public long getWriteTime() {
            return this.f55205e;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setNextInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55206f = pVar;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setPreviousInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55207g = pVar;
        }

        @Override // com.google.common.cache.k.e0, com.google.common.cache.p
        public void setWriteTime(long j4) {
            this.f55205e = j4;
        }
    }

    /* compiled from: LocalCache.java */
    final class h extends k<K, V>.c<Map.Entry<K, V>> {
        h() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = k.this.get(key)) != null && k.this.f55169g.d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g(k.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && k.this.remove(key, entry.getValue());
        }
    }

    /* compiled from: LocalCache.java */
    static final class h0<K, V> extends s<K, V> {

        /* renamed from: c, reason: collision with root package name */
        final int f55209c;

        h0(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar, int i4) {
            super(referenceQueue, v4, pVar);
            this.f55209c = i4;
        }

        @Override // com.google.common.cache.k.s, com.google.common.cache.k.a0
        public int a() {
            return this.f55209c;
        }

        @Override // com.google.common.cache.k.s, com.google.common.cache.k.a0
        public a0<K, V> f(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar) {
            return new h0(referenceQueue, v4, pVar, this.f55209c);
        }
    }

    /* compiled from: LocalCache.java */
    abstract class i<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        int f55210b;

        /* renamed from: c, reason: collision with root package name */
        int f55211c = -1;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        r<K, V> f55212d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        AtomicReferenceArray<com.google.common.cache.p<K, V>> f55213e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        com.google.common.cache.p<K, V> f55214f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        k<K, V>.l0 f55215g;

        /* renamed from: h, reason: collision with root package name */
        @zc.a
        k<K, V>.l0 f55216h;

        i() {
            this.f55210b = k.this.f55166d.length - 1;
            a();
        }

        final void a() {
            this.f55215g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i4 = this.f55210b;
                if (i4 < 0) {
                    return;
                }
                r<K, V>[] rVarArr = k.this.f55166d;
                this.f55210b = i4 - 1;
                r<K, V> rVar = rVarArr[i4];
                this.f55212d = rVar;
                if (rVar.f55253c != 0) {
                    this.f55213e = this.f55212d.f55257g;
                    this.f55211c = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(com.google.common.cache.p<K, V> pVar) {
            try {
                long a5 = k.this.f55179q.a();
                K key = pVar.getKey();
                Object u4 = k.this.u(pVar, a5);
                if (u4 == null) {
                    this.f55212d.F();
                    return false;
                }
                this.f55215g = new l0(key, u4);
                this.f55212d.F();
                return true;
            } catch (Throwable th) {
                this.f55212d.F();
                throw th;
            }
        }

        k<K, V>.l0 c() {
            k<K, V>.l0 l0Var = this.f55215g;
            if (l0Var == null) {
                throw new NoSuchElementException();
            }
            this.f55216h = l0Var;
            a();
            return this.f55216h;
        }

        boolean d() {
            com.google.common.cache.p<K, V> pVar = this.f55214f;
            if (pVar == null) {
                return false;
            }
            while (true) {
                this.f55214f = pVar.getNext();
                com.google.common.cache.p<K, V> pVar2 = this.f55214f;
                if (pVar2 == null) {
                    return false;
                }
                if (b(pVar2)) {
                    return true;
                }
                pVar = this.f55214f;
            }
        }

        boolean e() {
            while (true) {
                int i4 = this.f55211c;
                if (i4 < 0) {
                    return false;
                }
                AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55213e;
                this.f55211c = i4 - 1;
                com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(i4);
                this.f55214f = pVar;
                if (pVar != null && (b(pVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55215g != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.l0.g0(this.f55216h != null);
            k.this.remove(this.f55216h.f55227b);
            this.f55216h = null;
        }
    }

    /* compiled from: LocalCache.java */
    static final class i0<K, V> extends x<K, V> {

        /* renamed from: c, reason: collision with root package name */
        final int f55218c;

        i0(V v4, int i4) {
            super(v4);
            this.f55218c = i4;
        }

        @Override // com.google.common.cache.k.x, com.google.common.cache.k.a0
        public int a() {
            return this.f55218c;
        }
    }

    /* compiled from: LocalCache.java */
    final class j extends k<K, V>.i<K> {
        j(k kVar) {
            super();
        }

        @Override // com.google.common.cache.k.i, java.util.Iterator
        public K next() {
            return c().f55227b;
        }
    }

    /* compiled from: LocalCache.java */
    static final class j0<K, V> extends f0<K, V> {

        /* renamed from: c, reason: collision with root package name */
        final int f55219c;

        j0(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar, int i4) {
            super(referenceQueue, v4, pVar);
            this.f55219c = i4;
        }

        @Override // com.google.common.cache.k.f0, com.google.common.cache.k.a0
        public int a() {
            return this.f55219c;
        }

        @Override // com.google.common.cache.k.f0, com.google.common.cache.k.a0
        public a0<K, V> f(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar) {
            return new j0(referenceQueue, v4, pVar, this.f55219c);
        }
    }

    /* compiled from: LocalCache.java */
    /* renamed from: com.google.common.cache.k$k, reason: collision with other inner class name */
    final class C0837k extends k<K, V>.c<K> {
        C0837k() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j(k.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return k.this.remove(obj) != null;
        }
    }

    /* compiled from: LocalCache.java */
    static final class k0<K, V> extends AbstractQueue<com.google.common.cache.p<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.cache.p<K, V> f55221b = new a(this);

        /* compiled from: LocalCache.java */
        class a extends d<K, V> {

            /* renamed from: b, reason: collision with root package name */
            @ma.i
            com.google.common.cache.p<K, V> f55222b = this;

            /* renamed from: c, reason: collision with root package name */
            @ma.i
            com.google.common.cache.p<K, V> f55223c = this;

            a(k0 k0Var) {
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public com.google.common.cache.p<K, V> getNextInWriteQueue() {
                return this.f55222b;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public com.google.common.cache.p<K, V> getPreviousInWriteQueue() {
                return this.f55223c;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public void setNextInWriteQueue(com.google.common.cache.p<K, V> pVar) {
                this.f55222b = pVar;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public void setPreviousInWriteQueue(com.google.common.cache.p<K, V> pVar) {
                this.f55223c = pVar;
            }

            @Override // com.google.common.cache.k.d, com.google.common.cache.p
            public void setWriteTime(long j4) {
            }
        }

        /* compiled from: LocalCache.java */
        class b extends com.google.common.collect.l<com.google.common.cache.p<K, V>> {
            b(com.google.common.cache.p pVar) {
                super(pVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.p<K, V> a(com.google.common.cache.p<K, V> pVar) {
                com.google.common.cache.p<K, V> nextInWriteQueue = pVar.getNextInWriteQueue();
                if (nextInWriteQueue == k0.this.f55221b) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        k0() {
        }

        @Override // java.util.Queue
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.p<K, V> pVar) {
            k.e(pVar.getPreviousInWriteQueue(), pVar.getNextInWriteQueue());
            k.e(this.f55221b.getPreviousInWriteQueue(), pVar);
            k.e(pVar, this.f55221b);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.p<K, V> peek() {
            com.google.common.cache.p<K, V> nextInWriteQueue = this.f55221b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f55221b) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.p<K, V> nextInWriteQueue = this.f55221b.getNextInWriteQueue();
            while (true) {
                com.google.common.cache.p<K, V> pVar = this.f55221b;
                if (nextInWriteQueue == pVar) {
                    pVar.setNextInWriteQueue(pVar);
                    com.google.common.cache.p<K, V> pVar2 = this.f55221b;
                    pVar2.setPreviousInWriteQueue(pVar2);
                    return;
                } else {
                    com.google.common.cache.p<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    k.I(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.p) obj).getNextInWriteQueue() != q.INSTANCE;
        }

        @Override // java.util.Queue
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.p<K, V> poll() {
            com.google.common.cache.p<K, V> nextInWriteQueue = this.f55221b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f55221b) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f55221b.getNextInWriteQueue() == this.f55221b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.p<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.p pVar = (com.google.common.cache.p) obj;
            com.google.common.cache.p<K, V> previousInWriteQueue = pVar.getPreviousInWriteQueue();
            com.google.common.cache.p<K, V> nextInWriteQueue = pVar.getNextInWriteQueue();
            k.e(previousInWriteQueue, nextInWriteQueue);
            k.I(pVar);
            return nextInWriteQueue != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i4 = 0;
            for (com.google.common.cache.p<K, V> nextInWriteQueue = this.f55221b.getNextInWriteQueue(); nextInWriteQueue != this.f55221b; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i4++;
            }
            return i4;
        }
    }

    /* compiled from: LocalCache.java */
    static final class l<K, V> extends p<K, V> implements com.google.common.cache.j<K, V>, Serializable {

        /* renamed from: q, reason: collision with root package name */
        private static final long f55225q = 1;

        /* renamed from: p, reason: collision with root package name */
        @zc.a
        transient com.google.common.cache.j<K, V> f55226p;

        l(k<K, V> kVar) {
            super(kVar);
        }

        private void A3(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f55226p = (com.google.common.cache.j<K, V>) F3().b(this.f55250m);
        }

        private Object E3() {
            return this.f55226p;
        }

        @Override // com.google.common.cache.j
        public void H2(K k4) {
            this.f55226p.H2(k4);
        }

        @Override // com.google.common.cache.j
        public V X(K k4) {
            return this.f55226p.X(k4);
        }

        @Override // com.google.common.cache.j, com.google.common.base.x
        public final V apply(K k4) {
            return this.f55226p.apply(k4);
        }

        @Override // com.google.common.cache.j
        public V get(K k4) throws ExecutionException {
            return this.f55226p.get(k4);
        }

        @Override // com.google.common.cache.j
        public h3<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f55226p.r0(iterable);
        }
    }

    /* compiled from: LocalCache.java */
    final class l0 implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final K f55227b;

        /* renamed from: c, reason: collision with root package name */
        V f55228c;

        l0(K k4, V v4) {
            this.f55227b = k4;
            this.f55228c = v4;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f55227b.equals(entry.getKey()) && this.f55228c.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f55227b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f55228c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f55227b.hashCode() ^ this.f55228c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            V v5 = (V) k.this.put(this.f55227b, v4);
            this.f55228c = v4;
            return v5;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55227b);
            String valueOf2 = String.valueOf(this.f55228c);
            return com.google.common.base.h.a(valueOf2.length() + valueOf.length() + 1, valueOf, ProtectedSandApp.s("\uf428"), valueOf2);
        }
    }

    /* compiled from: LocalCache.java */
    static class m<K, V> implements a0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        volatile a0<K, V> f55230b;

        /* renamed from: c, reason: collision with root package name */
        final s1<V> f55231c;

        /* renamed from: d, reason: collision with root package name */
        final s0 f55232d;

        /* compiled from: LocalCache.java */
        class a implements com.google.common.base.x<V, V> {
            a() {
            }

            @Override // com.google.common.base.x
            public V apply(V v4) {
                m.this.k(v4);
                return v4;
            }
        }

        public m() {
            this(k.V());
        }

        private ListenableFuture<V> h(Throwable th) {
            return com.google.common.util.concurrent.s0.l(th);
        }

        @Override // com.google.common.cache.k.a0
        public int a() {
            return this.f55230b.a();
        }

        public long b() {
            return this.f55232d.g(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.k.a0
        public boolean c() {
            return true;
        }

        @Override // com.google.common.cache.k.a0
        public com.google.common.cache.p<K, V> d() {
            return null;
        }

        @Override // com.google.common.cache.k.a0
        public void e(@zc.a V v4) {
            if (v4 != null) {
                k(v4);
            } else {
                this.f55230b = k.V();
            }
        }

        @Override // com.google.common.cache.k.a0
        public a0<K, V> f(ReferenceQueue<V> referenceQueue, @zc.a V v4, com.google.common.cache.p<K, V> pVar) {
            return this;
        }

        @Override // com.google.common.cache.k.a0
        public V g() throws ExecutionException {
            return (V) j2.f(this.f55231c);
        }

        @Override // com.google.common.cache.k.a0
        public V get() {
            return this.f55230b.get();
        }

        public a0<K, V> i() {
            return this.f55230b;
        }

        @Override // com.google.common.cache.k.a0
        public boolean isActive() {
            return this.f55230b.isActive();
        }

        public ListenableFuture<V> j(K k4, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f55232d.k();
                V v4 = this.f55230b.get();
                if (v4 == null) {
                    V d5 = cacheLoader.d(k4);
                    return k(d5) ? this.f55231c : com.google.common.util.concurrent.s0.m(d5);
                }
                ListenableFuture<V> f4 = cacheLoader.f(k4, v4);
                return f4 == null ? com.google.common.util.concurrent.s0.m(null) : com.google.common.util.concurrent.s0.x(f4, new a(), g1.c());
            } catch (Throwable th) {
                ListenableFuture<V> l4 = l(th) ? this.f55231c : com.google.common.util.concurrent.s0.l(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return l4;
            }
        }

        public boolean k(@zc.a V v4) {
            return this.f55231c.B(v4);
        }

        public boolean l(Throwable th) {
            return this.f55231c.C(th);
        }

        public m(a0<K, V> a0Var) {
            this.f55231c = s1.F();
            this.f55232d = s0.e();
            this.f55230b = a0Var;
        }
    }

    /* compiled from: LocalCache.java */
    static class n<K, V> extends o<K, V> implements com.google.common.cache.j<K, V> {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55234d = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(com.google.common.cache.d<? super K, ? super V> dVar, CacheLoader<? super K, V> cacheLoader) {
            super(new k(dVar, cacheLoader), null);
            cacheLoader.getClass();
        }

        @Override // com.google.common.cache.j
        public void H2(K k4) {
            this.f55236b.Q(k4);
        }

        @Override // com.google.common.cache.j
        public V X(K k4) {
            try {
                return get(k4);
            } catch (ExecutionException e4) {
                throw new UncheckedExecutionException(e4.getCause());
            }
        }

        @Override // com.google.common.cache.k.o
        Object a() {
            return new l(this.f55236b);
        }

        @Override // com.google.common.cache.j, com.google.common.base.x
        public final V apply(K k4) {
            return X(k4);
        }

        @Override // com.google.common.cache.j
        public V get(K k4) throws ExecutionException {
            return this.f55236b.v(k4);
        }

        @Override // com.google.common.cache.j
        public h3<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f55236b.p(iterable);
        }
    }

    /* compiled from: LocalCache.java */
    static class o<K, V> implements com.google.common.cache.c<K, V>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55235c = 1;

        /* renamed from: b, reason: collision with root package name */
        final k<K, V> f55236b;

        /* compiled from: LocalCache.java */
        class a extends CacheLoader<Object, V> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f55237b;

            a(o oVar, Callable callable) {
                this.f55237b = callable;
            }

            @Override // com.google.common.cache.CacheLoader
            public V d(Object obj) throws Exception {
                return (V) this.f55237b.call();
            }
        }

        /* synthetic */ o(k kVar, a aVar) {
            this(kVar);
        }

        @Override // com.google.common.cache.c
        @zc.a
        public V H1(Object obj) {
            return this.f55236b.t(obj);
        }

        Object a() {
            return new p(this.f55236b);
        }

        @Override // com.google.common.cache.c
        public ConcurrentMap<K, V> f() {
            return this.f55236b;
        }

        @Override // com.google.common.cache.c
        public void f2(Iterable<?> iterable) {
            this.f55236b.x(iterable);
        }

        @Override // com.google.common.cache.c
        public V j0(K k4, Callable<? extends V> callable) throws ExecutionException {
            callable.getClass();
            return this.f55236b.o(k4, new a(this, callable));
        }

        @Override // com.google.common.cache.c
        public h3<K, V> j3(Iterable<?> iterable) {
            return this.f55236b.q(iterable);
        }

        @Override // com.google.common.cache.c
        public void l1(Object obj) {
            obj.getClass();
            this.f55236b.remove(obj);
        }

        @Override // com.google.common.cache.c
        public void p() {
            this.f55236b.c();
        }

        @Override // com.google.common.cache.c
        public void put(K k4, V v4) {
            this.f55236b.put(k4, v4);
        }

        @Override // com.google.common.cache.c
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f55236b.putAll(map);
        }

        @Override // com.google.common.cache.c
        public com.google.common.cache.f s3() {
            a.C0833a c0833a = new a.C0833a();
            c0833a.g(this.f55236b.f55181s);
            for (r<K, V> rVar : this.f55236b.f55166d) {
                c0833a.g(rVar.f55265o);
            }
            return c0833a.f();
        }

        @Override // com.google.common.cache.c
        public long size() {
            return this.f55236b.B();
        }

        @Override // com.google.common.cache.c
        public void x() {
            this.f55236b.clear();
        }

        o(com.google.common.cache.d<? super K, ? super V> dVar) {
            this(new k(dVar, null));
        }

        private o(k<K, V> kVar) {
            this.f55236b = kVar;
        }
    }

    /* compiled from: LocalCache.java */
    static class p<K, V> extends com.google.common.cache.h<K, V> implements Serializable {

        /* renamed from: o, reason: collision with root package name */
        private static final long f55238o = 1;

        /* renamed from: b, reason: collision with root package name */
        final t f55239b;

        /* renamed from: c, reason: collision with root package name */
        final t f55240c;

        /* renamed from: d, reason: collision with root package name */
        final com.google.common.base.q<Object> f55241d;

        /* renamed from: e, reason: collision with root package name */
        final com.google.common.base.q<Object> f55242e;

        /* renamed from: f, reason: collision with root package name */
        final long f55243f;

        /* renamed from: g, reason: collision with root package name */
        final long f55244g;

        /* renamed from: h, reason: collision with root package name */
        final long f55245h;

        /* renamed from: i, reason: collision with root package name */
        final com.google.common.cache.x<K, V> f55246i;

        /* renamed from: j, reason: collision with root package name */
        final int f55247j;

        /* renamed from: k, reason: collision with root package name */
        final com.google.common.cache.r<? super K, ? super V> f55248k;

        /* renamed from: l, reason: collision with root package name */
        @zc.a
        final x0 f55249l;

        /* renamed from: m, reason: collision with root package name */
        final CacheLoader<? super K, V> f55250m;

        /* renamed from: n, reason: collision with root package name */
        @zc.a
        transient com.google.common.cache.c<K, V> f55251n;

        p(k<K, V> kVar) {
            this(kVar.f55170h, kVar.f55171i, kVar.f55168f, kVar.f55169g, kVar.f55175m, kVar.f55174l, kVar.f55172j, kVar.f55173k, kVar.f55167e, kVar.f55178p, kVar.f55179q, kVar.f55182t);
        }

        private void A3(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f55251n = (com.google.common.cache.c<K, V>) F3().a();
        }

        private Object E3() {
            return this.f55251n;
        }

        com.google.common.cache.d<K, V> F3() {
            com.google.common.cache.d<K, V> dVar = (com.google.common.cache.d<K, V>) com.google.common.cache.d.D().H(this.f55239b).I(this.f55240c).z(this.f55241d).L(this.f55242e).e(this.f55247j).G(this.f55248k);
            dVar.f55117a = false;
            long j4 = this.f55243f;
            if (j4 > 0) {
                dVar.g(j4, TimeUnit.NANOSECONDS);
            }
            long j5 = this.f55244g;
            if (j5 > 0) {
                dVar.f(j5, TimeUnit.NANOSECONDS);
            }
            com.google.common.cache.x xVar = this.f55246i;
            if (xVar != d.e.INSTANCE) {
                dVar.O(xVar);
                long j6 = this.f55245h;
                if (j6 != -1) {
                    dVar.C(j6);
                }
            } else {
                long j7 = this.f55245h;
                if (j7 != -1) {
                    dVar.B(j7);
                }
            }
            x0 x0Var = this.f55249l;
            if (x0Var != null) {
                dVar.K(x0Var);
            }
            return dVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.h, com.google.common.collect.h2
        /* renamed from: v3 */
        public com.google.common.cache.c<K, V> u3() {
            return this.f55251n;
        }

        private p(t tVar, t tVar2, com.google.common.base.q<Object> qVar, com.google.common.base.q<Object> qVar2, long j4, long j5, long j6, com.google.common.cache.x<K, V> xVar, int i4, com.google.common.cache.r<? super K, ? super V> rVar, x0 x0Var, CacheLoader<? super K, V> cacheLoader) {
            this.f55239b = tVar;
            this.f55240c = tVar2;
            this.f55241d = qVar;
            this.f55242e = qVar2;
            this.f55243f = j4;
            this.f55244g = j5;
            this.f55245h = j6;
            this.f55246i = xVar;
            this.f55247j = i4;
            this.f55248k = rVar;
            this.f55249l = (x0Var == x0.b() || x0Var == com.google.common.cache.d.f55114x) ? null : x0Var;
            this.f55250m = cacheLoader;
        }
    }

    /* compiled from: LocalCache.java */
    private enum q implements com.google.common.cache.p<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.p
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.p
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.p
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.p
        public com.google.common.cache.p<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.p
        public a0<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.p
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.p
        public void setAccessTime(long j4) {
        }

        @Override // com.google.common.cache.p
        public void setNextInAccessQueue(com.google.common.cache.p<Object, Object> pVar) {
        }

        @Override // com.google.common.cache.p
        public void setNextInWriteQueue(com.google.common.cache.p<Object, Object> pVar) {
        }

        @Override // com.google.common.cache.p
        public void setPreviousInAccessQueue(com.google.common.cache.p<Object, Object> pVar) {
        }

        @Override // com.google.common.cache.p
        public void setPreviousInWriteQueue(com.google.common.cache.p<Object, Object> pVar) {
        }

        @Override // com.google.common.cache.p
        public void setValueReference(a0<Object, Object> a0Var) {
        }

        @Override // com.google.common.cache.p
        public void setWriteTime(long j4) {
        }
    }

    /* compiled from: LocalCache.java */
    static class r<K, V> extends ReentrantLock {

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        final k<K, V> f55252b;

        /* renamed from: c, reason: collision with root package name */
        volatile int f55253c;

        /* renamed from: d, reason: collision with root package name */
        @g9.a("this")
        long f55254d;

        /* renamed from: e, reason: collision with root package name */
        int f55255e;

        /* renamed from: f, reason: collision with root package name */
        int f55256f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        volatile AtomicReferenceArray<com.google.common.cache.p<K, V>> f55257g;

        /* renamed from: h, reason: collision with root package name */
        final long f55258h;

        /* renamed from: i, reason: collision with root package name */
        @zc.a
        final ReferenceQueue<K> f55259i;

        /* renamed from: j, reason: collision with root package name */
        @zc.a
        final ReferenceQueue<V> f55260j;

        /* renamed from: k, reason: collision with root package name */
        final Queue<com.google.common.cache.p<K, V>> f55261k;

        /* renamed from: l, reason: collision with root package name */
        final AtomicInteger f55262l = new AtomicInteger();

        /* renamed from: m, reason: collision with root package name */
        @g9.a("this")
        final Queue<com.google.common.cache.p<K, V>> f55263m;

        /* renamed from: n, reason: collision with root package name */
        @g9.a("this")
        final Queue<com.google.common.cache.p<K, V>> f55264n;

        /* renamed from: o, reason: collision with root package name */
        final a.b f55265o;

        /* compiled from: LocalCache.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f55266b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f55267c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ m f55268d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ListenableFuture f55269e;

            a(Object obj, int i4, m mVar, ListenableFuture listenableFuture) {
                this.f55266b = obj;
                this.f55267c = i4;
                this.f55268d = mVar;
                this.f55269e = listenableFuture;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    r.this.s(this.f55266b, this.f55267c, this.f55268d, this.f55269e);
                } catch (Throwable th) {
                    k.C.log(Level.WARNING, ProtectedSandApp.s("\uf42a"), th);
                    this.f55268d.l(th);
                }
            }
        }

        r(k<K, V> kVar, int i4, long j4, a.b bVar) {
            this.f55252b = kVar;
            this.f55258h = j4;
            bVar.getClass();
            this.f55265o = bVar;
            y(E(i4));
            this.f55259i = kVar.Y() ? new ReferenceQueue<>() : null;
            this.f55260j = kVar.Z() ? new ReferenceQueue<>() : null;
            this.f55261k = kVar.X() ? new ConcurrentLinkedQueue() : (Queue<com.google.common.cache.p<K, V>>) k.E;
            this.f55263m = kVar.b0() ? new k0() : (Queue<com.google.common.cache.p<K, V>>) k.E;
            this.f55264n = kVar.X() ? new e() : (Queue<com.google.common.cache.p<K, V>>) k.E;
        }

        ListenableFuture<V> A(K k4, int i4, m<K, V> mVar, CacheLoader<? super K, V> cacheLoader) {
            ListenableFuture<V> j4 = mVar.j(k4, cacheLoader);
            j4.n2(new a(k4, i4, mVar, j4), g1.c());
            return j4;
        }

        V B(K k4, int i4, m<K, V> mVar, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return s(k4, i4, mVar, mVar.j(k4, cacheLoader));
        }

        V C(K k4, int i4, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            m<K, V> mVar;
            boolean z4;
            a0<K, V> a0Var;
            V B;
            lock();
            try {
                long a5 = this.f55252b.f55179q.a();
                H(a5);
                int i5 = this.f55253c - 1;
                AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
                int length = i4 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(length);
                com.google.common.cache.p<K, V> pVar2 = pVar;
                while (true) {
                    mVar = null;
                    if (pVar2 == null) {
                        z4 = true;
                        a0Var = null;
                        break;
                    }
                    K key = pVar2.getKey();
                    if (pVar2.getHash() == i4 && key != null && this.f55252b.f55168f.d(k4, key)) {
                        a0<K, V> valueReference = pVar2.getValueReference();
                        if (valueReference.c()) {
                            z4 = false;
                        } else {
                            V v4 = valueReference.get();
                            if (v4 == null) {
                                m(key, i4, v4, valueReference.a(), com.google.common.cache.q.COLLECTED);
                            } else {
                                if (!this.f55252b.y(pVar2, a5)) {
                                    L(pVar2, a5);
                                    this.f55265o.a(1);
                                    unlock();
                                    G();
                                    return v4;
                                }
                                m(key, i4, v4, valueReference.a(), com.google.common.cache.q.EXPIRED);
                            }
                            this.f55263m.remove(pVar2);
                            this.f55264n.remove(pVar2);
                            this.f55253c = i5;
                            z4 = true;
                        }
                        a0Var = valueReference;
                    } else {
                        pVar2 = pVar2.getNext();
                    }
                }
                if (z4) {
                    mVar = new m<>();
                    if (pVar2 == null) {
                        pVar2 = D(k4, i4, pVar);
                        pVar2.setValueReference(mVar);
                        atomicReferenceArray.set(length, pVar2);
                    } else {
                        pVar2.setValueReference(mVar);
                    }
                }
                unlock();
                G();
                if (!z4) {
                    return f0(pVar2, k4, a0Var);
                }
                try {
                    synchronized (pVar2) {
                        B = B(k4, i4, mVar, cacheLoader);
                    }
                    return B;
                } finally {
                    this.f55265o.b(1);
                }
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        @g9.a("this")
        com.google.common.cache.p<K, V> D(K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            f fVar = this.f55252b.f55180r;
            k4.getClass();
            return fVar.newEntry(this, k4, i4, pVar);
        }

        AtomicReferenceArray<com.google.common.cache.p<K, V>> E(int i4) {
            return new AtomicReferenceArray<>(i4);
        }

        void F() {
            if ((this.f55262l.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        void G() {
            Z();
        }

        @g9.a("this")
        void H(long j4) {
            Y(j4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        
            return null;
         */
        @zc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        V I(K r15, int r16, V r17, boolean r18) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.k.r.I(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        boolean J(com.google.common.cache.p<K, V> pVar, int i4) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
                int length = (atomicReferenceArray.length() - 1) & i4;
                com.google.common.cache.p<K, V> pVar2 = atomicReferenceArray.get(length);
                for (com.google.common.cache.p<K, V> pVar3 = pVar2; pVar3 != null; pVar3 = pVar3.getNext()) {
                    if (pVar3 == pVar) {
                        this.f55255e++;
                        com.google.common.cache.p<K, V> V = V(pVar2, pVar3, pVar3.getKey(), i4, pVar3.getValueReference().get(), pVar3.getValueReference(), com.google.common.cache.q.COLLECTED);
                        int i5 = this.f55253c - 1;
                        atomicReferenceArray.set(length, V);
                        this.f55253c = i5;
                        return true;
                    }
                }
                unlock();
                G();
                return false;
            } finally {
                unlock();
                G();
            }
        }

        boolean K(K k4, int i4, a0<K, V> a0Var) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
                int length = (atomicReferenceArray.length() - 1) & i4;
                com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.p<K, V> pVar2 = pVar; pVar2 != null; pVar2 = pVar2.getNext()) {
                    K key = pVar2.getKey();
                    if (pVar2.getHash() == i4 && key != null && this.f55252b.f55168f.d(k4, key)) {
                        if (pVar2.getValueReference() != a0Var) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                G();
                            }
                            return false;
                        }
                        this.f55255e++;
                        com.google.common.cache.p<K, V> V = V(pVar, pVar2, key, i4, a0Var.get(), a0Var, com.google.common.cache.q.COLLECTED);
                        int i5 = this.f55253c - 1;
                        atomicReferenceArray.set(length, V);
                        this.f55253c = i5;
                        return true;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    G();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    G();
                }
            }
        }

        @g9.a("this")
        void L(com.google.common.cache.p<K, V> pVar, long j4) {
            if (this.f55252b.N()) {
                pVar.setAccessTime(j4);
            }
            this.f55264n.add(pVar);
        }

        void M(com.google.common.cache.p<K, V> pVar, long j4) {
            if (this.f55252b.N()) {
                pVar.setAccessTime(j4);
            }
            this.f55261k.add(pVar);
        }

        @g9.a("this")
        void N(com.google.common.cache.p<K, V> pVar, int i4, long j4) {
            j();
            this.f55254d += i4;
            if (this.f55252b.N()) {
                pVar.setAccessTime(j4);
            }
            if (this.f55252b.P()) {
                pVar.setWriteTime(j4);
            }
            this.f55264n.add(pVar);
            this.f55263m.add(pVar);
        }

        @zc.a
        V O(K k4, int i4, CacheLoader<? super K, V> cacheLoader, boolean z4) {
            m<K, V> z5 = z(k4, i4, z4);
            if (z5 == null) {
                return null;
            }
            ListenableFuture<V> A = A(k4, i4, z5, cacheLoader);
            if (A.isDone()) {
                try {
                    return (V) j2.f(A);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            r9 = r5.getValueReference();
            r12 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (r12 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            r2 = com.google.common.cache.q.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            r10 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            r11.f55255e++;
            r13 = V(r4, r5, r6, r13, r12, r9, r10);
            r2 = r11.f55253c - 1;
            r0.set(r1, r13);
            r11.f55253c = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        
            return r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            if (r9.isActive() == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r2 = com.google.common.cache.q.COLLECTED;
         */
        @zc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        V P(java.lang.Object r12, int r13) {
            /*
                r11 = this;
                r11.lock()
                com.google.common.cache.k<K, V> r0 = r11.f55252b     // Catch: java.lang.Throwable -> L46
                com.google.common.base.x0 r0 = r0.f55179q     // Catch: java.lang.Throwable -> L46
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L46
                r11.H(r0)     // Catch: java.lang.Throwable -> L46
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.p<K, V>> r0 = r11.f55257g     // Catch: java.lang.Throwable -> L46
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L46
                int r1 = r1 + (-1)
                r1 = r1 & r13
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L46
                r4 = r2
                com.google.common.cache.p r4 = (com.google.common.cache.p) r4     // Catch: java.lang.Throwable -> L46
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L6e
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L46
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L46
                if (r3 != r13) goto L75
                if (r6 == 0) goto L75
                com.google.common.cache.k<K, V> r3 = r11.f55252b     // Catch: java.lang.Throwable -> L46
                com.google.common.base.q<java.lang.Object> r3 = r3.f55168f     // Catch: java.lang.Throwable -> L46
                boolean r3 = r3.d(r12, r6)     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L75
                com.google.common.cache.k$a0 r9 = r5.getValueReference()     // Catch: java.lang.Throwable -> L46
                java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L46
                if (r12 == 0) goto L48
                com.google.common.cache.q r2 = com.google.common.cache.q.EXPLICIT     // Catch: java.lang.Throwable -> L46
            L44:
                r10 = r2
                goto L51
            L46:
                r12 = move-exception
                goto L7a
            L48:
                boolean r3 = r9.isActive()     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L6e
                com.google.common.cache.q r2 = com.google.common.cache.q.COLLECTED     // Catch: java.lang.Throwable -> L46
                goto L44
            L51:
                int r2 = r11.f55255e     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + 1
                r11.f55255e = r2     // Catch: java.lang.Throwable -> L46
                r3 = r11
                r7 = r13
                r8 = r12
                com.google.common.cache.p r13 = r3.V(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L46
                int r2 = r11.f55253c     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + (-1)
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L46
                r11.f55253c = r2     // Catch: java.lang.Throwable -> L46
                r11.unlock()
                r11.G()
                return r12
            L6e:
                r11.unlock()
                r11.G()
                return r2
            L75:
                com.google.common.cache.p r5 = r5.getNext()     // Catch: java.lang.Throwable -> L46
                goto L1f
            L7a:
                r11.unlock()
                r11.G()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.k.r.P(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            r10 = r6.getValueReference();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r12.f55252b.f55169g.d(r15, r9) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            r13 = com.google.common.cache.q.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            r12.f55255e++;
            r14 = V(r5, r6, r7, r14, r9, r10, r13);
            r15 = r12.f55253c - 1;
            r0.set(r1, r14);
            r12.f55253c = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if (r13 != com.google.common.cache.q.EXPLICIT) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        
            if (r9 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        
            if (r10.isActive() == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        
            r13 = com.google.common.cache.q.COLLECTED;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean Q(java.lang.Object r13, int r14, java.lang.Object r15) {
            /*
                r12 = this;
                r12.lock()
                com.google.common.cache.k<K, V> r0 = r12.f55252b     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.x0 r0 = r0.f55179q     // Catch: java.lang.Throwable -> L4d
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L4d
                r12.H(r0)     // Catch: java.lang.Throwable -> L4d
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.p<K, V>> r0 = r12.f55257g     // Catch: java.lang.Throwable -> L4d
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L4d
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L4d
                r5 = r3
                com.google.common.cache.p r5 = (com.google.common.cache.p) r5     // Catch: java.lang.Throwable -> L4d
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L7a
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L4d
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L4d
                if (r4 != r14) goto L81
                if (r7 == 0) goto L81
                com.google.common.cache.k<K, V> r4 = r12.f55252b     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.q<java.lang.Object> r4 = r4.f55168f     // Catch: java.lang.Throwable -> L4d
                boolean r4 = r4.d(r13, r7)     // Catch: java.lang.Throwable -> L4d
                if (r4 == 0) goto L81
                com.google.common.cache.k$a0 r10 = r6.getValueReference()     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r9 = r10.get()     // Catch: java.lang.Throwable -> L4d
                com.google.common.cache.k<K, V> r13 = r12.f55252b     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.q<java.lang.Object> r13 = r13.f55169g     // Catch: java.lang.Throwable -> L4d
                boolean r13 = r13.d(r15, r9)     // Catch: java.lang.Throwable -> L4d
                if (r13 == 0) goto L4f
                com.google.common.cache.q r13 = com.google.common.cache.q.EXPLICIT     // Catch: java.lang.Throwable -> L4d
                goto L59
            L4d:
                r13 = move-exception
                goto L86
            L4f:
                if (r9 != 0) goto L7a
                boolean r13 = r10.isActive()     // Catch: java.lang.Throwable -> L4d
                if (r13 == 0) goto L7a
                com.google.common.cache.q r13 = com.google.common.cache.q.COLLECTED     // Catch: java.lang.Throwable -> L4d
            L59:
                int r15 = r12.f55255e     // Catch: java.lang.Throwable -> L4d
                int r15 = r15 + r2
                r12.f55255e = r15     // Catch: java.lang.Throwable -> L4d
                r4 = r12
                r8 = r14
                r11 = r13
                com.google.common.cache.p r14 = r4.V(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4d
                int r15 = r12.f55253c     // Catch: java.lang.Throwable -> L4d
                int r15 = r15 - r2
                r0.set(r1, r14)     // Catch: java.lang.Throwable -> L4d
                r12.f55253c = r15     // Catch: java.lang.Throwable -> L4d
                com.google.common.cache.q r14 = com.google.common.cache.q.EXPLICIT     // Catch: java.lang.Throwable -> L4d
                if (r13 != r14) goto L72
                goto L73
            L72:
                r2 = r3
            L73:
                r12.unlock()
                r12.G()
                return r2
            L7a:
                r12.unlock()
                r12.G()
                return r3
            L81:
                com.google.common.cache.p r6 = r6.getNext()     // Catch: java.lang.Throwable -> L4d
                goto L1f
            L86:
                r12.unlock()
                r12.G()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.k.r.Q(java.lang.Object, int, java.lang.Object):boolean");
        }

        @g9.a("this")
        void R(com.google.common.cache.p<K, V> pVar) {
            m(pVar.getKey(), pVar.getHash(), pVar.getValueReference().get(), pVar.getValueReference().a(), com.google.common.cache.q.COLLECTED);
            this.f55263m.remove(pVar);
            this.f55264n.remove(pVar);
        }

        @d9.d
        @g9.a("this")
        boolean S(com.google.common.cache.p<K, V> pVar, int i4, com.google.common.cache.q qVar) {
            AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
            int length = (atomicReferenceArray.length() - 1) & i4;
            com.google.common.cache.p<K, V> pVar2 = atomicReferenceArray.get(length);
            for (com.google.common.cache.p<K, V> pVar3 = pVar2; pVar3 != null; pVar3 = pVar3.getNext()) {
                if (pVar3 == pVar) {
                    this.f55255e++;
                    com.google.common.cache.p<K, V> V = V(pVar2, pVar3, pVar3.getKey(), i4, pVar3.getValueReference().get(), pVar3.getValueReference(), qVar);
                    int i5 = this.f55253c - 1;
                    atomicReferenceArray.set(length, V);
                    this.f55253c = i5;
                    return true;
                }
            }
            return false;
        }

        @g9.a("this")
        @zc.a
        com.google.common.cache.p<K, V> T(com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
            int i4 = this.f55253c;
            com.google.common.cache.p<K, V> next = pVar2.getNext();
            while (pVar != pVar2) {
                com.google.common.cache.p<K, V> h4 = h(pVar, next);
                if (h4 != null) {
                    next = h4;
                } else {
                    R(pVar);
                    i4--;
                }
                pVar = pVar.getNext();
            }
            this.f55253c = i4;
            return next;
        }

        boolean U(K k4, int i4, m<K, V> mVar) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
                int length = (atomicReferenceArray.length() - 1) & i4;
                com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(length);
                com.google.common.cache.p<K, V> pVar2 = pVar;
                while (true) {
                    if (pVar2 == null) {
                        break;
                    }
                    K key = pVar2.getKey();
                    if (pVar2.getHash() != i4 || key == null || !this.f55252b.f55168f.d(k4, key)) {
                        pVar2 = pVar2.getNext();
                    } else if (pVar2.getValueReference() == mVar) {
                        if (mVar.isActive()) {
                            pVar2.setValueReference(mVar.i());
                        } else {
                            atomicReferenceArray.set(length, T(pVar, pVar2));
                        }
                        unlock();
                        G();
                        return true;
                    }
                }
                unlock();
                G();
                return false;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        @g9.a("this")
        @zc.a
        com.google.common.cache.p<K, V> V(com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2, @zc.a K k4, int i4, V v4, a0<K, V> a0Var, com.google.common.cache.q qVar) {
            m(k4, i4, v4, a0Var.a(), qVar);
            this.f55263m.remove(pVar2);
            this.f55264n.remove(pVar2);
            if (!a0Var.c()) {
                return T(pVar, pVar2);
            }
            a0Var.e(null);
            return pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            return null;
         */
        @zc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        V W(K r18, int r19, V r20) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.k<K, V> r1 = r9.f55252b     // Catch: java.lang.Throwable -> L6d
                com.google.common.base.x0 r1 = r1.f55179q     // Catch: java.lang.Throwable -> L6d
                long r7 = r1.a()     // Catch: java.lang.Throwable -> L6d
                r9.H(r7)     // Catch: java.lang.Throwable -> L6d
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.p<K, V>> r10 = r9.f55257g     // Catch: java.lang.Throwable -> L6d
                int r1 = r10.length()     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + (-1)
                r11 = r0 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> L6d
                r2 = r1
                com.google.common.cache.p r2 = (com.google.common.cache.p) r2     // Catch: java.lang.Throwable -> L6d
                r12 = r2
            L24:
                r13 = 0
                if (r12 == 0) goto L6f
                java.lang.Object r4 = r12.getKey()     // Catch: java.lang.Throwable -> L6d
                int r1 = r12.getHash()     // Catch: java.lang.Throwable -> L6d
                if (r1 != r0) goto La2
                if (r4 == 0) goto La2
                com.google.common.cache.k<K, V> r1 = r9.f55252b     // Catch: java.lang.Throwable -> L6d
                com.google.common.base.q<java.lang.Object> r1 = r1.f55168f     // Catch: java.lang.Throwable -> L6d
                r14 = r18
                boolean r1 = r1.d(r14, r4)     // Catch: java.lang.Throwable -> L6d
                if (r1 == 0) goto La4
                com.google.common.cache.k$a0 r15 = r12.getValueReference()     // Catch: java.lang.Throwable -> L6d
                java.lang.Object r16 = r15.get()     // Catch: java.lang.Throwable -> L6d
                if (r16 != 0) goto L76
                boolean r1 = r15.isActive()     // Catch: java.lang.Throwable -> L6d
                if (r1 == 0) goto L6f
                int r1 = r9.f55255e     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + 1
                r9.f55255e = r1     // Catch: java.lang.Throwable -> L6d
                com.google.common.cache.q r8 = com.google.common.cache.q.COLLECTED     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r3 = r12
                r5 = r19
                r6 = r16
                r7 = r15
                com.google.common.cache.p r0 = r1.V(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6d
                int r1 = r9.f55253c     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + (-1)
                r10.set(r11, r0)     // Catch: java.lang.Throwable -> L6d
                r9.f55253c = r1     // Catch: java.lang.Throwable -> L6d
                goto L6f
            L6d:
                r0 = move-exception
                goto Laa
            L6f:
                r17.unlock()
                r17.G()
                return r13
            L76:
                int r1 = r9.f55255e     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + 1
                r9.f55255e = r1     // Catch: java.lang.Throwable -> L6d
                int r5 = r15.a()     // Catch: java.lang.Throwable -> L6d
                com.google.common.cache.q r6 = com.google.common.cache.q.REPLACED     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r16
                r1.m(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r2 = r12
                r3 = r18
                r4 = r20
                r5 = r7
                r1.b0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6d
                r9.n(r12)     // Catch: java.lang.Throwable -> L6d
                r17.unlock()
                r17.G()
                return r16
            La2:
                r14 = r18
            La4:
                com.google.common.cache.p r12 = r12.getNext()     // Catch: java.lang.Throwable -> L6d
                goto L24
            Laa:
                r17.unlock()
                r17.G()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.k.r.W(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean X(K r18, int r19, V r20, V r21) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.k<K, V> r1 = r9.f55252b     // Catch: java.lang.Throwable -> L6a
                com.google.common.base.x0 r1 = r1.f55179q     // Catch: java.lang.Throwable -> L6a
                long r7 = r1.a()     // Catch: java.lang.Throwable -> L6a
                r9.H(r7)     // Catch: java.lang.Throwable -> L6a
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.p<K, V>> r10 = r9.f55257g     // Catch: java.lang.Throwable -> L6a
                int r1 = r10.length()     // Catch: java.lang.Throwable -> L6a
                r11 = 1
                int r1 = r1 - r11
                r12 = r0 & r1
                java.lang.Object r1 = r10.get(r12)     // Catch: java.lang.Throwable -> L6a
                r2 = r1
                com.google.common.cache.p r2 = (com.google.common.cache.p) r2     // Catch: java.lang.Throwable -> L6a
                r13 = r2
            L24:
                r14 = 0
                if (r13 == 0) goto L6c
                java.lang.Object r4 = r13.getKey()     // Catch: java.lang.Throwable -> L6a
                int r1 = r13.getHash()     // Catch: java.lang.Throwable -> L6a
                if (r1 != r0) goto Lb1
                if (r4 == 0) goto Lb1
                com.google.common.cache.k<K, V> r1 = r9.f55252b     // Catch: java.lang.Throwable -> L6a
                com.google.common.base.q<java.lang.Object> r1 = r1.f55168f     // Catch: java.lang.Throwable -> L6a
                r15 = r18
                boolean r1 = r1.d(r15, r4)     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto Lae
                com.google.common.cache.k$a0 r16 = r13.getValueReference()     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r6 = r16.get()     // Catch: java.lang.Throwable -> L6a
                if (r6 != 0) goto L73
                boolean r1 = r16.isActive()     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto L6c
                int r1 = r9.f55255e     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 + r11
                r9.f55255e = r1     // Catch: java.lang.Throwable -> L6a
                com.google.common.cache.q r8 = com.google.common.cache.q.COLLECTED     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r3 = r13
                r5 = r19
                r7 = r16
                com.google.common.cache.p r0 = r1.V(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6a
                int r1 = r9.f55253c     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 - r11
                r10.set(r12, r0)     // Catch: java.lang.Throwable -> L6a
                r9.f55253c = r1     // Catch: java.lang.Throwable -> L6a
                goto L6c
            L6a:
                r0 = move-exception
                goto Lba
            L6c:
                r17.unlock()
                r17.G()
                return r14
            L73:
                com.google.common.cache.k<K, V> r1 = r9.f55252b     // Catch: java.lang.Throwable -> L6a
                com.google.common.base.q<java.lang.Object> r1 = r1.f55169g     // Catch: java.lang.Throwable -> L6a
                r3 = r20
                boolean r1 = r1.d(r3, r6)     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto Laa
                int r1 = r9.f55255e     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 + r11
                r9.f55255e = r1     // Catch: java.lang.Throwable -> L6a
                int r5 = r16.a()     // Catch: java.lang.Throwable -> L6a
                com.google.common.cache.q r10 = com.google.common.cache.q.REPLACED     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r6
                r6 = r10
                r1.m(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r2 = r13
                r3 = r18
                r4 = r21
                r5 = r7
                r1.b0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6a
                r9.n(r13)     // Catch: java.lang.Throwable -> L6a
                r17.unlock()
                r17.G()
                return r11
            Laa:
                r9.L(r13, r7)     // Catch: java.lang.Throwable -> L6a
                goto L6c
            Lae:
                r3 = r20
                goto Lb4
            Lb1:
                r15 = r18
                goto Lae
            Lb4:
                com.google.common.cache.p r13 = r13.getNext()     // Catch: java.lang.Throwable -> L6a
                goto L24
            Lba:
                r17.unlock()
                r17.G()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.k.r.X(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        void Y(long j4) {
            if (tryLock()) {
                try {
                    k();
                    p(j4);
                    this.f55262l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void Z() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f55252b.J();
        }

        void a() {
            Y(this.f55252b.f55179q.a());
            Z();
        }

        V a0(com.google.common.cache.p<K, V> pVar, K k4, int i4, V v4, long j4, CacheLoader<? super K, V> cacheLoader) {
            V O;
            return (!this.f55252b.R() || j4 - pVar.getWriteTime() <= this.f55252b.f55176n || pVar.getValueReference().c() || (O = O(k4, i4, cacheLoader, true)) == null) ? v4 : O;
        }

        void b() {
            com.google.common.cache.q qVar;
            if (this.f55253c != 0) {
                lock();
                try {
                    H(this.f55252b.f55179q.a());
                    AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        for (com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(i4); pVar != null; pVar = pVar.getNext()) {
                            if (pVar.getValueReference().isActive()) {
                                K key = pVar.getKey();
                                V v4 = pVar.getValueReference().get();
                                if (key != null && v4 != null) {
                                    qVar = com.google.common.cache.q.EXPLICIT;
                                    m(key, pVar.getHash(), v4, pVar.getValueReference().a(), qVar);
                                }
                                qVar = com.google.common.cache.q.COLLECTED;
                                m(key, pVar.getHash(), v4, pVar.getValueReference().a(), qVar);
                            }
                        }
                    }
                    for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                        atomicReferenceArray.set(i5, null);
                    }
                    d();
                    this.f55263m.clear();
                    this.f55264n.clear();
                    this.f55262l.set(0);
                    this.f55255e++;
                    this.f55253c = 0;
                    unlock();
                    G();
                } catch (Throwable th) {
                    unlock();
                    G();
                    throw th;
                }
            }
        }

        @g9.a("this")
        void b0(com.google.common.cache.p<K, V> pVar, K k4, V v4, long j4) {
            a0<K, V> valueReference = pVar.getValueReference();
            int weigh = this.f55252b.f55173k.weigh(k4, v4);
            com.google.common.base.l0.h0(weigh >= 0, ProtectedSandApp.s("\uf42b"));
            pVar.setValueReference(this.f55252b.f55171i.referenceValue(this, pVar, v4, weigh));
            N(pVar, weigh, j4);
            valueReference.e(v4);
        }

        void c() {
            while (this.f55259i.poll() != null) {
            }
        }

        boolean c0(K k4, int i4, m<K, V> mVar, V v4) {
            lock();
            try {
                long a5 = this.f55252b.f55179q.a();
                H(a5);
                int i5 = this.f55253c + 1;
                if (i5 > this.f55256f) {
                    o();
                    i5 = this.f55253c + 1;
                }
                int i6 = i5;
                AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
                int length = i4 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(length);
                com.google.common.cache.p<K, V> pVar2 = pVar;
                while (true) {
                    if (pVar2 == null) {
                        this.f55255e++;
                        com.google.common.cache.p<K, V> D = D(k4, i4, pVar);
                        b0(D, k4, v4, a5);
                        atomicReferenceArray.set(length, D);
                        this.f55253c = i6;
                        n(D);
                        break;
                    }
                    K key = pVar2.getKey();
                    if (pVar2.getHash() == i4 && key != null && this.f55252b.f55168f.d(k4, key)) {
                        a0<K, V> valueReference = pVar2.getValueReference();
                        V v5 = valueReference.get();
                        if (mVar != valueReference && (v5 != null || valueReference == k.D)) {
                            m(k4, i4, v4, 0, com.google.common.cache.q.REPLACED);
                            unlock();
                            G();
                            return false;
                        }
                        this.f55255e++;
                        if (mVar.isActive()) {
                            m(k4, i4, v5, mVar.a(), v5 == null ? com.google.common.cache.q.COLLECTED : com.google.common.cache.q.REPLACED);
                            i6--;
                        }
                        b0(pVar2, k4, v4, a5);
                        this.f55253c = i6;
                        n(pVar2);
                    } else {
                        pVar2 = pVar2.getNext();
                    }
                }
                unlock();
                G();
                return true;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        void d() {
            if (this.f55252b.Y()) {
                c();
            }
            if (this.f55252b.Z()) {
                e();
            }
        }

        void d0() {
            if (tryLock()) {
                try {
                    k();
                } finally {
                    unlock();
                }
            }
        }

        void e() {
            while (this.f55260j.poll() != null) {
            }
        }

        void e0(long j4) {
            if (tryLock()) {
                try {
                    p(j4);
                } finally {
                    unlock();
                }
            }
        }

        boolean f(Object obj, int i4) {
            try {
                if (this.f55253c == 0) {
                    return false;
                }
                com.google.common.cache.p<K, V> v4 = v(obj, i4, this.f55252b.f55179q.a());
                if (v4 == null) {
                    return false;
                }
                return v4.getValueReference().get() != null;
            } finally {
                F();
            }
        }

        V f0(com.google.common.cache.p<K, V> pVar, K k4, a0<K, V> a0Var) throws ExecutionException {
            if (!a0Var.c()) {
                throw new AssertionError();
            }
            com.google.common.base.l0.x0(!Thread.holdsLock(pVar), ProtectedSandApp.s("\uf42c"), k4);
            try {
                V g4 = a0Var.g();
                if (g4 != null) {
                    M(pVar, this.f55252b.f55179q.a());
                    return g4;
                }
                String valueOf = String.valueOf(k4);
                StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                sb.append(ProtectedSandApp.s("\uf42d"));
                sb.append(valueOf);
                sb.append(ProtectedSandApp.s("\uf42e"));
                throw new CacheLoader.InvalidCacheLoadException(sb.toString());
            } finally {
                this.f55265o.b(1);
            }
        }

        @d9.d
        boolean g(Object obj) {
            try {
                if (this.f55253c != 0) {
                    long a5 = this.f55252b.f55179q.a();
                    AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
                    int length = atomicReferenceArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        for (com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(i4); pVar != null; pVar = pVar.getNext()) {
                            V w4 = w(pVar, a5);
                            if (w4 != null && this.f55252b.f55169g.d(obj, w4)) {
                                F();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                F();
            }
        }

        @g9.a("this")
        com.google.common.cache.p<K, V> h(com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
            if (pVar.getKey() == null) {
                return null;
            }
            a0<K, V> valueReference = pVar.getValueReference();
            V v4 = valueReference.get();
            if (v4 == null && valueReference.isActive()) {
                return null;
            }
            com.google.common.cache.p<K, V> copyEntry = this.f55252b.f55180r.copyEntry(this, pVar, pVar2);
            copyEntry.setValueReference(valueReference.f(this.f55260j, v4, copyEntry));
            return copyEntry;
        }

        @g9.a("this")
        void i() {
            int i4 = 0;
            do {
                Reference<? extends K> poll = this.f55259i.poll();
                if (poll == null) {
                    return;
                }
                this.f55252b.L((com.google.common.cache.p) poll);
                i4++;
            } while (i4 != 16);
        }

        @g9.a("this")
        void j() {
            while (true) {
                com.google.common.cache.p<K, V> poll = this.f55261k.poll();
                if (poll == null) {
                    return;
                }
                if (this.f55264n.contains(poll)) {
                    this.f55264n.add(poll);
                }
            }
        }

        @g9.a("this")
        void k() {
            if (this.f55252b.Y()) {
                i();
            }
            if (this.f55252b.Z()) {
                l();
            }
        }

        @g9.a("this")
        void l() {
            int i4 = 0;
            do {
                Reference<? extends V> poll = this.f55260j.poll();
                if (poll == null) {
                    return;
                }
                this.f55252b.M((a0) poll);
                i4++;
            } while (i4 != 16);
        }

        @g9.a("this")
        void m(@zc.a K k4, int i4, @zc.a V v4, int i5, com.google.common.cache.q qVar) {
            this.f55254d -= i5;
            if (qVar.wasEvicted()) {
                this.f55265o.c();
            }
            if (this.f55252b.f55177o != k.E) {
                this.f55252b.f55177o.offer(com.google.common.cache.v.a(k4, v4, qVar));
            }
        }

        @g9.a("this")
        void n(com.google.common.cache.p<K, V> pVar) {
            if (this.f55252b.k()) {
                j();
                if (pVar.getValueReference().a() > this.f55258h && !S(pVar, pVar.getHash(), com.google.common.cache.q.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f55254d > this.f55258h) {
                    com.google.common.cache.p<K, V> x4 = x();
                    if (!S(x4, x4.getHash(), com.google.common.cache.q.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @g9.a("this")
        void o() {
            AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i4 = this.f55253c;
            AtomicReferenceArray<com.google.common.cache.p<K, V>> E = E(length << 1);
            this.f55256f = (E.length() * 3) / 4;
            int length2 = E.length() - 1;
            for (int i5 = 0; i5 < length; i5++) {
                com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(i5);
                if (pVar != null) {
                    com.google.common.cache.p<K, V> next = pVar.getNext();
                    int hash = pVar.getHash() & length2;
                    if (next == null) {
                        E.set(hash, pVar);
                    } else {
                        com.google.common.cache.p<K, V> pVar2 = pVar;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                pVar2 = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        E.set(hash, pVar2);
                        while (pVar != pVar2) {
                            int hash3 = pVar.getHash() & length2;
                            com.google.common.cache.p<K, V> h4 = h(pVar, E.get(hash3));
                            if (h4 != null) {
                                E.set(hash3, h4);
                            } else {
                                R(pVar);
                                i4--;
                            }
                            pVar = pVar.getNext();
                        }
                    }
                }
            }
            this.f55257g = E;
            this.f55253c = i4;
        }

        @g9.a("this")
        void p(long j4) {
            com.google.common.cache.p<K, V> peek;
            com.google.common.cache.p<K, V> peek2;
            j();
            do {
                peek = this.f55263m.peek();
                if (peek == null || !this.f55252b.y(peek, j4)) {
                    do {
                        peek2 = this.f55264n.peek();
                        if (peek2 == null || !this.f55252b.y(peek2, j4)) {
                            return;
                        }
                    } while (S(peek2, peek2.getHash(), com.google.common.cache.q.EXPIRED));
                    throw new AssertionError();
                }
            } while (S(peek, peek.getHash(), com.google.common.cache.q.EXPIRED));
            throw new AssertionError();
        }

        @zc.a
        V q(Object obj, int i4) {
            try {
                if (this.f55253c != 0) {
                    long a5 = this.f55252b.f55179q.a();
                    com.google.common.cache.p<K, V> v4 = v(obj, i4, a5);
                    if (v4 == null) {
                        return null;
                    }
                    V v5 = v4.getValueReference().get();
                    if (v5 != null) {
                        M(v4, a5);
                        return a0(v4, v4.getKey(), i4, v5, a5, this.f55252b.f55182t);
                    }
                    d0();
                }
                return null;
            } finally {
                F();
            }
        }

        V r(K k4, int i4, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            com.google.common.cache.p<K, V> t4;
            k4.getClass();
            cacheLoader.getClass();
            try {
                try {
                    if (this.f55253c != 0 && (t4 = t(k4, i4)) != null) {
                        long a5 = this.f55252b.f55179q.a();
                        V w4 = w(t4, a5);
                        if (w4 != null) {
                            M(t4, a5);
                            this.f55265o.a(1);
                            return a0(t4, k4, i4, w4, a5, cacheLoader);
                        }
                        a0<K, V> valueReference = t4.getValueReference();
                        if (valueReference.c()) {
                            return f0(t4, k4, valueReference);
                        }
                    }
                    return C(k4, i4, cacheLoader);
                } catch (ExecutionException e4) {
                    Throwable cause = e4.getCause();
                    if (cause instanceof Error) {
                        throw new com.google.common.util.concurrent.c0(cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw e4;
                }
            } finally {
                F();
            }
        }

        V s(K k4, int i4, m<K, V> mVar, ListenableFuture<V> listenableFuture) throws ExecutionException {
            V v4;
            try {
                v4 = (V) j2.f(listenableFuture);
                try {
                    if (v4 != null) {
                        this.f55265o.e(mVar.b());
                        c0(k4, i4, mVar, v4);
                        return v4;
                    }
                    String valueOf = String.valueOf(k4);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                    sb.append(ProtectedSandApp.s("\uf42d"));
                    sb.append(valueOf);
                    sb.append(ProtectedSandApp.s("\uf42e"));
                    throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                } catch (Throwable th) {
                    th = th;
                    if (v4 == null) {
                        this.f55265o.d(mVar.b());
                        U(k4, i4, mVar);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                v4 = null;
            }
        }

        @zc.a
        com.google.common.cache.p<K, V> t(Object obj, int i4) {
            for (com.google.common.cache.p<K, V> u4 = u(i4); u4 != null; u4 = u4.getNext()) {
                if (u4.getHash() == i4) {
                    K key = u4.getKey();
                    if (key == null) {
                        d0();
                    } else if (this.f55252b.f55168f.d(obj, key)) {
                        return u4;
                    }
                }
            }
            return null;
        }

        com.google.common.cache.p<K, V> u(int i4) {
            return this.f55257g.get(i4 & (r0.length() - 1));
        }

        @zc.a
        com.google.common.cache.p<K, V> v(Object obj, int i4, long j4) {
            com.google.common.cache.p<K, V> t4 = t(obj, i4);
            if (t4 == null) {
                return null;
            }
            if (!this.f55252b.y(t4, j4)) {
                return t4;
            }
            e0(j4);
            return null;
        }

        V w(com.google.common.cache.p<K, V> pVar, long j4) {
            if (pVar.getKey() == null) {
                d0();
                return null;
            }
            V v4 = pVar.getValueReference().get();
            if (v4 == null) {
                d0();
                return null;
            }
            if (!this.f55252b.y(pVar, j4)) {
                return v4;
            }
            e0(j4);
            return null;
        }

        @g9.a("this")
        com.google.common.cache.p<K, V> x() {
            for (com.google.common.cache.p<K, V> pVar : this.f55264n) {
                if (pVar.getValueReference().a() > 0) {
                    return pVar;
                }
            }
            throw new AssertionError();
        }

        void y(AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray) {
            this.f55256f = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f55252b.i()) {
                int i4 = this.f55256f;
                if (i4 == this.f55258h) {
                    this.f55256f = i4 + 1;
                }
            }
            this.f55257g = atomicReferenceArray;
        }

        /* JADX WARN: Finally extract failed */
        @zc.a
        m<K, V> z(K k4, int i4, boolean z4) {
            lock();
            try {
                long a5 = this.f55252b.f55179q.a();
                H(a5);
                AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = this.f55257g;
                int length = (atomicReferenceArray.length() - 1) & i4;
                com.google.common.cache.p<K, V> pVar = (com.google.common.cache.p) atomicReferenceArray.get(length);
                for (com.google.common.cache.p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.getNext()) {
                    Object key = pVar2.getKey();
                    if (pVar2.getHash() == i4 && key != null && this.f55252b.f55168f.d(k4, key)) {
                        a0<K, V> valueReference = pVar2.getValueReference();
                        if (!valueReference.c() && (!z4 || a5 - pVar2.getWriteTime() >= this.f55252b.f55176n)) {
                            this.f55255e++;
                            m<K, V> mVar = new m<>(valueReference);
                            pVar2.setValueReference(mVar);
                            unlock();
                            G();
                            return mVar;
                        }
                        unlock();
                        G();
                        return null;
                    }
                }
                this.f55255e++;
                m<K, V> mVar2 = new m<>();
                com.google.common.cache.p<K, V> D = D(k4, i4, pVar);
                D.setValueReference(mVar2);
                atomicReferenceArray.set(length, D);
                unlock();
                G();
                return mVar2;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }
    }

    /* compiled from: LocalCache.java */
    static class s<K, V> extends SoftReference<V> implements a0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.cache.p<K, V> f55271b;

        s(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar) {
            super(v4, referenceQueue);
            this.f55271b = pVar;
        }

        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.k.a0
        public boolean c() {
            return false;
        }

        @Override // com.google.common.cache.k.a0
        public com.google.common.cache.p<K, V> d() {
            return this.f55271b;
        }

        @Override // com.google.common.cache.k.a0
        public void e(V v4) {
        }

        public a0<K, V> f(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar) {
            return new s(referenceQueue, v4, pVar);
        }

        @Override // com.google.common.cache.k.a0
        public V g() {
            return get();
        }

        @Override // com.google.common.cache.k.a0
        public boolean isActive() {
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocalCache.java */
    static abstract class t {
        public static final t STRONG = new a(ProtectedSandApp.s("\uf42f"), 0);
        public static final t SOFT = new b(ProtectedSandApp.s("\uf430"), 1);
        public static final t WEAK = new c(ProtectedSandApp.s("\uf431"), 2);
        private static final /* synthetic */ t[] $VALUES = $values();

        /* compiled from: LocalCache.java */
        enum a extends t {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.t
            com.google.common.base.q<Object> defaultEquivalence() {
                return com.google.common.base.q.c();
            }

            @Override // com.google.common.cache.k.t
            <K, V> a0<K, V> referenceValue(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, V v4, int i4) {
                return i4 == 1 ? new x(v4) : new i0(v4, i4);
            }
        }

        /* compiled from: LocalCache.java */
        enum b extends t {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.t
            com.google.common.base.q<Object> defaultEquivalence() {
                return com.google.common.base.q.g();
            }

            @Override // com.google.common.cache.k.t
            <K, V> a0<K, V> referenceValue(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, V v4, int i4) {
                return i4 == 1 ? new s(rVar.f55260j, v4, pVar) : new h0(rVar.f55260j, v4, pVar, i4);
            }
        }

        /* compiled from: LocalCache.java */
        enum c extends t {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.cache.k.t
            com.google.common.base.q<Object> defaultEquivalence() {
                return com.google.common.base.q.g();
            }

            @Override // com.google.common.cache.k.t
            <K, V> a0<K, V> referenceValue(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, V v4, int i4) {
                return i4 == 1 ? new f0(rVar.f55260j, v4, pVar) : new j0(rVar.f55260j, v4, pVar, i4);
            }
        }

        private static /* synthetic */ t[] $values() {
            return new t[]{STRONG, SOFT, WEAK};
        }

        private t(String str, int i4) {
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) $VALUES.clone();
        }

        abstract com.google.common.base.q<Object> defaultEquivalence();

        abstract <K, V> a0<K, V> referenceValue(r<K, V> rVar, com.google.common.cache.p<K, V> pVar, V v4, int i4);

        /* synthetic */ t(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* compiled from: LocalCache.java */
    static final class u<K, V> extends w<K, V> {

        /* renamed from: f, reason: collision with root package name */
        volatile long f55272f;

        /* renamed from: g, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55273g;

        /* renamed from: h, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55274h;

        u(K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            super(k4, i4, pVar);
            this.f55272f = Long.MAX_VALUE;
            this.f55273g = k.F();
            this.f55274h = q.INSTANCE;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public long getAccessTime() {
            return this.f55272f;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInAccessQueue() {
            return this.f55273g;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInAccessQueue() {
            return this.f55274h;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setAccessTime(long j4) {
            this.f55272f = j4;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setNextInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55273g = pVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setPreviousInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55274h = pVar;
        }
    }

    /* compiled from: LocalCache.java */
    static final class v<K, V> extends w<K, V> {

        /* renamed from: f, reason: collision with root package name */
        volatile long f55275f;

        /* renamed from: g, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55276g;

        /* renamed from: h, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55277h;

        /* renamed from: i, reason: collision with root package name */
        volatile long f55278i;

        /* renamed from: j, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55279j;

        /* renamed from: k, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55280k;

        v(K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            super(k4, i4, pVar);
            this.f55275f = Long.MAX_VALUE;
            this.f55276g = k.F();
            q qVar = q.INSTANCE;
            this.f55277h = qVar;
            this.f55278i = Long.MAX_VALUE;
            this.f55279j = qVar;
            this.f55280k = qVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public long getAccessTime() {
            return this.f55275f;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInAccessQueue() {
            return this.f55276g;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInWriteQueue() {
            return this.f55279j;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInAccessQueue() {
            return this.f55277h;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInWriteQueue() {
            return this.f55280k;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public long getWriteTime() {
            return this.f55278i;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setAccessTime(long j4) {
            this.f55275f = j4;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setNextInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55276g = pVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setNextInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55279j = pVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setPreviousInAccessQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55277h = pVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setPreviousInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55280k = pVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setWriteTime(long j4) {
            this.f55278i = j4;
        }
    }

    /* compiled from: LocalCache.java */
    static class w<K, V> extends d<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final K f55281b;

        /* renamed from: c, reason: collision with root package name */
        final int f55282c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        final com.google.common.cache.p<K, V> f55283d;

        /* renamed from: e, reason: collision with root package name */
        volatile a0<K, V> f55284e = k.V();

        w(K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            this.f55281b = k4;
            this.f55282c = i4;
            this.f55283d = pVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public int getHash() {
            return this.f55282c;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public K getKey() {
            return this.f55281b;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNext() {
            return this.f55283d;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public a0<K, V> getValueReference() {
            return this.f55284e;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setValueReference(a0<K, V> a0Var) {
            this.f55284e = a0Var;
        }
    }

    /* compiled from: LocalCache.java */
    static class x<K, V> implements a0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final V f55285b;

        x(V v4) {
            this.f55285b = v4;
        }

        @Override // com.google.common.cache.k.a0
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.k.a0
        public boolean c() {
            return false;
        }

        @Override // com.google.common.cache.k.a0
        public com.google.common.cache.p<K, V> d() {
            return null;
        }

        @Override // com.google.common.cache.k.a0
        public void e(V v4) {
        }

        @Override // com.google.common.cache.k.a0
        public a0<K, V> f(ReferenceQueue<V> referenceQueue, V v4, com.google.common.cache.p<K, V> pVar) {
            return this;
        }

        @Override // com.google.common.cache.k.a0
        public V g() {
            return get();
        }

        @Override // com.google.common.cache.k.a0
        public V get() {
            return this.f55285b;
        }

        @Override // com.google.common.cache.k.a0
        public boolean isActive() {
            return true;
        }
    }

    /* compiled from: LocalCache.java */
    static final class y<K, V> extends w<K, V> {

        /* renamed from: f, reason: collision with root package name */
        volatile long f55286f;

        /* renamed from: g, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55287g;

        /* renamed from: h, reason: collision with root package name */
        @ma.i
        com.google.common.cache.p<K, V> f55288h;

        y(K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
            super(k4, i4, pVar);
            this.f55286f = Long.MAX_VALUE;
            this.f55287g = k.F();
            this.f55288h = q.INSTANCE;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getNextInWriteQueue() {
            return this.f55287g;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public com.google.common.cache.p<K, V> getPreviousInWriteQueue() {
            return this.f55288h;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public long getWriteTime() {
            return this.f55286f;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setNextInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55287g = pVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setPreviousInWriteQueue(com.google.common.cache.p<K, V> pVar) {
            this.f55288h = pVar;
        }

        @Override // com.google.common.cache.k.d, com.google.common.cache.p
        public void setWriteTime(long j4) {
            this.f55286f = j4;
        }
    }

    /* compiled from: LocalCache.java */
    final class z extends k<K, V>.i<V> {
        z(k kVar) {
            super();
        }

        @Override // com.google.common.cache.k.i, java.util.Iterator
        public V next() {
            return c().f55228c;
        }
    }

    k(com.google.common.cache.d<? super K, ? super V> dVar, @zc.a CacheLoader<? super K, V> cacheLoader) {
        this.f55167e = Math.min(dVar.j(), 65536);
        t o4 = dVar.o();
        this.f55170h = o4;
        this.f55171i = dVar.v();
        this.f55168f = dVar.n();
        this.f55169g = dVar.u();
        long p4 = dVar.p();
        this.f55172j = p4;
        this.f55173k = (com.google.common.cache.x<K, V>) dVar.w();
        this.f55174l = dVar.k();
        this.f55175m = dVar.l();
        this.f55176n = dVar.q();
        d.EnumC0834d enumC0834d = (com.google.common.cache.r<K, V>) dVar.r();
        this.f55178p = enumC0834d;
        this.f55177o = enumC0834d == d.EnumC0834d.INSTANCE ? (Queue<com.google.common.cache.v<K, V>>) E : new ConcurrentLinkedQueue();
        this.f55179q = dVar.t(O());
        this.f55180r = f.getFactory(o4, W(), a0());
        this.f55181s = dVar.f55132p.get();
        this.f55182t = cacheLoader;
        int min = Math.min(dVar.m(), 1073741824);
        if (k() && !i()) {
            min = (int) Math.min(min, p4);
        }
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        int i7 = 1;
        while (i7 < this.f55167e && (!k() || i7 * 20 <= this.f55172j)) {
            i6++;
            i7 <<= 1;
        }
        this.f55165c = 32 - i6;
        this.f55164b = i7 - 1;
        this.f55166d = new r[i7];
        int i10 = min / i7;
        while (i5 < (i10 * i7 < min ? i10 + 1 : i10)) {
            i5 <<= 1;
        }
        if (k()) {
            long j4 = this.f55172j;
            long j5 = i7;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                r<K, V>[] rVarArr = this.f55166d;
                if (i4 >= rVarArr.length) {
                    return;
                }
                if (i4 == j7) {
                    j6--;
                }
                rVarArr[i4] = h(i5, j6, dVar.f55132p.get());
                i4++;
            }
        } else {
            while (true) {
                r<K, V>[] rVarArr2 = this.f55166d;
                if (i4 >= rVarArr2.length) {
                    return;
                }
                rVarArr2[i4] = h(i5, -1L, dVar.f55132p.get());
                i4++;
            }
        }
    }

    static <K, V> com.google.common.cache.p<K, V> F() {
        return q.INSTANCE;
    }

    static <K, V> void H(com.google.common.cache.p<K, V> pVar) {
        q qVar = q.INSTANCE;
        pVar.setNextInAccessQueue(qVar);
        pVar.setPreviousInAccessQueue(qVar);
    }

    static <K, V> void I(com.google.common.cache.p<K, V> pVar) {
        q qVar = q.INSTANCE;
        pVar.setNextInWriteQueue(qVar);
        pVar.setPreviousInWriteQueue(qVar);
    }

    static int S(int i4) {
        int i5 = i4 + ((i4 << 15) ^ (-12931));
        int i6 = i5 ^ (i5 >>> 10);
        int i7 = i6 + (i6 << 3);
        int i10 = i7 ^ (i7 >>> 6);
        int i11 = (i10 << 2) + (i10 << 14) + i10;
        return (i11 >>> 16) ^ i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> U(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        d4.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V> a0<K, V> V() {
        return (a0<K, V>) D;
    }

    static <K, V> void d(com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
        pVar.setNextInAccessQueue(pVar2);
        pVar2.setPreviousInAccessQueue(pVar);
    }

    static <K, V> void e(com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
        pVar.setNextInWriteQueue(pVar2);
        pVar2.setPreviousInWriteQueue(pVar);
    }

    static <E> Queue<E> j() {
        return (Queue<E>) E;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    @zc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.Map<K, V> A(java.util.Set<? extends K> r7, com.google.common.cache.CacheLoader<? super K, V> r8) throws java.util.concurrent.ExecutionException {
        /*
            r6 = this;
            r8.getClass()
            r7.getClass()
            com.google.common.base.s0 r0 = com.google.common.base.s0.c()
            r1 = 1
            r2 = 0
            java.util.Map r7 = r8.e(r7)     // Catch: java.lang.Throwable -> L94 java.lang.Error -> L97 java.lang.Exception -> L9e java.lang.RuntimeException -> La5 java.lang.InterruptedException -> Lac com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> Lba
            if (r7 == 0) goto L6f
            r0.l()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L36
            goto L3a
        L36:
            r6.put(r5, r4)
            goto L1d
        L3a:
            r2 = r1
            goto L1d
        L3c:
            if (r2 != 0) goto L4a
            com.google.common.cache.a$b r8 = r6.f55181s
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.g(r1)
            r8.e(r0)
            return r7
        L4a:
            com.google.common.cache.a$b r7 = r6.f55181s
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.g(r1)
            r7.d(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r0 = r8.length()
            int r0 = r0 + 42
            java.lang.String r1 = "\uf432"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r8 = com.google.common.base.i.a(r0, r8, r1)
            r7.<init>(r8)
            throw r7
        L6f:
            com.google.common.cache.a$b r7 = r6.f55181s
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.g(r1)
            r7.d(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r0 = r8.length()
            int r0 = r0 + 31
            java.lang.String r1 = "\uf433"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r8 = com.google.common.base.i.a(r0, r8, r1)
            r7.<init>(r8)
            throw r7
        L94:
            r7 = move-exception
            r1 = r2
            goto Lbd
        L97:
            r7 = move-exception
            com.google.common.util.concurrent.c0 r8 = new com.google.common.util.concurrent.c0     // Catch: java.lang.Throwable -> L94
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L94
            throw r8     // Catch: java.lang.Throwable -> L94
        L9e:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L94
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L94
            throw r8     // Catch: java.lang.Throwable -> L94
        La5:
            r7 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r8 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L94
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L94
            throw r8     // Catch: java.lang.Throwable -> L94
        Lac:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L94
            r8.interrupt()     // Catch: java.lang.Throwable -> L94
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L94
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L94
            throw r8     // Catch: java.lang.Throwable -> L94
        Lba:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r7 = move-exception
        Lbd:
            if (r1 != 0) goto Lca
            com.google.common.cache.a$b r8 = r6.f55181s
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.g(r1)
            r8.d(r0)
        Lca:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.k.A(java.util.Set, com.google.common.cache.CacheLoader):java.util.Map");
    }

    long B() {
        long j4 = 0;
        for (int i4 = 0; i4 < this.f55166d.length; i4++) {
            j4 += Math.max(0, r0[i4].f55253c);
        }
        return j4;
    }

    @d9.d
    com.google.common.cache.p<K, V> C(K k4, int i4, @zc.a com.google.common.cache.p<K, V> pVar) {
        r<K, V> T = T(i4);
        T.lock();
        try {
            return T.D(k4, i4, pVar);
        } finally {
            T.unlock();
        }
    }

    final r<K, V>[] D(int i4) {
        return new r[i4];
    }

    @d9.d
    a0<K, V> E(com.google.common.cache.p<K, V> pVar, V v4, int i4) {
        int hash = pVar.getHash();
        t tVar = this.f55171i;
        r<K, V> T = T(hash);
        v4.getClass();
        return tVar.referenceValue(T, pVar, v4, i4);
    }

    void J() {
        while (true) {
            com.google.common.cache.v<K, V> poll = this.f55177o.poll();
            if (poll == null) {
                return;
            }
            try {
                this.f55178p.onRemoval(poll);
            } catch (Throwable th) {
                C.log(Level.WARNING, ProtectedSandApp.s("\uf434"), th);
            }
        }
    }

    void L(com.google.common.cache.p<K, V> pVar) {
        int hash = pVar.getHash();
        T(hash).J(pVar, hash);
    }

    void M(a0<K, V> a0Var) {
        com.google.common.cache.p<K, V> d5 = a0Var.d();
        int hash = d5.getHash();
        T(hash).K(d5.getKey(), hash, a0Var);
    }

    boolean N() {
        return m();
    }

    boolean O() {
        return P() || N();
    }

    boolean P() {
        return n() || R();
    }

    void Q(K k4) {
        k4.getClass();
        int w4 = w(k4);
        T(w4).O(k4, w4, this.f55182t, false);
    }

    boolean R() {
        return this.f55176n > 0;
    }

    r<K, V> T(int i4) {
        return this.f55166d[(i4 >>> this.f55165c) & this.f55164b];
    }

    boolean W() {
        return X() || N();
    }

    boolean X() {
        return m() || k();
    }

    boolean Y() {
        return this.f55170h != t.STRONG;
    }

    boolean Z() {
        return this.f55171i != t.STRONG;
    }

    boolean a0() {
        return b0() || P();
    }

    boolean b0() {
        return n();
    }

    public void c() {
        for (r<K, V> rVar : this.f55166d) {
            rVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (r<K, V> rVar : this.f55166d) {
            rVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@zc.a Object obj) {
        if (obj == null) {
            return false;
        }
        int w4 = w(obj);
        return T(w4).f(obj, w4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@zc.a Object obj) {
        boolean z4 = false;
        if (obj == null) {
            return false;
        }
        long a5 = this.f55179q.a();
        r<K, V>[] rVarArr = this.f55166d;
        long j4 = -1;
        int i4 = 0;
        while (i4 < 3) {
            int length = rVarArr.length;
            long j5 = 0;
            for (?? r12 = z4; r12 < length; r12++) {
                r<K, V> rVar = rVarArr[r12];
                int i5 = rVar.f55253c;
                AtomicReferenceArray<com.google.common.cache.p<K, V>> atomicReferenceArray = rVar.f55257g;
                for (?? r15 = z4; r15 < atomicReferenceArray.length(); r15++) {
                    com.google.common.cache.p<K, V> pVar = atomicReferenceArray.get(r15);
                    while (pVar != null) {
                        r<K, V>[] rVarArr2 = rVarArr;
                        V w4 = rVar.w(pVar, a5);
                        long j6 = a5;
                        if (w4 != null && this.f55169g.d(obj, w4)) {
                            return true;
                        }
                        pVar = pVar.getNext();
                        rVarArr = rVarArr2;
                        a5 = j6;
                    }
                }
                j5 += rVar.f55255e;
                a5 = a5;
                z4 = false;
            }
            long j7 = a5;
            r<K, V>[] rVarArr3 = rVarArr;
            if (j5 == j4) {
                return false;
            }
            i4++;
            j4 = j5;
            rVarArr = rVarArr3;
            a5 = j7;
            z4 = false;
        }
        return z4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @d9.c
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f55185w;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.f55185w = hVar;
        return hVar;
    }

    @d9.d
    com.google.common.cache.p<K, V> f(com.google.common.cache.p<K, V> pVar, com.google.common.cache.p<K, V> pVar2) {
        return T(pVar.getHash()).h(pVar, pVar2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @zc.a
    public V get(@zc.a Object obj) {
        if (obj == null) {
            return null;
        }
        int w4 = w(obj);
        return T(w4).q(obj, w4);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @zc.a
    public V getOrDefault(@zc.a Object obj, @zc.a V v4) {
        V v5 = get(obj);
        return v5 != null ? v5 : v4;
    }

    r<K, V> h(int i4, long j4, a.b bVar) {
        return new r<>(this, i4, j4, bVar);
    }

    boolean i() {
        return this.f55173k != d.e.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        r<K, V>[] rVarArr = this.f55166d;
        long j4 = 0;
        for (int i4 = 0; i4 < rVarArr.length; i4++) {
            if (rVarArr[i4].f55253c != 0) {
                return false;
            }
            j4 += rVarArr[i4].f55255e;
        }
        if (j4 == 0) {
            return true;
        }
        for (int i5 = 0; i5 < rVarArr.length; i5++) {
            if (rVarArr[i5].f55253c != 0) {
                return false;
            }
            j4 -= rVarArr[i5].f55255e;
        }
        return j4 == 0;
    }

    boolean k() {
        return this.f55172j >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f55183u;
        if (set != null) {
            return set;
        }
        C0837k c0837k = new C0837k();
        this.f55183u = c0837k;
        return c0837k;
    }

    boolean l() {
        return n() || m();
    }

    boolean m() {
        return this.f55174l > 0;
    }

    boolean n() {
        return this.f55175m > 0;
    }

    V o(K k4, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        k4.getClass();
        int w4 = w(k4);
        return T(w4).r(k4, w4, cacheLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    h3<K, V> p(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i4 = 0;
        int i5 = 0;
        for (K k4 : iterable) {
            Object obj = get(k4);
            if (!linkedHashMap.containsKey(k4)) {
                linkedHashMap.put(k4, obj);
                if (obj == null) {
                    i5++;
                    linkedHashSet.add(k4);
                } else {
                    i4++;
                }
            }
        }
        try {
            if (!linkedHashSet.isEmpty()) {
                try {
                    Map A2 = A(Collections.unmodifiableSet(linkedHashSet), this.f55182t);
                    for (Object obj2 : linkedHashSet) {
                        Object obj3 = A2.get(obj2);
                        if (obj3 == null) {
                            String valueOf = String.valueOf(obj2);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                            sb.append(ProtectedSandApp.s("\uf435"));
                            sb.append(valueOf);
                            throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                        }
                        linkedHashMap.put(obj2, obj3);
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : linkedHashSet) {
                        i5--;
                        linkedHashMap.put(obj4, o(obj4, this.f55182t));
                    }
                }
            }
            h3<K, V> i6 = h3.i(linkedHashMap);
            this.f55181s.a(i4);
            this.f55181s.b(i5);
            return i6;
        } catch (Throwable th) {
            this.f55181s.a(i4);
            this.f55181s.b(i5);
            throw th;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k4, V v4) {
        k4.getClass();
        v4.getClass();
        int w4 = w(k4);
        return T(w4).I(k4, w4, v4, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k4, V v4) {
        k4.getClass();
        v4.getClass();
        int w4 = w(k4);
        return T(w4).I(k4, w4, v4, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    h3<K, V> q(Iterable<?> iterable) {
        h3.b c5 = h3.c();
        int i4 = 0;
        int i5 = 0;
        for (Object obj : iterable) {
            V v4 = get(obj);
            if (v4 == null) {
                i5++;
            } else {
                c5.i(obj, v4);
                i4++;
            }
        }
        this.f55181s.a(i4);
        this.f55181s.b(i5);
        return c5.c();
    }

    com.google.common.cache.p<K, V> r(@zc.a Object obj) {
        if (obj == null) {
            return null;
        }
        int w4 = w(obj);
        return T(w4).t(obj, w4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@zc.a Object obj) {
        if (obj == null) {
            return null;
        }
        int w4 = w(obj);
        return T(w4).P(obj, w4);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k4, V v4) {
        k4.getClass();
        v4.getClass();
        int w4 = w(k4);
        return T(w4).W(k4, w4, v4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return com.google.common.primitives.l.x(B());
    }

    @zc.a
    public V t(Object obj) {
        obj.getClass();
        int w4 = w(obj);
        V q4 = T(w4).q(obj, w4);
        if (q4 == null) {
            this.f55181s.b(1);
        } else {
            this.f55181s.a(1);
        }
        return q4;
    }

    @zc.a
    V u(com.google.common.cache.p<K, V> pVar, long j4) {
        V v4;
        if (pVar.getKey() == null || (v4 = pVar.getValueReference().get()) == null || y(pVar, j4)) {
            return null;
        }
        return v4;
    }

    V v(K k4) throws ExecutionException {
        return o(k4, this.f55182t);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f55184v;
        if (collection != null) {
            return collection;
        }
        b0 b0Var = new b0();
        this.f55184v = b0Var;
        return b0Var;
    }

    int w(@zc.a Object obj) {
        return S(this.f55168f.f(obj));
    }

    void x(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    boolean y(com.google.common.cache.p<K, V> pVar, long j4) {
        pVar.getClass();
        if (!m() || j4 - pVar.getAccessTime() < this.f55174l) {
            return n() && j4 - pVar.getWriteTime() >= this.f55175m;
        }
        return true;
    }

    @d9.d
    boolean z(com.google.common.cache.p<K, V> pVar, long j4) {
        return T(pVar.getHash()).w(pVar, j4) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int w4 = w(obj);
        return T(w4).Q(obj, w4, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k4, @zc.a V v4, V v5) {
        k4.getClass();
        v5.getClass();
        if (v4 == null) {
            return false;
        }
        int w4 = w(k4);
        return T(w4).X(k4, w4, v4, v5);
    }
}
