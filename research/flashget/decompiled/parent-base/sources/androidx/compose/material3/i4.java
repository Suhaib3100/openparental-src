package androidx.compose.material3;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DateRangePicker.kt */
@androidx.compose.runtime.x4
@f5
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0003\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001)BI\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0016\u0010!\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010 R*\u0010#\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/material3/i4;", "Landroidx/compose/material3/y;", "Landroidx/compose/material3/h4;", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/p4;", "initialDisplayMode", "Landroidx/compose/material3/s8;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/s8;Ljava/util/Locale;Lkotlin/jvm/internal/w;)V", "startDateMillis", "endDateMillis", "Lkotlin/k2;", "h", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/runtime/k2;", "Landroidx/compose/material3/r0;", "f", "Landroidx/compose/runtime/k2;", "_selectedStartDate", "g", "_selectedEndDate", "_displayMode", "j", "()Ljava/lang/Long;", "selectedStartDateMillis", "selectedEndDateMillis", "displayMode", "e", "()I", "d", "(I)V", "i", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i4 extends y implements h4 {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.k2<r0> _selectedStartDate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.k2<r0> _selectedEndDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.k2<p4> _displayMode;

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material3/i4$a;", "", "<init>", "()V", "Landroidx/compose/material3/s8;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/i4;", "a", "(Landroidx/compose/material3/s8;Ljava/util/Locale;)Landroidx/compose/runtime/saveable/l;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.i4$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DateRangePicker.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/i4;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/i4;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.i4$a$a, reason: collision with other inner class name */
        static final class C0249a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, i4, List<? extends Object>> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0249a f11414b = new C0249a(2);

            C0249a() {
                super(2);
            }

            @Override // ld.p
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Object> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l i4 i4Var) {
                return kotlin.collections.w.O(i4Var.j(), i4Var.g(), Long.valueOf(i4Var.f()), Integer.valueOf(i4Var.getYearRange().getFirst()), Integer.valueOf(i4Var.getYearRange().getLast()), Integer.valueOf(i4Var.e()));
            }
        }

        /* compiled from: DateRangePicker.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "value", "Landroidx/compose/material3/i4;", "a", "(Ljava/util/List;)Landroidx/compose/material3/i4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.i4$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<List, i4> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s8 f11415b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Locale f11416c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s8 s8Var, Locale locale) {
                super(1);
                this.f11415b = s8Var;
                this.f11416c = locale;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i4 invoke(@fg.l List<? extends Object> list) {
                Long l4 = (Long) list.get(0);
                Long l5 = (Long) list.get(1);
                Long l6 = (Long) list.get(2);
                Object obj = list.get(3);
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                Object obj2 = list.get(4);
                kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
                kotlin.ranges.l lVar = new kotlin.ranges.l(intValue, ((Integer) obj2).intValue(), 1);
                Object obj3 = list.get(5);
                kotlin.jvm.internal.l0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
                return new i4(l4, l5, l6, lVar, p4.d(((Integer) obj3).intValue()), this.f11415b, this.f11416c, null);
            }
        }

        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<i4, Object> a(@fg.l s8 selectableDates, @fg.l Locale locale) {
            return androidx.compose.runtime.saveable.a.a(C0249a.f11414b, new b(selectableDates, locale));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ i4(Long l4, Long l5, Long l6, kotlin.ranges.l lVar, int i4, s8 s8Var, Locale locale, kotlin.jvm.internal.w wVar) {
        this(l4, l5, l6, lVar, i4, s8Var, locale);
    }

    @Override // androidx.compose.material3.h4
    public void d(int i4) {
        Long j4 = j();
        if (j4 != null) {
            a(getCalendarModel().n(j4.longValue()).m());
        }
        this._displayMode.setValue(p4.c(i4));
    }

    @Override // androidx.compose.material3.h4
    public int e() {
        return this._displayMode.getValue().getValue();
    }

    @Override // androidx.compose.material3.h4
    @fg.m
    public Long g() {
        r0 value = this._selectedEndDate.getValue();
        if (value != null) {
            return Long.valueOf(value.k());
        }
        return null;
    }

    @Override // androidx.compose.material3.h4
    public void h(@fg.m Long startDateMillis, @fg.m Long endDateMillis) {
        r0 f4 = startDateMillis != null ? getCalendarModel().f(startDateMillis.longValue()) : null;
        r0 f5 = endDateMillis != null ? getCalendarModel().f(endDateMillis.longValue()) : null;
        if (f4 != null && !getYearRange().r(f4.l())) {
            throw new IllegalArgumentException(("The provided start date year (" + f4.l() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (f5 != null && !getYearRange().r(f5.l())) {
            throw new IllegalArgumentException(("The provided end date year (" + f5.l() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (f5 != null) {
            if (f4 == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if (f4.k() > f5.k()) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        this._selectedStartDate.setValue(f4);
        this._selectedEndDate.setValue(f5);
    }

    @Override // androidx.compose.material3.h4
    @fg.m
    public Long j() {
        r0 value = this._selectedStartDate.getValue();
        if (value != null) {
            return Long.valueOf(value.k());
        }
        return null;
    }

    private i4(Long l4, Long l5, Long l6, kotlin.ranges.l lVar, int i4, s8 s8Var, Locale locale) {
        super(l6, lVar, s8Var, locale);
        androidx.compose.runtime.k2<r0> g4;
        androidx.compose.runtime.k2<r0> g5;
        androidx.compose.runtime.k2<p4> g6;
        g4 = androidx.compose.runtime.t4.g(null, null, 2, null);
        this._selectedStartDate = g4;
        g5 = androidx.compose.runtime.t4.g(null, null, 2, null);
        this._selectedEndDate = g5;
        h(l4, l5);
        g6 = androidx.compose.runtime.t4.g(p4.c(i4), null, 2, null);
        this._displayMode = g6;
    }
}
