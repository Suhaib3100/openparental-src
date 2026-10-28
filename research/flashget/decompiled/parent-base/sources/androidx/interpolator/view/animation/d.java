package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
import androidx.compose.material3.f4;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes3.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f30123a;

    /* renamed from: b, reason: collision with root package name */
    private final float f30124b;

    protected d(float[] fArr) {
        this.f30123a = fArr;
        this.f30124b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f30123a;
        int min = Math.min((int) ((fArr.length - 1) * f4), fArr.length - 2);
        float f5 = this.f30124b;
        float a5 = f4.a(min, f5, f4, f5);
        float[] fArr2 = this.f30123a;
        float f6 = fArr2[min];
        return androidx.appcompat.graphics.drawable.d.a(fArr2[min + 1], f6, a5, f6);
    }
}
