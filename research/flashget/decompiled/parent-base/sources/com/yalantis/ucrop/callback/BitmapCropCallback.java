package com.yalantis.ucrop.callback;

import android.net.Uri;
import androidx.annotation.o0;

/* loaded from: classes7.dex */
public interface BitmapCropCallback {
    void onBitmapCropped(@o0 Uri uri, int i4, int i5, int i6, int i7);

    void onCropFailure(@o0 Throwable th);
}
