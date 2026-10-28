package com.bumptech.glide.load.engine.bitmap_recycle;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes3.dex */
public final class i implements a<int[]> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f43875a = ProtectedSandApp.s("ࢡ");

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int a() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b(int[] iArr) {
        return iArr.length;
    }

    public int c(int[] iArr) {
        return iArr.length;
    }

    public int[] d(int i4) {
        return new int[i4];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return ProtectedSandApp.s("ࢡ");
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int[] newArray(int i4) {
        return new int[i4];
    }
}
