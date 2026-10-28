package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: Easing.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\nJ\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/x;", "Landroidx/compose/animation/core/d0;", "", "a", "b", "c", "d", "<init>", "(FFFF)V", "m", "(FFF)F", "fraction", "(F)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x implements d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2973e = 0;
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public x(float f4, float f5, float f6, float f7) {
        this.a = f4;
        this.b = f5;
        this.c = f6;
        this.d = f7;
        if (Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) {
            throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f4 + ", " + f5 + ", " + f6 + ", " + f7 + '.').toString());
        }
    }

    private final float b(float a5, float b5, float m4) {
        float f4 = 3;
        float f5 = 1 - m4;
        return (m4 * m4 * m4) + (f4 * b5 * f5 * m4 * m4) + (a5 * f4 * f5 * f5 * m4);
    }

    @Override // androidx.compose.animation.core.d0
    public float a(float fraction) {
        float f4 = 0.0f;
        if (fraction > 0.0f) {
            float f5 = 1.0f;
            if (fraction < 1.0f) {
                while (true) {
                    float f6 = (f4 + f5) / 2;
                    float b5 = b(this.a, this.c, f6);
                    if (Math.abs(fraction - b5) < 0.001f) {
                        return b(this.b, this.d, f6);
                    }
                    if (b5 < fraction) {
                        f4 = f6;
                    } else {
                        f5 = f6;
                    }
                }
            }
        }
        return fraction;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof x) {
            x xVar = (x) other;
            if (this.a == xVar.a && this.b == xVar.b && this.c == xVar.c && this.d == xVar.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.d) + androidx.compose.animation.l0.a(this.c, androidx.compose.animation.l0.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
