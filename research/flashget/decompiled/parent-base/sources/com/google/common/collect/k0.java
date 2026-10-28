package com.google.common.collect;

import java.util.Comparator;

/* compiled from: ComparisonChain.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final k0 f55879a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final k0 f55880b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final k0 f55881c = new b(1);

    /* compiled from: ComparisonChain.java */
    class a extends k0 {
        a() {
        }

        @Override // com.google.common.collect.k0
        public k0 d(double d5, double d6) {
            return o(Double.compare(d5, d6));
        }

        @Override // com.google.common.collect.k0
        public k0 e(float f4, float f5) {
            return o(Float.compare(f4, f5));
        }

        @Override // com.google.common.collect.k0
        public k0 f(int i4, int i5) {
            return o(com.google.common.primitives.l.e(i4, i5));
        }

        @Override // com.google.common.collect.k0
        public k0 g(long j4, long j5) {
            return o(com.google.common.primitives.n.d(j4, j5));
        }

        @Override // com.google.common.collect.k0
        public k0 i(Comparable<?> comparable, Comparable<?> comparable2) {
            return o(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.k0
        public <T> k0 j(@f5 T t4, @f5 T t5, Comparator<T> comparator) {
            return o(comparator.compare(t4, t5));
        }

        @Override // com.google.common.collect.k0
        public k0 k(boolean z4, boolean z5) {
            return o(com.google.common.primitives.a.d(z4, z5));
        }

        @Override // com.google.common.collect.k0
        public k0 l(boolean z4, boolean z5) {
            return o(com.google.common.primitives.a.d(z5, z4));
        }

        @Override // com.google.common.collect.k0
        public int m() {
            return 0;
        }

        k0 o(int i4) {
            return i4 < 0 ? k0.f55880b : i4 > 0 ? k0.f55881c : k0.f55879a;
        }
    }

    /* compiled from: ComparisonChain.java */
    private static final class b extends k0 {

        /* renamed from: d, reason: collision with root package name */
        final int f55882d;

        b(int i4) {
            this.f55882d = i4;
        }

        @Override // com.google.common.collect.k0
        public k0 d(double d5, double d6) {
            return this;
        }

        @Override // com.google.common.collect.k0
        public k0 e(float f4, float f5) {
            return this;
        }

        @Override // com.google.common.collect.k0
        public k0 f(int i4, int i5) {
            return this;
        }

        @Override // com.google.common.collect.k0
        public k0 g(long j4, long j5) {
            return this;
        }

        @Override // com.google.common.collect.k0
        public k0 i(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.k0
        public <T> k0 j(@f5 T t4, @f5 T t5, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.k0
        public k0 k(boolean z4, boolean z5) {
            return this;
        }

        @Override // com.google.common.collect.k0
        public k0 l(boolean z4, boolean z5) {
            return this;
        }

        @Override // com.google.common.collect.k0
        public int m() {
            return this.f55882d;
        }
    }

    private k0() {
    }

    public static k0 n() {
        return f55879a;
    }

    public abstract k0 d(double d5, double d6);

    public abstract k0 e(float f4, float f5);

    public abstract k0 f(int i4, int i5);

    public abstract k0 g(long j4, long j5);

    @Deprecated
    public final k0 h(Boolean bool, Boolean bool2) {
        return k(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract k0 i(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> k0 j(@f5 T t4, @f5 T t5, Comparator<T> comparator);

    public abstract k0 k(boolean z4, boolean z5);

    public abstract k0 l(boolean z4, boolean z5);

    public abstract int m();

    k0(a aVar) {
    }
}
