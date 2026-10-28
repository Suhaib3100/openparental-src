package org.threeten.bp.temporal;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.p;

/* compiled from: WeekFields.java */
/* loaded from: classes9.dex */
public final class o implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap<String, o> f88380i = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: j, reason: collision with root package name */
    public static final o f88381j = new o(org.threeten.bp.d.MONDAY, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final o f88382k = f(org.threeten.bp.d.SUNDAY, 1);

    /* renamed from: l, reason: collision with root package name */
    private static final long f88383l = -1177360819670808121L;

    /* renamed from: b, reason: collision with root package name */
    private final org.threeten.bp.d f88384b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88385c;

    /* renamed from: d, reason: collision with root package name */
    private final transient j f88386d = a.g(this);

    /* renamed from: e, reason: collision with root package name */
    private final transient j f88387e = a.i(this);

    /* renamed from: f, reason: collision with root package name */
    private final transient j f88388f = a.k(this);

    /* renamed from: g, reason: collision with root package name */
    private final transient j f88389g = a.j(this);

    /* renamed from: h, reason: collision with root package name */
    private final transient j f88390h = a.h(this);

    /* compiled from: WeekFields.java */
    static class a implements j {

        /* renamed from: g, reason: collision with root package name */
        private static final n f88391g = n.k(1, 7);

        /* renamed from: h, reason: collision with root package name */
        private static final n f88392h = n.m(0, 1, 4, 6);

        /* renamed from: i, reason: collision with root package name */
        private static final n f88393i = n.m(0, 1, 52, 54);

        /* renamed from: j, reason: collision with root package name */
        private static final n f88394j = n.m(1, 1, 52, 53);

        /* renamed from: k, reason: collision with root package name */
        private static final n f88395k = org.threeten.bp.temporal.a.YEAR.range();

        /* renamed from: b, reason: collision with root package name */
        private final String f88396b;

        /* renamed from: c, reason: collision with root package name */
        private final o f88397c;

        /* renamed from: d, reason: collision with root package name */
        private final m f88398d;

        /* renamed from: e, reason: collision with root package name */
        private final m f88399e;

        /* renamed from: f, reason: collision with root package name */
        private final n f88400f;

        private a(String str, o oVar, m mVar, m mVar2, n nVar) {
            this.f88396b = str;
            this.f88397c = oVar;
            this.f88398d = mVar;
            this.f88399e = mVar2;
            this.f88400f = nVar;
        }

        private int a(int i4, int i5) {
            return ((i5 - 1) + (i4 + 7)) / 7;
        }

        private int b(f fVar, int i4) {
            return ng.d.f(fVar.get(org.threeten.bp.temporal.a.DAY_OF_WEEK) - i4, 7) + 1;
        }

        private int c(f fVar) {
            int f4 = ng.d.f(fVar.get(org.threeten.bp.temporal.a.DAY_OF_WEEK) - this.f88397c.c().getValue(), 7) + 1;
            int i4 = fVar.get(org.threeten.bp.temporal.a.YEAR);
            long f5 = f(fVar, f4);
            if (f5 == 0) {
                return i4 - 1;
            }
            if (f5 < 53) {
                return i4;
            }
            return f5 >= ((long) a(m(fVar.get(org.threeten.bp.temporal.a.DAY_OF_YEAR), f4), this.f88397c.d() + (p.v((long) i4) ? 366 : 365))) ? i4 + 1 : i4;
        }

        private int d(f fVar) {
            int f4 = ng.d.f(fVar.get(org.threeten.bp.temporal.a.DAY_OF_WEEK) - this.f88397c.c().getValue(), 7) + 1;
            long f5 = f(fVar, f4);
            if (f5 == 0) {
                return ((int) f(org.threeten.bp.chrono.j.p(fVar).d(fVar).t(1L, b.WEEKS), f4)) + 1;
            }
            if (f5 >= 53) {
                if (f5 >= a(m(fVar.get(org.threeten.bp.temporal.a.DAY_OF_YEAR), f4), this.f88397c.d() + (p.v((long) fVar.get(org.threeten.bp.temporal.a.YEAR)) ? 366 : 365))) {
                    return (int) (f5 - (r6 - 1));
                }
            }
            return (int) f5;
        }

        private long e(f fVar, int i4) {
            int i5 = fVar.get(org.threeten.bp.temporal.a.DAY_OF_MONTH);
            return a(m(i5, i4), i5);
        }

        private long f(f fVar, int i4) {
            int i5 = fVar.get(org.threeten.bp.temporal.a.DAY_OF_YEAR);
            return a(m(i5, i4), i5);
        }

        static a g(o oVar) {
            return new a("DayOfWeek", oVar, b.DAYS, b.WEEKS, f88391g);
        }

        static a h(o oVar) {
            return new a("WeekBasedYear", oVar, c.f88351e, b.FOREVER, f88395k);
        }

        static a i(o oVar) {
            return new a("WeekOfMonth", oVar, b.WEEKS, b.MONTHS, f88392h);
        }

        static a j(o oVar) {
            return new a("WeekOfWeekBasedYear", oVar, b.WEEKS, c.f88351e, f88394j);
        }

        static a k(o oVar) {
            return new a("WeekOfYear", oVar, b.WEEKS, b.YEARS, f88393i);
        }

        private n l(f fVar) {
            int f4 = ng.d.f(fVar.get(org.threeten.bp.temporal.a.DAY_OF_WEEK) - this.f88397c.c().getValue(), 7) + 1;
            long f5 = f(fVar, f4);
            if (f5 == 0) {
                return l(org.threeten.bp.chrono.j.p(fVar).d(fVar).t(2L, b.WEEKS));
            }
            return f5 >= ((long) a(m(fVar.get(org.threeten.bp.temporal.a.DAY_OF_YEAR), f4), this.f88397c.d() + (p.v((long) fVar.get(org.threeten.bp.temporal.a.YEAR)) ? 366 : 365))) ? l(org.threeten.bp.chrono.j.p(fVar).d(fVar).v(2L, b.WEEKS)) : n.k(1L, r0 - 1);
        }

        private int m(int i4, int i5) {
            int f4 = ng.d.f(i4 - i5, 7);
            return f4 + 1 > this.f88397c.d() ? 7 - f4 : -f4;
        }

        @Override // org.threeten.bp.temporal.j
        public <R extends e> R adjustInto(R r4, long j4) {
            int a5 = this.f88400f.a(j4, this);
            if (a5 == r4.get(this)) {
                return r4;
            }
            if (this.f88399e != b.FOREVER) {
                return (R) r4.v(a5 - r1, this.f88398d);
            }
            int i4 = r4.get(this.f88397c.f88389g);
            long j5 = (long) ((j4 - r1) * 52.1775d);
            b bVar = b.WEEKS;
            e v4 = r4.v(j5, bVar);
            if (v4.get(this) > a5) {
                return (R) v4.t(v4.get(this.f88397c.f88389g), bVar);
            }
            if (v4.get(this) < a5) {
                v4 = v4.v(2L, bVar);
            }
            R r5 = (R) v4.v(i4 - v4.get(this.f88397c.f88389g), bVar);
            return r5.get(this) > a5 ? (R) r5.t(1L, bVar) : r5;
        }

        @Override // org.threeten.bp.temporal.j
        public m getBaseUnit() {
            return this.f88398d;
        }

        @Override // org.threeten.bp.temporal.j
        public String getDisplayName(Locale locale) {
            ng.d.j(locale, "locale");
            return this.f88399e == b.YEARS ? "Week" : toString();
        }

        @Override // org.threeten.bp.temporal.j
        public long getFrom(f fVar) {
            int c5;
            int f4 = ng.d.f(fVar.get(org.threeten.bp.temporal.a.DAY_OF_WEEK) - this.f88397c.c().getValue(), 7) + 1;
            m mVar = this.f88399e;
            if (mVar == b.WEEKS) {
                return f4;
            }
            if (mVar == b.MONTHS) {
                int i4 = fVar.get(org.threeten.bp.temporal.a.DAY_OF_MONTH);
                c5 = a(m(i4, f4), i4);
            } else if (mVar == b.YEARS) {
                int i5 = fVar.get(org.threeten.bp.temporal.a.DAY_OF_YEAR);
                c5 = a(m(i5, f4), i5);
            } else if (mVar == c.f88351e) {
                c5 = d(fVar);
            } else {
                if (mVar != b.FOREVER) {
                    throw new IllegalStateException("unreachable");
                }
                c5 = c(fVar);
            }
            return c5;
        }

        @Override // org.threeten.bp.temporal.j
        public m getRangeUnit() {
            return this.f88399e;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isSupportedBy(f fVar) {
            if (!fVar.isSupported(org.threeten.bp.temporal.a.DAY_OF_WEEK)) {
                return false;
            }
            m mVar = this.f88399e;
            if (mVar == b.WEEKS) {
                return true;
            }
            if (mVar == b.MONTHS) {
                return fVar.isSupported(org.threeten.bp.temporal.a.DAY_OF_MONTH);
            }
            if (mVar == b.YEARS) {
                return fVar.isSupported(org.threeten.bp.temporal.a.DAY_OF_YEAR);
            }
            if (mVar == c.f88351e) {
                return fVar.isSupported(org.threeten.bp.temporal.a.EPOCH_DAY);
            }
            if (mVar == b.FOREVER) {
                return fVar.isSupported(org.threeten.bp.temporal.a.EPOCH_DAY);
            }
            return false;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.j
        public n range() {
            return this.f88400f;
        }

        @Override // org.threeten.bp.temporal.j
        public n rangeRefinedBy(f fVar) {
            org.threeten.bp.temporal.a aVar;
            m mVar = this.f88399e;
            if (mVar == b.WEEKS) {
                return this.f88400f;
            }
            if (mVar == b.MONTHS) {
                aVar = org.threeten.bp.temporal.a.DAY_OF_MONTH;
            } else {
                if (mVar != b.YEARS) {
                    if (mVar == c.f88351e) {
                        return l(fVar);
                    }
                    if (mVar == b.FOREVER) {
                        return fVar.range(org.threeten.bp.temporal.a.YEAR);
                    }
                    throw new IllegalStateException("unreachable");
                }
                aVar = org.threeten.bp.temporal.a.DAY_OF_YEAR;
            }
            int m4 = m(fVar.get(aVar), ng.d.f(fVar.get(org.threeten.bp.temporal.a.DAY_OF_WEEK) - this.f88397c.c().getValue(), 7) + 1);
            n range = fVar.range(aVar);
            return n.k(a(m4, (int) range.e()), a(m4, (int) range.d()));
        }

        @Override // org.threeten.bp.temporal.j
        public f resolve(Map<j, Long> map, f fVar, org.threeten.bp.format.j jVar) {
            long j4;
            int b5;
            long a5;
            org.threeten.bp.chrono.c b6;
            long a6;
            org.threeten.bp.chrono.c b7;
            long a7;
            int b10;
            long f4;
            int value = this.f88397c.c().getValue();
            if (this.f88399e == b.WEEKS) {
                map.put(org.threeten.bp.temporal.a.DAY_OF_WEEK, Long.valueOf(ng.d.f((this.f88400f.a(map.remove(this).longValue(), this) - 1) + (value - 1), 7) + 1));
                return null;
            }
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.DAY_OF_WEEK;
            if (!map.containsKey(aVar)) {
                return null;
            }
            if (this.f88399e == b.FOREVER) {
                if (!map.containsKey(this.f88397c.f88389g)) {
                    return null;
                }
                org.threeten.bp.chrono.j p4 = org.threeten.bp.chrono.j.p(fVar);
                int f5 = ng.d.f(aVar.checkValidIntValue(map.get(aVar).longValue()) - value, 7) + 1;
                int a8 = range().a(map.get(this).longValue(), this);
                if (jVar == org.threeten.bp.format.j.LENIENT) {
                    b7 = p4.b(a8, 1, this.f88397c.d());
                    a7 = map.get(this.f88397c.f88389g).longValue();
                    b10 = b(b7, value);
                    f4 = f(b7, b10);
                } else {
                    b7 = p4.b(a8, 1, this.f88397c.d());
                    a7 = this.f88397c.f88389g.range().a(map.get(this.f88397c.f88389g).longValue(), this.f88397c.f88389g);
                    b10 = b(b7, value);
                    f4 = f(b7, b10);
                }
                org.threeten.bp.chrono.c v4 = b7.v(((a7 - f4) * 7) + (f5 - b10), b.DAYS);
                if (jVar == org.threeten.bp.format.j.STRICT && v4.getLong(this) != map.get(this).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(this.f88397c.f88389g);
                map.remove(aVar);
                return v4;
            }
            org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.YEAR;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            int f6 = ng.d.f(aVar.checkValidIntValue(map.get(aVar).longValue()) - value, 7) + 1;
            int checkValidIntValue = aVar2.checkValidIntValue(map.get(aVar2).longValue());
            org.threeten.bp.chrono.j p5 = org.threeten.bp.chrono.j.p(fVar);
            m mVar = this.f88399e;
            b bVar = b.MONTHS;
            if (mVar != bVar) {
                if (mVar != b.YEARS) {
                    throw new IllegalStateException("unreachable");
                }
                long longValue = map.remove(this).longValue();
                org.threeten.bp.chrono.c b11 = p5.b(checkValidIntValue, 1, 1);
                if (jVar == org.threeten.bp.format.j.LENIENT) {
                    b5 = b(b11, value);
                    a5 = longValue - f(b11, b5);
                    j4 = 7;
                } else {
                    j4 = 7;
                    b5 = b(b11, value);
                    a5 = this.f88400f.a(longValue, this) - f(b11, b5);
                }
                org.threeten.bp.chrono.c v5 = b11.v((a5 * j4) + (f6 - b5), b.DAYS);
                if (jVar == org.threeten.bp.format.j.STRICT && v5.getLong(aVar2) != map.get(aVar2).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar);
                return v5;
            }
            org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.MONTH_OF_YEAR;
            if (!map.containsKey(aVar3)) {
                return null;
            }
            long longValue2 = map.remove(this).longValue();
            if (jVar == org.threeten.bp.format.j.LENIENT) {
                b6 = p5.b(checkValidIntValue, 1, 1).v(map.get(aVar3).longValue() - 1, bVar);
                a6 = ((longValue2 - e(b6, b(b6, value))) * 7) + (f6 - r3);
            } else {
                b6 = p5.b(checkValidIntValue, aVar3.checkValidIntValue(map.get(aVar3).longValue()), 8);
                a6 = (f6 - r3) + ((this.f88400f.a(longValue2, this) - e(b6, b(b6, value))) * 7);
            }
            org.threeten.bp.chrono.c v6 = b6.v(a6, b.DAYS);
            if (jVar == org.threeten.bp.format.j.STRICT && v6.getLong(aVar3) != map.get(aVar3).longValue()) {
                throw new DateTimeException("Strict mode rejected date parsed to a different month");
            }
            map.remove(this);
            map.remove(aVar2);
            map.remove(aVar3);
            map.remove(aVar);
            return v6;
        }

        public String toString() {
            return this.f88396b + "[" + this.f88397c.toString() + "]";
        }
    }

    private o(org.threeten.bp.d dVar, int i4) {
        ng.d.j(dVar, "firstDayOfWeek");
        if (i4 < 1 || i4 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f88384b = dVar;
        this.f88385c = i4;
    }

    public static o e(Locale locale) {
        ng.d.j(locale, "locale");
        return f(org.threeten.bp.d.SUNDAY.plus(r4.getFirstDayOfWeek() - 1), new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
    }

    public static o f(org.threeten.bp.d dVar, int i4) {
        String str = dVar.toString() + i4;
        ConcurrentMap<String, o> concurrentMap = f88380i;
        o oVar = concurrentMap.get(str);
        if (oVar != null) {
            return oVar;
        }
        concurrentMap.putIfAbsent(str, new o(dVar, i4));
        return concurrentMap.get(str);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return f(this.f88384b, this.f88385c);
        } catch (IllegalArgumentException e4) {
            throw new InvalidObjectException("Invalid WeekFields" + e4.getMessage());
        }
    }

    public j b() {
        return this.f88386d;
    }

    public org.threeten.bp.d c() {
        return this.f88384b;
    }

    public int d() {
        return this.f88385c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && hashCode() == obj.hashCode();
    }

    public j g() {
        return this.f88390h;
    }

    public j h() {
        return this.f88387e;
    }

    public int hashCode() {
        return (this.f88384b.ordinal() * 7) + this.f88385c;
    }

    public j i() {
        return this.f88389g;
    }

    public j j() {
        return this.f88388f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WeekFields[");
        sb.append(this.f88384b);
        sb.append(',');
        return androidx.view.e.a(sb, this.f88385c, ']');
    }
}
