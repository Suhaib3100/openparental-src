package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: MaterialArcMotion.java */
@x0(21)
/* loaded from: classes6.dex */
public final class k extends PathMotion {
    private static PointF a(float f4, float f5, float f6, float f7) {
        return f5 > f7 ? new PointF(f6, f5) : new PointF(f4, f7);
    }

    @Override // android.transition.PathMotion
    @o0
    public Path getPath(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(f4, f5);
        PointF a5 = a(f4, f5, f6, f7);
        path.quadTo(a5.x, a5.y, f6, f7);
        return path;
    }
}
