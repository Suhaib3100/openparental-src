package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.n;
import androidx.compose.animation.core.o;
import androidx.compose.foundation.gestures.q0;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/g;", "Landroidx/compose/foundation/gestures/snapping/b;", "", "Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/k;", "lowVelocityAnimationSpec", "<init>", "(Landroidx/compose/animation/core/k;)V", "Landroidx/compose/foundation/gestures/q0;", "scope", "offset", "velocity", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "delta", "Lkotlin/k2;", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/a;", "b", "(Landroidx/compose/foundation/gestures/q0;FFLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Landroidx/compose/animation/core/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g implements b<Float, o> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.k<Float> lowVelocityAnimationSpec;

    public g(@fg.l androidx.compose.animation.core.k<Float> kVar) {
        this.lowVelocityAnimationSpec = kVar;
    }

    @Override // androidx.compose.foundation.gestures.snapping.b
    public /* bridge */ /* synthetic */ Object a(q0 q0Var, Float f4, Float f5, ld.l<? super Float, k2> lVar, kotlin.coroutines.d<? super a<Float, o>> dVar) {
        return b(q0Var, f4.floatValue(), f5.floatValue(), lVar, dVar);
    }

    @fg.m
    public Object b(@fg.l q0 q0Var, float f4, float f5, @fg.l ld.l<? super Float, k2> lVar, @fg.l kotlin.coroutines.d<? super a<Float, o>> dVar) {
        Object h4 = i.h(q0Var, Math.signum(f5) * Math.abs(f4), f4, n.c(0.0f, f5, 0L, 0L, false, 28, null), this.lowVelocityAnimationSpec, lVar, dVar);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : (a) h4;
    }
}
