package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.q0;

/* compiled from: DrawableImageViewTarget.java */
/* loaded from: classes4.dex */
public class g extends j<Drawable> {
    public g(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void v(@q0 Drawable drawable) {
        ((ImageView) this.f12093p).setImageDrawable(drawable);
    }

    @Deprecated
    public g(ImageView imageView, boolean z5) {
        super(imageView, z5);
    }
}
