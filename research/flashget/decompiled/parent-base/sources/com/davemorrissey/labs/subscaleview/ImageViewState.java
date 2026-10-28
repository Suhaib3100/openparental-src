package com.davemorrissey.labs.subscaleview;

import android.graphics.PointF;
import androidx.annotation.o0;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ImageViewState implements Serializable {
    private final float centerX;
    private final float centerY;
    private final int orientation;
    private final float scale;

    public ImageViewState(float f4, @o0 PointF pointF, int i4) {
        this.scale = f4;
        this.centerX = pointF.x;
        this.centerY = pointF.y;
        this.orientation = i4;
    }

    @o0
    public PointF getCenter() {
        return new PointF(this.centerX, this.centerY);
    }

    public int getOrientation() {
        return this.orientation;
    }

    public float getScale() {
        return this.scale;
    }
}
