package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u008e\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J+\u0010)\u001a\u00020(2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$¢\u0006\u0004\b)\u0010*J$\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101J6\u00105\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020+2\u0006\u00104\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u00106J'\u0010=\u001a\u00020<2\u0006\u00108\u001a\u0002072\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010C\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b0\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010H\u001a\u00020D8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010M\u001a\u00020I8\u0006¢\u0006\f\n\u0004\b\"\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010NR\u0014\u0010Q\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010NR\u0014\u0010R\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010NR\u0018\u0010V\u001a\u00020\u0004*\u00020S8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010Z\u001a\u00020W8G¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/material3/v3;", "", "<init>", "()V", "Landroidx/compose/material3/u3;", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/u3;", "Landroidx/compose/ui/graphics/d2;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "dividerColor", "Landroidx/compose/material3/pa;", "dateTextFieldColors", "d", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)Landroidx/compose/material3/u3;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "Landroidx/compose/material3/x3;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/x3;", "Landroidx/compose/material3/p4;", "displayMode", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/k2;", "b", "(ILandroidx/compose/ui/q;Landroidx/compose/runtime/t;II)V", "", "selectedDateMillis", "dateFormatter", "a", "(Ljava/lang/Long;ILandroidx/compose/material3/x3;Landroidx/compose/ui/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/lazy/c0;", "lazyListState", "Landroidx/compose/animation/core/z;", "", "decayAnimationSpec", "Landroidx/compose/foundation/gestures/e0;", "l", "(Landroidx/compose/foundation/lazy/c0;Landroidx/compose/animation/core/z;Landroidx/compose/runtime/t;II)Landroidx/compose/foundation/gestures/e0;", "Lkotlin/ranges/l;", "Lkotlin/ranges/l;", "k", "()Lkotlin/ranges/l;", "YearRange", "Landroidx/compose/ui/unit/h;", "F", "j", "()F", "TonalElevation", "Landroidx/compose/material3/s8;", "Landroidx/compose/material3/s8;", "g", "()Landroidx/compose/material3/s8;", "AllDates", "Ljava/lang/String;", "YearMonthSkeleton", "f", "YearAbbrMonthDaySkeleton", "YearMonthWeekdayDaySkeleton", "Landroidx/compose/material3/a3;", "h", "(Landroidx/compose/material3/a3;Landroidx/compose/runtime/t;I)Landroidx/compose/material3/u3;", "defaultDatePickerColors", "Landroidx/compose/ui/graphics/e6;", "i", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2268:1\n63#2:2269\n89#2:2270\n81#2:2271\n97#2:2272\n65#2:2273\n91#2:2274\n79#2:2275\n95#2:2276\n1116#3,6:2277\n1116#3,6:2284\n74#4:2283\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n*L\n625#1:2269\n630#1:2270\n663#1:2271\n664#1:2272\n669#1:2273\n670#1:2274\n675#1:2275\n676#1:2276\n682#1:2277,6\n703#1:2284,6\n702#1:2283\n*E\n"})
/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f15012h = 0;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String YearMonthSkeleton = "yMMMM";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final v3 f15005a = new v3();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final kotlin.ranges.l YearRange = new kotlin.ranges.l(1900, 2100, 1);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation = c0.j.f37473a.b();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final s8 AllDates = new a();

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/v3$a", "Landroidx/compose/material3/s8;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements s8 {
        a() {
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f15013b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.g.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.g1(zVar, androidx.compose.ui.semantics.g.f20299c);
            androidx.compose.ui.semantics.w.a1(zVar, this.f15013b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f15015c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15016d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x3 f15017e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15018f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15019g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15020h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Long l4, int i4, x3 x3Var, androidx.compose.ui.q qVar, int i5, int i6) {
            super(2);
            this.f15015c = l4;
            this.f15016d = i4;
            this.f15017e = x3Var;
            this.f15018f = qVar;
            this.f15019g = i5;
            this.f15020h = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v3.this.a(this.f15015c, this.f15016d, this.f15017e, this.f15018f, tVar, androidx.compose.runtime.g3.b(this.f15019g | 1), this.f15020h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15022c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15023d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15024e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15025f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4, androidx.compose.ui.q qVar, int i5, int i6) {
            super(2);
            this.f15022c = i4;
            this.f15023d = qVar;
            this.f15024e = i5;
            this.f15025f = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v3.this.b(this.f15022c, this.f15023d, tVar, androidx.compose.runtime.g3.b(this.f15024e | 1), this.f15025f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    private v3() {
    }

    public static x3 f(v3 v3Var, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "yMMMM";
        }
        if ((i4 & 2) != 0) {
            str2 = "yMMMd";
        }
        if ((i4 & 4) != 0) {
            str3 = "yMMMMEEEEd";
        }
        v3Var.getClass();
        return new y3(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0094  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@fg.m java.lang.Long r36, int r37, @fg.l androidx.compose.material3.x3 r38, @fg.m androidx.compose.ui.q r39, @fg.m androidx.compose.runtime.t r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v3.a(java.lang.Long, int, androidx.compose.material3.x3, androidx.compose.ui.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r30, @fg.m androidx.compose.ui.q r31, @fg.m androidx.compose.runtime.t r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.v3.b(int, androidx.compose.ui.q, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    @androidx.compose.runtime.i
    public final u3 c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-275219611);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-275219611, i4, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:433)");
        }
        u3 h4 = h(p6.f13227a.a(tVar, 6), tVar, (i4 << 3) & 112);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return h4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final u3 d(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, @fg.m pa paVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6, int i7) {
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        tVar.P(1991626358);
        if ((i7 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j30 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j30 = j4;
        }
        if ((i7 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j31 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j31 = j5;
        }
        if ((i7 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j32 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j32 = j6;
        }
        if ((i7 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j33 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j33 = j7;
        }
        if ((i7 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j34 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j34 = j10;
        }
        if ((i7 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j35 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j35 = j11;
        }
        if ((i7 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j36 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j36 = j12;
        }
        if ((i7 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j37 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j37 = j13;
        }
        if ((i7 & 256) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j38 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j38 = j14;
        }
        if ((i7 & 512) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j39 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j39 = j15;
        }
        if ((i7 & 1024) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j40 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j40 = j16;
        }
        if ((i7 & 2048) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j41 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j41 = j17;
        }
        if ((i7 & 4096) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j42 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j42 = j18;
        }
        if ((i7 & 8192) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j43 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j43 = j19;
        }
        if ((i7 & 16384) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j44 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j44 = j20;
        }
        if ((32768 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j45 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j45 = j21;
        }
        if ((65536 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j46 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j46 = j22;
        }
        if ((131072 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j47 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j47 = j23;
        }
        if ((262144 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j48 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j48 = j24;
        }
        if ((524288 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j49 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j49 = j25;
        }
        if ((1048576 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j50 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j50 = j26;
        }
        if ((2097152 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j51 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j51 = j27;
        }
        if ((4194304 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j52 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j52 = j28;
        }
        if ((8388608 & i7) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j53 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j53 = j29;
        }
        pa paVar2 = (i7 & 16777216) != 0 ? null : paVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1991626358, i4, i5, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:502)");
        }
        u3 a5 = h(p6.f13227a.a(tVar, 6), tVar, (i6 >> 12) & 112).a(j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j52, j51, j53, paVar2);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }

    @fg.l
    public final x3 e(@fg.l String yearSelectionSkeleton, @fg.l String selectedDateSkeleton, @fg.l String selectedDateDescriptionSkeleton) {
        return new y3(yearSelectionSkeleton, selectedDateSkeleton, selectedDateDescriptionSkeleton);
    }

    @fg.l
    public final s8 g() {
        return AllDates;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getDefaultDatePickerColors")
    public final u3 h(@fg.l a3 a3Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1180555308);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1180555308, i4, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:532)");
        }
        u3 defaultDatePickerColorsCached = a3Var.getDefaultDatePickerColorsCached();
        if (defaultDatePickerColorsCached == null) {
            c0.j jVar = c0.j.f37473a;
            defaultDatePickerColorsCached = new u3(b3.h(a3Var, jVar.a()), b3.h(a3Var, jVar.x()), b3.h(a3Var, jVar.v()), b3.h(a3Var, jVar.S()), b3.h(a3Var, jVar.G()), a3Var.getOnSurfaceVariant(), b3.h(a3Var, jVar.R()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, jVar.R()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, jVar.r()), b3.h(a3Var, jVar.N()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, jVar.N()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, jVar.M()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, jVar.M()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, jVar.s()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, jVar.s()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, jVar.l()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, jVar.l()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, jVar.k()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, jVar.k()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, jVar.r()), b3.h(a3Var, jVar.p()), b3.h(a3Var, jVar.z()), b3.h(a3Var, jVar.I()), b3.h(a3Var, c0.l.f37624a.a()), q7.f13678a.g(a3Var, tVar, (i4 & 14) | 48), null);
            a3Var.I0(defaultDatePickerColorsCached);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return defaultDatePickerColorsCached;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 i(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(700927667);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(700927667, i4, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:719)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.j.f37473a.d(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    public final float j() {
        return TonalElevation;
    }

    @fg.l
    public final kotlin.ranges.l k() {
        return YearRange;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.foundation.gestures.e0 l(@fg.l androidx.compose.foundation.lazy.c0 c0Var, @fg.m androidx.compose.animation.core.z<Float> zVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-2036003494);
        if ((i5 & 2) != 0) {
            zVar = androidx.compose.animation.core.b0.d(0.0f, 0.0f, 3, null);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2036003494, i4, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:700)");
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i());
        tVar.P(-1872611444);
        boolean q02 = tVar.q0(dVar);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new s9(c0Var, zVar, androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null), dVar);
            tVar.E(Q);
        }
        s9 s9Var = (s9) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s9Var;
    }
}
