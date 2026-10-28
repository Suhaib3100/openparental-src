package com.nostra13.universalimageloader.core.imageaware;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.assist.h;

/* compiled from: ImageViewAware.java */
/* loaded from: classes6.dex */
public class b extends d {
    public b(ImageView imageView) {
        super(imageView, true);
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.d, com.nostra13.universalimageloader.core.imageaware.a
    public h e() {
        ImageView imageView = (ImageView) this.f70513a.get();
        return imageView != null ? h.fromImageView(imageView) : h.CROP;
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.d
    protected void g(Bitmap bitmap, View view) {
        ((ImageView) view).setImageBitmap(bitmap);
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.d, com.nostra13.universalimageloader.core.imageaware.a
    public int getHeight() {
        ImageView imageView;
        int height = super.getHeight();
        return (height > 0 || (imageView = (ImageView) this.f70513a.get()) == null) ? height : imageView.getMaxHeight();
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.d, com.nostra13.universalimageloader.core.imageaware.a
    public int getWidth() {
        ImageView imageView;
        int width = super.getWidth();
        return (width > 0 || (imageView = (ImageView) this.f70513a.get()) == null) ? width : imageView.getMaxWidth();
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.d
    protected void h(Drawable drawable, View view) {
        ((ImageView) view).setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    @Override // com.nostra13.universalimageloader.core.imageaware.d, com.nostra13.universalimageloader.core.imageaware.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ImageView b() {
        return (ImageView) super.b();
    }

    public b(ImageView imageView, boolean z4) {
        super(imageView, z4);
    }
}
