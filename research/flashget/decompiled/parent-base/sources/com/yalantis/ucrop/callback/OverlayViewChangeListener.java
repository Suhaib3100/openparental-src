package com.yalantis.ucrop.callback;

import android.graphics.RectF;

/* loaded from: classes7.dex */
public interface OverlayViewChangeListener {
    void onCropRectUpdated(RectF rectF);

    void postTranslate(float f4, float f5);
}
