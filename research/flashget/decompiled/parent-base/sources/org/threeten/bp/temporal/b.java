package org.threeten.bp.temporal;

/* compiled from: ChronoUnit.java */
/* loaded from: classes9.dex */
public enum b implements m {
    NANOS("Nanos", org.threeten.bp.e.J(1)),
    MICROS("Micros", org.threeten.bp.e.J(1000)),
    MILLIS("Millis", org.threeten.bp.e.J(1000000)),
    SECONDS("Seconds", org.threeten.bp.e.K(1)),
    MINUTES("Minutes", org.threeten.bp.e.K(60)),
    HOURS("Hours", org.threeten.bp.e.K(3600)),
    HALF_DAYS("HalfDays", org.threeten.bp.e.K(43200)),
    DAYS("Days", org.threeten.bp.e.K(86400)),
    WEEKS("Weeks", org.threeten.bp.e.K(604800)),
    MONTHS("Months", org.threeten.bp.e.K(2629746)),
    YEARS("Years", org.threeten.bp.e.K(31556952)),
    DECADES("Decades", org.threeten.bp.e.K(315569520)),
    CENTURIES("Centuries", org.threeten.bp.e.K(3155695200L)),
    MILLENNIA("Millennia", org.threeten.bp.e.K(31556952000L)),
    ERAS("Eras", org.threeten.bp.e.K(31556952000000000L)),
    FOREVER("Forever", org.threeten.bp.e.L(Long.MAX_VALUE, 999999999));

    private final org.threeten.bp.e duration;
    private final String name;

    b(String str, org.threeten.bp.e eVar) {
        this.name = str;
        this.duration = eVar;
    }

    @Override // org.threeten.bp.temporal.m
    public <R extends e> R addTo(R r4, long j4) {
        return (R) r4.v(j4, this);
    }

    @Override // org.threeten.bp.temporal.m
    public long between(e eVar, e eVar2) {
        return eVar.f(eVar2, this);
    }

    @Override // org.threeten.bp.temporal.m
    public org.threeten.bp.e getDuration() {
        return this.duration;
    }

    @Override // org.threeten.bp.temporal.m
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // org.threeten.bp.temporal.m
    public boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    @Override // org.threeten.bp.temporal.m
    public boolean isSupportedBy(e eVar) {
        if (this == FOREVER) {
            return false;
        }
        if (eVar instanceof org.threeten.bp.chrono.c) {
            return isDateBased();
        }
        if ((eVar instanceof org.threeten.bp.chrono.d) || (eVar instanceof org.threeten.bp.chrono.h)) {
            return true;
        }
        try {
            eVar.v(1L, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                eVar.v(-1L, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    @Override // org.threeten.bp.temporal.m
    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // java.lang.Enum, org.threeten.bp.temporal.m
    public String toString() {
        return this.name;
    }
}
