package com.airbnb.lottie.utils;

/* compiled from: GammaEvaluator.java */
/* loaded from: classes3.dex */
public class d {
    private static float a(float f4) {
        return f4 <= 0.04045f ? f4 / 12.92f : (float) Math.pow((f4 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float b(float f4) {
        return f4 <= 0.0031308f ? f4 * 12.92f : (float) ((Math.pow(f4, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(float f4, int i4, int i5) {
        if (i4 == i5) {
            return i4;
        }
        float f5 = ((i4 >> 24) & 255) / 255.0f;
        float f6 = ((i5 >> 24) & 255) / 255.0f;
        float a5 = a(((i4 >> 16) & 255) / 255.0f);
        float a6 = a(((i4 >> 8) & 255) / 255.0f);
        float a7 = a((i4 & 255) / 255.0f);
        float a8 = a(((i5 >> 16) & 255) / 255.0f);
        float a10 = a(((i5 >> 8) & 255) / 255.0f);
        float a11 = a((i5 & 255) / 255.0f);
        float a12 = androidx.appcompat.graphics.drawable.d.a(f6, f5, f4, f5);
        float a13 = androidx.appcompat.graphics.drawable.d.a(a8, a5, f4, a5);
        float a14 = androidx.appcompat.graphics.drawable.d.a(a10, a6, f4, a6);
        float a15 = androidx.appcompat.graphics.drawable.d.a(a11, a7, f4, a7);
        float b5 = b(a13) * 255.0f;
        float b6 = b(a14) * 255.0f;
        return Math.round(b(a15) * 255.0f) | (Math.round(b5) << 16) | (Math.round(a12 * 255.0f) << 24) | (Math.round(b6) << 8);
    }
}
