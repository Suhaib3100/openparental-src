package com.yalantis.ucrop.util;

/* loaded from: classes7.dex */
public final class CubicEasing {
    public static float easeIn(float f4, float f5, float f6, float f7) {
        float f10 = f4 / f7;
        return (f6 * f10 * f10 * f10) + f5;
    }

    public static float easeInOut(float f4, float f5, float f6, float f7) {
        float f10 = f4 / (f7 / 2.0f);
        float f11 = f6 / 2.0f;
        if (f10 < 1.0f) {
            return (f11 * f10 * f10 * f10) + f5;
        }
        float f12 = f10 - 2.0f;
        return (((f12 * f12 * f12) + 2.0f) * f11) + f5;
    }

    public static float easeOut(float f4, float f5, float f6, float f7) {
        float f10 = (f4 / f7) - 1.0f;
        return (((f10 * f10 * f10) + 1.0f) * f6) + f5;
    }
}
