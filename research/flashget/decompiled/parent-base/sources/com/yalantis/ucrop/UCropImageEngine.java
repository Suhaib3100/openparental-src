package com.yalantis.ucrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public interface UCropImageEngine {

    public interface OnCallbackListener<T> {
        void onCall(T t4);
    }

    void loadImage(Context context, Uri uri, int i4, int i5, OnCallbackListener<Bitmap> onCallbackListener);

    void loadImage(Context context, String str, ImageView imageView);
}
