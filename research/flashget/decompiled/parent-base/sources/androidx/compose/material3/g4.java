package androidx.compose.material3;

import androidx.compose.material3.p4;
import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import androidx.compose.runtime.t;
import androidx.compose.ui.node.g;
import androidx.profileinstaller.o;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a`\u0010 \u001a\u00020\u00002\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a½\u0001\u00101\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00112\b\u0010#\u001a\u0004\u0018\u00010\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00172:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00070&2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00070,2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a²\u0001\u00103\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00112\b\u0010#\u001a\u0004\u0018\u00010\u00112\u0006\u0010$\u001a\u00020\u00112:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00070&2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00070,2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b3\u00104\u001a²\u0001\u00107\u001a\u00020\u00072\u0006\u00106\u001a\u0002052\b\u0010\"\u001a\u0004\u0018\u00010\u00112\b\u0010#\u001a\u0004\u0018\u00010\u00112:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00070&2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00070,2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b7\u00108\u001ag\u0010<\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u00010\u00112\b\u0010;\u001a\u0004\u0018\u00010\u00112:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00070&H\u0002¢\u0006\u0004\b<\u0010=\u001a&\u0010C\u001a\u00020\u0007*\u00020>2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0000ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a5\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010\u0001\u001a\u0002052\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0002¢\u0006\u0004\bL\u0010M\"\u001a\u0010R\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010Q\"\u0014\u0010S\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010O\"\u0014\u0010T\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010O\"\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/material3/h4;", "state", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/material3/x3;", "dateFormatter", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "title", "headline", "", "showModeToggle", "Landroidx/compose/material3/u3;", "colors", "a", "(Landroidx/compose/material3/h4;Landroidx/compose/ui/q;Landroidx/compose/material3/x3;Lld/p;Lld/p;ZLandroidx/compose/material3/u3;Landroidx/compose/runtime/t;II)V", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/p4;", "initialDisplayMode", "Landroidx/compose/material3/s8;", "selectableDates", "q", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/s8;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/h4;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "c", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/s8;)Landroidx/compose/material3/h4;", "selectedStartDateMillis", "selectedEndDateMillis", "displayedMonthMillis", "displayMode", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "startDateMillis", "endDateMillis", "onDatesSelectionChange", "Lkotlin/Function1;", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/s0;", "calendarModel", "e", "(Ljava/lang/Long;Ljava/lang/Long;JILld/p;Lld/l;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;II)V", "b", "(Ljava/lang/Long;Ljava/lang/Long;JLld/p;Lld/l;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/foundation/lazy/c0;", "lazyListState", "f", "(Landroidx/compose/foundation/lazy/c0;Ljava/lang/Long;Ljava/lang/Long;Lld/p;Lld/l;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "r", "(JLjava/lang/Long;Ljava/lang/Long;Lld/p;)V", "Landroidx/compose/ui/graphics/drawscope/c;", "Landroidx/compose/material3/t8;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/d2;", "color", "o", "(Landroidx/compose/ui/graphics/drawscope/c;Landroidx/compose/material3/t8;J)V", "Lkotlinx/coroutines/r0;", "coroutineScope", "", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/e;", "n", "(Landroidx/compose/foundation/lazy/c0;Lkotlinx/coroutines/r0;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/foundation/layout/l1;", "p", "()Landroidx/compose/foundation/layout/l1;", "CalendarMonthSubheadPadding", "DateRangePickerTitlePadding", "DateRangePickerHeadlinePadding", "Landroidx/compose/ui/unit/h;", "d", "F", "HeaderHeightOffset", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1099:1\n1116#2,6:1100\n1116#2,6:1106\n1116#2,6:1113\n1116#2,6:1159\n1116#2,6:1165\n58#3:1112\n74#4,6:1119\n80#4:1153\n84#4:1158\n78#5,11:1125\n91#5:1157\n456#6,8:1136\n464#6,3:1150\n467#6,3:1154\n3737#7,6:1144\n154#8:1171\n154#8:1172\n154#8:1173\n154#8:1174\n154#8:1175\n154#8:1176\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n88#1:1100,6\n108#1:1106,6\n266#1:1113,6\n772#1:1159,6\n873#1:1165,6\n127#1:1112\n736#1:1119,6\n736#1:1153\n736#1:1158\n736#1:1125,11\n736#1:1157\n736#1:1136,8\n736#1:1150,3\n736#1:1154,3\n736#1:1144,6\n904#1:1171\n905#1:1172\n906#1:1173\n1091#1:1174\n1093#1:1175\n1098#1:1176\n*E\n"})
/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f10854b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f10855c;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f10853a = androidx.compose.foundation.layout.j1.e(androidx.compose.ui.unit.h.g(24), 20, 0.0f, 8, 4, null);

    /* renamed from: d, reason: collision with root package name */
    private static final float f10856d = 60;

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h4 f10857b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h4 h4Var) {
            super(2);
            this.f10857b = h4Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-162164694, i4, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
            }
            e4.f10614a.c(this.f10857b.e(), androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, g4.f10854b), tVar, 432, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h4 f10858b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x3 f10859c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h4 h4Var, x3 x3Var) {
            super(2);
            this.f10858b = h4Var;
            this.f10859c = x3Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-185279404, i4, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
            }
            e4.f10614a.b(this.f10858b.j(), this.f10858b.g(), this.f10858b.e(), this.f10859c, androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, g4.f10855c), tVar, 221184, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n1116#2,6:1100\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$4\n*L\n118#1:1100,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h4 f10860b;

        /* compiled from: DateRangePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/p4;", "displayMode", "Lkotlin/k2;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<p4, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h4 f10861b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h4 h4Var) {
                super(1);
                this.f10861b = h4Var;
            }

            public final void a(int i4) {
                this.f10861b.d(i4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(p4 p4Var) {
                a(p4Var.getValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h4 h4Var) {
            super(2);
            this.f10860b = h4Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1490010652, i4, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
            }
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, a4.J());
            int e4 = this.f10860b.e();
            tVar.P(-1467496949);
            boolean q02 = tVar.q0(this.f10860b);
            h4 h4Var = this.f10860b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(h4Var);
                tVar.E(Q);
            }
            tVar.p0();
            a4.j(j4, e4, (ld.l) Q, tVar, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n1116#2,6:1100\n1116#2,6:1106\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$5\n*L\n136#1:1100,6\n147#1:1106,6\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h4 f10862b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s0 f10863c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x3 f10864d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u3 f10865e;

        /* compiled from: DateRangePicker.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "startDateMillis", "endDateMillis", "Lkotlin/k2;", "a", "(Ljava/lang/Long;Ljava/lang/Long;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<Long, Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h4 f10866b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h4 h4Var) {
                super(2);
                this.f10866b = h4Var;
            }

            public final void a(@fg.m Long l4, @fg.m Long l5) {
                try {
                    this.f10866b.h(l4, l5);
                } catch (IllegalArgumentException unused) {
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4, Long l5) {
                a(l4, l5);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: DateRangePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "monthInMillis", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h4 f10867b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h4 h4Var) {
                super(1);
                this.f10867b = h4Var;
            }

            public final void a(long j4) {
                this.f10867b.a(j4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
                a(l4.longValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h4 h4Var, s0 s0Var, x3 x3Var, u3 u3Var) {
            super(2);
            this.f10862b = h4Var;
            this.f10863c = s0Var;
            this.f10864d = x3Var;
            this.f10865e = u3Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-57534331, i4, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
            }
            Long j4 = this.f10862b.j();
            Long g4 = this.f10862b.g();
            long f4 = this.f10862b.f();
            int e4 = this.f10862b.e();
            tVar.P(-1467496213);
            boolean q02 = tVar.q0(this.f10862b);
            h4 h4Var = this.f10862b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(h4Var);
                tVar.E(Q);
            }
            ld.p pVar = (ld.p) Q;
            tVar.p0();
            tVar.P(-1467495707);
            boolean q03 = tVar.q0(this.f10862b);
            h4 h4Var2 = this.f10862b;
            Object Q2 = tVar.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new b(h4Var2);
                tVar.E(Q2);
            }
            tVar.p0();
            g4.e(j4, g4, f4, e4, pVar, (ld.l) Q2, this.f10863c, this.f10862b.c(), this.f10864d, this.f10862b.b(), this.f10865e, tVar, 0, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h4 f10868b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10869c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x3 f10870d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10871e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10872f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f10873g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u3 f10874h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f10875i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f10876j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(h4 h4Var, androidx.compose.ui.q qVar, x3 x3Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, boolean z4, u3 u3Var, int i4, int i5) {
            super(2);
            this.f10868b = h4Var;
            this.f10869c = qVar;
            this.f10870d = x3Var;
            this.f10871e = pVar;
            this.f10872f = pVar2;
            this.f10873g = z4;
            this.f10874h = u3Var;
            this.f10875i = i4;
            this.f10876j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g4.a(this.f10868b, this.f10869c, this.f10870d, this.f10871e, this.f10872f, this.f10873g, this.f10874h, tVar, androidx.compose.runtime.g3.b(this.f10875i | 1), this.f10876j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f10877b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10879d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10880e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f10881f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f10882g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f10883h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x3 f10884i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ s8 f10885j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u3 f10886k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f10887l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Long l4, Long l5, long j4, ld.p<? super Long, ? super Long, kotlin.k2> pVar, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, x3 x3Var, s8 s8Var, u3 u3Var, int i4) {
            super(2);
            this.f10877b = l4;
            this.f10878c = l5;
            this.f10879d = j4;
            this.f10880e = pVar;
            this.f10881f = lVar;
            this.f10882g = s0Var;
            this.f10883h = lVar2;
            this.f10884i = x3Var;
            this.f10885j = s8Var;
            this.f10886k = u3Var;
            this.f10887l = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g4.b(this.f10877b, this.f10878c, this.f10879d, this.f10880e, this.f10881f, this.f10882g, this.f10883h, this.f10884i, this.f10885j, this.f10886k, tVar, androidx.compose.runtime.g3.b(this.f10887l | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f10888b = new g(1);

        g() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.Z0(zVar, true);
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.Z0(zVar, true);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/p4;", "mode", "Lkotlin/k2;", "a", "(ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.q<p4, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f10889b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10890c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10891d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10892e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f10893f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f10894g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f10895h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x3 f10896i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ s8 f10897j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u3 f10898k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Long l4, Long l5, long j4, ld.p<? super Long, ? super Long, kotlin.k2> pVar, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, x3 x3Var, s8 s8Var, u3 u3Var) {
            super(3);
            this.f10889b = l4;
            this.f10890c = l5;
            this.f10891d = j4;
            this.f10892e = pVar;
            this.f10893f = lVar;
            this.f10894g = s0Var;
            this.f10895h = lVar2;
            this.f10896i = x3Var;
            this.f10897j = s8Var;
            this.f10898k = u3Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(p4 p4Var, androidx.compose.runtime.t tVar, Integer num) {
            a(p4Var.getValue(), tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 6) == 0) {
                i6 = i5 | (tVar.f(i4) ? 4 : 2);
            } else {
                i6 = i5;
            }
            if ((i6 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1026642619, i6, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:690)");
            }
            p4.Companion companion = p4.INSTANCE;
            companion.getClass();
            if (p4.f(i4, p4.f13206c)) {
                tVar.P(-1168744807);
                g4.b(this.f10889b, this.f10890c, this.f10891d, this.f10892e, this.f10893f, this.f10894g, this.f10895h, this.f10896i, this.f10897j, this.f10898k, tVar, 0);
                tVar.p0();
            } else {
                companion.getClass();
                if (p4.f(i4, p4.f13207d)) {
                    tVar.P(-1168744198);
                    d4.a(this.f10889b, this.f10890c, this.f10892e, this.f10894g, this.f10895h, this.f10896i, this.f10897j, this.f10898k, tVar, 0);
                    tVar.p0();
                } else {
                    tVar.P(-1168743741);
                    tVar.p0();
                }
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f10899b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10900c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10901d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10902e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10903f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f10904g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ s0 f10905h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f10906i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ x3 f10907j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ s8 f10908k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ u3 f10909l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f10910m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f10911n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Long l4, Long l5, long j4, int i4, ld.p<? super Long, ? super Long, kotlin.k2> pVar, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, x3 x3Var, s8 s8Var, u3 u3Var, int i5, int i6) {
            super(2);
            this.f10899b = l4;
            this.f10900c = l5;
            this.f10901d = j4;
            this.f10902e = i4;
            this.f10903f = pVar;
            this.f10904g = lVar;
            this.f10905h = s0Var;
            this.f10906i = lVar2;
            this.f10907j = x3Var;
            this.f10908k = s8Var;
            this.f10909l = u3Var;
            this.f10910m = i5;
            this.f10911n = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g4.e(this.f10899b, this.f10900c, this.f10901d, this.f10902e, this.f10903f, this.f10904g, this.f10905h, this.f10906i, this.f10907j, this.f10908k, this.f10909l, tVar, androidx.compose.runtime.g3.b(this.f10910m | 1), androidx.compose.runtime.g3.b(this.f10911n));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1099:1\n487#2,4:1100\n491#2,2:1108\n495#2:1114\n25#3:1104\n1116#4,3:1105\n1119#4,3:1111\n1116#4,6:1117\n1116#4,6:1123\n487#5:1110\n117#6:1115\n115#6:1116\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n*L\n781#1:1100,4\n781#1:1108,2\n781#1:1114\n781#1:1104\n781#1:1105,3\n781#1:1111,3\n787#1:1117,6\n811#1:1123,6\n781#1:1110\n782#1:1115\n783#1:1116\n*E\n"})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f10912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10913c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10914d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f10915e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f10916f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f10917g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ j2 f10918h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x3 f10919i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u3 f10920j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ r0 f10921k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ s8 f10922l;

        /* compiled from: DateRangePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f10923b = new a(1);

            /* compiled from: DateRangePicker.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.g4$j$a$a, reason: collision with other inner class name */
            static final class C0241a extends kotlin.jvm.internal.n0 implements ld.a<Float> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0241a f10924b = new C0241a(0);

                C0241a() {
                    super(0);
                }

                @fg.l
                public final Float a() {
                    return Float.valueOf(0.0f);
                }

                @Override // ld.a
                public Float invoke() {
                    return Float.valueOf(0.0f);
                }
            }

            /* compiled from: DateRangePicker.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<Float> {

                /* renamed from: b, reason: collision with root package name */
                public static final b f10925b = new b(0);

                b() {
                    super(0);
                }

                @fg.l
                public final Float a() {
                    return Float.valueOf(0.0f);
                }

                @Override // ld.a
                public Float invoke() {
                    return Float.valueOf(0.0f);
                }
            }

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.C1(zVar, new androidx.compose.ui.semantics.j(C0241a.f10924b, b.f10925b, false, 4, null));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: DateRangePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/y;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.lazy.y, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.l f10926b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s0 f10927c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ j2 f10928d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Long f10929e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Long f10930f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ld.l<Long, kotlin.k2> f10931g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ r0 f10932h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ x3 f10933i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ s8 f10934j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ u3 f10935k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.semantics.e> f10936l;

            /* compiled from: DateRangePicker.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/b;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/b;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n74#2,6:1100\n80#2:1134\n84#2:1145\n78#3,11:1106\n91#3:1144\n456#4,8:1117\n464#4,3:1131\n467#4,3:1141\n3737#5,6:1125\n1116#6,6:1135\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1\n*L\n818#1:1100,6\n818#1:1134\n818#1:1145\n818#1:1106,11\n818#1:1144\n818#1:1117,8\n818#1:1131,3\n818#1:1141,3\n818#1:1125,6\n844#1:1135,6\n*E\n"})
            static final class a extends kotlin.jvm.internal.n0 implements ld.r<androidx.compose.foundation.lazy.b, Integer, androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s0 f10937b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ j2 f10938c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Long f10939d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Long f10940e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ld.l<Long, kotlin.k2> f10941f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ r0 f10942g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ x3 f10943h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ s8 f10944i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ u3 f10945j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.semantics.e> f10946k;

                /* compiled from: DateRangePicker.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.jvm.internal.r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n1116#2,6:1100\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1\n*L\n834#1:1100,6\n*E\n"})
                /* renamed from: androidx.compose.material3.g4$j$b$a$a, reason: collision with other inner class name */
                static final class C0242a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ x3 f10947b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ j2 f10948c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ List<androidx.compose.ui.semantics.e> f10949d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ u3 f10950e;

                    /* compiled from: DateRangePicker.kt */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.g4$j$b$a$a$a, reason: collision with other inner class name */
                    static final class C0243a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

                        /* renamed from: b, reason: collision with root package name */
                        public static final C0243a f10951b = new C0243a(0);

                        C0243a() {
                            super(0);
                        }

                        public final void a() {
                        }

                        @Override // ld.a
                        public kotlin.k2 invoke() {
                            return kotlin.k2.f75408a;
                        }
                    }

                    /* compiled from: DateRangePicker.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.g4$j$b$a$a$b, reason: collision with other inner class name */
                    static final class C0244b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ List<androidx.compose.ui.semantics.e> f10952b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0244b(List<androidx.compose.ui.semantics.e> list) {
                            super(1);
                            this.f10952b = list;
                        }

                        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                            androidx.compose.ui.semantics.w.b1(zVar, this.f10952b);
                        }

                        @Override // ld.l
                        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                            a(zVar);
                            return kotlin.k2.f75408a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0242a(x3 x3Var, j2 j2Var, List<androidx.compose.ui.semantics.e> list, u3 u3Var) {
                        super(2);
                        this.f10947b = x3Var;
                        this.f10948c = j2Var;
                        this.f10949d = list;
                        this.f10950e = u3Var;
                    }

                    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.i
                    public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                        if ((i4 & 3) == 2 && tVar.p()) {
                            tVar.d0();
                            return;
                        }
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.r0(1622100276, i4, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:825)");
                        }
                        String b5 = this.f10947b.b(Long.valueOf(this.f10948c.m()), androidx.compose.material3.a.a(tVar, 0));
                        if (b5 == null) {
                            b5 = "-";
                        }
                        String str = b5;
                        androidx.compose.ui.q f4 = androidx.compose.foundation.g0.f(androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, g4.p()), false, null, null, C0243a.f10951b, 7, null);
                        tVar.P(413139989);
                        boolean S = tVar.S(this.f10949d);
                        List<androidx.compose.ui.semantics.e> list = this.f10949d;
                        Object Q = tVar.Q();
                        if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                            Q = new C0244b(list);
                            tVar.E(Q);
                        }
                        tVar.p0();
                        xa.c(str, androidx.compose.ui.semantics.o.f(f4, false, (ld.l) Q, 1, null), this.f10950e.getSubheadContentColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131064);
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.q0();
                        }
                    }

                    @Override // ld.p
                    public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                        a(tVar, num.intValue());
                        return kotlin.k2.f75408a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(s0 s0Var, j2 j2Var, Long l4, Long l5, ld.l<? super Long, kotlin.k2> lVar, r0 r0Var, x3 x3Var, s8 s8Var, u3 u3Var, List<androidx.compose.ui.semantics.e> list) {
                    super(4);
                    this.f10937b = s0Var;
                    this.f10938c = j2Var;
                    this.f10939d = l4;
                    this.f10940e = l5;
                    this.f10941f = lVar;
                    this.f10942g = r0Var;
                    this.f10943h = x3Var;
                    this.f10944i = s8Var;
                    this.f10945j = u3Var;
                    this.f10946k = list;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.l androidx.compose.foundation.lazy.b bVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
                    int i6;
                    t8 t8Var;
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (tVar.q0(bVar) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        i6 |= tVar.f(i4) ? 32 : 16;
                    }
                    if ((i6 & 147) == 146 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(-1413501381, i6, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:812)");
                    }
                    j2 t4 = this.f10937b.t(this.f10938c, i4);
                    androidx.compose.ui.q b5 = androidx.compose.foundation.lazy.b.b(bVar, androidx.compose.ui.q.INSTANCE, 0.0f, 1, null);
                    Long l4 = this.f10939d;
                    Long l5 = this.f10940e;
                    ld.l<Long, kotlin.k2> lVar = this.f10941f;
                    r0 r0Var = this.f10942g;
                    x3 x3Var = this.f10943h;
                    s8 s8Var = this.f10944i;
                    u3 u3Var = this.f10945j;
                    List<androidx.compose.ui.semantics.e> list = this.f10946k;
                    s0 s0Var = this.f10937b;
                    tVar.P(-483455358);
                    androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), tVar, 0, -1323940314);
                    int j4 = androidx.compose.runtime.p.j(tVar, 0);
                    androidx.compose.runtime.g0 B = tVar.B();
                    g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                    ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                    ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(b5);
                    if (tVar.s() == null) {
                        androidx.compose.runtime.p.n();
                    }
                    tVar.W();
                    if (tVar.getInserting()) {
                        tVar.F(a6);
                    } else {
                        tVar.C();
                    }
                    ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                    if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                        androidx.compose.animation.d.a(j4, tVar, j4, a7);
                    }
                    androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                    androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
                    xa.a(tb.a(p6.f13227a.c(tVar, 6), c0.j.f37473a.H()), androidx.compose.runtime.internal.c.b(tVar, 1622100276, true, new C0242a(x3Var, t4, list, u3Var)), tVar, 48);
                    tVar.P(-1455463505);
                    if (l4 == null || l5 == null) {
                        t8Var = null;
                    } else {
                        tVar.P(-1455463352);
                        boolean q02 = tVar.q0(l4) | tVar.q0(l5);
                        Object Q = tVar.Q();
                        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                            Q = t8.INSTANCE.a(t4, s0Var.f(l4.longValue()), s0Var.f(l5.longValue()));
                            tVar.E(Q);
                        }
                        tVar.p0();
                        t8Var = (t8) Q;
                    }
                    tVar.p0();
                    a4.l(t4, lVar, r0Var.k(), l4, l5, t8Var, x3Var, s8Var, u3Var, tVar, 0);
                    if (t.a(tVar)) {
                        androidx.compose.runtime.x.q0();
                    }
                }

                @Override // ld.r
                public /* bridge */ /* synthetic */ kotlin.k2 i(androidx.compose.foundation.lazy.b bVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
                    a(bVar, num.intValue(), tVar, num2.intValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlin.ranges.l lVar, s0 s0Var, j2 j2Var, Long l4, Long l5, ld.l<? super Long, kotlin.k2> lVar2, r0 r0Var, x3 x3Var, s8 s8Var, u3 u3Var, List<androidx.compose.ui.semantics.e> list) {
                super(1);
                this.f10926b = lVar;
                this.f10927c = s0Var;
                this.f10928d = j2Var;
                this.f10929e = l4;
                this.f10930f = l5;
                this.f10931g = lVar2;
                this.f10932h = r0Var;
                this.f10933i = x3Var;
                this.f10934j = s8Var;
                this.f10935k = u3Var;
                this.f10936l = list;
            }

            public final void a(@fg.l androidx.compose.foundation.lazy.y yVar) {
                androidx.compose.foundation.lazy.y.h(yVar, a4.M(this.f10926b), null, null, new androidx.compose.runtime.internal.b(-1413501381, true, new a(this.f10927c, this.f10928d, this.f10929e, this.f10930f, this.f10931g, this.f10932h, this.f10933i, this.f10934j, this.f10935k, this.f10936l)), 6, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.foundation.lazy.y yVar) {
                a(yVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: DateRangePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "dateInMillis", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Long f10953b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Long f10954c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10955d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(Long l4, Long l5, ld.p<? super Long, ? super Long, kotlin.k2> pVar) {
                super(1);
                this.f10953b = l4;
                this.f10954c = l5;
                this.f10955d = pVar;
            }

            public final void a(long j4) {
                g4.r(j4, this.f10953b, this.f10954c, this.f10955d);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
                a(l4.longValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Long l4, Long l5, ld.p<? super Long, ? super Long, kotlin.k2> pVar, androidx.compose.foundation.lazy.c0 c0Var, kotlin.ranges.l lVar, s0 s0Var, j2 j2Var, x3 x3Var, u3 u3Var, r0 r0Var, s8 s8Var) {
            super(2);
            this.f10912b = l4;
            this.f10913c = l5;
            this.f10914d = pVar;
            this.f10915e = c0Var;
            this.f10916f = lVar;
            this.f10917g = s0Var;
            this.f10918h = j2Var;
            this.f10919i = x3Var;
            this.f10920j = u3Var;
            this.f10921k = r0Var;
            this.f10922l = s8Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1090773432, i4, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:780)");
            }
            Object a5 = androidx.compose.foundation.j.a(tVar, 773894976, -492369756);
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (a5 == companion.a()) {
                a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
            }
            tVar.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
            tVar.p0();
            t9.Companion companion2 = t9.INSTANCE;
            String a6 = v9.a(x7.a.H, tVar, 0);
            String a7 = v9.a(x7.a.G, tVar, 0);
            tVar.P(1645720805);
            boolean q02 = tVar.q0(this.f10912b) | tVar.q0(this.f10913c) | tVar.q0(this.f10914d);
            Long l4 = this.f10912b;
            Long l5 = this.f10913c;
            ld.p<Long, Long, kotlin.k2> pVar = this.f10914d;
            Object Q = tVar.Q();
            if (q02 || Q == companion.a()) {
                Q = new c(l4, l5, pVar);
                tVar.E(Q);
            }
            ld.l lVar = (ld.l) Q;
            tVar.p0();
            List n4 = g4.n(this.f10915e, coroutineScope, a6, a7);
            androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(androidx.compose.ui.q.INSTANCE, false, a.f10923b, 1, null);
            androidx.compose.foundation.lazy.c0 c0Var = this.f10915e;
            tVar.P(1645721776);
            boolean S = tVar.S(this.f10916f) | tVar.S(this.f10917g) | tVar.q0(this.f10918h) | tVar.S(this.f10919i) | tVar.S(n4) | tVar.q0(this.f10920j) | tVar.q0(this.f10912b) | tVar.q0(this.f10913c) | tVar.q0(lVar) | tVar.q0(this.f10921k) | tVar.q0(this.f10922l);
            kotlin.ranges.l lVar2 = this.f10916f;
            s0 s0Var = this.f10917g;
            j2 j2Var = this.f10918h;
            Long l6 = this.f10912b;
            Long l7 = this.f10913c;
            r0 r0Var = this.f10921k;
            x3 x3Var = this.f10919i;
            s8 s8Var = this.f10922l;
            u3 u3Var = this.f10920j;
            Object Q2 = tVar.Q();
            if (S || Q2 == companion.a()) {
                Q2 = new b(lVar2, s0Var, j2Var, l6, l7, lVar, r0Var, x3Var, s8Var, u3Var, n4);
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.foundation.lazy.a.b(f4, c0Var, null, false, null, null, null, false, (ld.l) Q2, tVar, 0, 252);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", i = {}, l = {874}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f10956b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f10957c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f10958d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s0 f10959e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f10960f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(androidx.compose.foundation.lazy.c0 c0Var, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f10957c = c0Var;
            this.f10958d = lVar;
            this.f10959e = s0Var;
            this.f10960f = lVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new k(this.f10957c, this.f10958d, this.f10959e, this.f10960f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f10956b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.lazy.c0 c0Var = this.f10957c;
                ld.l<Long, kotlin.k2> lVar = this.f10958d;
                s0 s0Var = this.f10959e;
                kotlin.ranges.l lVar2 = this.f10960f;
                this.f10956b = 1;
                if (a4.O(c0Var, lVar, s0Var, lVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((k) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f10961b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10962c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f10963d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10964e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f10965f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0 f10966g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f10967h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x3 f10968i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ s8 f10969j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u3 f10970k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f10971l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(androidx.compose.foundation.lazy.c0 c0Var, Long l4, Long l5, ld.p<? super Long, ? super Long, kotlin.k2> pVar, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, x3 x3Var, s8 s8Var, u3 u3Var, int i4) {
            super(2);
            this.f10961b = c0Var;
            this.f10962c = l4;
            this.f10963d = l5;
            this.f10964e = pVar;
            this.f10965f = lVar;
            this.f10966g = s0Var;
            this.f10967h = lVar2;
            this.f10968i = x3Var;
            this.f10969j = s8Var;
            this.f10970k = u3Var;
            this.f10971l = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g4.f(this.f10961b, this.f10962c, this.f10963d, this.f10964e, this.f10965f, this.f10966g, this.f10967h, this.f10968i, this.f10969j, this.f10970k, tVar, androidx.compose.runtime.g3.b(this.f10971l | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f10972b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f10973c;

        /* compiled from: DateRangePicker.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1074}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f10974b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.c0 f10975c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.c0 c0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f10975c = c0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f10975c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f10974b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.foundation.lazy.c0 c0Var = this.f10975c;
                    int u4 = c0Var.u() + 1;
                    this.f10974b = 1;
                    if (androidx.compose.foundation.lazy.c0.S(c0Var, u4, 0, this, 2, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.foundation.lazy.c0 c0Var, kotlinx.coroutines.r0 r0Var) {
            super(0);
            this.f10972b = c0Var;
            this.f10973c = r0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z4;
            if (this.f10972b.a()) {
                kotlinx.coroutines.k.f(this.f10973c, null, null, new a(this.f10972b, null), 3, null);
                z4 = true;
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f10976b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f10977c;

        /* compiled from: DateRangePicker.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1064}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f10978b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.c0 f10979c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.c0 c0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f10979c = c0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f10979c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f10978b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.foundation.lazy.c0 c0Var = this.f10979c;
                    int u4 = c0Var.u() - 1;
                    this.f10978b = 1;
                    if (androidx.compose.foundation.lazy.c0.S(c0Var, u4, 0, this, 2, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.compose.foundation.lazy.c0 c0Var, kotlinx.coroutines.r0 r0Var) {
            super(0);
            this.f10976b = c0Var;
            this.f10977c = r0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z4;
            if (this.f10976b.e()) {
                kotlinx.coroutines.k.f(this.f10977c, null, null, new a(this.f10976b, null), 3, null);
                z4 = true;
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/i4;", "a", "()Landroidx/compose/material3/i4;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.a<i4> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f10980b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10981c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f10982d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f10983e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10984f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s8 f10985g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Locale f10986h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Long l4, Long l5, Long l6, kotlin.ranges.l lVar, int i4, s8 s8Var, Locale locale) {
            super(0);
            this.f10980b = l4;
            this.f10981c = l5;
            this.f10982d = l6;
            this.f10983e = lVar;
            this.f10984f = i4;
            this.f10985g = s8Var;
            this.f10986h = locale;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i4 invoke() {
            return new i4(this.f10980b, this.f10981c, this.f10982d, this.f10983e, this.f10984f, this.f10985g, this.f10986h, null);
        }
    }

    static {
        float f4 = 64;
        float f5 = 12;
        f10854b = androidx.compose.foundation.layout.j1.e(f4, 0.0f, f5, 0.0f, 10, null);
        f10855c = androidx.compose.foundation.layout.j1.e(f4, 0.0f, f5, f5, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c9  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.material3.h4 r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.material3.x3 r26, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, boolean r29, @fg.m androidx.compose.material3.u3 r30, @fg.m androidx.compose.runtime.t r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g4.a(androidx.compose.material3.h4, androidx.compose.ui.q, androidx.compose.material3.x3, ld.p, ld.p, boolean, androidx.compose.material3.u3, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void b(Long l4, Long l5, long j4, ld.p<? super Long, ? super Long, kotlin.k2> pVar, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, x3 x3Var, s8 s8Var, u3 u3Var, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(-787063721);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(l4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(l5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.g(j4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(lVar) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(s0Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.S(lVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= (16777216 & i4) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.q0(s8Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i5 |= o4.q0(u3Var) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i5 & 306783379) == 306783378 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-787063721, i5, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:731)");
            }
            androidx.compose.foundation.lazy.c0 c5 = androidx.compose.foundation.lazy.d0.c(s0Var.n(j4).o(lVar2), 0, o4, 0, 2);
            androidx.compose.ui.q m4 = androidx.compose.foundation.layout.j1.m(androidx.compose.ui.q.INSTANCE, a4.I(), 0.0f, 2, null);
            o4.P(-483455358);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), o4, 0, -1323940314);
            int j5 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(m4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a6);
            } else {
                o4.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion, o4, a5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, o4, j5, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            a4.o(u3Var, s0Var, o4, ((i5 >> 27) & 14) | ((i5 >> 12) & 112));
            tVar2 = o4;
            f(c5, l4, l5, pVar, lVar, s0Var, lVar2, x3Var, s8Var, u3Var, tVar2, ((i5 << 3) & 1008) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (1879048192 & i5));
            if (t.a(tVar2)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new f(l4, l5, j4, pVar, lVar, s0Var, lVar2, x3Var, s8Var, u3Var, i4));
        }
    }

    @fg.l
    @f5
    public static final h4 c(@fg.l Locale locale, @fg.m Long l4, @fg.m Long l5, @fg.m Long l6, @fg.l kotlin.ranges.l lVar, int i4, @fg.l s8 s8Var) {
        return new i4(l4, l5, l6, lVar, i4, s8Var, locale, null);
    }

    public static h4 d(Locale locale, Long l4, Long l5, Long l6, kotlin.ranges.l lVar, int i4, s8 s8Var, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            l4 = null;
        }
        if ((i5 & 4) != 0) {
            l5 = null;
        }
        if ((i5 & 8) != 0) {
            l6 = l4;
        }
        if ((i5 & 16) != 0) {
            lVar = v3.f15005a.k();
        }
        if ((i5 & 32) != 0) {
            p4.INSTANCE.getClass();
            i4 = p4.f13206c;
        }
        if ((i5 & 64) != 0) {
            s8Var = v3.f15005a.g();
        }
        return c(locale, l4, l5, l6, lVar, i4, s8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void e(Long l4, Long l5, long j4, int i4, ld.p<? super Long, ? super Long, kotlin.k2> pVar, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, x3 x3Var, s8 s8Var, u3 u3Var, androidx.compose.runtime.t tVar, int i5, int i6) {
        int i7;
        int i10;
        androidx.compose.runtime.t o4 = tVar.o(-532789335);
        if ((i5 & 6) == 0) {
            i7 = (o4.q0(l4) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= o4.q0(l5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= o4.g(j4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= o4.f(i4) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= o4.S(pVar) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= o4.S(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= o4.S(s0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i7 |= o4.S(lVar2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= (i5 & 134217728) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= o4.q0(s8Var) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i6 & 6) == 0) {
            i10 = i6 | (o4.q0(u3Var) ? 4 : 2);
        } else {
            i10 = i6;
        }
        if ((i7 & 306783379) == 306783378 && (i10 & 3) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-532789335, i7, i10, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:680)");
            }
            androidx.compose.animation.z.b(p4.c(i4), androidx.compose.ui.semantics.o.f(androidx.compose.ui.q.INSTANCE, false, g.f10888b, 1, null), androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null), null, androidx.compose.runtime.internal.c.b(o4, -1026642619, true, new h(l4, l5, j4, pVar, lVar, s0Var, lVar2, x3Var, s8Var, u3Var)), o4, ((i7 >> 9) & 14) | 24960, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new i(l4, l5, j4, i4, pVar, lVar, s0Var, lVar2, x3Var, s8Var, u3Var, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void f(androidx.compose.foundation.lazy.c0 c0Var, Long l4, Long l5, ld.p<? super Long, ? super Long, kotlin.k2> pVar, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, x3 x3Var, s8 s8Var, u3 u3Var, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(1257365001);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(c0Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(l4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.q0(l5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(lVar) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(s0Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.S(lVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= (16777216 & i4) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.q0(s8Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((805306368 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i5 & 306783379) == 306783378 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1257365001, i5, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:769)");
            }
            r0 p4 = s0Var.p();
            o4.P(1454981403);
            boolean q02 = o4.q0(lVar2);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = s0Var.m(lVar2.getFirst(), 1);
                o4.E(Q);
            }
            o4.p0();
            int i6 = i5;
            xa.a(tb.a(p6.f13227a.c(o4, 6), c0.j.f37473a.j()), androidx.compose.runtime.internal.c.b(o4, 1090773432, true, new j(l4, l5, pVar, c0Var, lVar2, s0Var, (j2) Q, x3Var, u3Var, p4, s8Var)), o4, 48);
            o4.P(1454985957);
            int i7 = i6 & 14;
            tVar2 = o4;
            boolean S = (i7 == 4) | ((i6 & 57344) == 16384) | o4.S(s0Var) | tVar2.S(lVar2);
            Object Q2 = tVar2.Q();
            if (S || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                k kVar = new k(c0Var, lVar, s0Var, lVar2, null);
                tVar2.E(kVar);
                Q2 = kVar;
            }
            tVar2.p0();
            androidx.compose.runtime.a1.h(c0Var, (ld.p) Q2, tVar2, i7);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new l(c0Var, l4, l5, pVar, lVar, s0Var, lVar2, x3Var, s8Var, u3Var, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<androidx.compose.ui.semantics.e> n(androidx.compose.foundation.lazy.c0 c0Var, kotlinx.coroutines.r0 r0Var, String str, String str2) {
        return kotlin.collections.w.O(new androidx.compose.ui.semantics.e(str, new n(c0Var, r0Var)), new androidx.compose.ui.semantics.e(str2, new m(c0Var, r0Var)));
    }

    public static final void o(@fg.l androidx.compose.ui.graphics.drawscope.c cVar, @fg.l t8 t8Var, long j4) {
        float v5 = cVar.v5(a4.L());
        float v52 = cVar.v5(a4.L());
        float v53 = cVar.v5(c0.j.f37473a.m());
        float f4 = 2;
        float f5 = (v52 - v53) / f4;
        float f6 = 7;
        float a5 = f4.a(f6, v5, i0.n.t(cVar.e()), f6);
        long gridStartCoordinates = t8Var.getGridStartCoordinates();
        int c5 = androidx.compose.ui.unit.q.c(gridStartCoordinates);
        int i4 = (int) (gridStartCoordinates & 4294967295L);
        long gridEndCoordinates = t8Var.getGridEndCoordinates();
        int i5 = (int) (gridEndCoordinates >> 32);
        int i6 = (int) (gridEndCoordinates & 4294967295L);
        float f7 = v5 + a5;
        float f10 = a5 / f4;
        float f11 = (c5 * f7) + (t8Var.getFirstIsSelectionStart() ? v5 / f4 : 0.0f) + f10;
        float f12 = (i4 * v52) + f5;
        float f13 = i5 * f7;
        if (t8Var.getLastIsSelectionEnd()) {
            v5 /= f4;
        }
        float f14 = f13 + v5 + f10;
        float f15 = (i6 * v52) + f5;
        boolean z4 = cVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
        if (z4) {
            f11 = i0.n.t(cVar.e()) - f11;
            f14 = i0.n.t(cVar.e()) - f14;
        }
        float f16 = f14;
        androidx.compose.ui.graphics.drawscope.f.t5(cVar, j4, i0.g.a(f11, f12), i0.o.a(i4 == i6 ? f16 - f11 : z4 ? -f11 : i0.n.t(cVar.e()) - f11, v53), 0.0f, null, null, 0, 120, null);
        if (i4 != i6) {
            for (int i7 = (i6 - i4) - 1; i7 > 0; i7--) {
                androidx.compose.ui.graphics.drawscope.f.t5(cVar, j4, i0.g.a(0.0f, (i7 * v52) + f12), i0.o.a(i0.n.t(cVar.e()), v53), 0.0f, null, null, 0, 120, null);
            }
            long a6 = i0.g.a(cVar.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr ? 0.0f : i0.n.t(cVar.e()), f15);
            if (z4) {
                f16 -= i0.n.t(cVar.e());
            }
            androidx.compose.ui.graphics.drawscope.f.t5(cVar, j4, a6, i0.o.a(f16, v53), 0.0f, null, null, 0, 120, null);
        }
    }

    @fg.l
    public static final androidx.compose.foundation.layout.l1 p() {
        return f10853a;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final h4 q(@fg.m Long l4, @fg.m Long l5, @fg.m Long l6, @fg.m kotlin.ranges.l lVar, int i4, @fg.m s8 s8Var, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        int i7;
        tVar.P(-2012087461);
        Long l7 = (i6 & 1) != 0 ? null : l4;
        Long l10 = (i6 & 2) != 0 ? null : l5;
        Long l11 = (i6 & 4) != 0 ? l7 : l6;
        kotlin.ranges.l k4 = (i6 & 8) != 0 ? v3.f15005a.k() : lVar;
        if ((i6 & 16) != 0) {
            p4.INSTANCE.getClass();
            i7 = p4.f13206c;
        } else {
            i7 = i4;
        }
        s8 g4 = (i6 & 32) != 0 ? v3.f15005a.g() : s8Var;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2012087461, i5, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        Locale a5 = androidx.compose.material3.a.a(tVar, 0);
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.l<i4, Object> a6 = i4.INSTANCE.a(g4, a5);
        tVar.P(269010268);
        boolean S = ((((i5 & 112) ^ 48) > 32 && tVar.q0(l10)) || (i5 & 48) == 32) | ((((i5 & 14) ^ 6) > 4 && tVar.q0(l7)) || (i5 & 6) == 4) | ((((i5 & 896) ^ 384) > 256 && tVar.q0(l11)) || (i5 & 384) == 256) | tVar.S(k4) | ((((57344 & i5) ^ 24576) > 16384 && tVar.f(i7)) || (i5 & 24576) == 16384) | ((((458752 & i5) ^ o.c.f32821k) > 131072 && tVar.q0(g4)) || (i5 & o.c.f32821k) == 131072) | tVar.S(a5);
        Object Q = tVar.Q();
        if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new o(l7, l10, l11, k4, i7, g4, a5);
            tVar.E(Q);
        }
        tVar.p0();
        i4 i4Var = (i4) androidx.compose.runtime.saveable.d.d(objArr, a6, null, (ld.a) Q, tVar, 0, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return i4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(long j4, Long l4, Long l5, ld.p<? super Long, ? super Long, kotlin.k2> pVar) {
        if ((l4 == null && l5 == null) || (l4 != null && l5 != null)) {
            pVar.invoke(Long.valueOf(j4), null);
        } else if (l4 == null || j4 < l4.longValue()) {
            pVar.invoke(Long.valueOf(j4), null);
        } else {
            pVar.invoke(l4, Long.valueOf(j4));
        }
    }
}
