package androidx.core.content.res;

import androidx.annotation.o0;
import androidx.compose.animation.z0;
import androidx.compose.ui.graphics.x4;
import com.google.firebase.remoteconfig.p;

/* compiled from: ViewingConditions.java */
/* loaded from: classes3.dex */
final class o {

    /* renamed from: k, reason: collision with root package name */
    static final o f26153k = k(b.f26104c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f26154a;

    /* renamed from: b, reason: collision with root package name */
    private final float f26155b;

    /* renamed from: c, reason: collision with root package name */
    private final float f26156c;

    /* renamed from: d, reason: collision with root package name */
    private final float f26157d;

    /* renamed from: e, reason: collision with root package name */
    private final float f26158e;

    /* renamed from: f, reason: collision with root package name */
    private final float f26159f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f26160g;

    /* renamed from: h, reason: collision with root package name */
    private final float f26161h;

    /* renamed from: i, reason: collision with root package name */
    private final float f26162i;

    /* renamed from: j, reason: collision with root package name */
    private final float f26163j;

    private o(float f4, float f5, float f6, float f7, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f26159f = f4;
        this.f26154a = f5;
        this.f26155b = f6;
        this.f26156c = f7;
        this.f26157d = f10;
        this.f26158e = f11;
        this.f26160g = fArr;
        this.f26161h = f12;
        this.f26162i = f13;
        this.f26163j = f14;
    }

    @o0
    static o k(@o0 float[] fArr, float f4, float f5, float f6, boolean z4) {
        float[][] fArr2 = b.f26102a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f7;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f7);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f7 * fArr5[0]);
        float f17 = (f6 / 10.0f) + 0.8f;
        float d5 = ((double) f17) >= 0.9d ? b.d(0.59f, 0.69f, (f17 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f17 - 0.8f) * 10.0f);
        float a5 = z4 ? 1.0f : x4.a((float) Math.exp(((-f4) - 42.0f) / 92.0f), 0.2777778f, 1.0f, f17);
        double d6 = a5;
        if (d6 > 1.0d) {
            a5 = 1.0f;
        } else if (d6 < p.f60679p) {
            a5 = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * a5) + 1.0f) - a5, (((100.0f / f15) * a5) + 1.0f) - a5, (((100.0f / f16) * a5) + 1.0f) - a5};
        float f18 = 1.0f / ((5.0f * f4) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(f4 * 5.0d))) + (f19 * f4);
        float h4 = b.h(f5) / fArr[1];
        double d7 = h4;
        float sqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        return new o(h4, z0.a(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow), pow, pow, d5, f17, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    float a() {
        return this.f26154a;
    }

    float b() {
        return this.f26157d;
    }

    float c() {
        return this.f26161h;
    }

    float d() {
        return this.f26162i;
    }

    float e() {
        return this.f26159f;
    }

    float f() {
        return this.f26155b;
    }

    float g() {
        return this.f26158e;
    }

    float h() {
        return this.f26156c;
    }

    @o0
    float[] i() {
        return this.f26160g;
    }

    float j() {
        return this.f26163j;
    }
}
