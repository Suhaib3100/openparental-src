package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* compiled from: DiscreteDomain.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class v0<C extends Comparable> {

    /* renamed from: b, reason: collision with root package name */
    final boolean f56564b;

    /* compiled from: DiscreteDomain.java */
    private static final class b extends v0<BigInteger> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final b f56565c = new b();

        /* renamed from: d, reason: collision with root package name */
        private static final BigInteger f56566d = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: e, reason: collision with root package name */
        private static final BigInteger f56567e = BigInteger.valueOf(Long.MAX_VALUE);

        /* renamed from: f, reason: collision with root package name */
        private static final long f56568f = 0;

        b() {
            super(true);
        }

        private Object o() {
            return f56565c;
        }

        @Override // com.google.common.collect.v0
        public BigInteger g(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.v0
        public BigInteger i(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        @Override // com.google.common.collect.v0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f56566d).min(f56567e).longValue();
        }

        public BigInteger l(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public BigInteger h(BigInteger bigInteger, long j4) {
            b0.c(j4, ProtectedSandApp.s("\uf56a"));
            return bigInteger.add(BigInteger.valueOf(j4));
        }

        public BigInteger n(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        public String toString() {
            return ProtectedSandApp.s("\uf56b");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiscreteDomain.java */
    static final class c extends v0<Integer> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final c f56569c = new c();

        /* renamed from: d, reason: collision with root package name */
        private static final long f56570d = 0;

        c() {
            super(true);
        }

        private Object q() {
            return f56569c;
        }

        @Override // com.google.common.collect.v0
        public Integer e() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.v0
        public Integer f() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.v0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(Integer num, Integer num2) {
            return num2.intValue() - num.intValue();
        }

        public Integer l() {
            return Integer.MAX_VALUE;
        }

        public Integer m() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.v0
        @zc.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer g(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer h(Integer num, long j4) {
            b0.c(j4, ProtectedSandApp.s("\uf56c"));
            return Integer.valueOf(com.google.common.primitives.l.d(num.longValue() + j4));
        }

        @Override // com.google.common.collect.v0
        @zc.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer i(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        public String toString() {
            return ProtectedSandApp.s("\uf56d");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiscreteDomain.java */
    static final class d extends v0<Long> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final d f56571c = new d();

        /* renamed from: d, reason: collision with root package name */
        private static final long f56572d = 0;

        d() {
            super(true);
        }

        private Object q() {
            return f56571c;
        }

        @Override // com.google.common.collect.v0
        public Long e() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.v0
        public Long f() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.v0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(Long l4, Long l5) {
            long longValue = l5.longValue() - l4.longValue();
            if (l5.longValue() > l4.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l5.longValue() >= l4.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        public Long l() {
            return Long.MAX_VALUE;
        }

        public Long m() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.v0
        @zc.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long g(Long l4) {
            long longValue = l4.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Long h(Long l4, long j4) {
            b0.c(j4, ProtectedSandApp.s("\uf56e"));
            long longValue = l4.longValue() + j4;
            if (longValue < 0) {
                com.google.common.base.l0.e(l4.longValue() < 0, ProtectedSandApp.s("\uf56f"));
            }
            return Long.valueOf(longValue);
        }

        @Override // com.google.common.collect.v0
        @zc.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long i(Long l4) {
            long longValue = l4.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        public String toString() {
            return ProtectedSandApp.s("\uf570");
        }
    }

    public static v0<BigInteger> a() {
        return b.f56565c;
    }

    public static v0<Integer> c() {
        return c.f56569c;
    }

    public static v0<Long> d() {
        return d.f56571c;
    }

    public abstract long b(C c5, C c6);

    @f9.a
    public C e() {
        throw new NoSuchElementException();
    }

    @f9.a
    public C f() {
        throw new NoSuchElementException();
    }

    @zc.a
    public abstract C g(C c5);

    C h(C c5, long j4) {
        b0.c(j4, ProtectedSandApp.s("\uf566"));
        C c6 = c5;
        for (long j5 = 0; j5 < j4; j5++) {
            c6 = g(c6);
            if (c6 == null) {
                String valueOf = String.valueOf(c5);
                StringBuilder sb = new StringBuilder(valueOf.length() + 51);
                sb.append(ProtectedSandApp.s("\uf567"));
                sb.append(valueOf);
                sb.append(ProtectedSandApp.s("\uf568"));
                throw new IllegalArgumentException(android.support.v4.media.session.b.a(sb, j4, ProtectedSandApp.s("\uf569")));
            }
        }
        return c6;
    }

    @zc.a
    public abstract C i(C c5);

    protected v0() {
        this(false);
    }

    private v0(boolean z4) {
        this.f56564b = z4;
    }
}
