package androidx.compose.material3;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;

/* compiled from: LegacyCalendarModelImpl.jvm.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u00012B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010,J+\u00102\u001a\u0002002\u0006\u0010/\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b2\u00103J!\u00104\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u0002002\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000200H\u0016¢\u0006\u0004\b6\u00107R\u001a\u0010<\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R,\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002000>0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Landroidx/compose/material3/f6;", "Landroidx/compose/material3/s0;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "", "day", "v", "(I)I", "Ljava/util/Calendar;", "firstDayCalendar", "Landroidx/compose/material3/j2;", "w", "(Ljava/util/Calendar;)Landroidx/compose/material3/j2;", "y", "(Landroidx/compose/material3/j2;)Ljava/util/Calendar;", "Landroidx/compose/material3/r0;", "Ljava/util/TimeZone;", "timeZone", "x", "(Landroidx/compose/material3/r0;Ljava/util/TimeZone;)Ljava/util/Calendar;", "Landroidx/compose/material3/q3;", "g", "(Ljava/util/Locale;)Landroidx/compose/material3/q3;", "", "timeInMillis", "f", "(J)Landroidx/compose/material3/r0;", "n", "(J)Landroidx/compose/material3/j2;", "date", "o", "(Landroidx/compose/material3/r0;)Landroidx/compose/material3/j2;", "year", "month", "m", "(II)Landroidx/compose/material3/j2;", "i", "(Landroidx/compose/material3/r0;)I", "from", "addedMonthsCount", "t", "(Landroidx/compose/material3/j2;I)Landroidx/compose/material3/j2;", "subtractedMonthsCount", "r", "utcTimeMillis", "", "pattern", "a", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "s", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/r0;", "toString", "()Ljava/lang/String;", "d", "I", "j", "()I", "firstDayOfWeek", "", "Lkotlin/q0;", "e", "Ljava/util/List;", "q", "()Ljava/util/List;", "weekdayNames", "p", "()Landroidx/compose/material3/r0;", "today", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,244:1\n69#2,6:245\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n*L\n60#1:245,6\n*E\n"})
/* loaded from: classes.dex */
public final class f6 extends s0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f10683g = 8;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int firstDayOfWeek;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<kotlin.q0<String, String>> weekdayNames;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final TimeZone f10684h = TimeZone.getTimeZone("UTC");

    /* compiled from: LegacyCalendarModelImpl.jvm.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/f6$a;", "", "<init>", "()V", "", "pattern", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "cache", "Ljava/text/SimpleDateFormat;", "b", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/text/SimpleDateFormat;", "", "utcTimeMillis", "a", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "Ljava/util/TimeZone;", "utcTimeZone", "Ljava/util/TimeZone;", "c", "()Ljava/util/TimeZone;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/LegacyCalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,244:1\n361#2,7:245\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/LegacyCalendarModelImpl$Companion\n*L\n196#1:245,7\n*E\n"})
    /* renamed from: androidx.compose.material3.f6$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final SimpleDateFormat b(String pattern, Locale locale, Map<String, Object> cache) {
            StringBuilder a5 = j4.a(pattern);
            a5.append(locale.toLanguageTag());
            String sb = a5.toString();
            Object obj = cache.get(sb);
            Object obj2 = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
                f6.INSTANCE.getClass();
                simpleDateFormat.setTimeZone(f6.f10684h);
                cache.put(sb, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (SimpleDateFormat) obj2;
        }

        @fg.l
        public final String a(long utcTimeMillis, @fg.l String pattern, @fg.l Locale locale, @fg.l Map<String, Object> cache) {
            SimpleDateFormat b5 = b(pattern, locale, cache);
            Calendar calendar = Calendar.getInstance(f6.f10684h);
            calendar.setTimeInMillis(utcTimeMillis);
            return b5.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        @fg.l
        public final TimeZone c() {
            return f6.f10684h;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public f6(@fg.l Locale locale) {
        super(locale);
        this.firstDayOfWeek = v(Calendar.getInstance(locale).getFirstDayOfWeek());
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List l92 = kotlin.collections.l.l9(weekdays, 2);
        int size = l92.size();
        for (int i4 = 0; i4 < size; i4++) {
            bVar.add(new kotlin.q0((String) l92.get(i4), shortWeekdays[i4 + 2]));
        }
        bVar.add(new kotlin.q0(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = kotlin.collections.w.a(bVar);
    }

    private final int v(int day) {
        int i4 = (day + 6) % 7;
        if (i4 == 0) {
            return 7;
        }
        return i4;
    }

    private final j2 w(Calendar firstDayCalendar) {
        int v4 = v(firstDayCalendar.get(7)) - this.firstDayOfWeek;
        if (v4 < 0) {
            v4 += 7;
        }
        return new j2(firstDayCalendar.get(1), firstDayCalendar.get(2) + 1, firstDayCalendar.getActualMaximum(5), v4, firstDayCalendar.getTimeInMillis());
    }

    private final Calendar x(r0 r0Var, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, r0Var.l());
        calendar.set(2, r0Var.j() - 1);
        calendar.set(5, r0Var.i());
        return calendar;
    }

    private final Calendar y(j2 j2Var) {
        Calendar calendar = Calendar.getInstance(f10684h);
        calendar.setTimeInMillis(j2Var.m());
        return calendar;
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public String a(long utcTimeMillis, @fg.l String pattern, @fg.l Locale locale) {
        return INSTANCE.a(utcTimeMillis, pattern, locale, k());
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public r0 f(long timeInMillis) {
        Calendar calendar = Calendar.getInstance(f10684h);
        calendar.setTimeInMillis(timeInMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new r0(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public q3 g(@fg.l Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        kotlin.jvm.internal.l0.n(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return h2.a(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.s0
    public int i(@fg.l r0 date) {
        return v(x(date, TimeZone.getDefault()).get(7));
    }

    @Override // androidx.compose.material3.s0
    /* renamed from: j, reason: from getter */
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 m(int year, int month) {
        Calendar calendar = Calendar.getInstance(f10684h);
        calendar.clear();
        calendar.set(1, year);
        calendar.set(2, month - 1);
        calendar.set(5, 1);
        return w(calendar);
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 n(long timeInMillis) {
        Calendar calendar = Calendar.getInstance(f10684h);
        calendar.setTimeInMillis(timeInMillis);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return w(calendar);
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 o(@fg.l r0 date) {
        return m(date.l(), date.j());
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public r0 p() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new r0(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + calendar.get(16) + calendar.get(15));
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public List<kotlin.q0<String, String>> q() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 r(@fg.l j2 from, int subtractedMonthsCount) {
        if (subtractedMonthsCount <= 0) {
            return from;
        }
        Calendar y4 = y(from);
        y4.add(2, -subtractedMonthsCount);
        return w(y4);
    }

    @Override // androidx.compose.material3.s0
    @fg.m
    public r0 s(@fg.l String date, @fg.l String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        TimeZone timeZone = f10684h;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(date);
            if (parse == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(parse);
            return new r0(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.s0
    @fg.l
    public j2 t(@fg.l j2 from, int addedMonthsCount) {
        if (addedMonthsCount <= 0) {
            return from;
        }
        Calendar y4 = y(from);
        y4.add(2, addedMonthsCount);
        return w(y4);
    }

    @fg.l
    public String toString() {
        return "LegacyCalendarModel";
    }
}
