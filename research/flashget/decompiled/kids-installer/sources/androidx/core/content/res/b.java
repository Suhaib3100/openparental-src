package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.o0;
import androidx.core.graphics.r1;
import androidx.core.view.y1;

/* compiled from: CamUtils.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    static final float[][] f4614a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    static final float[][] f4615b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    static final float[] f4616c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    static final float[][] f4617d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private b() {
    }

    static int a(float f6) {
        if (f6 < 1.0f) {
            return y1.f5758t;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f7 = (f6 + 16.0f) / 116.0f;
        float f8 = (f6 > 8.0f ? 1 : (f6 == 8.0f ? 0 : -1)) > 0 ? f7 * f7 * f7 : f6 / 903.2963f;
        float f9 = f7 * f7 * f7;
        boolean z5 = f9 > 0.008856452f;
        float f10 = z5 ? f9 : ((f7 * 116.0f) - 16.0f) / 903.2963f;
        if (!z5) {
            f9 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f4616c;
        return r1.g(f10 * fArr[0], f8 * fArr[1], f9 * fArr[2]);
    }

    static float b(int i5) {
        return c(g(i5));
    }

    static float c(float f6) {
        float f7 = f6 / 100.0f;
        return f7 <= 0.008856452f ? f7 * 903.2963f : (((float) Math.cbrt(f7)) * 116.0f) - 16.0f;
    }

    static float d(float f6, float f7, float f8) {
        return androidx.appcompat.graphics.drawable.d.a(f7, f6, f8, f6);
    }

    static float e(int i5) {
        float f6 = i5 / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @o0
    static float[] f(int i5) {
        float e6 = e(Color.red(i5));
        float e7 = e(Color.green(i5));
        float e8 = e(Color.blue(i5));
        float[][] fArr = f4617d;
        float[] fArr2 = fArr[0];
        float f6 = (fArr2[2] * e8) + (fArr2[1] * e7) + (fArr2[0] * e6);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[2] * e8) + (fArr3[1] * e7) + (fArr3[0] * e6);
        float[] fArr4 = fArr[2];
        return new float[]{f6, f7, (e8 * fArr4[2]) + (e7 * fArr4[1]) + (e6 * fArr4[0])};
    }

    static float g(int i5) {
        float e6 = e(Color.red(i5));
        float e7 = e(Color.green(i5));
        float e8 = e(Color.blue(i5));
        float[] fArr = f4617d[1];
        return (e8 * fArr[2]) + (e7 * fArr[1]) + (e6 * fArr[0]);
    }

    static float h(float f6) {
        return (f6 > 8.0f ? (float) Math.pow((f6 + 16.0d) / 116.0d, 3.0d) : f6 / 903.2963f) * 100.0f;
    }
}
