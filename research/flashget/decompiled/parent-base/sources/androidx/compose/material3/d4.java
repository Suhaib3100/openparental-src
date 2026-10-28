package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import androidx.compose.material3.y5;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DateRangeInput.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0014\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"", "selectedStartDateMillis", "selectedEndDateMillis", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "startDateMillis", "endDateMillis", "Lkotlin/k2;", "onDatesSelectionChange", "Landroidx/compose/material3/s0;", "calendarModel", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/x3;", "dateFormatter", "Landroidx/compose/material3/s8;", "selectableDates", "Landroidx/compose/material3/u3;", "colors", "a", "(Ljava/lang/Long;Ljava/lang/Long;Lld/p;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/unit/h;", "F", "TextFieldSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n1116#2,6:122\n1116#2,6:132\n1116#2,6:173\n1116#2,6:180\n101#3:128\n103#3:129\n99#3:130\n123#3:131\n111#3:172\n113#3:179\n88#4,5:138\n93#4:171\n97#4:190\n78#5,11:143\n91#5:189\n456#6,8:154\n464#6,3:168\n467#6,3:186\n3737#7,6:162\n154#8:191\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n*L\n44#1:122,6\n51#1:132,6\n85#1:173,6\n107#1:180,6\n47#1:128\n48#1:129\n49#1:130\n50#1:131\n73#1:172\n95#1:179\n68#1:138,5\n68#1:171\n68#1:190\n68#1:143,11\n68#1:189\n68#1:154,8\n68#1:168,3\n68#1:186,3\n68#1:162,6\n120#1:191\n*E\n"})
/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f10424a = androidx.compose.ui.unit.h.g(8);

    /* compiled from: DateRangeInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "startDateMillis", "Lkotlin/k2;", "a", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10425b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10426c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super Long, ? super Long, kotlin.k2> pVar, Long l4) {
            super(1);
            this.f10425b = pVar;
            this.f10426c = l4;
        }

        public final void a(@fg.m Long l4) {
            this.f10425b.invoke(l4, this.f10426c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
            a(l4);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangeInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,121:1\n1116#2,6:122\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$2\n*L\n79#1:122,6\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10427b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10428c;

        /* compiled from: DateRangeInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f10429b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f10430c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2) {
                super(1);
                this.f10429b = str;
                this.f10430c = str2;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.a1(zVar, this.f10429b + ", " + this.f10430c);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(2);
            this.f10427b = str;
            this.f10428c = str2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(801434508, i4, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:77)");
            }
            String str = this.f10427b;
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(-2126787323);
            boolean q02 = tVar.q0(this.f10427b) | tVar.q0(this.f10428c);
            String str2 = this.f10427b;
            String str3 = this.f10428c;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(str2, str3);
                tVar.E(Q);
            }
            tVar.p0();
            xa.c(str, androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131068);
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

    /* compiled from: DateRangeInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10431b;

        /* compiled from: DateRangeInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f10432b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            }

            @Override // ld.l
            public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(2);
            this.f10431b = str;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(665407211, i4, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:82)");
            }
            xa.c(this.f10431b, androidx.compose.ui.semantics.o.c(androidx.compose.ui.q.INSTANCE, a.f10432b), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131068);
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

    /* compiled from: DateRangeInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "endDateMillis", "Lkotlin/k2;", "a", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10433b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10434c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.p<? super Long, ? super Long, kotlin.k2> pVar, Long l4) {
            super(1);
            this.f10433b = pVar;
            this.f10434c = l4;
        }

        public final void a(@fg.m Long l4) {
            this.f10433b.invoke(this.f10434c, l4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
            a(l4);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangeInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,121:1\n1116#2,6:122\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$5\n*L\n101#1:122,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10435b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10436c;

        /* compiled from: DateRangeInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f10437b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f10438c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2) {
                super(1);
                this.f10437b = str;
                this.f10438c = str2;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.a1(zVar, this.f10437b + ", " + this.f10438c);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2) {
            super(2);
            this.f10435b = str;
            this.f10436c = str2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(911487285, i4, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:99)");
            }
            String str = this.f10435b;
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(-2126786279);
            boolean q02 = tVar.q0(this.f10435b) | tVar.q0(this.f10436c);
            String str2 = this.f10435b;
            String str3 = this.f10436c;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(str2, str3);
                tVar.E(Q);
            }
            tVar.p0();
            xa.c(str, androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131068);
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

    /* compiled from: DateRangeInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10439b;

        /* compiled from: DateRangeInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f10440b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            }

            @Override // ld.l
            public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(2);
            this.f10439b = str;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-961726252, i4, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:104)");
            }
            xa.c(this.f10439b, androidx.compose.ui.semantics.o.c(androidx.compose.ui.q.INSTANCE, a.f10440b), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131068);
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

    /* compiled from: DateRangeInput.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f10441b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10442c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<Long, Long, kotlin.k2> f10443d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s0 f10444e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f10445f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ x3 f10446g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ s8 f10447h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ u3 f10448i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f10449j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Long l4, Long l5, ld.p<? super Long, ? super Long, kotlin.k2> pVar, s0 s0Var, kotlin.ranges.l lVar, x3 x3Var, s8 s8Var, u3 u3Var, int i4) {
            super(2);
            this.f10441b = l4;
            this.f10442c = l5;
            this.f10443d = pVar;
            this.f10444e = s0Var;
            this.f10445f = lVar;
            this.f10446g = x3Var;
            this.f10447h = s8Var;
            this.f10448i = u3Var;
            this.f10449j = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d4.a(this.f10441b, this.f10442c, this.f10443d, this.f10444e, this.f10445f, this.f10446g, this.f10447h, this.f10448i, tVar, androidx.compose.runtime.g3.b(this.f10449j | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void a(@fg.m Long l4, @fg.m Long l5, @fg.l ld.p<? super Long, ? super Long, kotlin.k2> pVar, @fg.l s0 s0Var, @fg.l kotlin.ranges.l lVar, @fg.l x3 x3Var, @fg.l s8 s8Var, @fg.l u3 u3Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        int i6;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(-607499086);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(l4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(l5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(pVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(s0Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(lVar) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= (i4 & 262144) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.q0(s8Var) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i5 |= o4.q0(u3Var) ? 8388608 : 4194304;
        }
        if ((i5 & 4793491) == 4793490 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-607499086, i5, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:40)");
            }
            Locale a5 = androidx.compose.material3.a.a(o4, 0);
            o4.P(1694771901);
            boolean q02 = o4.q0(a5);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = s0Var.g(a5);
                o4.E(Q);
            }
            q3 q3Var = (q3) Q;
            o4.p0();
            t9.Companion companion = t9.INSTANCE;
            String a6 = v9.a(x7.a.f15600h, o4, 0);
            String a7 = v9.a(x7.a.f15602j, o4, 0);
            String a8 = v9.a(x7.a.f15601i, o4, 0);
            String a10 = v9.a(x7.a.C, o4, 0);
            o4.P(1694772328);
            boolean q03 = o4.q0(q3Var) | ((i5 & 458752) == 131072 || ((262144 & i5) != 0 && o4.q0(x3Var)));
            Object Q2 = o4.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new t3(lVar, s8Var, q3Var, x3Var, a6, a7, a8, a10, null, null, 768, null);
                o4.E(Q2);
            }
            t3 t3Var = (t3) Q2;
            o4.p0();
            t3Var.d(l4);
            t3Var.c(l5);
            q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(companion2, r3.f());
            i.f z4 = androidx.compose.foundation.layout.i.f5073a.z(f10424a);
            o4.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(z4, androidx.compose.ui.c.INSTANCE.w(), o4, 6);
            o4.P(-1323940314);
            int j5 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a11 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(j4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a11);
            } else {
                o4.C();
            }
            ld.p a12 = androidx.compose.animation.p.a(companion3, o4, d5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, o4, j5, a12);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            String upperCase = q3Var.f().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String a13 = v9.a(x7.a.I, o4, 0);
            androidx.compose.ui.q e4 = androidx.compose.foundation.layout.x1.e(y1Var, companion2, 0.5f, false, 2, null);
            y5.Companion companion4 = y5.INSTANCE;
            companion4.getClass();
            int i7 = y5.f15806d;
            o4.P(1849029901);
            int i10 = i5 & 896;
            int i11 = i5 & 112;
            boolean z5 = (i10 == 256) | (i11 == 32);
            Object Q3 = o4.Q();
            if (z5 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q3 = new a(pVar, l5);
                o4.E(Q3);
            }
            o4.p0();
            int i12 = i5 & 7168;
            int i13 = (i5 >> 21) & 14;
            int i14 = i5;
            r3.b(e4, l4, (ld.l) Q3, s0Var, androidx.compose.runtime.internal.c.b(o4, 801434508, true, new b(a13, upperCase)), androidx.compose.runtime.internal.c.b(o4, 665407211, true, new c(upperCase)), i7, t3Var, q3Var, a5, u3Var, o4, ((i5 << 3) & 112) | 1794048 | i12, i13);
            String a14 = v9.a(x7.a.F, o4, 0);
            androidx.compose.ui.q e5 = androidx.compose.foundation.layout.x1.e(y1Var, companion2, 0.5f, false, 2, null);
            companion4.getClass();
            int i15 = y5.f15807e;
            o4.P(1849030941);
            boolean z6 = (i10 == 256) | ((i14 & 14) == 4);
            Object Q4 = o4.Q();
            if (z6 || Q4 == androidx.compose.runtime.t.INSTANCE.a()) {
                i6 = i11;
                Q4 = new d(pVar, l4);
                o4.E(Q4);
            } else {
                i6 = i11;
            }
            o4.p0();
            tVar2 = o4;
            r3.b(e5, l5, (ld.l) Q4, s0Var, androidx.compose.runtime.internal.c.b(o4, 911487285, true, new e(a14, upperCase)), androidx.compose.runtime.internal.c.b(o4, -961726252, true, new f(upperCase)), i15, t3Var, q3Var, a5, u3Var, o4, i6 | 1794048 | i12, i13);
            if (t.a(tVar2)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new g(l4, l5, pVar, s0Var, lVar, x3Var, s8Var, u3Var, i4));
        }
    }
}
