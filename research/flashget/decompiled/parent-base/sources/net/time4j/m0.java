package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.engine.j0;
import net.time4j.n;

/* compiled from: PlainTime.java */
@net.time4j.format.c("iso8601")
/* loaded from: classes7.dex */
public final class m0 extends net.time4j.engine.m0<y, m0> implements net.time4j.base.g, net.time4j.engine.i0<m0>, net.time4j.format.h {

    @net.time4j.engine.d0(format = "m")
    public static final q0<Integer, m0> A;
    public static final q0<Integer, m0> B;

    @net.time4j.engine.d0(format = "s")
    public static final q0<Integer, m0> C;
    public static final q0<Integer, m0> D;
    public static final q0<Integer, m0> E;
    public static final q0<Integer, m0> F;

    @net.time4j.engine.d0(format = "S")
    public static final q0<Integer, m0> G;

    @net.time4j.engine.d0(format = "A")
    public static final q0<Integer, m0> H;
    public static final q0<Long, m0> I;
    public static final q0<Long, m0> J;
    public static final m1<BigDecimal> K;
    public static final m1<BigDecimal> L;
    public static final m1<BigDecimal> M;
    public static final net.time4j.engine.q<j> N;
    private static final Map<String, Object> O;
    private static final net.time4j.engine.a0<m0, BigDecimal> P;
    private static final net.time4j.engine.a0<m0, BigDecimal> Q;
    private static final net.time4j.engine.a0<m0, BigDecimal> R;
    private static final net.time4j.engine.j0<y, m0> X;

    /* renamed from: f, reason: collision with root package name */
    static final char f83355f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f83356g = 1000000000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f83357h = 1000000;

    /* renamed from: i, reason: collision with root package name */
    private static final int f83358i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private static final BigDecimal f83359j;

    /* renamed from: k, reason: collision with root package name */
    private static final BigDecimal f83360k;

    /* renamed from: l, reason: collision with root package name */
    private static final BigDecimal f83361l;

    /* renamed from: m, reason: collision with root package name */
    private static final BigDecimal f83362m;

    /* renamed from: n, reason: collision with root package name */
    private static final BigDecimal f83363n;

    /* renamed from: o, reason: collision with root package name */
    private static final BigDecimal f83364o;

    /* renamed from: p, reason: collision with root package name */
    private static final m0[] f83365p;

    /* renamed from: q, reason: collision with root package name */
    static final m0 f83366q;

    /* renamed from: r, reason: collision with root package name */
    static final m0 f83367r;

    /* renamed from: s, reason: collision with root package name */
    static final net.time4j.engine.q<m0> f83368s;
    private static final long serialVersionUID = 2780881537313863339L;

    /* renamed from: t, reason: collision with root package name */
    public static final c1 f83369t;

    /* renamed from: u, reason: collision with root package name */
    @net.time4j.engine.d0(format = "a")
    public static final m1<c0> f83370u;

    /* renamed from: v, reason: collision with root package name */
    @net.time4j.engine.d0(format = "h")
    public static final net.time4j.c<Integer, m0> f83371v;

    /* renamed from: w, reason: collision with root package name */
    @net.time4j.engine.d0(format = "k")
    public static final net.time4j.c<Integer, m0> f83372w;

    /* renamed from: x, reason: collision with root package name */
    @net.time4j.engine.d0(format = "K")
    public static final q0<Integer, m0> f83373x;

    /* renamed from: y, reason: collision with root package name */
    @net.time4j.engine.d0(format = "H")
    public static final q0<Integer, m0> f83374y;

    /* renamed from: z, reason: collision with root package name */
    public static final q0<Integer, m0> f83375z;

    /* renamed from: b, reason: collision with root package name */
    private final transient byte f83376b;

    /* renamed from: c, reason: collision with root package name */
    private final transient byte f83377c;

    /* renamed from: d, reason: collision with root package name */
    private final transient byte f83378d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f83379e;

    /* compiled from: PlainTime.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83380a;

        static {
            int[] iArr = new int[j.values().length];
            f83380a = iArr;
            try {
                iArr[j.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83380a[j.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83380a[j.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83380a[j.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83380a[j.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83380a[j.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: PlainTime.java */
    private static class b implements net.time4j.engine.a0<m0, BigDecimal> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<BigDecimal> f83381b;

        /* renamed from: c, reason: collision with root package name */
        private final BigDecimal f83382c;

        b(net.time4j.engine.q<BigDecimal> qVar, BigDecimal bigDecimal) {
            this.f83381b = qVar;
            this.f83382c = bigDecimal;
        }

