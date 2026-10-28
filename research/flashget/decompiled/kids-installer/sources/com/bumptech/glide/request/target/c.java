package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: BitmapImageViewTarget.java */
/* loaded from: classes4.dex */
public class c extends j<Bitmap> {
    public c(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void v(Bitmap bitmap) {
        ((ImageView) this.f12093p).setImageBitmap(bitmap);
    }

    @Deprecated
    public c(ImageView imageView, boolean z5) {
        super(imageView, z5);
    }
}
