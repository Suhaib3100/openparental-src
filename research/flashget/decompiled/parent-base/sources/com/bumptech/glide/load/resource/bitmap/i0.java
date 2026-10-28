package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes3.dex */
public class i0 implements com.bumptech.glide.load.k<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.drawable.m f44488a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44489b;

    public i0(com.bumptech.glide.load.resource.drawable.m mVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f44488a = mVar;
        this.f44489b = eVar;
    }

    @Override // com.bumptech.glide.load.k
    @androidx.annotation.q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 Uri uri, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.load.engine.u<Drawable> b5 = this.f44488a.b(uri, i4, i5, iVar);
        if (b5 == null) {
            return null;
        }
        return x.a(this.f44489b, b5.get(), i4, i5);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 Uri uri, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return ProtectedSandApp.s("ল").equals(uri.getScheme());
    }
}
