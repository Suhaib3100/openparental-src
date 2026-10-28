package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.Arrays;

/* compiled from: ObjectCountHashMap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
class c5<K> {

    /* renamed from: i, reason: collision with root package name */
    private static final int f55456i = 1073741824;

    /* renamed from: j, reason: collision with root package name */
    static final float f55457j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private static final long f55458k = 4294967295L;

    /* renamed from: l, reason: collision with root package name */
    private static final long f55459l = -4294967296L;

    /* renamed from: m, reason: collision with root package name */
    static final int f55460m = 3;

    /* renamed from: n, reason: collision with root package name */
    static final int f55461n = -1;

    /* renamed from: a, reason: collision with root package name */
    transient Object[] f55462a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f55463b;

    /* renamed from: c, reason: collision with root package name */
    transient int f55464c;

    /* renamed from: d, reason: collision with root package name */
    transient int f55465d;

    /* renamed from: e, reason: collision with root package name */
    private transient int[] f55466e;

    /* renamed from: f, reason: collision with root package name */
    @d9.d
    transient long[] f55467f;

    /* renamed from: g, reason: collision with root package name */
    private transient float f55468g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f55469h;

    /* compiled from: ObjectCountHashMap.java */
    class a extends v4.f<K> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        final K f55470b;

        /* renamed from: c, reason: collision with root package name */
        int f55471c;

        a(int i4) {
            this.f55470b = (K) c5.this.f55462a[i4];
            this.f55471c = i4;
        }

        @f9.a
        public int a(int i4) {
            b();
            int i5 = this.f55471c;
            if (i5 == -1) {
                c5.this.v(this.f55470b, i4);
                return 0;
            }
            int[] iArr = c5.this.f55463b;
            int i6 = iArr[i5];
            iArr[i5] = i4;
            return i6;
        }

        void b() {
            int i4 = this.f55471c;
            if (i4 == -1 || i4 >= c5.this.D() || !com.google.common.base.f0.a(this.f55470b, c5.this.f55462a[this.f55471c])) {
                this.f55471c = c5.this.n(this.f55470b);
            }
        }

        @Override // com.google.common.collect.u4.a
        public int getCount() {
            b();
            int i4 = this.f55471c;
            if (i4 == -1) {
                return 0;
            }
            return c5.this.f55463b[i4];
        }

        @Override // com.google.common.collect.u4.a
        @f5
        public K getElement() {
            return this.f55470b;
        }
    }

    c5() {
        o(3, 1.0f);
    }

    private void A(int i4) {
        int length = this.f55467f.length;
        if (i4 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                z(max);
            }
        }
    }

    private void B(int i4) {
        if (this.f55466e.length >= 1073741824) {
            this.f55469h = Integer.MAX_VALUE;
            return;
        }
        int i5 = ((int) (i4 * this.f55468g)) + 1;
        int[] s4 = s(i4);
        long[] jArr = this.f55467f;
        int length = s4.length - 1;
        for (int i6 = 0; i6 < this.f55464c; i6++) {
            int i7 = (int) (jArr[i6] >>> 32);
            int i10 = i7 & length;
            int i11 = s4[i10];
            s4[i10] = i6;
            jArr[i6] = (i7 << 32) | (i11 & f55458k);
        }
        this.f55469h = i5;
        this.f55466e = s4;
    }

    private static long E(long j4, int i4) {
        return (j4 & f55459l) | (f55458k & i4);
    }

    static <K> c5<K> c() {
        return new c5<>();
    }

    static <K> c5<K> d(int i4) {
        return new c5<>(i4);
    }

    private static int i(long j4) {
        return (int) (j4 >>> 32);
    }

    private static int k(long j4) {
        return (int) j4;
    }

    private int m() {
        return this.f55466e.length - 1;
    }

    private static long[] r(int i4) {
        long[] jArr = new long[i4];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] s(int i4) {
        int[] iArr = new int[i4];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int x(@zc.a Object obj, int i4) {
        int m4 = m() & i4;
        int i5 = this.f55466e[m4];
        if (i5 == -1) {
            return 0;
        }
        int i6 = -1;
        while (true) {
            if (((int) (this.f55467f[i5] >>> 32)) == i4 && com.google.common.base.f0.a(obj, this.f55462a[i5])) {
                int i7 = this.f55463b[i5];
                if (i6 == -1) {
                    this.f55466e[m4] = (int) this.f55467f[i5];
                } else {
                    long[] jArr = this.f55467f;
                    jArr[i6] = E(jArr[i6], (int) jArr[i5]);
                }
                q(i5);
                this.f55464c--;
                this.f55465d++;
                return i7;
            }
            int i10 = (int) this.f55467f[i5];
            if (i10 == -1) {
                return 0;
            }
            i6 = i5;
            i5 = i10;
        }
    }

    void C(int i4, int i5) {
        com.google.common.base.l0.C(i4, this.f55464c);
        this.f55463b[i4] = i5;
    }

    int D() {
        return this.f55464c;
    }

    public void a() {
        this.f55465d++;
        Arrays.fill(this.f55462a, 0, this.f55464c, (Object) null);
        Arrays.fill(this.f55463b, 0, this.f55464c, 0);
        Arrays.fill(this.f55466e, -1);
        Arrays.fill(this.f55467f, -1L);
        this.f55464c = 0;
    }

    public boolean b(@zc.a Object obj) {
        return n(obj) != -1;
    }

    void e(int i4) {
        if (i4 > this.f55467f.length) {
            z(i4);
        }
        if (i4 >= this.f55469h) {
            B(Math.max(2, Integer.highestOneBit(i4 - 1) << 1));
        }
    }

    int f() {
        return this.f55464c == 0 ? -1 : 0;
    }

    public int g(@zc.a Object obj) {
        int n4 = n(obj);
        if (n4 == -1) {
            return 0;
        }
        return this.f55463b[n4];
    }

    u4.a<K> h(int i4) {
        com.google.common.base.l0.C(i4, this.f55464c);
        return new a(i4);
    }

    @f5
    K j(int i4) {
        com.google.common.base.l0.C(i4, this.f55464c);
        return (K) this.f55462a[i4];
    }

    int l(int i4) {
        com.google.common.base.l0.C(i4, this.f55464c);
        return this.f55463b[i4];
    }

    int n(@zc.a Object obj) {
        int d5 = x2.d(obj);
        int i4 = this.f55466e[m() & d5];
        while (i4 != -1) {
            long j4 = this.f55467f[i4];
            if (((int) (j4 >>> 32)) == d5 && com.google.common.base.f0.a(obj, this.f55462a[i4])) {
                return i4;
            }
            i4 = (int) j4;
        }
        return -1;
    }

    void o(int i4, float f4) {
        com.google.common.base.l0.e(i4 >= 0, ProtectedSandApp.s("\uf47b"));
        com.google.common.base.l0.e(f4 > 0.0f, ProtectedSandApp.s("\uf47c"));
        int a5 = x2.a(i4, f4);
        this.f55466e = s(a5);
        this.f55468g = f4;
        this.f55462a = new Object[i4];
        this.f55463b = new int[i4];
        this.f55467f = r(i4);
        this.f55469h = Math.max(1, (int) (a5 * f4));
    }

    void p(int i4, @f5 K k4, int i5, int i6) {
        this.f55467f[i4] = (i6 << 32) | f55458k;
        this.f55462a[i4] = k4;
        this.f55463b[i4] = i5;
    }

    void q(int i4) {
        int D = D() - 1;
        if (i4 >= D) {
            this.f55462a[i4] = null;
            this.f55463b[i4] = 0;
            this.f55467f[i4] = -1;
            return;
        }
        Object[] objArr = this.f55462a;
        objArr[i4] = objArr[D];
        int[] iArr = this.f55463b;
        iArr[i4] = iArr[D];
        objArr[D] = null;
        iArr[D] = 0;
        long[] jArr = this.f55467f;
        long j4 = jArr[D];
        jArr[i4] = j4;
        jArr[D] = -1;
        int m4 = ((int) (j4 >>> 32)) & m();
        int[] iArr2 = this.f55466e;
        int i5 = iArr2[m4];
        if (i5 == D) {
            iArr2[m4] = i4;
            return;
        }
        while (true) {
            long[] jArr2 = this.f55467f;
            long j5 = jArr2[i5];
            int i6 = (int) j5;
            if (i6 == D) {
                jArr2[i5] = E(j5, i4);
                return;
            }
            i5 = i6;
        }
    }

    int t(int i4) {
        int i5 = i4 + 1;
        if (i5 < this.f55464c) {
            return i5;
        }
        return -1;
    }

    int u(int i4, int i5) {
        return i4 - 1;
    }

    @f9.a
    public int v(@f5 K k4, int i4) {
        b0.d(i4, ProtectedSandApp.s("\uf47d"));
        long[] jArr = this.f55467f;
        Object[] objArr = this.f55462a;
        int[] iArr = this.f55463b;
        int d5 = x2.d(k4);
        int m4 = m() & d5;
        int i5 = this.f55464c;
        int[] iArr2 = this.f55466e;
        int i6 = iArr2[m4];
        if (i6 == -1) {
            iArr2[m4] = i5;
        } else {
            while (true) {
                long j4 = jArr[i6];
                if (((int) (j4 >>> 32)) == d5 && com.google.common.base.f0.a(k4, objArr[i6])) {
                    int i7 = iArr[i6];
                    iArr[i6] = i4;
                    return i7;
                }
                int i10 = (int) j4;
                if (i10 == -1) {
                    jArr[i6] = E(j4, i5);
                    break;
                }
                i6 = i10;
            }
        }
        if (i5 == Integer.MAX_VALUE) {
            throw new IllegalStateException(ProtectedSandApp.s("\uf47e"));
        }
        int i11 = i5 + 1;
        A(i11);
        p(i5, k4, i4, d5);
        this.f55464c = i11;
        if (i5 >= this.f55469h) {
            B(this.f55466e.length * 2);
        }
        this.f55465d++;
        return 0;
    }

    @f9.a
    public int w(@zc.a Object obj) {
        return x(obj, x2.d(obj));
    }

    @f9.a
    int y(int i4) {
        return x(this.f55462a[i4], (int) (this.f55467f[i4] >>> 32));
    }

    void z(int i4) {
        this.f55462a = Arrays.copyOf(this.f55462a, i4);
        this.f55463b = Arrays.copyOf(this.f55463b, i4);
        long[] jArr = this.f55467f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i4);
        if (i4 > length) {
            Arrays.fill(copyOf, length, i4, -1L);
        }
        this.f55467f = copyOf;
    }

    c5(c5<? extends K> c5Var) {
        o(c5Var.D(), 1.0f);
        int f4 = c5Var.f();
        while (f4 != -1) {
            v(c5Var.j(f4), c5Var.l(f4));
            f4 = c5Var.t(f4);
        }
    }

    c5(int i4) {
        this(i4, 1.0f);
    }

    c5(int i4, float f4) {
        o(i4, f4);
    }
}
