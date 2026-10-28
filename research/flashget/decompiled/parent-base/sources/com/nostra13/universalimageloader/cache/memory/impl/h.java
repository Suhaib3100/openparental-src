package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: WeakMemoryCache.java */
/* loaded from: classes6.dex */
public class h extends com.nostra13.universalimageloader.cache.memory.a {
    @Override // com.nostra13.universalimageloader.cache.memory.a
    protected Reference<Bitmap> b(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }
}
