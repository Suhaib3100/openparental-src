package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.q0;

/* compiled from: ThumbnailImageViewTarget.java */
/* loaded from: classes3.dex */
public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.j
    protected void u(@q0 T t4) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f44899c).getLayoutParams();
        Drawable w4 = w(t4);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            w4 = new i(w4, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f44899c).setImageDrawable(w4);
    }

    protected abstract Drawable w(T t4);

    @Deprecated
    public q(ImageView imageView, boolean z4) {
        super(imageView, z4);
    }
}
