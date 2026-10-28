package androidx.core.content.res;

import androidx.annotation.o0;

/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
final class q {

    /* renamed from: k, reason: collision with root package name */
    static final q f4663k = k(b.f4616c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f4664a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4665b;

    /* renamed from: c, reason: collision with root package name */
    private final float f4666c;

    /* renamed from: d, reason: collision with root package name */
    private final float f4667d;

    /* renamed from: e, reason: collision with root package name */
    private final float f4668e;

    /* renamed from: f, reason: collision with root package name */
    private final float f4669f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f4670g;

    /* renamed from: h, reason: collision with root package name */
    private final float f4671h;

    /* renamed from: i, reason: collision with root package name */
    private final float f4672i;

    /* renamed from: j, reason: collision with root package name */
    private final float f4673j;

    private q(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f4669f = f6;
        this.f4664a = f7;
        this.f4665b = f8;
        this.f4666c = f9;
        this.f4667d = f10;
        this.f4668e = f11;
        this.f4670g = fArr;
        this.f4671h = f12;
        this.f4672i = f13;
        this.f4673j = f14;
    }

    @o0
    static q k(@o0 float[] fArr, float f6, float f7, float f8, boolean z5) {
        float f9;
        float f10;
        float[][] fArr2 = b.f4614a;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = (fArr3[1] * f13) + f12;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14;
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f11 * fArr5[0]);
        float f19 = (f8 / 10.0f) + 0.8f;
        if (f19 >= 0.9d) {
            f9 = (f19 - 0.9f) * 10.0f * 0.100000024f;
            f10 = 0.59f;
        } else {
            f9 = (f19 - 0.8f) * 10.0f * 0.065f;
            f10 = 0.525f;
        }
        float f20 = f9 + f10;
        float exp = z5 ? 1.0f : (1.0f - (((float) Math.exp(((-f6) - 42.0f) / 92.0f)) * 0.2777778f)) * f19;
        double d6 = exp;
        if (d6 > 1.0d) {
            exp = 1.0f;
        } else if (d6 < com.google.firebase.remoteconfig.p.f18289o) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp};
        float f21 = 1.0f / ((5.0f * f6) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float cbrt = (0.1f * f23 * f23 * ((float) Math.cbrt(f6 * 5.0d))) + (f22 * f6);
        float h5 = b.h(f7) / fArr[1];
        double d7 = h5;
        float sqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f18) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f17) / 100.0d, 0.42d), pow2};
        float f24 = fArr7[0];
        float f25 = fArr7[1];
        return new q(h5, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f24 * 400.0f) / (f24 + 27.13f)) * 2.0f) + ((f25 * 400.0f) / (f25 + 27.13f))) * pow, pow, pow, f20, f19, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    float a() {
        return this.f4664a;
    }

    float b() {
        return this.f4667d;
    }

    float c() {
        return this.f4671h;
    }

    float d() {
        return this.f4672i;
    }

    float e() {
        return this.f4669f;
    }

    float f() {
        return this.f4665b;
    }

    float g() {
        return this.f4668e;
    }

    float h() {
        return this.f4666c;
    }

    @o0
    float[] i() {
        return this.f4670g;
    }

    float j() {
        return this.f4673j;
    }
}
