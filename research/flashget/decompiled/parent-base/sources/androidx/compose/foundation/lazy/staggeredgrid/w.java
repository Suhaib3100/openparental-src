package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.j1;
import androidx.compose.foundation.layout.l1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.r0;

/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aw\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\u0002\b\u00162\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "itemProviderLambda", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/ui/unit/h;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlinx/coroutines/r0;", "coroutineScope", "Landroidx/compose/foundation/lazy/staggeredgrid/b;", "slots", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/foundation/lazy/staggeredgrid/y;", "Lkotlin/u;", "f", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;Lld/a;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/gestures/j0;FFLkotlinx/coroutines/r0;Landroidx/compose/foundation/lazy/staggeredgrid/b;Landroidx/compose/runtime/t;I)Lld/p;", "Landroidx/compose/ui/unit/w;", "layoutDirection", "g", "(Landroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/gestures/j0;Landroidx/compose/ui/unit/w;)F", "e", "(Landroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/gestures/j0;ZLandroidx/compose/ui/unit/w;)F", "d", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,167:1\n83#2,3:168\n1116#3,6:171\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n49#1:168,3\n49#1:171,6\n*E\n"})
/* loaded from: classes.dex */
public final class w {

    /* compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6490a;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.j0.values().length];
            try {
                iArr[androidx.compose.foundation.gestures.j0.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.gestures.j0.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6490a = iArr;
        }
    }

    /* compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/staggeredgrid/y;", "a", "(Landroidx/compose/foundation/lazy/layout/x;J)Landroidx/compose/foundation/lazy/staggeredgrid/y;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,167:1\n51#2:168\n51#2:169\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n93#1:168\n96#1:169\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, y> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.j0 f6491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.b f6492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<m> f6493d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j0 f6494e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l1 f6495f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f6496g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f6497h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ r0 f6498i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.foundation.gestures.j0 j0Var, androidx.compose.foundation.lazy.staggeredgrid.b bVar, ld.a<? extends m> aVar, j0 j0Var2, l1 l1Var, boolean z4, float f4, r0 r0Var) {
            super(2);
            this.f6491b = j0Var;
            this.f6492c = bVar;
            this.f6493d = aVar;
            this.f6494e = j0Var2;
            this.f6495f = l1Var;
            this.f6496g = z4;
            this.f6497h = f4;
            this.f6498i = r0Var;
        }

        @fg.l
        public final y a(@fg.l androidx.compose.foundation.lazy.layout.x xVar, long j4) {
            androidx.compose.foundation.f0.a(j4, this.f6491b);
            h0 a5 = this.f6492c.a(xVar, j4);
            boolean z4 = this.f6491b == androidx.compose.foundation.gestures.j0.Vertical;
            m invoke = this.f6493d.invoke();
            this.f6494e.d0(a5);
            this.f6494e.f0(z4);
            this.f6494e.e0(invoke.g());
            int q22 = xVar.q2(w.e(this.f6495f, this.f6491b, this.f6496g, xVar.getLayoutDirection()));
            int q23 = xVar.q2(w.d(this.f6495f, this.f6491b, this.f6496g, xVar.getLayoutDirection()));
            int q24 = xVar.q2(w.g(this.f6495f, this.f6491b, xVar.getLayoutDirection()));
            int o4 = ((z4 ? androidx.compose.ui.unit.b.o(j4) : androidx.compose.ui.unit.b.p(j4)) - q22) - q23;
            long a6 = z4 ? androidx.compose.ui.unit.r.a(q24, q22) : androidx.compose.ui.unit.r.a(q22, q24);
            l1 l1Var = this.f6495f;
            int q25 = xVar.q2(androidx.compose.ui.unit.h.g(j1.h(l1Var, xVar.getLayoutDirection()) + j1.i(l1Var, xVar.getLayoutDirection())));
            l1 l1Var2 = this.f6495f;
            boolean z5 = z4;
            y r4 = v.r(xVar, this.f6494e, androidx.compose.foundation.lazy.layout.o.a(invoke, this.f6494e.getPinnedItems(), this.f6494e.getBeyondBoundsInfo()), invoke, a5, androidx.compose.ui.unit.b.e(j4, androidx.compose.ui.unit.c.g(j4, q25), 0, androidx.compose.ui.unit.c.f(j4, xVar.q2(l1Var2.getBottom() + l1Var2.getTop())), 0, 10, null), z5, this.f6496g, a6, o4, xVar.q2(this.f6497h), q22, q23, this.f6498i);
            j0.p(this.f6494e, r4, false, 2, null);
            return r4;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ y invoke(androidx.compose.foundation.lazy.layout.x xVar, androidx.compose.ui.unit.b bVar) {
            return a(xVar, bVar.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(l1 l1Var, androidx.compose.foundation.gestures.j0 j0Var, boolean z4, androidx.compose.ui.unit.w wVar) {
        int i4 = a.f6490a[j0Var.ordinal()];
        if (i4 == 1) {
            return z4 ? l1Var.getTop() : l1Var.getBottom();
        }
        if (i4 == 2) {
            return z4 ? j1.i(l1Var, wVar) : j1.h(l1Var, wVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(l1 l1Var, androidx.compose.foundation.gestures.j0 j0Var, boolean z4, androidx.compose.ui.unit.w wVar) {
        int i4 = a.f6490a[j0Var.ordinal()];
        if (i4 == 1) {
            return z4 ? l1Var.getBottom() : l1Var.getTop();
        }
        if (i4 == 2) {
            return z4 ? j1.h(l1Var, wVar) : j1.i(l1Var, wVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, y> f(@fg.l j0 j0Var, @fg.l ld.a<? extends m> aVar, @fg.l l1 l1Var, boolean z4, @fg.l androidx.compose.foundation.gestures.j0 j0Var2, float f4, float f5, @fg.l r0 r0Var, @fg.l androidx.compose.foundation.lazy.staggeredgrid.b bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-72951591);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-72951591, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:48)");
        }
        Object[] objArr = {j0Var, aVar, l1Var, Boolean.valueOf(z4), j0Var2, androidx.compose.ui.unit.h.d(f4), androidx.compose.ui.unit.h.d(f5), bVar};
        tVar.P(-568225417);
        boolean z5 = false;
        for (int i5 = 0; i5 < 8; i5++) {
            z5 |= tVar.q0(objArr[i5]);
        }
        Object Q = tVar.Q();
        if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new b(j0Var2, bVar, aVar, j0Var, l1Var, z4, f4, r0Var);
            tVar.E(Q);
        }
        tVar.p0();
        ld.p<androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.b, y> pVar = (ld.p) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(l1 l1Var, androidx.compose.foundation.gestures.j0 j0Var, androidx.compose.ui.unit.w wVar) {
        int i4 = a.f6490a[j0Var.ordinal()];
        if (i4 == 1) {
            return j1.i(l1Var, wVar);
        }
        if (i4 == 2) {
            return l1Var.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }
}
