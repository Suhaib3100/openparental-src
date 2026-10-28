package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: NavigationBar.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0015\u001ab\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u001d\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001as\u0010#\u001a\u00020\u000b2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013¢\u0006\u0002\b\f2\u0006\u0010\u0018\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0003¢\u0006\u0004\b#\u0010$\u001a8\u0010-\u001a\u00020,*\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aP\u00100\u001a\u00020,*\u00020%2\u0006\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00104\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u00103\"\u0014\u00105\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u00103\"\u0014\u00107\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00103\"\u0014\u00109\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00103\"\u0014\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:\"\u0014\u0010?\u001a\u00020<8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010>\"\u001a\u0010C\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\bA\u0010B\"\u001a\u0010F\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010B\"\u0014\u0010H\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010:\"\u001a\u0010K\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010B\"\u0014\u0010M\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q²\u0006\f\u0010N\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010O\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010P\u001a\u00020<8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/h;", "tonalElevation", "Landroidx/compose/foundation/layout/n2;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/x1;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/ui/q;JJFLandroidx/compose/foundation/layout/n2;Lld/q;Landroidx/compose/runtime/t;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/g7;", "colors", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "b", "(Landroidx/compose/foundation/layout/x1;ZLld/a;Lld/p;Landroidx/compose/ui/q;ZLld/p;ZLandroidx/compose/material3/g7;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "indicatorRipple", "indicator", "", "animationProgress", "e", "(Lld/p;Lld/p;Lld/p;Lld/p;ZLld/a;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/i1;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "o", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;J)Landroidx/compose/ui/layout/n0;", "labelPlaceable", "p", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;JZF)Landroidx/compose/ui/layout/n0;", "", "Ljava/lang/String;", "IndicatorRippleLayoutIdTag", "IndicatorLayoutIdTag", "c", "IconLayoutIdTag", "d", "LabelLayoutIdTag", "F", "NavigationBarHeight", "", "f", "I", "ItemAnimationDurationMillis", "g", "n", "()F", "NavigationBarItemHorizontalPadding", "h", "m", "NavigationBarIndicatorToLabelPadding", "i", "IndicatorHorizontalPadding", "j", "l", "IndicatorVerticalPadding", "k", "IndicatorVerticalOffset", "iconColor", "textColor", "itemWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,713:1\n1116#2,6:714\n1116#2,6:720\n1116#2,6:726\n1116#2,6:764\n1116#2,6:770\n1116#2,6:781\n1116#2,6:858\n72#3,2:732\n74#3:762\n78#3:780\n68#3,6:818\n74#3:852\n78#3:857\n68#3,6:865\n74#3:899\n78#3:904\n78#4,11:734\n91#4:779\n75#4,14:787\n78#4,11:824\n91#4:856\n78#4,11:871\n91#4:903\n91#4:908\n456#5,8:745\n464#5,3:759\n467#5,3:776\n456#5,8:801\n464#5,3:815\n456#5,8:835\n464#5,3:849\n467#5,3:853\n456#5,8:882\n464#5,3:896\n467#5,3:900\n467#5,3:905\n3737#6,6:753\n3737#6,6:809\n3737#6,6:843\n3737#6,6:890\n74#7:763\n75#8:864\n58#8:914\n75#8:915\n58#8:916\n75#8:917\n75#9:909\n108#9,2:910\n154#10:912\n154#10:913\n154#10:918\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n173#1:714,6\n196#1:720,6\n210#1:726,6\n232#1:764,6\n268#1:770,6\n521#1:781,6\n517#1:858,6\n198#1:732,2\n198#1:762\n198#1:780\n511#1:818,6\n511#1:852\n511#1:857\n514#1:865,6\n514#1:899\n514#1:904\n198#1:734,11\n198#1:779\n507#1:787,14\n511#1:824,11\n511#1:856\n514#1:871,11\n514#1:903\n507#1:908\n198#1:745,8\n198#1:759,3\n198#1:776,3\n507#1:801,8\n507#1:815,3\n511#1:835,8\n511#1:849,3\n511#1:853,3\n514#1:882,8\n514#1:896,3\n514#1:900,3\n507#1:905,3\n198#1:753,6\n507#1:809,6\n511#1:843,6\n514#1:890,6\n225#1:763\n518#1:864\n706#1:914\n706#1:915\n710#1:916\n710#1:917\n196#1:909\n196#1:910,2\n700#1:912\n703#1:913\n712#1:918\n*E\n"})
/* loaded from: classes.dex */
public final class i7 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f11527a = "indicatorRipple";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f11528b = "indicator";

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f11529c = "icon";

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f11530d = "label";

    /* renamed from: e, reason: collision with root package name */
    private static final float f11531e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f11532f = 100;

    /* renamed from: g, reason: collision with root package name */
    private static final float f11533g;

    /* renamed from: h, reason: collision with root package name */
    private static final float f11534h;

    /* renamed from: i, reason: collision with root package name */
    private static final float f11535i;

    /* renamed from: j, reason: collision with root package name */
    private static final float f11536j;

    /* renamed from: k, reason: collision with root package name */
    private static final float f11537k;

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,713:1\n91#2,2:714\n93#2:744\n97#2:749\n78#3,11:716\n91#3:748\n456#4,8:727\n464#4,3:741\n467#4,3:745\n3737#5,6:735\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBar$1\n*L\n116#1:714,2\n116#1:744\n116#1:749\n116#1:716,11\n116#1:748\n116#1:727,8\n116#1:741,3\n116#1:745,3\n116#1:735,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f11539c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f11538b = n2Var;
            this.f11539c = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(105663120, i4, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:115)");
            }
            androidx.compose.ui.q a5 = androidx.compose.foundation.selection.a.a(androidx.compose.foundation.layout.c2.b(androidx.compose.foundation.layout.d3.e(androidx.compose.foundation.layout.c2.h(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null), this.f11538b), 0.0f, i7.f11531e, 1, null));
            i.f z4 = androidx.compose.foundation.layout.i.f5073a.z(i7.n());
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f11539c;
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(z4, q4, tVar, 54);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
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
            ld.p a7 = androidx.compose.animation.p.a(companion, tVar, d5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            qVar.R(androidx.compose.foundation.layout.y1.f5410a, tVar, 6);
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

    /* compiled from: NavigationBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f11541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f11542d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f11543e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11544f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f11545g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f11546h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11547i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, long j4, long j5, float f4, androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f11540b = qVar;
            this.f11541c = j4;
            this.f11542d = j5;
            this.f11543e = f4;
            this.f11544f = n2Var;
            this.f11545g = qVar2;
            this.f11546h = i4;
            this.f11547i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i7.a(this.f11540b, this.f11541c, this.f11542d, this.f11543e, this.f11544f, this.f11545g, tVar, androidx.compose.runtime.g3.b(this.f11546h | 1), this.f11547i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.i2 f11548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.runtime.i2 i2Var) {
            super(1);
            this.f11548b = i2Var;
        }

        public final void a(long j4) {
            i7.f(this.f11548b, androidx.compose.ui.unit.u.m(j4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.unit.u uVar) {
            a(uVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f11549b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.runtime.b5<Float> b5Var) {
            super(0);
            this.f11549b = b5Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return this.f11549b.getValue();
        }
    }

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$3$indicator$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,713:1\n1116#2,6:714\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$3$indicator$1\n*L\n254#1:714,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f11550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g7 f11551c;

        /* compiled from: NavigationBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.q4, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.b5<Float> f11552b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.runtime.b5<Float> b5Var) {
                super(1);
                this.f11552b = b5Var;
            }

            public final void a(@fg.l androidx.compose.ui.graphics.q4 q4Var) {
                q4Var.k(this.f11552b.getValue().floatValue());
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.q4 q4Var) {
                a(q4Var);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.runtime.b5<Float> b5Var, g7 g7Var) {
            super(2);
            this.f11550b = b5Var;
            this.f11551c = g7Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-474426875, i4, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:250)");
            }
            androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "indicator");
            tVar.P(1844203561);
            boolean q02 = tVar.q0(this.f11550b);
            androidx.compose.runtime.b5<Float> b5Var = this.f11550b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(b5Var);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.foundation.layout.m.a(androidx.compose.foundation.n.c(androidx.compose.ui.graphics.p4.a(b5, (ld.l) Q), this.f11551c.getSelectedIndicatorColor(), x8.e(c0.i0.f37429a.h(), tVar, 6)), tVar, 0);
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

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n6 f11553b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n6 n6Var) {
            super(2);
            this.f11553b = n6Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(691730997, i4, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:238)");
            }
            androidx.compose.foundation.layout.m.a(androidx.compose.foundation.p1.b(androidx.compose.ui.draw.h.a(androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "indicatorRipple"), x8.e(c0.i0.f37429a.h(), tVar, 6)), this.f11553b, androidx.compose.material.ripple.p.e(false, 0.0f, 0L, tVar, 0, 7)), tVar, 0);
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

    /* compiled from: NavigationBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.x1 f11554b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11555c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11556d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11557e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11558f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11559g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11560h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f11561i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ g7 f11562j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11563k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11564l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f11565m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.foundation.layout.x1 x1Var, boolean z4, ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, boolean z6, g7 g7Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f11554b = x1Var;
            this.f11555c = z4;
            this.f11556d = aVar;
            this.f11557e = pVar;
            this.f11558f = qVar;
            this.f11559g = z5;
            this.f11560h = pVar2;
            this.f11561i = z6;
            this.f11562j = g7Var;
            this.f11563k = kVar;
            this.f11564l = i4;
            this.f11565m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i7.b(this.f11554b, this.f11555c, this.f11556d, this.f11557e, this.f11558f, this.f11559g, this.f11560h, this.f11561i, this.f11562j, this.f11563k, tVar, androidx.compose.runtime.g3.b(this.f11564l | 1), this.f11565m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,713:1\n68#2,6:714\n74#2:748\n78#2:753\n78#3,11:720\n91#3:752\n456#4,8:731\n464#4,3:745\n467#4,3:749\n3737#5,6:739\n81#6:754\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1\n*L\n179#1:714,6\n179#1:748\n179#1:753\n179#1:720,11\n179#1:752\n179#1:731,8\n179#1:745,3\n179#1:749,3\n179#1:739,6\n176#1:754\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g7 f11566b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11567c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11568d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11569e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11570f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11571g;

        /* compiled from: NavigationBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f11572b = new a(1);

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
        h(g7 g7Var, boolean z4, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(2);
            this.f11566b = g7Var;
            this.f11567c = z4;
            this.f11568d = z5;
            this.f11569e = pVar;
            this.f11570f = z6;
            this.f11571g = pVar2;
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
                androidx.compose.runtime.x.r0(-1419576100, i4, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:175)");
            }
            androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> k4 = this.f11566b.k(this.f11567c, this.f11568d, tVar, 0);
            androidx.compose.ui.q c5 = (this.f11569e == null || !(this.f11570f || this.f11567c)) ? androidx.compose.ui.q.INSTANCE : androidx.compose.ui.semantics.o.c(androidx.compose.ui.q.INSTANCE, a.f11572b);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f11571g;
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

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,713:1\n81#2:714\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1\n*L\n187#1:714\n*E\n"})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g7 f11573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11574c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11575d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11576e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(g7 g7Var, boolean z4, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f11573b = g7Var;
            this.f11574c = z4;
            this.f11575d = z5;
            this.f11576e = pVar;
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
                androidx.compose.runtime.x.r0(1644987592, i4, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:185)");
            }
            w7.a(b(this.f11573b.l(this.f11574c, this.f11575d, tVar, 0)), tb.a(p6.f13227a.c(tVar, 6), c0.i0.f37429a.A()), this.f11576e, tVar, 0);
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

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.q4, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f11578c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z4, ld.a<Float> aVar) {
            super(1);
            this.f11577b = z4;
            this.f11578c = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.q4 q4Var) {
            q4Var.k(this.f11577b ? 1.0f : this.f11578c.invoke().floatValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.q4 q4Var) {
            a(q4Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,713:1\n544#2,2:714\n33#2,6:716\n546#2:722\n544#2,2:725\n33#2,6:727\n546#2:733\n116#2,2:734\n33#2,6:736\n118#2:742\n544#2,2:743\n33#2,6:745\n546#2:751\n92#3:723\n92#3:724\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$2$1\n*L\n526#1:714,2\n526#1:716,6\n526#1:722\n533#1:725,2\n533#1:727,6\n533#1:733\n542#1:734,2\n542#1:736,6\n542#1:742\n553#1:743,2\n553#1:745,6\n553#1:751\n528#1:723\n530#1:724\n*E\n"})
    static final class k implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f11579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11580b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11581c;

        /* JADX WARN: Multi-variable type inference failed */
        k(ld.a<Float> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z4) {
            this.f11579a = aVar;
            this.f11580b = pVar;
            this.f11581c = z4;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            androidx.compose.ui.layout.l0 l0Var;
            androidx.compose.ui.layout.i1 i1Var;
            float floatValue = this.f11579a.invoke().floatValue();
            long e4 = androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null);
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.layout.l0 l0Var2 = list.get(i4);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "icon")) {
                    androidx.compose.ui.layout.i1 m02 = l0Var2.m0(e4);
                    float f4 = 2;
                    int q22 = o0Var.q2(androidx.compose.ui.unit.h.g(i7.f11535i * f4)) + m02.getWidth();
                    int L0 = kotlin.math.b.L0(q22 * floatValue);
                    int q23 = o0Var.q2(i7.l() * f4) + m02.getHeight();
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
                            if (this.f11580b != null) {
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
                            if (this.f11580b == null) {
                                return i7.o(o0Var, m02, m03, m04, j4);
                            }
                            kotlin.jvm.internal.l0.m(i1Var);
                            return i7.p(o0Var, i1Var, m02, m03, m04, j4, this.f11581c, floatValue);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: NavigationBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11583c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11584d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11585e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11586f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f11587g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f11588h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, boolean z4, ld.a<Float> aVar, int i4) {
            super(2);
            this.f11582b = pVar;
            this.f11583c = pVar2;
            this.f11584d = pVar3;
            this.f11585e = pVar4;
            this.f11586f = z4;
            this.f11587g = aVar;
            this.f11588h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i7.e(this.f11582b, this.f11583c, this.f11584d, this.f11585e, this.f11586f, this.f11587g, tVar, androidx.compose.runtime.g3.b(this.f11588h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11590c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11591d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11592e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11593f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11594g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f11595h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11596i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f11597j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, int i4, int i5, androidx.compose.ui.layout.i1 i1Var3, int i6, int i7, int i10, int i11) {
            super(1);
            this.f11589b = i1Var;
            this.f11590c = i1Var2;
            this.f11591d = i4;
            this.f11592e = i5;
            this.f11593f = i1Var3;
            this.f11594g = i6;
            this.f11595h = i7;
            this.f11596i = i10;
            this.f11597j = i11;
        }

        public final void a(@fg.l i1.a aVar) {
            androidx.compose.ui.layout.i1 i1Var = this.f11589b;
            if (i1Var != null) {
                i1.a.m(aVar, i1Var, s.a(i1Var, this.f11596i, 2), r.a(i1Var, this.f11597j, 2), 0.0f, 4, null);
            }
            i1.a.m(aVar, this.f11590c, this.f11591d, this.f11592e, 0.0f, 4, null);
            i1.a.m(aVar, this.f11593f, this.f11594g, this.f11595h, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11600d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11601e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11602f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f11603g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f11604h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11605i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f11606j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f11607k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11608l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f11609m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f11610n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11611o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f11612p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.compose.ui.layout.i1 i1Var, boolean z4, float f4, androidx.compose.ui.layout.i1 i1Var2, int i4, float f5, float f6, androidx.compose.ui.layout.i1 i1Var3, int i5, float f7, androidx.compose.ui.layout.i1 i1Var4, int i6, float f10, int i7, androidx.compose.ui.layout.o0 o0Var) {
            super(1);
            this.f11598b = i1Var;
            this.f11599c = z4;
            this.f11600d = f4;
            this.f11601e = i1Var2;
            this.f11602f = i4;
            this.f11603g = f5;
            this.f11604h = f6;
            this.f11605i = i1Var3;
            this.f11606j = i5;
            this.f11607k = f7;
            this.f11608l = i1Var4;
            this.f11609m = i6;
            this.f11610n = f10;
            this.f11611o = i7;
            this.f11612p = o0Var;
        }

        public final void a(@fg.l i1.a aVar) {
            androidx.compose.ui.layout.i1 i1Var = this.f11598b;
            if (i1Var != null) {
                int i4 = this.f11611o;
                float f4 = this.f11607k;
                androidx.compose.ui.layout.o0 o0Var = this.f11612p;
                i1.a.m(aVar, i1Var, s.a(i1Var, i4, 2), kotlin.math.b.L0((f4 - o0Var.q2(i7.l())) + this.f11604h), 0.0f, 4, null);
            }
            if (this.f11599c || this.f11600d != 0.0f) {
                i1.a.m(aVar, this.f11601e, this.f11602f, kotlin.math.b.L0(this.f11603g + this.f11604h), 0.0f, 4, null);
            }
            i1.a.m(aVar, this.f11605i, this.f11606j, kotlin.math.b.L0(this.f11607k + this.f11604h), 0.0f, 4, null);
            i1.a.m(aVar, this.f11608l, this.f11609m, kotlin.math.b.L0(this.f11610n + this.f11604h), 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    static {
        c0.i0 i0Var = c0.i0.f37429a;
        f11531e = i0Var.o();
        f11533g = androidx.compose.ui.unit.h.g(8);
        f11534h = 4;
        float f4 = 2;
        f11535i = (i0Var.i() - i0Var.r()) / f4;
        f11536j = (i0Var.g() - i0Var.r()) / f4;
        f11537k = 12;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0093  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r25, long r26, long r28, float r30, @fg.m androidx.compose.foundation.layout.n2 r31, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, @fg.m androidx.compose.runtime.t r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.i7.a(androidx.compose.ui.q, long, long, float, androidx.compose.foundation.layout.n2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e5  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.foundation.layout.x1 r31, boolean r32, @fg.l ld.a<kotlin.k2> r33, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r34, @fg.m androidx.compose.ui.q r35, boolean r36, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r37, boolean r38, @fg.m androidx.compose.material3.g7 r39, @fg.m androidx.compose.foundation.interaction.k r40, @fg.m androidx.compose.runtime.t r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.i7.b(androidx.compose.foundation.layout.x1, boolean, ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, boolean, androidx.compose.material3.g7, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    private static final int c(androidx.compose.runtime.i2 i2Var) {
        return i2Var.f();
    }

    private static final void d(androidx.compose.runtime.i2 i2Var, int i4) {
        i2Var.k(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void e(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, boolean z4, ld.a<Float> aVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1427075886);
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
                androidx.compose.runtime.x.r0(-1427075886, i5, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:505)");
            }
            o4.P(-1250032035);
            int i6 = 458752 & i5;
            int i7 = 57344 & i5;
            boolean z5 = (i6 == 131072) | ((i5 & 7168) == 2048) | (i7 == 16384);
            Object Q = o4.Q();
            if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new k(aVar, pVar4, z4);
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
            o4.P(-1250032367);
            if (pVar4 != null) {
                androidx.compose.ui.q b6 = androidx.compose.ui.layout.w.b(companion, "label");
                o4.P(1836184900);
                boolean z6 = (i6 == 131072) | (i7 == 16384);
                Object Q2 = o4.Q();
                if (z6 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q2 = new j(z4, aVar);
                    o4.E(Q2);
                }
                o4.p0();
                androidx.compose.ui.q m4 = androidx.compose.foundation.layout.j1.m(androidx.compose.ui.graphics.p4.a(b6, (ld.l) Q2), androidx.compose.ui.unit.h.g(f11533g / 2), 0.0f, 2, null);
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a11 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
                int j6 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B3 = o4.B();
                ld.a<androidx.compose.ui.node.g> a12 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(m4);
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
            t4.a(new l(pVar, pVar2, pVar3, pVar4, z4, aVar, i4));
        }
    }

    public static final void f(androidx.compose.runtime.i2 i2Var, int i4) {
        i2Var.k(i4);
    }

    public static final float l() {
        return f11536j;
    }

    public static final float m() {
        return f11534h;
    }

    public static final float n() {
        return f11533g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.n0 o(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, long j4) {
        int p4 = androidx.compose.ui.unit.b.p(j4);
        int f4 = androidx.compose.ui.unit.c.f(j4, o0Var.q2(f11531e));
        return androidx.compose.ui.layout.o0.x2(o0Var, p4, f4, null, new m(i1Var3, i1Var, s.a(i1Var, p4, 2), r.a(i1Var, f4, 2), i1Var2, s.a(i1Var2, p4, 2), r.a(i1Var2, f4, 2), p4, f4), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.n0 p(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, long j4, boolean z4, float f4) {
        float height = i1Var2.getHeight();
        float f5 = f11536j;
        float v5 = o0Var.v5(f5) + height;
        float f6 = f11534h;
        float v52 = o0Var.v5(f6) + v5 + i1Var.getHeight();
        float f7 = 2;
        float t4 = kotlin.ranges.s.t((androidx.compose.ui.unit.b.q(j4) - v52) / f7, o0Var.v5(f5));
        float f10 = (t4 * f7) + v52;
        float height2 = (1 - f4) * ((z4 ? t4 : (f10 - i1Var2.getHeight()) / f7) - t4);
        float v53 = o0Var.v5(f6) + o0Var.v5(f5) + i1Var2.getHeight() + t4;
        int p4 = androidx.compose.ui.unit.b.p(j4);
        return androidx.compose.ui.layout.o0.x2(o0Var, p4, kotlin.math.b.L0(f10), null, new n(i1Var4, z4, f4, i1Var, s.a(i1Var, p4, 2), v53, height2, i1Var2, s.a(i1Var2, p4, 2), t4, i1Var3, s.a(i1Var3, p4, 2), t4 - o0Var.v5(f5), p4, o0Var), 4, null);
    }
}
