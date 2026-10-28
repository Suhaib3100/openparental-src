package org.threeten.bp;

import java.util.Locale;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: DayOfWeek.java */
/* loaded from: classes9.dex */
public enum d implements org.threeten.bp.temporal.f, org.threeten.bp.temporal.g {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static final org.threeten.bp.temporal.l<d> FROM = new a();
    private static final d[] ENUMS = values();

    /* compiled from: DayOfWeek.java */
    class a implements org.threeten.bp.temporal.l<d> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(org.threeten.bp.temporal.f fVar) {
            return d.from(fVar);
        }
    }

    public static d from(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof d) {
            return (d) fVar;
        }
        try {
            return of(fVar.get(org.threeten.bp.temporal.a.DAY_OF_WEEK));
        } catch (DateTimeException e4) {
            throw new DateTimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName(), e4);
        }
    }

    public static d of(int i4) {
        if (i4 < 1 || i4 > 7) {
            throw new DateTimeException(android.support.v4.media.a.a("Invalid value for DayOfWeek: ", i4));
        }
        return ENUMS[i4 - 1];
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.DAY_OF_WEEK, getValue());
    }

    @Override // org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return jVar == org.threeten.bp.temporal.a.DAY_OF_WEEK ? getValue() : range(jVar).a(getLong(jVar), jVar);
    }

    public String getDisplayName(org.threeten.bp.format.n nVar, Locale locale) {
        return new org.threeten.bp.format.d().r(org.threeten.bp.temporal.a.DAY_OF_WEEK, nVar).Q(locale).d(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
        return jVar.getFrom(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.DAY_OF_WEEK : jVar != null && jVar.isSupportedBy(this);
    }

    public d minus(long j4) {
        return plus(-(j4 % 7));
    }

    public d plus(long j4) {
        return ENUMS[((((int) (j4 % 7)) + 7) + ordinal()) % 7];
    }

    @Override // org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.DAYS;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.DAY_OF_WEEK) {
            return jVar.range();
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
        return jVar.rangeRefinedBy(this);
    }
}
