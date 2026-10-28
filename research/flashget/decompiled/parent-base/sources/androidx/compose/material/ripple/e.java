package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.x;
import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.platform.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: Ripple.android.kt */
@x4
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\rJF\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ripple/e;", "Landroidx/compose/material/ripple/g;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/graphics/d2;", "color", "<init>", "(ZFLandroidx/compose/runtime/b5;Lkotlin/jvm/internal/w;)V", "Landroid/view/ViewGroup;", "c", "(Landroidx/compose/runtime/t;I)Landroid/view/ViewGroup;", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/material/ripple/h;", "rippleAlpha", "Landroidx/compose/material/ripple/o;", "b", "(Landroidx/compose/foundation/interaction/i;ZFLandroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;Landroidx/compose/runtime/t;I)Landroidx/compose/material/ripple/o;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,263:1\n50#2:264\n49#2:265\n67#2,3:272\n66#2:275\n1116#3,6:266\n1116#3,6:276\n74#4:282\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n*L\n68#1:264\n68#1:265\n73#1:272,3\n73#1:275\n68#1:266,6\n73#1:276,6\n88#1:282\n*E\n"})
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f9303e = 0;

    private e(boolean z4, float f4, b5<d2> b5Var) {
        super(z4, f4, b5Var, null);
    }

    @androidx.compose.runtime.i
    private final ViewGroup c(androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1737891121);
        if (x.b0()) {
            x.r0(-1737891121, i4, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:86)");
        }
        Object x4 = tVar.x(o0.k());
        while (!(x4 instanceof ViewGroup)) {
            ViewParent parent = ((View) x4).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + x4 + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            x4 = parent;
        }
        ViewGroup viewGroup = (ViewGroup) x4;
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return viewGroup;
    }

    @Override // androidx.compose.material.ripple.g
    @fg.l
    @androidx.compose.runtime.i
    public o b(@fg.l androidx.compose.foundation.interaction.i iVar, boolean z4, float f4, @fg.l b5<d2> b5Var, @fg.l b5<h> b5Var2, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(331259447);
        if (x.b0()) {
            x.r0(331259447, i4, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:63)");
        }
        ViewGroup c5 = c(tVar, (i4 >> 15) & 14);
        tVar.P(1643267293);
        if (c5.isInEditMode()) {
            tVar.P(511388516);
            boolean q02 = tVar.q0(iVar) | tVar.q0(this);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new c(z4, f4, b5Var, b5Var2, null);
                tVar.E(Q);
            }
            tVar.p0();
            c cVar = (c) Q;
            tVar.p0();
            if (x.b0()) {
                x.q0();
            }
            tVar.p0();
            return cVar;
        }
        tVar.p0();
        tVar.P(1618982084);
        boolean q03 = tVar.q0(iVar) | tVar.q0(this) | tVar.q0(c5);
        Object Q2 = tVar.Q();
        if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q2 = new a(z4, f4, b5Var, b5Var2, c5, null);
            tVar.E(Q2);
        }
        tVar.p0();
        a aVar = (a) Q2;
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return aVar;
    }

    public e(boolean z4, float f4, b5 b5Var, w wVar) {
        super(z4, f4, b5Var, null);
    }
}
