package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LRULimitedMemoryCache.java */
/* loaded from: classes6.dex */
public class c extends com.nostra13.universalimageloader.cache.memory.b {

    /* renamed from: h, reason: collision with root package name */
    private static final int f70242h = 10;

    /* renamed from: i, reason: collision with root package name */
    private static final float f70243i = 1.1f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Bitmap> f70244g;

    public c(int i4) {
        super(i4);
        this.f70244g = Collections.synchronizedMap(new LinkedHashMap(10, f70243i, true));
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b, com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public boolean a(String str, Bitmap bitmap) {
        if (!super.a(str, bitmap)) {
            return false;
        }
        this.f70244g.put(str, bitmap);
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
        this.f70244g.clear();
        super.clear();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b
    protected Bitmap e() {
        Bitmap bitmap;
        synchronized (this.f70244g) {
            try {
                Iterator<Map.Entry<String, Bitmap>> it = this.f70244g.entrySet().iterator();
                if (it.hasNext()) {
                    bitmap = it.next().getValue();
                    it.remove();
                } else {
                    bitmap = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bitmap;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public Bitmap get(String str) {
        this.f70244g.get(str);
        return super.get(str);
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b, com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public Bitmap remove(String str) {
        this.f70244g.remove(str);
        return super.remove(str);
    }
}
