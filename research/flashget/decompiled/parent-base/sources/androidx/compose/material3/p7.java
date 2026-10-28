package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\u001az\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0081\u0001\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001as\u0010\"\u001a\u00020\u00072\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0002\b\b2\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0012H\u0003¢\u0006\u0004\b\"\u0010#\u001a8\u0010,\u001a\u00020+*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aP\u0010/\u001a\u00020+*\u00020$2\u0006\u0010.\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0014\u00103\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u00102\"\u0014\u00104\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u00102\"\u0014\u00105\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u00102\"\u0014\u00107\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00102\"\u001a\u0010=\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0014\u0010?\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010:\"\u0014\u0010C\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010B\"\u001a\u0010F\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<\"\u001a\u0010I\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<\"\u001a\u0010L\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010<\"\u0014\u0010M\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010:\"\u0014\u0010N\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010:\"\u0014\u0010O\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006R²\u0006\f\u0010P\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "header", "Landroidx/compose/foundation/layout/n2;", "windowInsets", "content", "a", "(Landroidx/compose/ui/q;JJLld/q;Landroidx/compose/foundation/layout/n2;Lld/q;Landroidx/compose/runtime/t;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/n7;", "colors", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "b", "(ZLld/a;Lld/p;Landroidx/compose/ui/q;ZLld/p;ZLandroidx/compose/material3/n7;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "indicatorRipple", "indicator", "", "animationProgress", "c", "(Lld/p;Lld/p;Lld/p;Lld/p;ZLld/a;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/i1;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "o", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;J)Landroidx/compose/ui/layout/n0;", "labelPlaceable", "p", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;JZF)Landroidx/compose/ui/layout/n0;", "", "Ljava/lang/String;", "IndicatorRippleLayoutIdTag", "IndicatorLayoutIdTag", "IconLayoutIdTag", "d", "LabelLayoutIdTag", "Landroidx/compose/ui/unit/h;", "e", "F", "n", "()F", "NavigationRailVerticalPadding", "f", "NavigationRailHeaderPadding", "", "g", "I", "ItemAnimationDurationMillis", "h", "m", "NavigationRailItemWidth", "i", "k", "NavigationRailItemHeight", "j", "l", "NavigationRailItemVerticalPadding", "IndicatorHorizontalPadding", "IndicatorVerticalPaddingWithLabel", "IndicatorVerticalPaddingNoLabel", "iconColor", "textColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,742:1\n1116#2,6:743\n1116#2,6:781\n1116#2,6:787\n1116#2,6:798\n1116#2,6:875\n72#3,2:749\n74#3:779\n78#3:797\n68#3,6:835\n74#3:869\n78#3:874\n68#3,6:881\n74#3:915\n78#3:920\n78#4,11:751\n91#4:796\n75#4,14:804\n78#4,11:841\n91#4:873\n78#4,11:887\n91#4:919\n91#4:924\n456#5,8:762\n464#5,3:776\n467#5,3:793\n456#5,8:818\n464#5,3:832\n456#5,8:852\n464#5,3:866\n467#5,3:870\n456#5,8:898\n464#5,3:912\n467#5,3:916\n467#5,3:921\n3737#6,6:770\n3737#6,6:826\n3737#6,6:860\n3737#6,6:906\n74#7:780\n154#8:925\n154#8:926\n154#8:927\n58#9:928\n75#9:929\n58#9:930\n75#9:931\n58#9:932\n75#9:933\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n174#1:743,6\n226#1:781,6\n268#1:787,6\n517#1:798,6\n514#1:875,6\n197#1:749,2\n197#1:779\n197#1:797\n508#1:835,6\n508#1:869\n508#1:874\n511#1:881,6\n511#1:915\n511#1:920\n197#1:751,11\n197#1:796\n504#1:804,14\n508#1:841,11\n508#1:873\n511#1:887,11\n511#1:919\n504#1:924\n197#1:762,8\n197#1:776,3\n197#1:793,3\n504#1:818,8\n504#1:832,3\n508#1:852,8\n508#1:866,3\n508#1:870,3\n511#1:898,8\n511#1:912,3\n511#1:916,3\n504#1:921,3\n197#1:770,6\n504#1:826,6\n508#1:860,6\n511#1:906,6\n221#1:780\n712#1:925\n718#1:926\n732#1:927\n735#1:928\n735#1:929\n738#1:930\n738#1:931\n741#1:932\n741#1:933\n*E\n"})
/* loaded from: classes.dex */
public final class p7 {

    /* renamed from: e, reason: collision with root package name */
    private static final float f13233e;

    /* renamed from: g, reason: collision with root package name */
    private static final int f13235g = 150;

    /* renamed from: h, reason: collision with root package name */
    private static final float f13236h;

    /* renamed from: i, reason: collision with root package name */
    private static final float f13237i;

    /* renamed from: j, reason: collision with root package name */
    private static final float f13238j;

    /* renamed from: k, reason: collision with root package name */
    private static final float f13239k;

    /* renamed from: l, reason: collision with root package name */
    private static final float f13240l;

    /* renamed from: m, reason: collision with root package name */
    private static final float f13241m;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f13229a = "indicatorRipple";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f13230b = "indicator";

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f13231c = "icon";

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f13232d = "label";

    /* renamed from: f, reason: collision with root package name */
    private static final float f13234f = 8;

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRail$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,742:1\n78#2,2:743\n80#2:773\n84#2:778\n78#3,11:745\n91#3:777\n456#4,8:756\n464#4,3:770\n467#4,3:774\n3737#5,6:764\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRail$1\n*L\n118#1:743,2\n118#1:773\n118#1:778\n118#1:745,11\n118#1:777\n118#1:756,8\n118#1:770,3\n118#1:774,3\n118#1:764,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f13243c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f13244d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2) {
            super(2);
            this.f13242b = n2Var;
            this.f13243c = qVar;
            this.f13244d = qVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2092683357, i4, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:117)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q a5 = androidx.compose.foundation.selection.a.a(androidx.compose.foundation.layout.j1.m(androidx.compose.foundation.layout.c2.D(androidx.compose.foundation.layout.d3.e(androidx.compose.foundation.layout.c2.d(companion, 0.0f, 1, null), this.f13242b), c0.k0.f37568a.p(), 0.0f, 2, null), 0.0f, p7.n(), 1, null));
            c.b m4 = androidx.compose.ui.c.INSTANCE.m();
            i.f z4 = androidx.compose.foundation.layout.i.f5073a.z(p7.n());
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f13243c;
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar2 = this.f13244d;
            tVar.P(-483455358);
            androidx.compose.ui.layout.m0 b5 = androidx.compose.foundation.layout.t.b(z4, m4, tVar, 54);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(a5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, b5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            tVar.P(716053806);
            if (qVar != null) {
                qVar.R(vVar, tVar, 6);
                androidx.compose.foundation.layout.f2.a(androidx.compose.foundation.layout.c2.i(companion, p7.f13234f), tVar, 6);
            }
            tVar.p0();
            qVar2.R(vVar, tVar, 6);
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

    /* compiled from: NavigationRail.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13245b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13246c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13247d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f13248e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f13249f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f13250g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13251h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13252i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, long j4, long j5, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, int i4, int i5) {
            super(2);
            this.f13245b = qVar;
            this.f13246c = j4;
            this.f13247d = j5;
            this.f13248e = qVar2;
            this.f13249f = n2Var;
            this.f13250g = qVar3;
            this.f13251h = i4;
            this.f13252i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p7.a(this.f13245b, this.f13246c, this.f13247d, this.f13248e, this.f13249f, this.f13250g, tVar, androidx.compose.runtime.g3.b(this.f13251h | 1), this.f13252i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f13253b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.runtime.b5<Float> b5Var) {
            super(0);
            this.f13253b = b5Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return this.f13253b.getValue();
        }
    }

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$2$indicator$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,742:1\n1116#2,6:743\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$2$indicator$1\n*L\n254#1:743,6\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f13254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n7 f13255c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13256d;

        /* compiled from: NavigationRail.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.q4, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.b5<Float> f13257b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.runtime.b5<Float> b5Var) {
                super(1);
                this.f13257b = b5Var;
            }

            public final void a(@fg.l androidx.compose.ui.graphics.q4 q4Var) {
                q4Var.k(this.f13257b.getValue().floatValue());
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.q4 q4Var) {
                a(q4Var);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.runtime.b5<Float> b5Var, n7 n7Var, androidx.compose.ui.graphics.e6 e6Var) {
            super(2);
            this.f13254b = b5Var;
            this.f13255c = n7Var;
            this.f13256d = e6Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1862011490, i4, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:250)");
            }
            androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "indicator");
            tVar.P(540475060);
            boolean q02 = tVar.q0(this.f13254b);
            androidx.compose.runtime.b5<Float> b5Var = this.f13254b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(b5Var);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.foundation.layout.m.a(androidx.compose.foundation.n.c(androidx.compose.ui.graphics.p4.a(b5, (ld.l) Q), this.f13255c.getSelectedIndicatorColor(), this.f13256d), tVar, 0);
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

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13258b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n6 f13259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.graphics.e6 e6Var, n6 n6Var) {
            super(2);
            this.f13258b = e6Var;
            this.f13259c = n6Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(211026382, i4, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
            }
            androidx.compose.foundation.layout.m.a(androidx.compose.foundation.p1.b(androidx.compose.ui.draw.h.a(androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "indicatorRipple"), this.f13258b), this.f13259c, androidx.compose.material.ripple.p.e(false, 0.0f, 0L, tVar, 0, 7)), tVar, 0);
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

    /* compiled from: NavigationRail.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13260b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13261c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13262d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13263e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f13264f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13265g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f13266h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ n7 f13267i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f13268j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f13269k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13270l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(boolean z4, ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, boolean z6, n7 n7Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f13260b = z4;
            this.f13261c = aVar;
            this.f13262d = pVar;
            this.f13263e = qVar;
            this.f13264f = z5;
            this.f13265g = pVar2;
            this.f13266h = z6;
            this.f13267i = n7Var;
            this.f13268j = kVar;
            this.f13269k = i4;
            this.f13270l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p7.b(this.f13260b, this.f13261c, this.f13262d, this.f13263e, this.f13264f, this.f13265g, this.f13266h, this.f13267i, this.f13268j, tVar, androidx.compose.runtime.g3.b(this.f13269k | 1), this.f13270l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,742:1\n68#2,6:743\n74#2:777\n78#2:782\n78#3,11:749\n91#3:781\n456#4,8:760\n464#4,3:774\n467#4,3:778\n3737#5,6:768\n81#6:783\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1\n*L\n180#1:743,6\n180#1:777\n180#1:782\n180#1:749,11\n180#1:781\n180#1:760,8\n180#1:774,3\n180#1:778,3\n180#1:768,6\n177#1:783\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n7 f13271b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13272c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13273d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13274e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f13275f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13276g;

        /* compiled from: NavigationRail.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f13277b = new a(1);

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
        /* JADX WARN: Multi-variable type inference failed */
        g(n7 n7Var, boolean z4, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(2);
            this.f13271b = n7Var;
            this.f13272c = z4;
            this.f13273d = z5;
            this.f13274e = pVar;
            this.f13275f = z6;
            this.f13276g = pVar2;
        }

        private static final long b(androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var) {
            return b5Var.getValue().M();
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1023357515, i4, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:176)");
            }
            androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> k4 = this.f13271b.k(this.f13272c, this.f13273d, tVar, 0);
            androidx.compose.ui.q c5 = (this.f13274e == null || !(this.f13275f || this.f13272c)) ? androidx.compose.ui.q.INSTANCE : androidx.compose.ui.semantics.o.c(androidx.compose.ui.q.INSTANCE, a.f13277b);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f13276g;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(c5);
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
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(b(k4))), pVar, tVar, androidx.compose.runtime.b3.f15974d);
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

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,742:1\n81#2:743\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1\n*L\n188#1:743\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n7 f13278b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13279c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13280d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13281e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(n7 n7Var, boolean z4, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f13278b = n7Var;
            this.f13279c = z4;
            this.f13280d = z5;
            this.f13281e = pVar;
        }

        private static final long b(androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var) {
            return b5Var.getValue().M();
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-105269599, i4, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:186)");
            }
            w7.a(b(this.f13278b.l(this.f13279c, this.f13280d, tVar, 0)), tb.a(p6.f13227a.c(tVar, 6), c0.k0.f37568a.z()), this.f13281e, tVar, 0);
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

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.q4, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13282b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f13283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z4, ld.a<Float> aVar) {
            super(1);
            this.f13282b = z4;
            this.f13283c = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.q4 q4Var) {
            q4Var.k(this.f13282b ? 1.0f : this.f13283c.invoke().floatValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.q4 q4Var) {
            a(q4Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,742:1\n544#2,2:743\n33#2,6:745\n546#2:751\n544#2,2:754\n33#2,6:756\n546#2:762\n116#2,2:763\n33#2,6:765\n118#2:771\n544#2,2:772\n33#2,6:774\n546#2:780\n92#3:752\n92#3:753\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$2$1\n*L\n522#1:743,2\n522#1:745,6\n522#1:751\n535#1:754,2\n535#1:756,6\n535#1:762\n544#1:763,2\n544#1:765,6\n544#1:771\n555#1:772,2\n555#1:774,6\n555#1:780\n524#1:752\n531#1:753\n*E\n"})
    static final class j implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f13284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13285b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13286c;

        /* JADX WARN: Multi-variable type inference failed */
        j(ld.a<Float> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z4) {
            this.f13284a = aVar;
            this.f13285b = pVar;
            this.f13286c = z4;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            androidx.compose.ui.layout.l0 l0Var;
            androidx.compose.ui.layout.i1 i1Var;
            float floatValue = this.f13284a.invoke().floatValue();
            long e4 = androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null);
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.layout.l0 l0Var2 = list.get(i4);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "icon")) {
                    androidx.compose.ui.layout.i1 m02 = l0Var2.m0(e4);
                    float f4 = 2;
                    int q22 = o0Var.q2(androidx.compose.ui.unit.h.g(p7.f13239k * f4)) + m02.getWidth();
                    int L0 = kotlin.math.b.L0(q22 * floatValue);
                    int q23 = o0Var.q2((this.f13285b == null ? p7.f13241m : p7.f13240l) * f4) + m02.getHeight();
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.compose.ui.layout.l0 l0Var3 = list.get(i5);
                        if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var3), "indicatorRipple")) {
                            androidx.compose.ui.layout.i1 m03 = l0Var3.m0(androidx.compose.ui.unit.b.INSTANCE.c(q22, q23));
                            int size3 = list.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size3) {
                                    l0Var = null;
                                    break;
                                }
                                l0Var = list.get(i6);
                                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), "indicator")) {
                                    break;
                                }
                                i6++;
                            }
                            androidx.compose.ui.layout.l0 l0Var4 = l0Var;
                            androidx.compose.ui.layout.i1 m04 = l0Var4 != null ? l0Var4.m0(androidx.compose.ui.unit.b.INSTANCE.c(L0, q23)) : null;
                            if (this.f13285b != null) {
                                int size4 = list.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    androidx.compose.ui.layout.l0 l0Var5 = list.get(i7);
                                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var5), "label")) {
                                        i1Var = l0Var5.m0(e4);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i1Var = null;
                            if (this.f13285b == null) {
                                return p7.o(o0Var, m02, m03, m04, j4);
                            }
                            kotlin.jvm.internal.l0.m(i1Var);
                            return p7.p(o0Var, i1Var, m02, m03, m04, j4, this.f13286c, floatValue);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: NavigationRail.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13287b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13288c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13289d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13290e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f13291f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f13292g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13293h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, boolean z4, ld.a<Float> aVar, int i4) {
            super(2);
            this.f13287b = pVar;
            this.f13288c = pVar2;
            this.f13289d = pVar3;
            this.f13290e = pVar4;
            this.f13291f = z4;
            this.f13292g = aVar;
            this.f13293h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p7.c(this.f13287b, this.f13288c, this.f13289d, this.f13290e, this.f13291f, this.f13292g, tVar, androidx.compose.runtime.g3.b(this.f13293h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f13294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f13295c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13296d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13297e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f13298f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13299g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13300h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13301i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13302j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, int i4, int i5, androidx.compose.ui.layout.i1 i1Var3, int i6, int i7, int i10, int i11) {
            super(1);
            this.f13294b = i1Var;
            this.f13295c = i1Var2;
            this.f13296d = i4;
            this.f13297e = i5;
            this.f13298f = i1Var3;
            this.f13299g = i6;
            this.f13300h = i7;
            this.f13301i = i10;
            this.f13302j = i11;
        }

        public final void a(@fg.l i1.a aVar) {
            androidx.compose.ui.layout.i1 i1Var = this.f13294b;
            if (i1Var != null) {
                i1.a.m(aVar, i1Var, s.a(i1Var, this.f13301i, 2), r.a(i1Var, this.f13302j, 2), 0.0f, 4, null);
            }
            i1.a.m(aVar, this.f13295c, this.f13296d, this.f13297e, 0.0f, 4, null);
            i1.a.m(aVar, this.f13298f, this.f13299g, this.f13300h, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationRail.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f13303b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13304c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f13305d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f13306e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13307f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f13308g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f13309h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f13310i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13311j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f13312k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f13313l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13314m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f13315n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f13316o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f13317p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.ui.layout.i1 i1Var, boolean z4, float f4, androidx.compose.ui.layout.i1 i1Var2, int i4, float f5, float f6, androidx.compose.ui.layout.i1 i1Var3, int i5, float f7, androidx.compose.ui.layout.i1 i1Var4, int i6, float f10, int i7, androidx.compose.ui.layout.o0 o0Var) {
            super(1);
            this.f13303b = i1Var;
            this.f13304c = z4;
            this.f13305d = f4;
            this.f13306e = i1Var2;
            this.f13307f = i4;
            this.f13308g = f5;
            this.f13309h = f6;
            this.f13310i = i1Var3;
            this.f13311j = i5;
            this.f13312k = f7;
            this.f13313l = i1Var4;
            this.f13314m = i6;
            this.f13315n = f10;
            this.f13316o = i7;
            this.f13317p = o0Var;
        }

        public final void a(@fg.l i1.a aVar) {
            androidx.compose.ui.layout.i1 i1Var = this.f13303b;
            if (i1Var != null) {
                int i4 = this.f13316o;
                float f4 = this.f13312k;
                androidx.compose.ui.layout.o0 o0Var = this.f13317p;
                i1.a.m(aVar, i1Var, s.a(i1Var, i4, 2), kotlin.math.b.L0((f4 - o0Var.v5(p7.f13240l)) + this.f13309h), 0.0f, 4, null);
            }
            if (this.f13304c || this.f13305d != 0.0f) {
                i1.a.m(aVar, this.f13306e, this.f13307f, kotlin.math.b.L0(this.f13308g + this.f13309h), 0.0f, 4, null);
            }
            i1.a.m(aVar, this.f13310i, this.f13311j, kotlin.math.b.L0(this.f13312k + this.f13309h), 0.0f, 4, null);
            i1.a.m(aVar, this.f13313l, this.f13314m, kotlin.math.b.L0(this.f13315n + this.f13309h), 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 4;
        f13233e = androidx.compose.ui.unit.h.g(f4);
        c0.k0 k0Var = c0.k0.f37568a;
        f13236h = k0Var.p();
        f13237i = k0Var.F();
        f13238j = f4;
        float f5 = 2;
        f13239k = (k0Var.i() - k0Var.q()) / f5;
        f13240l = (k0Var.g() - k0Var.q()) / f5;
        f13241m = (k0Var.F() - k0Var.q()) / f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0093  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r25, long r26, long r28, @fg.m ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r30, @fg.m androidx.compose.foundation.layout.n2 r31, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, @fg.m androidx.compose.runtime.t r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p7.a(androidx.compose.ui.q, long, long, ld.q, androidx.compose.foundation.layout.n2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r30, @fg.l ld.a<kotlin.k2> r31, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, @fg.m androidx.compose.ui.q r33, boolean r34, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, boolean r36, @fg.m androidx.compose.material3.n7 r37, @fg.m androidx.compose.foundation.interaction.k r38, @fg.m androidx.compose.runtime.t r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p7.b(boolean, ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, boolean, androidx.compose.material3.n7, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, boolean z4, ld.a<Float> aVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(1498399348);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(pVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(pVar2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(pVar3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar4) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.b(z4) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(aVar) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1498399348, i5, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:502)");
            }
            o4.P(-753441910);
            int i6 = 458752 & i5;
            int i7 = 57344 & i5;
            boolean z5 = ((i5 & 7168) == 2048) | (i6 == 131072) | (i7 == 16384);
            Object Q = o4.Q();
            if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new j(aVar, pVar4, z4);
                o4.E(Q);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q;
            o4.p0();
            o4.P(-1323940314);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, o4, m0Var, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            pVar.invoke(o4, Integer.valueOf(i5 & 14));
            pVar2.invoke(o4, Integer.valueOf((i5 >> 3) & 14));
            androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(companion, "icon");
            o4.P(733328855);
            c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
            int j5 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B2 = o4.B();
            ld.a<androidx.compose.ui.node.g> a8 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(b5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a8);
            } else {
                o4.C();
            }
            ld.p a10 = androidx.compose.animation.p.a(companion2, o4, a7, o4, B2);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, o4, j5, a10);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar5 = androidx.compose.foundation.layout.p.f5235a;
            pVar3.invoke(o4, Integer.valueOf((i5 >> 6) & 14));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            o4.P(-753442160);
            if (pVar4 != null) {
                androidx.compose.ui.q b6 = androidx.compose.ui.layout.w.b(companion, "label");
                o4.P(484847171);
                boolean z6 = (i7 == 16384) | (i6 == 131072);
                Object Q2 = o4.Q();
                if (z6 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q2 = new i(z4, aVar);
                    o4.E(Q2);
                }
                o4.p0();
                androidx.compose.ui.q a11 = androidx.compose.ui.graphics.p4.a(b6, (ld.l) Q2);
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a12 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
                int j6 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B3 = o4.B();
                ld.a<androidx.compose.ui.node.g> a13 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(a11);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a13);
                } else {
                    o4.C();
                }
                ld.p a14 = androidx.compose.animation.p.a(companion2, o4, a12, o4, B3);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j6))) {
                    androidx.compose.animation.d.a(j6, o4, j6, a14);
                }
                androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                q.a((i5 >> 9) & 14, pVar4, o4);
            }
            o4.p0();
            o4.p0();
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new k(pVar, pVar2, pVar3, pVar4, z4, aVar, i4));
        }
    }

    public static final float k() {
        return f13237i;
    }

    public static final float l() {
        return f13238j;
    }

    public static final float m() {
        return f13236h;
    }

    public static final float n() {
        return f13233e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.n0 o(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, long j4) {
        int g4 = androidx.compose.ui.unit.c.g(j4, Math.max(i1Var.getWidth(), Math.max(i1Var2.getWidth(), i1Var3 != null ? i1Var3.getWidth() : 0)));
        int f4 = androidx.compose.ui.unit.c.f(j4, o0Var.q2(f13237i));
        return androidx.compose.ui.layout.o0.x2(o0Var, g4, f4, null, new l(i1Var3, i1Var, s.a(i1Var, g4, 2), r.a(i1Var, f4, 2), i1Var2, s.a(i1Var2, g4, 2), r.a(i1Var2, f4, 2), g4, f4), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.n0 p(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, long j4, boolean z4, float f4) {
        float height = i1Var2.getHeight();
        float f5 = f13240l;
        float v5 = o0Var.v5(f5) + height;
        float f6 = f13238j;
        float v52 = o0Var.v5(f6) + v5 + i1Var.getHeight();
        float f7 = 2;
        float t4 = kotlin.ranges.s.t((androidx.compose.ui.unit.b.q(j4) - v52) / f7, o0Var.v5(f5));
        float f10 = (t4 * f7) + v52;
        float height2 = (1 - f4) * ((z4 ? t4 : (f10 - i1Var2.getHeight()) / f7) - t4);
        float v53 = o0Var.v5(f6) + o0Var.v5(f5) + i1Var2.getHeight() + t4;
        int g4 = androidx.compose.ui.unit.c.g(j4, Math.max(i1Var2.getWidth(), Math.max(i1Var.getWidth(), i1Var4 != null ? i1Var4.getWidth() : 0)));
        return androidx.compose.ui.layout.o0.x2(o0Var, g4, kotlin.math.b.L0(f10), null, new m(i1Var4, z4, f4, i1Var, s.a(i1Var, g4, 2), v53, height2, i1Var2, s.a(i1Var2, g4, 2), t4, i1Var3, s.a(i1Var3, g4, 2), t4 - o0Var.v5(f5), g4, o0Var), 4, null);
    }
}
