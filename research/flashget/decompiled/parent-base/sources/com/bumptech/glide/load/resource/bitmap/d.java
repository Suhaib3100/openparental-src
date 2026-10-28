package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: BitmapDrawableTransformation.java */
@Deprecated
/* loaded from: classes3.dex */
public class d implements com.bumptech.glide.load.m<BitmapDrawable> {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.m<Drawable> f44452c;

    public d(com.bumptech.glide.load.m<Bitmap> mVar) {
        this.f44452c = (com.bumptech.glide.load.m) com.bumptech.glide.util.m.f(new y(mVar, false), ProtectedSandApp.s("ঢ"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.bumptech.glide.load.engine.u<BitmapDrawable> c(com.bumptech.glide.load.engine.u<Drawable> uVar) {
        if (uVar.get() instanceof BitmapDrawable) {
            return uVar;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ণ") + uVar.get());
    }

    private static com.bumptech.glide.load.engine.u<Drawable> d(com.bumptech.glide.load.engine.u<BitmapDrawable> uVar) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.m
    @androidx.annotation.o0
    public com.bumptech.glide.load.engine.u<BitmapDrawable> a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 com.bumptech.glide.load.engine.u<BitmapDrawable> uVar, int i4, int i5) {
        return c(this.f44452c.a(context, uVar, i4, i5));
    }

    @Override // com.bumptech.glide.load.f
    public void b(@androidx.annotation.o0 MessageDigest messageDigest) {
        this.f44452c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f44452c.equals(((d) obj).f44452c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f44452c.hashCode();
    }
}
