package com.yalantis.ucrop.callback;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.yalantis.ucrop.model.ExifInfo;

/* loaded from: classes7.dex */
public interface BitmapLoadCallback {
    void onBitmapLoaded(@o0 Bitmap bitmap, @o0 ExifInfo exifInfo, @o0 Uri uri, @q0 Uri uri2);

    void onFailure(@o0 Exception exc);
}
