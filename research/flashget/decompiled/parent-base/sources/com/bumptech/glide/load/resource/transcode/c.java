package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.bitmap.h;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes3.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44667a;

    /* renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f44668b;

    /* renamed from: c, reason: collision with root package name */
    private final e<com.bumptech.glide.load.resource.gif.c, byte[]> f44669c;

    public c(@o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @o0 e<Bitmap, byte[]> eVar2, @o0 e<com.bumptech.glide.load.resource.gif.c, byte[]> eVar3) {
        this.f44667a = eVar;
        this.f44668b = eVar2;
        this.f44669c = eVar3;
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
            return this.f44668b.a(h.d(((BitmapDrawable) drawable).getBitmap(), this.f44667a), iVar);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.c) {
            return this.f44669c.a(uVar, iVar);
        }
        return null;
    }
}
