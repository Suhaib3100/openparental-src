package androidx.compose.animation;

import kotlin.Metadata;

/* compiled from: FlingCalculator.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"", "friction", "density", "c", "(FF)F", "a", "F", "GravityEarth", "b", "InchesPerMeter", "DecelerationRate", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f3238a = 9.80665f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f3239b = 39.37f;

    /* renamed from: c, reason: collision with root package name */
    private static final float f3240c = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(float f4, float f5) {
        return f5 * 386.0878f * 160.0f * f4;
    }
}
