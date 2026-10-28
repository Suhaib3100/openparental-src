package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.o0;

/* loaded from: classes.dex */
public interface ImageRegionDecoder {
    @o0
    Bitmap decodeRegion(@o0 Rect rect, int i5);

    @o0
    Point init(Context context, @o0 Uri uri) throws Exception;

    boolean isReady();

    void recycle();
}
