package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.gifdecoder.a;

/* compiled from: GifBitmapProvider.java */
/* loaded from: classes3.dex */
public final class b implements a.InterfaceC0732a {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44601a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44602b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(eVar, null);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0732a
    public void a(@o0 Bitmap bitmap) {
        this.f44601a.e(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0732a
    @o0
    public byte[] b(int i4) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f44602b;
        return bVar == null ? new byte[i4] : (byte[]) bVar.d(i4, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0732a
    @o0
    public Bitmap c(int i4, int i5, @o0 Bitmap.Config config) {
        return this.f44601a.g(i4, i5, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0732a
    @o0
    public int[] d(int i4) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f44602b;
        return bVar == null ? new int[i4] : (int[]) bVar.d(i4, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0732a
    public void e(@o0 byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f44602b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0732a
    public void f(@o0 int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f44602b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @q0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f44601a = eVar;
        this.f44602b = bVar;
    }
}
