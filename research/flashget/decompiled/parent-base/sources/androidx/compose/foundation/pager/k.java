package androidx.compose.foundation.pager;

import androidx.compose.animation.c1;
import androidx.compose.animation.core.m0;
import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.pager.m;
import androidx.compose.foundation.z0;
import androidx.compose.ui.platform.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Pager.kt */
@z0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0003\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/pager/k;", "", "<init>", "()V", "Landroidx/compose/foundation/pager/c0;", "state", "Landroidx/compose/foundation/pager/a0;", "pagerSnapDistance", "Landroidx/compose/animation/core/k;", "", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/z;", "highVelocityAnimationSpec", "snapAnimationSpec", "snapPositionalThreshold", "Landroidx/compose/foundation/gestures/snapping/h;", "a", "(Landroidx/compose/foundation/pager/c0;Landroidx/compose/foundation/pager/a0;Landroidx/compose/animation/core/k;Landroidx/compose/animation/core/z;Landroidx/compose/animation/core/k;FLandroidx/compose/runtime/t;II)Landroidx/compose/foundation/gestures/snapping/h;", "Landroidx/compose/ui/unit/h;", "snapVelocityThreshold", "b", "(Landroidx/compose/foundation/pager/c0;Landroidx/compose/foundation/pager/a0;Landroidx/compose/animation/core/k;Landroidx/compose/animation/core/z;Landroidx/compose/animation/core/k;FFLandroidx/compose/runtime/t;II)Landroidx/compose/foundation/gestures/snapping/h;", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/ui/input/nestedscroll/a;", "d", "(Landroidx/compose/foundation/pager/c0;Landroidx/compose/foundation/gestures/j0;)Landroidx/compose/ui/input/nestedscroll/a;", "Landroidx/compose/animation/core/k;", "c", "()Landroidx/compose/animation/core/k;", "LowVelocityAnimationSpec", "", "I", "BeyondBoundsPageCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,967:1\n74#2:968\n83#3,3:969\n1116#4,6:972\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n354#1:968\n355#1:969,3\n355#1:972,6\n*E\n"})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int BeyondBoundsPageCount = 0;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k f6803a = new k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.animation.core.k<Float> LowVelocityAnimationSpec = androidx.compose.animation.core.l.r(500, 0, m0.e(), 2, null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f6806d = 8;

    private k() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.foundation.gestures.snapping.h a(@fg.l c0 c0Var, @fg.m a0 a0Var, @fg.m androidx.compose.animation.core.k<Float> kVar, @fg.m androidx.compose.animation.core.z<Float> zVar, @fg.m androidx.compose.animation.core.k<Float> kVar2, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-194065136);
        a0 a5 = (i5 & 2) != 0 ? a0.INSTANCE.a(1) : a0Var;
        androidx.compose.animation.core.k<Float> kVar3 = (i5 & 4) != 0 ? LowVelocityAnimationSpec : kVar;
        androidx.compose.animation.core.z<Float> b5 = (i5 & 8) != 0 ? c1.b(tVar, 0) : zVar;
        androidx.compose.animation.core.k<Float> p4 = (i5 & 16) != 0 ? androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null) : kVar2;
        float f5 = (i5 & 32) != 0 ? 0.5f : f4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-194065136, i4, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:348)");
        }
        if (0.0f > f5 || f5 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f5).toString());
        }
        Object[] objArr = {c0Var, kVar3, b5, p4, a5, (androidx.compose.ui.unit.d) tVar.x(h1.i())};
        tVar.P(-568225417);
        boolean z4 = false;
        for (int i6 = 0; i6 < 6; i6++) {
            z4 |= tVar.q0(objArr[i6]);
        }
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            androidx.compose.foundation.gestures.snapping.h hVar = new androidx.compose.foundation.gestures.snapping.h(new m.b(c0Var, f5, b5, a5), kVar3, b5, p4);
            tVar.E(hVar);
            Q = hVar;
        }
        tVar.p0();
        androidx.compose.foundation.gestures.snapping.h hVar2 = (androidx.compose.foundation.gestures.snapping.h) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return hVar2;
    }

    @fg.l
    @kotlin.k(message = "Please use the overload without snapVelocityThreshold. For Pagerthe functionalities provided by snapVelocityThreshold were already being provided byother APIS.")
    @androidx.compose.runtime.i
    public final androidx.compose.foundation.gestures.snapping.h b(@fg.l c0 c0Var, @fg.m a0 a0Var, @fg.m androidx.compose.animation.core.k<Float> kVar, @fg.m androidx.compose.animation.core.z<Float> zVar, @fg.m androidx.compose.animation.core.k<Float> kVar2, float f4, float f5, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-705378306);
        a0 a5 = (i5 & 2) != 0 ? a0.INSTANCE.a(1) : a0Var;
        androidx.compose.animation.core.k<Float> r4 = (i5 & 4) != 0 ? androidx.compose.animation.core.l.r(500, 0, m0.e(), 2, null) : kVar;
        androidx.compose.animation.core.z<Float> b5 = (i5 & 8) != 0 ? c1.b(tVar, 0) : zVar;
        androidx.compose.animation.core.k<Float> p4 = (i5 & 16) != 0 ? androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null) : kVar2;
        if ((i5 & 32) != 0) {
            androidx.compose.foundation.gestures.snapping.i.p();
        }
        float f6 = (i5 & 64) != 0 ? 0.5f : f5;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-705378306, i4, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:470)");
        }
        androidx.compose.foundation.gestures.snapping.h a6 = a(c0Var, a5, r4, b5, p4, f6, tVar, (i4 & 14) | 2134528 | (i4 & 112) | ((i4 >> 3) & 458752), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a6;
    }

    @fg.l
    public final androidx.compose.animation.core.k<Float> c() {
        return LowVelocityAnimationSpec;
    }

    @fg.l
    public final androidx.compose.ui.input.nestedscroll.a d(@fg.l c0 state, @fg.l j0 orientation) {
        return new a(state, orientation);
    }
}
