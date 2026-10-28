package org.threeten.bp;

import java.util.Locale;
import org.apache.log4j.net.SyslogAppender;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: Month.java */
/* loaded from: classes9.dex */
public enum j implements org.threeten.bp.temporal.f, org.threeten.bp.temporal.g {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static final org.threeten.bp.temporal.l<j> FROM = new a();
    private static final j[] ENUMS = values();

    /* compiled from: Month.java */
    class a implements org.threeten.bp.temporal.l<j> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(org.threeten.bp.temporal.f fVar) {
            return j.from(fVar);
        }
    }

    /* compiled from: Month.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88266a;

        static {
            int[] iArr = new int[j.values().length];
            f88266a = iArr;
            try {
                iArr[j.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88266a[j.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88266a[j.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88266a[j.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88266a[j.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88266a[j.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88266a[j.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88266a[j.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f88266a[j.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88266a[j.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88266a[j.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f88266a[j.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static j from(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof j) {
            return (j) fVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f88011f.equals(org.threeten.bp.chrono.j.p(fVar))) {
                fVar = g.Z(fVar);
            }
            return of(fVar.get(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        } catch (DateTimeException e4) {
            throw new DateTimeException("Unable to obtain Month from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName(), e4);
        }
    }

    public static j of(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new DateTimeException(android.support.v4.media.a.a("Invalid value for MonthOfYear: ", i4));
        }
        return ENUMS[i4 - 1];
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        if (org.threeten.bp.chrono.j.p(eVar).equals(org.threeten.bp.chrono.o.f88011f)) {
            return eVar.b(org.threeten.bp.temporal.a.MONTH_OF_YEAR, getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public int firstDayOfYear(boolean z4) {
        switch (b.f88266a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z4 ? 1 : 0) + 91;
            case 3:
                return (z4 ? 1 : 0) + SyslogAppender.LOG_LOCAL3;
            case 4:
                return (z4 ? 1 : 0) + 244;
            case 5:
                return (z4 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z4 ? 1 : 0) + 60;
            case 8:
                return (z4 ? 1 : 0) + 121;
            case 9:
                return (z4 ? 1 : 0) + 182;
            case 10:
                return (z4 ? 1 : 0) + 213;
            case 11:
                return (z4 ? 1 : 0) + 274;
            default:
                return (z4 ? 1 : 0) + 335;
        }
    }

    public j firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    @Override // org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return jVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR ? getValue() : range(jVar).a(getLong(jVar), jVar);
    }

    public String getDisplayName(org.threeten.bp.format.n nVar, Locale locale) {
        return new org.threeten.bp.format.d().r(org.threeten.bp.temporal.a.MONTH_OF_YEAR, nVar).Q(locale).d(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR) {
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
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR : jVar != null && jVar.isSupportedBy(this);
    }

    public int length(boolean z4) {
        int i4 = b.f88266a[ordinal()];
        return i4 != 1 ? (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 30 : 31 : z4 ? 29 : 28;
    }

    public int maxLength() {
        int i4 = b.f88266a[ordinal()];
        if (i4 != 1) {
            return (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 30 : 31;
        }
        return 29;
    }

    public int minLength() {
        int i4 = b.f88266a[ordinal()];
        if (i4 != 1) {
            return (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 30 : 31;
        }
        return 28;
    }

    public j minus(long j4) {
        return plus(-(j4 % 12));
    }

    public j plus(long j4) {
        return ENUMS[((((int) (j4 % 12)) + 12) + ordinal()) % 12];
    }

    @Override // org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) org.threeten.bp.chrono.o.f88011f;
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.MONTHS;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR) {
            return jVar.range();
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }
        return jVar.rangeRefinedBy(this);
    }
}
