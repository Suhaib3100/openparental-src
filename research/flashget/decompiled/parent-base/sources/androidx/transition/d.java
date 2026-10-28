package androidx.transition;

import android.animation.TypeEvaluator;

/* compiled from: FloatArrayEvaluator.java */
/* loaded from: classes3.dex */
class d implements TypeEvaluator<float[]> {

    /* renamed from: a, reason: collision with root package name */
    private float[] f34375a;

    d(float[] fArr) {
        this.f34375a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f4, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f34375a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i4 = 0; i4 < fArr3.length; i4++) {
            float f5 = fArr[i4];
            fArr3[i4] = androidx.appcompat.graphics.drawable.d.a(fArr2[i4], f5, f4, f5);
        }
        return fArr3;
    }
}
