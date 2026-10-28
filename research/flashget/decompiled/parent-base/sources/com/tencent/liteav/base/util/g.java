package com.tencent.liteav.base.util;

/* loaded from: classes7.dex */
public final class g {
    public static float a(float f4, float f5) {
        if (f4 < f5) {
            return f5;
        }
        if (f4 > 1.0f) {
            return 1.0f;
        }
        return f4;
    }

    public static int a(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }
}
