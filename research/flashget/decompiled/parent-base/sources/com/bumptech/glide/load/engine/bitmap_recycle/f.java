package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.o0;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes3.dex */
public class f implements e {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long a() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b(int i4) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void c() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void d(float f4) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @o0
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i5, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @o0
    public Bitmap g(int i4, int i5, Bitmap.Config config) {
        return f(i4, i5, config);
    }
}
