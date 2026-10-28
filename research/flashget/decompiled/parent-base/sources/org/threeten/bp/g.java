package org.threeten.bp;

import androidx.collection.r2;
import com.android.internal.telephony.SmsConstants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: LocalDate.java */
/* loaded from: classes9.dex */
public final class g extends org.threeten.bp.chrono.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final g f88223f = x0(-999999999, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final g f88224g = x0(999999999, 12, 31);

    /* renamed from: h, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<g> f88225h = new a();

    /* renamed from: i, reason: collision with root package name */
    private static final long f88226i = 2942565459149668126L;

    /* renamed from: j, reason: collision with root package name */
    private static final int f88227j = 146097;

    /* renamed from: k, reason: collision with root package name */
    static final long f88228k = 719528;

    /* renamed from: c, reason: collision with root package name */
    private final int f88229c;

    /* renamed from: d, reason: collision with root package name */
    private final short f88230d;

    /* renamed from: e, reason: collision with root package name */
    private final short f88231e;

    /* compiled from: LocalDate.java */
    class a implements org.threeten.bp.temporal.l<g> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(org.threeten.bp.temporal.f fVar) {
            return g.Z(fVar);
        }
    }

    /* compiled from: LocalDate.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88232a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88233b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f88233b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88233b[org.threeten.bp.temporal.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88233b[org.threeten.bp.temporal.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88233b[org.threeten.bp.temporal.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88233b[org.threeten.bp.temporal.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88233b[org.threeten.bp.temporal.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88233b[org.threeten.bp.temporal.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88233b[org.threeten.bp.temporal.b.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f88232a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f88232a[org.threeten.bp.temporal.a.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private g(int i4, int i5, int i6) {
        this.f88229c = i4;
        this.f88230d = (short) i5;
        this.f88231e = (short) i6;
    }

    public static g A0(int i4, int i5) {
        long j4 = i4;
        org.threeten.bp.temporal.a.YEAR.checkValidValue(j4);
        org.threeten.bp.temporal.a.DAY_OF_YEAR.checkValidValue(i5);
        boolean v4 = org.threeten.bp.chrono.o.f88011f.v(j4);
        if (i5 == 366 && !v4) {
            throw new DateTimeException(r2.a("Invalid date 'DayOfYear 366' as '", i4, "' is not a leap year"));
        }
        j of2 = j.of(((i5 - 1) / 31) + 1);
        if (i5 > (of2.length(v4) + of2.firstDayOfYear(v4)) - 1) {
            of2 = of2.plus(1L);
        }
        return W(i4, of2, (i5 - of2.firstDayOfYear(v4)) + 1);
    }

    public static g B0(CharSequence charSequence) {
        return C0(charSequence, org.threeten.bp.format.c.f88101h);
    }

    public static g C0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (g) cVar.r(charSequence, f88225h);
    }

    static g J0(DataInput dataInput) throws IOException {
        return x0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static g L0(int i4, int i5, int i6) {
        if (i5 == 2) {
            i6 = Math.min(i6, org.threeten.bp.chrono.o.f88011f.v((long) i4) ? 29 : 28);
        } else if (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) {
            i6 = Math.min(i6, 30);
        }
        return x0(i4, i5, i6);
    }

    private static g W(int i4, j jVar, int i5) {
        if (i5 <= 28 || i5 <= jVar.length(org.threeten.bp.chrono.o.f88011f.v(i4))) {
            return new g(i4, jVar.getValue(), i5);
        }
        if (i5 == 29) {
            throw new DateTimeException(r2.a("Invalid date 'February 29' as '", i4, "' is not a leap year"));
        }
        throw new DateTimeException("Invalid date '" + jVar.name() + " " + i5 + "'");
    }

    public static g Z(org.threeten.bp.temporal.f fVar) {
        g gVar = (g) fVar.query(org.threeten.bp.temporal.k.b());
        if (gVar != null) {
            return gVar;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
    }

    private int a0(org.threeten.bp.temporal.j jVar) {
        switch (b.f88232a[((org.threeten.bp.temporal.a) jVar).ordinal()]) {
            case 1:
                return this.f88231e;
            case 2:
                return e0();
            case 3:
                return androidx.appcompat.widget.a.a(this.f88231e, 1, 7, 1);
            case 4:
                int i4 = this.f88229c;
                return i4 >= 1 ? i4 : 1 - i4;
            case 5:
                return d0().getValue();
            case 6:
                return ((this.f88231e - 1) % 7) + 1;
            case 7:
                return ((e0() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException(c.a("Field too large for an int: ", jVar));
            case 9:
                return ((e0() - 1) / 7) + 1;
            case 10:
                return this.f88230d;
            case 11:
                throw new DateTimeException(c.a("Field too large for an int: ", jVar));
            case 12:
                return this.f88229c;
            case 13:
                return this.f88229c >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
    }

    private long h0() {
        return (this.f88229c * 12) + (this.f88230d - 1);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private long t0(g gVar) {
        return (((gVar.h0() * 32) + gVar.f88231e) - ((h0() * 32) + this.f88231e)) / 32;
    }

    public static g u0() {
        return v0(org.threeten.bp.a.g());
    }

    public static g v0(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        return z0(ng.d.e(aVar.c().q() + aVar.b().l().b(r0).v(), 86400L));
    }

    public static g w0(r rVar) {
        return v0(org.threeten.bp.a.f(rVar));
    }

    private Object writeReplace() {
        return new o((byte) 3, this);
    }

    public static g x0(int i4, int i5, int i6) {
        org.threeten.bp.temporal.a.YEAR.checkValidValue(i4);
        org.threeten.bp.temporal.a.MONTH_OF_YEAR.checkValidValue(i5);
        org.threeten.bp.temporal.a.DAY_OF_MONTH.checkValidValue(i6);
        return W(i4, j.of(i5), i6);
    }

    public static g y0(int i4, j jVar, int i5) {
        org.threeten.bp.temporal.a.YEAR.checkValidValue(i4);
        ng.d.j(jVar, "month");
        org.threeten.bp.temporal.a.DAY_OF_MONTH.checkValidValue(i5);
        return W(i4, jVar, i5);
    }

    public static g z0(long j4) {
        long j5;
        org.threeten.bp.temporal.a.EPOCH_DAY.checkValidValue(j4);
        long j6 = 719468 + j4;
        if (j6 < 0) {
            long j7 = ((j4 + 719469) / 146097) - 1;
            j5 = j7 * 400;
            j6 += (-j7) * 146097;
        } else {
            j5 = 0;
        }
        long j10 = ((j6 * 400) + 591) / 146097;
        long j11 = j6 - ((j10 / 400) + (((j10 / 4) + (j10 * 365)) - (j10 / 100)));
        if (j11 < 0) {
            j10--;
            j11 = j6 - ((j10 / 400) + (((j10 / 4) + (365 * j10)) - (j10 / 100)));
        }
        int i4 = (int) j11;
        int i5 = ((i4 * 5) + 2) / SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER;
        return new g(org.threeten.bp.temporal.a.YEAR.checkValidIntValue(j10 + j5 + (i5 / 10)), ((i5 + 2) % 12) + 1, (i4 - (((i5 * 306) + 5) / 10)) + 1);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: B */
    public org.threeten.bp.chrono.c g(org.threeten.bp.temporal.i iVar) {
        return (g) iVar.b(this);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: D0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g v(long j4, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (g) mVar.addTo(this, j4);
        }
        switch (b.f88233b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return F0(j4);
            case 2:
                return H0(j4);
            case 3:
                return G0(j4);
            case 4:
                return I0(j4);
            case 5:
                return I0(ng.d.n(j4, 10));
            case 6:
                return I0(ng.d.n(j4, 100));
            case 7:
                return I0(ng.d.n(j4, 1000));
            case 8:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
                return K(aVar, ng.d.l(getLong(aVar), j4));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    @Override // org.threeten.bp.chrono.c
    public long E() {
        long j4 = this.f88229c;
        long j5 = this.f88230d;
        long j6 = 365 * j4;
        long j7 = (((367 * j5) - 362) / 12) + (j4 >= 0 ? ((j4 + 399) / 400) + (((3 + j4) / 4) - ((99 + j4) / 100)) + j6 : j6 - ((j4 / (-400)) + ((j4 / (-4)) - (j4 / (-100))))) + (this.f88231e - 1);
        if (j5 > 2) {
            j7 = !u() ? j7 - 2 : j7 - 1;
        }
        return j7 - f88228k;
    }

    public g E0(org.threeten.bp.temporal.i iVar) {
        return (g) iVar.b(this);
    }

    public g F0(long j4) {
        return j4 == 0 ? this : z0(ng.d.l(E(), j4));
    }

    public g G0(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j5 = (this.f88229c * 12) + (this.f88230d - 1) + j4;
        return L0(org.threeten.bp.temporal.a.YEAR.checkValidIntValue(ng.d.e(j5, 12L)), ng.d.g(j5, 12) + 1, this.f88231e);
    }

    public g H0(long j4) {
        return F0(ng.d.n(j4, 7));
    }

    public g I0(long j4) {
        return j4 == 0 ? this : L0(org.threeten.bp.temporal.a.YEAR.checkValidIntValue(this.f88229c + j4), this.f88230d, this.f88231e);
    }

    public h M() {
        return h.y0(this, i.f88243h);
    }

    public u N(r rVar) {
        org.threeten.bp.zone.d e4;
        ng.d.j(rVar, "zone");
        h y02 = h.y0(this, i.f88243h);
        if (!(rVar instanceof s) && (e4 = rVar.l().e(y02)) != null && e4.j()) {
            y02 = e4.b();
        }
        return u.y0(y02, rVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public n G(org.threeten.bp.chrono.c cVar) {
        g Z = Z(cVar);
        long h02 = Z.h0() - h0();
        int i4 = Z.f88231e - this.f88231e;
        if (h02 > 0 && i4 < 0) {
            h02--;
            i4 = (int) (Z.E() - G0(h02).E());
        } else if (h02 < 0 && i4 > 0) {
            h02++;
            i4 -= Z.v();
        }
        return n.A(ng.d.r(h02 / 12), (int) (h02 % 12), i4);
    }

    public h P(int i4, int i5) {
        return h.y0(this, i.N(i4, i5));
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    /* renamed from: P0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g i(org.threeten.bp.temporal.g gVar) {
        return gVar instanceof g ? (g) gVar : (g) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (g) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.checkValidValue(j4);
        switch (b.f88232a[aVar.ordinal()]) {
            case 1:
                return R0((int) j4);
            case 2:
                return S0((int) j4);
            case 3:
                return H0(j4 - getLong(org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f88229c < 1) {
                    j4 = 1 - j4;
                }
                return U0((int) j4);
            case 5:
                return F0(j4 - d0().getValue());
            case 6:
                return F0(j4 - getLong(org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return F0(j4 - getLong(org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return z0(j4);
            case 9:
                return H0(j4 - getLong(org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return T0((int) j4);
            case 11:
                return G0(j4 - getLong(org.threeten.bp.temporal.a.PROLEPTIC_MONTH));
            case 12:
                return U0((int) j4);
            case 13:
                return getLong(org.threeten.bp.temporal.a.ERA) == j4 ? this : U0(1 - this.f88229c);
            default:
                throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
    }

    public h R(int i4, int i5, int i6) {
        return h.y0(this, i.P(i4, i5, i6));
    }

    public g R0(int i4) {
        return this.f88231e == i4 ? this : x0(this.f88229c, this.f88230d, i4);
    }

    public h S(int i4, int i5, int i6, int i7) {
        return h.y0(this, i.R(i4, i5, i6, i7));
    }

    public g S0(int i4) {
        return e0() == i4 ? this : A0(this.f88229c, i4);
    }

    public h T(i iVar) {
        return h.y0(this, iVar);
    }

    public g T0(int i4) {
        if (this.f88230d == i4) {
            return this;
        }
        org.threeten.bp.temporal.a.MONTH_OF_YEAR.checkValidValue(i4);
        return L0(this.f88229c, i4, this.f88231e);
    }

    public l U(m mVar) {
        return l.c0(h.y0(this, mVar.c0()), mVar.s());
    }

    public g U0(int i4) {
        if (this.f88229c == i4) {
            return this;
        }
        org.threeten.bp.temporal.a.YEAR.checkValidValue(i4);
        return L0(i4, this.f88230d, this.f88231e);
    }

    int V(g gVar) {
        int i4 = this.f88229c - gVar.f88229c;
        if (i4 != 0) {
            return i4;
        }
        int i5 = this.f88230d - gVar.f88230d;
        return i5 == 0 ? this.f88231e - gVar.f88231e : i5;
    }

    void V0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f88229c);
        dataOutput.writeByte(this.f88230d);
        dataOutput.writeByte(this.f88231e);
    }

    long Y(g gVar) {
        return gVar.E() - E();
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return super.adjustInto(eVar);
    }

    public org.threeten.bp.chrono.o b0() {
        return org.threeten.bp.chrono.o.f88011f;
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (g) iVar.a(this);
    }

    public int c0() {
        return this.f88231e;
    }

    public d d0() {
        return d.of(ng.d.g(E() + 3, 7) + 1);
    }

    public int e0() {
        return (j.of(this.f88230d).firstDayOfYear(u()) + this.f88231e) - 1;
    }

    @Override // org.threeten.bp.chrono.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && V((g) obj) == 0;
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        g Z = Z(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, Z);
        }
        switch (b.f88233b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return Y(Z);
            case 2:
                return Y(Z) / 7;
            case 3:
                return t0(Z);
            case 4:
                return t0(Z) / 12;
            case 5:
                return t0(Z) / 120;
            case 6:
                return t0(Z) / 1200;
            case 7:
                return t0(Z) / 12000;
            case 8:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
                return Z.getLong(aVar) - getLong(aVar);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    public j f0() {
        return j.of(this.f88230d);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (g) iVar.b(this);
    }

    public int g0() {
        return this.f88230d;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? a0(jVar) : super.get(jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.EPOCH_DAY ? E() : jVar == org.threeten.bp.temporal.a.PROLEPTIC_MONTH ? h0() : a0(jVar) : jVar.getFrom(this);
    }

    @Override // org.threeten.bp.chrono.c
    public int hashCode() {
        int i4 = this.f88229c;
        return (((i4 << 11) + (this.f88230d << 6)) + this.f88231e) ^ (i4 & (-2048));
    }

    public int i0() {
        return this.f88229c;
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return super.isSupported(jVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: k0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? A(Long.MAX_VALUE, mVar).A(1L, mVar) : A(-j4, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    public org.threeten.bp.chrono.d l(i iVar) {
        return h.y0(this, iVar);
    }

    public g l0(org.threeten.bp.temporal.i iVar) {
        return (g) iVar.a(this);
    }

    @Override // org.threeten.bp.chrono.c, java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(org.threeten.bp.chrono.c cVar) {
        return cVar instanceof g ? V((g) cVar) : super.compareTo(cVar);
    }

    public g m0(long j4) {
        return j4 == Long.MIN_VALUE ? F0(Long.MAX_VALUE).F0(1L) : F0(-j4);
    }

    @Override // org.threeten.bp.chrono.c
    public String n(org.threeten.bp.format.c cVar) {
        return super.n(cVar);
    }

    public g o0(long j4) {
        return j4 == Long.MIN_VALUE ? G0(Long.MAX_VALUE).G0(1L) : G0(-j4);
    }

    @Override // org.threeten.bp.chrono.c
    public org.threeten.bp.chrono.j p() {
        return org.threeten.bp.chrono.o.f88011f;
    }

    public g p0(long j4) {
        return j4 == Long.MIN_VALUE ? H0(Long.MAX_VALUE).H0(1L) : H0(-j4);
    }

    @Override // org.threeten.bp.chrono.c
    public org.threeten.bp.chrono.k q() {
        return super.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.chrono.c, ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        return lVar == org.threeten.bp.temporal.k.b() ? this : (R) super.query(lVar);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean r(org.threeten.bp.chrono.c cVar) {
        return cVar instanceof g ? V((g) cVar) > 0 : super.r(cVar);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.rangeRefinedBy(this);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        if (!aVar.isDateBased()) {
            throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
        int i4 = b.f88232a[aVar.ordinal()];
        if (i4 == 1) {
            return org.threeten.bp.temporal.n.k(1L, v());
        }
        if (i4 == 2) {
            return org.threeten.bp.temporal.n.k(1L, w());
        }
        if (i4 == 3) {
            return org.threeten.bp.temporal.n.k(1L, (j.of(this.f88230d) != j.FEBRUARY || u()) ? 5L : 4L);
        }
        if (i4 != 4) {
            return jVar.range();
        }
        return org.threeten.bp.temporal.n.k(1L, this.f88229c <= 0 ? 1000000000L : 999999999L);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean s(org.threeten.bp.chrono.c cVar) {
        return cVar instanceof g ? V((g) cVar) < 0 : super.s(cVar);
    }

    public g s0(long j4) {
        return j4 == Long.MIN_VALUE ? I0(Long.MAX_VALUE).I0(1L) : I0(-j4);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean t(org.threeten.bp.chrono.c cVar) {
        return cVar instanceof g ? V((g) cVar) == 0 : super.t(cVar);
    }

    @Override // org.threeten.bp.chrono.c
    public String toString() {
        int i4 = this.f88229c;
        short s4 = this.f88230d;
        short s5 = this.f88231e;
        int abs = Math.abs(i4);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i4 > 9999) {
                sb.append('+');
            }
            sb.append(i4);
        } else if (i4 < 0) {
            sb.append(i4 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i4 + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s4 < 10 ? "-0" : "-");
        sb.append((int) s4);
        sb.append(s5 < 10 ? "-0" : "-");
        sb.append((int) s5);
        return sb.toString();
    }

    @Override // org.threeten.bp.chrono.c
    public boolean u() {
        return org.threeten.bp.chrono.o.f88011f.v(this.f88229c);
    }

    @Override // org.threeten.bp.chrono.c
    public int v() {
        short s4 = this.f88230d;
        return s4 != 2 ? (s4 == 4 || s4 == 6 || s4 == 9 || s4 == 11) ? 30 : 31 : u() ? 29 : 28;
    }

    @Override // org.threeten.bp.chrono.c
    public int w() {
        return u() ? 366 : 365;
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: z */
    public org.threeten.bp.chrono.c c(org.threeten.bp.temporal.i iVar) {
        return (g) iVar.a(this);
    }
}
