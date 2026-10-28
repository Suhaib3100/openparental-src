package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.o0;

/* compiled from: MatrixEvaluator.java */
/* loaded from: classes6.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f52476a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f52477b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f52478c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f4, @o0 Matrix matrix, @o0 Matrix matrix2) {
        matrix.getValues(this.f52476a);
        matrix2.getValues(this.f52477b);
        for (int i4 = 0; i4 < 9; i4++) {
            float[] fArr = this.f52477b;
            float f5 = fArr[i4];
            float f6 = this.f52476a[i4];
            fArr[i4] = androidx.appcompat.graphics.drawable.d.a(f5, f6, f4, f6);
        }
        this.f52478c.setValues(this.f52477b);
        return this.f52478c;
    }
}
