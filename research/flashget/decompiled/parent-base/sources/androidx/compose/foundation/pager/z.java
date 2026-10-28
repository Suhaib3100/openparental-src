package androidx.compose.foundation.pager;

import androidx.compose.foundation.pager.c;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PagerSemantics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/c0;", "state", "", "reverseScrolling", "isVertical", "Landroidx/compose/foundation/lazy/layout/g0;", "a", "(Landroidx/compose/foundation/pager/c0;ZZLandroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/layout/g0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSemantics.kt\nandroidx/compose/foundation/pager/PagerSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,35:1\n67#2,3:36\n66#2:39\n1116#3,6:40\n*S KotlinDebug\n*F\n+ 1 PagerSemantics.kt\nandroidx/compose/foundation/pager/PagerSemanticsKt\n*L\n31#1:36,3\n31#1:39\n31#1:40,6\n*E\n"})
/* loaded from: classes.dex */
public final class z {
    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.foundation.lazy.layout.g0 a(@fg.l c0 c0Var, boolean z4, boolean z5, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(352210115);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(352210115, i4, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:29)");
        }
        Boolean valueOf = Boolean.valueOf(z4);
        Boolean valueOf2 = Boolean.valueOf(z5);
        tVar.P(1618982084);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(c0Var) | tVar.q0(valueOf2);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new c.a(c0Var, z5);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.foundation.lazy.layout.g0 g0Var = (androidx.compose.foundation.lazy.layout.g0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g0Var;
    }
}
