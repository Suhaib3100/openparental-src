package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes3.dex */
final class d extends b<Drawable> {
    private d(Drawable drawable) {
        super(drawable);
    }

    @q0
    static u<Drawable> e(@q0 Drawable drawable) {
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.u
    public int a() {
        return Math.max(1, this.f11805o.getIntrinsicHeight() * this.f11805o.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<Drawable> c() {
        return this.f11805o.getClass();
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
    }
}
