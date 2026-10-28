package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.m0;

/* compiled from: ParsedValues.java */
/* loaded from: classes7.dex */
class z extends x<z> {

    /* renamed from: l, reason: collision with root package name */
    private static final float f83066l = 0.75f;

    /* renamed from: m, reason: collision with root package name */
    private static final int f83067m = -1640531527;

    /* renamed from: n, reason: collision with root package name */
    private static final Set<net.time4j.engine.q<?>> f83068n;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f83069b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f83070c;

    /* renamed from: d, reason: collision with root package name */
    private Map<net.time4j.engine.q<?>, Object> f83071d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f83072e;

    /* renamed from: f, reason: collision with root package name */
    private int f83073f;

    /* renamed from: g, reason: collision with root package name */
    private int f83074g;

    /* renamed from: h, reason: collision with root package name */
    private int f83075h;

    /* renamed from: i, reason: collision with root package name */
    private int f83076i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f83077j = false;

    /* renamed from: k, reason: collision with root package name */
    private int f83078k = -1;

    /* compiled from: ParsedValues.java */
    private class b implements Iterator<net.time4j.engine.q<?>> {

        /* renamed from: b, reason: collision with root package name */
        int f83079b;

        /* renamed from: c, reason: collision with root package name */
        int f83080c;

        private b() {
            this.f83079b = z.this.f83073f;
            this.f83080c = z.this.f83076i;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> next() {
            Object obj;
            if (this.f83080c > 0) {
                Object[] objArr = z.this.f83069b;
                do {
                    int i4 = this.f83079b - 1;
                    this.f83079b = i4;
                    if (i4 >= 0) {
                        obj = objArr[i4];
                    }
                } while (obj == null);
                this.f83080c--;
                return (net.time4j.engine.q) net.time4j.engine.q.class.cast(obj);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f83080c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("镲\u0001"));
        }
    }

    /* compiled from: ParsedValues.java */
    private class c extends AbstractSet<net.time4j.engine.q<?>> {
        private c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<net.time4j.engine.q<?>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z.this.f83076i;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(net.time4j.l0.f83327r);
        hashSet.add(net.time4j.l0.f83331v);
        hashSet.add(net.time4j.l0.f83332w);
        hashSet.add(m0.f83374y);
        hashSet.add(m0.A);
        hashSet.add(m0.C);
        hashSet.add(m0.G);
        f83068n = Collections.unmodifiableSet(hashSet);
    }

    z(int i4, boolean z4) {
        if (z4) {
            this.f83073f = Integer.MIN_VALUE;
            this.f83074g = Integer.MIN_VALUE;
            this.f83075h = Integer.MIN_VALUE;
            this.f83076i = Integer.MIN_VALUE;
            this.f83069b = null;
            this.f83070c = null;
            this.f83072e = new int[3];
            for (int i5 = 0; i5 < 3; i5++) {
                this.f83072e[i5] = Integer.MIN_VALUE;
            }
        } else {
            int Y = Y(i4);
            this.f83073f = Y;
            this.f83074g = Y - 1;
            this.f83075h = d0(Y);
            int i6 = this.f83073f;
            this.f83069b = new Object[i6];
            this.f83070c = null;
            this.f83072e = new int[i6];
            this.f83076i = 0;
        }
        this.f83071d = null;
    }

    private static int Y(int i4) {
        return Math.max(2, f0((int) Math.ceil(i4 / 0.75f)));
    }

