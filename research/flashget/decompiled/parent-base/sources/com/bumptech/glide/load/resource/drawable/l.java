package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes3.dex */
final class l extends j<Drawable> {
    private l(Drawable drawable) {
        super(drawable);
    }

    @q0
    static u<Drawable> d(@q0 Drawable drawable) {
        if (drawable != null) {
            return new l(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<Drawable> a() {
        return this.f44582b.getClass();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
        return Math.max(1, this.f44582b.getIntrinsicHeight() * this.f44582b.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
    }
}
