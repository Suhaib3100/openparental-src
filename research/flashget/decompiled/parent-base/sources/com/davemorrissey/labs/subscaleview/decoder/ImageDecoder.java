package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.o0;

/* loaded from: classes3.dex */
public interface ImageDecoder {
    @o0
    Bitmap decode(Context context, @o0 Uri uri) throws Exception;
}
