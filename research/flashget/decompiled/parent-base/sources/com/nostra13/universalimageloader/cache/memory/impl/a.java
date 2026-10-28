package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: FIFOLimitedMemoryCache.java */
/* loaded from: classes6.dex */
public class a extends com.nostra13.universalimageloader.cache.memory.b {

    /* renamed from: g, reason: collision with root package name */
    private final List<Bitmap> f70239g;

    public a(int i4) {
        super(i4);
        this.f70239g = Collections.synchronizedList(new LinkedList());
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b, com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public boolean a(String str, Bitmap bitmap) {
        if (!super.a(str, bitmap)) {
            return false;
        }
        this.f70239g.add(bitmap);
        return true;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.a
    protected Reference<Bitmap> b(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b
    protected int c(Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b, com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public void clear() {
        this.f70239g.clear();
        super.clear();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b
    protected Bitmap e() {
        return this.f70239g.remove(0);
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b, com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public Bitmap remove(String str) {
        Bitmap bitmap = super.get(str);
        if (bitmap != null) {
            this.f70239g.remove(bitmap);
        }
        return super.remove(str);
    }
}
