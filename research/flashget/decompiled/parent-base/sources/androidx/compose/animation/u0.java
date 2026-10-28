package androidx.compose.animation;

import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.y1;
import androidx.compose.runtime.b5;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SingleValueAnimation.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/d2;", "targetValue", "Landroidx/compose/animation/core/k;", "animationSpec", "", "label", "Lkotlin/Function1;", "Lkotlin/k2;", "finishedListener", "Landroidx/compose/runtime/b5;", "c", "(JLandroidx/compose/animation/core/k;Ljava/lang/String;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "b", "(JLandroidx/compose/animation/core/k;Lld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "initialValue", "Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/r;", "a", "(J)Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/y1;", "Landroidx/compose/animation/core/y1;", "colorDefaultSpring", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,111:1\n36#2:112\n1116#3,6:113\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:112\n63#1:113,6\n*E\n"})
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final y1<d2> f3366a = androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);

    @fg.l
    public static final androidx.compose.animation.core.b<d2, androidx.compose.animation.core.r> a(long j4) {
        return new androidx.compose.animation.core.b<>(d2.n(j4), w.a(d2.INSTANCE).invoke(d2.E(j4)), null, null, 12, null);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 b(long j4, androidx.compose.animation.core.k kVar, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1942442407);
        if ((i5 & 2) != 0) {
            kVar = f3366a;
        }
        androidx.compose.animation.core.k kVar2 = kVar;
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        ld.l lVar2 = lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1942442407, i4, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:79)");
        }
        b5<d2> c5 = c(j4, kVar2, null, lVar2, tVar, (i4 & 14) | 64 | ((i4 << 3) & 7168), 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<d2> c(long j4, @fg.m androidx.compose.animation.core.k<d2> kVar, @fg.m String str, @fg.m ld.l<? super d2, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-451899108);
        androidx.compose.animation.core.k<d2> kVar2 = (i5 & 2) != 0 ? f3366a : kVar;
        String str2 = (i5 & 4) != 0 ? "ColorAnimation" : str;
        ld.l<? super d2, k2> lVar2 = (i5 & 8) != 0 ? null : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-451899108, i4, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        androidx.compose.ui.graphics.colorspace.c E = d2.E(j4);
        tVar.P(1157296644);
        boolean q02 = tVar.q0(E);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = (i2) w.a(d2.INSTANCE).invoke(d2.E(j4));
            tVar.E(Q);
        }
        tVar.p0();
        int i6 = i4 << 6;
        b5<d2> s4 = androidx.compose.animation.core.d.s(d2.n(j4), (i2) Q, kVar2, null, str2, lVar2, tVar, (i4 & 14) | 576 | (57344 & i6) | (i6 & 458752), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }
}
