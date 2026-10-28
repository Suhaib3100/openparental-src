package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.q0;

/* compiled from: DrawableImageViewTarget.java */
/* loaded from: classes3.dex */
public class g extends j<Drawable> {
    public g(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void u(@q0 Drawable drawable) {
        ((ImageView) this.f44899c).setImageDrawable(drawable);
    }

    @Deprecated
    public g(ImageView imageView, boolean z4) {
        super(imageView, z4);
    }
}
