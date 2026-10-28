package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.q0;

/* compiled from: ThumbnailImageViewTarget.java */
/* loaded from: classes4.dex */
public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.j
    protected void v(@q0 T t5) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f12093p).getLayoutParams();
        Drawable x5 = x(t5);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            x5 = new i(x5, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f12093p).setImageDrawable(x5);
    }

    protected abstract Drawable x(T t5);

    @Deprecated
    public q(ImageView imageView, boolean z5) {
        super(imageView, z5);
    }
}
