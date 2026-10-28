package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: FloatDecayAnimationSpec.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/animation/core/r0;", "", "startValue", "startVelocity", "Landroidx/compose/animation/core/e;", "Landroidx/compose/animation/core/o;", "a", "(Landroidx/compose/animation/core/r0;FF)Landroidx/compose/animation/core/e;", "F", "ExponentialDecayFriction", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f2887a = -4.2f;

    @fg.l
    public static final e<Float, o> a(@fg.l r0 r0Var, float f4, float f5) {
        return h.a(r0Var, f4, f5);
    }

    public static e b(r0 r0Var, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        return h.a(r0Var, f4, f5);
    }
}
