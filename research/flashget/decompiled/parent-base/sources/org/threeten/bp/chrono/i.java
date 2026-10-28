package org.threeten.bp.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.chrono.c;

/* compiled from: ChronoZonedDateTimeImpl.java */
/* loaded from: classes9.dex */
final class i<D extends c> extends h<D> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final long f87971f = -5261813987200935591L;

    /* renamed from: c, reason: collision with root package name */
    private final e<D> f87972c;

    /* renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.s f87973d;

    /* renamed from: e, reason: collision with root package name */
    private final org.threeten.bp.r f87974e;

    /* compiled from: ChronoZonedDateTimeImpl.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87975a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f87975a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87975a[org.threeten.bp.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private i(e<D> eVar, org.threeten.bp.s sVar, org.threeten.bp.r rVar) {
        this.f87972c = (e) ng.d.j(eVar, "dateTime");
        this.f87973d = (org.threeten.bp.s) ng.d.j(sVar, "offset");
        this.f87974e = (org.threeten.bp.r) ng.d.j(rVar, "zone");
    }

    private i<D> S(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return U(C().p(), fVar, rVar);
    }

    static <R extends c> h<R> T(e<R> eVar, org.threeten.bp.r rVar, org.threeten.bp.s sVar) {
        ng.d.j(eVar, "localDateTime");
        ng.d.j(rVar, "zone");
        if (rVar instanceof org.threeten.bp.s) {
            return new i(eVar, (org.threeten.bp.s) rVar, rVar);
        }
        org.threeten.bp.zone.f l4 = rVar.l();
        org.threeten.bp.h N = org.threeten.bp.h.N(eVar);
        List<org.threeten.bp.s> h4 = l4.h(N);
        if (h4.size() == 1) {
            sVar = h4.get(0);
        } else if (h4.size() == 0) {
            org.threeten.bp.zone.d e4 = l4.e(N);
            eVar = eVar.S(e4.d().n());
            sVar = e4.g();
        } else if (sVar == null || !h4.contains(sVar)) {
            sVar = h4.get(0);
        }
        ng.d.j(sVar, "offset");
        return new i(eVar, sVar, rVar);
    }

    static <R extends c> i<R> U(j jVar, org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        org.threeten.bp.s b5 = rVar.l().b(fVar);
        ng.d.j(b5, "offset");
        return new i<>((e) jVar.w(org.threeten.bp.h.z0(fVar.q(), fVar.r(), b5)), b5, rVar);
    }

    static h<?> V(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        d dVar = (d) objectInput.readObject();
        org.threeten.bp.s sVar = (org.threeten.bp.s) objectInput.readObject();
        return dVar.l(sVar).R((org.threeten.bp.r) objectInput.readObject());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 13, this);
    }

    @Override // org.threeten.bp.chrono.h
    public d<D> E() {
        return this.f87972c;
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.e
    /* renamed from: K */
    public h<D> b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return C().p().m(jVar.adjustInto(this, j4));
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i4 = a.f87975a[aVar.ordinal()];
        if (i4 == 1) {
            return v(j4 - A(), org.threeten.bp.temporal.b.SECONDS);
        }
        if (i4 != 2) {
            return T(this.f87972c.b(jVar, j4), this.f87974e, this.f87973d);
        }
        return S(this.f87972c.A(org.threeten.bp.s.A(aVar.checkValidIntValue(j4))), this.f87974e);
    }

    @Override // org.threeten.bp.chrono.h
    public h<D> M() {
        org.threeten.bp.zone.d e4 = this.f87974e.l().e(org.threeten.bp.h.N(this));
        if (e4 != null && e4.k()) {
            org.threeten.bp.s h4 = e4.h();
            if (!h4.equals(this.f87973d)) {
                return new i(this.f87972c, h4, this.f87974e);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.h
    public h<D> N() {
        org.threeten.bp.zone.d e4 = this.f87974e.l().e(org.threeten.bp.h.N(this));
        if (e4 != null) {
            org.threeten.bp.s g4 = e4.g();
            if (!g4.equals(this.f87973d)) {
                return new i(this.f87972c, g4, this.f87974e);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.h
    public h<D> P(org.threeten.bp.r rVar) {
        ng.d.j(rVar, "zone");
        return this.f87974e.equals(rVar) ? this : S(this.f87972c.A(this.f87973d), rVar);
    }

    @Override // org.threeten.bp.chrono.h
    public h<D> R(org.threeten.bp.r rVar) {
        return T(this.f87972c, rVar, this.f87973d);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isDateBased() || mVar.isTimeBased() : mVar != null && mVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.chrono.h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        h<?> M = C().p().M(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, M);
        }
        return this.f87972c.f(M.P(this.f87973d).E(), mVar);
    }

    @Override // org.threeten.bp.chrono.h
    public int hashCode() {
        return (this.f87972c.hashCode() ^ this.f87973d.hashCode()) ^ Integer.rotateLeft(this.f87974e.hashCode(), 3);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return (jVar instanceof org.threeten.bp.temporal.a) || (jVar != null && jVar.isSupportedBy(this));
    }

    @Override // org.threeten.bp.chrono.h
    public org.threeten.bp.s p() {
        return this.f87973d;
    }

    @Override // org.threeten.bp.chrono.h
    public org.threeten.bp.r q() {
        return this.f87974e;
    }

    @Override // org.threeten.bp.chrono.h
    public String toString() {
        String str = this.f87972c.toString() + this.f87973d.toString();
        if (this.f87973d == this.f87974e) {
            return str;
        }
        return str + '[' + this.f87974e.toString() + ']';
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.e
    /* renamed from: w */
    public h<D> v(long j4, org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? i(this.f87972c.v(j4, mVar)) : C().p().m(mVar.addTo(this, j4));
    }

    void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f87972c);
        objectOutput.writeObject(this.f87973d);
        objectOutput.writeObject(this.f87974e);
    }
}
