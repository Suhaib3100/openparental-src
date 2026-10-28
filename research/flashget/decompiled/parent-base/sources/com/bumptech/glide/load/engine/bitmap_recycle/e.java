package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.o0;

/* compiled from: BitmapPool.java */
/* loaded from: classes3.dex */
public interface e {
    long a();

    void b(int i4);

    void c();

    void d(float f4);

    void e(Bitmap bitmap);

    @o0
    Bitmap f(int i4, int i5, Bitmap.Config config);

    @o0
    Bitmap g(int i4, int i5, Bitmap.Config config);
}
