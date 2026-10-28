package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.a0;
import androidx.compose.animation.core.h2;
import androidx.compose.animation.core.m0;
import androidx.compose.foundation.e0;
import androidx.compose.foundation.layout.c2;
import androidx.compose.material3.f5;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.i5;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.p4;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.semantics.z;
import c0.o;
import fg.l;
import fg.m;
import i0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.ranges.s;
import ld.p;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a]\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a,\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a(\u0010\u001d\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\u001c\u001a\u00020\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a>\u0010&\u001a\u00020\u0005*\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)\u001aF\u0010-\u001a\u00020\u0005*\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\"\u0014\u00100\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010/\"\u0014\u00103\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u00102\"\u0014\u00105\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010/\"\u0014\u00106\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/\"\u001a\u00109\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b7\u00108\"\u001a\u0010<\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00108\"\u0014\u0010>\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010/\"\u0014\u0010@\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010/\"\u0014\u0010B\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010/\"\u0014\u0010D\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010/\"\u0014\u0010F\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010/\"\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00160G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010L\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006N²\u0006\f\u0010M\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/pulltorefresh/e;", "state", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function1;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "indicator", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "d", "(Landroidx/compose/material3/pulltorefresh/e;Landroidx/compose/ui/q;Lld/q;Landroidx/compose/ui/graphics/e6;JJLandroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/unit/h;", "positionalThreshold", "Lkotlin/Function0;", "", "enabled", "r", "(FLld/a;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/pulltorefresh/e;", "", "positionalThresholdPx", "initialRefreshing", "e", "(FZLld/a;)Landroidx/compose/material3/pulltorefresh/e;", "progress", "color", "b", "(Lld/a;JLandroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/graphics/drawscope/f;", "alpha", "Landroidx/compose/material3/pulltorefresh/a;", "values", "Li0/i;", "arcBounds", "strokeWidth", "o", "(Landroidx/compose/ui/graphics/drawscope/f;JFLandroidx/compose/material3/pulltorefresh/a;Li0/i;F)V", "a", "(F)Landroidx/compose/material3/pulltorefresh/a;", "Landroidx/compose/ui/graphics/g5;", "arrow", "bounds", "n", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/graphics/g5;Li0/i;JFLandroidx/compose/material3/pulltorefresh/a;F)V", "F", "MaxProgressArc", "", "I", "CrossfadeDurationMs", "c", "StrokeWidth", "ArcRadius", "q", "()F", "SpinnerSize", "f", "p", "SpinnerContainerSize", "g", "Elevation", "h", "ArrowWidth", "i", "ArrowHeight", "j", "MinAlpha", "k", "MaxAlpha", "Landroidx/compose/animation/core/h2;", "l", "Landroidx/compose/animation/core/h2;", "AlphaTween", "m", "DragMultiplier", "targetAlpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,558:1\n1116#2,6:559\n1116#2,6:567\n1116#2,6:573\n1116#2,6:579\n1116#2,6:585\n1116#2,6:591\n74#3:565\n1#4:566\n137#5,5:597\n262#5,11:602\n81#6:613\n164#7:614\n164#7:615\n154#7:616\n154#7:617\n154#7:618\n154#7:619\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n119#1:559,6\n262#1:567,6\n429#1:573,6\n431#1:579,6\n437#1:585,6\n442#1:591,6\n254#1:565\n529#1:597,5\n529#1:602,11\n431#1:613\n538#1:614\n539#1:615\n540#1:616\n541#1:617\n543#1:618\n544#1:619\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13512a = 0.8f;

    /* renamed from: b, reason: collision with root package name */
    private static final int f13513b = 100;

    /* renamed from: j, reason: collision with root package name */
    private static final float f13521j = 0.3f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f13522k = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    private static final float f13524m = 0.5f;

    /* renamed from: c, reason: collision with root package name */
    private static final float f13514c = androidx.compose.ui.unit.h.g((float) 2.5d);

    /* renamed from: d, reason: collision with root package name */
    private static final float f13515d = (float) 5.5d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f13516e = 16;

    /* renamed from: f, reason: collision with root package name */
    private static final float f13517f = 40;

    /* renamed from: g, reason: collision with root package name */
    private static final float f13518g = o.f37804a.c();

    /* renamed from: h, reason: collision with root package name */
    private static final float f13519h = 10;

    /* renamed from: i, reason: collision with root package name */
    private static final float f13520i = 5;

    /* renamed from: l, reason: collision with root package name */
    @l
    private static final h2<Float> f13523l = androidx.compose.animation.core.l.r(300, 0, m0.e(), 2, null);

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f13525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ld.a<Float> aVar) {
            super(1);
            this.f13525b = aVar;
        }

        public final void a(@l z zVar) {
            w.k1(zVar, new androidx.compose.ui.semantics.h(this.f13525b.invoke().floatValue(), s.e(0.0f, 1.0f), 0));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$2$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,558:1\n137#2,5:559\n262#2,11:564\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$2$1\n*L\n445#1:559,5\n445#1:564,11\n*E\n"})
    static final class b extends n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f13526b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b5<Float> f13527c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13528d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g5 f13529e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ld.a<Float> aVar, b5<Float> b5Var, long j4, g5 g5Var) {
            super(1);
            this.f13526b = aVar;
            this.f13527c = b5Var;
            this.f13528d = j4;
            this.f13529e = g5Var;
        }

        public final void a(@l androidx.compose.ui.graphics.drawscope.f fVar) {
            androidx.compose.material3.pulltorefresh.a a5 = d.a(this.f13526b.invoke().floatValue());
            float floatValue = this.f13527c.getValue().floatValue();
            float rotation = a5.getRotation();
            long j4 = this.f13528d;
            g5 g5Var = this.f13529e;
            long c02 = fVar.c0();
            androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
            long e4 = drawContext.e();
            drawContext.i().C();
            drawContext.getTransform().j(rotation, c02);
            i0.i b5 = i0.j.b(i0.o.b(fVar.e()), (fVar.v5(d.f13514c) / 2.0f) + fVar.v5(d.f13515d));
            d.o(fVar, j4, floatValue, a5, b5, d.f13514c);
            d.n(fVar, g5Var, b5, j4, floatValue, a5, d.f13514c);
            drawContext.i().o();
            drawContext.j(e4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f13530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13531c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ld.a<Float> aVar, long j4, int i4) {
            super(2);
            this.f13530b = aVar;
            this.f13531c = j4;
            this.f13532d = i4;
        }

        public final void a(@m t tVar, int i4) {
            d.b(this.f13530b, this.f13531c, tVar, g3.b(this.f13532d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.pulltorefresh.d$d, reason: collision with other inner class name */
    static final class C0287d extends n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Float> f13533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0287d(ld.a<Float> aVar) {
            super(0);
            this.f13533b = aVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f13533b.invoke().floatValue() < 1.0f ? d.f13521j : 1.0f);
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshContainer$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,558:1\n1116#2,6:559\n154#3:565\n68#4,6:566\n74#4:600\n78#4:605\n78#5,11:572\n91#5:604\n456#6,8:583\n464#6,3:597\n467#6,3:601\n3737#7,6:591\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt$PullToRefreshContainer$1\n*L\n126#1:559,6\n131#1:565\n123#1:566,6\n123#1:600\n123#1:605\n123#1:572,11\n123#1:604\n123#1:583,8\n123#1:597,3\n123#1:601,3\n123#1:591,6\n*E\n"})
    static final class e extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f13534b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.pulltorefresh.e f13535c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b5<Boolean> f13536d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e6 f13537e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13538f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.material3.pulltorefresh.e, t, Integer, k2> f13539g;

        /* compiled from: PullToRefresh.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<q4, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.pulltorefresh.e f13540b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.material3.pulltorefresh.e eVar) {
                super(1);
                this.f13540b = eVar;
            }

            public final void a(@l q4 q4Var) {
                q4Var.o(this.f13540b.d() - n.m(q4Var.getSize()));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(q4 q4Var) {
                a(q4Var);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(q qVar, androidx.compose.material3.pulltorefresh.e eVar, b5<Boolean> b5Var, e6 e6Var, long j4, ld.q<? super androidx.compose.material3.pulltorefresh.e, ? super t, ? super Integer, k2> qVar2) {
            super(2);
            this.f13534b = qVar;
            this.f13535c = eVar;
            this.f13536d = b5Var;
            this.f13537e = e6Var;
            this.f13538f = j4;
            this.f13539g = qVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@m t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(935555266, i4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
            }
            q w4 = c2.w(this.f13534b, d.p());
            tVar.P(-1737250521);
            boolean q02 = tVar.q0(this.f13535c);
            androidx.compose.material3.pulltorefresh.e eVar = this.f13535c;
            Object Q = tVar.Q();
            if (q02 || Q == t.INSTANCE.a()) {
                Q = new a(eVar);
                tVar.E(Q);
            }
            tVar.p0();
            q c5 = androidx.compose.foundation.n.c(androidx.compose.ui.draw.t.b(p4.a(w4, (ld.l) Q), this.f13536d.getValue().booleanValue() ? d.f13518g : androidx.compose.ui.unit.h.g(0), this.f13537e, true, 0L, 0L, 24, null), this.f13538f, this.f13537e);
            ld.q<androidx.compose.material3.pulltorefresh.e, t, Integer, k2> qVar = this.f13539g;
            androidx.compose.material3.pulltorefresh.e eVar2 = this.f13535c;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<v3<androidx.compose.ui.node.g>, t, Integer, k2> g4 = androidx.compose.ui.layout.a0.g(c5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
            if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            qVar.R(eVar2, tVar, 0);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.pulltorefresh.e f13541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f13542c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.material3.pulltorefresh.e, t, Integer, k2> f13543d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e6 f13544e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13545f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f13546g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13547h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13548i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.material3.pulltorefresh.e eVar, q qVar, ld.q<? super androidx.compose.material3.pulltorefresh.e, ? super t, ? super Integer, k2> qVar2, e6 e6Var, long j4, long j5, int i4, int i5) {
            super(2);
            this.f13541b = eVar;
            this.f13542c = qVar;
            this.f13543d = qVar2;
            this.f13544e = e6Var;
            this.f13545f = j4;
            this.f13546g = j5;
            this.f13547h = i4;
            this.f13548i = i5;
        }

        public final void a(@m t tVar, int i4) {
            d.d(this.f13541b, this.f13542c, this.f13543d, this.f13544e, this.f13545f, this.f13546g, tVar, g3.b(this.f13547h | 1), this.f13548i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.pulltorefresh.e f13549b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.material3.pulltorefresh.e eVar) {
            super(0);
            this.f13549b = eVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f13549b.d() > 1.0f || this.f13549b.e());
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f13550b = new h(0);

        h() {
            super(0);
        }

        @l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f13551b = new i(0);

        i() {
            super(0);
        }

        @l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/pulltorefresh/e;", "a", "()Landroidx/compose/material3/pulltorefresh/e;"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.a<androidx.compose.material3.pulltorefresh.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f13552b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f13553c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f4, ld.a<Boolean> aVar) {
            super(0);
            this.f13552b = f4;
            this.f13553c = aVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.material3.pulltorefresh.e invoke() {
            return new androidx.compose.material3.pulltorefresh.f(false, this.f13552b, this.f13553c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material3.pulltorefresh.a a(float f4) {
        float max = (Math.max(Math.min(1.0f, f4) - 0.4f, 0.0f) * 5) / 3;
        float H = s.H(Math.abs(f4) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (H - (((float) Math.pow(H, 2)) / 4))) * 0.5f;
        float f5 = 360;
        return new androidx.compose.material3.pulltorefresh.a(pow, pow * f5, ((f13512a * max) + pow) * f5, Math.min(1.0f, max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void b(ld.a<Float> aVar, long j4, t tVar, int i4) {
        int i5;
        t tVar2;
        t o4 = tVar.o(-569718810);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(aVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.g(j4) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (x.b0()) {
                x.r0(-569718810, i5, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:427)");
            }
            o4.P(-656076138);
            Object Q = o4.Q();
            t.Companion companion = t.INSTANCE;
            Object obj = Q;
            if (Q == companion.a()) {
                g5 a5 = a1.a();
                i5.INSTANCE.getClass();
                a5.g(i5.f17858d);
                o4.E(a5);
                obj = a5;
            }
            g5 g5Var = (g5) obj;
            Object a6 = androidx.compose.material3.w.a(o4, -656075976);
            if (a6 == companion.a()) {
                a6 = o4.e(new C0287d(aVar));
                o4.E(a6);
            }
            o4.p0();
            b5<Float> e4 = androidx.compose.animation.core.d.e(c((b5) a6), f13523l, 0.0f, null, null, o4, 48, 28);
            q.Companion companion2 = q.INSTANCE;
            o4.P(-656075714);
            int i6 = i5 & 14;
            boolean z4 = i6 == 4;
            Object Q2 = o4.Q();
            if (z4 || Q2 == companion.a()) {
                Q2 = new a(aVar);
                o4.E(Q2);
            }
            o4.p0();
            q w4 = c2.w(androidx.compose.ui.semantics.o.e(companion2, true, (ld.l) Q2), f13516e);
            o4.P(-656075558);
            boolean q02 = (i6 == 4) | o4.q0(e4) | ((i5 & 112) == 32) | o4.S(g5Var);
            Object Q3 = o4.Q();
            if (q02 || Q3 == companion.a()) {
                tVar2 = o4;
                b bVar = new b(aVar, e4, j4, g5Var);
                tVar2.E(bVar);
                Q3 = bVar;
            } else {
                tVar2 = o4;
            }
            tVar2.p0();
            e0.b(w4, (ld.l) Q3, tVar2, 0);
            if (x.b0()) {
                x.q0();
            }
        }
        t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new c(aVar, j4, i4));
        }
    }

    private static final float c(b5<Float> b5Var) {
        return b5Var.getValue().floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if ((r27 & 32) != 0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0048  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l androidx.compose.material3.pulltorefresh.e r17, @fg.m androidx.compose.ui.q r18, @fg.m ld.q<? super androidx.compose.material3.pulltorefresh.e, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r19, @fg.m androidx.compose.ui.graphics.e6 r20, long r21, long r23, @fg.m androidx.compose.runtime.t r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.d.d(androidx.compose.material3.pulltorefresh.e, androidx.compose.ui.q, ld.q, androidx.compose.ui.graphics.e6, long, long, androidx.compose.runtime.t, int, int):void");
    }

    @l
    @f5
    public static final androidx.compose.material3.pulltorefresh.e e(float f4, boolean z4, @l ld.a<Boolean> aVar) {
        return new androidx.compose.material3.pulltorefresh.f(z4, f4, aVar);
    }

    public static androidx.compose.material3.pulltorefresh.e f(float f4, boolean z4, ld.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            aVar = h.f13550b;
        }
        return new androidx.compose.material3.pulltorefresh.f(z4, f4, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(androidx.compose.ui.graphics.drawscope.f fVar, g5 g5Var, i0.i iVar, long j4, float f4, androidx.compose.material3.pulltorefresh.a aVar, float f5) {
        g5Var.reset();
        g5Var.s(0.0f, 0.0f);
        float f6 = f13519h;
        g5Var.z((fVar.v5(f6) * aVar.getScale()) / 2, fVar.v5(f13520i) * aVar.getScale());
        g5Var.z(fVar.v5(f6) * aVar.getScale(), 0.0f);
        g5Var.n(i0.g.a((i0.f.p(iVar.o()) + (Math.min(iVar.G(), iVar.r()) / 2.0f)) - ((fVar.v5(f6) * aVar.getScale()) / 2.0f), i0.f.r(iVar.o()) - fVar.v5(f5)));
        float endAngle = aVar.getEndAngle() - fVar.v5(f5);
        long c02 = fVar.c0();
        androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().j(endAngle, c02);
        androidx.compose.ui.graphics.drawscope.f.N1(fVar, g5Var, j4, f4, new androidx.compose.ui.graphics.drawscope.n(fVar.v5(f5), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        drawContext.i().o();
        drawContext.j(e4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(androidx.compose.ui.graphics.drawscope.f fVar, long j4, float f4, androidx.compose.material3.pulltorefresh.a aVar, i0.i iVar, float f5) {
        float startAngle = aVar.getStartAngle();
        float endAngle = aVar.getEndAngle() - aVar.getStartAngle();
        long E = iVar.E();
        long z4 = iVar.z();
        float v5 = fVar.v5(f5);
        i6.INSTANCE.getClass();
        androidx.compose.ui.graphics.drawscope.f.F2(fVar, j4, startAngle, endAngle, false, E, z4, f4, new androidx.compose.ui.graphics.drawscope.n(v5, 0.0f, i6.f17861c, 0, null, 26, null), null, 0, 768, null);
    }

    public static final float p() {
        return f13517f;
    }

    public static final float q() {
        return f13516e;
    }

    @l
    @f5
    @androidx.compose.runtime.i
    public static final androidx.compose.material3.pulltorefresh.e r(float f4, @m ld.a<Boolean> aVar, @m t tVar, int i4, int i5) {
        tVar.P(1935213334);
        if ((i5 & 1) != 0) {
            f4 = androidx.compose.material3.pulltorefresh.c.f13498a.d();
        }
        if ((i5 & 2) != 0) {
            aVar = i.f13551b;
        }
        if (x.b0()) {
            x.r0(1935213334, i4, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:252)");
        }
        float v5 = ((androidx.compose.ui.unit.d) tVar.x(h1.i())).v5(f4);
        Object[] objArr = {Float.valueOf(v5), aVar};
        androidx.compose.runtime.saveable.l<androidx.compose.material3.pulltorefresh.e, Boolean> a5 = androidx.compose.material3.pulltorefresh.f.INSTANCE.a(v5, aVar);
        tVar.P(804873447);
        boolean d5 = ((((i4 & 112) ^ 48) > 32 && tVar.q0(aVar)) || (i4 & 48) == 32) | tVar.d(v5);
        Object Q = tVar.Q();
        if (d5 || Q == t.INSTANCE.a()) {
            Q = new j(v5, aVar);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.material3.pulltorefresh.e eVar = (androidx.compose.material3.pulltorefresh.e) androidx.compose.runtime.saveable.d.d(objArr, a5, null, (ld.a) Q, tVar, 0, 4);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return eVar;
    }
}
