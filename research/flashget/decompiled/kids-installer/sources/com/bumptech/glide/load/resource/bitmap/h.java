package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes3.dex */
public abstract class h implements com.bumptech.glide.load.m<Bitmap> {
    @Override // com.bumptech.glide.load.m
    @androidx.annotation.o0
    public final com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 com.bumptech.glide.load.engine.u<Bitmap> uVar, int i5, int i6) {
        if (!com.bumptech.glide.util.n.w(i5, i6)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᵐ") + i5 + ProtectedSandApp.s("ᵑ") + i6 + ProtectedSandApp.s("ᵒ"));
        }
        com.bumptech.glide.load.engine.bitmap_recycle.e h5 = com.bumptech.glide.b.e(context).h();
        Bitmap bitmap = uVar.get();
        if (i5 == Integer.MIN_VALUE) {
            i5 = bitmap.getWidth();
        }
        if (i6 == Integer.MIN_VALUE) {
            i6 = bitmap.getHeight();
        }
        Bitmap c6 = c(h5, bitmap, i5, i6);
        return bitmap.equals(c6) ? uVar : g.e(c6, h5);
    }

    protected abstract Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6);
}
