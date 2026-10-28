package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aC\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/lazy/layout/n;", "state", "Landroidx/compose/foundation/lazy/layout/k;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/foundation/gestures/j0;", "orientation", "enabled", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/layout/n;Landroidx/compose/foundation/lazy/layout/k;ZLandroidx/compose/ui/unit/w;Landroidx/compose/foundation/gestures/j0;ZLandroidx/compose/runtime/t;I)Landroidx/compose/ui/q;", "", "c", "()Ljava/lang/Void;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayoutBeyondBoundsModifierLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsModifierLocal.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n83#2,3:177\n1116#3,6:180\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsModifierLocal.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt\n*L\n55#1:177,3\n55#1:180,6\n*E\n"})
/* loaded from: classes.dex */
public final class m {
    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l n nVar, @fg.l k kVar, boolean z4, @fg.l androidx.compose.ui.unit.w wVar, @fg.l androidx.compose.foundation.gestures.j0 j0Var, boolean z5, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1331498025);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1331498025, i4, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z5) {
            Object[] objArr = {nVar, kVar, Boolean.valueOf(z4), wVar, j0Var};
            tVar.P(-568225417);
            boolean z6 = false;
            for (int i5 = 0; i5 < 5; i5++) {
                z6 |= tVar.q0(objArr[i5]);
            }
            Object Q = tVar.Q();
            if (z6 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new l(nVar, kVar, z4, wVar, j0Var);
                tVar.E(Q);
            }
            tVar.p0();
            qVar = qVar.w3((androidx.compose.ui.q) Q);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
