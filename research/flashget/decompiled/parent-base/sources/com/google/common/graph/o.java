package com.google.common.graph;

import com.google.common.collect.d4;
import com.google.common.collect.e7;
import com.google.common.collect.f3;
import com.google.common.graph.o;
import com.google.common.graph.s;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DirectedGraphConnections.java */
@t
/* loaded from: classes6.dex */
final class o<N, V> implements b0<N, V> {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f56846e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Map<N, Object> f56847a;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private final List<f<N>> f56848b;

    /* renamed from: c, reason: collision with root package name */
    private int f56849c;

    /* renamed from: d, reason: collision with root package name */
    private int f56850d;

    /* compiled from: DirectedGraphConnections.java */
    class a extends AbstractSet<N> {

        /* compiled from: DirectedGraphConnections.java */
        /* renamed from: com.google.common.graph.o$a$a, reason: collision with other inner class name */
        class C0871a extends com.google.common.collect.c<N> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56852d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Set f56853e;

            C0871a(a aVar, Iterator it, Set set) {
                this.f56852d = it;
                this.f56853e = set;
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected N a() {
                while (this.f56852d.hasNext()) {
                    f fVar = (f) this.f56852d.next();
                    if (this.f56853e.add(fVar.f56863a)) {
                        return fVar.f56863a;
                    }
                }
                return b();
            }
        }

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e7<N> iterator() {
            return new C0871a(this, o.this.f56848b.iterator(), new HashSet());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return o.this.f56847a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o.this.f56847a.size();
        }
    }

    /* compiled from: DirectedGraphConnections.java */
    class b extends AbstractSet<N> {

        /* compiled from: DirectedGraphConnections.java */
        class a extends com.google.common.collect.c<N> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56855d;

