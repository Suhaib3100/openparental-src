package androidx.compose.material3;

import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\"\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b\r\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/material3/y;", "", "", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/s8;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Lkotlin/ranges/l;Landroidx/compose/material3/s8;Ljava/util/Locale;)V", "a", "Lkotlin/ranges/l;", "c", "()Lkotlin/ranges/l;", "b", "Landroidx/compose/material3/s8;", "()Landroidx/compose/material3/s8;", "Landroidx/compose/material3/s0;", "Landroidx/compose/material3/s0;", "l", "()Landroidx/compose/material3/s0;", "calendarModel", "Landroidx/compose/runtime/k2;", "Landroidx/compose/material3/j2;", "d", "Landroidx/compose/runtime/k2;", "_displayedMonth", "monthMillis", "f", "()J", "(J)V", "displayedMonthMillis", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: e, reason: collision with root package name */
    public static final int f15753e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.ranges.l yearRange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s8 selectableDates;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s0 calendarModel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.k2<j2> _displayedMonth;

    public y(@fg.m Long l4, @fg.l kotlin.ranges.l lVar, @fg.l s8 s8Var, @fg.l Locale locale) {
        j2 o4;
        androidx.compose.runtime.k2<j2> g4;
        this.yearRange = lVar;
        this.selectableDates = s8Var;
        s0 a5 = i2.a(locale);
        this.calendarModel = a5;
        if (l4 != null) {
            o4 = a5.n(l4.longValue());
            if (!lVar.r(o4.n())) {
                throw new IllegalArgumentException(("The initial display month's year (" + o4.n() + ") is out of the years range of " + lVar + '.').toString());
            }
        } else {
            o4 = a5.o(a5.p());
        }
        g4 = androidx.compose.runtime.t4.g(o4, null, 2, null);
        this._displayedMonth = g4;
    }

    public final void a(long j4) {
        j2 n4 = this.calendarModel.n(j4);
        if (this.yearRange.r(n4.n())) {
            this._displayedMonth.setValue(n4);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + n4.n() + ") is out of the years range of " + this.yearRange + '.').toString());
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final s8 getSelectableDates() {
        return this.selectableDates;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final kotlin.ranges.l getYearRange() {
        return this.yearRange;
    }

    public final long f() {
        return this._displayedMonth.getValue().m();
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final s0 getCalendarModel() {
        return this.calendarModel;
    }
}