    private static net.time4j.engine.q<Integer> Z(int i4) {
        switch (i4) {
            case 0:
                return net.time4j.l0.f83327r;
            case 1:
                return net.time4j.l0.f83331v;
            case 2:
                return net.time4j.l0.f83332w;
            case 3:
                return m0.f83374y;
            case 4:
                return m0.A;
            case 5:
                return m0.C;
            case 6:
                return m0.G;
            default:
                throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("镳\u0001"), i4));
        }
    }

    private int a0(net.time4j.engine.q<?> qVar) {
        Object obj;
        Object[] objArr = this.f83069b;
        if (objArr != null) {
            int e02 = e0(qVar.hashCode()) & this.f83074g;
            Object obj2 = objArr[e02];
            if (obj2 == null) {
                return Integer.MIN_VALUE;
            }
            if (qVar.equals(obj2)) {
                return this.f83072e[e02];
            }
            do {
                e02 = (e02 + 1) & this.f83074g;
                obj = objArr[e02];
                if (obj == null) {
                    return Integer.MIN_VALUE;
                }
            } while (!qVar.equals(obj));
            return this.f83072e[e02];
        }
        if (qVar == net.time4j.l0.f83327r) {
            return this.f83072e[0];
        }
        if (qVar == net.time4j.l0.f83331v) {
            return this.f83072e[1];
        }
        if (qVar == net.time4j.l0.f83332w) {
            return this.f83072e[2];
        }
        if (qVar == m0.f83374y) {
            return this.f83073f;
        }
        if (qVar == m0.A) {
            return this.f83074g;
        }
        if (qVar == m0.C) {
            return this.f83075h;
        }
        if (qVar == m0.G) {
            return this.f83076i;
        }
        Map<net.time4j.engine.q<?>, Object> map = this.f83071d;
        if (map == null || !map.containsKey(qVar)) {
            return Integer.MIN_VALUE;
        }
        return ((Integer) Integer.class.cast(map.get(qVar))).intValue();
    }

    static boolean c0(net.time4j.engine.q<?> qVar) {
        return f83068n.contains(qVar);
    }

    private static int d0(int i4) {
        return Math.min((int) Math.ceil(i4 * 0.75f), i4 - 1);
    }

    private static int e0(int i4) {
        int i5 = i4 * f83067m;
        return i5 ^ (i5 >>> 16);
    }

    private static int f0(int i4) {
        if (i4 == 0) {
            return 1;
        }
        int i5 = i4 - 1;
        int i6 = i5 | (i5 >> 1);
        int i7 = i6 | (i6 >> 2);
        int i10 = i7 | (i7 >> 4);
        int i11 = i10 | (i10 >> 8);
        return (i11 | (i11 >> 16)) + 1;
    }

    private void h0(int i4) {
        Object obj;
        Object[] objArr = this.f83069b;
        Object[] objArr2 = this.f83070c;
        int[] iArr = this.f83072e;
        int i5 = i4 - 1;
        Object[] objArr3 = new Object[i4];
        Object[] objArr4 = objArr2 == null ? null : new Object[i4];
        int[] iArr2 = new int[i4];
        int i6 = this.f83073f;
        int i7 = this.f83076i;
        for (int i10 = 0; i10 < i7; i10++) {
            do {
                i6--;
                obj = objArr[i6];
            } while (obj == null);
            int e02 = e0(obj.hashCode()) & i5;
            if (objArr3[e02] != null) {
                do {
                    e02 = (e02 + 1) & i5;
                } while (objArr3[e02] != null);
            }
            objArr3[e02] = objArr[i6];
            if (objArr2 != null) {
                objArr4[e02] = objArr2[i6];
            }
            iArr2[e02] = iArr[i6];
        }
        this.f83073f = i4;
        this.f83074g = i5;
        this.f83075h = d0(i4);
        this.f83069b = objArr3;
        this.f83070c = objArr4;
        this.f83072e = iArr2;
    }

    private void i0(Object obj) {
        Object obj2;
        Object[] objArr = this.f83069b;
        if (objArr != null) {
            int e02 = e0(obj.hashCode()) & this.f83074g;
            Object obj3 = objArr[e02];
            if (obj3 == null) {
                return;
            }
            if (obj.equals(obj3)) {
                j0(e02);
                return;
            }
            do {
                e02 = (e02 + 1) & this.f83074g;
                obj2 = objArr[e02];
                if (obj2 == null) {
                    return;
                }
            } while (!obj.equals(obj2));
            j0(e02);
            return;
        }
        if (obj == net.time4j.l0.f83327r) {
            this.f83072e[0] = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.l0.f83331v) {
            this.f83072e[1] = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.l0.f83332w) {
            this.f83072e[2] = Integer.MIN_VALUE;
            return;
        }
        if (obj == m0.f83374y) {
            this.f83073f = Integer.MIN_VALUE;
            return;
        }
        if (obj == m0.A) {
            this.f83074g = Integer.MIN_VALUE;
            return;
        }
        if (obj == m0.C) {
            this.f83075h = Integer.MIN_VALUE;
            return;
        }
        if (obj == m0.G) {
            this.f83076i = Integer.MIN_VALUE;
            return;
        }
        Map<net.time4j.engine.q<?>, Object> map = this.f83071d;
        if (map != null) {
            map.remove(obj);
        }
    }

    private void j0(int i4) {
        Object obj;
        this.f83076i--;
        Object[] objArr = this.f83069b;
        while (true) {
            int i5 = (i4 + 1) & this.f83074g;
            while (true) {
                obj = objArr[i5];
                if (obj == null) {
                    objArr[i4] = null;
                    return;
                }
                int e02 = e0(obj.hashCode());
                int i6 = this.f83074g;
                int i7 = e02 & i6;
                if (i4 > i5) {
                    if (i4 >= i7 && i7 > i5) {
                        break;
                    }
                    i5 = (i5 + 1) & i6;
                } else if (i4 >= i7 || i7 > i5) {
                    break;
                } else {
                    i5 = (i5 + 1) & i6;
                }
            }
            objArr[i4] = obj;
            Object[] objArr2 = this.f83070c;
            if (objArr2 != null) {
                objArr2[i4] = objArr2[i5];
            }
            int[] iArr = this.f83072e;
            iArr[i4] = iArr[i5];
            i4 = i5;
        }
    }

    @Override // net.time4j.engine.r
    public Set<net.time4j.engine.q<?>> A() {
        if (this.f83069b != null) {
            return new c();
        }
        HashSet hashSet = new HashSet();
        if (this.f83072e[0] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.l0.f83327r);
        }
        if (this.f83072e[1] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.l0.f83331v);
        }
        if (this.f83072e[2] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.l0.f83332w);
        }
        if (this.f83073f != Integer.MIN_VALUE) {
            hashSet.add(m0.f83374y);
        }
        if (this.f83074g != Integer.MIN_VALUE) {
            hashSet.add(m0.A);
        }
        if (this.f83075h != Integer.MIN_VALUE) {
            hashSet.add(m0.C);
        }
        if (this.f83076i != Integer.MIN_VALUE) {
            hashSet.add(m0.G);
        }
        Map<net.time4j.engine.q<?>, Object> map = this.f83071d;
        if (map != null) {
            hashSet.addAll(map.keySet());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // net.time4j.format.expert.x
    <E> E P() {
        return null;
    }

    @Override // net.time4j.format.expert.x
    void Q(net.time4j.engine.q<?> qVar, int i4) {
        Object obj;
        int i5;
        int i6;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        Object[] objArr = this.f83069b;
        if (objArr != null) {
            int e02 = e0(qVar.hashCode()) & this.f83074g;
            Object obj2 = objArr[e02];
            if (obj2 != null) {
                if (obj2.equals(qVar)) {
                    if (!this.f83077j && this.f83072e[e02] != i4) {
                        throw new net.time4j.format.expert.a(qVar);
                    }
                    this.f83072e[e02] = i4;
                    return;
                }
                do {
                    e02 = (e02 + 1) & this.f83074g;
                    obj = objArr[e02];
                    if (obj != null) {
                    }
                } while (!obj.equals(qVar));
                if (!this.f83077j && this.f83072e[e02] != i4) {
                    throw new net.time4j.format.expert.a(qVar);
                }
                this.f83072e[e02] = i4;
                return;
            }
            objArr[e02] = qVar;
            this.f83072e[e02] = i4;
            int i14 = this.f83076i;
            int i15 = i14 + 1;
            this.f83076i = i15;
            if (i14 >= this.f83075h) {
                h0(Y(i15));
                return;
            }
            return;
        }
        if (qVar == net.time4j.l0.f83327r) {
            if (!this.f83077j && (i13 = this.f83072e[0]) != Integer.MIN_VALUE && i13 != i4) {
                throw new net.time4j.format.expert.a(qVar);
            }
            this.f83072e[0] = i4;
            return;
        }
        if (qVar == net.time4j.l0.f83331v) {
            if (!this.f83077j && (i12 = this.f83072e[1]) != Integer.MIN_VALUE && i12 != i4) {
                throw new net.time4j.format.expert.a(qVar);
            }
            this.f83072e[1] = i4;
            return;
        }
        if (qVar == net.time4j.l0.f83332w) {
            if (!this.f83077j && (i11 = this.f83072e[2]) != Integer.MIN_VALUE && i11 != i4) {
                throw new net.time4j.format.expert.a(qVar);
            }
            this.f83072e[2] = i4;
            return;
        }
        if (qVar == m0.f83374y) {
            if (!this.f83077j && (i10 = this.f83073f) != Integer.MIN_VALUE && i10 != i4) {
                throw new net.time4j.format.expert.a(qVar);
            }
            this.f83073f = i4;
            return;
        }
        if (qVar == m0.A) {
            if (!this.f83077j && (i7 = this.f83074g) != Integer.MIN_VALUE && i7 != i4) {
                throw new net.time4j.format.expert.a(qVar);
            }
            this.f83074g = i4;
            return;
        }
        if (qVar == m0.C) {
            if (!this.f83077j && (i6 = this.f83075h) != Integer.MIN_VALUE && i6 != i4) {
                throw new net.time4j.format.expert.a(qVar);
            }
            this.f83075h = i4;
            return;
        }
        if (qVar == m0.G) {
            if (!this.f83077j && (i5 = this.f83076i) != Integer.MIN_VALUE && i5 != i4) {
                throw new net.time4j.format.expert.a(qVar);
            }
            this.f83076i = i4;
            return;
        }
        Map map = this.f83071d;
        if (map == null) {
            map = new HashMap();
            this.f83071d = map;
        }
        Integer valueOf = Integer.valueOf(i4);
        if (!this.f83077j && map.containsKey(qVar) && !valueOf.equals(map.get(qVar))) {
            throw new net.time4j.format.expert.a(qVar);
        }
        map.put(qVar, valueOf);
    }

    @Override // net.time4j.format.expert.x
    void R(net.time4j.engine.q<?> qVar, Object obj) {
        Object obj2;
        if (obj == null) {
            i0(qVar);
            return;
        }
        if (qVar.getType() == Integer.class) {
            Q(qVar, ((Integer) Integer.class.cast(obj)).intValue());
            return;
        }
        Object[] objArr = this.f83069b;
        if (objArr == null) {
            Map map = this.f83071d;
            if (map == null) {
                map = new HashMap();
                this.f83071d = map;
            }
            if (!this.f83077j && map.containsKey(qVar) && !obj.equals(map.get(qVar))) {
                throw new net.time4j.format.expert.a(qVar);
            }
            map.put(qVar, obj);
            return;
        }
        if (this.f83070c == null) {
            this.f83070c = new Object[this.f83073f];
        }
        int e02 = e0(qVar.hashCode()) & this.f83074g;
        Object obj3 = objArr[e02];
        if (obj3 != null) {
            if (obj3.equals(qVar)) {
                if (!this.f83077j && !obj.equals(this.f83070c[e02])) {
                    throw new net.time4j.format.expert.a(qVar);
                }
                this.f83070c[e02] = obj;
                return;
            }
            do {
                e02 = (e02 + 1) & this.f83074g;
                obj2 = objArr[e02];
                if (obj2 != null) {
                }
            } while (!obj2.equals(qVar));
            if (!this.f83077j && !obj.equals(this.f83070c[e02])) {
                throw new net.time4j.format.expert.a(qVar);
            }
            this.f83070c[e02] = obj;
            return;
        }
        objArr[e02] = qVar;
        this.f83070c[e02] = obj;
        int i4 = this.f83076i;
        int i5 = i4 + 1;
        this.f83076i = i5;
        if (i4 >= this.f83075h) {
            h0(Y(i5));
        }
    }

    @Override // net.time4j.format.expert.x
    void S(Object obj) {
    }

    int b0() {
        return this.f83078k;
    }

    void g0(z zVar) {
        int i4 = 0;
        if (this.f83069b != null) {
            Object[] objArr = zVar.f83069b;
            while (i4 < objArr.length) {
                Object obj = objArr[i4];
                if (obj != null) {
                    net.time4j.engine.q<?> qVar = (net.time4j.engine.q) net.time4j.engine.q.class.cast(obj);
                    if (qVar.getType() == Integer.class) {
                        Q(qVar, zVar.f83072e[i4]);
                    } else {
                        R(qVar, zVar.f83070c[i4]);
                    }
                }
                i4++;
            }
            return;
        }
        int i5 = zVar.f83073f;
        if (i5 != Integer.MIN_VALUE) {
            int i6 = this.f83073f;
            if (i6 != Integer.MIN_VALUE && !this.f83077j && i6 != i5) {
                throw new net.time4j.format.expert.a(m0.f83374y);
            }
            this.f83073f = i5;
        }
        int i7 = zVar.f83074g;
        if (i7 != Integer.MIN_VALUE) {
            int i10 = this.f83074g;
            if (i10 != Integer.MIN_VALUE && !this.f83077j && i10 != i7) {
                throw new net.time4j.format.expert.a(m0.A);
            }
            this.f83074g = i7;
        }
        int i11 = zVar.f83075h;
        if (i11 != Integer.MIN_VALUE) {
            int i12 = this.f83075h;
            if (i12 != Integer.MIN_VALUE && !this.f83077j && i12 != i11) {
                throw new net.time4j.format.expert.a(m0.C);
            }
            this.f83075h = i11;
        }
        int i13 = zVar.f83076i;
        if (i13 != Integer.MIN_VALUE) {
            int i14 = this.f83076i;
            if (i14 != Integer.MIN_VALUE && !this.f83077j && i14 != i13) {
                throw new net.time4j.format.expert.a(m0.G);
            }
            this.f83076i = i13;
        }
        while (i4 < 3) {
            int i15 = zVar.f83072e[i4];
            if (i15 != Integer.MIN_VALUE) {
                int[] iArr = this.f83072e;
                int i16 = iArr[i4];
                if (i16 != Integer.MIN_VALUE && !this.f83077j && i16 != i15) {
                    throw new net.time4j.format.expert.a(Z(i4));
                }
                iArr[i4] = i15;
            }
            i4++;
        }
        Map<net.time4j.engine.q<?>, Object> map = zVar.f83071d;
        if (map != null) {
            for (net.time4j.engine.q<?> qVar2 : map.keySet()) {
                R(qVar2, map.get(qVar2));
            }
        }
    }

    void k0() {
        Object[] objArr = this.f83069b;
        if (objArr == null) {
            this.f83073f = Integer.MIN_VALUE;
            this.f83074g = Integer.MIN_VALUE;
            this.f83075h = Integer.MIN_VALUE;
            this.f83076i = Integer.MIN_VALUE;
            for (int i4 = 0; i4 < 3; i4++) {
                this.f83072e[i4] = Integer.MIN_VALUE;
            }
            this.f83071d = null;
        } else {
            this.f83069b = new Object[objArr.length];
        }
        this.f83076i = 0;
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public int l(net.time4j.engine.q<Integer> qVar) {
        return a0(qVar);
    }

    void l0() {
        this.f83077j = true;
    }

    void m0(int i4) {
        this.f83078k = i4;
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public <V> V r(net.time4j.engine.q<V> qVar) {
        int e02;
        Object obj;
        Object obj2;
        Class<V> type = qVar.getType();
        String s4 = ProtectedSandApp.s("镴\u0001");
        if (type == Integer.class) {
            int a02 = a0(qVar);
            if (a02 != Integer.MIN_VALUE) {
                return type.cast(Integer.valueOf(a02));
            }
            throw new ChronoException(net.time4j.g0.a(qVar, new StringBuilder(s4)));
        }
        Object[] objArr = this.f83069b;
        if (objArr == null) {
            Map<net.time4j.engine.q<?>, Object> map = this.f83071d;
            if (map == null || !map.containsKey(qVar)) {
                throw new ChronoException(net.time4j.g0.a(qVar, new StringBuilder(s4)));
            }
            return qVar.getType().cast(map.get(qVar));
        }
        if (this.f83070c == null || (obj = objArr[(e02 = e0(qVar.hashCode()) & this.f83074g)]) == null) {
            throw new ChronoException(net.time4j.g0.a(qVar, new StringBuilder(s4)));
        }
        if (qVar.equals(obj)) {
            return type.cast(this.f83070c[e02]);
        }
        do {
            e02 = (e02 + 1) & this.f83074g;
            obj2 = objArr[e02];
            if (obj2 == null) {
                throw new ChronoException(net.time4j.g0.a(qVar, new StringBuilder(s4)));
            }
        } while (!qVar.equals(obj2));
        return type.cast(this.f83070c[e02]);
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public boolean w(net.time4j.engine.q<?> qVar) {
        Object obj;
        if (qVar == null) {
            return false;
        }
        Object[] objArr = this.f83069b;
        if (objArr != null) {
            int e02 = e0(qVar.hashCode()) & this.f83074g;
            Object obj2 = objArr[e02];
            if (obj2 == null) {
                return false;
            }
            if (qVar.equals(obj2)) {
                return true;
            }
            do {
                e02 = (e02 + 1) & this.f83074g;
                obj = objArr[e02];
                if (obj == null) {
                    return false;
                }
            } while (!qVar.equals(obj));
            return true;
        }
        if (qVar == net.time4j.l0.f83327r) {
            return this.f83072e[0] != Integer.MIN_VALUE;
        }
        if (qVar == net.time4j.l0.f83331v) {
            return this.f83072e[1] != Integer.MIN_VALUE;
        }
        if (qVar == net.time4j.l0.f83332w) {
            return this.f83072e[2] != Integer.MIN_VALUE;
        }
        if (qVar == m0.f83374y) {
            return this.f83073f != Integer.MIN_VALUE;
        }
        if (qVar == m0.A) {
            return this.f83074g != Integer.MIN_VALUE;
        }
        if (qVar == m0.C) {
            return this.f83075h != Integer.MIN_VALUE;
        }
        if (qVar == m0.G) {
            return this.f83076i != Integer.MIN_VALUE;
        }
        Map<net.time4j.engine.q<?>, Object> map = this.f83071d;
        return map != null && map.containsKey(qVar);
    }
}
