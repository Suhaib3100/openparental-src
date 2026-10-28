package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: CompactLinkedHashMap.java */
@w0
@d9.c
/* loaded from: classes6.dex */
class g0<K, V> extends d0<K, V> {

    /* renamed from: r, reason: collision with root package name */
    private static final int f55741r = -2;

    /* renamed from: n, reason: collision with root package name */
    @d9.d
    @zc.a
    transient long[] f55742n;

    /* renamed from: o, reason: collision with root package name */
    private transient int f55743o;

    /* renamed from: p, reason: collision with root package name */
    private transient int f55744p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f55745q;

    g0() {
        this(3, false);
    }

    public static <K, V> g0<K, V> h0() {
        return new g0<>();
    }

    public static <K, V> g0<K, V> i0(int i4) {
        return new g0<>(i4, false);
    }

    private int j0(int i4) {
        return ((int) (l0()[i4] >>> 32)) - 1;
    }

    private long k0(int i4) {
        return l0()[i4];
    }

    private long[] l0() {
        long[] jArr = this.f55742n;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    private void m0(int i4, long j4) {
        l0()[i4] = j4;
    }

    private void n0(int i4, int i5) {
        m0(i4, (l0()[i4] & 4294967295L) | ((i5 + 1) << 32));
    }

    private void o0(int i4, int i5) {
        if (i4 == -2) {
            this.f55743o = i5;
        } else {
            p0(i4, i5);
        }
        if (i5 == -2) {
            this.f55744p = i4;
        } else {
            n0(i5, i4);
        }
    }

    private void p0(int i4, int i5) {
        m0(i4, (l0()[i4] & (-4294967296L)) | ((i5 + 1) & 4294967295L));
    }

    @Override // com.google.common.collect.d0
    int D() {
        return this.f55743o;
    }

    @Override // com.google.common.collect.d0
    int E(int i4) {
        return ((int) l0()[i4]) - 1;
    }

    @Override // com.google.common.collect.d0
    void J(int i4) {
        super.J(i4);
        this.f55743o = -2;
        this.f55744p = -2;
    }

    @Override // com.google.common.collect.d0
    void L(int i4, @f5 K k4, @f5 V v4, int i5, int i6) {
        super.L(i4, k4, v4, i5, i6);
        o0(this.f55744p, i4);
        o0(i4, -2);
    }

    @Override // com.google.common.collect.d0
    void O(int i4, int i5) {
        int size = size() - 1;
        super.O(i4, i5);
        o0(j0(i4), E(i4));
        if (i4 < size) {
            o0(j0(size), i4);
            o0(i4, E(size));
        }
        m0(size, 0L);
    }

    @Override // com.google.common.collect.d0
    void W(int i4) {
        super.W(i4);
        this.f55742n = Arrays.copyOf(l0(), i4);
    }

    @Override // com.google.common.collect.d0, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (P()) {
            return;
        }
        this.f55743o = -2;
        this.f55744p = -2;
        long[] jArr = this.f55742n;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.d0
    void p(int i4) {
        if (this.f55745q) {
            o0(j0(i4), E(i4));
            o0(this.f55744p, i4);
            o0(i4, -2);
            H();
        }
    }

    @Override // com.google.common.collect.d0
    int q(int i4, int i5) {
        return i4 >= size() ? i5 : i4;
    }

    @Override // com.google.common.collect.d0
    int r() {
        int r4 = super.r();
        this.f55742n = new long[r4];
        return r4;
    }

    @Override // com.google.common.collect.d0
    @f9.a
    Map<K, V> t() {
        Map<K, V> t4 = super.t();
        this.f55742n = null;
        return t4;
    }

    @Override // com.google.common.collect.d0
    Map<K, V> w(int i4) {
        return new LinkedHashMap(i4, 1.0f, this.f55745q);
    }

    g0(int i4) {
        this(i4, false);
    }

    g0(int i4, boolean z4) {
        super(i4);
        this.f55745q = z4;
    }
}
