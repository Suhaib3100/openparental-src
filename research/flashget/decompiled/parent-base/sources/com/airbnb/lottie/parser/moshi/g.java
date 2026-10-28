package com.airbnb.lottie.parser.moshi;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedHashTreeMap.java */
/* loaded from: classes3.dex */
final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Comparator<Comparable> f39276j = new a();

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f39277k = false;

    /* renamed from: b, reason: collision with root package name */
    Comparator<? super K> f39278b;

    /* renamed from: c, reason: collision with root package name */
    C0664g<K, V>[] f39279c;

    /* renamed from: d, reason: collision with root package name */
    final C0664g<K, V> f39280d;

    /* renamed from: e, reason: collision with root package name */
    int f39281e;

    /* renamed from: f, reason: collision with root package name */
    int f39282f;

    /* renamed from: g, reason: collision with root package name */
    int f39283g;

    /* renamed from: h, reason: collision with root package name */
    private g<K, V>.d f39284h;

    /* renamed from: i, reason: collision with root package name */
    private g<K, V>.e f39285i;

    /* compiled from: LinkedHashTreeMap.java */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private C0664g<K, V> f39286a;

        /* renamed from: b, reason: collision with root package name */
        private int f39287b;

        /* renamed from: c, reason: collision with root package name */
        private int f39288c;

        /* renamed from: d, reason: collision with root package name */
        private int f39289d;

        b() {
        }

        void a(C0664g<K, V> c0664g) {
            c0664g.f39301d = null;
            c0664g.f39299b = null;
            c0664g.f39300c = null;
            c0664g.f39307j = 1;
            int i4 = this.f39287b;
            if (i4 > 0) {
                int i5 = this.f39289d;
                if ((i5 & 1) == 0) {
                    this.f39289d = i5 + 1;
                    this.f39287b = i4 - 1;
                    this.f39288c++;
                }
            }
            c0664g.f39299b = this.f39286a;
            this.f39286a = c0664g;
            int i6 = this.f39289d;
            int i7 = i6 + 1;
            this.f39289d = i7;
            int i10 = this.f39287b;
            if (i10 > 0 && (i7 & 1) == 0) {
                this.f39289d = i6 + 2;
                this.f39287b = i10 - 1;
                this.f39288c++;
            }
            int i11 = 4;
            while (true) {
                int i12 = i11 - 1;
                if ((this.f39289d & i12) != i12) {
                    return;
                }
                int i13 = this.f39288c;
                if (i13 == 0) {
                    C0664g<K, V> c0664g2 = this.f39286a;
                    C0664g<K, V> c0664g3 = c0664g2.f39299b;
                    C0664g<K, V> c0664g4 = c0664g3.f39299b;
                    c0664g3.f39299b = c0664g4.f39299b;
                    this.f39286a = c0664g3;
                    c0664g3.f39300c = c0664g4;
                    c0664g3.f39301d = c0664g2;
                    c0664g3.f39307j = c0664g2.f39307j + 1;
                    c0664g4.f39299b = c0664g3;
                    c0664g2.f39299b = c0664g3;
                } else if (i13 == 1) {
                    C0664g<K, V> c0664g5 = this.f39286a;
                    C0664g<K, V> c0664g6 = c0664g5.f39299b;
                    this.f39286a = c0664g6;
                    c0664g6.f39301d = c0664g5;
                    c0664g6.f39307j = c0664g5.f39307j + 1;
                    c0664g5.f39299b = c0664g6;
                    this.f39288c = 0;
                } else if (i13 == 2) {
                    this.f39288c = 0;
                }
                i11 *= 2;
            }
        }

        void b(int i4) {
            this.f39287b = ((Integer.highestOneBit(i4) * 2) - 1) - i4;
            this.f39289d = 0;
            this.f39288c = 0;
            this.f39286a = null;
        }

        C0664g<K, V> c() {
            C0664g<K, V> c0664g = this.f39286a;
            if (c0664g.f39299b == null) {
                return c0664g;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private C0664g<K, V> f39290a;

        c() {
        }

        public C0664g<K, V> a() {
            C0664g<K, V> c0664g = this.f39290a;
            if (c0664g == null) {
                return null;
            }
            C0664g<K, V> c0664g2 = c0664g.f39299b;
            c0664g.f39299b = null;
            C0664g<K, V> c0664g3 = c0664g.f39301d;
            while (true) {
                C0664g<K, V> c0664g4 = c0664g2;
                c0664g2 = c0664g3;
                if (c0664g2 == null) {
                    this.f39290a = c0664g4;
                    return c0664g;
                }
                c0664g2.f39299b = c0664g4;
                c0664g3 = c0664g2.f39300c;
            }
        }

        void b(C0664g<K, V> c0664g) {
            C0664g<K, V> c0664g2 = null;
            while (c0664g != null) {
                c0664g.f39299b = c0664g2;
                c0664g2 = c0664g;
                c0664g = c0664g.f39300c;
            }
            this.f39290a = c0664g2;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    final class d extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedHashTreeMap.java */
        class a extends g<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.f((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C0664g<K, V> f4;
            if (!(obj instanceof Map.Entry) || (f4 = g.this.f((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.j(f4, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f39281e;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    final class e extends AbstractSet<K> {

        /* compiled from: LinkedHashTreeMap.java */
        class a extends g<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f39304g;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.k(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f39281e;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    abstract class f<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        C0664g<K, V> f39295b;

        /* renamed from: c, reason: collision with root package name */
        C0664g<K, V> f39296c = null;

        /* renamed from: d, reason: collision with root package name */
        int f39297d;

        f() {
            this.f39295b = g.this.f39280d.f39302e;
            this.f39297d = g.this.f39282f;
        }

        final C0664g<K, V> a() {
            C0664g<K, V> c0664g = this.f39295b;
            g gVar = g.this;
            if (c0664g == gVar.f39280d) {
                throw new NoSuchElementException();
            }
            if (gVar.f39282f != this.f39297d) {
                throw new ConcurrentModificationException();
            }
            this.f39295b = c0664g.f39302e;
            this.f39296c = c0664g;
            return c0664g;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f39295b != g.this.f39280d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C0664g<K, V> c0664g = this.f39296c;
            if (c0664g == null) {
                throw new IllegalStateException();
            }
            g.this.j(c0664g, true);
            this.f39296c = null;
            this.f39297d = g.this.f39282f;
        }
    }

    g() {
        this(null);
    }

    private void b() {
        C0664g<K, V>[] c5 = c(this.f39279c);
        this.f39279c = c5;
        this.f39283g = (c5.length / 4) + (c5.length / 2);
    }

    static <K, V> C0664g<K, V>[] c(C0664g<K, V>[] c0664gArr) {
        int length = c0664gArr.length;
        C0664g<K, V>[] c0664gArr2 = new C0664g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i4 = 0; i4 < length; i4++) {
            C0664g<K, V> c0664g = c0664gArr[i4];
            if (c0664g != null) {
                cVar.b(c0664g);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    C0664g<K, V> a5 = cVar.a();
                    if (a5 == null) {
                        break;
                    }
                    if ((a5.f39305h & length) == 0) {
                        i5++;
                    } else {
                        i6++;
                    }
                }
                bVar.b(i5);
                bVar2.b(i6);
                cVar.b(c0664g);
                while (true) {
                    C0664g<K, V> a6 = cVar.a();
                    if (a6 == null) {
                        break;
                    }
                    if ((a6.f39305h & length) == 0) {
                        bVar.a(a6);
                    } else {
                        bVar2.a(a6);
                    }
                }
                c0664gArr2[i4] = i5 > 0 ? bVar.c() : null;
                c0664gArr2[i4 + length] = i6 > 0 ? bVar2.c() : null;
            }
        }
        return c0664gArr2;
    }

    private boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void i(C0664g<K, V> c0664g, boolean z4) {
        while (c0664g != null) {
            C0664g<K, V> c0664g2 = c0664g.f39300c;
            C0664g<K, V> c0664g3 = c0664g.f39301d;
            int i4 = c0664g2 != null ? c0664g2.f39307j : 0;
            int i5 = c0664g3 != null ? c0664g3.f39307j : 0;
            int i6 = i4 - i5;
            if (i6 == -2) {
                C0664g<K, V> c0664g4 = c0664g3.f39300c;
                C0664g<K, V> c0664g5 = c0664g3.f39301d;
                int i7 = (c0664g4 != null ? c0664g4.f39307j : 0) - (c0664g5 != null ? c0664g5.f39307j : 0);
                if (i7 == -1 || (i7 == 0 && !z4)) {
                    m(c0664g);
                } else {
                    n(c0664g3);
                    m(c0664g);
                }
                if (z4) {
                    return;
                }
            } else if (i6 == 2) {
                C0664g<K, V> c0664g6 = c0664g2.f39300c;
                C0664g<K, V> c0664g7 = c0664g2.f39301d;
                int i10 = (c0664g6 != null ? c0664g6.f39307j : 0) - (c0664g7 != null ? c0664g7.f39307j : 0);
                if (i10 == 1 || (i10 == 0 && !z4)) {
                    n(c0664g);
                } else {
                    m(c0664g2);
                    n(c0664g);
                }
                if (z4) {
                    return;
                }
            } else if (i6 == 0) {
                c0664g.f39307j = i4 + 1;
                if (z4) {
                    return;
                }
            } else {
                c0664g.f39307j = Math.max(i4, i5) + 1;
                if (!z4) {
                    return;
                }
            }
            c0664g = c0664g.f39299b;
        }
    }

    private void l(C0664g<K, V> c0664g, C0664g<K, V> c0664g2) {
        C0664g<K, V> c0664g3 = c0664g.f39299b;
        c0664g.f39299b = null;
        if (c0664g2 != null) {
            c0664g2.f39299b = c0664g3;
        }
        if (c0664g3 == null) {
            int i4 = c0664g.f39305h;
            this.f39279c[i4 & (r0.length - 1)] = c0664g2;
        } else if (c0664g3.f39300c == c0664g) {
            c0664g3.f39300c = c0664g2;
        } else {
            c0664g3.f39301d = c0664g2;
        }
    }

    private void m(C0664g<K, V> c0664g) {
        C0664g<K, V> c0664g2 = c0664g.f39300c;
        C0664g<K, V> c0664g3 = c0664g.f39301d;
        C0664g<K, V> c0664g4 = c0664g3.f39300c;
        C0664g<K, V> c0664g5 = c0664g3.f39301d;
        c0664g.f39301d = c0664g4;
        if (c0664g4 != null) {
            c0664g4.f39299b = c0664g;
        }
        l(c0664g, c0664g3);
        c0664g3.f39300c = c0664g;
        c0664g.f39299b = c0664g3;
        int max = Math.max(c0664g2 != null ? c0664g2.f39307j : 0, c0664g4 != null ? c0664g4.f39307j : 0) + 1;
        c0664g.f39307j = max;
        c0664g3.f39307j = Math.max(max, c0664g5 != null ? c0664g5.f39307j : 0) + 1;
    }

    private void n(C0664g<K, V> c0664g) {
        C0664g<K, V> c0664g2 = c0664g.f39300c;
        C0664g<K, V> c0664g3 = c0664g.f39301d;
        C0664g<K, V> c0664g4 = c0664g2.f39300c;
        C0664g<K, V> c0664g5 = c0664g2.f39301d;
        c0664g.f39300c = c0664g5;
        if (c0664g5 != null) {
            c0664g5.f39299b = c0664g;
        }
        l(c0664g, c0664g2);
        c0664g2.f39301d = c0664g;
        c0664g.f39299b = c0664g2;
        int max = Math.max(c0664g3 != null ? c0664g3.f39307j : 0, c0664g5 != null ? c0664g5.f39307j : 0) + 1;
        c0664g.f39307j = max;
        c0664g2.f39307j = Math.max(max, c0664g4 != null ? c0664g4.f39307j : 0) + 1;
    }

    private static int o(int i4) {
        int i5 = i4 ^ ((i4 >>> 20) ^ (i4 >>> 12));
        return (i5 >>> 4) ^ ((i5 >>> 7) ^ i5);
    }

    private Object p() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f39279c, (Object) null);
        this.f39281e = 0;
        this.f39282f++;
        C0664g<K, V> c0664g = this.f39280d;
        C0664g<K, V> c0664g2 = c0664g.f39302e;
        while (c0664g2 != c0664g) {
            C0664g<K, V> c0664g3 = c0664g2.f39302e;
            c0664g2.f39303f = null;
            c0664g2.f39302e = null;
            c0664g2 = c0664g3;
        }
        c0664g.f39303f = c0664g;
        c0664g.f39302e = c0664g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    C0664g<K, V> e(K k4, boolean z4) {
        int i4;
        C0664g<K, V> c0664g;
        Comparator<? super K> comparator = this.f39278b;
        C0664g<K, V>[] c0664gArr = this.f39279c;
        int o4 = o(k4.hashCode());
        int length = (c0664gArr.length - 1) & o4;
        C0664g<K, V> c0664g2 = c0664gArr[length];
        if (c0664g2 != null) {
            Comparable comparable = comparator == f39276j ? (Comparable) k4 : null;
            while (true) {
                i4 = comparable != null ? comparable.compareTo(c0664g2.f39304g) : comparator.compare(k4, c0664g2.f39304g);
                if (i4 == 0) {
                    return c0664g2;
                }
                C0664g<K, V> c0664g3 = i4 < 0 ? c0664g2.f39300c : c0664g2.f39301d;
                if (c0664g3 == null) {
                    break;
                }
                c0664g2 = c0664g3;
            }
        } else {
            i4 = 0;
        }
        C0664g<K, V> c0664g4 = c0664g2;
        int i5 = i4;
        if (!z4) {
            return null;
        }
        C0664g<K, V> c0664g5 = this.f39280d;
        if (c0664g4 != null) {
            c0664g = new C0664g<>(c0664g4, k4, o4, c0664g5, c0664g5.f39303f);
            if (i5 < 0) {
                c0664g4.f39300c = c0664g;
            } else {
                c0664g4.f39301d = c0664g;
            }
            i(c0664g4, true);
        } else {
            if (comparator == f39276j && !(k4 instanceof Comparable)) {
                throw new ClassCastException(k4.getClass().getName().concat(ProtectedSandApp.s("ɹ")));
            }
            c0664g = new C0664g<>(c0664g4, k4, o4, c0664g5, c0664g5.f39303f);
            c0664gArr[length] = c0664g;
        }
        int i6 = this.f39281e;
        this.f39281e = i6 + 1;
        if (i6 > this.f39283g) {
            b();
        }
        this.f39282f++;
        return c0664g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.d dVar = this.f39284h;
        if (dVar != null) {
            return dVar;
        }
        g<K, V>.d dVar2 = new d();
        this.f39284h = dVar2;
        return dVar2;
    }

    C0664g<K, V> f(Map.Entry<?, ?> entry) {
        C0664g<K, V> h4 = h(entry.getKey());
        if (h4 == null || !d(h4.f39306i, entry.getValue())) {
            return null;
        }
        return h4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C0664g<K, V> h4 = h(obj);
        if (h4 != null) {
            return h4.f39306i;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    C0664g<K, V> h(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return e(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    void j(C0664g<K, V> c0664g, boolean z4) {
        int i4;
        if (z4) {
            C0664g<K, V> c0664g2 = c0664g.f39303f;
            c0664g2.f39302e = c0664g.f39302e;
            c0664g.f39302e.f39303f = c0664g2;
            c0664g.f39303f = null;
            c0664g.f39302e = null;
        }
        C0664g<K, V> c0664g3 = c0664g.f39300c;
        C0664g<K, V> c0664g4 = c0664g.f39301d;
        C0664g<K, V> c0664g5 = c0664g.f39299b;
        int i5 = 0;
        if (c0664g3 == null || c0664g4 == null) {
            if (c0664g3 != null) {
                l(c0664g, c0664g3);
                c0664g.f39300c = null;
            } else if (c0664g4 != null) {
                l(c0664g, c0664g4);
                c0664g.f39301d = null;
            } else {
                l(c0664g, null);
            }
            i(c0664g5, false);
            this.f39281e--;
            this.f39282f++;
            return;
        }
        C0664g<K, V> b5 = c0664g3.f39307j > c0664g4.f39307j ? c0664g3.b() : c0664g4.a();
        j(b5, false);
        C0664g<K, V> c0664g6 = c0664g.f39300c;
        if (c0664g6 != null) {
            i4 = c0664g6.f39307j;
            b5.f39300c = c0664g6;
            c0664g6.f39299b = b5;
            c0664g.f39300c = null;
        } else {
            i4 = 0;
        }
        C0664g<K, V> c0664g7 = c0664g.f39301d;
        if (c0664g7 != null) {
            i5 = c0664g7.f39307j;
            b5.f39301d = c0664g7;
            c0664g7.f39299b = b5;
            c0664g.f39301d = null;
        }
        b5.f39307j = Math.max(i4, i5) + 1;
        l(c0664g, b5);
    }

    C0664g<K, V> k(Object obj) {
        C0664g<K, V> h4 = h(obj);
        if (h4 != null) {
            j(h4, true);
        }
        return h4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        g<K, V>.e eVar = this.f39285i;
        if (eVar != null) {
            return eVar;
        }
        g<K, V>.e eVar2 = new e();
        this.f39285i = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k4, V v4) {
        if (k4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ɺ"));
        }
        C0664g<K, V> e4 = e(k4, true);
        V v5 = e4.f39306i;
        e4.f39306i = v4;
        return v5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C0664g<K, V> k4 = k(obj);
        if (k4 != null) {
            return k4.f39306i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f39281e;
    }

    g(Comparator<? super K> comparator) {
        this.f39281e = 0;
        this.f39282f = 0;
        this.f39278b = comparator == null ? f39276j : comparator;
        this.f39280d = new C0664g<>();
        C0664g<K, V>[] c0664gArr = new C0664g[16];
        this.f39279c = c0664gArr;
        this.f39283g = (c0664gArr.length / 4) + (c0664gArr.length / 2);
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.airbnb.lottie.parser.moshi.g$g, reason: collision with other inner class name */
    static final class C0664g<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        C0664g<K, V> f39299b;

        /* renamed from: c, reason: collision with root package name */
        C0664g<K, V> f39300c;

        /* renamed from: d, reason: collision with root package name */
        C0664g<K, V> f39301d;

        /* renamed from: e, reason: collision with root package name */
        C0664g<K, V> f39302e;

        /* renamed from: f, reason: collision with root package name */
        C0664g<K, V> f39303f;

        /* renamed from: g, reason: collision with root package name */
        final K f39304g;

        /* renamed from: h, reason: collision with root package name */
        final int f39305h;

        /* renamed from: i, reason: collision with root package name */
        V f39306i;

        /* renamed from: j, reason: collision with root package name */
        int f39307j;

        C0664g() {
            this.f39304g = null;
            this.f39305h = -1;
            this.f39303f = this;
            this.f39302e = this;
        }

        public C0664g<K, V> a() {
            C0664g<K, V> c0664g = this;
            for (C0664g<K, V> c0664g2 = this.f39300c; c0664g2 != null; c0664g2 = c0664g2.f39300c) {
                c0664g = c0664g2;
            }
            return c0664g;
        }

        public C0664g<K, V> b() {
            C0664g<K, V> c0664g = this;
            for (C0664g<K, V> c0664g2 = this.f39301d; c0664g2 != null; c0664g2 = c0664g2.f39301d) {
                c0664g = c0664g2;
            }
            return c0664g;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k4 = this.f39304g;
            if (k4 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k4.equals(entry.getKey())) {
                return false;
            }
            V v4 = this.f39306i;
            if (v4 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v4.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f39304g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f39306i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k4 = this.f39304g;
            int hashCode = k4 == null ? 0 : k4.hashCode();
            V v4 = this.f39306i;
            return hashCode ^ (v4 != null ? v4.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            V v5 = this.f39306i;
            this.f39306i = v4;
            return v5;
        }

        public String toString() {
            return this.f39304g + ProtectedSandApp.s("ɸ") + this.f39306i;
        }

        C0664g(C0664g<K, V> c0664g, K k4, int i4, C0664g<K, V> c0664g2, C0664g<K, V> c0664g3) {
            this.f39299b = c0664g;
            this.f39304g = k4;
            this.f39305h = i4;
            this.f39307j = 1;
            this.f39302e = c0664g2;
            this.f39303f = c0664g3;
            c0664g3.f39302e = this;
            c0664g2.f39303f = this;
        }
    }
}
