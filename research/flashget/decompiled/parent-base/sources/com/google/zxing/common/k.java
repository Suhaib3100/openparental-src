package com.google.zxing.common;

import androidx.compose.material3.f4;

/* compiled from: PerspectiveTransform.java */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final float f62795a;

    /* renamed from: b, reason: collision with root package name */
    private final float f62796b;

    /* renamed from: c, reason: collision with root package name */
    private final float f62797c;

    /* renamed from: d, reason: collision with root package name */
    private final float f62798d;

    /* renamed from: e, reason: collision with root package name */
    private final float f62799e;

    /* renamed from: f, reason: collision with root package name */
    private final float f62800f;

    /* renamed from: g, reason: collision with root package name */
    private final float f62801g;

    /* renamed from: h, reason: collision with root package name */
    private final float f62802h;

    /* renamed from: i, reason: collision with root package name */
    private final float f62803i;

    private k(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f62795a = f4;
        this.f62796b = f7;
        this.f62797c = f12;
        this.f62798d = f5;
        this.f62799e = f10;
        this.f62800f = f13;
        this.f62801g = f6;
        this.f62802h = f11;
        this.f62803i = f14;
    }

    public static k b(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21) {
        return d(f14, f15, f16, f17, f18, f19, f20, f21).e(c(f4, f5, f6, f7, f10, f11, f12, f13));
    }

    public static k c(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13) {
        return d(f4, f5, f6, f7, f10, f11, f12, f13).a();
    }

    public static k d(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13) {
        float f14 = ((f4 - f6) + f10) - f12;
        float f15 = ((f5 - f7) + f11) - f13;
        if (f14 == 0.0f && f15 == 0.0f) {
            return new k(f6 - f4, f10 - f6, f4, f7 - f5, f11 - f7, f5, 0.0f, 0.0f, 1.0f);
        }
        float f16 = f6 - f10;
        float f17 = f12 - f10;
        float f18 = f7 - f11;
        float f19 = f13 - f11;
        float f20 = (f16 * f19) - (f17 * f18);
        float a5 = f4.a(f17, f15, f19 * f14, f20);
        float a6 = f4.a(f14, f18, f16 * f15, f20);
        return new k((a5 * f6) + (f6 - f4), (a6 * f12) + (f12 - f4), f4, (a5 * f7) + (f7 - f5), (a6 * f13) + (f13 - f5), f5, a5, a6, 1.0f);
    }

    k a() {
        float f4 = this.f62799e;
        float f5 = this.f62803i;
        float f6 = this.f62800f;
        float f7 = this.f62802h;
        float f10 = (f4 * f5) - (f6 * f7);
        float f11 = this.f62801g;
        float f12 = this.f62798d;
        float f13 = (f6 * f11) - (f12 * f5);
        float f14 = (f12 * f7) - (f4 * f11);
        float f15 = this.f62797c;
        float f16 = this.f62796b;
        float f17 = (f15 * f7) - (f16 * f5);
        float f18 = this.f62795a;
        return new k(f10, f13, f14, f17, (f5 * f18) - (f15 * f11), (f11 * f16) - (f7 * f18), (f16 * f6) - (f15 * f4), (f15 * f12) - (f6 * f18), (f18 * f4) - (f16 * f12));
    }

    k e(k kVar) {
        float f4 = this.f62795a;
        float f5 = kVar.f62795a;
        float f6 = this.f62798d;
        float f7 = kVar.f62796b;
        float f10 = this.f62801g;
        float f11 = kVar.f62797c;
        float f12 = (f6 * f7) + (f4 * f5) + (f10 * f11);
        float f13 = kVar.f62798d;
        float f14 = kVar.f62799e;
        float f15 = kVar.f62800f;
        float f16 = (f6 * f14) + (f4 * f13) + (f10 * f15);
        float f17 = kVar.f62801g;
        float f18 = kVar.f62802h;
        float f19 = kVar.f62803i;
        float f20 = f10 * f19;
        float f21 = f20 + (f6 * f18) + (f4 * f17);
        float f22 = this.f62796b;
        float f23 = this.f62799e;
        float f24 = this.f62802h;
        float f25 = (f24 * f11) + (f23 * f7) + (f22 * f5);
        float f26 = (f24 * f15) + (f23 * f14) + (f22 * f13);
        float f27 = f24 * f19;
        float f28 = f27 + (f23 * f18) + (f22 * f17);
        float f29 = this.f62797c;
        float f30 = this.f62800f;
        float f31 = (f7 * f30) + (f5 * f29);
        float f32 = this.f62803i;
        return new k(f12, f16, f21, f25, f26, f28, (f11 * f32) + f31, (f15 * f32) + (f14 * f30) + (f13 * f29), (f32 * f19) + (f30 * f18) + (f29 * f17));
    }

    public void f(float[] fArr) {
        float f4 = this.f62795a;
        float f5 = this.f62796b;
        float f6 = this.f62797c;
        float f7 = this.f62798d;
        float f10 = this.f62799e;
        float f11 = this.f62800f;
        float f12 = this.f62801g;
        float f13 = this.f62802h;
        float f14 = this.f62803i;
        int length = fArr.length - 1;
        for (int i4 = 0; i4 < length; i4 += 2) {
            float f15 = fArr[i4];
            int i5 = i4 + 1;
            float f16 = fArr[i5];
            float f17 = (f11 * f16) + (f6 * f15) + f14;
            fArr[i4] = (((f7 * f16) + (f4 * f15)) + f12) / f17;
            fArr[i5] = (((f16 * f10) + (f15 * f5)) + f13) / f17;
        }
    }

    public void g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            float f4 = fArr[i4];
            float f5 = fArr2[i4];
            float f6 = (this.f62800f * f5) + (this.f62797c * f4) + this.f62803i;
            fArr[i4] = (((this.f62798d * f5) + (this.f62795a * f4)) + this.f62801g) / f6;
            fArr2[i4] = (((this.f62799e * f5) + (this.f62796b * f4)) + this.f62802h) / f6;
        }
    }
}
