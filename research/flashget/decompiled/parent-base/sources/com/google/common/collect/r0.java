package com.google.common.collect;

import com.google.common.collect.h3;
import com.google.common.collect.s6;
import com.google.common.collect.y3;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;

/* compiled from: DenseImmutableTable.java */
@w0
@f9.j(containerOf = {"R", "C", "V"})
@d9.b
/* loaded from: classes6.dex */
final class r0<R, C, V> extends x5<R, C, V> {

    /* renamed from: d, reason: collision with root package name */
    private final h3<R, Integer> f56277d;

    /* renamed from: e, reason: collision with root package name */
    private final h3<C, Integer> f56278e;

    /* renamed from: f, reason: collision with root package name */
    private final h3<R, h3<C, V>> f56279f;

    /* renamed from: g, reason: collision with root package name */
    private final h3<C, h3<R, V>> f56280g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f56281h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f56282i;

    /* renamed from: j, reason: collision with root package name */
    private final V[][] f56283j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f56284k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f56285l;

    /* compiled from: DenseImmutableTable.java */
    private final class b extends d<R, V> {

        /* renamed from: h, reason: collision with root package name */
        private final int f56286h;

        b(int i4) {
            super(r0.this.f56282i[i4]);
            this.f56286h = i4;
        }

        @Override // com.google.common.collect.r0.d
        @zc.a
        V L(int i4) {
            return (V) r0.this.f56283j[i4][this.f56286h];
        }

        @Override // com.google.common.collect.r0.d
        h3<R, Integer> N() {
            return r0.this.f56277d;
        }

        @Override // com.google.common.collect.h3
        boolean p() {
            return true;
        }
    }

    /* compiled from: DenseImmutableTable.java */
    private final class c extends d<C, h3<R, V>> {
        @Override // com.google.common.collect.r0.d
        h3<C, Integer> N() {
            return r0.this.f56278e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r0.d
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public h3<R, V> L(int i4) {
            return new b(i4);
        }

        @Override // com.google.common.collect.h3
        boolean p() {
            return false;
        }

        private c() {
            super(r0.this.f56282i.length);
        }
    }

    /* compiled from: DenseImmutableTable.java */
    private static abstract class d<K, V> extends h3.c<K, V> {

        /* renamed from: g, reason: collision with root package name */
        private final int f56289g;

        /* compiled from: DenseImmutableTable.java */
        class a extends com.google.common.collect.c<Map.Entry<K, V>> {

            /* renamed from: d, reason: collision with root package name */
            private int f56290d = -1;

            /* renamed from: e, reason: collision with root package name */
            private final int f56291e;

            a() {
                this.f56291e = d.this.N().size();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a() {
                int i4 = this.f56290d;
                while (true) {
                    this.f56290d = i4 + 1;
                    int i5 = this.f56290d;
                    if (i5 >= this.f56291e) {
                        return b();
                    }
                    Object L = d.this.L(i5);
                    if (L != null) {
                        return new c3(d.this.J(this.f56290d), L);
                    }
                    i4 = this.f56290d;
                }
            }
        }

        d(int i4) {
            this.f56289g = i4;
        }

        private boolean M() {
            return this.f56289g == N().size();
        }

        @Override // com.google.common.collect.h3.c
        e7<Map.Entry<K, V>> I() {
            return new a();
        }

        K J(int i4) {
            return N().keySet().b().get(i4);
        }

        @zc.a
        abstract V L(int i4);

        abstract h3<K, Integer> N();

        @Override // com.google.common.collect.h3, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            Integer num = N().get(obj);
            if (num == null) {
                return null;
            }
            return L(num.intValue());
        }

        @Override // com.google.common.collect.h3.c, com.google.common.collect.h3
        q3<K> k() {
            return M() ? N().keySet() : new j3(this);
        }

        @Override // java.util.Map
        public int size() {
            return this.f56289g;
        }
    }

    /* compiled from: DenseImmutableTable.java */
    private final class e extends d<C, V> {

        /* renamed from: h, reason: collision with root package name */
        private final int f56293h;

