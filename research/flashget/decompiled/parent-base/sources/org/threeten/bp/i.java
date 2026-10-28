package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: LocalTime.java */
/* loaded from: classes9.dex */
public final class i extends ng.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<i>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final i f88241f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f88242g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f88243h;

    /* renamed from: i, reason: collision with root package name */
    public static final i f88244i;

    /* renamed from: j, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<i> f88245j = new a();

    /* renamed from: k, reason: collision with root package name */
    private static final i[] f88246k = new i[24];

    /* renamed from: l, reason: collision with root package name */
    static final int f88247l = 24;

    /* renamed from: m, reason: collision with root package name */
    static final int f88248m = 60;

    /* renamed from: n, reason: collision with root package name */
    static final int f88249n = 1440;

    /* renamed from: o, reason: collision with root package name */
    static final int f88250o = 60;

    /* renamed from: p, reason: collision with root package name */
    static final int f88251p = 3600;

    /* renamed from: q, reason: collision with root package name */
    static final int f88252q = 86400;

    /* renamed from: r, reason: collision with root package name */
    static final long f88253r = 86400000;

    /* renamed from: s, reason: collision with root package name */
    static final long f88254s = 86400000000L;

    /* renamed from: t, reason: collision with root package name */
    static final long f88255t = 1000000000;

    /* renamed from: u, reason: collision with root package name */
    static final long f88256u = 60000000000L;

    /* renamed from: v, reason: collision with root package name */
    static final long f88257v = 3600000000000L;

    /* renamed from: w, reason: collision with root package name */
    static final long f88258w = 86400000000000L;

    /* renamed from: x, reason: collision with root package name */
    private static final long f88259x = 6414437269572265201L;

    /* renamed from: b, reason: collision with root package name */
    private final byte f88260b;

    /* renamed from: c, reason: collision with root package name */
    private final byte f88261c;

    /* renamed from: d, reason: collision with root package name */
    private final byte f88262d;

    /* renamed from: e, reason: collision with root package name */
    private final int f88263e;

    /* compiled from: LocalTime.java */
    class a implements org.threeten.bp.temporal.l<i> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(org.threeten.bp.temporal.f fVar) {
            return i.q(fVar);
        }
    }

    /* compiled from: LocalTime.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88264a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88265b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f88265b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88265b[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88265b[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88265b[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88265b[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88265b[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88265b[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f88264a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f88264a[org.threeten.bp.temporal.a.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i4 = 0;
        while (true) {
            i[] iVarArr = f88246k;
            if (i4 >= iVarArr.length) {
                i iVar = iVarArr[0];
                f88243h = iVar;
                f88244i = iVarArr[12];
                f88241f = iVar;
                f88242g = new i(23, 59, 59, 999999999);
                return;
            }
            iVarArr[i4] = new i(i4, 0, 0, 0);
            i4++;
        }
    }

    private i(int i4, int i5, int i6, int i7) {
        this.f88260b = (byte) i4;
        this.f88261c = (byte) i5;
        this.f88262d = (byte) i6;
        this.f88263e = i7;
    }

    public static i J() {
        return K(org.threeten.bp.a.g());
    }

    public static i K(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        f c5 = aVar.c();
        long q4 = ((c5.q() % 86400) + aVar.b().l().b(c5).v()) % 86400;
        if (q4 < 0) {
            q4 += 86400;
        }
        return U(q4, c5.r());
    }

    public static i M(r rVar) {
        return K(org.threeten.bp.a.f(rVar));
    }

    public static i N(int i4, int i5) {
        org.threeten.bp.temporal.a.HOUR_OF_DAY.checkValidValue(i4);
        if (i5 == 0) {
            return f88246k[i4];
        }
        org.threeten.bp.temporal.a.MINUTE_OF_HOUR.checkValidValue(i5);
        return new i(i4, i5, 0, 0);
    }

    public static i P(int i4, int i5, int i6) {
        org.threeten.bp.temporal.a.HOUR_OF_DAY.checkValidValue(i4);
        if ((i5 | i6) == 0) {
            return f88246k[i4];
        }
        org.threeten.bp.temporal.a.MINUTE_OF_HOUR.checkValidValue(i5);
        org.threeten.bp.temporal.a.SECOND_OF_MINUTE.checkValidValue(i6);
        return new i(i4, i5, i6, 0);
    }

    public static i R(int i4, int i5, int i6, int i7) {
        org.threeten.bp.temporal.a.HOUR_OF_DAY.checkValidValue(i4);
        org.threeten.bp.temporal.a.MINUTE_OF_HOUR.checkValidValue(i5);
        org.threeten.bp.temporal.a.SECOND_OF_MINUTE.checkValidValue(i6);
        org.threeten.bp.temporal.a.NANO_OF_SECOND.checkValidValue(i7);
        return o(i4, i5, i6, i7);
    }

    public static i S(long j4) {
        org.threeten.bp.temporal.a.NANO_OF_DAY.checkValidValue(j4);
        int i4 = (int) (j4 / f88257v);
        long j5 = j4 - (i4 * f88257v);
        int i5 = (int) (j5 / f88256u);
        long j6 = j5 - (i5 * f88256u);
        int i6 = (int) (j6 / f88255t);
        return o(i4, i5, i6, (int) (j6 - (i6 * f88255t)));
    }

    public static i T(long j4) {
        org.threeten.bp.temporal.a.SECOND_OF_DAY.checkValidValue(j4);
        int i4 = (int) (j4 / 3600);
        long j5 = j4 - (i4 * 3600);
        return o(i4, (int) (j5 / 60), (int) (j5 - (r1 * 60)), 0);
    }

    static i U(long j4, int i4) {
        org.threeten.bp.temporal.a.SECOND_OF_DAY.checkValidValue(j4);
        org.threeten.bp.temporal.a.NANO_OF_SECOND.checkValidValue(i4);
        int i5 = (int) (j4 / 3600);
        long j5 = j4 - (i5 * 3600);
        return o(i5, (int) (j5 / 60), (int) (j5 - (r1 * 60)), i4);
    }

    public static i V(CharSequence charSequence) {
        return W(charSequence, org.threeten.bp.format.c.f88104k);
    }

    public static i W(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (i) cVar.r(charSequence, f88245j);
    }

    static i e0(DataInput dataInput) throws IOException {
        int i4;
        int i5;
        int readByte = dataInput.readByte();
        int i6 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i4 = 0;
            i5 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i7 = ~readByte2;
                i5 = 0;
                i6 = i7;
                i4 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i4 = ~readByte3;
                } else {
                    i6 = dataInput.readInt();
                    i4 = readByte3;
                }
                i5 = i6;
                i6 = readByte2;
            }
        }
        return R(readByte, i6, i4, i5);
    }

    private static i o(int i4, int i5, int i6, int i7) {
        return ((i5 | i6) | i7) == 0 ? f88246k[i4] : new i(i4, i5, i6, i7);
    }

    public static i q(org.threeten.bp.temporal.f fVar) {
        i iVar = (i) fVar.query(org.threeten.bp.temporal.k.c());
        if (iVar != null) {
            return iVar;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
    }

    private int r(org.threeten.bp.temporal.j jVar) {
        switch (b.f88264a[((org.threeten.bp.temporal.a) jVar).ordinal()]) {
            case 1:
                return this.f88263e;
            case 2:
                throw new DateTimeException(c.a("Field too large for an int: ", jVar));
            case 3:
                return this.f88263e / 1000;
            case 4:
                throw new DateTimeException(c.a("Field too large for an int: ", jVar));
            case 5:
                return this.f88263e / 1000000;
            case 6:
                return (int) (f0() / 1000000);
            case 7:
                return this.f88262d;
            case 8:
                return g0();
            case 9:
                return this.f88261c;
            case 10:
                return (this.f88260b * 60) + this.f88261c;
            case 11:
                return this.f88260b % 12;
            case 12:
                int i4 = this.f88260b % 12;
                if (i4 % 12 == 0) {
                    return 12;
                }
                return i4;
            case 13:
                return this.f88260b;
            case 14:
                byte b5 = this.f88260b;
                if (b5 == 0) {
                    return 24;
                }
                return b5;
            case 15:
                return this.f88260b / 12;
            default:
                throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 5, this);
    }

    public i A(org.threeten.bp.temporal.i iVar) {
        return (i) iVar.a(this);
    }

    public i B(long j4) {
        return a0(-(j4 % 24));
    }

    public i C(long j4) {
        return b0(-(j4 % 1440));
    }

    public i E(long j4) {
        return c0(-(j4 % f88258w));
    }

    public i G(long j4) {
        return d0(-(j4 % 86400));
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public i v(long j4, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (i) mVar.addTo(this, j4);
        }
        switch (b.f88265b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return c0(j4);
            case 2:
                return c0((j4 % f88254s) * 1000);
            case 3:
                return c0((j4 % 86400000) * 1000000);
            case 4:
                return d0(j4);
            case 5:
                return b0(j4);
            case 6:
                return a0(j4);
            case 7:
                return a0((j4 % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    public i Z(org.threeten.bp.temporal.i iVar) {
        return (i) iVar.b(this);
    }

    public i a0(long j4) {
        return j4 == 0 ? this : o(((((int) (j4 % 24)) + this.f88260b) + 24) % 24, this.f88261c, this.f88262d, this.f88263e);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.NANO_OF_DAY, f0());
    }

    public i b0(long j4) {
        if (j4 == 0) {
            return this;
        }
        int i4 = (this.f88260b * 60) + this.f88261c;
        int i5 = ((((int) (j4 % 1440)) + i4) + f88249n) % f88249n;
        return i4 == i5 ? this : o(i5 / 60, i5 % 60, this.f88262d, this.f88263e);
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (i) iVar.a(this);
    }

    public i c0(long j4) {
        if (j4 == 0) {
            return this;
        }
        long f02 = f0();
        long j5 = (((j4 % f88258w) + f02) + f88258w) % f88258w;
        return f02 == j5 ? this : o((int) (j5 / f88257v), (int) ((j5 / f88256u) % 60), (int) ((j5 / f88255t) % 60), (int) (j5 % f88255t));
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isTimeBased() : mVar != null && mVar.isSupportedBy(this);
    }

    public i d0(long j4) {
        if (j4 == 0) {
            return this;
        }
        int i4 = (this.f88261c * 60) + (this.f88260b * com.google.common.base.c.f54872r) + this.f88262d;
        int i5 = ((((int) (j4 % 86400)) + i4) + 86400) % 86400;
        return i4 == i5 ? this : o(i5 / 3600, (i5 / 60) % 60, i5 % 60, this.f88263e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f88260b == iVar.f88260b && this.f88261c == iVar.f88261c && this.f88262d == iVar.f88262d && this.f88263e == iVar.f88263e;
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        i q4 = q(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, q4);
        }
        long f02 = q4.f0() - f0();
        switch (b.f88265b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return f02;
            case 2:
                return f02 / 1000;
            case 3:
                return f02 / 1000000;
            case 4:
                return f02 / f88255t;
            case 5:
                return f02 / f88256u;
            case 6:
                return f02 / f88257v;
            case 7:
                return f02 / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    public long f0() {
        return (this.f88262d * f88255t) + (this.f88261c * f88256u) + (this.f88260b * f88257v) + this.f88263e;
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (i) iVar.b(this);
    }

    public int g0() {
        return (this.f88261c * 60) + (this.f88260b * com.google.common.base.c.f54872r) + this.f88262d;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? r(jVar) : super.get(jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.NANO_OF_DAY ? f0() : jVar == org.threeten.bp.temporal.a.MICRO_OF_DAY ? f0() / 1000 : r(jVar) : jVar.getFrom(this);
    }

    public i h0(org.threeten.bp.temporal.m mVar) {
        if (mVar == org.threeten.bp.temporal.b.NANOS) {
            return this;
        }
        e duration = mVar.getDuration();
        if (duration.n() > 86400) {
            throw new DateTimeException("Unit is too large to be used for truncation");
        }
        long i02 = duration.i0();
        if (f88258w % i02 == 0) {
            return S((f0() / i02) * i02);
        }
        throw new DateTimeException("Unit must divide into a standard day without remainder");
    }

    public int hashCode() {
        long f02 = f0();
        return (int) (f02 ^ (f02 >>> 32));
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public i i(org.threeten.bp.temporal.g gVar) {
        return gVar instanceof i ? (i) gVar : (i) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() : jVar != null && jVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public i b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (i) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.checkValidValue(j4);
        switch (b.f88264a[aVar.ordinal()]) {
            case 1:
                return o0((int) j4);
            case 2:
                return S(j4);
            case 3:
                return o0(((int) j4) * 1000);
            case 4:
                return S(j4 * 1000);
            case 5:
                return o0(((int) j4) * 1000000);
            case 6:
                return S(j4 * 1000000);
            case 7:
                return p0((int) j4);
            case 8:
                return d0(j4 - g0());
            case 9:
                return m0((int) j4);
            case 10:
                return b0(j4 - ((this.f88260b * 60) + this.f88261c));
            case 11:
                return a0(j4 - (this.f88260b % 12));
            case 12:
                if (j4 == 12) {
                    j4 = 0;
                }
                return a0(j4 - (this.f88260b % 12));
            case 13:
                return l0((int) j4);
            case 14:
                if (j4 == 24) {
                    j4 = 0;
                }
                return l0((int) j4);
            case 15:
                return a0((j4 - (this.f88260b / 12)) * 12);
            default:
                throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
    }

    public h l(g gVar) {
        return h.y0(gVar, this);
    }

    public i l0(int i4) {
        if (this.f88260b == i4) {
            return this;
        }
        org.threeten.bp.temporal.a.HOUR_OF_DAY.checkValidValue(i4);
        return o(i4, this.f88261c, this.f88262d, this.f88263e);
    }

    public m m(s sVar) {
        return m.N(this, sVar);
    }

    public i m0(int i4) {
        if (this.f88261c == i4) {
            return this;
        }
        org.threeten.bp.temporal.a.MINUTE_OF_HOUR.checkValidValue(i4);
        return o(this.f88260b, i4, this.f88262d, this.f88263e);
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        int a5 = ng.d.a(this.f88260b, iVar.f88260b);
        if (a5 != 0) {
            return a5;
        }
        int a6 = ng.d.a(this.f88261c, iVar.f88261c);
        if (a6 != 0) {
            return a6;
        }
        int a7 = ng.d.a(this.f88262d, iVar.f88262d);
        return a7 == 0 ? ng.d.a(this.f88263e, iVar.f88263e) : a7;
    }

    public i o0(int i4) {
        if (this.f88263e == i4) {
            return this;
        }
        org.threeten.bp.temporal.a.NANO_OF_SECOND.checkValidValue(i4);
        return o(this.f88260b, this.f88261c, this.f88262d, i4);
    }

    public String p(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public i p0(int i4) {
        if (this.f88262d == i4) {
            return this;
        }
        org.threeten.bp.temporal.a.SECOND_OF_MINUTE.checkValidValue(i4);
        return o(this.f88260b, this.f88261c, i4, this.f88263e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return this;
        }
        if (lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.b()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return super.range(jVar);
    }

    public int s() {
        return this.f88260b;
    }

    void s0(DataOutput dataOutput) throws IOException {
        if (this.f88263e != 0) {
            dataOutput.writeByte(this.f88260b);
            dataOutput.writeByte(this.f88261c);
            dataOutput.writeByte(this.f88262d);
            dataOutput.writeInt(this.f88263e);
            return;
        }
        if (this.f88262d != 0) {
            dataOutput.writeByte(this.f88260b);
            dataOutput.writeByte(this.f88261c);
            dataOutput.writeByte(~this.f88262d);
        } else if (this.f88261c == 0) {
            dataOutput.writeByte(~this.f88260b);
        } else {
            dataOutput.writeByte(this.f88260b);
            dataOutput.writeByte(~this.f88261c);
        }
    }

    public int t() {
        return this.f88261c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b5 = this.f88260b;
        byte b6 = this.f88261c;
        byte b7 = this.f88262d;
        int i4 = this.f88263e;
        sb.append(b5 < 10 ? "0" : "");
        sb.append((int) b5);
        sb.append(b6 < 10 ? ":0" : ":");
        sb.append((int) b6);
        if (b7 > 0 || i4 > 0) {
            sb.append(b7 < 10 ? ":0" : ":");
            sb.append((int) b7);
            if (i4 > 0) {
                sb.append('.');
                if (i4 % 1000000 == 0) {
                    sb.append(Integer.toString((i4 / 1000000) + 1000).substring(1));
                } else if (i4 % 1000 == 0) {
                    sb.append(Integer.toString((i4 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i4 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public int u() {
        return this.f88263e;
    }

    public int v() {
        return this.f88262d;
    }

    public boolean w(i iVar) {
        return compareTo(iVar) > 0;
    }

    public boolean y(i iVar) {
        return compareTo(iVar) < 0;
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public i t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? v(Long.MAX_VALUE, mVar).v(1L, mVar) : v(-j4, mVar);
    }
}
