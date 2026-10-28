package com.github.mikephil.charting.data.filter;

import android.annotation.TargetApi;
import java.util.Arrays;

/* compiled from: Approximator.java */
/* loaded from: classes5.dex */
public class a {

    /* compiled from: Approximator.java */
    /* renamed from: com.github.mikephil.charting.data.filter.a$a, reason: collision with other inner class name */
    private class C0776a {

        /* renamed from: a, reason: collision with root package name */
        private float[] f50378a;

        /* renamed from: b, reason: collision with root package name */
        private float f50379b;

        /* renamed from: c, reason: collision with root package name */
        private float f50380c;

        /* renamed from: d, reason: collision with root package name */
        private float f50381d;

        /* renamed from: e, reason: collision with root package name */
        private float f50382e;

        /* renamed from: f, reason: collision with root package name */
        private float f50383f;

        public C0776a(float f4, float f5, float f6, float f7) {
            this.f50381d = f4 - f6;
            this.f50382e = f5 - f7;
            this.f50379b = f4 * f7;
            this.f50380c = f6 * f5;
            this.f50383f = (float) Math.sqrt((r0 * r0) + (r3 * r3));
            this.f50378a = new float[]{f4, f5, f6, f7};
        }

        public float a(float f4, float f5) {
            return Math.abs((((this.f50382e * f4) - (this.f50381d * f5)) + this.f50379b) - this.f50380c) / this.f50383f;
        }

        public float[] b() {
            return this.f50378a;
        }
    }

    float[] a(float[]... fArr) {
        int i4 = 0;
        for (float[] fArr2 : fArr) {
            i4 += fArr2.length;
        }
        float[] fArr3 = new float[i4];
        int i5 = 0;
        for (float[] fArr4 : fArr) {
            for (float f4 : fArr4) {
                fArr3[i5] = f4;
                i5++;
            }
        }
        return fArr3;
    }

    @TargetApi(9)
    public float[] b(float[] fArr, float f4) {
        C0776a c0776a = new C0776a(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1]);
        float f5 = 0.0f;
        int i4 = 0;
        for (int i5 = 2; i5 < fArr.length - 2; i5 += 2) {
            float a5 = c0776a.a(fArr[i5], fArr[i5 + 1]);
            if (a5 > f5) {
                i4 = i5;
                f5 = a5;
            }
        }
        if (f5 <= f4) {
            return c0776a.b();
        }
        float[] b5 = b(Arrays.copyOfRange(fArr, 0, i4 + 2), f4);
        float[] b6 = b(Arrays.copyOfRange(fArr, i4, fArr.length), f4);
        return a(b5, Arrays.copyOfRange(b6, 2, b6.length));
    }
}
