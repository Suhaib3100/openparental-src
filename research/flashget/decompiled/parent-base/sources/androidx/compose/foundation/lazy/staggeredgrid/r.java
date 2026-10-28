package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.r0;
import androidx.compose.foundation.gestures.t0;
import androidx.compose.foundation.i2;
import androidx.compose.foundation.j2;
import androidx.compose.foundation.layout.j1;
import androidx.compose.foundation.layout.l1;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.ui.platform.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyStaggeredGrid.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0089\u0001\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/foundation/lazy/staggeredgrid/b;", "slots", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/ui/unit/h;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/b0;", "Lkotlin/k2;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;Landroidx/compose/foundation/gestures/j0;Landroidx/compose/foundation/lazy/staggeredgrid/b;Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/gestures/e0;ZFFLld/l;Landroidx/compose/runtime/t;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,125:1\n154#2:126\n154#2:127\n154#2:128\n487#3,4:129\n491#3,2:137\n495#3:143\n25#4:133\n1116#5,3:134\n1119#5,3:140\n487#6:139\n74#7:144\n74#7:145\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n49#1:126\n57#1:127\n59#1:128\n66#1:129,4\n66#1:137,2\n66#1:143\n66#1:133\n66#1:134,3\n66#1:140,3\n66#1:139\n96#1:144\n104#1:145\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* compiled from: LazyStaggeredGrid.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f6440b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.j0 f6441c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f6442d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6443e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l1 f6444f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f6445g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f6446h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f6447i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f6448j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f6449k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<b0, k2> f6450l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f6451m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f6452n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f6453o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(j0 j0Var, androidx.compose.foundation.gestures.j0 j0Var2, b bVar, androidx.compose.ui.q qVar, l1 l1Var, boolean z4, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, float f4, float f5, ld.l<? super b0, k2> lVar, int i4, int i5, int i6) {
            super(2);
            this.f6440b = j0Var;
            this.f6441c = j0Var2;
            this.f6442d = bVar;
            this.f6443e = qVar;
            this.f6444f = l1Var;
            this.f6445g = z4;
            this.f6446h = e0Var;
            this.f6447i = z5;
            this.f6448j = f4;
            this.f6449k = f5;
            this.f6450l = lVar;
            this.f6451m = i4;
            this.f6452n = i5;
            this.f6453o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r.a(this.f6440b, this.f6441c, this.f6442d, this.f6443e, this.f6444f, this.f6445g, this.f6446h, this.f6447i, this.f6448j, this.f6449k, this.f6450l, tVar, g3.b(this.f6451m | 1), g3.b(this.f6452n), this.f6453o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void a(@fg.l j0 j0Var, @fg.l androidx.compose.foundation.gestures.j0 j0Var2, @fg.l b bVar, @fg.m androidx.compose.ui.q qVar, @fg.m l1 l1Var, boolean z4, @fg.m androidx.compose.foundation.gestures.e0 e0Var, boolean z5, float f4, float f5, @fg.l ld.l<? super b0, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        androidx.compose.foundation.gestures.e0 e0Var2;
        int i7;
        androidx.compose.runtime.t o4 = tVar.o(288295126);
        androidx.compose.ui.q qVar2 = (i6 & 8) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        l1 a5 = (i6 & 16) != 0 ? j1.a(androidx.compose.ui.unit.h.g(0)) : l1Var;
        boolean z6 = (i6 & 32) != 0 ? false : z4;
        if ((i6 & 64) != 0) {
            e0Var2 = r0.f4232a.b(o4, 6);
            i7 = i4 & (-3670017);
        } else {
            e0Var2 = e0Var;
            i7 = i4;
        }
        boolean z7 = (i6 & 128) != 0 ? true : z5;
        float g4 = (i6 & 256) != 0 ? androidx.compose.ui.unit.h.g(0) : f4;
        float g5 = (i6 & 512) != 0 ? androidx.compose.ui.unit.h.g(0) : f5;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(288295126, i7, i5, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:61)");
        }
        r0 r0Var = r0.f4232a;
        i2 c5 = r0Var.c(o4, 6);
        ld.a<m> a6 = o.a(j0Var, lVar, o4, ((i5 << 3) & 112) | 8);
        Object a7 = androidx.compose.foundation.j.a(o4, 773894976, -492369756);
        if (a7 == androidx.compose.runtime.t.INSTANCE.a()) {
            a7 = androidx.view.compose.l.a(a1.m(kotlin.coroutines.i.f75057b, o4), o4);
        }
        o4.p0();
        kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a7).getCoroutineScope();
        o4.p0();
        int i10 = i7 >> 6;
        int i11 = i10 & 7168;
        int i12 = i7 >> 9;
        int i13 = i7;
        boolean z10 = z6;
        androidx.compose.ui.q qVar3 = qVar2;
        androidx.compose.foundation.lazy.layout.w.b(a6, t0.l(j2.a(androidx.compose.foundation.lazy.layout.m.b(androidx.compose.foundation.m0.a(androidx.compose.foundation.lazy.layout.h0.a(qVar3.w3(j0Var.getRemeasurementModifier()).w3(j0Var.getAwaitLayoutModifier()), a6, f0.a(j0Var, z10, o4, ((i13 >> 12) & 112) | 8), j0Var2, z7, z10, o4, ((i13 << 6) & 7168) | (i12 & 57344) | (i13 & 458752)), j0Var2), d.a(j0Var, o4, 8), j0Var.getBeyondBoundsInfo(), z10, (androidx.compose.ui.unit.w) o4.x(h1.p()), j0Var2, z7, o4, (androidx.compose.runtime.collection.g.f16132e << 6) | i11 | ((i13 << 12) & 458752) | ((i13 >> 3) & 3670016)), c5), j0Var, j0Var2, c5, z7, r0Var.d((androidx.compose.ui.unit.w) o4.x(h1.p()), j0Var2, z10), e0Var2, j0Var.getMutableInteractionSource(), null, 128, null), j0Var.getPrefetchState(), w.f(j0Var, a6, a5, z6, j0Var2, g4, g5, coroutineScope, bVar, o4, (i10 & 896) | 16777224 | i11 | ((i7 << 9) & 57344) | (i12 & 458752) | (i12 & 3670016) | ((i7 << 18) & 234881024)), o4, 0, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(j0Var, j0Var2, bVar, qVar3, a5, z10, e0Var2, z7, g4, g5, lVar, i4, i5, i6));
        }
    }
}
