package com.tencent.liteav.base.util;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes7.dex */
public final class f {
    public static boolean a(float f4, float f5) {
        return Math.abs(f4 - f5) < 1.0E-6f;
    }

    public static float[] a(List<PointF> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        float[] fArr = new float[size * 2];
        for (int i4 = 0; i4 < size; i4++) {
            PointF pointF = list.get(i4);
            int i5 = i4 * 2;
            fArr[i5] = pointF.x;
            fArr[i5 + 1] = pointF.y;
        }
        return fArr;
    }
}