            a(b bVar, Iterator it) {
                this.f56855d = it;
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected N a() {
                while (this.f56855d.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f56855d.next();
                    if (o.s(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return b();
            }
        }

        /* compiled from: DirectedGraphConnections.java */
        /* renamed from: com.google.common.graph.o$b$b, reason: collision with other inner class name */
        class C0872b extends com.google.common.collect.c<N> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56856d;

            C0872b(b bVar, Iterator it) {
                this.f56856d = it;
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected N a() {
                while (this.f56856d.hasNext()) {
                    f fVar = (f) this.f56856d.next();
                    if (fVar instanceof f.a) {
                        return fVar.f56863a;
                    }
                }
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e7<N> iterator() {
            return o.this.f56848b == null ? new a(this, o.this.f56847a.entrySet().iterator()) : new C0872b(this, o.this.f56848b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return o.s(o.this.f56847a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o.this.f56849c;
        }
    }

    /* compiled from: DirectedGraphConnections.java */
    class c extends AbstractSet<N> {

        /* compiled from: DirectedGraphConnections.java */
        class a extends com.google.common.collect.c<N> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56858d;

            a(c cVar, Iterator it) {
                this.f56858d = it;
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected N a() {
                while (this.f56858d.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f56858d.next();
                    if (o.t(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return b();
            }
        }

        /* compiled from: DirectedGraphConnections.java */
        class b extends com.google.common.collect.c<N> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f56859d;

            b(c cVar, Iterator it) {
                this.f56859d = it;
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected N a() {
                while (this.f56859d.hasNext()) {
                    f fVar = (f) this.f56859d.next();
                    if (fVar instanceof f.b) {
                        return fVar.f56863a;
                    }
                }
                return b();
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e7<N> iterator() {
            return o.this.f56848b == null ? new a(this, o.this.f56847a.entrySet().iterator()) : new b(this, o.this.f56848b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return o.t(o.this.f56847a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o.this.f56850d;
        }
    }

    /* compiled from: DirectedGraphConnections.java */
    class d extends com.google.common.collect.c<u<N>> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f56860d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f56861e;

        d(o oVar, Iterator it, AtomicBoolean atomicBoolean) {
            this.f56860d = it;
            this.f56861e = atomicBoolean;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @zc.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public u<N> a() {
            while (this.f56860d.hasNext()) {
                u<N> uVar = (u) this.f56860d.next();
                if (!uVar.h().equals(uVar.i()) || !this.f56861e.getAndSet(true)) {
                    return uVar;
                }
            }
            return b();
        }
    }

    /* compiled from: DirectedGraphConnections.java */
    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56862a;

        static {
            int[] iArr = new int[s.b.values().length];
            f56862a = iArr;
            try {
                iArr[s.b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56862a[s.b.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DirectedGraphConnections.java */
    static abstract class f<N> {

        /* renamed from: a, reason: collision with root package name */
        final N f56863a;

        /* compiled from: DirectedGraphConnections.java */
        static final class a<N> extends f<N> {
            a(N n4) {
                super(n4);
            }

            public boolean equals(@zc.a Object obj) {
                if (obj instanceof a) {
                    return this.f56863a.equals(((a) obj).f56863a);
                }
                return false;
            }

            public int hashCode() {
                return this.f56863a.hashCode() + a.class.hashCode();
            }
        }

        /* compiled from: DirectedGraphConnections.java */
        static final class b<N> extends f<N> {
            b(N n4) {
                super(n4);
            }

            public boolean equals(@zc.a Object obj) {
                if (obj instanceof b) {
                    return this.f56863a.equals(((b) obj).f56863a);
                }
                return false;
            }

            public int hashCode() {
                return this.f56863a.hashCode() + b.class.hashCode();
            }
        }

        f(N n4) {
            n4.getClass();
            this.f56863a = n4;
        }
    }

    /* compiled from: DirectedGraphConnections.java */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final Object f56864a;

        g(Object obj) {
            this.f56864a = obj;
        }
    }

    private o(Map<N, Object> map, @zc.a List<f<N>> list, int i4, int i5) {
        map.getClass();
        this.f56847a = map;
        this.f56848b = list;
        this.f56849c = d0.b(i4);
        this.f56850d = d0.b(i5);
        com.google.common.base.l0.g0(i4 <= map.size() && i5 <= map.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(@zc.a Object obj) {
        return obj == f56846e || (obj instanceof g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(@zc.a Object obj) {
        return (obj == f56846e || obj == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u w(Object obj, f fVar) {
        return fVar instanceof f.b ? u.m(obj, fVar.f56863a) : u.m(fVar.f56863a, obj);
    }

    static <N, V> o<N, V> x(s<N> sVar) {
        ArrayList arrayList;
        int i4 = e.f56862a[sVar.h().ordinal()];
        if (i4 == 1) {
            arrayList = null;
        } else {
            if (i4 != 2) {
                throw new AssertionError(sVar.h());
            }
            arrayList = new ArrayList();
        }
        return new o<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <N, V> o<N, V> y(N n4, Iterable<u<N>> iterable, com.google.common.base.x<N, V> xVar) {
        n4.getClass();
        xVar.getClass();
        HashMap hashMap = new HashMap();
        f3.a r4 = f3.r();
        int i4 = 0;
        int i5 = 0;
        for (u<N> uVar : iterable) {
            if (uVar.h().equals(n4) && uVar.i().equals(n4)) {
                hashMap.put(n4, new g(xVar.apply(n4)));
                r4.j(new f.a(n4));
                r4.j(new f.b(n4));
                i4++;
            } else if (uVar.i().equals(n4)) {
                N h4 = uVar.h();
                Object put = hashMap.put(h4, f56846e);
                if (put != null) {
                    hashMap.put(h4, new g(put));
                }
                r4.j(new f.a(h4));
                i4++;
            } else {
                com.google.common.base.l0.d(uVar.h().equals(n4));
                N i6 = uVar.i();
                V apply = xVar.apply(i6);
                Object put2 = hashMap.put(i6, apply);
                if (put2 != null) {
                    com.google.common.base.l0.d(put2 == f56846e);
                    hashMap.put(i6, new g(apply));
                }
                r4.j(new f.b(i6));
            }
            i5++;
        }
        return new o<>(hashMap, r4.e(), i4, i5);
    }

    @Override // com.google.common.graph.b0
    public Set<N> a() {
        return new c();
    }

    @Override // com.google.common.graph.b0
    public Set<N> b() {
        return new b();
    }

    @Override // com.google.common.graph.b0
    public Set<N> c() {
        return this.f56848b == null ? Collections.unmodifiableSet(this.f56847a.keySet()) : new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b0
    @zc.a
    public V d(N n4) {
        n4.getClass();
        V v4 = (V) this.f56847a.get(n4);
        if (v4 == f56846e) {
            return null;
        }
        return v4 instanceof g ? (V) ((g) v4).f56864a : v4;
    }

    @Override // com.google.common.graph.b0
    @zc.a
    public V e(Object obj) {
        Object obj2;
        obj.getClass();
        Object obj3 = this.f56847a.get(obj);
        if (obj3 == null || obj3 == (obj2 = f56846e)) {
            obj3 = null;
        } else if (obj3 instanceof g) {
            this.f56847a.put(obj, obj2);
            obj3 = ((g) obj3).f56864a;
        } else {
            this.f56847a.remove(obj);
        }
        if (obj3 != null) {
            int i4 = this.f56850d - 1;
            this.f56850d = i4;
            d0.b(i4);
            List<f<N>> list = this.f56848b;
            if (list != null) {
                list.remove(new f.b(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.b0
    public void f(N n4) {
        n4.getClass();
        Object obj = this.f56847a.get(n4);
        if (obj == f56846e) {
            this.f56847a.remove(n4);
        } else if (!(obj instanceof g)) {
            return;
        } else {
            this.f56847a.put(n4, ((g) obj).f56864a);
        }
        int i4 = this.f56849c - 1;
        this.f56849c = i4;
        d0.b(i4);
        List<f<N>> list = this.f56848b;
        if (list != null) {
            list.remove(new f.a(n4));
        }
    }

    @Override // com.google.common.graph.b0
    public Iterator<u<N>> g(final N n4) {
        n4.getClass();
        List<f<N>> list = this.f56848b;
        return new d(this, list == null ? d4.j(d4.c0(new b().iterator(), new com.google.common.base.x() { // from class: com.google.common.graph.l
            @Override // com.google.common.base.x
            public final Object apply(Object obj) {
                u m4;
                m4 = u.m(obj, n4);
                return m4;
            }
        }), d4.c0(new c().iterator(), new com.google.common.base.x() { // from class: com.google.common.graph.m
            @Override // com.google.common.base.x
            public final Object apply(Object obj) {
                u m4;
                m4 = u.m(n4, obj);
                return m4;
            }
        })) : d4.c0(list.iterator(), new com.google.common.base.x() { // from class: com.google.common.graph.n
            @Override // com.google.common.base.x
            public final Object apply(Object obj) {
                u w4;
                w4 = o.w(n4, (o.f) obj);
                return w4;
            }
        }), new AtomicBoolean(false));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // com.google.common.graph.b0
    @zc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V h(N r5, V r6) {
        /*
            r4 = this;
            java.util.Map<N, java.lang.Object> r0 = r4.f56847a
            java.lang.Object r0 = r0.put(r5, r6)
            r1 = 0
            if (r0 != 0) goto Lb
        L9:
            r0 = r1
            goto L2f
        Lb:
            boolean r2 = r0 instanceof com.google.common.graph.o.g
            if (r2 == 0) goto L20
            java.util.Map<N, java.lang.Object> r2 = r4.f56847a
            com.google.common.graph.o$g r3 = new com.google.common.graph.o$g
            r3.<init>(r6)
            r2.put(r5, r3)
            com.google.common.graph.o$g r0 = (com.google.common.graph.o.g) r0
            java.lang.Object r0 = com.google.common.graph.o.g.a(r0)
            goto L2f
        L20:
            java.lang.Object r2 = com.google.common.graph.o.f56846e
            if (r0 != r2) goto L2f
            java.util.Map<N, java.lang.Object> r0 = r4.f56847a
            com.google.common.graph.o$g r2 = new com.google.common.graph.o$g
            r2.<init>(r6)
            r0.put(r5, r2)
            goto L9
        L2f:
            if (r0 != 0) goto L46
            int r6 = r4.f56850d
            int r6 = r6 + 1
            r4.f56850d = r6
            com.google.common.graph.d0.d(r6)
            java.util.List<com.google.common.graph.o$f<N>> r6 = r4.f56848b
            if (r6 == 0) goto L46
            com.google.common.graph.o$f$b r2 = new com.google.common.graph.o$f$b
            r2.<init>(r5)
            r6.add(r2)
        L46:
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r1 = r0
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.o.h(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // com.google.common.graph.b0
    public void i(N n4, V v4) {
        Map<N, Object> map = this.f56847a;
        Object obj = f56846e;
        Object put = map.put(n4, obj);
        if (put != null) {
            if (put instanceof g) {
                this.f56847a.put(n4, put);
                return;
            } else if (put == obj) {
                return;
            } else {
                this.f56847a.put(n4, new g(put));
            }
        }
        int i4 = this.f56849c + 1;
        this.f56849c = i4;
        d0.d(i4);
        List<f<N>> list = this.f56848b;
        if (list != null) {
            list.add(new f.a(n4));
        }
    }
}
