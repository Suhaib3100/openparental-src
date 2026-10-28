package androidx.compose.material3;

import androidx.compose.animation.core.e2;
import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0088\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0080\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001ax\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a=\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010%\u001a\u00020\u0003*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&\u001aK\u0010.\u001a\u00020\u0003*\u00020 2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b.\u0010/\"\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101\"\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101\"\u0014\u00105\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u00104\"\u0014\u00106\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u00104\"\u0014\u00107\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u00104\"\u001a\u0010;\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u0010:\"\u0014\u0010=\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00101\"\u0014\u0010?\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00101\"\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u0014\u0010E\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\f\u0010F\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "Landroidx/compose/ui/q;", "modifier", "enabled", "Landroidx/compose/runtime/i;", "text", "icon", "Landroidx/compose/ui/graphics/d2;", "selectedContentColor", "unselectedContentColor", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "c", "(ZLld/a;Landroidx/compose/ui/q;ZLld/p;Lld/p;JJLandroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "a", "(ZLld/a;Lld/p;Lld/p;Landroidx/compose/ui/q;ZJJLandroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Lkotlin/u;", "content", "b", "(ZLld/a;Landroidx/compose/ui/q;ZJJLandroidx/compose/foundation/interaction/k;Lld/q;Landroidx/compose/runtime/t;II)V", "activeColor", "inactiveColor", "e", "(JJZLld/p;Landroidx/compose/runtime/t;I)V", "d", "(Lld/p;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/layout/i1$a;", "Landroidx/compose/ui/layout/i1;", "textOrIconPlaceable", "", "tabHeight", "q", "(Landroidx/compose/ui/layout/i1$a;Landroidx/compose/ui/layout/i1;I)V", "Landroidx/compose/ui/unit/d;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "p", "(Landroidx/compose/ui/layout/i1$a;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;IIII)V", "Landroidx/compose/ui/unit/h;", "F", "SmallTabHeight", "LargeTabHeight", "I", "TabFadeInAnimationDuration", "TabFadeInAnimationDelay", "TabFadeOutAnimationDuration", "f", "o", "()F", "HorizontalTextPadding", "g", "SingleLineTextBaselineWithIcon", "h", "DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/z;", "i", "J", "IconDistanceFromBaseline", "j", "TextDistanceFromLeadingIcon", "color", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,452:1\n74#2:453\n74#2:460\n74#2:467\n1116#3,6:454\n1116#3,6:461\n1116#3,6:468\n1116#3,3:480\n1119#3,3:484\n1116#3,6:493\n66#4,5:474\n71#4:483\n74#4:487\n36#5:479\n456#5,8:513\n464#5,3:527\n456#5,8:547\n464#5,3:561\n467#5,3:565\n456#5,8:587\n464#5,3:601\n467#5,3:605\n467#5,3:610\n1083#6,5:488\n75#7,14:499\n78#7,11:536\n91#7:568\n78#7,11:576\n91#7:608\n91#7:613\n3737#8,6:521\n3737#8,6:555\n3737#8,6:595\n68#9,6:530\n74#9:564\n78#9:569\n68#9,6:570\n74#9:604\n78#9:609\n81#10:614\n154#11:615\n154#11:616\n154#11:617\n154#11:618\n154#11:619\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n*L\n99#1:453\n161#1:460\n235#1:467\n101#1:454,6\n163#1:461,6\n237#1:468,6\n281#1:480,3\n281#1:484,3\n328#1:493,6\n281#1:474,5\n281#1:483\n281#1:487\n281#1:479\n315#1:513,8\n315#1:527,3\n318#1:547,8\n318#1:561,3\n318#1:565,3\n325#1:587,8\n325#1:601,3\n325#1:605,3\n315#1:610,3\n281#1:488,5\n315#1:499,14\n318#1:536,11\n318#1:568\n325#1:576,11\n325#1:608\n315#1:613\n315#1:521,6\n318#1:555,6\n325#1:595,6\n318#1:530,6\n318#1:564\n318#1:569\n325#1:570,6\n325#1:604\n325#1:609\n281#1:614\n432#1:615\n440#1:616\n444#1:617\n447#1:618\n451#1:619\n*E\n"})
/* loaded from: classes.dex */
public final class ja {

