package com.google.common.collect;

import com.google.common.collect.d4;
import com.google.common.collect.d6;
import com.google.common.collect.p4;
import com.google.common.collect.s6;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: StandardTable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
class q6<R, C, V> extends q<R, C, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final long f56237i = 0;

    /* renamed from: d, reason: collision with root package name */
    @r2
    final Map<R, Map<C, V>> f56238d;

    /* renamed from: e, reason: collision with root package name */
    @r2
    final com.google.common.base.u0<? extends Map<C, V>> f56239e;

    /* renamed from: f, reason: collision with root package name */
    @zc.a
    private transient Set<C> f56240f;

    /* renamed from: g, reason: collision with root package name */
    @zc.a
    private transient Map<R, Map<C, V>> f56241g;

    /* renamed from: h, reason: collision with root package name */
    @zc.a
    private transient q6<R, C, V>.f f56242h;

    /* compiled from: StandardTable.java */
    private class b implements Iterator<s6.a<R, C, V>> {

        /* renamed from: b, reason: collision with root package name */
        final Iterator<Map.Entry<R, Map<C, V>>> f56243b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        Map.Entry<R, Map<C, V>> f56244c;

        /* renamed from: d, reason: collision with root package name */
        Iterator<Map.Entry<C, V>> f56245d;

        private b() {
            this.f56243b = q6.this.f56238d.entrySet().iterator();
            this.f56245d = d4.n.INSTANCE;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s6.a<R, C, V> next() {
            if (!this.f56245d.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f56243b.next();
                this.f56244c = next;
                this.f56245d = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f56244c);
            Map.Entry<C, V> next2 = this.f56245d.next();
            return t6.c(this.f56244c.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56243b.hasNext() || this.f56245d.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f56245d.remove();
            Map.Entry<R, Map<C, V>> entry = this.f56244c;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f56243b.remove();
                this.f56244c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StandardTable.java */
    class c extends p4.r0<R, V> {

        /* renamed from: e, reason: collision with root package name */
        final C f56247e;

        /* compiled from: StandardTable.java */
        private class a extends d6.k<Map.Entry<R, V>> {
            private a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                c.this.e(com.google.common.base.n0.c());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@zc.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return q6.this.h(entry.getKey(), c.this.f56247e, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                c cVar = c.this;
                return !q6.this.S(cVar.f56247e);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@zc.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return q6.this.o(entry.getKey(), c.this.f56247e, entry.getValue());
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.e(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = q6.this.f56238d.values().iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(c.this.f56247e)) {
                        i4++;
                    }
                }
                return i4;
            }
        }

        /* compiled from: StandardTable.java */
        private class b extends com.google.common.collect.c<Map.Entry<R, V>> {

            /* renamed from: d, reason: collision with root package name */
            final Iterator<Map.Entry<R, Map<C, V>>> f56250d;

            /* compiled from: StandardTable.java */
            class a extends com.google.common.collect.g<R, V> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map.Entry f56252b;

                a(Map.Entry entry) {
                    this.f56252b = entry;
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f56252b.getKey();
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f56252b.getValue()).get(c.this.f56247e);
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public V setValue(V v4) {
                    Map map = (Map) this.f56252b.getValue();
                    C c5 = c.this.f56247e;
                    v4.getClass();
                    return (V) map.put(c5, v4);
                }
            }

            private b() {
                this.f56250d = q6.this.f56238d.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> a() {
                while (this.f56250d.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f56250d.next();
                    if (next.getValue().containsKey(c.this.f56247e)) {
                        return new a(next);
                    }
                }
                return b();
            }
        }

        /* compiled from: StandardTable.java */
        /* renamed from: com.google.common.collect.q6$c$c, reason: collision with other inner class name */
        private class C0855c extends p4.b0<R, V> {
            C0855c() {
                super(c.this);
            }

            @Override // com.google.common.collect.p4.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@zc.a Object obj) {
                c cVar = c.this;
                return q6.this.I2(obj, cVar.f56247e);
            }

            @Override // com.google.common.collect.p4.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@zc.a Object obj) {
                c cVar = c.this;
                return q6.this.remove(obj, cVar.f56247e) != null;
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.e(com.google.common.base.n0.h(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)), p4.r.KEY));
            }
        }

        /* compiled from: StandardTable.java */
        private class d extends p4.q0<R, V> {
            d() {
                super(c.this);
            }

            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@zc.a Object obj) {
                return obj != null && c.this.e(com.google.common.base.n0.h(com.google.common.base.n0.m(obj), p4.r.VALUE));
            }

            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return c.this.e(com.google.common.base.n0.h(com.google.common.base.n0.n(collection), p4.r.VALUE));
            }

            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return c.this.e(com.google.common.base.n0.h(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)), p4.r.VALUE));
            }
        }

        c(C c5) {
            c5.getClass();
            this.f56247e = c5;
        }

        @Override // com.google.common.collect.p4.r0
        Set<Map.Entry<R, V>> b() {
            return new a();
        }

        @Override // com.google.common.collect.p4.r0
        /* renamed from: c */
        Set<R> i() {
            return new C0855c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return q6.this.I2(obj, this.f56247e);
        }

        @Override // com.google.common.collect.p4.r0
        Collection<V> d() {
            return new d();
        }

        @f9.a
        boolean e(com.google.common.base.m0<? super Map.Entry<R, V>> m0Var) {
            Iterator<Map.Entry<R, Map<C, V>>> it = q6.this.f56238d.entrySet().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v4 = value.get(this.f56247e);
                if (v4 != null && m0Var.apply(new c3(next.getKey(), v4))) {
                    value.remove(this.f56247e);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            return (V) q6.this.L(obj, this.f56247e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V put(R r4, V v4) {
            return (V) q6.this.D1(r4, this.f56247e, v4);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V remove(@zc.a Object obj) {
            return (V) q6.this.remove(obj, this.f56247e);
        }
    }

    /* compiled from: StandardTable.java */
    private class d extends com.google.common.collect.c<C> {

        /* renamed from: d, reason: collision with root package name */
        final Map<C, V> f56256d;

        /* renamed from: e, reason: collision with root package name */
        final Iterator<Map<C, V>> f56257e;

        /* renamed from: f, reason: collision with root package name */
        Iterator<Map.Entry<C, V>> f56258f;

        private d() {
            this.f56256d = q6.this.f56239e.get();
            this.f56257e = q6.this.f56238d.values().iterator();
            this.f56258f = d4.l.f55558f;
        }

        @Override // com.google.common.collect.c
        @zc.a
        protected C a() {
            while (true) {
                if (this.f56258f.hasNext()) {
                    Map.Entry<C, V> next = this.f56258f.next();
                    if (!this.f56256d.containsKey(next.getKey())) {
                        this.f56256d.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f56257e.hasNext()) {
                        return b();
                    }
                    this.f56258f = this.f56257e.next().entrySet().iterator();
                }
            }
        }
    }

    /* compiled from: StandardTable.java */
    private class e extends q6<R, C, V>.i<C> {
        private e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return q6.this.S(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return q6.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            boolean z4 = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = q6.this.f56238d.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // com.google.common.collect.d6.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            Iterator<Map<C, V>> it = q6.this.f56238d.values().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (d4.V(next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            Iterator<Map<C, V>> it = q6.this.f56238d.values().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d4.Z(iterator());
        }
    }

    /* compiled from: StandardTable.java */
    private class f extends p4.r0<C, Map<R, V>> {

        /* compiled from: StandardTable.java */
        class a extends q6<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* compiled from: StandardTable.java */
            /* renamed from: com.google.common.collect.q6$f$a$a, reason: collision with other inner class name */
            class C0856a implements com.google.common.base.x<C, Map<R, V>> {
                C0856a() {
                }

                @Override // com.google.common.base.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<R, V> apply(C c5) {
                    return q6.this.n1(c5);
                }
            }

            a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@zc.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!q6.this.S(entry.getKey())) {
                    return false;
                }
                Map<R, V> map = f.this.get(entry.getKey());
                Objects.requireNonNull(map);
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return p4.m(q6.this.q2(), new C0856a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@zc.a Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                q6.this.n(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                collection.getClass();
                return d6.J(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                collection.getClass();
                Iterator it = l4.s(q6.this.q2().iterator()).iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(new c3(next, q6.this.n1(next)))) {
                        q6.this.n(next);
                        z4 = true;
                    }
                }
                return z4;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return q6.this.q2().size();
            }
        }

        /* compiled from: StandardTable.java */
        private class b extends p4.q0<C, Map<R, V>> {
            b() {
                super(f.this);
            }

            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@zc.a Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        q6.this.n(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                collection.getClass();
                Iterator it = l4.s(q6.this.q2().iterator()).iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(q6.this.n1(next))) {
                        q6.this.n(next);
                        z4 = true;
                    }
                }
                return z4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                collection.getClass();
                Iterator it = l4.s(q6.this.q2().iterator()).iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(q6.this.n1(next))) {
                        q6.this.n(next);
                        z4 = true;
                    }
                }
                return z4;
            }
        }

        private f() {
        }

        @Override // com.google.common.collect.p4.r0
        public Set<Map.Entry<C, Map<R, V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return q6.this.S(obj);
        }

        @Override // com.google.common.collect.p4.r0
        Collection<Map<R, V>> d() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(@zc.a Object obj) {
            if (!q6.this.S(obj)) {
                return null;
            }
            q6 q6Var = q6.this;
            Objects.requireNonNull(obj);
            return q6Var.n1(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(@zc.a Object obj) {
            if (q6.this.S(obj)) {
                return q6.this.n(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        public Set<C> keySet() {
            return q6.this.q2();
        }
    }

    /* compiled from: StandardTable.java */
    class g extends p4.a0<C, V> {

        /* renamed from: b, reason: collision with root package name */
        final R f56265b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        Map<C, V> f56266c;

        /* compiled from: StandardTable.java */
        class a implements Iterator<Map.Entry<C, V>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f56268b;

            a(Iterator it) {
                this.f56268b = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return g.this.f((Map.Entry) this.f56268b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f56268b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f56268b.remove();
                g.this.d();
            }
        }

        /* compiled from: StandardTable.java */
        class b extends c2<C, V> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Map.Entry f56270b;

            b(g gVar, Map.Entry entry) {
                this.f56270b = entry;
            }

            @Override // com.google.common.collect.c2, java.util.Map.Entry
            public boolean equals(@zc.a Object obj) {
                return A3(obj);
            }

            @Override // com.google.common.collect.c2, java.util.Map.Entry
            public V setValue(V v4) {
                v4.getClass();
                return (V) super.setValue(v4);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c2, com.google.common.collect.h2
            /* renamed from: v3 */
            public Map.Entry<C, V> u3() {
                return this.f56270b;
            }
        }

        g(R r4) {
            r4.getClass();
            this.f56265b = r4;
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<C, V>> b() {
            e();
            Map<C, V> map = this.f56266c;
            return map == null ? d4.n.INSTANCE : new a(map.entrySet().iterator());
        }

        @zc.a
        Map<C, V> c() {
            return q6.this.f56238d.get(this.f56265b);
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            e();
            Map<C, V> map = this.f56266c;
            if (map != null) {
                map.clear();
            }
            d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            Map<C, V> map;
            e();
            return (obj == null || (map = this.f56266c) == null || !p4.o0(map, obj)) ? false : true;
        }

        void d() {
            e();
            Map<C, V> map = this.f56266c;
            if (map == null || !map.isEmpty()) {
                return;
            }
            q6.this.f56238d.remove(this.f56265b);
            this.f56266c = null;
        }

        final void e() {
            Map<C, V> map = this.f56266c;
            if (map == null || (map.isEmpty() && q6.this.f56238d.containsKey(this.f56265b))) {
                this.f56266c = c();
            }
        }

        Map.Entry<C, V> f(Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            Map<C, V> map;
            e();
            if (obj == null || (map = this.f56266c) == null) {
                return null;
            }
            return (V) p4.p0(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V put(C c5, V v4) {
            c5.getClass();
            v4.getClass();
            Map<C, V> map = this.f56266c;
            return (map == null || map.isEmpty()) ? (V) q6.this.D1(this.f56265b, c5, v4) : this.f56266c.put(c5, v4);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V remove(@zc.a Object obj) {
            e();
            Map<C, V> map = this.f56266c;
            if (map == null) {
                return null;
            }
            V v4 = (V) p4.q0(map, obj);
            d();
            return v4;
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            e();
            Map<C, V> map = this.f56266c;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* compiled from: StandardTable.java */
    class h extends p4.r0<R, Map<C, V>> {

        /* compiled from: StandardTable.java */
        class a extends q6<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* compiled from: StandardTable.java */
            /* renamed from: com.google.common.collect.q6$h$a$a, reason: collision with other inner class name */
            class C0857a implements com.google.common.base.x<R, Map<C, V>> {
                C0857a() {
                }

                @Override // com.google.common.base.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<C, V> apply(R r4) {
                    return q6.this.i3(r4);
                }
            }

            a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@zc.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && c0.j(q6.this.f56238d.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return p4.m(q6.this.f56238d.keySet(), new C0857a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@zc.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && q6.this.f56238d.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return q6.this.f56238d.size();
            }
        }

        h() {
        }

        @Override // com.google.common.collect.p4.r0
        protected Set<Map.Entry<R, Map<C, V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return q6.this.A2(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(@zc.a Object obj) {
            if (!q6.this.A2(obj)) {
                return null;
            }
            q6 q6Var = q6.this;
            Objects.requireNonNull(obj);
            return q6Var.i3(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(@zc.a Object obj) {
            if (obj == null) {
                return null;
            }
            return q6.this.f56238d.remove(obj);
        }
    }

    /* compiled from: StandardTable.java */
    private abstract class i<T> extends d6.k<T> {
        private i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q6.this.f56238d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return q6.this.f56238d.isEmpty();
        }
    }

    q6(Map<R, Map<C, V>> map, com.google.common.base.u0<? extends Map<C, V>> u0Var) {
        this.f56238d = map;
        this.f56239e = u0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(@zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3) {
        return obj3 != null && obj3.equals(L(obj, obj2));
    }

    private Map<C, V> l(R r4) {
        Map<C, V> map = this.f56238d.get(r4);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.f56239e.get();
        this.f56238d.put(r4, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @f9.a
    public Map<R, V> n(@zc.a Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.f56238d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V remove = next.getValue().remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(@zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3) {
        if (!h(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean A2(@zc.a Object obj) {
        return obj != null && p4.o0(this.f56238d, obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public Set<s6.a<R, C, V>> B1() {
        return super.B1();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    @f9.a
    public V D1(R r4, C c5, V v4) {
        r4.getClass();
        c5.getClass();
        v4.getClass();
        return l(r4).put(c5, v4);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean I2(@zc.a Object obj, @zc.a Object obj2) {
        return (obj == null || obj2 == null || !super.I2(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    public V L(@zc.a Object obj, @zc.a Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.L(obj, obj2);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean S(@zc.a Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.f56238d.values().iterator();
        while (it.hasNext()) {
            if (p4.o0(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q
    Iterator<s6.a<R, C, V>> a() {
        return new b();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public void clear() {
        this.f56238d.clear();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean containsValue(@zc.a Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public Set<R> i() {
        return m().keySet();
    }

    @Override // com.google.common.collect.s6
    public Map<C, V> i3(R r4) {
        return new g(r4);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean isEmpty() {
        return this.f56238d.isEmpty();
    }

    Iterator<C> j() {
        return new d();
    }

    @Override // com.google.common.collect.s6
    public Map<C, Map<R, V>> j1() {
        q6<R, C, V>.f fVar = this.f56242h;
        if (fVar != null) {
            return fVar;
        }
        q6<R, C, V>.f fVar2 = new f();
        this.f56242h = fVar2;
        return fVar2;
    }

    Map<R, Map<C, V>> k() {
        return new h();
    }

    @Override // com.google.common.collect.s6
    public Map<R, Map<C, V>> m() {
        Map<R, Map<C, V>> map = this.f56241g;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> k4 = k();
        this.f56241g = k4;
        return k4;
    }

    @Override // com.google.common.collect.s6
    public Map<R, V> n1(C c5) {
        return new c(c5);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public Set<C> q2() {
        Set<C> set = this.f56240f;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.f56240f = eVar;
        return eVar;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    @f9.a
    public V remove(@zc.a Object obj, @zc.a Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) p4.p0(this.f56238d, obj)) == null) {
            return null;
        }
        V v4 = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.f56238d.remove(obj);
        }
        return v4;
    }

    @Override // com.google.common.collect.s6
    public int size() {
        Iterator<Map<C, V>> it = this.f56238d.values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().size();
        }
        return i4;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public Collection<V> values() {
        return super.values();
    }
}
