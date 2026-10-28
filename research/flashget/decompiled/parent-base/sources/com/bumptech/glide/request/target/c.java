package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: BitmapImageViewTarget.java */
/* loaded from: classes3.dex */
public class c extends j<Bitmap> {
    public c(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void u(Bitmap bitmap) {
        ((ImageView) this.f44899c).setImageBitmap(bitmap);
    }

    @Deprecated
    public c(ImageView imageView, boolean z4) {
        super(imageView, z4);
    }
}