        e(int i4) {
            super(r0.this.f56281h[i4]);
            this.f56293h = i4;
        }

        @Override // com.google.common.collect.r0.d
        @zc.a
        V L(int i4) {
            return (V) r0.this.f56283j[this.f56293h][i4];
        }

        @Override // com.google.common.collect.r0.d
        h3<C, Integer> N() {
            return r0.this.f56278e;
        }

        @Override // com.google.common.collect.h3
        boolean p() {
            return true;
        }
    }

    /* compiled from: DenseImmutableTable.java */
    private final class f extends d<R, h3<C, V>> {
        @Override // com.google.common.collect.r0.d
        h3<R, Integer> N() {
            return r0.this.f56277d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r0.d
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public h3<C, V> L(int i4) {
            return new e(i4);
        }

        @Override // com.google.common.collect.h3
        boolean p() {
            return false;
        }

        private f() {
            super(r0.this.f56281h.length);
        }
    }

    r0(f3<s6.a<R, C, V>> f3Var, q3<R> q3Var, q3<C> q3Var2) {
        this.f56283j = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, q3Var.size(), q3Var2.size()));
        h3<R, Integer> Q = p4.Q(q3Var);
        this.f56277d = Q;
        h3<C, Integer> Q2 = p4.Q(q3Var2);
        this.f56278e = Q2;
        this.f56281h = new int[Q.size()];
        this.f56282i = new int[Q2.size()];
        int[] iArr = new int[f3Var.size()];
        int[] iArr2 = new int[f3Var.size()];
        for (int i4 = 0; i4 < f3Var.size(); i4++) {
            s6.a<R, C, V> aVar = f3Var.get(i4);
            R a5 = aVar.a();
            C b5 = aVar.b();
            Integer num = this.f56277d.get(a5);
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Integer num2 = this.f56278e.get(b5);
            Objects.requireNonNull(num2);
            int intValue2 = num2.intValue();
            A(a5, b5, this.f56283j[intValue][intValue2], aVar.getValue());
            this.f56283j[intValue][intValue2] = aVar.getValue();
            int[] iArr3 = this.f56281h;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.f56282i;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i4] = intValue;
            iArr2[i4] = intValue2;
        }
        this.f56284k = iArr;
        this.f56285l = iArr2;
        this.f56279f = new f();
        this.f56280g = new c();
    }

    @Override // com.google.common.collect.x5
    s6.a<R, C, V> F(int i4) {
        int i5 = this.f56284k[i4];
        int i6 = this.f56285l[i4];
        R r4 = i().b().get(i5);
        C c5 = q2().b().get(i6);
        V v4 = this.f56283j[i5][i6];
        Objects.requireNonNull(v4);
        return y3.g(r4, c5, v4);
    }

    @Override // com.google.common.collect.x5
    V G(int i4) {
        V v4 = this.f56283j[this.f56284k[i4]][this.f56285l[i4]];
        Objects.requireNonNull(v4);
        return v4;
    }

    @Override // com.google.common.collect.y3, com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    public V L(@zc.a Object obj, @zc.a Object obj2) {
        Integer num = this.f56277d.get(obj);
        Integer num2 = this.f56278e.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f56283j[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.y3, com.google.common.collect.s6
    public Map j1() {
        return h3.i(this.f56280g);
    }

    @Override // com.google.common.collect.y3
    /* renamed from: l */
    public h3<C, Map<R, V>> j1() {
        return h3.i(this.f56280g);
    }

    @Override // com.google.common.collect.y3, com.google.common.collect.s6
    public Map m() {
        return h3.i(this.f56279f);
    }

    @Override // com.google.common.collect.y3
    y3.b q() {
        return y3.b.a(this, this.f56284k, this.f56285l);
    }

    @Override // com.google.common.collect.s6
    public int size() {
        return this.f56284k.length;
    }

    @Override // com.google.common.collect.y3
    /* renamed from: w */
    public h3<R, Map<C, V>> m() {
        return h3.i(this.f56279f);
    }
}
