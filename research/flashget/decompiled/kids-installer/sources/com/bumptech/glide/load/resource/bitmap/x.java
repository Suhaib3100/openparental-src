package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes3.dex */
public class x implements com.bumptech.glide.load.m<Drawable> {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.m<Bitmap> f11800c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11801d;

    public x(com.bumptech.glide.load.m<Bitmap> mVar, boolean z5) {
        this.f11800c = mVar;
        this.f11801d = z5;
    }

    private com.bumptech.glide.load.engine.u<Drawable> d(Context context, com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        return e0.e(context.getResources(), uVar);
    }

    @Override // com.bumptech.glide.load.f
    public void a(@androidx.annotation.o0 MessageDigest messageDigest) {
        this.f11800c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    @androidx.annotation.o0
    public com.bumptech.glide.load.engine.u<Drawable> b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 com.bumptech.glide.load.engine.u<Drawable> uVar, int i5, int i6) {
        com.bumptech.glide.load.engine.bitmap_recycle.e h5 = com.bumptech.glide.b.e(context).h();
        Drawable drawable = uVar.get();
        com.bumptech.glide.load.engine.u<Bitmap> a6 = w.a(h5, drawable, i5, i6);
        if (a6 != null) {
            com.bumptech.glide.load.engine.u<Bitmap> b6 = this.f11800c.b(context, a6, i5, i6);
            if (!b6.equals(a6)) {
                return d(context, b6);
            }
            b6.recycle();
            return uVar;
        }
        if (!this.f11801d) {
            return uVar;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᵰ") + drawable + ProtectedSandApp.s("ᵱ"));
    }

    public com.bumptech.glide.load.m<BitmapDrawable> c() {
        return this;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f11800c.equals(((x) obj).f11800c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f11800c.hashCode();
    }
}
