package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridBeyondBoundsModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "Landroidx/compose/foundation/lazy/layout/n;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/layout/n;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n36#2:50\n1116#3,6:51\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n*L\n27#1:50\n27#1:51,6\n*E\n"})
/* loaded from: classes.dex */
public final class d {
    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.foundation.lazy.layout.n a(@fg.l j0 j0Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-363070453);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-363070453, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridBeyondBoundsState (LazyStaggeredGridBeyondBoundsModifier.kt:25)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(j0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e(j0Var);
            tVar.E(Q);
        }
        tVar.p0();
        e eVar = (e) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return eVar;
    }
}
