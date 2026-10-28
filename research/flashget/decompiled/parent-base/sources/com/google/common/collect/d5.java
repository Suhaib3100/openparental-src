package com.google.common.collect;

import java.util.Arrays;

/* compiled from: ObjectCountLinkedHashMap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
class d5<K> extends c5<K> {

    /* renamed from: r, reason: collision with root package name */
    private static final int f55569r = -2;

    /* renamed from: o, reason: collision with root package name */
    @d9.d
    transient long[] f55570o;

    /* renamed from: p, reason: collision with root package name */
    private transient int f55571p;

    /* renamed from: q, reason: collision with root package name */
    private transient int f55572q;

    d5() {
        this(3);
    }

    static <K> d5<K> F() {
        return new d5<>(3);
    }

    static <K> d5<K> G(int i4) {
        return new d5<>(i4);
    }

    private int H(int i4) {
        return (int) (this.f55570o[i4] >>> 32);
    }

    private int I(int i4) {
        return (int) this.f55570o[i4];
    }

    private void J(int i4, int i5) {
        long[] jArr = this.f55570o;
        jArr[i4] = (jArr[i4] & 4294967295L) | (i5 << 32);
    }

    private void K(int i4, int i5) {
        if (i4 == -2) {
            this.f55571p = i5;
        } else {
            L(i4, i5);
        }
        if (i5 == -2) {
            this.f55572q = i4;
        } else {
            J(i5, i4);
        }
    }

    private void L(int i4, int i5) {
        long[] jArr = this.f55570o;
        jArr[i4] = (jArr[i4] & (-4294967296L)) | (i5 & 4294967295L);
    }

    @Override // com.google.common.collect.c5
    public void a() {
        super.a();
        this.f55571p = -2;
        this.f55572q = -2;
    }

    @Override // com.google.common.collect.c5
    int f() {
        int i4 = this.f55571p;
        if (i4 == -2) {
            return -1;
        }
        return i4;
    }

    @Override // com.google.common.collect.c5
    void o(int i4, float f4) {
        super.o(i4, f4);
        this.f55571p = -2;
        this.f55572q = -2;
        long[] jArr = new long[i4];
        this.f55570o = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.c5
    void p(int i4, @f5 K k4, int i5, int i6) {
        super.p(i4, k4, i5, i6);
        K(this.f55572q, i4);
        K(i4, -2);
    }

    @Override // com.google.common.collect.c5
    void q(int i4) {
        int D = D() - 1;
        K(H(i4), (int) this.f55570o[i4]);
        if (i4 < D) {
            K(H(D), i4);
            K(i4, (int) this.f55570o[D]);
        }
        super.q(i4);
    }

    @Override // com.google.common.collect.c5
    int t(int i4) {
        int i5 = (int) this.f55570o[i4];
        if (i5 == -2) {
            return -1;
        }
        return i5;
    }

    @Override // com.google.common.collect.c5
    int u(int i4, int i5) {
        return i4 == D() ? i5 : i4;
    }

    @Override // com.google.common.collect.c5
    void z(int i4) {
        super.z(i4);
        long[] jArr = this.f55570o;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i4);
        this.f55570o = copyOf;
        Arrays.fill(copyOf, length, i4, -1L);
    }

    d5(int i4) {
        super(i4, 1.0f);
    }

    d5(int i4, float f4) {
        super(i4, f4);
    }

    d5(c5<K> c5Var) {
        o(c5Var.D(), 1.0f);
        int f4 = c5Var.f();
        while (f4 != -1) {
            v(c5Var.j(f4), c5Var.l(f4));
            f4 = c5Var.t(f4);
        }
    }
}
