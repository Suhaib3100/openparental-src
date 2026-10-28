package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes3.dex */
public class h0 implements com.bumptech.glide.load.k<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.drawable.e f11723a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11724b;

    public h0(com.bumptech.glide.load.resource.drawable.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar2) {
        this.f11723a = eVar;
        this.f11724b = eVar2;
    }

    @Override // com.bumptech.glide.load.k
    @androidx.annotation.q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 Uri uri, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.load.engine.u<Drawable> b6 = this.f11723a.b(uri, i5, i6, iVar);
        if (b6 == null) {
            return null;
        }
        return w.a(this.f11724b, b6.get(), i5, i6);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 Uri uri, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return ProtectedSandApp.s("ᵟ").equals(uri.getScheme());
    }
}
