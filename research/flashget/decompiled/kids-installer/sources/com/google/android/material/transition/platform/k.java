package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: MaterialArcMotion.java */
@x0(21)
/* loaded from: classes2.dex */
public final class k extends PathMotion {
    private static PointF a(float f6, float f7, float f8, float f9) {
        return f7 > f9 ? new PointF(f8, f7) : new PointF(f6, f9);
    }

    @Override // android.transition.PathMotion
    @o0
    public Path getPath(float f6, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(f6, f7);
        PointF a6 = a(f6, f7, f8, f9);
        path.quadTo(a6.x, a6.y, f8, f9);
        return path;
    }
}
