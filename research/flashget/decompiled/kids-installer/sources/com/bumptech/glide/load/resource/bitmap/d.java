package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: BitmapDrawableTransformation.java */
@Deprecated
/* loaded from: classes3.dex */
public class d implements com.bumptech.glide.load.m<BitmapDrawable> {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.m<Drawable> f11703c;

    public d(com.bumptech.glide.load.m<Bitmap> mVar) {
        this.f11703c = (com.bumptech.glide.load.m) com.bumptech.glide.util.l.d(new x(mVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.bumptech.glide.load.engine.u<BitmapDrawable> c(com.bumptech.glide.load.engine.u<Drawable> uVar) {
        if (uVar.get() instanceof BitmapDrawable) {
            return uVar;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᵕ") + uVar.get());
    }

    private static com.bumptech.glide.load.engine.u<Drawable> d(com.bumptech.glide.load.engine.u<BitmapDrawable> uVar) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@androidx.annotation.o0 MessageDigest messageDigest) {
        this.f11703c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    @androidx.annotation.o0
    public com.bumptech.glide.load.engine.u<BitmapDrawable> b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 com.bumptech.glide.load.engine.u<BitmapDrawable> uVar, int i5, int i6) {
        return c(this.f11703c.b(context, uVar, i5, i6));
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f11703c.equals(((d) obj).f11703c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f11703c.hashCode();
    }
}
