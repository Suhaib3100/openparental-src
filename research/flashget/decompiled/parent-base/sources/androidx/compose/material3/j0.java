package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import androidx.compose.runtime.t;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u008a\u0002\u0010\u001f\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010$\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010%\u001a9\u0010*\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160\u00002\b\b\u0002\u0010)\u001a\u00020\u0016H\u0007¢\u0006\u0004\b*\u0010+\u001a¶\u0001\u00108\u001a\u00020\u00022\u0006\u0010,\u001a\u00020!2'\u00102\u001a#\u0012\u0013\u0012\u00110-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\n\u0012\b\u0012\u0004\u0012\u00020&010\u00002\u0006\u00103\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00104\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001aÀ\u0001\u0010B\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032&\u0010;\u001a\"\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032&\u0010>\u001a\"\u0012\u0013\u0012\u00110<¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00142\u0006\u0010A\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "sheetContent", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/material3/l0;", "scaffoldState", "Landroidx/compose/ui/unit/h;", "sheetPeekHeight", "sheetMaxWidth", "Landroidx/compose/ui/graphics/e6;", "sheetShape", "Landroidx/compose/ui/graphics/d2;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/o9;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/l1;", "content", "a", "(Lld/q;Landroidx/compose/ui/q;Landroidx/compose/material3/l0;FFLandroidx/compose/ui/graphics/e6;JJFFLld/p;ZLld/p;Lld/q;JJLld/q;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/material3/z8;", "bottomSheetState", "snackbarHostState", "f", "(Landroidx/compose/material3/z8;Landroidx/compose/material3/o9;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/l0;", "Landroidx/compose/material3/a9;", "initialValue", "confirmValueChange", "skipHiddenState", "g", "(Landroidx/compose/material3/a9;Lld/l;ZLandroidx/compose/runtime/t;II)Landroidx/compose/material3/z8;", "state", "Landroidx/compose/ui/unit/u;", "Lkotlin/r0;", "name", "sheetSize", "Landroidx/compose/material3/t4;", "calculateAnchors", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "c", "(Landroidx/compose/material3/z8;Lld/l;FFZLandroidx/compose/ui/graphics/e6;JJFFLld/p;Lld/q;Landroidx/compose/runtime/t;II)V", "innerPadding", "body", "", "layoutHeight", "bottomSheet", "", "sheetOffset", "sheetState", "b", "(Landroidx/compose/ui/q;Lld/p;Lld/q;Lld/q;Lld/p;FLld/a;Landroidx/compose/material3/z8;JJLandroidx/compose/runtime/t;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,386:1\n74#2:387\n74#2:433\n1116#3,6:388\n1116#3,6:394\n1116#3,6:400\n1116#3,3:411\n1119#3,3:417\n1116#3,6:421\n1116#3,6:427\n1116#3,6:434\n1116#3,6:440\n487#4,4:406\n491#4,2:414\n495#4:420\n25#5:410\n487#6:416\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n120#1:387\n335#1:433\n131#1:388,6\n191#1:394,6\n193#1:400,6\n233#1:411,3\n233#1:417,3\n243#1:421,6\n256#1:427,6\n336#1:434,6\n339#1:440,6\n233#1:406,4\n233#1:414,2\n233#1:420\n233#1:410\n233#1:416\n*E\n"})
/* loaded from: classes.dex */
public final class j0 {

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "layoutHeight", "Lkotlin/k2;", "a", "(ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,386:1\n1116#2,6:387\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1\n*L\n141#1:387,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<Integer, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f11760b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11761c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11762d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f11763e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11764f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f11765g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f11766h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f11767i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f11768j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f11769k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11770l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f11771m;

        /* compiled from: BottomSheetScaffold.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/u;", "sheetSize", "Landroidx/compose/material3/t4;", "Landroidx/compose/material3/a9;", "a", "(J)Landroidx/compose/material3/t4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.j0$a$a, reason: collision with other inner class name */
        static final class C0259a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, t4<a9>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f11772b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f11773c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f11774d;

