package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.q0;

/* compiled from: LruPoolStrategy.java */
/* loaded from: classes3.dex */
interface l {
    String a(Bitmap bitmap);

    String b(int i4, int i5, Bitmap.Config config);

    int c(Bitmap bitmap);

    void e(Bitmap bitmap);

    @q0
    Bitmap f(int i4, int i5, Bitmap.Config config);

    @q0
    Bitmap removeLast();
}
