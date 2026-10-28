package androidx.compose.material.ripple;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.x;
import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: CommonRipple.kt */
@x4
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ripple/b;", "Landroidx/compose/material/ripple/g;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/graphics/d2;", "color", "<init>", "(ZFLandroidx/compose/runtime/b5;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/material/ripple/h;", "rippleAlpha", "Landroidx/compose/material/ripple/o;", "b", "(Landroidx/compose/foundation/interaction/i;ZFLandroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;Landroidx/compose/runtime/t;I)Landroidx/compose/material/ripple/o;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,119:1\n50#2:120\n49#2:121\n1116#3,6:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n*L\n54#1:120\n54#1:121\n54#1:122,6\n*E\n"})
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f9291e = 0;

    private b(boolean z4, float f4, b5<d2> b5Var) {
        super(z4, f4, b5Var, null);
    }

    @Override // androidx.compose.material.ripple.g
    @fg.l
    @androidx.compose.runtime.i
    public o b(@fg.l androidx.compose.foundation.interaction.i iVar, boolean z4, float f4, @fg.l b5<d2> b5Var, @fg.l b5<h> b5Var2, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1768051227);
        if (x.b0()) {
            x.r0(-1768051227, i4, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:52)");
        }
        tVar.P(511388516);
        boolean q02 = tVar.q0(iVar) | tVar.q0(this);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new c(z4, f4, b5Var, b5Var2, null);
            tVar.E(Q);
        }
        tVar.p0();
        c cVar = (c) Q;
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return cVar;
    }

    public b(boolean z4, float f4, b5 b5Var, w wVar) {
        super(z4, f4, b5Var, null);
    }
}
