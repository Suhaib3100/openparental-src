package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.q0;

/* compiled from: LruPoolStrategy.java */
/* loaded from: classes.dex */
interface l {
    String a(int i5, int i6, Bitmap.Config config);

    int b(Bitmap bitmap);

    String c(Bitmap bitmap);

    void d(Bitmap bitmap);

    @q0
    Bitmap f(int i5, int i6, Bitmap.Config config);

    @q0
    Bitmap removeLast();
}
