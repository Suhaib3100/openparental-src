package org.threeten.bp.temporal;

import androidx.core.graphics.y;
import java.util.Locale;
import java.util.Map;

/* compiled from: IsoFields.java */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f88347a = b.DAY_OF_QUARTER;

    /* renamed from: b, reason: collision with root package name */
    public static final j f88348b = b.QUARTER_OF_YEAR;

    /* renamed from: c, reason: collision with root package name */
    public static final j f88349c = b.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: d, reason: collision with root package name */
    public static final j f88350d = b.WEEK_BASED_YEAR;

    /* renamed from: e, reason: collision with root package name */
    public static final m f88351e = EnumC1370c.WEEK_BASED_YEARS;

    /* renamed from: f, reason: collision with root package name */
    public static final m f88352f = EnumC1370c.QUARTER_YEARS;

    /* compiled from: IsoFields.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88353a;

        static {
            int[] iArr = new int[EnumC1370c.values().length];
            f88353a = iArr;
            try {
                iArr[EnumC1370c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88353a[EnumC1370c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IsoFields.java */
    private static abstract class b implements j {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DAY_OF_QUARTER;
        private static final int[] QUARTER_DAYS;
        public static final b QUARTER_OF_YEAR;
        public static final b WEEK_BASED_YEAR;
        public static final b WEEK_OF_WEEK_BASED_YEAR;

        /* compiled from: IsoFields.java */
        enum a extends b {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // org.threeten.bp.temporal.j
            public <R extends e> R adjustInto(R r4, long j4) {
                long from = getFrom(r4);
                range().b(j4, this);
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.DAY_OF_YEAR;
                return (R) r4.b(aVar, (j4 - from) + r4.getLong(aVar));
            }

            @Override // org.threeten.bp.temporal.j
            public m getBaseUnit() {
                return org.threeten.bp.temporal.b.DAYS;
            }

            @Override // org.threeten.bp.temporal.j
            public long getFrom(f fVar) {
                if (!fVar.isSupported(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                return fVar.get(org.threeten.bp.temporal.a.DAY_OF_YEAR) - b.QUARTER_DAYS[((fVar.get(org.threeten.bp.temporal.a.MONTH_OF_YEAR) - 1) / 3) + (org.threeten.bp.chrono.o.f88011f.v(fVar.getLong(org.threeten.bp.temporal.a.YEAR)) ? 4 : 0)];
            }

            @Override // org.threeten.bp.temporal.j
            public m getRangeUnit() {
                return c.f88352f;
            }

            @Override // org.threeten.bp.temporal.j
            public boolean isSupportedBy(f fVar) {
                return fVar.isSupported(org.threeten.bp.temporal.a.DAY_OF_YEAR) && fVar.isSupported(org.threeten.bp.temporal.a.MONTH_OF_YEAR) && fVar.isSupported(org.threeten.bp.temporal.a.YEAR) && b.isIso(fVar);
            }

            @Override // org.threeten.bp.temporal.j
            public n range() {
                return n.m(1L, 1L, 90L, 92L);
            }

            @Override // org.threeten.bp.temporal.j
            public n rangeRefinedBy(f fVar) {
                if (!fVar.isSupported(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long j4 = fVar.getLong(b.QUARTER_OF_YEAR);
                if (j4 == 1) {
                    return org.threeten.bp.chrono.o.f88011f.v(fVar.getLong(org.threeten.bp.temporal.a.YEAR)) ? n.k(1L, 91L) : n.k(1L, 90L);
                }
                return j4 == 2 ? n.k(1L, 91L) : (j4 == 3 || j4 == 4) ? n.k(1L, 92L) : range();
            }

            @Override // org.threeten.bp.temporal.c.b, org.threeten.bp.temporal.j
            public f resolve(Map<j, Long> map, f fVar, org.threeten.bp.format.j jVar) {
                org.threeten.bp.g F0;
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.YEAR;
                Long l4 = map.get(aVar);
                j jVar2 = b.QUARTER_OF_YEAR;
                Long l5 = map.get(jVar2);
                if (l4 == null || l5 == null) {
                    return null;
                }
                int checkValidIntValue = aVar.checkValidIntValue(l4.longValue());
                long longValue = map.get(b.DAY_OF_QUARTER).longValue();
                if (jVar == org.threeten.bp.format.j.LENIENT) {
                    F0 = org.threeten.bp.g.x0(checkValidIntValue, 1, 1).G0(ng.d.n(ng.d.q(l5.longValue(), 1L), 3)).F0(ng.d.q(longValue, 1L));
                } else {
                    int a5 = jVar2.range().a(l5.longValue(), jVar2);
                    if (jVar == org.threeten.bp.format.j.STRICT) {
                        int i4 = 91;
                        if (a5 == 1) {
                            if (!org.threeten.bp.chrono.o.f88011f.v(checkValidIntValue)) {
                                i4 = 90;
                            }
                        } else if (a5 != 2) {
                            i4 = 92;
                        }
                        n.k(1L, i4).b(longValue, this);
                    } else {
                        range().b(longValue, this);
                    }
                    F0 = org.threeten.bp.g.x0(checkValidIntValue, y.a(a5, 1, 3, 1), 1).F0(longValue - 1);
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(jVar2);
                return F0;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: org.threeten.bp.temporal.c$b$b, reason: collision with other inner class name */
        enum C1368b extends b {
            C1368b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // org.threeten.bp.temporal.j
            public <R extends e> R adjustInto(R r4, long j4) {
                long from = getFrom(r4);
                range().b(j4, this);
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.MONTH_OF_YEAR;
                return (R) r4.b(aVar, ((j4 - from) * 3) + r4.getLong(aVar));
            }

            @Override // org.threeten.bp.temporal.j
            public m getBaseUnit() {
                return c.f88352f;
            }

            @Override // org.threeten.bp.temporal.j
            public long getFrom(f fVar) {
                if (fVar.isSupported(this)) {
                    return (fVar.getLong(org.threeten.bp.temporal.a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // org.threeten.bp.temporal.j
            public m getRangeUnit() {
                return org.threeten.bp.temporal.b.YEARS;
            }

            @Override // org.threeten.bp.temporal.j
            public boolean isSupportedBy(f fVar) {
                return fVar.isSupported(org.threeten.bp.temporal.a.MONTH_OF_YEAR) && b.isIso(fVar);
            }

            @Override // org.threeten.bp.temporal.j
            public n range() {
                return n.k(1L, 4L);
            }

            @Override // org.threeten.bp.temporal.j
            public n rangeRefinedBy(f fVar) {
                return range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: org.threeten.bp.temporal.c$b$c, reason: collision with other inner class name */
        enum C1369c extends b {
            C1369c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // org.threeten.bp.temporal.j
            public <R extends e> R adjustInto(R r4, long j4) {
                range().b(j4, this);
                return (R) r4.v(ng.d.q(j4, getFrom(r4)), org.threeten.bp.temporal.b.WEEKS);
            }

            @Override // org.threeten.bp.temporal.j
            public m getBaseUnit() {
                return org.threeten.bp.temporal.b.WEEKS;
            }

            @Override // org.threeten.bp.temporal.c.b, org.threeten.bp.temporal.j
            public String getDisplayName(Locale locale) {
                ng.d.j(locale, "locale");
                return "Week";
            }

            @Override // org.threeten.bp.temporal.j
            public long getFrom(f fVar) {
                if (fVar.isSupported(this)) {
                    return b.getWeek(org.threeten.bp.g.Z(fVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.j
            public m getRangeUnit() {
                return c.f88351e;
            }

            @Override // org.threeten.bp.temporal.j
            public boolean isSupportedBy(f fVar) {
                return fVar.isSupported(org.threeten.bp.temporal.a.EPOCH_DAY) && b.isIso(fVar);
            }

            @Override // org.threeten.bp.temporal.j
            public n range() {
                return n.m(1L, 1L, 52L, 53L);
            }

            @Override // org.threeten.bp.temporal.j
            public n rangeRefinedBy(f fVar) {
                if (fVar.isSupported(this)) {
                    return b.getWeekRange(org.threeten.bp.g.Z(fVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.c.b, org.threeten.bp.temporal.j
            public f resolve(Map<j, Long> map, f fVar, org.threeten.bp.format.j jVar) {
                j jVar2;
                org.threeten.bp.g K;
                long j4;
                j jVar3 = b.WEEK_BASED_YEAR;
                Long l4 = map.get(jVar3);
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.DAY_OF_WEEK;
                Long l5 = map.get(aVar);
                if (l4 == null || l5 == null) {
                    return null;
                }
                int a5 = jVar3.range().a(l4.longValue(), jVar3);
                long longValue = map.get(b.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (jVar == org.threeten.bp.format.j.LENIENT) {
                    long longValue2 = l5.longValue();
                    if (longValue2 > 7) {
                        long j5 = longValue2 - 1;
                        j4 = j5 / 7;
                        longValue2 = (j5 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j4 = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    } else {
                        j4 = 0;
                    }
                    jVar2 = jVar3;
                    K = org.threeten.bp.g.x0(a5, 1, 4).H0(longValue - 1).H0(j4).K(aVar, longValue2);
                } else {
                    jVar2 = jVar3;
                    int checkValidIntValue = aVar.checkValidIntValue(l5.longValue());
                    if (jVar == org.threeten.bp.format.j.STRICT) {
                        b.getWeekRange(org.threeten.bp.g.x0(a5, 1, 4)).b(longValue, this);
                    } else {
                        range().b(longValue, this);
                    }
                    K = org.threeten.bp.g.x0(a5, 1, 4).H0(longValue - 1).K(aVar, checkValidIntValue);
                }
                map.remove(this);
                map.remove(jVar2);
                map.remove(aVar);
                return K;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        /* compiled from: IsoFields.java */
        enum d extends b {
            d(String str, int i4) {
                super(str, i4, null);
            }

            @Override // org.threeten.bp.temporal.j
            public <R extends e> R adjustInto(R r4, long j4) {
                if (!isSupportedBy(r4)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int a5 = range().a(j4, b.WEEK_BASED_YEAR);
                org.threeten.bp.g Z = org.threeten.bp.g.Z(r4);
                int i4 = Z.get(org.threeten.bp.temporal.a.DAY_OF_WEEK);
                int week = b.getWeek(Z);
                if (week == 53 && b.getWeekRange(a5) == 52) {
                    week = 52;
                }
                return (R) r4.i(org.threeten.bp.g.x0(a5, 1, 4).F0(y.a(week, 1, 7, i4 - r6.get(r0))));
            }

            @Override // org.threeten.bp.temporal.j
            public m getBaseUnit() {
                return c.f88351e;
            }

            @Override // org.threeten.bp.temporal.j
            public long getFrom(f fVar) {
                if (fVar.isSupported(this)) {
                    return b.getWeekBasedYear(org.threeten.bp.g.Z(fVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.j
            public m getRangeUnit() {
                return org.threeten.bp.temporal.b.FOREVER;
            }

            @Override // org.threeten.bp.temporal.j
            public boolean isSupportedBy(f fVar) {
                return fVar.isSupported(org.threeten.bp.temporal.a.EPOCH_DAY) && b.isIso(fVar);
            }

            @Override // org.threeten.bp.temporal.j
            public n range() {
                return org.threeten.bp.temporal.a.YEAR.range();
            }

            @Override // org.threeten.bp.temporal.j
            public n rangeRefinedBy(f fVar) {
                return org.threeten.bp.temporal.a.YEAR.range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a("DAY_OF_QUARTER", 0);
            DAY_OF_QUARTER = aVar;
            C1368b c1368b = new C1368b("QUARTER_OF_YEAR", 1);
            QUARTER_OF_YEAR = c1368b;
            C1369c c1369c = new C1369c("WEEK_OF_WEEK_BASED_YEAR", 2);
            WEEK_OF_WEEK_BASED_YEAR = c1369c;
            d dVar = new d("WEEK_BASED_YEAR", 3);
            WEEK_BASED_YEAR = dVar;
            $VALUES = new b[]{aVar, c1368b, c1369c, dVar};
            QUARTER_DAYS = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private b(String str, int i4) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(org.threeten.bp.g gVar) {
            int ordinal = gVar.d0().ordinal();
            int e02 = gVar.e0() - 1;
            int i4 = (3 - ordinal) + e02;
            int i5 = i4 - ((i4 / 7) * 7);
            int i6 = i5 - 3;
            if (i6 < -3) {
                i6 = i5 + 4;
            }
            if (e02 < i6) {
                return (int) getWeekRange(gVar.S0(180).s0(1L)).d();
            }
            int a5 = androidx.appcompat.widget.a.a(e02, i6, 7, 1);
            if (a5 != 53 || i6 == -3 || (i6 == -2 && gVar.u())) {
                return a5;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(org.threeten.bp.g gVar) {
            int i02 = gVar.i0();
            int e02 = gVar.e0();
            if (e02 <= 3) {
                return e02 - gVar.d0().ordinal() < -2 ? i02 - 1 : i02;
            }
            if (e02 >= 363) {
                return ((e02 - 363) - (gVar.u() ? 1 : 0)) - gVar.d0().ordinal() >= 0 ? i02 + 1 : i02;
            }
            return i02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static n getWeekRange(org.threeten.bp.g gVar) {
            return n.k(1L, getWeekRange(getWeekBasedYear(gVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isIso(f fVar) {
            return org.threeten.bp.chrono.j.p(fVar).equals(org.threeten.bp.chrono.o.f88011f);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // org.threeten.bp.temporal.j
        public String getDisplayName(Locale locale) {
            ng.d.j(locale, "locale");
            return toString();
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.j
        public f resolve(Map<j, Long> map, f fVar, org.threeten.bp.format.j jVar) {
            return null;
        }

        /* synthetic */ b(String str, int i4, a aVar) {
            this(str, i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i4) {
            org.threeten.bp.g x02 = org.threeten.bp.g.x0(i4, 1, 1);
            if (x02.d0() != org.threeten.bp.d.THURSDAY) {
                return (x02.d0() == org.threeten.bp.d.WEDNESDAY && x02.u()) ? 53 : 52;
            }
            return 53;
        }
    }

    /* compiled from: IsoFields.java */
    /* renamed from: org.threeten.bp.temporal.c$c, reason: collision with other inner class name */
    private enum EnumC1370c implements m {
        WEEK_BASED_YEARS("WeekBasedYears", org.threeten.bp.e.K(31556952)),
        QUARTER_YEARS("QuarterYears", org.threeten.bp.e.K(7889238));

        private final org.threeten.bp.e duration;
        private final String name;

        EnumC1370c(String str, org.threeten.bp.e eVar) {
            this.name = str;
            this.duration = eVar;
        }

        @Override // org.threeten.bp.temporal.m
        public <R extends e> R addTo(R r4, long j4) {
            int i4 = a.f88353a[ordinal()];
            if (i4 == 1) {
                return (R) r4.b(c.f88350d, ng.d.l(r4.get(r0), j4));
            }
            if (i4 == 2) {
                return (R) r4.v(j4 / 256, org.threeten.bp.temporal.b.YEARS).v((j4 % 256) * 3, org.threeten.bp.temporal.b.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // org.threeten.bp.temporal.m
        public long between(e eVar, e eVar2) {
            int i4 = a.f88353a[ordinal()];
            if (i4 == 1) {
                j jVar = c.f88350d;
                return ng.d.q(eVar2.getLong(jVar), eVar.getLong(jVar));
            }
            if (i4 == 2) {
                return eVar.f(eVar2, org.threeten.bp.temporal.b.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // org.threeten.bp.temporal.m
        public org.threeten.bp.e getDuration() {
            return this.duration;
        }

        @Override // org.threeten.bp.temporal.m
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.m
        public boolean isDurationEstimated() {
            return true;
        }

        @Override // org.threeten.bp.temporal.m
        public boolean isSupportedBy(e eVar) {
            return eVar.isSupported(org.threeten.bp.temporal.a.EPOCH_DAY);
        }

        @Override // org.threeten.bp.temporal.m
        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum, org.threeten.bp.temporal.m
        public String toString() {
            return this.name;
        }
    }

    private c() {
        throw new AssertionError("Not instantiable");
    }
}
