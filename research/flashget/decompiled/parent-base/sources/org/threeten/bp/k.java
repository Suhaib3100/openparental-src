package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: MonthDay.java */
/* loaded from: classes9.dex */
public final class k extends ng.c implements org.threeten.bp.temporal.f, org.threeten.bp.temporal.g, Comparable<k>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f88268e = -939150713474957432L;

    /* renamed from: b, reason: collision with root package name */
    private final int f88270b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88271c;

    /* renamed from: d, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<k> f88267d = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final org.threeten.bp.format.c f88269f = new org.threeten.bp.format.d().i("--").u(org.threeten.bp.temporal.a.MONTH_OF_YEAR, 2).h('-').u(org.threeten.bp.temporal.a.DAY_OF_MONTH, 2).P();

    /* compiled from: MonthDay.java */
    class a implements org.threeten.bp.temporal.l<k> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(org.threeten.bp.temporal.f fVar) {
            return k.o(fVar);
        }
    }

    /* compiled from: MonthDay.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88272a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f88272a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88272a[org.threeten.bp.temporal.a.MONTH_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private k(int i4, int i5) {
        this.f88270b = i4;
        this.f88271c = i5;
    }

    public static k A(j jVar, int i4) {
        ng.d.j(jVar, "month");
        org.threeten.bp.temporal.a.DAY_OF_MONTH.checkValidValue(i4);
        if (i4 <= jVar.maxLength()) {
            return new k(jVar.getValue(), i4);
        }
        StringBuilder a5 = androidx.collection.s.a("Illegal value for DayOfMonth field, value ", i4, " is not valid for month ");
        a5.append(jVar.name());
        throw new DateTimeException(a5.toString());
    }

    public static k B(CharSequence charSequence) {
        return C(charSequence, f88269f);
    }

    public static k C(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (k) cVar.r(charSequence, f88267d);
    }

    static k E(DataInput dataInput) throws IOException {
        return z(dataInput.readByte(), dataInput.readByte());
    }

    public static k o(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof k) {
            return (k) fVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f88011f.equals(org.threeten.bp.chrono.j.p(fVar))) {
                fVar = g.Z(fVar);
            }
            return z(fVar.get(org.threeten.bp.temporal.a.MONTH_OF_YEAR), fVar.get(org.threeten.bp.temporal.a.DAY_OF_MONTH));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain MonthDay from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static k v() {
        return w(org.threeten.bp.a.g());
    }

    public static k w(org.threeten.bp.a aVar) {
        g v02 = g.v0(aVar);
        return A(v02.f0(), v02.c0());
    }

    private Object writeReplace() {
        return new o(com.google.common.primitives.u.f57540a, this);
    }

    public static k y(r rVar) {
        return w(org.threeten.bp.a.f(rVar));
    }

    public static k z(int i4, int i5) {
        return A(j.of(i4), i5);
    }

    public k G(j jVar) {
        ng.d.j(jVar, "month");
        if (jVar.getValue() == this.f88270b) {
            return this;
        }
        return new k(jVar.getValue(), Math.min(this.f88271c, jVar.maxLength()));
    }

    public k J(int i4) {
        return i4 == this.f88271c ? this : z(this.f88270b, i4);
    }

    public k K(int i4) {
        return G(j.of(i4));
    }

    void M(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f88270b);
        dataOutput.writeByte(this.f88271c);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        if (!org.threeten.bp.chrono.j.p(eVar).equals(org.threeten.bp.chrono.o.f88011f)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        org.threeten.bp.temporal.e b5 = eVar.b(org.threeten.bp.temporal.a.MONTH_OF_YEAR, this.f88270b);
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.DAY_OF_MONTH;
        return b5.b(aVar, Math.min(b5.range(aVar).d(), this.f88271c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f88270b == kVar.f88270b && this.f88271c == kVar.f88271c;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return range(jVar).a(getLong(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        int i4;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        int i5 = b.f88272a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i5 == 1) {
            i4 = this.f88271c;
        } else {
            if (i5 != 2) {
                throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
            }
            i4 = this.f88270b;
        }
        return i4;
    }

    public int hashCode() {
        return (this.f88270b << 6) + this.f88271c;
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR || jVar == org.threeten.bp.temporal.a.DAY_OF_MONTH : jVar != null && jVar.isSupportedBy(this);
    }

    public g l(int i4) {
        return g.x0(i4, this.f88270b, u(i4) ? this.f88271c : 28);
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        int i4 = this.f88270b - kVar.f88270b;
        return i4 == 0 ? this.f88271c - kVar.f88271c : i4;
    }

    public String n(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public int p() {
        return this.f88271c;
    }

    public j q() {
        return j.of(this.f88270b);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        return lVar == org.threeten.bp.temporal.k.a() ? (R) org.threeten.bp.chrono.o.f88011f : (R) super.query(lVar);
    }

    public int r() {
        return this.f88270b;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return jVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR ? jVar.range() : jVar == org.threeten.bp.temporal.a.DAY_OF_MONTH ? org.threeten.bp.temporal.n.m(1L, 1L, j.of(this.f88270b).minLength(), j.of(this.f88270b).maxLength()) : super.range(jVar);
    }

    public boolean s(k kVar) {
        return compareTo(kVar) > 0;
    }

    public boolean t(k kVar) {
        return compareTo(kVar) < 0;
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(10, "--");
        a5.append(this.f88270b < 10 ? "0" : "");
        a5.append(this.f88270b);
        a5.append(this.f88271c < 10 ? "-0" : "-");
        a5.append(this.f88271c);
        return a5.toString();
    }

    public boolean u(int i4) {
        return !(this.f88271c == 29 && this.f88270b == 2 && !p.v((long) i4));
    }
}
