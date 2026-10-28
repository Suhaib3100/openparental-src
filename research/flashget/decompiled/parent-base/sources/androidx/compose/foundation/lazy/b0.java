package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.e;
import androidx.compose.foundation.lazy.layout.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyListSemantics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/c0;", "state", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/g0;", "a", "(Landroidx/compose/foundation/lazy/c0;ZLandroidx/compose/runtime/t;I)Landroidx/compose/foundation/lazy/layout/g0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,32:1\n50#2:33\n49#2:34\n1116#3,6:35\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:33\n28#1:34\n28#1:35,6\n*E\n"})
/* loaded from: classes.dex */
public final class b0 {
    @fg.l
    @androidx.compose.runtime.i
    public static final g0 a(@fg.l c0 c0Var, boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(596174919);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(596174919, i4, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        Boolean valueOf = Boolean.valueOf(z4);
        tVar.P(511388516);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(c0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e.a(c0Var, z4);
            tVar.E(Q);
        }
        tVar.p0();
        g0 g0Var = (g0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g0Var;
    }
}
