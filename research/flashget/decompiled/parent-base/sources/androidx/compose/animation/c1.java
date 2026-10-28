package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"T", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/animation/core/z;", "c", "(Landroidx/compose/ui/unit/d;)Landroidx/compose/animation/core/z;", "b", "(Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/z;", "", "a", "F", "()F", "platformFlingScrollFriction", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSplineBasedFloatDecayAnimationSpec.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n74#2:50\n36#3:51\n1116#4,6:52\n*S KotlinDebug\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n*L\n44#1:50\n45#1:51\n45#1:52,6\n*E\n"})
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f2525a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f2525a;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final <T> androidx.compose.animation.core.z<T> b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(904445851);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(904445851, i4, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(h1.i());
        Float valueOf = Float.valueOf(dVar.getDensity());
        tVar.P(1157296644);
        boolean q02 = tVar.q0(valueOf);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = androidx.compose.animation.core.b0.e(new b1(dVar));
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.animation.core.z<T> zVar = (androidx.compose.animation.core.z) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return zVar;
    }
}
