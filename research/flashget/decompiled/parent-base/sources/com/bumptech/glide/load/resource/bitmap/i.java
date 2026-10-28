package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.collection.q2;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes3.dex */
public abstract class i implements com.bumptech.glide.load.m<Bitmap> {
    @Override // com.bumptech.glide.load.m
    @androidx.annotation.o0
    public final com.bumptech.glide.load.engine.u<Bitmap> a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 com.bumptech.glide.load.engine.u<Bitmap> uVar, int i4, int i5) {
        if (!com.bumptech.glide.util.o.x(i4, i5)) {
            throw new IllegalArgumentException(q2.a(ProtectedSandApp.s("ঈ"), i4, ProtectedSandApp.s("উ"), i5, ProtectedSandApp.s("ঊ")));
        }
        com.bumptech.glide.load.engine.bitmap_recycle.e h4 = com.bumptech.glide.c.e(context).h();
        Bitmap bitmap = uVar.get();
        if (i4 == Integer.MIN_VALUE) {
            i4 = bitmap.getWidth();
        }
        if (i5 == Integer.MIN_VALUE) {
            i5 = bitmap.getHeight();
        }
        Bitmap c5 = c(h4, bitmap, i4, i5);
        return bitmap.equals(c5) ? uVar : h.d(c5, h4);
    }

    protected abstract Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5);
}
