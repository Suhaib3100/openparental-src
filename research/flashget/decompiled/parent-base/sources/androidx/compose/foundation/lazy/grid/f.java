package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyGridBeyondBoundsModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/k0;", "state", "Landroidx/compose/foundation/lazy/layout/n;", "a", "(Landroidx/compose/foundation/lazy/grid/k0;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/layout/n;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,47:1\n36#2:48\n1116#3,6:49\n*S KotlinDebug\n*F\n+ 1 LazyGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt\n*L\n25#1:48\n25#1:49,6\n*E\n"})
/* loaded from: classes.dex */
public final class f {
    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.foundation.lazy.layout.n a(@fg.l k0 k0Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(2004349821);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2004349821, i4, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:23)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(k0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new g(k0Var);
            tVar.E(Q);
        }
        tVar.p0();
        g gVar = (g) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return gVar;
    }
}
