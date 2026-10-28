package androidx.compose.material3;

import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import androidx.compose.ui.q;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DateInput.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001af\u0010\u0012\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0098\u0001\u0010$\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010)\"\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedDateMillis", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "dateInMillis", "Lkotlin/k2;", "onDateSelectionChange", "Landroidx/compose/material3/s0;", "calendarModel", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/x3;", "dateFormatter", "Landroidx/compose/material3/s8;", "selectableDates", "Landroidx/compose/material3/u3;", "colors", "a", "(Ljava/lang/Long;Lld/l;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/q;", "modifier", "initialDateMillis", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "label", "placeholder", "Landroidx/compose/material3/y5;", "inputIdentifier", "Landroidx/compose/material3/t3;", "dateInputValidator", "Landroidx/compose/material3/q3;", "dateInputFormat", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "b", "(Landroidx/compose/ui/q;Ljava/lang/Long;Lld/l;Landroidx/compose/material3/s0;Lld/p;Lld/p;ILandroidx/compose/material3/t3;Landroidx/compose/material3/q3;Ljava/util/Locale;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/foundation/layout/l1;", "f", "()Landroidx/compose/foundation/layout/l1;", "InputTextFieldPadding", "Landroidx/compose/ui/unit/h;", "F", "InputTextNonErroneousBottomPadding", "Landroidx/compose/ui/text/input/z0;", "text", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,377:1\n1116#2,6:378\n1116#2,6:387\n1116#2,6:394\n1116#2,6:400\n1116#2,6:407\n101#3:384\n103#3:385\n99#3:386\n93#3:393\n154#4:406\n154#4:416\n154#4:417\n154#4:418\n154#4:419\n81#5:413\n107#5,2:414\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n59#1:378,6\n65#1:387,6\n119#1:394,6\n136#1:400,6\n179#1:407,6\n62#1:384\n63#1:385\n64#1:386\n78#1:393\n174#1:406\n369#1:416\n370#1:417\n371#1:418\n376#1:419\n119#1:413\n119#1:414,2\n*E\n"})
/* loaded from: classes.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f13942a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f13943b = 16;

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputContent$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,377:1\n1116#2,6:378\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputContent$2\n*L\n87#1:378,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13944b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13945c;

        /* compiled from: DateInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.r3$a$a, reason: collision with other inner class name */
        static final class C0289a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f13946b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f13947c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0289a(String str, String str2) {
                super(1);
                this.f13946b = str;
                this.f13947c = str2;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.a1(zVar, this.f13946b + ", " + this.f13947c);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(2);
            this.f13944b = str;
            this.f13945c = str2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1819015125, i4, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:84)");
            }
            String str = this.f13944b;
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(-694340528);
            boolean q02 = tVar.q0(this.f13944b) | tVar.q0(this.f13945c);
            String str2 = this.f13944b;
            String str3 = this.f13945c;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new C0289a(str2, str3);
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

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13948b;

        /* compiled from: DateInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f13949b = new a(1);

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
        b(String str) {
            super(2);
            this.f13948b = str;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-564233108, i4, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:88)");
            }
            xa.c(this.f13948b, androidx.compose.ui.semantics.o.c(androidx.compose.ui.q.INSTANCE, a.f13949b), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131068);
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

    /* compiled from: DateInput.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f13950b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f13951c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s0 f13952d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f13953e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x3 f13954f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s8 f13955g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u3 f13956h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13957i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Long l4, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, kotlin.ranges.l lVar2, x3 x3Var, s8 s8Var, u3 u3Var, int i4) {
            super(2);
            this.f13950b = l4;
            this.f13951c = lVar;
            this.f13952d = s0Var;
            this.f13953e = lVar2;
            this.f13954f = x3Var;
            this.f13955g = s8Var;
            this.f13956h = u3Var;
            this.f13957i = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r3.a(this.f13950b, this.f13951c, this.f13952d, this.f13953e, this.f13954f, this.f13955g, this.f13956h, tVar, androidx.compose.runtime.g3.b(this.f13957i | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "input", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,377:1\n1064#2,2:378\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1$1\n*L\n138#1:378,2\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f13958b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<String> f13959c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f13960d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s0 f13961e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t3 f13962f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13963g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Locale f13964h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f13965i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(q3 q3Var, androidx.compose.runtime.k2<String> k2Var, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, t3 t3Var, int i4, Locale locale, androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var2) {
            super(1);
            this.f13958b = q3Var;
            this.f13959c = k2Var;
            this.f13960d = lVar;
            this.f13961e = s0Var;
            this.f13962f = t3Var;
            this.f13963g = i4;
            this.f13964h = locale;
            this.f13965i = k2Var2;
        }

        public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
            if (z0Var.i().length() <= this.f13958b.getPatternWithoutDelimiters().length()) {
                String i4 = z0Var.i();
                for (int i5 = 0; i5 < i4.length(); i5++) {
                    if (!Character.isDigit(i4.charAt(i5))) {
                        return;
                    }
                }
                r3.e(this.f13965i, z0Var);
                String obj = kotlin.text.v.C5(z0Var.i()).toString();
                Long l4 = null;
                if (obj.length() == 0 || obj.length() < this.f13958b.getPatternWithoutDelimiters().length()) {
                    this.f13959c.setValue("");
                    this.f13960d.invoke(null);
                    return;
                }
                r0 s4 = this.f13961e.s(obj, this.f13958b.getPatternWithoutDelimiters());
                this.f13959c.setValue(this.f13962f.e(s4, this.f13963g, this.f13964h));
                ld.l<Long, kotlin.k2> lVar = this.f13960d;
                if (this.f13959c.getValue().length() == 0 && s4 != null) {
                    l4 = Long.valueOf(s4.k());
                }
                lVar.invoke(l4);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
            a(z0Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<String> f13966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.runtime.k2<String> k2Var) {
            super(1);
            this.f13966b = k2Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            if (kotlin.text.v.S1(this.f13966b.getValue())) {
                return;
            }
            androidx.compose.ui.semantics.w.q(zVar, this.f13966b.getValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<String> f13967b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.runtime.k2<String> k2Var) {
            super(2);
            this.f13967b = k2Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-591991974, i4, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:183)");
            }
            if (!kotlin.text.v.S1(this.f13967b.getValue())) {
                xa.c(this.f13967b.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131070);
            }
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

    /* compiled from: DateInput.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13968b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f13969c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f13970d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s0 f13971e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13972f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13973g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13974h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ t3 f13975i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ q3 f13976j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Locale f13977k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ u3 f13978l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13979m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f13980n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.q qVar, Long l4, ld.l<? super Long, kotlin.k2> lVar, s0 s0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, t3 t3Var, q3 q3Var, Locale locale, u3 u3Var, int i5, int i6) {
            super(2);
            this.f13968b = qVar;
            this.f13969c = l4;
            this.f13970d = lVar;
            this.f13971e = s0Var;
            this.f13972f = pVar;
            this.f13973g = pVar2;
            this.f13974h = i4;
            this.f13975i = t3Var;
            this.f13976j = q3Var;
            this.f13977k = locale;
            this.f13978l = u3Var;
            this.f13979m = i5;
            this.f13980n = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r3.b(this.f13968b, this.f13969c, this.f13970d, this.f13971e, this.f13972f, this.f13973g, this.f13974h, this.f13975i, this.f13976j, this.f13977k, this.f13978l, tVar, androidx.compose.runtime.g3.b(this.f13979m | 1), androidx.compose.runtime.g3.b(this.f13980n));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/k2;", "", "a", "()Landroidx/compose/runtime/k2;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.runtime.k2<String>> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f13981b = new h(0);

        h() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.k2<String> invoke() {
            androidx.compose.runtime.k2<String> g4;
            g4 = androidx.compose.runtime.t4.g("", null, 2, null);
            return g4;
        }
    }

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/k2;", "Landroidx/compose/ui/text/input/z0;", "a", "()Landroidx/compose/runtime/k2;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f13982b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s0 f13983c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q3 f13984d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Locale f13985e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Long l4, s0 s0Var, q3 q3Var, Locale locale) {
            super(0);
            this.f13982b = l4;
            this.f13983c = s0Var;
            this.f13984d = q3Var;
            this.f13985e = locale;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
        
            if (r0 == null) goto L8;
         */
        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> invoke() {
            /*
                r8 = this;
                java.lang.Long r0 = r8.f13982b
                if (r0 == 0) goto L1b
                androidx.compose.material3.s0 r1 = r8.f13983c
                androidx.compose.material3.q3 r2 = r8.f13984d
                java.util.Locale r3 = r8.f13985e
                long r4 = r0.longValue()
                java.lang.String r0 = r2.getPatternWithoutDelimiters()
                java.lang.String r0 = r1.a(r4, r0, r3)
                if (r0 != 0) goto L19
                goto L1b
            L19:
                r2 = r0
                goto L1e
            L1b:
                java.lang.String r0 = ""
                goto L19
            L1e:
                r0 = 0
                long r3 = androidx.compose.ui.text.u0.b(r0, r0)
                androidx.compose.ui.text.input.z0 r0 = new androidx.compose.ui.text.input.z0
                r5 = 0
                r6 = 4
                r7 = 0
                r1 = r0
                r1.<init>(r2, r3, r5, r6, r7)
                r1 = 2
                r2 = 0
                androidx.compose.runtime.k2 r0 = androidx.compose.runtime.o4.l(r0, r2, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r3.i.invoke():androidx.compose.runtime.k2");
        }
    }

    static {
        float f4 = 24;
        f13942a = androidx.compose.foundation.layout.j1.e(androidx.compose.ui.unit.h.g(f4), 10, f4, 0.0f, 8, null);
    }

    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void a(@fg.m Long l4, @fg.l ld.l<? super Long, kotlin.k2> lVar, @fg.l s0 s0Var, @fg.l kotlin.ranges.l lVar2, @fg.l x3 x3Var, @fg.l s8 s8Var, @fg.l u3 u3Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        q3 q3Var;
        Locale locale;
        int i6;
        ?? r13;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t tVar3;
        androidx.compose.runtime.t o4 = tVar.o(643325609);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(l4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(lVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(s0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(lVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= (i4 & 32768) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.q0(s8Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? 1048576 : 524288;
        }
        int i7 = i5;
        if ((599187 & i7) == 599186 && o4.p()) {
            o4.d0();
            tVar3 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(643325609, i7, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:55)");
            }
            Locale a5 = androidx.compose.material3.a.a(o4, 0);
            o4.P(-356766397);
            boolean q02 = o4.q0(a5);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = s0Var.g(a5);
                o4.E(Q);
            }
            q3 q3Var2 = (q3) Q;
            o4.p0();
            t9.Companion companion = t9.INSTANCE;
            String a6 = v9.a(x7.a.f15600h, o4, 0);
            String a7 = v9.a(x7.a.f15602j, o4, 0);
            String a8 = v9.a(x7.a.f15601i, o4, 0);
            o4.P(-356766049);
            boolean q03 = o4.q0(q3Var2) | ((i7 & 57344) == 16384 || ((i7 & 32768) != 0 && o4.q0(x3Var)));
            Object Q2 = o4.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                q3Var = q3Var2;
                locale = a5;
                i6 = i7;
                r13 = 1;
                t3 t3Var = new t3(lVar2, s8Var, q3Var, x3Var, a6, a7, a8, "", null, null, 768, null);
                tVar2 = o4;
                tVar2.E(t3Var);
                Q2 = t3Var;
            } else {
                q3Var = q3Var2;
                locale = a5;
                i6 = i7;
                r13 = 1;
                tVar2 = o4;
            }
            t3 t3Var2 = (t3) Q2;
            tVar2.p0();
            String upperCase = q3Var.f().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String a10 = v9.a(x7.a.f15603k, tVar2, 0);
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.foundation.layout.c2.h(androidx.compose.ui.q.INSTANCE, 0.0f, r13, null), f13942a);
            y5.INSTANCE.getClass();
            int i10 = y5.f15805c;
            t3Var2.d(l4);
            androidx.compose.runtime.internal.a b5 = androidx.compose.runtime.internal.c.b(tVar2, -1819015125, r13, new a(a10, upperCase));
            androidx.compose.runtime.internal.a b6 = androidx.compose.runtime.internal.c.b(tVar2, -564233108, r13, new b(upperCase));
            int i11 = i6 << 3;
            tVar3 = tVar2;
            b(j4, l4, lVar, s0Var, b5, b6, i10, t3Var2, q3Var, locale, u3Var, tVar2, (i11 & 112) | 1794054 | (i11 & 896) | (i11 & 7168), (i6 >> 18) & 14);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar3.t();
        if (t4 != null) {
            t4.a(new c(l4, lVar, s0Var, lVar2, x3Var, s8Var, u3Var, i4));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v13 ??, still in use, count: 1, list:
          (r0v13 ?? I:java.lang.Object) from 0x020e: INVOKE (r1v1 ?? I:androidx.compose.runtime.t), (r0v13 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.t.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:527)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v13 ??, still in use, count: 1, list:
          (r0v13 ?? I:java.lang.Object) from 0x020e: INVOKE (r1v1 ?? I:androidx.compose.runtime.t), (r0v13 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.t.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:527)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r48v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private static final androidx.compose.ui.text.input.z0 c(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
        return k2Var.getValue();
    }

    private static final void d(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var, androidx.compose.ui.text.input.z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    public static final void e(androidx.compose.runtime.k2 k2Var, androidx.compose.ui.text.input.z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    @fg.l
    public static final androidx.compose.foundation.layout.l1 f() {
        return f13942a;
    }
}
