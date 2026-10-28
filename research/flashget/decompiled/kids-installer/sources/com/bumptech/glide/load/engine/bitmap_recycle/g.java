package com.bumptech.glide.load.engine.bitmap_recycle;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes3.dex */
public final class g implements a<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11160a = ProtectedSandApp.s("Ნ");

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String a() {
        return ProtectedSandApp.s("Მ");
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int c(byte[] bArr) {
        return bArr.length;
    }

    public int d(byte[] bArr) {
        return bArr.length;
    }

    public byte[] e(int i5) {
        return new byte[i5];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public byte[] newArray(int i5) {
        return new byte[i5];
    }
}
