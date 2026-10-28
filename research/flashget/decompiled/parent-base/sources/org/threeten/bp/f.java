package org.threeten.bp;

import com.tencent.mmkv.MMKV;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: Instant.java */
/* loaded from: classes9.dex */
public final class f extends ng.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<f>, Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final long f88083j = -665713676816604388L;

    /* renamed from: k, reason: collision with root package name */
    private static final int f88084k = 1000000000;

    /* renamed from: l, reason: collision with root package name */
    private static final int f88085l = 1000000;

    /* renamed from: m, reason: collision with root package name */
    private static final long f88086m = 1000;

    /* renamed from: b, reason: collision with root package name */
    private final long f88087b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88088c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f88077d = new f(0, 0);

    /* renamed from: e, reason: collision with root package name */
    private static final long f88078e = -31557014167219200L;

    /* renamed from: g, reason: collision with root package name */
    public static final f f88080g = J(f88078e, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final long f88079f = 31556889864403199L;

    /* renamed from: h, reason: collision with root package name */
    public static final f f88081h = J(f88079f, 999999999);

    /* renamed from: i, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<f> f88082i = new a();

    /* compiled from: Instant.java */
    class a implements org.threeten.bp.temporal.l<f> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(org.threeten.bp.temporal.f fVar) {
            return f.p(fVar);
        }
    }

    /* compiled from: Instant.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88089a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88090b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f88090b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88090b[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88090b[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88090b[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88090b[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88090b[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88090b[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88090b[org.threeten.bp.temporal.b.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f88089a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88089a[org.threeten.bp.temporal.a.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88089a[org.threeten.bp.temporal.a.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f88089a[org.threeten.bp.temporal.a.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private f(long j4, int i4) {
        this.f88087b = j4;
        this.f88088c = i4;
    }

    private long A(f fVar) {
        return ng.d.l(ng.d.n(ng.d.q(fVar.f88087b, this.f88087b), 1000000000), fVar.f88088c - this.f88088c);
    }

    public static f B() {
        return org.threeten.bp.a.h().c();
    }

    public static f C(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        return aVar.c();
    }

    public static f E(long j4) {
        return o(ng.d.e(j4, 1000L), ng.d.g(j4, 1000) * 1000000);
    }

    public static f G(long j4) {
        return o(j4, 0);
    }

    public static f J(long j4, long j5) {
        return o(ng.d.l(j4, ng.d.e(j5, 1000000000L)), ng.d.g(j5, 1000000000));
    }

    public static f K(CharSequence charSequence) {
        return (f) org.threeten.bp.format.c.f88113t.r(charSequence, f88082i);
    }

    private f M(long j4, long j5) {
        if ((j4 | j5) == 0) {
            return this;
        }
        return J(ng.d.l(ng.d.l(this.f88087b, j4), j5 / 1000000000), this.f88088c + (j5 % 1000000000));
    }

    static f U(DataInput dataInput) throws IOException {
        return J(dataInput.readLong(), dataInput.readInt());
    }

    private long V(f fVar) {
        long q4 = ng.d.q(fVar.f88087b, this.f88087b);
        long j4 = fVar.f88088c - this.f88088c;
        return (q4 <= 0 || j4 >= 0) ? (q4 >= 0 || j4 <= 0) ? q4 : q4 + 1 : q4 - 1;
    }

    private static f o(long j4, int i4) {
        if ((i4 | j4) == 0) {
            return f88077d;
        }
        if (j4 < f88078e || j4 > f88079f) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new f(j4, i4);
    }

    public static f p(org.threeten.bp.temporal.f fVar) {
        try {
            return J(fVar.getLong(org.threeten.bp.temporal.a.INSTANT_SECONDS), fVar.get(org.threeten.bp.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e4) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName(), e4);
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 2, this);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public f v(long j4, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (f) mVar.addTo(this, j4);
        }
        switch (b.f88090b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return M(0L, j4);
            case 2:
                return M(j4 / 1000000, (j4 % 1000000) * 1000);
            case 3:
                return R(j4);
            case 4:
                return M(j4, 0L);
            case 5:
                return M(ng.d.n(j4, 60), 0L);
            case 6:
                return M(ng.d.n(j4, MMKV.ExpireInHour), 0L);
            case 7:
                return M(ng.d.n(j4, 43200), 0L);
            case 8:
                return M(ng.d.n(j4, MMKV.ExpireInDay), 0L);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    public f P(org.threeten.bp.temporal.i iVar) {
        return (f) iVar.b(this);
    }

    public f R(long j4) {
        return M(j4 / 1000, (j4 % 1000) * 1000000);
    }

    public f S(long j4) {
        return M(0L, j4);
    }

    public f T(long j4) {
        return M(j4, 0L);
    }

    public long W() {
        long j4 = this.f88087b;
        return j4 >= 0 ? ng.d.l(ng.d.o(j4, 1000L), this.f88088c / 1000000) : ng.d.q(ng.d.o(j4 + 1, 1000L), 1000 - (this.f88088c / 1000000));
    }

    public f Y(org.threeten.bp.temporal.m mVar) {
        if (mVar == org.threeten.bp.temporal.b.NANOS) {
            return this;
        }
        e duration = mVar.getDuration();
        if (duration.n() > 86400) {
            throw new DateTimeException("Unit is too large to be used for truncation");
        }
        long i02 = duration.i0();
        if (86400000000000L % i02 != 0) {
            throw new DateTimeException("Unit must divide into a standard day without remainder");
        }
        long j4 = ((this.f88087b % 86400) * 1000000000) + this.f88088c;
        return M(0L, (ng.d.e(j4, i02) * i02) - j4);
    }

    public f Z(org.threeten.bp.temporal.g gVar) {
        return (f) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public f b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (f) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.checkValidValue(j4);
        int i4 = b.f88089a[aVar.ordinal()];
        if (i4 == 1) {
            return j4 != ((long) this.f88088c) ? o(this.f88087b, (int) j4) : this;
        }
        if (i4 == 2) {
            int i5 = ((int) j4) * 1000;
            return i5 != this.f88088c ? o(this.f88087b, i5) : this;
        }
        if (i4 == 3) {
            int i6 = ((int) j4) * 1000000;
            return i6 != this.f88088c ? o(this.f88087b, i6) : this;
        }
        if (i4 == 4) {
            return j4 != this.f88087b ? o(j4, this.f88088c) : this;
        }
        throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.INSTANT_SECONDS, this.f88087b).b(org.threeten.bp.temporal.a.NANO_OF_SECOND, this.f88088c);
    }

    void b0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f88087b);
        dataOutput.writeInt(this.f88088c);
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (f) iVar.a(this);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isTimeBased() || mVar == org.threeten.bp.temporal.b.DAYS : mVar != null && mVar.isSupportedBy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f88087b == fVar.f88087b && this.f88088c == fVar.f88088c;
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        f p4 = p(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, p4);
        }
        switch (b.f88090b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return A(p4);
            case 2:
                return A(p4) / 1000;
            case 3:
                return ng.d.q(p4.W(), W());
            case 4:
                return V(p4);
            case 5:
                return V(p4) / 60;
            case 6:
                return V(p4) / 3600;
            case 7:
                return V(p4) / 43200;
            case 8:
                return V(p4) / 86400;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (f) iVar.b(this);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return super.range(jVar).a(jVar.getFrom(this), jVar);
        }
        int i4 = b.f88089a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i4 == 1) {
            return this.f88088c;
        }
        if (i4 == 2) {
            return this.f88088c / 1000;
        }
        if (i4 == 3) {
            return this.f88088c / 1000000;
        }
        throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        int i4;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        int i5 = b.f88089a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i5 == 1) {
            i4 = this.f88088c;
        } else if (i5 == 2) {
            i4 = this.f88088c / 1000;
        } else {
            if (i5 != 3) {
                if (i5 == 4) {
                    return this.f88087b;
                }
                throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
            }
            i4 = this.f88088c / 1000000;
        }
        return i4;
    }

    public int hashCode() {
        long j4 = this.f88087b;
        return (this.f88088c * 51) + ((int) (j4 ^ (j4 >>> 32)));
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e i(org.threeten.bp.temporal.g gVar) {
        return (f) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.INSTANT_SECONDS || jVar == org.threeten.bp.temporal.a.NANO_OF_SECOND || jVar == org.threeten.bp.temporal.a.MICRO_OF_SECOND || jVar == org.threeten.bp.temporal.a.MILLI_OF_SECOND : jVar != null && jVar.isSupportedBy(this);
    }

    public l l(s sVar) {
        return l.d0(this, sVar);
    }

    public u m(r rVar) {
        return u.z0(this, rVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int b5 = ng.d.b(this.f88087b, fVar.f88087b);
        return b5 != 0 ? b5 : this.f88088c - fVar.f88088c;
    }

    public long q() {
        return this.f88087b;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return lVar.a(this);
    }

    public int r() {
        return this.f88088c;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return super.range(jVar);
    }

    public boolean s(f fVar) {
        return compareTo(fVar) > 0;
    }

    public boolean t(f fVar) {
        return compareTo(fVar) < 0;
    }

    public String toString() {
        return org.threeten.bp.format.c.f88113t.d(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public f t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? k(Long.MAX_VALUE, mVar).k(1L, mVar) : k(-j4, mVar);
    }

    public f v(org.threeten.bp.temporal.i iVar) {
        return (f) iVar.a(this);
    }

    public f w(long j4) {
        return j4 == Long.MIN_VALUE ? R(Long.MAX_VALUE).R(1L) : R(-j4);
    }

    public f y(long j4) {
        return j4 == Long.MIN_VALUE ? M(0L, Long.MAX_VALUE).M(0L, 1L) : M(0L, -j4);
    }

    public f z(long j4) {
        return j4 == Long.MIN_VALUE ? M(Long.MAX_VALUE, 0L).M(1L, 0L) : M(-j4, 0L);
    }
}