            /* compiled from: BottomSheetScaffold.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/u4;", "Landroidx/compose/material3/a9;", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/u4;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.j0$a$a$a, reason: collision with other inner class name */
            static final class C0260a extends kotlin.jvm.internal.n0 implements ld.l<u4<a9>, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ l0 f11775b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f11776c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f11777d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f11778e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0260a(l0 l0Var, int i4, int i5, int i6) {
                    super(1);
                    this.f11775b = l0Var;
                    this.f11776c = i4;
                    this.f11777d = i5;
                    this.f11778e = i6;
                }

                public final void a(@fg.l u4<a9> u4Var) {
                    if (!this.f11775b.getBottomSheetState().getSkipPartiallyExpanded()) {
                        u4Var.a(a9.PartiallyExpanded, this.f11776c - this.f11777d);
                    }
                    if (this.f11778e != this.f11777d) {
                        u4Var.a(a9.Expanded, Math.max(this.f11776c - r0, 0));
                    }
                    if (this.f11775b.getBottomSheetState().getSkipHiddenState()) {
                        return;
                    }
                    u4Var.a(a9.Hidden, this.f11776c);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(u4<a9> u4Var) {
                    a(u4Var);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0259a(l0 l0Var, int i4, int i5) {
                super(1);
                this.f11772b = l0Var;
                this.f11773c = i4;
                this.f11774d = i5;
            }

            @fg.l
            public final t4<a9> a(long j4) {
                return androidx.compose.material3.j.a(new C0260a(this.f11772b, this.f11773c, this.f11774d, androidx.compose.ui.unit.u.j(j4)));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ t4<a9> invoke(androidx.compose.ui.unit.u uVar) {
                return a(uVar.getPackedValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l0 l0Var, int i4, float f4, float f5, boolean z4, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f6, float f7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(3);
            this.f11760b = l0Var;
            this.f11761c = i4;
            this.f11762d = f4;
            this.f11763e = f5;
            this.f11764f = z4;
            this.f11765g = e6Var;
            this.f11766h = j4;
            this.f11767i = j5;
            this.f11768j = f6;
            this.f11769k = f7;
            this.f11770l = pVar;
            this.f11771m = qVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(num.intValue(), tVar, num2.intValue());
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
                androidx.compose.runtime.x.r0(-680109608, i6, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:135)");
            }
            z8 bottomSheetState = this.f11760b.getBottomSheetState();
            tVar.P(1237684821);
            boolean q02 = ((i6 & 14) == 4) | tVar.q0(this.f11760b) | tVar.f(this.f11761c);
            l0 l0Var = this.f11760b;
            int i7 = this.f11761c;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new C0259a(l0Var, i4, i7);
                tVar.E(Q);
            }
            tVar.p0();
            j0.c(bottomSheetState, (ld.l) Q, this.f11762d, this.f11763e, this.f11764f, this.f11765g, this.f11766h, this.f11767i, this.f11768j, this.f11769k, this.f11770l, this.f11771m, tVar, 0, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<o9, androidx.compose.runtime.t, Integer, kotlin.k2> f11779b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f11780c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.q<? super o9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, l0 l0Var) {
            super(2);
            this.f11779b = qVar;
            this.f11780c = l0Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(88659390, i4, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:127)");
            }
            this.f11779b.R(this.f11780c.getSnackbarHostState(), tVar, 0);
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

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f11781b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l0 l0Var) {
            super(0);
            this.f11781b = l0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f11781b.getBottomSheetState().r());
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f11782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11783c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0 f11784d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f11785e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f11786f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f11787g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f11788h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f11789i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f11790j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f11791k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11792l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f11793m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11794n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.q<o9, androidx.compose.runtime.t, Integer, kotlin.k2> f11795o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f11796p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f11797q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11798r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f11799s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f11800t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f11801u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.ui.q qVar2, l0 l0Var, float f4, float f5, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f6, float f7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super o9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, long j6, long j7, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar4, int i4, int i5, int i6) {
            super(2);
            this.f11782b = qVar;
            this.f11783c = qVar2;
            this.f11784d = l0Var;
            this.f11785e = f4;
            this.f11786f = f5;
            this.f11787g = e6Var;
            this.f11788h = j4;
            this.f11789i = j5;
            this.f11790j = f6;
            this.f11791k = f7;
            this.f11792l = pVar;
            this.f11793m = z4;
            this.f11794n = pVar2;
            this.f11795o = qVar3;
            this.f11796p = j6;
            this.f11797q = j7;
            this.f11798r = qVar4;
            this.f11799s = i4;
            this.f11800t = i5;
            this.f11801u = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            j0.a(this.f11782b, this.f11783c, this.f11784d, this.f11785e, this.f11786f, this.f11787g, this.f11788h, this.f11789i, this.f11790j, this.f11791k, this.f11792l, this.f11793m, this.f11794n, this.f11795o, this.f11796p, this.f11797q, this.f11798r, tVar, androidx.compose.runtime.g3.b(this.f11799s | 1), androidx.compose.runtime.g3.b(this.f11800t), this.f11801u);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z8 f11802b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f11803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z8 z8Var, androidx.compose.ui.unit.d dVar) {
            super(0);
            this.f11802b = z8Var;
            this.f11803c = dVar;
        }

        public final void a() {
            this.f11802b.t(this.f11803c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/s1;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.s1, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11805c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<Integer, androidx.compose.runtime.t, Integer, kotlin.k2> f11806d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11807e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f11808f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f11809g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11810h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f11811i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f11812j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z8 f11813k;

        /* compiled from: BottomSheetScaffold.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.a<Float> f11814b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f11815c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11816d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11817e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z8 f11818f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f11819g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11820h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f11821i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11822j;

            /* compiled from: BottomSheetScaffold.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.j0$f$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0261a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f11823a;

                static {
                    int[] iArr = new int[a9.values().length];
                    try {
                        iArr[a9.PartiallyExpanded.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a9.Expanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a9.Hidden.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f11823a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ld.a<Float> aVar, int i4, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, z8 z8Var, int i5, androidx.compose.ui.layout.i1 i1Var3, int i6, androidx.compose.ui.layout.i1 i1Var4) {
                super(1);
                this.f11814b = aVar;
                this.f11815c = i4;
                this.f11816d = i1Var;
                this.f11817e = i1Var2;
                this.f11818f = z8Var;
                this.f11819g = i5;
                this.f11820h = i1Var3;
                this.f11821i = i6;
                this.f11822j = i1Var4;
            }

            public final void a(@fg.l i1.a aVar) {
                int height;
                int L0 = kotlin.math.b.L0(this.f11814b.invoke().floatValue());
                int max = Integer.max(0, (this.f11815c - this.f11816d.getWidth()) / 2);
                int a5 = s.a(this.f11817e, this.f11815c, 2);
                int i4 = C0261a.f11823a[this.f11818f.f().ordinal()];
                if (i4 == 1) {
                    height = L0 - this.f11817e.getHeight();
                } else {
                    if (i4 != 2 && i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    height = this.f11819g - this.f11817e.getHeight();
                }
                int i5 = height;
                i1.a.m(aVar, this.f11820h, 0, this.f11821i, 0.0f, 4, null);
                androidx.compose.ui.layout.i1 i1Var = this.f11822j;
                if (i1Var != null) {
                    i1.a.m(aVar, i1Var, 0, 0, 0.0f, 4, null);
                }
                i1.a.m(aVar, this.f11816d, max, L0, 0.0f, 4, null);
                i1.a.m(aVar, this.f11817e, a5, i5, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: BottomSheetScaffold.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.q f11824b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f11825c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f11826d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11827e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f11828f;

            /* compiled from: BottomSheetScaffold.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11829b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f11830c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, float f4) {
                    super(2);
                    this.f11829b = qVar;
                    this.f11830c = f4;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    if ((i4 & 3) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(1725620860, i4, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:359)");
                    }
                    this.f11829b.R(androidx.compose.foundation.layout.j1.e(0.0f, 0.0f, 0.0f, this.f11830c, 7, null), tVar, 0);
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
            b(androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, float f4) {
                super(2);
                this.f11824b = qVar;
                this.f11825c = j4;
                this.f11826d = j5;
                this.f11827e = qVar2;
                this.f11828f = f4;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1459220575, i4, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:355)");
                }
                x9.a(this.f11824b, null, this.f11825c, this.f11826d, 0.0f, 0.0f, null, androidx.compose.runtime.internal.c.b(tVar, 1725620860, true, new a(this.f11827e, this.f11828f)), tVar, 12582912, 114);
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

        /* compiled from: BottomSheetScaffold.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.q<Integer, androidx.compose.runtime.t, Integer, kotlin.k2> f11831b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f11832c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(ld.q<? super Integer, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, int i4) {
                super(2);
                this.f11831b = qVar;
                this.f11832c = i4;
            }

            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1192048628, i4, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:344)");
                }
                this.f11831b.R(Integer.valueOf(this.f11832c), tVar, 0);
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

        /* compiled from: BottomSheetScaffold.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11833b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f11833b = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-873203005, i4, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:348)");
                }
                if (androidx.compose.animation.r.a(0, this.f11833b, tVar)) {
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
        f(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super Integer, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.ui.q qVar2, long j4, long j5, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, float f4, ld.a<Float> aVar, z8 z8Var) {
            super(2);
            this.f11804b = pVar;
            this.f11805c = pVar2;
            this.f11806d = qVar;
            this.f11807e = qVar2;
            this.f11808f = j4;
            this.f11809g = j5;
            this.f11810h = qVar3;
            this.f11811i = f4;
            this.f11812j = aVar;
            this.f11813k = z8Var;
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.s1 s1Var, long j4) {
            int p4 = androidx.compose.ui.unit.b.p(j4);
            int o4 = androidx.compose.ui.unit.b.o(j4);
            long e4 = androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null);
            androidx.compose.ui.layout.i1 m02 = s1Var.E2(k0.Sheet, new androidx.compose.runtime.internal.b(-1192048628, true, new c(this.f11806d, o4))).get(0).m0(e4);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f11804b;
            androidx.compose.ui.layout.i1 m03 = pVar != null ? s1Var.E2(k0.TopBar, new androidx.compose.runtime.internal.b(-873203005, true, new d(pVar))).get(0).m0(e4) : null;
            int height = m03 != null ? m03.getHeight() : 0;
            int i4 = height;
            return androidx.compose.ui.layout.o0.x2(s1Var, p4, o4, null, new a(this.f11812j, p4, m02, s1Var.E2(k0.Snackbar, this.f11805c).get(0).m0(e4), this.f11813k, o4, s1Var.E2(k0.Body, new androidx.compose.runtime.internal.b(-1459220575, true, new b(this.f11807e, this.f11808f, this.f11809g, this.f11810h, this.f11811i))).get(0).m0(androidx.compose.ui.unit.b.e(e4, 0, 0, 0, o4 - height, 7, null)), i4, m03), 4, null);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 invoke(androidx.compose.ui.layout.s1 s1Var, androidx.compose.ui.unit.b bVar) {
            return a(s1Var, bVar.getValue());
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11834b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11835c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11836d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<Integer, androidx.compose.runtime.t, Integer, kotlin.k2> f11837e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11838f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f11839g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f11840h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z8 f11841i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f11842j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f11843k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11844l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super Integer, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, float f4, ld.a<Float> aVar, z8 z8Var, long j4, long j5, int i4) {
            super(2);
            this.f11834b = qVar;
            this.f11835c = pVar;
            this.f11836d = qVar2;
            this.f11837e = qVar3;
            this.f11838f = pVar2;
            this.f11839g = f4;
            this.f11840h = aVar;
            this.f11841i = z8Var;
            this.f11842j = j4;
            this.f11843k = j5;
            this.f11844l = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            j0.b(this.f11834b, this.f11835c, this.f11836d, this.f11837e, this.f11838f, this.f11839g, this.f11840h, this.f11841i, this.f11842j, this.f11843k, tVar, androidx.compose.runtime.g3.b(this.f11844l | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<Float, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f11845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z8 f11846c;

        /* compiled from: BottomSheetScaffold.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f11847b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z8 f11848c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f11849d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z8 z8Var, float f4, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f11848c = z8Var;
                this.f11849d = f4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f11848c, this.f11849d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f11847b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    z8 z8Var = this.f11848c;
                    float f4 = this.f11849d;
                    this.f11847b = 1;
                    if (z8Var.u(f4, this) == aVar) {
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
        h(kotlinx.coroutines.r0 r0Var, z8 z8Var) {
            super(1);
            this.f11845b = r0Var;
            this.f11846c = z8Var;
        }

        public final void a(float f4) {
            kotlinx.coroutines.k.f(this.f11845b, null, null, new a(this.f11846c, f4, null), 3, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4) {
            a(f4.floatValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "layoutSize", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.unit.u, t4<a9>> f11850b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z8 f11851c;

        /* compiled from: BottomSheetScaffold.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11852a;

            static {
                int[] iArr = new int[a9.values().length];
                try {
                    iArr[a9.Hidden.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a9.PartiallyExpanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a9.Expanded.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f11852a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ld.l<? super androidx.compose.ui.unit.u, ? extends t4<a9>> lVar, z8 z8Var) {
            super(1);
            this.f11850b = lVar;
            this.f11851c = z8Var;
        }

        public final void a(long j4) {
            a9 a9Var;
            t4<a9> invoke = this.f11850b.invoke(androidx.compose.ui.unit.u.b(j4));
            int i4 = a.f11852a[this.f11851c.e().A().ordinal()];
            if (i4 == 1 || i4 == 2) {
                a9Var = a9.PartiallyExpanded;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a9Var = a9.Expanded;
                if (!invoke.c(a9Var)) {
                    a9Var = a9.PartiallyExpanded;
                }
            }
            this.f11851c.e().M(invoke, a9Var);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.unit.u uVar) {
            a(uVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,386:1\n74#2,6:387\n80#2:421\n84#2:475\n78#3,11:393\n78#3,11:437\n91#3:469\n91#3:474\n456#4,8:404\n464#4,3:418\n456#4,8:448\n464#4,3:462\n467#4,3:466\n467#4,3:471\n3737#5,6:412\n3737#5,6:456\n129#6:422\n131#6:423\n133#6:424\n1116#7,6:425\n68#8,6:431\n74#8:465\n78#8:470\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3\n*L\n272#1:387,6\n272#1:421\n272#1:475\n272#1:393,11\n278#1:437,11\n278#1:469\n272#1:474\n272#1:404,8\n272#1:418,3\n278#1:448,8\n278#1:462,3\n278#1:466,3\n272#1:471,3\n272#1:412,6\n278#1:456,6\n275#1:422\n276#1:423\n277#1:424\n281#1:425,6\n278#1:431,6\n278#1:465\n278#1:470\n*E\n"})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11853b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z8 f11854c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11855d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f11856e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f11857f;

        /* compiled from: BottomSheetScaffold.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z8 f11858b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f11859c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f11860d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f11861e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f11862f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f11863g;

            /* compiled from: BottomSheetScaffold.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.j0$j$a$a, reason: collision with other inner class name */
            static final class C0262a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f11864b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z8 f11865c;

                /* compiled from: BottomSheetScaffold.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.j0$j$a$a$a, reason: collision with other inner class name */
                static final class C0263a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f11866b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z8 f11867c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0263a(z8 z8Var, kotlin.coroutines.d<? super C0263a> dVar) {
                        super(2, dVar);
                        this.f11867c = z8Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0263a(this.f11867c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f11866b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            z8 z8Var = this.f11867c;
                            this.f11866b = 1;
                            if (z8Var.d(this) == aVar) {
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
                        return ((C0263a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0262a(kotlinx.coroutines.r0 r0Var, z8 z8Var) {
                    super(0);
                    this.f11864b = r0Var;
                    this.f11865c = z8Var;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    kotlinx.coroutines.k.f(this.f11864b, null, null, new C0263a(this.f11865c, null), 3, null);
                    return Boolean.TRUE;
                }
            }

            /* compiled from: BottomSheetScaffold.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f11868b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z8 f11869c;

                /* compiled from: BottomSheetScaffold.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {298}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.j0$j$a$b$a, reason: collision with other inner class name */
                static final class C0264a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f11870b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z8 f11871c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0264a(z8 z8Var, kotlin.coroutines.d<? super C0264a> dVar) {
                        super(2, dVar);
                        this.f11871c = z8Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0264a(this.f11871c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f11870b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            z8 z8Var = this.f11871c;
                            this.f11870b = 1;
                            if (z8Var.p(this) == aVar) {
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
                        return ((C0264a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(kotlinx.coroutines.r0 r0Var, z8 z8Var) {
                    super(0);
                    this.f11868b = r0Var;
                    this.f11869c = z8Var;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    kotlinx.coroutines.k.f(this.f11868b, null, null, new C0264a(this.f11869c, null), 3, null);
                    return Boolean.TRUE;
                }
            }

            /* compiled from: BottomSheetScaffold.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class c extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f11872b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z8 f11873c;

                /* compiled from: BottomSheetScaffold.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3$1", f = "BottomSheetScaffold.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.j0$j$a$c$a, reason: collision with other inner class name */
                static final class C0265a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f11874b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z8 f11875c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0265a(z8 z8Var, kotlin.coroutines.d<? super C0265a> dVar) {
                        super(2, dVar);
                        this.f11875c = z8Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0265a(this.f11875c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f11874b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            z8 z8Var = this.f11875c;
                            this.f11874b = 1;
                            if (z8Var.n(this) == aVar) {
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
                        return ((C0265a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(kotlinx.coroutines.r0 r0Var, z8 z8Var) {
                    super(0);
                    this.f11872b = r0Var;
                    this.f11873c = z8Var;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    kotlinx.coroutines.k.f(this.f11872b, null, null, new C0265a(this.f11873c, null), 3, null);
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z8 z8Var, boolean z4, String str, String str2, String str3, kotlinx.coroutines.r0 r0Var) {
                super(1);
                this.f11858b = z8Var;
                this.f11859c = z4;
                this.f11860d = str;
                this.f11861e = str2;
                this.f11862f = str3;
                this.f11863g = r0Var;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                z8 z8Var = this.f11858b;
                boolean z4 = this.f11859c;
                String str = this.f11860d;
                String str2 = this.f11861e;
                String str3 = this.f11862f;
                kotlinx.coroutines.r0 r0Var = this.f11863g;
                if (z8Var.e().p().getSize() <= 1 || !z4) {
                    return;
                }
                a9 f4 = z8Var.f();
                a9 a9Var = a9.PartiallyExpanded;
                if (f4 == a9Var) {
                    if (z8Var.e().s().invoke(a9.Expanded).booleanValue()) {
                        androidx.compose.ui.semantics.w.r(zVar, str, new C0262a(r0Var, z8Var));
                    }
                } else if (z8Var.e().s().invoke(a9Var).booleanValue()) {
                    androidx.compose.ui.semantics.w.g(zVar, str2, new b(r0Var, z8Var));
                }
                if (z8Var.getSkipHiddenState()) {
                    return;
                }
                androidx.compose.ui.semantics.w.o(zVar, str3, new c(r0Var, z8Var));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, z8 z8Var, boolean z4, kotlinx.coroutines.r0 r0Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f11853b = pVar;
            this.f11854c = z8Var;
            this.f11855d = z4;
            this.f11856e = r0Var;
            this.f11857f = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1070542936, i4, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:271)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(companion, 0.0f, 1, null);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f11853b;
            z8 z8Var = this.f11854c;
            boolean z4 = this.f11855d;
            kotlinx.coroutines.r0 r0Var = this.f11856e;
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f11857f;
            tVar.P(-483455358);
            i.m r4 = androidx.compose.foundation.layout.i.f5073a.r();
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(companion2, r4, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(h4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion3, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            tVar.P(-176229282);
            if (pVar != null) {
                t9.Companion companion4 = t9.INSTANCE;
                String a8 = v9.a(x7.a.f15589a, tVar, 0);
                String a10 = v9.a(x7.a.f15591b, tVar, 0);
                String a11 = v9.a(x7.a.f15595d, tVar, 0);
                androidx.compose.ui.q e4 = vVar.e(companion, companion2.m());
                tVar.P(-176228795);
                boolean q02 = tVar.q0(z8Var) | tVar.b(z4) | tVar.q0(a11) | tVar.S(r0Var) | tVar.q0(a8) | tVar.q0(a10);
                Object Q = tVar.Q();
                if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    i5 = -1323940314;
                    Q = new a(z8Var, z4, a11, a8, a10, r0Var);
                    tVar.E(Q);
                } else {
                    i5 = -1323940314;
                }
                tVar.p0();
                androidx.compose.ui.q e5 = androidx.compose.ui.semantics.o.e(e4, true, (ld.l) Q);
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a12 = androidx.compose.animation.a0.a(companion2, false, tVar, 0, i5);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B2 = tVar.B();
                ld.a<androidx.compose.ui.node.g> a13 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(e5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a13);
                } else {
                    tVar.C();
                }
                ld.p a14 = androidx.compose.animation.p.a(companion3, tVar, a12, tVar, B2);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a14);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                q.a(0, pVar, tVar);
            }
            tVar.p0();
            qVar.R(vVar, tVar, 6);
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

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z8 f11876b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.unit.u, t4<a9>> f11877c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11878d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f11879e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11880f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f11881g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f11882h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f11883i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f11884j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f11885k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11886l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f11887m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f11888n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11889o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(z8 z8Var, ld.l<? super androidx.compose.ui.unit.u, ? extends t4<a9>> lVar, float f4, float f5, boolean z4, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f6, float f7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, int i4, int i5) {
            super(2);
            this.f11876b = z8Var;
            this.f11877c = lVar;
            this.f11878d = f4;
            this.f11879e = f5;
            this.f11880f = z4;
            this.f11881g = e6Var;
            this.f11882h = j4;
            this.f11883i = j5;
            this.f11884j = f6;
            this.f11885k = f7;
            this.f11886l = pVar;
            this.f11887m = qVar;
            this.f11888n = i4;
            this.f11889o = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            j0.c(this.f11876b, this.f11877c, this.f11878d, this.f11879e, this.f11880f, this.f11881g, this.f11882h, this.f11883i, this.f11884j, this.f11885k, this.f11886l, this.f11887m, tVar, androidx.compose.runtime.g3.b(this.f11888n | 1), androidx.compose.runtime.g3.b(this.f11889o));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<a9, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f11890b = new l(1);

        l() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l a9 a9Var) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(a9 a9Var) {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0485  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r31, @fg.m androidx.compose.ui.q r32, @fg.m androidx.compose.material3.l0 r33, float r34, float r35, @fg.m androidx.compose.ui.graphics.e6 r36, long r37, long r39, float r41, float r42, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r43, boolean r44, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r45, @fg.m ld.q<? super androidx.compose.material3.o9, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r46, long r47, long r49, @fg.l ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r51, @fg.m androidx.compose.runtime.t r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.j0.a(ld.q, androidx.compose.ui.q, androidx.compose.material3.l0, float, float, androidx.compose.ui.graphics.e6, long, long, float, float, ld.p, boolean, ld.p, ld.q, long, long, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_]]")
    @androidx.compose.runtime.i
    public static final void b(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super Integer, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, float f4, ld.a<Float> aVar, z8 z8Var, long j4, long j5, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(-1120561936);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(qVar2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(qVar3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.d(f4) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i5 |= o4.S(aVar) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i5 |= o4.q0(z8Var) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i5 |= o4.g(j4) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i5 |= o4.g(j5) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i5 & 306783379) == 306783378 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1120561936, i5, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:332)");
            }
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) o4.x(androidx.compose.ui.platform.h1.i());
            o4.P(-99158096);
            int i7 = 29360128 & i5;
            boolean q02 = (i7 == 8388608) | o4.q0(dVar);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new e(z8Var, dVar);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.a1.k((ld.a) Q, o4, 0);
            o4.P(-99158030);
            boolean z4 = ((i5 & 7168) == 2048) | ((i5 & 112) == 32) | ((i5 & 14) == 4) | ((234881024 & i5) == 67108864) | ((1879048192 & i5) == 536870912) | ((i5 & 896) == 256) | ((458752 & i5) == 131072) | ((57344 & i5) == 16384) | ((i5 & 3670016) == 1048576) | (i7 == 8388608);
            Object Q2 = o4.Q();
            if (z4 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                i6 = 1;
                f fVar = new f(pVar, pVar2, qVar3, qVar, j4, j5, qVar2, f4, aVar, z8Var);
                o4.E(fVar);
                Q2 = fVar;
            } else {
                i6 = 1;
            }
            o4.p0();
            androidx.compose.ui.layout.q1.a(null, (ld.p) Q2, o4, 0, i6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new g(qVar, pVar, qVar2, qVar3, pVar2, f4, aVar, z8Var, j4, j5, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(z8 z8Var, ld.l<? super androidx.compose.ui.unit.u, ? extends t4<a9>> lVar, float f4, float f5, boolean z4, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f6, float f7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        int i7;
        androidx.compose.runtime.t o4 = tVar.o(424459667);
        if ((i4 & 6) == 0) {
            i6 = (o4.q0(z8Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= o4.S(lVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= o4.d(f4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= o4.d(f5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= o4.b(z4) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= o4.q0(e6Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= o4.g(j4) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= o4.g(j5) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= o4.d(f6) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= o4.d(f7) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (o4.S(pVar) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= o4.S(qVar) ? 32 : 16;
        }
        int i10 = i7;
        if ((i6 & 306783379) == 306783378 && (i10 & 19) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(424459667, i6, i10, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:231)");
            }
            Object a5 = androidx.compose.foundation.j.a(o4, 773894976, -492369756);
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (a5 == companion.a()) {
                a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, o4), o4);
            }
            o4.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
            o4.p0();
            androidx.compose.foundation.gestures.j0 j0Var = androidx.compose.foundation.gestures.j0.Vertical;
            androidx.compose.ui.q n4 = androidx.compose.foundation.layout.c2.n(androidx.compose.foundation.layout.c2.h(androidx.compose.foundation.layout.c2.D(androidx.compose.ui.q.INSTANCE, 0.0f, f5, 1, null), 0.0f, 1, null), f4, 0.0f, 2, null);
            androidx.compose.material3.k<a9> e4 = z8Var.e();
            o4.P(1603483798);
            boolean q02 = o4.q0(e4);
            Object Q = o4.Q();
            if (q02 || Q == companion.a()) {
                Q = y8.a(z8Var, j0Var, new h(coroutineScope, z8Var));
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.ui.q e5 = androidx.compose.material3.j.e(androidx.compose.ui.input.nestedscroll.c.b(n4, (androidx.compose.ui.input.nestedscroll.a) Q, null, 2, null), z8Var.e(), j0Var, z4, false, null, 24, null);
            o4.P(1603484353);
            boolean z5 = ((i6 & 112) == 32) | ((i6 & 14) == 4);
            Object Q2 = o4.Q();
            if (z5 || Q2 == companion.a()) {
                Q2 = new i(lVar, z8Var);
                o4.E(Q2);
            }
            o4.p0();
            int i11 = i6 >> 12;
            x9.a(androidx.compose.ui.layout.c1.a(e5, (ld.l) Q2), e6Var, j4, j5, f6, f7, null, androidx.compose.runtime.internal.c.b(o4, 1070542936, true, new j(pVar, z8Var, z4, coroutineScope, qVar)), o4, (i11 & 112) | 12582912 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (i11 & 458752), 64);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new k(z8Var, lVar, f4, f5, z4, e6Var, j4, j5, f6, f7, pVar, qVar, i4, i5));
        }
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final l0 f(@fg.m z8 z8Var, @fg.m o9 o9Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1474606134);
        if ((i5 & 1) != 0) {
            z8Var = g(null, null, false, tVar, 0, 7);
        }
        if ((i5 & 2) != 0) {
            tVar.P(667326536);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new o9();
                tVar.E(Q);
            }
            o9Var = (o9) Q;
            tVar.p0();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1474606134, i4, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:191)");
        }
        tVar.P(667326610);
        boolean z4 = ((((i4 & 14) ^ 6) > 4 && tVar.q0(z8Var)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && tVar.q0(o9Var)) || (i4 & 48) == 32);
        Object Q2 = tVar.Q();
        if (z4 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q2 = new l0(z8Var, o9Var);
            tVar.E(Q2);
        }
        l0 l0Var = (l0) Q2;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return l0Var;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final z8 g(@fg.m a9 a9Var, @fg.m ld.l<? super a9, Boolean> lVar, boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(678511581);
        if ((i5 & 1) != 0) {
            a9Var = a9.PartiallyExpanded;
        }
        a9 a9Var2 = a9Var;
        if ((i5 & 2) != 0) {
            lVar = l.f11890b;
        }
        ld.l<? super a9, Boolean> lVar2 = lVar;
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        boolean z5 = z4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(678511581, i4, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:214)");
        }
        z8 c5 = y8.c(false, lVar2, a9Var2, z5, tVar, (i4 & 112) | 6 | ((i4 << 6) & 896) | ((i4 << 3) & 7168), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }
}
