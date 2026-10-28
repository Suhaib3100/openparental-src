package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes3.dex */
public class y implements com.bumptech.glide.load.m<Drawable> {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.m<Bitmap> f44567c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44568d;

    public y(com.bumptech.glide.load.m<Bitmap> mVar, boolean z4) {
        this.f44567c = mVar;
        this.f44568d = z4;
    }

    private com.bumptech.glide.load.engine.u<Drawable> d(Context context, com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        return f0.d(context.getResources(), uVar);
    }

    @Override // com.bumptech.glide.load.m
    @androidx.annotation.o0
    public com.bumptech.glide.load.engine.u<Drawable> a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 com.bumptech.glide.load.engine.u<Drawable> uVar, int i4, int i5) {
        com.bumptech.glide.load.engine.bitmap_recycle.e h4 = com.bumptech.glide.c.e(context).h();
        Drawable drawable = uVar.get();
        com.bumptech.glide.load.engine.u<Bitmap> a5 = x.a(h4, drawable, i4, i5);
        if (a5 != null) {
            com.bumptech.glide.load.engine.u<Bitmap> a6 = this.f44567c.a(context, a5, i4, i5);
            if (!a6.equals(a5)) {
                return d(context, a6);
            }
            a6.recycle();
            return uVar;
        }
        if (!this.f44568d) {
            return uVar;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ਁ") + drawable + ProtectedSandApp.s("ਂ"));
    }

    @Override // com.bumptech.glide.load.f
    public void b(@androidx.annotation.o0 MessageDigest messageDigest) {
        this.f44567c.b(messageDigest);
    }

    public com.bumptech.glide.load.m<BitmapDrawable> c() {
        return this;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f44567c.equals(((y) obj).f44567c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f44567c.hashCode();
    }
}
