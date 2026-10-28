package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.c;

/* compiled from: BitmapTransitionOptions.java */
/* loaded from: classes3.dex */
public final class i extends com.bumptech.glide.m<i, Bitmap> {
    @androidx.annotation.o0
    public static i o(@androidx.annotation.o0 com.bumptech.glide.request.transition.g<Bitmap> gVar) {
        return new i().f(gVar);
    }

    @androidx.annotation.o0
    public static i p() {
        return new i().j();
    }

    @androidx.annotation.o0
    public static i q(int i5) {
        return new i().k(i5);
    }

    @androidx.annotation.o0
    public static i s(@androidx.annotation.o0 c.a aVar) {
        return new i().l(aVar);
    }

    @androidx.annotation.o0
    public static i u(@androidx.annotation.o0 com.bumptech.glide.request.transition.c cVar) {
        return new i().n(cVar);
    }

    @androidx.annotation.o0
    public static i v(@androidx.annotation.o0 com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return new i().n(gVar);
    }

    @androidx.annotation.o0
    public i j() {
        return l(new c.a());
    }

    @androidx.annotation.o0
    public i k(int i5) {
        return l(new c.a(i5));
    }

    @androidx.annotation.o0
    public i l(@androidx.annotation.o0 c.a aVar) {
        return n(aVar.a());
    }

    @androidx.annotation.o0
    public i m(@androidx.annotation.o0 com.bumptech.glide.request.transition.c cVar) {
        return n(cVar);
    }

    @androidx.annotation.o0
    public i n(@androidx.annotation.o0 com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return f(new com.bumptech.glide.request.transition.b(gVar));
    }
}
