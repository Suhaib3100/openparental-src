package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.o0;
import androidx.transition.PathMotion;

/* compiled from: MaterialArcMotion.java */
/* loaded from: classes6.dex */
public final class k extends PathMotion {
    private static PointF b(float f4, float f5, float f6, float f7) {
        return f5 > f7 ? new PointF(f6, f5) : new PointF(f4, f7);
    }

    @Override // androidx.transition.PathMotion
    @o0
    public Path a(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(f4, f5);
        PointF b5 = b(f4, f5, f6, f7);
        path.quadTo(b5.x, b5.y, f6, f7);
        return path;
    }
}