        private static BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.divide(bigDecimal2, 16, RoundingMode.FLOOR);
        }

        private static int k(BigDecimal bigDecimal) {
            return Math.min(999999999, bigDecimal.movePointRight(9).setScale(0, RoundingMode.HALF_UP).intValue());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(m0 m0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(m0 m0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public BigDecimal getMaximum(m0 m0Var) {
            net.time4j.engine.q<BigDecimal> qVar;
            return (m0Var.f83376b == 24 && ((qVar = this.f83381b) == m0.L || qVar == m0.M)) ? BigDecimal.ZERO : this.f83382c;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public BigDecimal getMinimum(m0 m0Var) {
            return BigDecimal.ZERO;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigDecimal getValue(m0 m0Var) {
            BigDecimal add;
            net.time4j.engine.q<BigDecimal> qVar = this.f83381b;
            if (qVar == m0.K) {
                if (m0Var.equals(m0.f83366q)) {
                    return BigDecimal.ZERO;
                }
                if (m0Var.f83376b == 24) {
                    return m0.f83362m;
                }
                add = BigDecimal.valueOf(m0Var.f83376b).add(b(BigDecimal.valueOf(m0Var.f83377c), m0.f83359j)).add(b(BigDecimal.valueOf(m0Var.f83378d), m0.f83360k)).add(b(BigDecimal.valueOf(m0Var.f83379e), m0.f83360k.multiply(m0.f83361l)));
            } else if (qVar == m0.L) {
                if (m0Var.S0()) {
                    return BigDecimal.ZERO;
                }
                add = BigDecimal.valueOf(m0Var.f83377c).add(b(BigDecimal.valueOf(m0Var.f83378d), m0.f83359j)).add(b(BigDecimal.valueOf(m0Var.f83379e), m0.f83359j.multiply(m0.f83361l)));
            } else {
                if (qVar != m0.M) {
                    throw new UnsupportedOperationException(this.f83381b.name());
                }
                if (m0Var.T0()) {
                    return BigDecimal.ZERO;
                }
                add = BigDecimal.valueOf(m0Var.f83378d).add(b(BigDecimal.valueOf(m0Var.f83379e), m0.f83361l));
            }
            return com.google.android.gms.internal.measurement.a.a(add.setScale(15, RoundingMode.FLOOR));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean j(m0 m0Var, BigDecimal bigDecimal) {
            net.time4j.engine.q<BigDecimal> qVar;
            if (bigDecimal == null) {
                return false;
            }
            return (m0Var.f83376b == 24 && ((qVar = this.f83381b) == m0.L || qVar == m0.M)) ? BigDecimal.ZERO.compareTo(bigDecimal) == 0 : BigDecimal.ZERO.compareTo(bigDecimal) <= 0 && this.f83382c.compareTo(bigDecimal) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public m0 withValue(m0 m0Var, BigDecimal bigDecimal, boolean z4) {
            int i4;
            long j4;
            int i5;
            int i6;
            int i7;
            int i10;
            if (bigDecimal == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鞯\u0001"));
            }
            net.time4j.engine.q<BigDecimal> qVar = this.f83381b;
            if (qVar == m0.K) {
                RoundingMode roundingMode = RoundingMode.FLOOR;
                BigDecimal scale = bigDecimal.setScale(0, roundingMode);
                BigDecimal multiply = bigDecimal.subtract(scale).multiply(m0.f83359j);
                BigDecimal scale2 = multiply.setScale(0, roundingMode);
                BigDecimal multiply2 = multiply.subtract(scale2).multiply(m0.f83359j);
                BigDecimal scale3 = multiply2.setScale(0, roundingMode);
                j4 = scale.longValueExact();
                i5 = scale2.intValue();
                i4 = scale3.intValue();
                i6 = k(multiply2.subtract(scale3));
            } else if (qVar == m0.L) {
                RoundingMode roundingMode2 = RoundingMode.FLOOR;
                BigDecimal scale4 = bigDecimal.setScale(0, roundingMode2);
                BigDecimal multiply3 = bigDecimal.subtract(scale4).multiply(m0.f83359j);
                BigDecimal scale5 = multiply3.setScale(0, roundingMode2);
                i4 = scale5.intValue();
                int k4 = k(multiply3.subtract(scale5));
                long longValueExact = scale4.longValueExact();
                long j5 = m0Var.f83376b;
                if (z4) {
                    long b5 = net.time4j.base.c.b(longValueExact, 60) + j5;
                    i7 = net.time4j.base.c.d(longValueExact, 60);
                    j4 = b5;
                } else {
                    m0.A0(longValueExact);
                    i7 = (int) longValueExact;
                    j4 = j5;
                }
                i5 = i7;
                i6 = k4;
            } else {
                if (qVar != m0.M) {
                    throw new UnsupportedOperationException(this.f83381b.name());
                }
                BigDecimal scale6 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                int k5 = k(bigDecimal.subtract(scale6));
                long longValueExact2 = scale6.longValueExact();
                long j6 = m0Var.f83376b;
                int i11 = m0Var.f83377c;
                if (z4) {
                    int d5 = net.time4j.base.c.d(longValueExact2, 60);
                    long b6 = net.time4j.base.c.b(longValueExact2, 60) + i11;
                    long b7 = net.time4j.base.c.b(b6, 60) + j6;
                    i11 = net.time4j.base.c.d(b6, 60);
                    i4 = d5;
                    j4 = b7;
                } else {
                    m0.C0(longValueExact2);
                    i4 = (int) longValueExact2;
                    j4 = j6;
                }
                i5 = i11;
                i6 = k5;
            }
            if (z4) {
                i10 = net.time4j.base.c.d(j4, 24);
                if (j4 > 0 && (i10 | i5 | i4 | i6) == 0) {
                    return m0.f83367r;
                }
            } else {
                if (j4 < 0 || j4 > 24) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("鞮\u0001") + bigDecimal);
                }
                i10 = (int) j4;
            }
            return m0.d1(i10, i5, i4, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlainTime.java */
    static class c implements net.time4j.engine.o0<m0> {

        /* renamed from: a, reason: collision with root package name */
        private final j f83383a;

        /* synthetic */ c(j jVar, a aVar) {
            this(jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static m e(m0 m0Var, long j4, j jVar) {
            return (j4 != 0 || m0Var.f83376b >= 24) ? (m) g(m.class, jVar, m0Var, j4) : new m(0L, m0Var);
        }

        private static <R> R g(Class<R> cls, j jVar, m0 m0Var, long j4) {
            long f4;
            int i4 = m0Var.f83377c;
            int i5 = m0Var.f83378d;
            int i6 = m0Var.f83379e;
            switch (a.f83380a[jVar.ordinal()]) {
                case 1:
                    f4 = net.time4j.base.c.f(m0Var.f83376b, j4);
                    break;
                case 2:
                    long f5 = net.time4j.base.c.f(m0Var.f83377c, j4);
                    f4 = net.time4j.base.c.f(m0Var.f83376b, net.time4j.base.c.b(f5, 60));
                    i4 = net.time4j.base.c.d(f5, 60);
                    break;
                case 3:
                    long f6 = net.time4j.base.c.f(m0Var.f83378d, j4);
                    long f7 = net.time4j.base.c.f(m0Var.f83377c, net.time4j.base.c.b(f6, 60));
                    f4 = net.time4j.base.c.f(m0Var.f83376b, net.time4j.base.c.b(f7, 60));
                    int d5 = net.time4j.base.c.d(f7, 60);
                    i5 = net.time4j.base.c.d(f6, 60);
                    i4 = d5;
                    break;
                case 4:
                    return (R) g(cls, j.NANOS, m0Var, net.time4j.base.c.i(j4, 1000000L));
                case 5:
                    return (R) g(cls, j.NANOS, m0Var, net.time4j.base.c.i(j4, 1000L));
                case 6:
                    long f10 = net.time4j.base.c.f(m0Var.f83379e, j4);
                    long f11 = net.time4j.base.c.f(m0Var.f83378d, net.time4j.base.c.b(f10, 1000000000));
                    long f12 = net.time4j.base.c.f(m0Var.f83377c, net.time4j.base.c.b(f11, 60));
                    f4 = net.time4j.base.c.f(m0Var.f83376b, net.time4j.base.c.b(f12, 60));
                    int d6 = net.time4j.base.c.d(f12, 60);
                    int d7 = net.time4j.base.c.d(f11, 60);
                    int d10 = net.time4j.base.c.d(f10, 1000000000);
                    i4 = d6;
                    i5 = d7;
                    i6 = d10;
                    break;
                default:
                    throw new UnsupportedOperationException(jVar.name());
            }
            int d11 = net.time4j.base.c.d(f4, 24);
            m0 d12 = (((d11 | i4) | i5) | i6) == 0 ? (j4 <= 0 || cls != m0.class) ? m0.f83366q : m0.f83367r : m0.d1(d11, i4, i5, i6);
            return cls == m0.class ? cls.cast(d12) : cls.cast(new m(net.time4j.base.c.b(f4, 24), d12));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public m0 b(m0 m0Var, long j4) {
            return j4 == 0 ? m0Var : (m0) g(m0.class, this.f83383a, m0Var, j4);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public long a(m0 m0Var, m0 m0Var2) {
            long j4;
            long O0 = m0Var2.O0() - m0Var.O0();
            switch (a.f83380a[this.f83383a.ordinal()]) {
                case 1:
                    j4 = 3600000000000L;
                    break;
                case 2:
                    j4 = 60000000000L;
                    break;
                case 3:
                    j4 = 1000000000;
                    break;
                case 4:
                    j4 = 1000000;
                    break;
                case 5:
                    j4 = 1000;
                    break;
                case 6:
                    j4 = 1;
                    break;
                default:
                    throw new UnsupportedOperationException(this.f83383a.name());
            }
            return O0 / j4;
        }

        private c(j jVar) {
            this.f83383a = jVar;
        }
    }

    /* compiled from: PlainTime.java */
    private static class d implements net.time4j.engine.a0<m0, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<Integer> f83384b;

        /* renamed from: c, reason: collision with root package name */
        private final int f83385c;

        /* renamed from: d, reason: collision with root package name */
        private final int f83386d;

        /* renamed from: e, reason: collision with root package name */
        private final int f83387e;

        d(net.time4j.engine.q<Integer> qVar, int i4, int i5) {
            this.f83384b = qVar;
            if (qVar instanceof w) {
                this.f83385c = ((w) qVar).F();
            } else {
                this.f83385c = -1;
            }
            this.f83386d = i4;
            this.f83387e = i5;
        }

        private net.time4j.engine.q<?> b(m0 m0Var) {
            switch (this.f83385c) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return m0.A;
                case 6:
                case 7:
                    return m0.C;
                case 8:
                case 9:
                    return m0.G;
                default:
                    return null;
            }
        }

        private static boolean j(m0 m0Var) {
            return m0Var.f83376b < 12 || m0Var.f83376b == 24;
        }

        private m0 m(m0 m0Var, int i4) {
            net.time4j.engine.q<Integer> qVar = this.f83384b;
            if (qVar == m0.f83375z || qVar == m0.f83374y || qVar == m0.f83373x) {
                return m0Var.W(net.time4j.base.c.l(i4, ((Integer) m0Var.r(qVar)).intValue()), j.HOURS);
            }
            if (qVar == m0.A) {
                return m0Var.W(net.time4j.base.c.l(i4, m0Var.f83377c), j.MINUTES);
            }
            if (qVar == m0.C) {
                return m0Var.W(net.time4j.base.c.l(i4, m0Var.f83378d), j.SECONDS);
            }
            if (qVar == m0.E) {
                return m0Var.W(net.time4j.base.c.l(i4, ((Integer) m0Var.r(r1)).intValue()), j.MILLIS);
            }
            if (qVar == m0.F) {
                return m0Var.W(net.time4j.base.c.l(i4, ((Integer) m0Var.r(r1)).intValue()), j.MICROS);
            }
            if (qVar == m0.G) {
                return m0Var.W(net.time4j.base.c.l(i4, m0Var.f83379e), j.NANOS);
            }
            if (qVar == m0.H) {
                int c5 = net.time4j.base.c.c(i4, 86400000);
                int i5 = m0Var.f83379e % 1000000;
                return (c5 == 0 && i5 == 0) ? i4 > 0 ? m0.f83367r : m0.f83366q : m0.F0(c5, i5);
            }
            if (qVar == m0.B) {
                int c6 = net.time4j.base.c.c(i4, 1440);
                return (c6 == 0 && m0Var.T0()) ? i4 > 0 ? m0.f83367r : m0.f83366q : withValue(m0Var, Integer.valueOf(c6), false);
            }
            if (qVar != m0.D) {
                throw new UnsupportedOperationException(this.f83384b.name());
            }
            int c7 = net.time4j.base.c.c(i4, MMKV.ExpireInDay);
            return (c7 == 0 && m0Var.f83379e == 0) ? i4 > 0 ? m0.f83367r : m0.f83366q : withValue(m0Var, Integer.valueOf(c7), false);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(m0 m0Var) {
            return b(m0Var);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(m0 m0Var) {
            return b(m0Var);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(m0 m0Var) {
            if (m0Var.f83376b == 24) {
                switch (this.f83385c) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return 0;
                }
            }
            return m0Var.P0(this.f83384b) ? Integer.valueOf(this.f83387e - 1) : Integer.valueOf(this.f83387e);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(m0 m0Var) {
            return Integer.valueOf(this.f83386d);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(m0 m0Var) {
            int i4 = 12;
            switch (this.f83385c) {
                case 1:
                    int i5 = m0Var.f83376b % 12;
                    if (i5 != 0) {
                        i4 = i5;
                        break;
                    }
                    break;
                case 2:
                    i4 = m0Var.f83376b % com.google.common.base.c.B;
                    if (i4 == 0) {
                        i4 = 24;
                        break;
                    }
                    break;
                case 3:
                    i4 = m0Var.f83376b % 12;
                    break;
                case 4:
                    i4 = m0Var.f83376b % com.google.common.base.c.B;
                    break;
                case 5:
                    i4 = m0Var.f83376b;
                    break;
                case 6:
                    i4 = m0Var.f83377c;
                    break;
                case 7:
                    i4 = (m0Var.f83376b * 60) + m0Var.f83377c;
                    break;
                case 8:
                    i4 = m0Var.f83378d;
                    break;
                case 9:
                    i4 = (m0Var.f83377c * 60) + (m0Var.f83376b * com.google.common.base.c.f54872r) + m0Var.f83378d;
                    break;
                case 10:
                    i4 = m0Var.f83379e / 1000000;
                    break;
                case 11:
                    i4 = m0Var.f83379e / 1000;
                    break;
                case 12:
                    i4 = m0Var.f83379e;
                    break;
                case 13:
                    i4 = (int) (m0Var.O0() / 1000000);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f83384b.name());
            }
            return Integer.valueOf(i4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean j(m0 m0Var, Integer num) {
            int intValue;
            int i4;
            if (num == null || (intValue = num.intValue()) < this.f83386d || intValue > (i4 = this.f83387e)) {
                return false;
            }
            if (intValue == i4) {
                int i5 = this.f83385c;
                if (i5 == 5) {
                    return m0Var.S0();
                }
                if (i5 == 7) {
                    return m0Var.T0();
                }
                if (i5 == 9) {
                    return m0Var.f83379e == 0;
                }
                if (i5 == 13) {
                    return m0Var.f83379e % 1000000 == 0;
                }
            }
            if (m0Var.f83376b == 24) {
                switch (this.f83385c) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return intValue == 0;
                }
            }
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
        
            if (j(r7) != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        
            r8 = r8 + 12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        
            if (j(r7) != false) goto L22;
         */
        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.m0 withValue(net.time4j.m0 r7, java.lang.Integer r8, boolean r9) {
            /*
                r6 = this;
                if (r8 == 0) goto La8
                if (r9 == 0) goto Ld
                int r8 = r8.intValue()
                net.time4j.m0 r7 = r6.m(r7, r8)
                return r7
            Ld:
                boolean r9 = r6.isValid(r7, r8)
                if (r9 == 0) goto L8f
                byte r9 = net.time4j.m0.t0(r7)
                byte r0 = net.time4j.m0.u0(r7)
                byte r1 = net.time4j.m0.v0(r7)
                int r2 = net.time4j.m0.a0(r7)
                int r8 = r8.intValue()
                int r3 = r6.f83385c
                r4 = 0
                r5 = 1000000(0xf4240, float:1.401298E-39)
                switch(r3) {
                    case 1: goto L7e;
                    case 2: goto L78;
                    case 3: goto L6e;
                    case 4: goto L6c;
                    case 5: goto L6c;
                    case 6: goto L6a;
                    case 7: goto L65;
                    case 8: goto L63;
                    case 9: goto L5a;
                    case 10: goto L53;
                    case 11: goto L48;
                    case 12: goto L46;
                    case 13: goto L3c;
                    default: goto L30;
                }
            L30:
                java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
                net.time4j.engine.q<java.lang.Integer> r8 = r6.f83384b
                java.lang.String r8 = r8.name()
                r7.<init>(r8)
                throw r7
            L3c:
                int r7 = net.time4j.m0.a0(r7)
                int r7 = r7 % r5
                net.time4j.m0 r7 = net.time4j.m0.b0(r8, r7)
                return r7
            L46:
                r2 = r8
                goto L8a
            L48:
                int r8 = r8 * 1000
                int r7 = net.time4j.m0.a0(r7)
                int r7 = r7 % 1000
            L50:
                int r2 = r7 + r8
                goto L8a
            L53:
                int r8 = r8 * r5
                int r7 = net.time4j.m0.a0(r7)
                int r7 = r7 % r5
                goto L50
            L5a:
                int r9 = r8 / 3600
                int r8 = r8 % 3600
                int r0 = r8 / 60
                int r1 = r8 % 60
                goto L8a
            L63:
                r1 = r8
                goto L8a
            L65:
                int r9 = r8 / 60
                int r0 = r8 % 60
                goto L8a
            L6a:
                r0 = r8
                goto L8a
            L6c:
                r9 = r8
                goto L8a
            L6e:
                boolean r7 = j(r7)
                if (r7 == 0) goto L75
                goto L6c
            L75:
                int r8 = r8 + 12
                goto L6c
            L78:
                r7 = 24
                if (r8 != r7) goto L6c
                r9 = r4
                goto L8a
            L7e:
                r9 = 12
                if (r8 != r9) goto L83
                r8 = r4
            L83:
                boolean r7 = j(r7)
                if (r7 == 0) goto L75
                goto L6c
            L8a:
                net.time4j.m0 r7 = net.time4j.m0.d1(r9, r0, r1, r2)
                return r7
            L8f:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r0 = "鞰\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r9.<init>(r0)
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                r7.<init>(r8)
                throw r7
            La8:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "鞱\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.m0.d.withValue(net.time4j.m0, java.lang.Integer, boolean):net.time4j.m0");
        }
    }

    /* compiled from: PlainTime.java */
    private static class e implements net.time4j.engine.a0<m0, Long> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<Long> f83388b;

        /* renamed from: c, reason: collision with root package name */
        private final long f83389c;

        /* renamed from: d, reason: collision with root package name */
        private final long f83390d;

        e(net.time4j.engine.q<Long> qVar, long j4, long j5) {
            this.f83388b = qVar;
            this.f83389c = j4;
            this.f83390d = j5;
        }

        private m0 k(m0 m0Var, long j4) {
            if (this.f83388b != m0.I) {
                long J0 = m0.J0(j4, 86400000000000L);
                return (J0 != 0 || j4 <= 0) ? m0.G0(J0) : m0.f83367r;
            }
            long J02 = m0.J0(j4, 86400000000L);
            int i4 = m0Var.f83379e % 1000;
            return (J02 == 0 && i4 == 0 && j4 > 0) ? m0.f83367r : m0.E0(J02, i4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(m0 m0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(m0 m0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long getMaximum(m0 m0Var) {
            return (this.f83388b != m0.I || m0Var.f83379e % 1000 == 0) ? Long.valueOf(this.f83390d) : Long.valueOf(this.f83390d - 1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long getMinimum(m0 m0Var) {
            return Long.valueOf(this.f83389c);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Long getValue(m0 m0Var) {
            return Long.valueOf(this.f83388b == m0.I ? m0Var.O0() / 1000 : m0Var.O0());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(m0 m0Var, Long l4) {
            if (l4 == null) {
                return false;
            }
            return (this.f83388b == m0.I && l4.longValue() == this.f83390d) ? m0Var.f83379e % 1000 == 0 : this.f83389c <= l4.longValue() && l4.longValue() <= this.f83390d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public m0 withValue(m0 m0Var, Long l4, boolean z4) {
            if (l4 == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鞳\u0001"));
            }
            if (z4) {
                return k(m0Var, l4.longValue());
            }
            if (isValid(m0Var, l4)) {
                long longValue = l4.longValue();
                return this.f83388b == m0.I ? m0.E0(longValue, m0Var.f83379e % 1000) : m0.G0(longValue);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鞲\u0001") + l4);
        }
    }

    /* compiled from: PlainTime.java */
    private static class f implements net.time4j.engine.u<m0> {
        private f() {
        }

        private static void f(net.time4j.engine.r<?> rVar, String str) {
            net.time4j.engine.p0 p0Var = net.time4j.engine.p0.ERROR_MESSAGE;
            if (rVar.G(p0Var, str)) {
                rVar.M(p0Var, str);
            }
        }

        private static int i(net.time4j.engine.r<?> rVar) {
            int l4 = rVar.l(m0.f83374y);
            if (l4 != Integer.MIN_VALUE) {
                return l4;
            }
            int l5 = rVar.l(m0.f83372w);
            if (l5 == 0) {
                return -1;
            }
            if (l5 == 24) {
                return 0;
            }
            if (l5 != Integer.MIN_VALUE) {
                return l5;
            }
            m1<c0> m1Var = m0.f83370u;
            if (rVar.w(m1Var)) {
                c0 c0Var = (c0) rVar.r(m1Var);
                int l6 = rVar.l(m0.f83371v);
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 == 0) {
                        return c0Var == c0.AM ? -1 : -2;
                    }
                    int i4 = l6 != 12 ? l6 : 0;
                    return c0Var == c0.AM ? i4 : i4 + 12;
                }
                int l7 = rVar.l(m0.f83373x);
                if (l7 != Integer.MIN_VALUE) {
                    return c0Var == c0.AM ? l7 : l7 + 12;
                }
            }
            return Integer.MIN_VALUE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static m0 j(net.time4j.engine.r<?> rVar) {
            int intValue;
            int intValue2;
            q0<Long, m0> q0Var = m0.J;
            if (rVar.w(q0Var)) {
                long longValue = ((Long) rVar.r(q0Var)).longValue();
                if (longValue >= 0 && longValue <= 86400000000000L) {
                    return m0.G0(longValue);
                }
                f(rVar, androidx.collection.p0.a(ProtectedSandApp.s("鞴\u0001"), longValue));
                return null;
            }
            q0<Long, m0> q0Var2 = m0.I;
            if (rVar.w(q0Var2)) {
                q0<Integer, m0> q0Var3 = m0.G;
                return m0.E0(((Long) rVar.r(q0Var2)).longValue(), rVar.w(q0Var3) ? ((Integer) rVar.r(q0Var3)).intValue() % 1000 : 0);
            }
            q0<Integer, m0> q0Var4 = m0.H;
            if (rVar.w(q0Var4)) {
                q0<Integer, m0> q0Var5 = m0.G;
                if (rVar.w(q0Var5)) {
                    int intValue3 = ((Integer) rVar.r(q0Var5)).intValue();
                    if (intValue3 < 0 || intValue3 >= 1000000000) {
                        f(rVar, android.support.v4.media.a.a(ProtectedSandApp.s("鞵\u0001"), intValue3));
                        return null;
                    }
                    r3 = intValue3 % 1000000;
                } else {
                    q0<Integer, m0> q0Var6 = m0.F;
                    if (rVar.w(q0Var6)) {
                        int intValue4 = ((Integer) rVar.r(q0Var6)).intValue();
                        if (intValue4 < 0 || intValue4 >= 1000000) {
                            f(rVar, android.support.v4.media.a.a(ProtectedSandApp.s("鞶\u0001"), intValue4));
                            return null;
                        }
                        r3 = intValue4 % 1000;
                    }
                }
                int intValue5 = ((Integer) rVar.r(q0Var4)).intValue();
                if (intValue5 >= 0 && intValue5 <= 86400000) {
                    return m0.F0(intValue5, r3);
                }
                f(rVar, android.support.v4.media.a.a(ProtectedSandApp.s("鞷\u0001"), intValue5));
                return null;
            }
            q0<Integer, m0> q0Var7 = m0.D;
            if (rVar.w(q0Var7)) {
                q0<Integer, m0> q0Var8 = m0.G;
                if (rVar.w(q0Var8)) {
                    intValue2 = ((Integer) rVar.r(q0Var8)).intValue();
                } else {
                    q0<Integer, m0> q0Var9 = m0.F;
                    if (rVar.w(q0Var9)) {
                        intValue2 = ((Integer) rVar.r(q0Var9)).intValue() * 1000;
                    } else {
                        q0<Integer, m0> q0Var10 = m0.E;
                        intValue2 = rVar.w(q0Var10) ? ((Integer) rVar.r(q0Var10)).intValue() * 1000000 : 0;
                    }
                }
                return (m0) m0.d1(0, 0, 0, intValue2).M(q0Var7, rVar.r(q0Var7));
            }
            q0<Integer, m0> q0Var11 = m0.B;
            if (!rVar.w(q0Var11)) {
                return null;
            }
            q0<Integer, m0> q0Var12 = m0.G;
            if (rVar.w(q0Var12)) {
                intValue = ((Integer) rVar.r(q0Var12)).intValue();
            } else {
                q0<Integer, m0> q0Var13 = m0.F;
                if (rVar.w(q0Var13)) {
                    intValue = ((Integer) rVar.r(q0Var13)).intValue() * 1000;
                } else {
                    q0<Integer, m0> q0Var14 = m0.E;
                    intValue = rVar.w(q0Var14) ? ((Integer) rVar.r(q0Var14)).intValue() * 1000000 : 0;
                }
            }
            q0<Integer, m0> q0Var15 = m0.C;
            return (m0) m0.d1(0, 0, rVar.w(q0Var15) ? ((Integer) rVar.r(q0Var15)).intValue() : 0, intValue).M(q0Var11, rVar.r(q0Var11));
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m0 o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.l lVar;
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                lVar = net.time4j.tz.l.c0((net.time4j.tz.k) dVar.a(cVar));
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                lVar = net.time4j.tz.l.e0();
            }
            ?? c5 = eVar.c();
            return m0.K0(c5, lVar.I(c5));
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public m0 e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            if (rVar instanceof net.time4j.base.f) {
                return n0.h0().e(rVar, dVar, z4, z5).m0();
            }
            net.time4j.engine.q<?> qVar = m0.f83368s;
            if (rVar.w(qVar)) {
                return (m0) rVar.r(qVar);
            }
            m1<BigDecimal> m1Var = m0.K;
            if (rVar.w(m1Var)) {
                return m0.f1((BigDecimal) rVar.r(m1Var));
            }
            int l4 = rVar.l(m0.f83375z);
            if (l4 == Integer.MIN_VALUE) {
                l4 = i(rVar);
                if (l4 == Integer.MIN_VALUE) {
                    return j(rVar);
                }
                if (l4 == -1 || l4 == -2) {
                    if (!z4) {
                        f(rVar, ProtectedSandApp.s("鞹\u0001"));
                        return null;
                    }
                    l4 = l4 == -1 ? 0 : 12;
                } else if (l4 == 24 && !z4) {
                    f(rVar, ProtectedSandApp.s("鞸\u0001"));
                    return null;
                }
            }
            m1<BigDecimal> m1Var2 = m0.L;
            if (rVar.w(m1Var2)) {
                return (m0) m0.Q.withValue(m0.a1(l4), rVar.r(m1Var2), false);
            }
            int l5 = rVar.l(m0.A);
            if (l5 == Integer.MIN_VALUE) {
                l5 = 0;
            }
            m1<BigDecimal> m1Var3 = m0.M;
            if (rVar.w(m1Var3)) {
                return (m0) m0.R.withValue(m0.b1(l4, l5), rVar.r(m1Var3), false);
            }
            int l6 = rVar.l(m0.C);
            if (l6 == Integer.MIN_VALUE) {
                l6 = 0;
            }
            int l7 = rVar.l(m0.G);
            if (l7 == Integer.MIN_VALUE) {
                int l10 = rVar.l(m0.F);
                if (l10 == Integer.MIN_VALUE) {
                    int l11 = rVar.l(m0.E);
                    l7 = l11 == Integer.MIN_VALUE ? 0 : net.time4j.base.c.h(l11, 1000000);
                } else {
                    l7 = net.time4j.base.c.h(l10, 1000);
                }
            }
            if (z4) {
                long f4 = net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.f(net.time4j.base.c.f(net.time4j.base.c.i(l4, 3600L), net.time4j.base.c.i(l5, 60L)), l6), 1000000000L), l7);
                long J0 = m0.J0(f4, 86400000000000L);
                long I0 = m0.I0(f4, 86400000000000L);
                if (I0 != 0) {
                    net.time4j.engine.q<Long> qVar2 = a0.f81813h;
                    if (rVar.E(qVar2, I0)) {
                        rVar.L(qVar2, I0);
                    }
                }
                return (J0 != 0 || I0 <= 0) ? m0.G0(J0) : m0.f83367r;
            }
            if ((l4 >= 0 && l5 >= 0 && l6 >= 0 && l7 >= 0 && l4 == 24 && (l5 | l6 | l7) == 0) || (l4 < 24 && l5 <= 59 && l6 <= 59 && l7 <= 1000000000)) {
                return m0.e1(l4, l5, l6, l7, false);
            }
            f(rVar, ProtectedSandApp.s("鞺\u0001"));
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return l0.T0().g();
        }

        @Override // net.time4j.engine.u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(m0 m0Var, net.time4j.engine.d dVar) {
            return m0Var;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.format.b.w(net.time4j.format.e.ofStyle(zVar.getStyleValue()), locale);
        }

        f(a aVar) {
        }
    }

    /* compiled from: PlainTime.java */
    private static class g implements net.time4j.engine.a0<m0, c0> {
        private g() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(m0 m0Var) {
            return m0.f83373x;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(m0 m0Var) {
            return m0.f83373x;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public c0 getMaximum(m0 m0Var) {
            return c0.PM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public c0 getMinimum(m0 m0Var) {
            return c0.AM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public c0 getValue(m0 m0Var) {
            return c0.ofHour(m0Var.f83376b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(m0 m0Var, c0 c0Var) {
            return c0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public m0 withValue(m0 m0Var, c0 c0Var, boolean z4) {
            int i4 = m0Var.f83376b == 24 ? 0 : m0Var.f83376b;
            if (c0Var == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鞻\u0001"));
            }
            if (c0Var == c0.AM) {
                if (i4 >= 12) {
                    i4 -= 12;
                }
            } else if (c0Var == c0.PM && i4 < 12) {
                i4 += 12;
            }
            return m0.d1(i4, m0Var.f83377c, m0Var.f83378d, m0Var.f83379e);
        }

        g(a aVar) {
        }
    }

    /* compiled from: PlainTime.java */
    private static class h implements net.time4j.engine.a0<m0, j> {
        private h() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(m0 m0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(m0 m0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public j getMaximum(m0 m0Var) {
            return j.NANOS;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public j getMinimum(m0 m0Var) {
            return j.HOURS;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public j getValue(m0 m0Var) {
            return m0Var.f83379e != 0 ? m0Var.f83379e % 1000000 == 0 ? j.MILLIS : m0Var.f83379e % 1000 == 0 ? j.MICROS : j.NANOS : m0Var.f83378d != 0 ? j.SECONDS : m0Var.f83377c != 0 ? j.MINUTES : j.HOURS;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(m0 m0Var, j jVar) {
            return jVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public m0 withValue(m0 m0Var, j jVar, boolean z4) {
            if (jVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鞼\u0001"));
            }
            if (jVar.ordinal() >= getValue(m0Var).ordinal()) {
                return m0Var;
            }
            switch (a.f83380a[jVar.ordinal()]) {
                case 1:
                    return m0.a1(m0Var.f83376b);
                case 2:
                    return m0.b1(m0Var.f83376b, m0Var.f83377c);
                case 3:
                    return m0.c1(m0Var.f83376b, m0Var.f83377c, m0Var.f83378d);
                case 4:
                    return m0.d1(m0Var.f83376b, m0Var.f83377c, m0Var.f83378d, (m0Var.f83379e / 1000000) * 1000000);
                case 5:
                    return m0.d1(m0Var.f83376b, m0Var.f83377c, m0Var.f83378d, (m0Var.f83379e / 1000) * 1000);
                case 6:
                    return m0Var;
                default:
                    throw new UnsupportedOperationException(jVar.name());
            }
        }

        h(a aVar) {
        }
    }

    /* compiled from: PlainTime.java */
    private static class i implements net.time4j.engine.a0<m0, m0> {
        private i() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(m0 m0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(m0 m0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public m0 getMaximum(m0 m0Var) {
            return m0.f83367r;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public m0 getMinimum(m0 m0Var) {
            return m0.f83366q;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public m0 getValue(m0 m0Var) {
            return m0Var;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(m0 m0Var, m0 m0Var2) {
            return m0Var2 != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public m0 withValue(m0 m0Var, m0 m0Var2, boolean z4) {
            if (m0Var2 != null) {
                return m0Var2;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鞽\u0001"));
        }

        i(a aVar) {
        }
    }

    static {
        f83355f = Boolean.getBoolean(ProtectedSandApp.s("鞾\u0001")) ? '.' : ',';
        f83359j = new BigDecimal(60);
        f83360k = new BigDecimal(MMKV.ExpireInHour);
        f83361l = new BigDecimal(1000000000);
        f83362m = new BigDecimal(ProtectedSandApp.s("鞿\u0001"));
        f83363n = new BigDecimal(ProtectedSandApp.s("韀\u0001"));
        f83364o = new BigDecimal(ProtectedSandApp.s("韁\u0001"));
        f83365p = new m0[25];
        for (int i4 = 0; i4 <= 24; i4++) {
            f83365p[i4] = new m0(i4, 0, 0, 0, false);
        }
        m0[] m0VarArr = f83365p;
        m0 m0Var = m0VarArr[0];
        f83366q = m0Var;
        m0 m0Var2 = m0VarArr[24];
        f83367r = m0Var2;
        y0 y0Var = y0.f83720b;
        f83368s = y0Var;
        f83369t = y0Var;
        net.time4j.d dVar = net.time4j.d.AM_PM_OF_DAY;
        f83370u = dVar;
        w B2 = w.B(ProtectedSandApp.s("韂\u0001"), false);
        f83371v = B2;
        w B3 = w.B(ProtectedSandApp.s("韃\u0001"), true);
        f83372w = B3;
        w C2 = w.C(ProtectedSandApp.s("韄\u0001"), 3, 0, 11, 'K');
        f83373x = C2;
        w C3 = w.C(ProtectedSandApp.s("韅\u0001"), 4, 0, 23, 'H');
        f83374y = C3;
        w C4 = w.C(ProtectedSandApp.s("韆\u0001"), 5, 0, 23, 'H');
        f83375z = C4;
        w C5 = w.C(ProtectedSandApp.s("韇\u0001"), 6, 0, 59, 'm');
        A = C5;
        w C6 = w.C(ProtectedSandApp.s("韈\u0001"), 7, 0, 1439, (char) 0);
        B = C6;
        w C7 = w.C(ProtectedSandApp.s("韉\u0001"), 8, 0, 59, 's');
        C = C7;
        w C8 = w.C(ProtectedSandApp.s("韊\u0001"), 9, 0, 86399, (char) 0);
        D = C8;
        w C9 = w.C(ProtectedSandApp.s("韋\u0001"), 10, 0, 999, (char) 0);
        E = C9;
        w C10 = w.C(ProtectedSandApp.s("韌\u0001"), 11, 0, 999999, (char) 0);
        F = C10;
        w C11 = w.C(ProtectedSandApp.s("韍\u0001"), 12, 0, 999999999, 'S');
        G = C11;
        w C12 = w.C(ProtectedSandApp.s("韎\u0001"), 13, 0, 86399999, 'A');
        H = C12;
        a0 B4 = a0.B(ProtectedSandApp.s("韏\u0001"), 0L, 86399999999L);
        I = B4;
        a0 B5 = a0.B(ProtectedSandApp.s("韐\u0001"), 0L, 86399999999999L);
        J = B5;
        o oVar = new o(ProtectedSandApp.s("韑\u0001"), f83363n);
        K = oVar;
        BigDecimal bigDecimal = f83364o;
        o oVar2 = new o(ProtectedSandApp.s("韒\u0001"), bigDecimal);
        L = oVar2;
        o oVar3 = new o(ProtectedSandApp.s("韓\u0001"), bigDecimal);
        M = oVar3;
        net.time4j.engine.q<j> qVar = o0.f83420e;
        N = qVar;
        HashMap hashMap = new HashMap();
        H0(hashMap, y0Var);
        H0(hashMap, dVar);
        H0(hashMap, B2);
        H0(hashMap, B3);
        H0(hashMap, C2);
        H0(hashMap, C3);
        H0(hashMap, C4);
        H0(hashMap, C5);
        H0(hashMap, C6);
        H0(hashMap, C7);
        H0(hashMap, C8);
        H0(hashMap, C9);
        H0(hashMap, C10);
        H0(hashMap, C11);
        H0(hashMap, C12);
        H0(hashMap, B4);
        H0(hashMap, B5);
        H0(hashMap, oVar);
        H0(hashMap, oVar2);
        H0(hashMap, oVar3);
        O = Collections.unmodifiableMap(hashMap);
        b bVar = new b(oVar, f83362m);
        P = bVar;
        b bVar2 = new b(oVar2, bigDecimal);
        Q = bVar2;
        b bVar3 = new b(oVar3, bigDecimal);
        R = bVar3;
        j0.c f4 = j0.c.n(y.class, m0.class, new f(), m0Var, m0Var2).f(y0Var, new i()).f(dVar, new g());
        d dVar2 = new d(B2, 1, 12);
        j jVar = j.HOURS;
        j0.c g4 = f4.g(B2, dVar2, jVar).g(B3, new d(B3, 1, 24), jVar).g(C2, new d(C2, 0, 11), jVar).g(C3, new d(C3, 0, 23), jVar).g(C4, new d(C4, 0, 24), jVar);
        d dVar3 = new d(C5, 0, 59);
        j jVar2 = j.MINUTES;
        j0.c g5 = g4.g(C5, dVar3, jVar2).g(C6, new d(C6, 0, 1440), jVar2);
        d dVar4 = new d(C7, 0, 59);
        j jVar3 = j.SECONDS;
        j0.c g6 = g5.g(C7, dVar4, jVar3).g(C8, new d(C8, 0, MMKV.ExpireInDay), jVar3);
        d dVar5 = new d(C9, 0, 999);
        j jVar4 = j.MILLIS;
        j0.c g7 = g6.g(C9, dVar5, jVar4);
        d dVar6 = new d(C10, 0, 999999);
        j jVar5 = j.MICROS;
        j0.c g10 = g7.g(C10, dVar6, jVar5);
        d dVar7 = new d(C11, 0, 999999999);
        j jVar6 = j.NANOS;
        j0.c f5 = g10.g(C11, dVar7, jVar6).g(C12, new d(C12, 0, 86400000), jVar4).g(B4, new e(B4, 0L, 86400000000L), jVar5).g(B5, new e(B5, 0L, 86400000000000L), jVar6).f(oVar, bVar).f(oVar2, bVar2).f(oVar3, bVar3).f(qVar, new h());
        j1(f5);
        k1(f5);
        X = f5.c();
    }

    private m0(int i4, int i5, int i6, int i7, boolean z4) {
        if (z4) {
            z0(i4);
            A0(i5);
            C0(i6);
            B0(i7);
            if (i4 == 24 && (i5 | i6 | i7) != 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("韔\u0001"));
            }
        }
        this.f83376b = (byte) i4;
        this.f83377c = (byte) i5;
        this.f83378d = (byte) i6;
        this.f83379e = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A0(long j4) {
        if (j4 < 0 || j4 > 59) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("韕\u0001"), j4));
        }
    }

    private static void B0(int i4) {
        if (i4 < 0 || i4 >= 1000000000) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("韖\u0001"), i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C0(long j4) {
        if (j4 < 0 || j4 > 59) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("韗\u0001"), j4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m0 E0(long j4, int i4) {
        int i5 = (((int) (j4 % 1000000)) * 1000) + i4;
        int i6 = (int) (j4 / 1000000);
        int i7 = i6 % 60;
        int i10 = i6 / 60;
        return e1(i10 / 60, i10 % 60, i7, i5, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m0 F0(int i4, int i5) {
        int i6 = ((i4 % 1000) * 1000000) + i5;
        int i7 = i4 / 1000;
        int i10 = i7 % 60;
        int i11 = i7 / 60;
        return e1(i11 / 60, i11 % 60, i10, i6, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m0 G0(long j4) {
        int i4 = (int) (j4 % 1000000000);
        int i5 = (int) (j4 / 1000000000);
        int i6 = i5 % 60;
        int i7 = i5 / 60;
        return e1(i7 / 60, i7 % 60, i6, i4, true);
    }

    private static void H0(Map<String, Object> map, net.time4j.engine.q<?> qVar) {
        map.put(qVar.name(), qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long I0(long j4, long j5) {
        return j4 >= 0 ? j4 / j5 : ((j4 + 1) / j5) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long J0(long j4, long j5) {
        return j4 - (j5 * (j4 >= 0 ? j4 / j5 : ((j4 + 1) / j5) - 1));
    }

    static m0 K0(net.time4j.base.f fVar, net.time4j.tz.p pVar) {
        long j4 = fVar.j() + pVar.i();
        int h4 = pVar.h() + fVar.a();
        if (h4 < 0) {
            h4 += 1000000000;
            j4--;
        } else if (h4 >= 1000000000) {
            h4 -= 1000000000;
            j4++;
        }
        int d5 = net.time4j.base.c.d(j4, MMKV.ExpireInDay);
        int i4 = d5 % 60;
        int i5 = d5 / 60;
        return e1(i5 / 60, i5 % 60, i4, h4, true);
    }

    public static m0 L0(net.time4j.base.g gVar) {
        return gVar instanceof m0 ? (m0) gVar : gVar instanceof n0 ? ((n0) gVar).m0() : e1(gVar.u(), gVar.m(), gVar.h(), gVar.a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long O0() {
        return (this.f83376b * 3600000000000L) + (this.f83377c * 60000000000L) + (this.f83378d * 1000000000) + this.f83379e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S0() {
        return ((this.f83377c | this.f83378d) | this.f83379e) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T0() {
        return (this.f83378d | this.f83379e) == 0;
    }

    static Object W0(String str) {
        return O.get(str);
    }

    public static m0 X0() {
        return f83367r;
    }

    public static m0 Y0() {
        return f83366q;
    }

    public static m0 Z0() {
        return k1.g().e().I0();
    }

    public static m0 a1(int i4) {
        z0(i4);
        return f83365p[i4];
    }

    public static m0 b1(int i4, int i5) {
        return i5 == 0 ? a1(i4) : new m0(i4, i5, 0, 0, true);
    }

    public static m0 c1(int i4, int i5, int i6) {
        return (i5 | i6) == 0 ? a1(i4) : new m0(i4, i5, i6, 0, true);
    }

    public static m0 d1(int i4, int i5, int i6, int i7) {
        return e1(i4, i5, i6, i7, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m0 e1(int i4, int i5, int i6, int i7, boolean z4) {
        return ((i5 | i6) | i7) == 0 ? z4 ? a1(i4) : f83365p[i4] : new m0(i4, i5, i6, i7, z4);
    }

    public static m0 f1(BigDecimal bigDecimal) {
        return P.withValue(null, bigDecimal, false);
    }

    public static m0 g1(String str, net.time4j.format.t<m0> tVar) {
        try {
            return tVar.f(str);
        } catch (ParseException e4) {
            throw new ChronoException(e4.getMessage(), (Throwable) e4);
        }
    }

    static void i1(StringBuilder sb, int i4) {
        sb.append(f83355f);
        String num = Integer.toString(i4);
        int i5 = i4 % 1000000 == 0 ? 3 : i4 % 1000 == 0 ? 6 : 9;
        for (int length = num.length(); length < 9; length++) {
            sb.append('0');
        }
        int length2 = (num.length() + i5) - 9;
        for (int i6 = 0; i6 < length2; i6++) {
            sb.append(num.charAt(i6));
        }
    }

    private static void j1(j0.c<y, m0> cVar) {
        for (net.time4j.engine.s sVar : net.time4j.base.d.c().g(net.time4j.engine.s.class)) {
            if (sVar.d(m0.class)) {
                cVar.h(sVar);
            }
        }
        cVar.h(new n.c());
    }

    private static void k1(j0.c<y, m0> cVar) {
        Set<? extends y> allOf = EnumSet.allOf(j.class);
        for (j jVar : j.values()) {
            cVar.j(jVar, new c(jVar, null), jVar.getLength(), allOf);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("韘\u0001"));
    }

    private static void w0(int i4, StringBuilder sb) {
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
    }

    private Object writeReplace() {
        return new SPX(this, 2);
    }

    public static <S> net.time4j.engine.x<S> x0(net.time4j.engine.y<S, m0> yVar) {
        return new net.time4j.engine.g(yVar, X);
    }

    public static net.time4j.engine.j0<y, m0> y0() {
        return X;
    }

    private static void z0(long j4) {
        if (j4 < 0 || j4 > 24) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("韙\u0001"), j4));
        }
    }

    @Override // net.time4j.engine.m0, java.lang.Comparable
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public int compareTo(m0 m0Var) {
        int i4 = this.f83376b - m0Var.f83376b;
        if (i4 == 0 && (i4 = this.f83377c - m0Var.f83377c) == 0 && (i4 = this.f83378d - m0Var.f83378d) == 0) {
            i4 = this.f83379e - m0Var.f83379e;
        }
        if (i4 < 0) {
            return -1;
        }
        return i4 == 0 ? 0 : 1;
    }

    protected m0 N0() {
        return this;
    }

    boolean P0(net.time4j.engine.q<?> qVar) {
        return (qVar == H && this.f83379e % 1000000 != 0) || (qVar == f83375z && !S0()) || ((qVar == B && !T0()) || ((qVar == D && this.f83379e != 0) || (qVar == I && this.f83379e % 1000 != 0)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<y, m0> y() {
        return X;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public boolean s(m0 m0Var) {
        return compareTo(m0Var) > 0;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public boolean f(m0 m0Var) {
        return compareTo(m0Var) < 0;
    }

    public boolean U0() {
        return S0() && this.f83376b % com.google.common.base.c.B == 0;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public boolean k(m0 m0Var) {
        return compareTo(m0Var) == 0;
    }

    @Override // net.time4j.base.g
    public int a() {
        return this.f83379e;
    }

    @Override // net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f83376b == m0Var.f83376b && this.f83377c == m0Var.f83377c && this.f83378d == m0Var.f83378d && this.f83379e == m0Var.f83379e;
    }

    @Override // net.time4j.base.g
    public int h() {
        return this.f83378d;
    }

    public String h1(net.time4j.format.t<m0> tVar) {
        return tVar.h(this);
    }

    @Override // net.time4j.engine.m0
    public int hashCode() {
        return (this.f83379e * 37) + (this.f83378d * com.google.common.base.c.f54872r) + (this.f83377c * 60) + this.f83376b;
    }

    public m l1(long j4, j jVar) {
        return c.e(this, j4, jVar);
    }

    @Override // net.time4j.base.g
    public int m() {
        return this.f83377c;
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder(19);
        sb.append('T');
        w0(this.f83376b, sb);
        if ((this.f83377c | this.f83378d | this.f83379e) != 0) {
            sb.append(':');
            w0(this.f83377c, sb);
            if ((this.f83378d | this.f83379e) != 0) {
                sb.append(':');
                w0(this.f83378d, sb);
                int i4 = this.f83379e;
                if (i4 != 0) {
                    i1(sb, i4);
                }
            }
        }
        return sb.toString();
    }

    @Override // net.time4j.base.g
    public int u() {
        return this.f83376b;
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return X;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }
}
