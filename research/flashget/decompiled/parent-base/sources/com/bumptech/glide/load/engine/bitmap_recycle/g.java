package com.bumptech.glide.load.engine.bitmap_recycle;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes3.dex */
public final class g implements a<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f43868a = ProtectedSandApp.s("࢝");

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b(byte[] bArr) {
        return bArr.length;
    }

    public int c(byte[] bArr) {
        return bArr.length;
    }

    public byte[] d(int i4) {
        return new byte[i4];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return ProtectedSandApp.s("࢝");
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public byte[] newArray(int i4) {
        return new byte[i4];
    }
}
