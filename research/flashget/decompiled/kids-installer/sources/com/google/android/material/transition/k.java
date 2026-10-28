package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.o0;
import androidx.transition.PathMotion;

/* compiled from: MaterialArcMotion.java */
/* loaded from: classes3.dex */
public final class k extends PathMotion {
    private static PointF b(float f6, float f7, float f8, float f9) {
        return f7 > f9 ? new PointF(f8, f7) : new PointF(f6, f9);
    }

    @Override // androidx.transition.PathMotion
    @o0
    public Path a(float f6, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(f6, f7);
        PointF b6 = b(f6, f7, f8, f9);
        path.quadTo(b6.x, b6.y, f8, f9);
        return path;
    }
}
