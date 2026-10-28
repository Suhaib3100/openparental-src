package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.o0;

/* compiled from: MatrixEvaluator.java */
/* loaded from: classes2.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f12788a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f12789b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f12790c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f6, @o0 Matrix matrix, @o0 Matrix matrix2) {
        matrix.getValues(this.f12788a);
        matrix2.getValues(this.f12789b);
        for (int i5 = 0; i5 < 9; i5++) {
            float[] fArr = this.f12789b;
            float f7 = fArr[i5];
            float f8 = this.f12788a[i5];
            fArr[i5] = androidx.appcompat.graphics.drawable.d.a(f7, f8, f6, f8);
        }
        this.f12790c.setValues(this.f12789b);
        return this.f12790c;
    }
}