    /* renamed from: c, reason: collision with root package name */
    private static final int f11938c = 150;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11939d = 100;

    /* renamed from: e, reason: collision with root package name */
    private static final int f11940e = 100;

    /* renamed from: a, reason: collision with root package name */
    private static final float f11936a = c0.t0.f38146a.n();

    /* renamed from: b, reason: collision with root package name */
    private static final float f11937b = androidx.compose.ui.unit.h.g(72);

    /* renamed from: f, reason: collision with root package name */
    private static final float f11941f = 16;

    /* renamed from: g, reason: collision with root package name */
    private static final float f11942g = 14;

    /* renamed from: h, reason: collision with root package name */
    private static final float f11943h = 6;

    /* renamed from: i, reason: collision with root package name */
    private static final long f11944i = androidx.compose.ui.unit.a0.m(20);

    /* renamed from: j, reason: collision with root package name */
    private static final float f11945j = 8;

    /* compiled from: Tab.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,452:1\n91#2,2:453\n93#2:483\n97#2:488\n78#3,11:455\n91#3:487\n456#4,8:466\n464#4,3:480\n467#4,3:484\n3737#5,6:474\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$2\n*L\n175#1:453,2\n175#1:483\n175#1:488\n175#1:455,11\n175#1:487\n175#1:466,8\n175#1:480,3\n175#1:484,3\n175#1:474,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11946b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11947c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11948d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.n1 f11949e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11950f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11951g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11952h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11953i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.q qVar, boolean z4, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.n1 n1Var, boolean z5, ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(2);
            this.f11946b = qVar;
            this.f11947c = z4;
            this.f11948d = kVar;
            this.f11949e = n1Var;
            this.f11950f = z5;
            this.f11951g = aVar;
            this.f11952h = pVar;
            this.f11953i = pVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            androidx.compose.ui.text.v0 l4;
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-429037564, i4, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
            }
            androidx.compose.ui.q i5 = androidx.compose.foundation.layout.c2.i(this.f11946b, ja.f11936a);
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(androidx.compose.foundation.layout.j1.m(androidx.compose.foundation.selection.b.a(i5, this.f11947c, this.f11948d, this.f11949e, this.f11950f, androidx.compose.ui.semantics.i.h(androidx.compose.ui.semantics.i.f20313g), this.f11951g), ja.o(), 0.0f, 2, null), 0.0f, 1, null);
            i.f f4 = androidx.compose.foundation.layout.i.f5073a.f();
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f11952h;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f11953i;
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(f4, q4, tVar, 54);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(h4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, tVar, d5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            pVar.invoke(tVar, 0);
            androidx.compose.foundation.layout.f2.a(androidx.compose.foundation.layout.c2.t(androidx.compose.ui.q.INSTANCE, ja.f11945j), tVar, 6);
            androidx.compose.ui.text.v0 a7 = tb.a(p6.f13227a.c(tVar, 6), c0.t0.f38146a.z());
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            l4 = a7.l((r48 & 1) != 0 ? a7.spanStyle.m() : 0L, (r48 & 2) != 0 ? a7.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? a7.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? a7.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? a7.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? a7.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? a7.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? a7.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? a7.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? a7.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? a7.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? a7.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? a7.spanStyle.getBackground() : null, (r48 & 8192) != 0 ? a7.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? a7.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? a7.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.j.f21356e, (r48 & 65536) != 0 ? a7.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? a7.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? a7.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? a7.platformStyle : null, (r48 & 1048576) != 0 ? a7.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? a7.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? a7.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? a7.paragraphStyle.getTextMotion() : null);
            xa.a(l4, pVar2, tVar, 0);
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

    /* compiled from: Tab.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11954b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11955c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11956d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11957e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11958f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11959g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f11960h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f11961i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11962j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11963k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11964l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z4, ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.ui.q qVar, boolean z5, long j4, long j5, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f11954b = z4;
            this.f11955c = aVar;
            this.f11956d = pVar;
            this.f11957e = pVar2;
            this.f11958f = qVar;
            this.f11959g = z5;
            this.f11960h = j4;
            this.f11961i = j5;
            this.f11962j = kVar;
            this.f11963k = i4;
            this.f11964l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ja.a(this.f11954b, this.f11955c, this.f11956d, this.f11957e, this.f11958f, this.f11959g, this.f11960h, this.f11961i, this.f11962j, tVar, androidx.compose.runtime.g3.b(this.f11963k | 1), this.f11964l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tab.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/u;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/layout/u;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11965b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(3);
            this.f11965b = pVar;
            this.f11966c = pVar2;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.foundation.layout.u uVar, androidx.compose.runtime.t tVar, Integer num) {
            a(uVar, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.layout.u uVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1540996038, i4, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:119)");
            }
            ja.d(this.f11965b, this.f11966c, tVar, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Tab.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11968c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11969d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11970e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11971f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11972g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f11973h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f11974i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11975j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11976k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11977l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z4, ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, long j4, long j5, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f11967b = z4;
            this.f11968c = aVar;
            this.f11969d = qVar;
            this.f11970e = z5;
            this.f11971f = pVar;
            this.f11972g = pVar2;
            this.f11973h = j4;
            this.f11974i = j5;
            this.f11975j = kVar;
            this.f11976k = i4;
            this.f11977l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ja.c(this.f11967b, this.f11968c, this.f11969d, this.f11970e, this.f11971f, this.f11972g, this.f11973h, this.f11974i, this.f11975j, tVar, androidx.compose.runtime.g3.b(this.f11976k | 1), this.f11977l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tab.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$Tab$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,452:1\n78#2,2:453\n80#2:483\n84#2:488\n78#3,11:455\n91#3:487\n456#4,8:466\n464#4,3:480\n467#4,3:484\n3737#5,6:474\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$Tab$5\n*L\n250#1:453,2\n250#1:483\n250#1:488\n250#1:455,11\n250#1:487\n250#1:466,8\n250#1:480,3\n250#1:484,3\n250#1:474,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11980d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.n1 f11981e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11982f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11983g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f11984h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.q qVar, boolean z4, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.n1 n1Var, boolean z5, ld.a<kotlin.k2> aVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2) {
            super(2);
            this.f11978b = qVar;
            this.f11979c = z4;
            this.f11980d = kVar;
            this.f11981e = n1Var;
            this.f11982f = z5;
            this.f11983g = aVar;
            this.f11984h = qVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-551896140, i4, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
            }
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(androidx.compose.foundation.selection.b.a(this.f11978b, this.f11979c, this.f11980d, this.f11981e, this.f11982f, androidx.compose.ui.semantics.i.h(androidx.compose.ui.semantics.i.f20313g), this.f11983g), 0.0f, 1, null);
            c.b m4 = androidx.compose.ui.c.INSTANCE.m();
            i.f f4 = androidx.compose.foundation.layout.i.f5073a.f();
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f11984h;
            tVar.P(-483455358);
            androidx.compose.ui.layout.m0 b5 = androidx.compose.foundation.layout.t.b(f4, m4, tVar, 54);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(h4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, tVar, b5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            qVar.R(androidx.compose.foundation.layout.v.f5347a, tVar, 6);
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

    /* compiled from: Tab.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11985b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11986c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11987d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11988e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f11989f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f11990g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11991h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f11992i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f11993j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11994k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(boolean z4, ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z5, long j4, long j5, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f11985b = z4;
            this.f11986c = aVar;
            this.f11987d = qVar;
            this.f11988e = z5;
            this.f11989f = j4;
            this.f11990g = j5;
            this.f11991h = kVar;
            this.f11992i = qVar2;
            this.f11993j = i4;
            this.f11994k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ja.b(this.f11985b, this.f11986c, this.f11987d, this.f11988e, this.f11989f, this.f11990g, this.f11991h, this.f11992i, tVar, androidx.compose.runtime.g3.b(this.f11993j | 1), this.f11994k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tab.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11995b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f11995b = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            androidx.compose.ui.text.v0 l4;
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(708874428, i4, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
            }
            androidx.compose.ui.text.v0 a5 = tb.a(p6.f13227a.c(tVar, 6), c0.t0.f38146a.z());
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            l4 = a5.l((r48 & 1) != 0 ? a5.spanStyle.m() : 0L, (r48 & 2) != 0 ? a5.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? a5.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? a5.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? a5.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? a5.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? a5.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? a5.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? a5.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? a5.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? a5.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? a5.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? a5.spanStyle.getBackground() : null, (r48 & 8192) != 0 ? a5.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? a5.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? a5.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.j.f21356e, (r48 & 65536) != 0 ? a5.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? a5.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? a5.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? a5.platformStyle : null, (r48 & 1048576) != 0 ? a5.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? a5.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? a5.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? a5.paragraphStyle.getTextMotion() : null);
            xa.a(l4, this.f11995b, tVar, 0);
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

    /* compiled from: Tab.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$TabBaselineLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,452:1\n544#2,2:453\n33#2,6:455\n546#2:461\n544#2,2:462\n33#2,6:464\n546#2:470\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$TabBaselineLayout$2$1\n*L\n330#1:453,2\n330#1:455,6\n330#1:461\n338#1:462,2\n338#1:464,6\n338#1:470\n*E\n"})
    static final class h implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11997b;

        /* compiled from: Tab.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11998b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11999c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.o0 f12000d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f12001e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f12002f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Integer f12003g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Integer f12004h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.o0 o0Var, int i4, int i5, Integer num, Integer num2) {
                super(1);
                this.f11998b = i1Var;
                this.f11999c = i1Var2;
                this.f12000d = o0Var;
                this.f12001e = i4;
                this.f12002f = i5;
                this.f12003g = num;
                this.f12004h = num2;
            }

            public final void a(@fg.l i1.a aVar) {
                androidx.compose.ui.layout.i1 i1Var;
                androidx.compose.ui.layout.i1 i1Var2 = this.f11998b;
                if (i1Var2 == null || (i1Var = this.f11999c) == null) {
                    if (i1Var2 != null) {
                        ja.q(aVar, i1Var2, this.f12002f);
                        return;
                    }
                    androidx.compose.ui.layout.i1 i1Var3 = this.f11999c;
                    if (i1Var3 != null) {
                        ja.q(aVar, i1Var3, this.f12002f);
                        return;
                    }
                    return;
                }
                androidx.compose.ui.layout.o0 o0Var = this.f12000d;
                int i4 = this.f12001e;
                int i5 = this.f12002f;
                Integer num = this.f12003g;
                kotlin.jvm.internal.l0.m(num);
                int intValue = num.intValue();
                Integer num2 = this.f12004h;
                kotlin.jvm.internal.l0.m(num2);
                ja.p(aVar, o0Var, i1Var2, i1Var, i4, i5, intValue, num2.intValue());
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            this.f11996a = pVar;
            this.f11997b = pVar2;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            androidx.compose.ui.layout.i1 i1Var;
            androidx.compose.ui.layout.i1 i1Var2;
            if (this.f11996a != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    androidx.compose.ui.layout.l0 l0Var = list.get(i4);
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), "text")) {
                        i1Var = l0Var.m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 11, null));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i1Var = null;
            if (this.f11997b != null) {
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    androidx.compose.ui.layout.l0 l0Var2 = list.get(i5);
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "icon")) {
                        i1Var2 = l0Var2.m0(j4);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i1Var2 = null;
            int max = Math.max(i1Var != null ? i1Var.getWidth() : 0, i1Var2 != null ? i1Var2.getWidth() : 0);
            int max2 = Math.max(o0Var.q2((i1Var == null || i1Var2 == null) ? ja.f11936a : ja.f11937b), o0Var.J5(ja.f11944i) + (i1Var2 != null ? i1Var2.getHeight() : 0) + (i1Var != null ? i1Var.getHeight() : 0));
            return androidx.compose.ui.layout.o0.x2(o0Var, max, max2, null, new a(i1Var, i1Var2, o0Var, max, max2, i1Var != null ? Integer.valueOf(i1Var.q(androidx.compose.ui.layout.b.a())) : null, i1Var != null ? Integer.valueOf(i1Var.q(androidx.compose.ui.layout.b.b())) : null), 4, null);
        }
    }

    /* compiled from: Tab.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12005b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12006c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12007d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4) {
            super(2);
            this.f12005b = pVar;
            this.f12006c = pVar2;
            this.f12007d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ja.d(this.f12005b, this.f12006c, tVar, androidx.compose.runtime.g3.b(this.f12007d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tab.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12008b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12009c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12010d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12011e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12012f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(long j4, long j5, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f12008b = j4;
            this.f12009c = j5;
            this.f12010d = z4;
            this.f12011e = pVar;
            this.f12012f = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ja.e(this.f12008b, this.f12009c, this.f12010d, this.f12011e, tVar, androidx.compose.runtime.g3.b(this.f12012f | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tab.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.q<e2.b<Boolean>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2>> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f12013b = new k(3);

        k() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2> R(e2.b<Boolean> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2> a(@fg.l e2.b<Boolean> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-899623535);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-899623535, i4, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:282)");
            }
            androidx.compose.animation.core.h2 h2Var = bVar.j(Boolean.FALSE, Boolean.TRUE) ? new androidx.compose.animation.core.h2(150, 100, androidx.compose.animation.core.m0.e()) : androidx.compose.animation.core.l.r(100, 0, androidx.compose.animation.core.m0.e(), 2, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return h2Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e6  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r24, @fg.l ld.a<kotlin.k2> r25, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r26, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m androidx.compose.ui.q r28, boolean r29, long r30, long r32, @fg.m androidx.compose.foundation.interaction.k r34, @fg.m androidx.compose.runtime.t r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ja.a(boolean, ld.a, ld.p, ld.p, androidx.compose.ui.q, boolean, long, long, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bb  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r27, @fg.l ld.a<kotlin.k2> r28, @fg.m androidx.compose.ui.q r29, boolean r30, long r31, long r33, @fg.m androidx.compose.foundation.interaction.k r35, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, @fg.m androidx.compose.runtime.t r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ja.b(boolean, ld.a, androidx.compose.ui.q, boolean, long, long, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f5  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r29, @fg.l ld.a<kotlin.k2> r30, @fg.m androidx.compose.ui.q r31, boolean r32, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r34, long r35, long r37, @fg.m androidx.compose.foundation.interaction.k r39, @fg.m androidx.compose.runtime.t r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ja.c(boolean, ld.a, androidx.compose.ui.q, boolean, ld.p, ld.p, long, long, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(514131524);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(pVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(pVar2) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(514131524, i5, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:313)");
            }
            o4.P(150513508);
            int i6 = i5 & 14;
            boolean z4 = (i6 == 4) | ((i5 & 112) == 32);
            Object Q = o4.Q();
            if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new h(pVar, pVar2);
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
            o4.P(720851373);
            if (pVar != null) {
                androidx.compose.ui.q m4 = androidx.compose.foundation.layout.j1.m(androidx.compose.ui.layout.w.b(companion, "text"), f11941f, 0.0f, 2, null);
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, o4, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B2 = o4.B();
                ld.a<androidx.compose.ui.node.g> a8 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(m4);
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
                androidx.compose.foundation.layout.p pVar3 = androidx.compose.foundation.layout.p.f5235a;
                q.a(i6, pVar, o4);
            }
            o4.p0();
            o4.P(150513400);
            if (pVar2 != null) {
                androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(companion, "icon");
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a11 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, o4, 0, -1323940314);
                int j6 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B3 = o4.B();
                ld.a<androidx.compose.ui.node.g> a12 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(b5);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a12);
                } else {
                    o4.C();
                }
                ld.p a13 = androidx.compose.animation.p.a(companion2, o4, a11, o4, B3);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j6))) {
                    androidx.compose.animation.d.a(j6, o4, j6, a13);
                }
                androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.p pVar4 = androidx.compose.foundation.layout.p.f5235a;
                q.a((i5 >> 3) & 14, pVar2, o4);
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
            t4.a(new i(pVar, pVar2, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final void e(long j4, long j5, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(735731848);
        if ((i4 & 6) == 0) {
            i5 = (o4.g(j4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.g(j5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.b(z4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(735731848, i5, -1, "androidx.compose.material3.TabTransition (Tab.kt:278)");
            }
            int i6 = i5 >> 6;
            androidx.compose.animation.core.e2 p4 = androidx.compose.animation.core.f2.p(Boolean.valueOf(z4), null, o4, i6 & 14, 2);
            k kVar = k.f12013b;
            o4.P(-1939694975);
            boolean booleanValue = ((Boolean) p4.o()).booleanValue();
            o4.P(-1997025499);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:296)");
            }
            long j6 = booleanValue ? j4 : j5;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            o4.p0();
            androidx.compose.ui.graphics.colorspace.c E = androidx.compose.ui.graphics.d2.E(j6);
            o4.P(1157296644);
            boolean q02 = o4.q0(E);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = (androidx.compose.animation.core.i2) androidx.compose.animation.w.a(androidx.compose.ui.graphics.d2.INSTANCE).invoke(E);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.animation.core.i2 i2Var = (androidx.compose.animation.core.i2) Q;
            o4.P(-142660079);
            boolean booleanValue2 = ((Boolean) p4.h()).booleanValue();
            o4.P(-1997025499);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:296)");
            }
            long j7 = booleanValue2 ? j4 : j5;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            o4.p0();
            androidx.compose.ui.graphics.d2 n4 = androidx.compose.ui.graphics.d2.n(j7);
            boolean booleanValue3 = ((Boolean) p4.o()).booleanValue();
            o4.P(-1997025499);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:296)");
            }
            long j10 = booleanValue3 ? j4 : j5;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            o4.p0();
            androidx.compose.runtime.b5 m4 = androidx.compose.animation.core.f2.m(p4, n4, androidx.compose.ui.graphics.d2.n(j10), kVar.R(p4.m(), o4, 0), i2Var, "ColorAnimation", o4, 32768);
            o4.p0();
            o4.p0();
            androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(f(m4))), pVar, o4, (i6 & 112) | androidx.compose.runtime.b3.f15974d);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new j(j4, j5, z4, pVar, i4));
        }
    }

    private static final long f(androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var) {
        return b5Var.getValue().M();
    }

    public static final float o() {
        return f11941f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(i1.a aVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, int i4, int i5, int i6, int i7) {
        int q22 = dVar.q2(c0.t0.f38146a.g()) + dVar.q2(i6 == i7 ? f11942g : f11943h);
        int J5 = (dVar.J5(f11944i) + i1Var2.getHeight()) - i6;
        int i10 = (i5 - i7) - q22;
        i1.a.m(aVar, i1Var, s.a(i1Var, i4, 2), i10, 0.0f, 4, null);
        i1.a.m(aVar, i1Var2, s.a(i1Var2, i4, 2), i10 - J5, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(i1.a aVar, androidx.compose.ui.layout.i1 i1Var, int i4) {
        i1.a.m(aVar, i1Var, 0, r.a(i1Var, i4, 2), 0.0f, 4, null);
    }
}
