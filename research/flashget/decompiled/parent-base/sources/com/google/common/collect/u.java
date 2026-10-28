package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.p4;
import com.google.common.collect.s6;
import com.google.common.collect.t6;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayTable.java */
@w0
@d9.b(emulated = true)
@d9.a
/* loaded from: classes6.dex */
public final class u<R, C, V> extends q<R, C, V> implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    private static final long f56513k = 0;

    /* renamed from: d, reason: collision with root package name */
    private final f3<R> f56514d;

    /* renamed from: e, reason: collision with root package name */
    private final f3<C> f56515e;

    /* renamed from: f, reason: collision with root package name */
    private final h3<R, Integer> f56516f;

    /* renamed from: g, reason: collision with root package name */
    private final h3<C, Integer> f56517g;

    /* renamed from: h, reason: collision with root package name */
    private final V[][] f56518h;

    /* renamed from: i, reason: collision with root package name */
    @zc.a
    private transient u<R, C, V>.f f56519i;

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    private transient u<R, C, V>.h f56520j;

    /* compiled from: ArrayTable.java */
    class a extends com.google.common.collect.b<s6.a<R, C, V>> {
        a(int i4) {
            super(i4, 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s6.a<R, C, V> a(int i4) {
            return u.e(u.this, i4);
        }
    }

    /* compiled from: ArrayTable.java */
    class b extends t6.b<R, C, V> {

        /* renamed from: b, reason: collision with root package name */
        final int f56522b;

        /* renamed from: c, reason: collision with root package name */
        final int f56523c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f56524d;

        b(int i4) {
            this.f56524d = i4;
            this.f56522b = i4 / u.this.f56515e.size();
            this.f56523c = i4 % u.this.f56515e.size();
        }

        @Override // com.google.common.collect.s6.a
        public R a() {
            return (R) u.this.f56514d.get(this.f56522b);
        }

        @Override // com.google.common.collect.s6.a
        public C b() {
            return (C) u.this.f56515e.get(this.f56523c);
        }

        @Override // com.google.common.collect.s6.a
        @zc.a
        public V getValue() {
            return (V) u.this.l(this.f56522b, this.f56523c);
        }
    }

    /* compiled from: ArrayTable.java */
    class c extends com.google.common.collect.b<V> {
        c(int i4) {
            super(i4, 0);
        }

        @Override // com.google.common.collect.b
        @zc.a
        protected V a(int i4) {
            return (V) u.this.u(i4);
        }
    }

    /* compiled from: ArrayTable.java */
    private static abstract class d<K, V> extends p4.a0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final h3<K, Integer> f56527b;

        /* compiled from: ArrayTable.java */
        class a extends com.google.common.collect.g<K, V> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f56528b;

            a(int i4) {
                this.f56528b = i4;
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            public K getKey() {
                return (K) d.this.d(this.f56528b);
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            @f5
            public V getValue() {
                return (V) d.this.f(this.f56528b);
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            @f5
            public V setValue(@f5 V v4) {
                return (V) d.this.h(this.f56528b, v4);
            }
        }

        /* compiled from: ArrayTable.java */
        class b extends com.google.common.collect.b<Map.Entry<K, V>> {
            b(int i4) {
                super(i4, 0);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(int i4) {
                return d.this.c(i4);
            }
        }

        /* synthetic */ d(h3 h3Var, a aVar) {
            this(h3Var);
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<K, V>> b() {
            return new b(size());
        }

        Map.Entry<K, V> c(int i4) {
            com.google.common.base.l0.C(i4, size());
            return new a(i4);
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return this.f56527b.containsKey(obj);
        }

        K d(int i4) {
            return this.f56527b.keySet().b().get(i4);
        }

        abstract String e();

        @f5
        abstract V f(int i4);

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            Integer num = this.f56527b.get(obj);
            if (num == null) {
                return null;
            }
            return f(num.intValue());
        }

        @f5
        abstract V h(int i4, @f5 V v4);

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f56527b.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f56527b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V put(K k4, @f5 V v4) {
            Integer num = this.f56527b.get(k4);
            if (num != null) {
                return h(num.intValue(), v4);
            }
            String e4 = e();
            String valueOf = String.valueOf(k4);
            String valueOf2 = String.valueOf(this.f56527b.keySet());
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + com.google.android.gms.common.internal.b.a(e4, 9), e4, ProtectedSandApp.s("\uf559"), valueOf, ProtectedSandApp.s("\uf55a"));
            a5.append(valueOf2);
            throw new IllegalArgumentException(a5.toString());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V remove(@zc.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f56527b.size();
        }

        private d(h3<K, Integer> h3Var) {
            this.f56527b = h3Var;
        }
    }

    /* compiled from: ArrayTable.java */
    private class e extends d<R, V> {

        /* renamed from: c, reason: collision with root package name */
        final int f56531c;

        e(int i4) {
            super(u.this.f56516f, null);
            this.f56531c = i4;
        }

        @Override // com.google.common.collect.u.d
        String e() {
            return ProtectedSandApp.s("\uf55b");
        }

        @Override // com.google.common.collect.u.d
        @zc.a
        V f(int i4) {
            return (V) u.this.l(i4, this.f56531c);
        }

        @Override // com.google.common.collect.u.d
        @zc.a
        V h(int i4, @zc.a V v4) {
            return (V) u.this.x(i4, this.f56531c, v4);
        }
    }

    /* compiled from: ArrayTable.java */
    private class f extends d<C, Map<R, V>> {
        /* synthetic */ f(u uVar, a aVar) {
            this();
        }

        @Override // com.google.common.collect.u.d
        String e() {
            return ProtectedSandApp.s("\uf55c");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<R, V> f(int i4) {
            return new e(i4);
        }

        @Override // com.google.common.collect.u.d, java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C c5, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<R, V> h(int i4, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        private f() {
            super(u.this.f56517g, null);
        }
    }

    /* compiled from: ArrayTable.java */
    private class g extends d<C, V> {

        /* renamed from: c, reason: collision with root package name */
        final int f56534c;

        g(int i4) {
            super(u.this.f56517g, null);
            this.f56534c = i4;
        }

        @Override // com.google.common.collect.u.d
        String e() {
            return ProtectedSandApp.s("\uf55d");
        }

        @Override // com.google.common.collect.u.d
        @zc.a
        V f(int i4) {
            return (V) u.this.l(this.f56534c, i4);
        }

        @Override // com.google.common.collect.u.d
        @zc.a
        V h(int i4, @zc.a V v4) {
            return (V) u.this.x(this.f56534c, i4, v4);
        }
    }

    /* compiled from: ArrayTable.java */
    private class h extends d<R, Map<C, V>> {
        /* synthetic */ h(u uVar, a aVar) {
            this();
        }

        @Override // com.google.common.collect.u.d
        String e() {
            return ProtectedSandApp.s("\uf55e");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<C, V> f(int i4) {
            return new g(i4);
        }

        @Override // com.google.common.collect.u.d, java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R r4, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<C, V> h(int i4, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        private h() {
            super(u.this.f56516f, null);
        }
    }

    private u(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        f3<R> w4 = f3.w(iterable);
        this.f56514d = w4;
        f3<C> w5 = f3.w(iterable2);
        this.f56515e = w5;
        com.google.common.base.l0.d(w4.isEmpty() == w5.isEmpty());
        this.f56516f = p4.Q(w4);
        this.f56517g = p4.Q(w5);
        this.f56518h = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, w4.size(), w5.size()));
        s();
    }

    static s6.a e(u uVar, int i4) {
        uVar.getClass();
        return new b(i4);
    }

    public static <R, C, V> u<R, C, V> p(s6<R, C, ? extends V> s6Var) {
        return s6Var instanceof u ? new u<>((u) s6Var) : new u<>(s6Var);
    }

    public static <R, C, V> u<R, C, V> q(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new u<>(iterable, iterable2);
    }

    private s6.a<R, C, V> t(int i4) {
        return new b(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    public V u(int i4) {
        return l(i4 / this.f56515e.size(), i4 % this.f56515e.size());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean A2(@zc.a Object obj) {
        return this.f56516f.containsKey(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public Set<s6.a<R, C, V>> B1() {
        return super.B1();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    @f9.a
    public V D1(R r4, C c5, @zc.a V v4) {
        r4.getClass();
        c5.getClass();
        Integer num = this.f56516f.get(r4);
        com.google.common.base.l0.y(num != null, ProtectedSandApp.s("\uf564"), r4, this.f56514d);
        Integer num2 = this.f56517g.get(c5);
        com.google.common.base.l0.y(num2 != null, ProtectedSandApp.s("\uf565"), c5, this.f56515e);
        return x(num.intValue(), num2.intValue(), v4);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean I2(@zc.a Object obj, @zc.a Object obj2) {
        return this.f56516f.containsKey(obj) && this.f56517g.containsKey(obj2);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    public V L(@zc.a Object obj, @zc.a Object obj2) {
        Integer num = this.f56516f.get(obj);
        Integer num2 = this.f56517g.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return l(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean S(@zc.a Object obj) {
        return this.f56517g.containsKey(obj);
    }

    @Override // com.google.common.collect.q
    Iterator<s6.a<R, C, V>> a() {
        return new a(size());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean containsValue(@zc.a Object obj) {
        for (V[] vArr : this.f56518h) {
            for (V v4 : vArr) {
                if (com.google.common.base.f0.a(obj, v4)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q
    Iterator<V> d() {
        return new c(size());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public void e1(s6<? extends R, ? extends C, ? extends V> s6Var) {
        super.e1(s6Var);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean equals(@zc.a Object obj) {
        return t6.b(this, obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public Set i() {
        return this.f56516f.keySet();
    }

    @Override // com.google.common.collect.s6
    public Map<C, V> i3(R r4) {
        r4.getClass();
        Integer num = this.f56516f.get(r4);
        return num == null ? Collections.emptyMap() : new g(num.intValue());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean isEmpty() {
        return this.f56514d.isEmpty() || this.f56515e.isEmpty();
    }

    @Override // com.google.common.collect.s6
    public Map<C, Map<R, V>> j1() {
        u<R, C, V>.f fVar = this.f56519i;
        if (fVar != null) {
            return fVar;
        }
        u<R, C, V>.f fVar2 = new f(this, null);
        this.f56519i = fVar2;
        return fVar2;
    }

    @zc.a
    public V l(int i4, int i5) {
        com.google.common.base.l0.C(i4, this.f56514d.size());
        com.google.common.base.l0.C(i5, this.f56515e.size());
        return this.f56518h[i4][i5];
    }

    @Override // com.google.common.collect.s6
    public Map<R, Map<C, V>> m() {
        u<R, C, V>.h hVar = this.f56520j;
        if (hVar != null) {
            return hVar;
        }
        u<R, C, V>.h hVar2 = new h(this, null);
        this.f56520j = hVar2;
        return hVar2;
    }

    public f3<C> n() {
        return this.f56515e;
    }

    @Override // com.google.common.collect.s6
    public Map<R, V> n1(C c5) {
        c5.getClass();
        Integer num = this.f56517g.get(c5);
        return num == null ? Collections.emptyMap() : new e(num.intValue());
    }

    public q3<C> o() {
        return this.f56517g.keySet();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public Set q2() {
        return this.f56517g.keySet();
    }

    @zc.a
    @f9.a
    public V r(@zc.a Object obj, @zc.a Object obj2) {
        Integer num = this.f56516f.get(obj);
        Integer num2 = this.f56517g.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return x(num.intValue(), num2.intValue(), null);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public V remove(@zc.a Object obj, @zc.a Object obj2) {
        throw new UnsupportedOperationException();
    }

    public void s() {
        for (V[] vArr : this.f56518h) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.s6
    public int size() {
        return this.f56515e.size() * this.f56514d.size();
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public f3<R> v() {
        return this.f56514d;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public Collection<V> values() {
        return super.values();
    }

    public q3<R> w() {
        return this.f56516f.keySet();
    }

    @zc.a
    @f9.a
    public V x(int i4, int i5, @zc.a V v4) {
        com.google.common.base.l0.C(i4, this.f56514d.size());
        com.google.common.base.l0.C(i5, this.f56515e.size());
        V[] vArr = this.f56518h[i4];
        V v5 = vArr[i5];
        vArr[i5] = v4;
        return v5;
    }

    @d9.c
    public V[][] y(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.f56514d.size(), this.f56515e.size()));
        for (int i4 = 0; i4 < this.f56514d.size(); i4++) {
            V[] vArr2 = this.f56518h[i4];
            System.arraycopy(vArr2, 0, vArr[i4], 0, vArr2.length);
        }
        return vArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u(s6<R, C, ? extends V> s6Var) {
        this(s6Var.i(), s6Var.q2());
        super.e1(s6Var);
    }

    private u(u<R, C, V> uVar) {
        f3<R> f3Var = uVar.f56514d;
        this.f56514d = f3Var;
        f3<C> f3Var2 = uVar.f56515e;
        this.f56515e = f3Var2;
        this.f56516f = uVar.f56516f;
        this.f56517g = uVar.f56517g;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, f3Var.size(), f3Var2.size()));
        this.f56518h = vArr;
        for (int i4 = 0; i4 < this.f56514d.size(); i4++) {
            V[] vArr2 = uVar.f56518h[i4];
            System.arraycopy(vArr2, 0, vArr[i4], 0, vArr2.length);
        }
    }
}
