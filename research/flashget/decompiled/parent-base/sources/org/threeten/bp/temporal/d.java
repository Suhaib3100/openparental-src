package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;
import org.threeten.bp.DateTimeException;

/* compiled from: JulianFields.java */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f88354a = a.JULIAN_DAY;

    /* renamed from: b, reason: collision with root package name */
    public static final j f88355b = a.MODIFIED_JULIAN_DAY;

    /* renamed from: c, reason: collision with root package name */
    public static final j f88356c = a.RATA_DIE;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: JulianFields.java */
    private static final class a implements j {
        private static final /* synthetic */ a[] $VALUES;
        public static final a JULIAN_DAY;
        public static final a MODIFIED_JULIAN_DAY;
        public static final a RATA_DIE;
        private final m baseUnit;
        private final String name;
        private final long offset;
        private final n range;
        private final m rangeUnit;

        static {
            b bVar = b.DAYS;
            b bVar2 = b.FOREVER;
            a aVar = new a("JULIAN_DAY", 0, "JulianDay", bVar, bVar2, 2440588L);
            JULIAN_DAY = aVar;
            a aVar2 = new a("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", bVar, bVar2, 40587L);
            MODIFIED_JULIAN_DAY = aVar2;
            a aVar3 = new a("RATA_DIE", 2, "RataDie", bVar, bVar2, 719163L);
            RATA_DIE = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a(String str, int i4, String str2, m mVar, m mVar2, long j4) {
            this.name = str2;
            this.baseUnit = mVar;
            this.rangeUnit = mVar2;
            this.range = n.k((-365243219162L) + j4, 365241780471L + j4);
            this.offset = j4;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // org.threeten.bp.temporal.j
        public <R extends e> R adjustInto(R r4, long j4) {
            if (range().j(j4)) {
                return (R) r4.b(org.threeten.bp.temporal.a.EPOCH_DAY, ng.d.q(j4, this.offset));
            }
            throw new DateTimeException("Invalid value: " + this.name + " " + j4);
        }

        @Override // org.threeten.bp.temporal.j
        public m getBaseUnit() {
            return this.baseUnit;
        }

        @Override // org.threeten.bp.temporal.j
        public String getDisplayName(Locale locale) {
            ng.d.j(locale, "locale");
            return toString();
        }

        @Override // org.threeten.bp.temporal.j
        public long getFrom(f fVar) {
            return fVar.getLong(org.threeten.bp.temporal.a.EPOCH_DAY) + this.offset;
        }

        @Override // org.threeten.bp.temporal.j
        public m getRangeUnit() {
            return this.rangeUnit;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isSupportedBy(f fVar) {
            return fVar.isSupported(org.threeten.bp.temporal.a.EPOCH_DAY);
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.j
        public n range() {
            return this.range;
        }

        @Override // org.threeten.bp.temporal.j
        public n rangeRefinedBy(f fVar) {
            if (isSupportedBy(fVar)) {
                return range();
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + this);
        }

        @Override // org.threeten.bp.temporal.j
        public f resolve(Map<j, Long> map, f fVar, org.threeten.bp.format.j jVar) {
            return org.threeten.bp.chrono.j.p(fVar).e(ng.d.q(map.remove(this).longValue(), this.offset));
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }
}
