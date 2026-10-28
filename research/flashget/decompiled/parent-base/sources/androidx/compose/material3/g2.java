package androidx.compose.material3;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CalendarModelImpl.android.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001-B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0007*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010'J+\u0010-\u001a\u00020+2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010,\u001a\u00020+2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020+H\u0016¢\u0006\u0004\b1\u00102R\u001a\u00107\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R,\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+09088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/material3/g2;", "Landroidx/compose/material3/s0;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Ljava/time/LocalDate;", "firstDayLocalDate", "Landroidx/compose/material3/j2;", "v", "(Ljava/time/LocalDate;)Landroidx/compose/material3/j2;", "x", "(Landroidx/compose/material3/j2;)Ljava/time/LocalDate;", "Landroidx/compose/material3/r0;", "w", "(Landroidx/compose/material3/r0;)Ljava/time/LocalDate;", "Landroidx/compose/material3/q3;", "g", "(Ljava/util/Locale;)Landroidx/compose/material3/q3;", "", "timeInMillis", "f", "(J)Landroidx/compose/material3/r0;", "n", "(J)Landroidx/compose/material3/j2;", "date", "o", "(Landroidx/compose/material3/r0;)Landroidx/compose/material3/j2;", "", "year", "month", "m", "(II)Landroidx/compose/material3/j2;", "i", "(Landroidx/compose/material3/r0;)I", "from", "addedMonthsCount", "t", "(Landroidx/compose/material3/j2;I)Landroidx/compose/material3/j2;", "subtractedMonthsCount", "r", "utcTimeMillis", "", "pattern", "a", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "s", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/r0;", "toString", "()Ljava/lang/String;", "d", "I", "j", "()I", "firstDayOfWeek", "", "Lkotlin/q0;", "e", "Ljava/util/List;", "q", "()Ljava/util/List;", "weekdayNames", "p", "()Landroidx/compose/material3/r0;", "today", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.annotation.x0(26)
@kotlin.jvm.internal.r1({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,235:1\n11335#2:236\n11670#2,3:237\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n*L\n62#1:236\n62#1:237,3\n*E\n"})
/* loaded from: classes.dex */
public final class g2 extends s0 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    public static final int f10840g = 8;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final ZoneId f10841h;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int firstDayOfWeek;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<kotlin.q0<String, String>> weekdayNames;

    /* compiled from: CalendarModelImpl.android.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/g2$a;", "", "<init>", "()V", "", "pattern", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "cache", "Ljava/time/format/DateTimeFormatter;", "b", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/time/format/DateTimeFormatter;", "", "utcTimeMillis", "a", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "Ljava/time/ZoneId;", "utcTimeZoneId", "Ljava/time/ZoneId;", "c", "()Ljava/time/ZoneId;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,235:1\n361#2,7:236\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl$Companion\n*L\n197#1:236,7\n*E\n"})
    /* renamed from: androidx.compose.material3.g2$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final DateTimeFormatter b(String pattern, Locale locale, Map<String, Object> cache) {
            DateTimeFormatter ofPattern;
            DecimalStyle of2;
            String str = "P:" + pattern + locale.toLanguageTag();
            Object obj = cache.get(str);
            if (obj == null) {
                ofPattern = DateTimeFormatter.ofPattern(pattern, locale);
                of2 = DecimalStyle.of(locale);
                obj = ofPattern.withDecimalStyle(of2);
                cache.put(str, obj);
            }
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return e2.a(obj);
        }

        @fg.l
        public final String a(long utcTimeMillis, @fg.l String pattern, @fg.l Locale locale, @fg.l Map<String, Object> cache) {
            Instant ofEpochMilli;
            ZonedDateTime atZone;
            LocalDate localDate;
            String format;
            DateTimeFormatter b5 = b(pattern, locale, cache);
            ofEpochMilli = Instant.ofEpochMilli(utcTimeMillis);
            atZone = ofEpochMilli.atZone(g2.f10841h);
            localDate = atZone.toLocalDate();
            format = localDate.format(b5);
            return format;
        }

        @fg.l
        public final ZoneId c() {
            return g2.f10841h;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        ZoneId of2;
        of2 = ZoneId.of("UTC");
        f10841h = of2;
    }

    public g2(@fg.l Locale locale) {
        super(locale);
        WeekFields of2;
        DayOfWeek firstDayOfWeek;
        int value;
        DayOfWeek[] values;
        TextStyle textStyle;
        String displayName;
        TextStyle textStyle2;
        String displayName2;
        of2 = WeekFields.of(locale);
        firstDayOfWeek = of2.getFirstDayOfWeek();
        value = firstDayOfWeek.getValue();
        this.firstDayOfWeek = value;
        values = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DayOfWeek dayOfWeek : values) {
            textStyle = TextStyle.FULL;
            displayName = dayOfWeek.getDisplayName(textStyle, locale);
            textStyle2 = TextStyle.NARROW;
            displayName2 = dayOfWeek.getDisplayName(textStyle2, locale);
            arrayList.add(new kotlin.q0(displayName, displayName2));
        }
        this.weekdayNames = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.time.ZonedDateTime] */
    private final j2 v(LocalDate firstDayLocalDate) {
        int value = firstDayLocalDate.getDayOfWeek().getValue() - this.firstDayOfWeek;
        if (value < 0) {
            value += 7;
        }
        return new j2(firstDayLocalDate.getYear(), firstDayLocalDate.getMonthValue(), firstDayLocalDate.lengthOfMonth(), value, firstDayLocalDate.atTime(LocalTime.MIDNIGHT).atZone(f10841h).toInstant().toEpochMilli());
    }

    private final LocalDate w(r0 r0Var) {
        LocalDate of2;
        of2 = LocalDate.of(r0Var.l(), r0Var.j(), r0Var.i());
        return of2;
    }

    private final LocalDate x(j2 j2Var) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(j2Var.m());
        atZone = ofEpochMilli.atZone(f10841h);
        localDate = atZone.toLocalDate();
        return localDate;
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public String a(long utcTimeMillis, @fg.l String pattern, @fg.l Locale locale) {
        return INSTANCE.a(utcTimeMillis, pattern, locale, k());
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public r0 f(long timeInMillis) {
        LocalDate localDate = Instant.ofEpochMilli(timeInMillis).atZone(f10841h).toLocalDate();
        return new r0(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000);
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public q3 g(@fg.l Locale locale) {
        FormatStyle formatStyle;
        Chronology ofLocale;
        String localizedDateTimePattern;
        formatStyle = FormatStyle.SHORT;
        ofLocale = Chronology.ofLocale(locale);
        localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, null, ofLocale, locale);
        return h2.a(localizedDateTimePattern);
    }

    @Override // androidx.compose.material3.s0
    public int i(@fg.l r0 date) {
        DayOfWeek dayOfWeek;
        int value;
        dayOfWeek = w(date).getDayOfWeek();
        value = dayOfWeek.getValue();
        return value;
    }

    @Override // androidx.compose.material3.s0
    /* renamed from: j, reason: from getter */
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 m(int year, int month) {
        LocalDate of2;
        of2 = LocalDate.of(year, month, 1);
        return v(of2);
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 n(long timeInMillis) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        ZonedDateTime withDayOfMonth;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(timeInMillis);
        atZone = ofEpochMilli.atZone(f10841h);
        withDayOfMonth = atZone.withDayOfMonth(1);
        localDate = withDayOfMonth.toLocalDate();
        return v(localDate);
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 o(@fg.l r0 date) {
        LocalDate of2;
        of2 = LocalDate.of(date.l(), date.j(), 1);
        return v(of2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.time.ZonedDateTime] */
    @Override // androidx.compose.material3.s0
    @fg.l
    public r0 p() {
        LocalDate now = LocalDate.now();
        return new r0(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.atTime(LocalTime.MIDNIGHT).atZone(f10841h).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public List<kotlin.q0<String, String>> q() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 r(@fg.l j2 from, int subtractedMonthsCount) {
        LocalDate minusMonths;
        if (subtractedMonthsCount <= 0) {
            return from;
        }
        minusMonths = x(from).minusMonths(subtractedMonthsCount);
        return v(minusMonths);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.time.ZonedDateTime] */
    @Override // androidx.compose.material3.s0
    @fg.m
    public r0 s(@fg.l String date, @fg.l String pattern) {
        try {
            LocalDate parse = LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
            return new r0(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.atTime(LocalTime.MIDNIGHT).atZone(f10841h).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 t(@fg.l j2 from, int addedMonthsCount) {
        LocalDate plusMonths;
        if (addedMonthsCount <= 0) {
            return from;
        }
        plusMonths = x(from).plusMonths(addedMonthsCount);
        return v(plusMonths);
    }

    @fg.l
    public String toString() {
        return "CalendarModel";
    }
}
