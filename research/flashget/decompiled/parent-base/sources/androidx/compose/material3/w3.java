package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: DatePickerDialog.android.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u009a\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroidx/compose/runtime/i;", "confirmButton", "Landroidx/compose/ui/q;", "modifier", "dismissButton", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/unit/h;", "tonalElevation", "Landroidx/compose/material3/u3;", "colors", "Landroidx/compose/ui/window/g;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Lkotlin/u;", "content", "a", "(Lld/a;Lld/p;Landroidx/compose/ui/q;Lld/p;Landroidx/compose/ui/graphics/e6;FLandroidx/compose/material3/u3;Landroidx/compose/ui/window/g;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/foundation/layout/l1;", "DialogButtonsPadding", "b", "F", "DialogButtonsMainAxisSpacing", "c", "DialogButtonsCrossAxisSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDatePickerDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,118:1\n154#2:119\n154#2:120\n154#2:121\n*S KotlinDebug\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n*L\n115#1:119\n116#1:120\n117#1:121\n*E\n"})
/* loaded from: classes.dex */
public final class w3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f15233a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f15234b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f15235c = 12;

    /* compiled from: DatePickerDialog.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u3 f15237c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15238d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f15239e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15240f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15241g;

        /* compiled from: DatePickerDialog.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nDatePickerDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt$DatePickerDialog$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,118:1\n73#2,7:119\n80#2:154\n84#2:199\n78#3,11:126\n78#3,11:161\n91#3:193\n91#3:198\n456#4,8:137\n464#4,3:151\n456#4,8:172\n464#4,3:186\n467#4,3:190\n467#4,3:195\n3737#5,6:145\n3737#5,6:180\n68#6,6:155\n74#6:189\n78#6:194\n*S KotlinDebug\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt$DatePickerDialog$1$1\n*L\n88#1:119,7\n88#1:154\n88#1:199\n88#1:126,11\n91#1:161,11\n91#1:193\n88#1:198\n88#1:137,8\n88#1:151,3\n91#1:172,8\n91#1:186,3\n91#1:190,3\n88#1:195,3\n88#1:145,6\n91#1:180,6\n91#1:155,6\n91#1:189\n91#1:194\n*E\n"})
        /* renamed from: androidx.compose.material3.w3$a$a, reason: collision with other inner class name */
        static final class C0295a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f15242b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15243c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15244d;

            /* compiled from: DatePickerDialog.android.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.w3$a$a$a, reason: collision with other inner class name */
            static final class C0296a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15245b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15246c;

                /* compiled from: DatePickerDialog.android.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.w3$a$a$a$a, reason: collision with other inner class name */
                static final class C0297a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15247b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15248c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0297a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
                        super(2);
                        this.f15247b = pVar;
                        this.f15248c = pVar2;
                    }

                    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.i
                    public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                        if ((i4 & 3) == 2 && tVar.p()) {
                            tVar.d0();
                            return;
                        }
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.r0(-330605494, i4, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:104)");
                        }
                        ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f15247b;
                        tVar.P(1914517404);
                        if (pVar != null) {
                            pVar.invoke(tVar, 0);
                            kotlin.k2 k2Var = kotlin.k2.f75408a;
                        }
                        tVar.p0();
                        if (androidx.compose.animation.r.a(0, this.f15248c, tVar)) {
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
                C0296a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
                    super(2);
                    this.f15245b = pVar;
                    this.f15246c = pVar2;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    if ((i4 & 3) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(1174914401, i4, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:100)");
                    }
                    e.b(w3.f15234b, w3.f15235c, androidx.compose.runtime.internal.c.b(tVar, -330605494, true, new C0297a(this.f15245b, this.f15246c)), tVar, 438);
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
            C0295a(ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
                super(2);
                this.f15242b = qVar;
                this.f15243c = pVar;
                this.f15244d = pVar2;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1706202235, i4, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:87)");
                }
                i.f l4 = androidx.compose.foundation.layout.i.f5073a.l();
                ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f15242b;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f15243c;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f15244d;
                tVar.P(-483455358);
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
                androidx.compose.ui.layout.m0 b5 = androidx.compose.foundation.layout.t.b(l4, companion2.u(), tVar, 6);
                tVar.P(-1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a5 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a5);
                } else {
                    tVar.C();
                }
                ld.p a6 = androidx.compose.animation.p.a(companion3, tVar, b5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a6);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
                qVar.R(vVar, tVar, 6);
                androidx.compose.ui.q j5 = androidx.compose.foundation.layout.j1.j(vVar.e(companion, companion2.s()), w3.f15233a);
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(companion2, false, tVar, 0, -1323940314);
                int j6 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B2 = tVar.B();
                ld.a<androidx.compose.ui.node.g> a8 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(j5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a8);
                } else {
                    tVar.C();
                }
                ld.p a10 = androidx.compose.animation.p.a(companion3, tVar, a7, tVar, B2);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j6))) {
                    androidx.compose.animation.d.a(j6, tVar, j6, a10);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar3 = androidx.compose.foundation.layout.p.f5235a;
                c0.k kVar = c0.k.f37551a;
                w7.a(b3.k(kVar.c(), tVar, 6), tb.a(p6.f13227a.c(tVar, 6), kVar.d()), androidx.compose.runtime.internal.c.b(tVar, 1174914401, true, new C0296a(pVar, pVar2)), tVar, 384);
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
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
        a(androidx.compose.ui.graphics.e6 e6Var, u3 u3Var, float f4, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(2);
            this.f15236b = e6Var;
            this.f15237c = u3Var;
            this.f15238d = f4;
            this.f15239e = qVar;
            this.f15240f = pVar;
            this.f15241g = pVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-10625622, i4, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:79)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            c0.j jVar = c0.j.f37473a;
            x9.a(androidx.compose.foundation.layout.c2.k(androidx.compose.foundation.layout.c2.t(companion, jVar.f()), 0.0f, jVar.c(), 1, null), this.f15236b, this.f15237c.getContainerColor(), 0L, this.f15238d, 0.0f, null, androidx.compose.runtime.internal.c.b(tVar, -1706202235, true, new C0295a(this.f15239e, this.f15240f, this.f15241g)), tVar, 12582918, 104);
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

    /* compiled from: DatePickerDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15251d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15252e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15253f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f15254g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u3 f15255h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.g f15256i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f15257j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f15258k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15259l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.ui.graphics.e6 e6Var, float f4, u3 u3Var, androidx.compose.ui.window.g gVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f15249b = aVar;
            this.f15250c = pVar;
            this.f15251d = qVar;
            this.f15252e = pVar2;
            this.f15253f = e6Var;
            this.f15254g = f4;
            this.f15255h = u3Var;
            this.f15256i = gVar;
            this.f15257j = qVar2;
            this.f15258k = i4;
            this.f15259l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            w3.a(this.f15249b, this.f15250c, this.f15251d, this.f15252e, this.f15253f, this.f15254g, this.f15255h, this.f15256i, this.f15257j, tVar, androidx.compose.runtime.g3.b(this.f15258k | 1), this.f15259l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 8;
        f15233a = androidx.compose.foundation.layout.j1.e(0.0f, 0.0f, 6, androidx.compose.ui.unit.h.g(f4), 3, null);
        f15234b = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d6  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.a<kotlin.k2> r25, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.m androidx.compose.ui.graphics.e6 r29, float r30, @fg.m androidx.compose.material3.u3 r31, @fg.m androidx.compose.ui.window.g r32, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, @fg.m androidx.compose.runtime.t r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.w3.a(ld.a, ld.p, androidx.compose.ui.q, ld.p, androidx.compose.ui.graphics.e6, float, androidx.compose.material3.u3, androidx.compose.ui.window.g, ld.q, androidx.compose.runtime.t, int, int):void");
    }
}
