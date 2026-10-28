package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CalendarModel.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@f5
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0015H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0015H&¢\u0006\u0004\b!\u0010\u001fJ+\u0010$\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\u00020\"2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"H&¢\u0006\u0004\b,\u0010-R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b/\u00100R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R&\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0=0<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/compose/material3/s0;", "", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Landroidx/compose/material3/q3;", "g", "(Ljava/util/Locale;)Landroidx/compose/material3/q3;", "", "timeInMillis", "Landroidx/compose/material3/r0;", "f", "(J)Landroidx/compose/material3/r0;", "Landroidx/compose/material3/j2;", "n", "(J)Landroidx/compose/material3/j2;", "date", "o", "(Landroidx/compose/material3/r0;)Landroidx/compose/material3/j2;", "", "year", "month", "m", "(II)Landroidx/compose/material3/j2;", "i", "(Landroidx/compose/material3/r0;)I", "from", "addedMonthsCount", "t", "(Landroidx/compose/material3/j2;I)Landroidx/compose/material3/j2;", "subtractedMonthsCount", "r", "", "skeleton", "c", "(Landroidx/compose/material3/j2;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "b", "(Landroidx/compose/material3/r0;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "utcTimeMillis", "pattern", "a", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "s", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/r0;", "Ljava/util/Locale;", "l", "()Ljava/util/Locale;", "", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "formatterCache", "p", "()Landroidx/compose/material3/r0;", "today", "j", "()I", "firstDayOfWeek", "", "Lkotlin/q0;", "q", "()Ljava/util/List;", "weekdayNames", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f14303c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Locale locale;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, Object> formatterCache = new LinkedHashMap();

    public s0(@fg.l Locale locale) {
        this.locale = locale;
    }

    public static /* synthetic */ String d(s0 s0Var, r0 r0Var, String str, Locale locale, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i4 & 4) != 0) {
            locale = s0Var.locale;
        }
        return s0Var.b(r0Var, str, locale);
    }

    public static /* synthetic */ String e(s0 s0Var, j2 j2Var, String str, Locale locale, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i4 & 4) != 0) {
            locale = s0Var.locale;
        }
        return s0Var.c(j2Var, str, locale);
    }

    public static /* synthetic */ q3 h(s0 s0Var, Locale locale, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }
        if ((i4 & 1) != 0) {
            locale = s0Var.locale;
        }
        return s0Var.g(locale);
    }

    @fg.l
    public abstract String a(long utcTimeMillis, @fg.l String pattern, @fg.l Locale locale);

    @fg.l
    public final String b(@fg.l r0 date, @fg.l String skeleton, @fg.l Locale locale) {
        return i2.b(date.k(), skeleton, locale, this.formatterCache);
    }

    @fg.l
    public final String c(@fg.l j2 month, @fg.l String skeleton, @fg.l Locale locale) {
        return i2.b(month.m(), skeleton, locale, this.formatterCache);
    }

    @fg.l
    public abstract r0 f(long timeInMillis);

    @fg.l
    public abstract q3 g(@fg.l Locale locale);

    public abstract int i(@fg.l r0 date);

    /* renamed from: j */
    public abstract int getFirstDayOfWeek();

    @fg.l
    public final Map<String, Object> k() {
        return this.formatterCache;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @fg.l
    public abstract j2 m(int year, int month);

    @fg.l
    public abstract j2 n(long timeInMillis);

    @fg.l
    public abstract j2 o(@fg.l r0 date);

    @fg.l
    public abstract r0 p();

    @fg.l
    public abstract List<kotlin.q0<String, String>> q();

    @fg.l
    public abstract j2 r(@fg.l j2 from, int subtractedMonthsCount);

    @fg.m
    public abstract r0 s(@fg.l String date, @fg.l String pattern);

    @fg.l
    public abstract j2 t(@fg.l j2 from, int addedMonthsCount);
}
