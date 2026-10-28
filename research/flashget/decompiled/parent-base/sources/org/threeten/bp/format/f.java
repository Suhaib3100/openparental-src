package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.o;
import org.threeten.bp.r;
import org.threeten.bp.s;

/* compiled from: DateTimePrintContext.java */
/* loaded from: classes9.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private org.threeten.bp.temporal.f f88202a;

    /* renamed from: b, reason: collision with root package name */
    private Locale f88203b;

    /* renamed from: c, reason: collision with root package name */
    private h f88204c;

    /* renamed from: d, reason: collision with root package name */
    private int f88205d;

    /* compiled from: DateTimePrintContext.java */
    class a extends ng.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.threeten.bp.chrono.c f88206b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ org.threeten.bp.temporal.f f88207c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ org.threeten.bp.chrono.j f88208d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f88209e;

        a(org.threeten.bp.chrono.c cVar, org.threeten.bp.temporal.f fVar, org.threeten.bp.chrono.j jVar, r rVar) {
            this.f88206b = cVar;
            this.f88207c = fVar;
            this.f88208d = jVar;
            this.f88209e = rVar;
        }

        @Override // org.threeten.bp.temporal.f
        public long getLong(org.threeten.bp.temporal.j jVar) {
            return (this.f88206b == null || !jVar.isDateBased()) ? this.f88207c.getLong(jVar) : this.f88206b.getLong(jVar);
        }

        @Override // org.threeten.bp.temporal.f
        public boolean isSupported(org.threeten.bp.temporal.j jVar) {
            return (this.f88206b == null || !jVar.isDateBased()) ? this.f88207c.isSupported(jVar) : this.f88206b.isSupported(jVar);
        }

        @Override // ng.c, org.threeten.bp.temporal.f
        public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
            return lVar == org.threeten.bp.temporal.k.a() ? (R) this.f88208d : lVar == org.threeten.bp.temporal.k.g() ? (R) this.f88209e : lVar == org.threeten.bp.temporal.k.e() ? (R) this.f88207c.query(lVar) : lVar.a(this);
        }

        @Override // ng.c, org.threeten.bp.temporal.f
        public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
            return (this.f88206b == null || !jVar.isDateBased()) ? this.f88207c.range(jVar) : this.f88206b.range(jVar);
        }
    }

    f(org.threeten.bp.temporal.f fVar, c cVar) {
        this.f88202a = a(fVar, cVar);
        this.f88203b = cVar.h();
        this.f88204c = cVar.g();
    }

    private static org.threeten.bp.temporal.f a(org.threeten.bp.temporal.f fVar, c cVar) {
        org.threeten.bp.chrono.j f4 = cVar.f();
        r k4 = cVar.k();
        if (f4 == null && k4 == null) {
            return fVar;
        }
        org.threeten.bp.chrono.j jVar = (org.threeten.bp.chrono.j) fVar.query(org.threeten.bp.temporal.k.a());
        r rVar = (r) fVar.query(org.threeten.bp.temporal.k.g());
        org.threeten.bp.chrono.c cVar2 = null;
        if (ng.d.c(jVar, f4)) {
            f4 = null;
        }
        if (ng.d.c(rVar, k4)) {
            k4 = null;
        }
        if (f4 == null && k4 == null) {
            return fVar;
        }
        org.threeten.bp.chrono.j jVar2 = f4 != null ? f4 : jVar;
        if (k4 != null) {
            rVar = k4;
        }
        if (k4 != null) {
            if (fVar.isSupported(org.threeten.bp.temporal.a.INSTANT_SECONDS)) {
                if (jVar2 == null) {
                    jVar2 = o.f88011f;
                }
                return jVar2.L(org.threeten.bp.f.p(fVar), k4);
            }
            r m4 = k4.m();
            s sVar = (s) fVar.query(org.threeten.bp.temporal.k.d());
            if ((m4 instanceof s) && sVar != null && !m4.equals(sVar)) {
                throw new DateTimeException("Invalid override zone for temporal: " + k4 + " " + fVar);
            }
        }
        if (f4 != null) {
            if (fVar.isSupported(org.threeten.bp.temporal.a.EPOCH_DAY)) {
                cVar2 = jVar2.d(fVar);
            } else if (f4 != o.f88011f || jVar != null) {
                for (org.threeten.bp.temporal.a aVar : org.threeten.bp.temporal.a.values()) {
                    if (aVar.isDateBased() && fVar.isSupported(aVar)) {
                        throw new DateTimeException("Invalid override chronology for temporal: " + f4 + " " + fVar);
                    }
                }
            }
        }
        return new a(cVar2, fVar, jVar2, rVar);
    }

    void b() {
        this.f88205d--;
    }

    Locale c() {
        return this.f88203b;
    }

    h d() {
        return this.f88204c;
    }

    org.threeten.bp.temporal.f e() {
        return this.f88202a;
    }

    Long f(org.threeten.bp.temporal.j jVar) {
        try {
            return Long.valueOf(this.f88202a.getLong(jVar));
        } catch (DateTimeException e4) {
            if (this.f88205d > 0) {
                return null;
            }
            throw e4;
        }
    }

    <R> R g(org.threeten.bp.temporal.l<R> lVar) {
        R r4 = (R) this.f88202a.query(lVar);
        if (r4 != null || this.f88205d != 0) {
            return r4;
        }
        throw new DateTimeException("Unable to extract value: " + this.f88202a.getClass());
    }

    void h(org.threeten.bp.temporal.f fVar) {
        ng.d.j(fVar, "temporal");
        this.f88202a = fVar;
    }

    void i(Locale locale) {
        ng.d.j(locale, "locale");
        this.f88203b = locale;
    }

    void j() {
        this.f88205d++;
    }

    public String toString() {
        return this.f88202a.toString();
    }

    f(org.threeten.bp.temporal.f fVar, Locale locale, h hVar) {
        this.f88202a = fVar;
        this.f88203b = locale;
        this.f88204c = hVar;
    }
}
