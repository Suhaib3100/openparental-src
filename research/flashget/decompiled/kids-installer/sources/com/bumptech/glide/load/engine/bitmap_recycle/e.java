package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.o0;

/* compiled from: BitmapPool.java */
/* loaded from: classes.dex */
public interface e {
    void a(int i5);

    void b();

    void c(float f6);

    void d(Bitmap bitmap);

    long e();

    @o0
    Bitmap f(int i5, int i6, Bitmap.Config config);

    @o0
    Bitmap g(int i5, int i6, Bitmap.Config config);
}
