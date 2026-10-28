package androidx.transition;

import android.animation.TypeEvaluator;

/* compiled from: FloatArrayEvaluator.java */
/* loaded from: classes.dex */
class f implements TypeEvaluator<float[]> {

    /* renamed from: a, reason: collision with root package name */
    private float[] f9877a;

    f(float[] fArr) {
        this.f9877a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f6, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f9877a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i5 = 0; i5 < fArr3.length; i5++) {
            float f7 = fArr[i5];
            fArr3[i5] = androidx.appcompat.graphics.drawable.d.a(fArr2[i5], f7, f6, f7);
        }
        return fArr3;
    }
}
