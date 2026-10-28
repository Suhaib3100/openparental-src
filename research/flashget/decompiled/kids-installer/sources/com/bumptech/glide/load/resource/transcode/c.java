package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes3.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11888a;

    /* renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f11889b;

    /* renamed from: c, reason: collision with root package name */
    private final e<com.bumptech.glide.load.resource.gif.c, byte[]> f11890c;

    public c(@o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @o0 e<Bitmap, byte[]> eVar2, @o0 e<com.bumptech.glide.load.resource.gif.c, byte[]> eVar3) {
        this.f11888a = eVar;
        this.f11889b = eVar2;
        this.f11890c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    private static u<com.bumptech.glide.load.resource.gif.c> b(@o0 u<Drawable> uVar) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @q0
    public u<byte[]> a(@o0 u<Drawable> uVar, @o0 i iVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f11889b.a(com.bumptech.glide.load.resource.bitmap.g.e(((BitmapDrawable) drawable).getBitmap(), this.f11888a), iVar);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.c) {
            return this.f11890c.a(uVar, iVar);
        }
        return null;
    }
}
