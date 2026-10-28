package androidx.compose.material3;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001$B?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R(\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/c4;", "Landroidx/compose/material3/y;", "Landroidx/compose/material3/b4;", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/p4;", "initialDisplayMode", "Landroidx/compose/material3/s8;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/s8;Ljava/util/Locale;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/runtime/k2;", "Landroidx/compose/material3/r0;", "f", "Landroidx/compose/runtime/k2;", "_selectedDate", "g", "_displayMode", "dateMillis", "i", "()Ljava/lang/Long;", "k", "(Ljava/lang/Long;)V", "selectedDateMillis", "displayMode", "e", "()I", "d", "(I)V", "h", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class c4 extends y implements b4 {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.k2<r0> _selectedDate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.k2<p4> _displayMode;

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material3/c4$a;", "", "<init>", "()V", "Landroidx/compose/material3/s8;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/c4;", "a", "(Landroidx/compose/material3/s8;Ljava/util/Locale;)Landroidx/compose/runtime/saveable/l;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.c4$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/c4;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/c4;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.c4$a$a, reason: collision with other inner class name */
        static final class C0226a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, c4, List<? extends Object>> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0226a f10244b = new C0226a(2);

            C0226a() {
                super(2);
            }

            @Override // ld.p
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Object> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l c4 c4Var) {
                return kotlin.collections.w.O(c4Var.i(), Long.valueOf(c4Var.f()), Integer.valueOf(c4Var.getYearRange().getFirst()), Integer.valueOf(c4Var.getYearRange().getLast()), Integer.valueOf(c4Var.e()));
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "value", "Landroidx/compose/material3/c4;", "a", "(Ljava/util/List;)Landroidx/compose/material3/c4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.c4$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<List, c4> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s8 f10245b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Locale f10246c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s8 s8Var, Locale locale) {
                super(1);
                this.f10245b = s8Var;
                this.f10246c = locale;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c4 invoke(@fg.l List<? extends Object> list) {
                Long l4 = (Long) list.get(0);
                Long l5 = (Long) list.get(1);
                Object obj = list.get(2);
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                Object obj2 = list.get(3);
                kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
                kotlin.ranges.l lVar = new kotlin.ranges.l(intValue, ((Integer) obj2).intValue(), 1);
                Object obj3 = list.get(4);
                kotlin.jvm.internal.l0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
                return new c4(l4, l5, lVar, p4.d(((Integer) obj3).intValue()), this.f10245b, this.f10246c, null);
            }
        }

        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<c4, Object> a(@fg.l s8 selectableDates, @fg.l Locale locale) {
            return androidx.compose.runtime.saveable.a.a(C0226a.f10244b, new b(selectableDates, locale));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ c4(Long l4, Long l5, kotlin.ranges.l lVar, int i4, s8 s8Var, Locale locale, kotlin.jvm.internal.w wVar) {
        this(l4, l5, lVar, i4, s8Var, locale);
    }

    @Override // androidx.compose.material3.b4
    public void d(int i4) {
        Long i5 = i();
        if (i5 != null) {
            a(getCalendarModel().n(i5.longValue()).m());
        }
        this._displayMode.setValue(p4.c(i4));
    }

    @Override // androidx.compose.material3.b4
    public int e() {
        return this._displayMode.getValue().getValue();
    }

    @Override // androidx.compose.material3.b4
    @fg.m
    public Long i() {
        r0 value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.k());
        }
        return null;
    }

    @Override // androidx.compose.material3.b4
    public void k(@fg.m Long l4) {
        if (l4 == null) {
            this._selectedDate.setValue(null);
            return;
        }
        r0 f4 = getCalendarModel().f(l4.longValue());
        if (getYearRange().r(f4.l())) {
            this._selectedDate.setValue(f4);
            return;
        }
        throw new IllegalArgumentException(("The provided date's year (" + f4.l() + ") is out of the years range of " + getYearRange() + '.').toString());
    }

    private c4(Long l4, Long l5, kotlin.ranges.l lVar, int i4, s8 s8Var, Locale locale) {
        super(l5, lVar, s8Var, locale);
        r0 r0Var;
        androidx.compose.runtime.k2<r0> g4;
        androidx.compose.runtime.k2<p4> g5;
        if (l4 != null) {
            r0Var = getCalendarModel().f(l4.longValue());
            if (!lVar.r(r0Var.l())) {
                throw new IllegalArgumentException(("The provided initial date's year (" + r0Var.l() + ") is out of the years range of " + lVar + '.').toString());
            }
        } else {
            r0Var = null;
        }
        g4 = androidx.compose.runtime.t4.g(r0Var, null, 2, null);
        this._selectedDate = g4;
        g5 = androidx.compose.runtime.t4.g(p4.c(i4), null, 2, null);
        this._displayMode = g5;
    }
}
