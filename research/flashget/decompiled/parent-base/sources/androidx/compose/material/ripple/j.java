package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: RippleAnimation.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Li0/n;", "size", "", "b", "(J)F", "Landroidx/compose/ui/unit/d;", "", "bounded", "a", "(Landroidx/compose/ui/unit/d;ZJ)F", "Landroidx/compose/ui/unit/h;", "F", "BoundedRippleExtraRadius", "", "I", "FadeInDuration", "c", "RadiusDuration", "d", "FadeOutDuration", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,194:1\n154#2:195\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n189#1:195\n*E\n"})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final float f9350a = androidx.compose.ui.unit.h.g(10);

    /* renamed from: b, reason: collision with root package name */
    private static final int f9351b = 75;

    /* renamed from: c, reason: collision with root package name */
    private static final int f9352c = 225;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9353d = 150;

    public static final float a(@fg.l androidx.compose.ui.unit.d dVar, boolean z4, long j4) {
        float m4 = i0.f.m(i0.g.a(i0.n.t(j4), i0.n.m(j4))) / 2.0f;
        return z4 ? m4 + dVar.v5(f9350a) : m4;
    }

    public static final float b(long j4) {
        return Math.max(i0.n.t(j4), i0.n.m(j4)) * 0.3f;
    }
}
