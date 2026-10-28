package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.c;

/* compiled from: BitmapTransitionOptions.java */
/* loaded from: classes3.dex */
public final class j extends com.bumptech.glide.o<j, Bitmap> {
    @androidx.annotation.o0
    public static j p(@androidx.annotation.o0 com.bumptech.glide.request.transition.g<Bitmap> gVar) {
        return new j().g(gVar);
    }

    @androidx.annotation.o0
    public static j q() {
        return new j().k();
    }

    @androidx.annotation.o0
    public static j r(int i4) {
        return new j().l(i4);
    }

    @androidx.annotation.o0
    public static j s(@androidx.annotation.o0 c.a aVar) {
        return new j().m(aVar);
    }

    @androidx.annotation.o0
    public static j t(@androidx.annotation.o0 com.bumptech.glide.request.transition.c cVar) {
        return new j().o(cVar);
    }

    @androidx.annotation.o0
    public static j u(@androidx.annotation.o0 com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return new j().o(gVar);
    }

    @Override // com.bumptech.glide.o
    public boolean equals(Object obj) {
        return (obj instanceof j) && super.equals(obj);
    }

    @Override // com.bumptech.glide.o
    public int hashCode() {
        return super.hashCode();
    }

    @androidx.annotation.o0
    public j k() {
        return m(new c.a());
    }

    @androidx.annotation.o0
    public j l(int i4) {
        return m(new c.a(i4));
    }

    @androidx.annotation.o0
    public j m(@androidx.annotation.o0 c.a aVar) {
        return o(aVar.a());
    }

    @androidx.annotation.o0
    public j n(@androidx.annotation.o0 com.bumptech.glide.request.transition.c cVar) {
        return o(cVar);
    }

    @androidx.annotation.o0
    public j o(@androidx.annotation.o0 com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return g(new com.bumptech.glide.request.transition.b(gVar));
    }
}
