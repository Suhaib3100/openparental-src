package androidx.compose.material3;

import androidx.compose.animation.core.e2;
import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.profileinstaller.o;
import kotlin.Metadata;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001an\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0085\u0001\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010#\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$\u001a-\u0010%\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&\u001a#\u0010)\u001a\u00020\n*\u00020\n2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0003¢\u0006\u0004\b)\u0010*\u001a!\u0010-\u001a\u00020\n*\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0+H\u0000¢\u0006\u0004\b-\u0010.\"\u001a\u00102\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u00101\"\u001a\u00104\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b3\u00101\"\u001a\u00107\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u001a\u0010:\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101\"\u0014\u0010;\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010/\"\u0014\u0010=\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010/\"\u001a\u0010C\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0014\u0010E\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010/\"\u001a\u0010H\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bG\u00101\"\u0014\u0010J\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010/\"\u0014\u0010L\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010/\"\u0014\u0010N\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010/\"\u0014\u0010O\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/\"\u0014\u0010P\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010/\"\u0014\u0010S\u001a\u00020Q8\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010R\"\u0014\u0010T\u001a\u00020Q8\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010R\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z²\u0006\u0010\u0010V\u001a\u0004\u0018\u00010U8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010X\u001a\u00020W8\nX\u008a\u0084\u0002²\u0006\f\u0010Y\u001a\u00020W8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/window/o;", "positionProvider", "Lkotlin/Function1;", "Landroidx/compose/material3/p2;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "tooltip", "Landroidx/compose/material3/jb;", "state", "Landroidx/compose/ui/q;", "modifier", "", "focusable", "enableUserInput", "Lkotlin/Function0;", "content", "b", "(Landroidx/compose/ui/window/o;Lld/q;Landroidx/compose/material3/jb;Landroidx/compose/ui/q;ZZLld/p;Landroidx/compose/runtime/t;II)V", "title", "action", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/material3/e8;", "colors", "Landroidx/compose/ui/unit/h;", "tonalElevation", "shadowElevation", "text", "a", "(Landroidx/compose/ui/q;Lld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/e8;FFLld/p;Landroidx/compose/runtime/t;II)V", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/c2;", "mutatorMutex", "t", "(ZZLandroidx/compose/foundation/c2;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/jb;", "e", "(ZZLandroidx/compose/foundation/c2;)Landroidx/compose/material3/jb;", "subheadExists", "actionExists", "u", "(Landroidx/compose/ui/q;ZZ)Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/e2;", "transition", "m", "(Landroidx/compose/ui/q;Landroidx/compose/animation/core/e2;)Landroidx/compose/ui/q;", "F", "q", "()F", "SpacingBetweenTooltipAndAnchor", "r", "TooltipMinHeight", "c", "s", "TooltipMinWidth", "d", "o", "PlainTooltipMaxWidth", "PlainTooltipVerticalPadding", "f", "PlainTooltipHorizontalPadding", "Landroidx/compose/foundation/layout/l1;", "g", "Landroidx/compose/foundation/layout/l1;", "n", "()Landroidx/compose/foundation/layout/l1;", "PlainTooltipContentPadding", "h", "RichTooltipMaxWidth", "i", "p", "RichTooltipHorizontalPadding", "j", "HeightToSubheadFirstLine", "k", "HeightFromSubheadToTextFirstLine", "l", "TextBottomPadding", "ActionLabelMinHeight", "ActionLabelBottomPadding", "", "I", "TooltipFadeInDuration", "TooltipFadeOutDuration", "Landroidx/compose/ui/layout/u;", "anchorBounds", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,719:1\n1116#2,6:720\n1116#2,6:726\n1116#2,6:732\n135#3:738\n81#4:739\n107#4,2:740\n154#5:742\n154#5:743\n154#5:744\n154#5:745\n154#5:746\n154#5:747\n154#5:748\n154#5:749\n154#5:750\n154#5:751\n154#5:752\n154#5:753\n154#5:754\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n122#1:720,6\n123#1:726,6\n514#1:732,6\n651#1:738\n122#1:739\n122#1:740,2\n701#1:742\n702#1:743\n703#1:744\n704#1:745\n705#1:746\n706#1:747\n709#1:748\n710#1:749\n711#1:750\n712#1:751\n713#1:752\n714#1:753\n715#1:754\n*E\n"})
/* loaded from: classes.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    private static final float f11622a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f11623b;

    /* renamed from: e, reason: collision with root package name */
    private static final float f11626e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f11627f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f11628g;

    /* renamed from: i, reason: collision with root package name */
    private static final float f11630i;

    /* renamed from: k, reason: collision with root package name */
    private static final float f11632k;

    /* renamed from: l, reason: collision with root package name */
    private static final float f11633l;

    /* renamed from: n, reason: collision with root package name */
    private static final float f11635n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f11636o = 150;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11637p = 75;

    /* renamed from: c, reason: collision with root package name */
    private static final float f11624c = 40;

    /* renamed from: d, reason: collision with root package name */
    private static final float f11625d = 200;

    /* renamed from: h, reason: collision with root package name */
    private static final float f11629h = 320;

    /* renamed from: j, reason: collision with root package name */
    private static final float f11631j = 28;

    /* renamed from: m, reason: collision with root package name */
    private static final float f11634m = 36;

    /* compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$RichTooltip$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,719:1\n74#2,6:720\n80#2:754\n84#2:879\n78#3,11:726\n78#3,11:761\n91#3:793\n78#3,11:801\n91#3:833\n78#3,11:841\n91#3:873\n91#3:878\n456#4,8:737\n464#4,3:751\n456#4,8:772\n464#4,3:786\n467#4,3:790\n456#4,8:812\n464#4,3:826\n467#4,3:830\n456#4,8:852\n464#4,3:866\n467#4,3:870\n467#4,3:875\n3737#5,6:745\n3737#5,6:780\n3737#5,6:820\n3737#5,6:860\n68#6,6:755\n74#6:789\n78#6:794\n68#6,6:795\n74#6:829\n78#6:834\n68#6,6:835\n74#6:869\n78#6:874\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$RichTooltip$1\n*L\n256#1:720,6\n256#1:754\n256#1:879\n256#1:726,11\n260#1:761,11\n260#1:793\n270#1:801,11\n270#1:833\n280#1:841,11\n280#1:873\n256#1:878\n256#1:737,8\n256#1:751,3\n260#1:772,8\n260#1:786,3\n260#1:790,3\n270#1:812,8\n270#1:826,3\n270#1:830,3\n280#1:852,8\n280#1:866,3\n280#1:870,3\n256#1:875,3\n256#1:745,6\n260#1:780,6\n270#1:820,6\n280#1:860,6\n260#1:755,6\n260#1:789\n260#1:794\n270#1:795,6\n270#1:829\n270#1:834\n280#1:835,6\n280#1:869\n280#1:874\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11638b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11639c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e8 f11640d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11641e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, e8 e8Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3) {
            super(2);
            this.f11638b = pVar;
            this.f11639c = pVar2;
            this.f11640d = e8Var;
            this.f11641e = pVar3;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(4342931, i4, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.kt:248)");
            }
            p6 p6Var = p6.f13227a;
            sb c5 = p6Var.c(tVar, 6);
            c0.v0 v0Var = c0.v0.f38266a;
            androidx.compose.ui.text.v0 a5 = tb.a(c5, v0Var.d());
            androidx.compose.ui.text.v0 a6 = tb.a(p6Var.c(tVar, 6), v0Var.k());
            androidx.compose.ui.text.v0 a7 = tb.a(p6Var.c(tVar, 6), v0Var.m());
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q m4 = androidx.compose.foundation.layout.j1.m(companion, ib.p(), 0.0f, 2, null);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f11638b;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f11639c;
            e8 e8Var = this.f11640d;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f11641e;
            tVar.P(-483455358);
            i.m r4 = androidx.compose.foundation.layout.i.f5073a.r();
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a8 = androidx.compose.material3.d.a(companion2, r4, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a10 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(m4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a10);
            } else {
                tVar.C();
            }
            ld.p a11 = androidx.compose.animation.p.a(companion3, tVar, a8, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a11);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            tVar.P(-1216116120);
            if (pVar != null) {
                androidx.compose.ui.q j5 = androidx.compose.foundation.layout.c.j(companion, ib.f11631j, 0.0f, 2, null);
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a12 = androidx.compose.animation.a0.a(companion2, false, tVar, 0, -1323940314);
                int j6 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B2 = tVar.B();
                ld.a<androidx.compose.ui.node.g> a13 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(j5);
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
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j6))) {
                    androidx.compose.animation.d.a(j6, tVar, j6, a14);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar4 = androidx.compose.foundation.layout.p.f5235a;
                androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(e8Var.getTitleContentColor())), xa.f().e(a6)}, pVar, tVar, 0);
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
            tVar.p0();
            androidx.compose.ui.q u4 = ib.u(companion, pVar != null, pVar2 != null);
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a15 = androidx.compose.animation.a0.a(companion2, false, tVar, 0, -1323940314);
            int j7 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B3 = tVar.B();
            ld.a<androidx.compose.ui.node.g> a16 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(u4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a16);
            } else {
                tVar.C();
            }
            ld.p a17 = androidx.compose.animation.p.a(companion3, tVar, a15, tVar, B3);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j7))) {
                androidx.compose.animation.d.a(j7, tVar, j7, a17);
            }
            androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar5 = androidx.compose.foundation.layout.p.f5235a;
            androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(e8Var.getContentColor())), xa.f().e(a7)}, pVar3, tVar, 0);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            tVar.P(-8196376);
            if (pVar2 != null) {
                androidx.compose.ui.q o4 = androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.c2.n(companion, ib.f11634m, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, ib.f11635n, 7, null);
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a18 = androidx.compose.animation.a0.a(companion2, false, tVar, 0, -1323940314);
                int j10 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B4 = tVar.B();
                ld.a<androidx.compose.ui.node.g> a19 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g7 = androidx.compose.ui.layout.a0.g(o4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a19);
                } else {
                    tVar.C();
                }
                ld.p a20 = androidx.compose.animation.p.a(companion3, tVar, a18, tVar, B4);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j10))) {
                    androidx.compose.animation.d.a(j10, tVar, j10, a20);
                }
                g7.R(androidx.compose.runtime.v3.a(tVar), tVar, 0);
                tVar.P(2058660585);
                androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(e8Var.getActionContentColor())), xa.f().e(a5)}, pVar2, tVar, 0);
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
                kotlin.k2 k2Var2 = kotlin.k2.f75408a;
            }
            if (androidx.compose.animation.y.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tooltip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11642b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11643c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11644d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f11645e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e8 f11646f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f11647g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f11648h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11649i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f11650j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11651k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.ui.graphics.e6 e6Var, e8 e8Var, float f4, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, int i4, int i5) {
            super(2);
            this.f11642b = qVar;
            this.f11643c = pVar;
            this.f11644d = pVar2;
            this.f11645e = e6Var;
            this.f11646f = e8Var;
            this.f11647g = f4;
            this.f11648h = f5;
            this.f11649i = pVar3;
            this.f11650j = i4;
            this.f11651k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ib.a(this.f11642b, this.f11643c, this.f11644d, this.f11645e, this.f11646f, this.f11647g, this.f11648h, this.f11649i, tVar, androidx.compose.runtime.g3.b(this.f11650j | 1), this.f11651k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,719:1\n68#2,6:720\n74#2:754\n78#2:759\n78#3,11:726\n91#3:758\n456#4,8:737\n464#4,3:751\n467#4,3:755\n3737#5,6:745\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$1\n*L\n142#1:720,6\n142#1:754\n142#1:759\n142#1:726,11\n142#1:758\n142#1:737,8\n142#1:751,3\n142#1:755,3\n142#1:745,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.e2<Boolean> f11652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<p2, androidx.compose.runtime.t, Integer, kotlin.k2> f11653c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f11654d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.animation.core.e2<Boolean> e2Var, ld.q<? super p2, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, e eVar) {
            super(2);
            this.f11652b = e2Var;
            this.f11653c = qVar;
            this.f11654d = eVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-149611544, i4, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:141)");
            }
            androidx.compose.ui.q m4 = ib.m(androidx.compose.ui.q.INSTANCE, this.f11652b);
            ld.q<p2, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f11653c;
            e eVar = this.f11654d;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(m4);
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
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            qVar.R(eVar, tVar, 6);
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

    /* compiled from: Tooltip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.o f11655b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<p2, androidx.compose.runtime.t, Integer, kotlin.k2> f11656c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ jb f11657d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11658e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11659f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11660g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11661h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11662i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f11663j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.window.o oVar, ld.q<? super p2, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, jb jbVar, androidx.compose.ui.q qVar2, boolean z4, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f11655b = oVar;
            this.f11656c = qVar;
            this.f11657d = jbVar;
            this.f11658e = qVar2;
            this.f11659f = z4;
            this.f11660g = z5;
            this.f11661h = pVar;
            this.f11662i = i4;
            this.f11663j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ib.b(this.f11655b, this.f11656c, this.f11657d, this.f11658e, this.f11659f, this.f11660g, this.f11661h, tVar, androidx.compose.runtime.g3.b(this.f11662i | 1), this.f11663j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J4\u0010\t\u001a\u00020\u0002*\u00020\u00022\u001f\u0010\b\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/material3/ib$e", "Landroidx/compose/material3/p2;", "Landroidx/compose/ui/q;", "Lkotlin/Function2;", "Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/layout/u;", "Landroidx/compose/ui/draw/m;", "Lkotlin/u;", "draw", "a", "(Landroidx/compose/ui/q;Lld/p;)Landroidx/compose/ui/q;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements p2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.layout.u> f11664a;

        /* compiled from: Tooltip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/draw/m;", "a", "(Landroidx/compose/ui/draw/g;)Landroidx/compose/ui/draw/m;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.draw.g, androidx.compose.ui.draw.m> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.ui.draw.g, androidx.compose.ui.layout.u, androidx.compose.ui.draw.m> f11665b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.layout.u> f11666c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.ui.draw.g, ? super androidx.compose.ui.layout.u, androidx.compose.ui.draw.m> pVar, androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var) {
                super(1);
                this.f11665b = pVar;
                this.f11666c = k2Var;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.draw.m invoke(@fg.l androidx.compose.ui.draw.g gVar) {
                return this.f11665b.invoke(gVar, ib.g(this.f11666c));
            }
        }

        e(androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var) {
            this.f11664a = k2Var;
        }

        @Override // androidx.compose.material3.p2
        @fg.l
        public androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.p<? super androidx.compose.ui.draw.g, ? super androidx.compose.ui.layout.u, androidx.compose.ui.draw.m> pVar) {
            return androidx.compose.ui.draw.l.c(qVar, new a(pVar, this.f11664a));
        }
    }

    /* compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$wrappedContent$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,719:1\n1116#2,6:720\n68#3,6:726\n74#3:760\n78#3:765\n78#4,11:732\n91#4:764\n456#5,8:743\n464#5,3:757\n467#5,3:761\n3737#6,6:751\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$wrappedContent$1\n*L\n134#1:720,6\n133#1:726,6\n133#1:760\n133#1:765\n133#1:732,11\n133#1:764\n133#1:743,8\n133#1:757,3\n133#1:761,3\n133#1:751,6\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.layout.u> f11667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11668c;

        /* compiled from: Tooltip.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.layout.u> f11669b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var) {
                super(1);
                this.f11669b = k2Var;
            }

            public final void a(@fg.l androidx.compose.ui.layout.u uVar) {
                ib.h(this.f11669b, uVar);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.layout.u uVar) {
                a(uVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f11667b = k2Var;
            this.f11668c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1130808188, i4, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:132)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(-1995831905);
            androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var = this.f11667b;
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(k2Var);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q a5 = androidx.compose.ui.layout.w0.a(companion, (ld.l) Q);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f11668c;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a6 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(a5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a7);
            } else {
                tVar.C();
            }
            ld.p a8 = androidx.compose.animation.p.a(companion2, tVar, a6, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a8);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n1#1,170:1\n652#2,3:171\n*E\n"})
    public static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.e2 f11670b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.compose.animation.core.e2 e2Var) {
            super(1);
            this.f11670b = e2Var;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("animateTooltip");
            a2Var.getProperties().c("transition", this.f11670b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,719:1\n1166#2:720\n1083#2,5:721\n1166#2:726\n1083#2,5:727\n81#3:732\n81#3:733\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n*L\n656#1:720\n656#1:721,5\n675#1:726\n675#1:727,5\n656#1:732\n675#1:733\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.e2<Boolean> f11671b;

        /* compiled from: Tooltip.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.q<e2.b<Boolean>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f11672b = new a(3);

            a() {
                super(3);
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<Boolean> bVar, androidx.compose.runtime.t tVar, Integer num) {
                return a(bVar, tVar, num.intValue());
            }

            @fg.l
            @androidx.compose.runtime.i
            public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<Boolean> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
                tVar.P(-281714272);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-281714272, i4, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:676)");
                }
                androidx.compose.animation.core.h2 r4 = bVar.j(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.l.r(150, 0, androidx.compose.animation.core.m0.e(), 2, null) : androidx.compose.animation.core.l.r(75, 0, androidx.compose.animation.core.m0.e(), 2, null);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
                tVar.p0();
                return r4;
            }
        }

        /* compiled from: Tooltip.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.q<e2.b<Boolean>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f11673b = new b(3);

            b() {
                super(3);
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<Boolean> bVar, androidx.compose.runtime.t tVar, Integer num) {
                return a(bVar, tVar, num.intValue());
            }

            @fg.l
            @androidx.compose.runtime.i
            public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<Boolean> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
                tVar.P(386845748);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(386845748, i4, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:657)");
                }
                androidx.compose.animation.core.h2 r4 = bVar.j(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.l.r(150, 0, androidx.compose.animation.core.m0.f(), 2, null) : androidx.compose.animation.core.l.r(75, 0, androidx.compose.animation.core.m0.f(), 2, null);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
                tVar.p0();
                return r4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.animation.core.e2<Boolean> e2Var) {
            super(3);
            this.f11671b = e2Var;
        }

        private static final float b(androidx.compose.runtime.b5<Float> b5Var) {
            return b5Var.getValue().floatValue();
        }

        private static final float c(androidx.compose.runtime.b5<Float> b5Var) {
            return b5Var.getValue().floatValue();
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1498516085);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1498516085, i4, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:655)");
            }
            androidx.compose.animation.core.e2<Boolean> e2Var = this.f11671b;
            b bVar = b.f11673b;
            tVar.P(-1338768149);
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
            androidx.compose.animation.core.i2<Float, androidx.compose.animation.core.o> i5 = androidx.compose.animation.core.k2.i(a0Var);
            tVar.P(-142660079);
            boolean booleanValue = e2Var.h().booleanValue();
            tVar.P(-1553362193);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:672)");
            }
            float f4 = booleanValue ? 1.0f : 0.8f;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            Float valueOf = Float.valueOf(f4);
            boolean booleanValue2 = e2Var.o().booleanValue();
            tVar.P(-1553362193);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:672)");
            }
            float f5 = booleanValue2 ? 1.0f : 0.8f;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            androidx.compose.runtime.b5 m4 = androidx.compose.animation.core.f2.m(e2Var, valueOf, Float.valueOf(f5), bVar.R(e2Var.m(), tVar, 0), i5, "tooltip transition: scaling", tVar, o.c.f32821k);
            tVar.p0();
            tVar.p0();
            androidx.compose.animation.core.e2<Boolean> e2Var2 = this.f11671b;
            a aVar = a.f11672b;
            tVar.P(-1338768149);
            androidx.compose.animation.core.i2<Float, androidx.compose.animation.core.o> i6 = androidx.compose.animation.core.k2.i(a0Var);
            tVar.P(-142660079);
            boolean booleanValue3 = e2Var2.h().booleanValue();
            tVar.P(2073045083);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:691)");
            }
            float f6 = booleanValue3 ? 1.0f : 0.0f;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            Float valueOf2 = Float.valueOf(f6);
            boolean booleanValue4 = e2Var2.o().booleanValue();
            tVar.P(2073045083);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:691)");
            }
            float f7 = booleanValue4 ? 1.0f : 0.0f;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            androidx.compose.runtime.b5 m5 = androidx.compose.animation.core.f2.m(e2Var2, valueOf2, Float.valueOf(f7), aVar.R(e2Var2.m(), tVar, 0), i6, "tooltip transition: alpha", tVar, o.c.f32821k);
            tVar.p0();
            tVar.p0();
            androidx.compose.ui.q e4 = androidx.compose.ui.graphics.p4.e(qVar, b(m4), b(m4), c(m5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return e4;
        }
    }

    static {
        float f4 = 4;
        f11622a = androidx.compose.ui.unit.h.g(f4);
        float f5 = 24;
        f11623b = f5;
        f11626e = f4;
        float f6 = 8;
        f11627f = f6;
        f11628g = androidx.compose.foundation.layout.j1.b(f6, f4);
        float f7 = 16;
        f11630i = f7;
        f11632k = f5;
        f11633l = f7;
        f11635n = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c0  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r24, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r25, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r26, @fg.m androidx.compose.ui.graphics.e6 r27, @fg.m androidx.compose.material3.e8 r28, float r29, float r30, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r31, @fg.m androidx.compose.runtime.t r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ib.a(androidx.compose.ui.q, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.e8, float, float, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0068  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.ui.window.o r21, @fg.l ld.q<? super androidx.compose.material3.p2, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r22, @fg.l androidx.compose.material3.jb r23, @fg.m androidx.compose.ui.q r24, boolean r25, boolean r26, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m androidx.compose.runtime.t r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ib.b(androidx.compose.ui.window.o, ld.q, androidx.compose.material3.jb, androidx.compose.ui.q, boolean, boolean, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    private static final androidx.compose.ui.layout.u c(androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var) {
        return k2Var.getValue();
    }

    private static final void d(androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var, androidx.compose.ui.layout.u uVar) {
        k2Var.setValue(uVar);
    }

    @fg.l
    @f5
    public static final jb e(boolean z4, boolean z5, @fg.l androidx.compose.foundation.c2 c2Var) {
        return new kb(z4, z5, c2Var);
    }

    public static jb f(boolean z4, boolean z5, androidx.compose.foundation.c2 c2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        if ((i4 & 4) != 0) {
            c2Var = z.f15837a.a();
        }
        return new kb(z4, z5, c2Var);
    }

    public static final androidx.compose.ui.layout.u g(androidx.compose.runtime.k2 k2Var) {
        return (androidx.compose.ui.layout.u) k2Var.getValue();
    }

    public static final void h(androidx.compose.runtime.k2 k2Var, androidx.compose.ui.layout.u uVar) {
        k2Var.setValue(uVar);
    }

    @fg.l
    public static final androidx.compose.ui.q m(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.animation.core.e2<Boolean> e2Var) {
        return androidx.compose.ui.i.e(qVar, androidx.compose.ui.platform.y1.e() ? new g(e2Var) : androidx.compose.ui.platform.y1.b(), new h(e2Var));
    }

    @fg.l
    public static final androidx.compose.foundation.layout.l1 n() {
        return f11628g;
    }

    public static final float o() {
        return f11625d;
    }

    public static final float p() {
        return f11630i;
    }

    public static final float q() {
        return f11622a;
    }

    public static final float r() {
        return f11623b;
    }

    public static final float s() {
        return f11624c;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final jb t(boolean z4, boolean z5, @fg.m androidx.compose.foundation.c2 c2Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1413230530);
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        if ((i5 & 4) != 0) {
            c2Var = z.f15837a.a();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1413230530, i4, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:513)");
        }
        tVar.P(512858205);
        boolean z6 = ((((i4 & 112) ^ 48) > 32 && tVar.b(z5)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && tVar.q0(c2Var)) || (i4 & 384) == 256);
        Object Q = tVar.Q();
        if (z6 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new kb(z4, z5, c2Var);
            tVar.E(Q);
        }
        kb kbVar = (kb) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return kbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.x4
    public static final androidx.compose.ui.q u(androidx.compose.ui.q qVar, boolean z4, boolean z5) {
        return (z4 || z5) ? androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.c.j(qVar, f11632k, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, f11633l, 7, null) : androidx.compose.foundation.layout.j1.m(qVar, 0.0f, f11626e, 1, null);
    }
}
