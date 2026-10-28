package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: BitmapThumbnailImageViewTarget.java */
/* loaded from: classes4.dex */
public class d extends q<Bitmap> {
    public d(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.q
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Drawable x(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f12093p).getResources(), bitmap);
    }

    @Deprecated
    public d(ImageView imageView, boolean z5) {
        super(imageView, z5);
    }
}
