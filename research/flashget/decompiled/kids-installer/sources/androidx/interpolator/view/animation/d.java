package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f8389a;

    /* renamed from: b, reason: collision with root package name */
    private final float f8390b;

    protected d(float[] fArr) {
        this.f8389a = fArr;
        this.f8390b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f8389a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f7 = this.f8390b;
        float f8 = (f6 - (min * f7)) / f7;
        float[] fArr2 = this.f8389a;
        float f9 = fArr2[min];
        return androidx.appcompat.graphics.drawable.d.a(fArr2[min + 1], f9, f8, f9);
    }
}
