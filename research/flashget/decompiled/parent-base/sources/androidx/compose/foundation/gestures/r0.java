package androidx.compose.foundation.gestures;

import androidx.compose.foundation.i2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Scrollable.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/r0;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/e0;", "b", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/gestures/e0;", "Landroidx/compose/foundation/i2;", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/i2;", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "reverseScrolling", "d", "(Landroidx/compose/ui/unit/w;Landroidx/compose/foundation/gestures/j0;Z)Z", "Landroidx/compose/foundation/gestures/k;", "a", "()Landroidx/compose/foundation/gestures/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1021:1\n36#2:1022\n1116#3,6:1023\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n541#1:1022\n541#1:1023,6\n*E\n"})
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final r0 f4232a = new r0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f4233b = 0;

    private r0() {
    }

    @fg.l
    @androidx.compose.foundation.z0
    public final k a() {
        return k.INSTANCE.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @androidx.compose.runtime.i
    public final e0 b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1107739818);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1107739818, i4, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:538)");
        }
        androidx.compose.animation.core.z b5 = androidx.compose.animation.c1.b(tVar, 0);
        tVar.P(1157296644);
        boolean q02 = tVar.q0(b5);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new p(b5, null, 2, 0 == true ? 1 : 0);
            tVar.E(Q);
        }
        tVar.p0();
        p pVar = (p) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return pVar;
    }

    @fg.l
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.i
    public final i2 c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1809802212);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1809802212, i4, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:551)");
        }
        i2 b5 = androidx.compose.foundation.l.b(tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    public final boolean d(@fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l j0 orientation, boolean reverseScrolling) {
        return (layoutDirection != androidx.compose.ui.unit.w.Rtl || orientation == j0.Vertical) ? !reverseScrolling : reverseScrolling;
    }
}
