package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PagerBeyondBoundsModifier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/pager/c0;", "state", "", "beyondBoundsPageCount", "Landroidx/compose/foundation/lazy/layout/n;", "a", "(Landroidx/compose/foundation/pager/c0;ILandroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/layout/n;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n50#2:56\n49#2:57\n1116#3,6:58\n*S KotlinDebug\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n*L\n29#1:56\n29#1:57\n29#1:58,6\n*E\n"})
/* loaded from: classes.dex */
public final class h {
    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.foundation.lazy.layout.n a(@fg.l c0 c0Var, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
        tVar.P(373558254);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(373558254, i5, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:27)");
        }
        Integer valueOf = Integer.valueOf(i4);
        tVar.P(511388516);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(c0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new i(c0Var, i4);
            tVar.E(Q);
        }
        tVar.p0();
        i iVar = (i) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return iVar;
    }
}
