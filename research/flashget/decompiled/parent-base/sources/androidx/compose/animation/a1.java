package androidx.compose.animation;

import kotlin.Metadata;

/* compiled from: SplineBasedDecay.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "Lkotlin/k2;", "b", "([F[FI)V", "T", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/animation/core/z;", "c", "(Landroidx/compose/ui/unit/d;)Landroidx/compose/animation/core/z;", "", "a", "F", "Inflection", "StartTension", "EndTension", "d", "P1", "e", "P2", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f2504a = 0.35f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f2505b = 0.5f;

    /* renamed from: c, reason: collision with root package name */
    private static final float f2506c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private static final float f2507d = 0.175f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f2508e = 0.35000002f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i4) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i5 = 0; i5 < i4; i5++) {
            float f16 = i5 / i4;
            float f17 = 1.0f;
            while (true) {
                f4 = ((f17 - f14) / 2.0f) + f14;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float a5 = z0.a(f4, f2508e, f5 * f2507d, f6) + f7;
                if (Math.abs(a5 - f16) < 1.0E-5d) {
                    break;
                } else if (a5 > f16) {
                    f17 = f4;
                } else {
                    f14 = f4;
                }
            }
            float f18 = 0.5f;
            fArr[i5] = (((f5 * 0.5f) + f4) * f6) + f7;
            float f19 = 1.0f;
            while (true) {
                f10 = ((f19 - f15) / 2.0f) + f15;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float a6 = z0.a(f11, f18, f10, f12) + f13;
                if (Math.abs(a6 - f16) >= 1.0E-5d) {
                    if (a6 > f16) {
                        f19 = f10;
                    } else {
                        f15 = f10;
                    }
                    f18 = 0.5f;
                }
            }
            fArr2[i5] = (((f10 * f2508e) + (f11 * f2507d)) * f12) + f13;
        }
        fArr2[i4] = 1.0f;
        fArr[i4] = 1.0f;
    }

    @fg.l
    public static final <T> androidx.compose.animation.core.z<T> c(@fg.l androidx.compose.ui.unit.d dVar) {
        return androidx.compose.animation.core.b0.e(new b1(dVar));
    }
}
