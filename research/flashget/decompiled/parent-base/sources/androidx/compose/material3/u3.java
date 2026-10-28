package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u008c\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u001b*\u0004\u0018\u00010\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0!H\u0000¢\u0006\u0004\b#\u0010$J5\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b+\u0010,J-\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0001¢\u0006\u0004\b.\u0010/J-\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u00100\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b1\u0010/J%\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020%2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010:\u001a\u0004\b?\u0010<R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010:\u001a\u0004\b@\u0010<R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010:\u001a\u0004\bA\u0010<R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bC\u0010<R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\bG\u0010<R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bB\u0010<R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010<R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010<R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bP\u0010<R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010:\u001a\u0004\bF\u0010<R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010:\u001a\u0004\bK\u0010<R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bQ\u0010<R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010:\u001a\u0004\bO\u0010<R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\bS\u0010<R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bM\u0010<R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010:\u001a\u0004\bU\u0010<R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010:\u001a\u0004\bH\u0010<R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bI\u0010<R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bR\u0010<R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b>\u0010V\u001a\u0004\bD\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/material3/u3;", "", "Landroidx/compose/ui/graphics/d2;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "Landroidx/compose/material3/pa;", "dateTextFieldColors", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/pa;Lkotlin/jvm/internal/w;)V", "a", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/pa;)Landroidx/compose/material3/u3;", "Lkotlin/Function0;", "block", "D", "(Landroidx/compose/material3/pa;Lld/a;)Landroidx/compose/material3/pa;", "", "isToday", "selected", "inRange", "enabled", "Landroidx/compose/runtime/b5;", "d", "(ZZZZLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "animate", "c", "(ZZZLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "currentYear", "F", "E", "(ZZLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "e", "()J", "b", "y", "r", "B", "x", "f", "s", "g", "C", "h", "p", "i", "j", "w", "k", "o", "l", "v", "m", "n", "u", "q", "t", "z", "A", "Landroidx/compose/material3/pa;", "()Landroidx/compose/material3/pa;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f5
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2268:1\n658#2:2269\n646#2:2270\n658#2:2271\n646#2:2272\n658#2:2273\n646#2:2274\n658#2:2275\n646#2:2276\n658#2:2277\n646#2:2278\n658#2:2279\n646#2:2280\n658#2:2281\n646#2:2282\n658#2:2283\n646#2:2284\n658#2:2285\n646#2:2286\n658#2:2287\n646#2:2288\n658#2:2289\n646#2:2290\n658#2:2291\n646#2:2292\n658#2:2293\n646#2:2294\n658#2:2295\n646#2:2296\n658#2:2297\n646#2:2298\n658#2:2299\n646#2:2300\n658#2:2301\n646#2:2302\n658#2:2303\n646#2:2304\n658#2:2305\n646#2:2306\n658#2:2307\n646#2:2308\n658#2:2309\n646#2:2310\n658#2:2311\n646#2:2312\n658#2:2313\n646#2:2314\n658#2:2315\n646#2:2316\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n*L\n847#1:2269\n847#1:2270\n848#1:2271\n848#1:2272\n849#1:2273\n849#1:2274\n850#1:2275\n850#1:2276\n851#1:2277\n851#1:2278\n852#1:2279\n852#1:2280\n853#1:2281\n853#1:2282\n854#1:2283\n854#1:2284\n855#1:2285\n855#1:2286\n856#1:2287\n856#1:2288\n857#1:2289\n857#1:2290\n858#1:2291\n858#1:2292\n859#1:2293\n859#1:2294\n860#1:2295\n860#1:2296\n861#1:2297\n861#1:2298\n862#1:2299\n862#1:2300\n863#1:2301\n863#1:2302\n864#1:2303\n864#1:2304\n865#1:2305\n865#1:2306\n866#1:2307\n866#1:2308\n867#1:2309\n867#1:2310\n868#1:2311\n868#1:2312\n869#1:2313\n869#1:2314\n870#1:2315\n870#1:2316\n*E\n"})
/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: z, reason: collision with root package name */
    public static final int f14840z = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long titleContentColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long headlineContentColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long weekdayContentColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long subheadContentColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long navigationContentColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long yearContentColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledYearContentColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long currentYearContentColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long selectedYearContentColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedYearContentColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long selectedYearContainerColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedYearContainerColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long dayContentColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long disabledDayContentColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long selectedDayContentColor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedDayContentColor;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long selectedDayContainerColor;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedDayContainerColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long todayContentColor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long todayDateBorderColor;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long dayInSelectionRangeContainerColor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long dayInSelectionRangeContentColor;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long dividerColor;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final pa dateTextFieldColors;

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/pa;", "a", "()Landroidx/compose/material3/pa;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<pa> {
        a() {
            super(0);
        }

        @fg.l
        public final pa a() {
            return u3.this.getDateTextFieldColors();
        }

        @Override // ld.a
        public pa invoke() {
            return u3.this.getDateTextFieldColors();
        }
    }

    public /* synthetic */ u3(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, pa paVar, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, paVar);
    }

    /* renamed from: A, reason: from getter */
    public final long getTodayDateBorderColor() {
        return this.todayDateBorderColor;
    }

    /* renamed from: B, reason: from getter */
    public final long getWeekdayContentColor() {
        return this.weekdayContentColor;
    }

    /* renamed from: C, reason: from getter */
    public final long getYearContentColor() {
        return this.yearContentColor;
    }

    @fg.l
    public final pa D(@fg.m pa paVar, @fg.l ld.a<pa> aVar) {
        return paVar == null ? aVar.invoke() : paVar;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> E(boolean z4, boolean z5, @fg.m androidx.compose.runtime.t tVar, int i4) {
        long j4;
        tVar.P(-1306331107);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1306331107, i4, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:974)");
        }
        if (z4) {
            j4 = z5 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor;
        } else {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j4 = androidx.compose.ui.graphics.d2.f17777n;
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c5 = androidx.compose.animation.u0.c(j4, androidx.compose.animation.core.l.r(100, 0, null, 6, null), null, null, tVar, 0, 12);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> F(boolean z4, boolean z5, boolean z6, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(874111097);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(874111097, i4, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:952)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c5 = androidx.compose.animation.u0.c((z5 && z6) ? this.selectedYearContentColor : (!z5 || z6) ? z4 ? this.currentYearContentColor : z6 ? this.yearContentColor : this.disabledYearContentColor : this.disabledSelectedYearContentColor, androidx.compose.animation.core.l.r(100, 0, null, 6, null), null, null, tVar, 0, 12);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    public final u3 a(long containerColor, long titleContentColor, long headlineContentColor, long weekdayContentColor, long subheadContentColor, long navigationContentColor, long yearContentColor, long disabledYearContentColor, long currentYearContentColor, long selectedYearContentColor, long disabledSelectedYearContentColor, long selectedYearContainerColor, long disabledSelectedYearContainerColor, long dayContentColor, long disabledDayContentColor, long selectedDayContentColor, long disabledSelectedDayContentColor, long selectedDayContainerColor, long disabledSelectedDayContainerColor, long todayContentColor, long todayDateBorderColor, long dayInSelectionRangeContainerColor, long dayInSelectionRangeContentColor, long dividerColor, @fg.m pa dateTextFieldColors) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = containerColor != androidx.compose.ui.graphics.d2.f17778o ? containerColor : this.containerColor;
        companion.getClass();
        long j5 = titleContentColor != androidx.compose.ui.graphics.d2.f17778o ? titleContentColor : this.titleContentColor;
        companion.getClass();
        long j6 = headlineContentColor != androidx.compose.ui.graphics.d2.f17778o ? headlineContentColor : this.headlineContentColor;
        companion.getClass();
        long j7 = weekdayContentColor != androidx.compose.ui.graphics.d2.f17778o ? weekdayContentColor : this.weekdayContentColor;
        companion.getClass();
        long j10 = subheadContentColor != androidx.compose.ui.graphics.d2.f17778o ? subheadContentColor : this.subheadContentColor;
        companion.getClass();
        long j11 = navigationContentColor != androidx.compose.ui.graphics.d2.f17778o ? navigationContentColor : this.navigationContentColor;
        companion.getClass();
        long j12 = yearContentColor != androidx.compose.ui.graphics.d2.f17778o ? yearContentColor : this.yearContentColor;
        companion.getClass();
        long j13 = disabledYearContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledYearContentColor : this.disabledYearContentColor;
        companion.getClass();
        long j14 = currentYearContentColor != androidx.compose.ui.graphics.d2.f17778o ? currentYearContentColor : this.currentYearContentColor;
        companion.getClass();
        long j15 = selectedYearContentColor != androidx.compose.ui.graphics.d2.f17778o ? selectedYearContentColor : this.selectedYearContentColor;
        companion.getClass();
        long j16 = disabledSelectedYearContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledSelectedYearContentColor : this.disabledSelectedYearContentColor;
        companion.getClass();
        long j17 = selectedYearContainerColor != androidx.compose.ui.graphics.d2.f17778o ? selectedYearContainerColor : this.selectedYearContainerColor;
        companion.getClass();
        long j18 = disabledSelectedYearContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledSelectedYearContainerColor : this.disabledSelectedYearContainerColor;
        companion.getClass();
        long j19 = dayContentColor != androidx.compose.ui.graphics.d2.f17778o ? dayContentColor : this.dayContentColor;
        companion.getClass();
        long j20 = disabledDayContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledDayContentColor : this.disabledDayContentColor;
        companion.getClass();
        long j21 = selectedDayContentColor != androidx.compose.ui.graphics.d2.f17778o ? selectedDayContentColor : this.selectedDayContentColor;
        companion.getClass();
        long j22 = disabledSelectedDayContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledSelectedDayContentColor : this.disabledSelectedDayContentColor;
        companion.getClass();
        long j23 = selectedDayContainerColor != androidx.compose.ui.graphics.d2.f17778o ? selectedDayContainerColor : this.selectedDayContainerColor;
        companion.getClass();
        long j24 = disabledSelectedDayContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledSelectedDayContainerColor : this.disabledSelectedDayContainerColor;
        companion.getClass();
        long j25 = todayContentColor != androidx.compose.ui.graphics.d2.f17778o ? todayContentColor : this.todayContentColor;
        companion.getClass();
        long j26 = todayDateBorderColor != androidx.compose.ui.graphics.d2.f17778o ? todayDateBorderColor : this.todayDateBorderColor;
        companion.getClass();
        long j27 = dayInSelectionRangeContainerColor != androidx.compose.ui.graphics.d2.f17778o ? dayInSelectionRangeContainerColor : this.dayInSelectionRangeContainerColor;
        companion.getClass();
        long j28 = dayInSelectionRangeContentColor != androidx.compose.ui.graphics.d2.f17778o ? dayInSelectionRangeContentColor : this.dayInSelectionRangeContentColor;
        companion.getClass();
        return new u3(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, dividerColor != androidx.compose.ui.graphics.d2.f17778o ? dividerColor : this.dividerColor, D(dateTextFieldColors, new a()));
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c(boolean z4, boolean z5, boolean z6, @fg.m androidx.compose.runtime.t tVar, int i4) {
        long j4;
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4;
        tVar.P(-1240482658);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1240482658, i4, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:924)");
        }
        if (z4) {
            j4 = z5 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor;
        } else {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j4 = androidx.compose.ui.graphics.d2.f17777n;
        }
        long j5 = j4;
        if (z6) {
            tVar.P(1577421952);
            u4 = androidx.compose.animation.u0.c(j5, androidx.compose.animation.core.l.r(100, 0, null, 6, null), null, null, tVar, 0, 12);
            tVar.p0();
        } else {
            tVar.P(1577422116);
            u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(j5), tVar, 0);
            tVar.p0();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> d(boolean z4, boolean z5, boolean z6, boolean z7, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c5;
        tVar.P(-1233694918);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1233694918, i4, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:890)");
        }
        long j4 = (z5 && z7) ? this.selectedDayContentColor : (!z5 || z7) ? (z6 && z7) ? this.dayInSelectionRangeContentColor : (!z6 || z7) ? z4 ? this.todayContentColor : z7 ? this.dayContentColor : this.disabledDayContentColor : this.disabledDayContentColor : this.disabledSelectedDayContentColor;
        if (z6) {
            tVar.P(379022200);
            c5 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(j4), tVar, 0);
            tVar.p0();
        } else {
            tVar.P(379022258);
            c5 = androidx.compose.animation.u0.c(j4, androidx.compose.animation.core.l.r(100, 0, null, 6, null), null, null, tVar, 0, 12);
            tVar.p0();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    /* renamed from: e, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) other;
        return androidx.compose.ui.graphics.d2.y(this.containerColor, u3Var.containerColor) && kotlin.a2.o(this.titleContentColor, u3Var.titleContentColor) && kotlin.a2.o(this.headlineContentColor, u3Var.headlineContentColor) && kotlin.a2.o(this.weekdayContentColor, u3Var.weekdayContentColor) && kotlin.a2.o(this.subheadContentColor, u3Var.subheadContentColor) && kotlin.a2.o(this.yearContentColor, u3Var.yearContentColor) && kotlin.a2.o(this.disabledYearContentColor, u3Var.disabledYearContentColor) && kotlin.a2.o(this.currentYearContentColor, u3Var.currentYearContentColor) && kotlin.a2.o(this.selectedYearContentColor, u3Var.selectedYearContentColor) && kotlin.a2.o(this.disabledSelectedYearContentColor, u3Var.disabledSelectedYearContentColor) && kotlin.a2.o(this.selectedYearContainerColor, u3Var.selectedYearContainerColor) && kotlin.a2.o(this.disabledSelectedYearContainerColor, u3Var.disabledSelectedYearContainerColor) && kotlin.a2.o(this.dayContentColor, u3Var.dayContentColor) && kotlin.a2.o(this.disabledDayContentColor, u3Var.disabledDayContentColor) && kotlin.a2.o(this.selectedDayContentColor, u3Var.selectedDayContentColor) && kotlin.a2.o(this.disabledSelectedDayContentColor, u3Var.disabledSelectedDayContentColor) && kotlin.a2.o(this.selectedDayContainerColor, u3Var.selectedDayContainerColor) && kotlin.a2.o(this.disabledSelectedDayContainerColor, u3Var.disabledSelectedDayContainerColor) && kotlin.a2.o(this.todayContentColor, u3Var.todayContentColor) && kotlin.a2.o(this.todayDateBorderColor, u3Var.todayDateBorderColor) && kotlin.a2.o(this.dayInSelectionRangeContainerColor, u3Var.dayInSelectionRangeContainerColor) && kotlin.a2.o(this.dayInSelectionRangeContentColor, u3Var.dayInSelectionRangeContentColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getCurrentYearContentColor() {
        return this.currentYearContentColor;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final pa getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* renamed from: h, reason: from getter */
    public final long getDayContentColor() {
        return this.dayContentColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.dayInSelectionRangeContentColor) + m0.a(this.dayInSelectionRangeContainerColor, m0.a(this.todayDateBorderColor, m0.a(this.todayContentColor, m0.a(this.disabledSelectedDayContainerColor, m0.a(this.selectedDayContainerColor, m0.a(this.disabledSelectedDayContentColor, m0.a(this.selectedDayContentColor, m0.a(this.disabledDayContentColor, m0.a(this.dayContentColor, m0.a(this.disabledSelectedYearContainerColor, m0.a(this.selectedYearContainerColor, m0.a(this.disabledSelectedYearContentColor, m0.a(this.selectedYearContentColor, m0.a(this.currentYearContentColor, m0.a(this.disabledYearContentColor, m0.a(this.yearContentColor, m0.a(this.subheadContentColor, m0.a(this.weekdayContentColor, m0.a(this.headlineContentColor, m0.a(this.titleContentColor, androidx.compose.ui.graphics.d2.K(this.containerColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getDayInSelectionRangeContainerColor() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* renamed from: j, reason: from getter */
    public final long getDayInSelectionRangeContentColor() {
        return this.dayInSelectionRangeContentColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getDisabledDayContentColor() {
        return this.disabledDayContentColor;
    }

    /* renamed from: l, reason: from getter */
    public final long getDisabledSelectedDayContainerColor() {
        return this.disabledSelectedDayContainerColor;
    }

    /* renamed from: m, reason: from getter */
    public final long getDisabledSelectedDayContentColor() {
        return this.disabledSelectedDayContentColor;
    }

    /* renamed from: n, reason: from getter */
    public final long getDisabledSelectedYearContainerColor() {
        return this.disabledSelectedYearContainerColor;
    }

    /* renamed from: o, reason: from getter */
    public final long getDisabledSelectedYearContentColor() {
        return this.disabledSelectedYearContentColor;
    }

    /* renamed from: p, reason: from getter */
    public final long getDisabledYearContentColor() {
        return this.disabledYearContentColor;
    }

    /* renamed from: q, reason: from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    /* renamed from: r, reason: from getter */
    public final long getHeadlineContentColor() {
        return this.headlineContentColor;
    }

    /* renamed from: s, reason: from getter */
    public final long getNavigationContentColor() {
        return this.navigationContentColor;
    }

    /* renamed from: t, reason: from getter */
    public final long getSelectedDayContainerColor() {
        return this.selectedDayContainerColor;
    }

    /* renamed from: u, reason: from getter */
    public final long getSelectedDayContentColor() {
        return this.selectedDayContentColor;
    }

    /* renamed from: v, reason: from getter */
    public final long getSelectedYearContainerColor() {
        return this.selectedYearContainerColor;
    }

    /* renamed from: w, reason: from getter */
    public final long getSelectedYearContentColor() {
        return this.selectedYearContentColor;
    }

    /* renamed from: x, reason: from getter */
    public final long getSubheadContentColor() {
        return this.subheadContentColor;
    }

    /* renamed from: y, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* renamed from: z, reason: from getter */
    public final long getTodayContentColor() {
        return this.todayContentColor;
    }

    private u3(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, pa paVar) {
        this.containerColor = j4;
        this.titleContentColor = j5;
        this.headlineContentColor = j6;
        this.weekdayContentColor = j7;
        this.subheadContentColor = j10;
        this.navigationContentColor = j11;
        this.yearContentColor = j12;
        this.disabledYearContentColor = j13;
        this.currentYearContentColor = j14;
        this.selectedYearContentColor = j15;
        this.disabledSelectedYearContentColor = j16;
        this.selectedYearContainerColor = j17;
        this.disabledSelectedYearContainerColor = j18;
        this.dayContentColor = j19;
        this.disabledDayContentColor = j20;
        this.selectedDayContentColor = j21;
        this.disabledSelectedDayContentColor = j22;
        this.selectedDayContainerColor = j23;
        this.disabledSelectedDayContainerColor = j24;
        this.todayContentColor = j25;
        this.todayDateBorderColor = j26;
        this.dayInSelectionRangeContainerColor = j27;
        this.dayInSelectionRangeContentColor = j28;
        this.dividerColor = j29;
        this.dateTextFieldColors = paVar;
    }
}
