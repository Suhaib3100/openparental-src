package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.gifdecoder.a;

/* compiled from: GifBitmapProvider.java */
/* loaded from: classes3.dex */
public final class b implements a.InterfaceC0133a {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11823a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f11824b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(eVar, null);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0133a
    @o0
    public Bitmap a(int i5, int i6, @o0 Bitmap.Config config) {
        return this.f11823a.g(i5, i6, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0133a
    @o0
    public int[] b(int i5) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f11824b;
        return bVar == null ? new int[i5] : (int[]) bVar.e(i5, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0133a
    public void c(@o0 Bitmap bitmap) {
        this.f11823a.d(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0133a
    public void d(@o0 byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f11824b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0133a
    @o0
    public byte[] e(int i5) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f11824b;
        return bVar == null ? new byte[i5] : (byte[]) bVar.e(i5, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0133a
    public void f(@o0 int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f11824b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @q0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f11823a = eVar;
        this.f11824b = bVar;
    }
}
