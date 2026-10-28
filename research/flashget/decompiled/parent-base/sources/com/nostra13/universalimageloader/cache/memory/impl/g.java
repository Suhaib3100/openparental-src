package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: UsingFreqLimitedMemoryCache.java */
/* loaded from: classes6.dex */
public class g extends com.nostra13.universalimageloader.cache.memory.b {

    /* renamed from: g, reason: collision with root package name */
    private final Map<Bitmap, Integer> f70252g;

    public g(int i4) {
        super(i4);
        this.f70252g = Collections.synchronizedMap(new HashMap());
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b, com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public boolean a(String str, Bitmap bitmap) {
        if (!super.a(str, bitmap)) {
            return false;
        }
        this.f70252g.put(bitmap, 0);
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
        this.f70252g.clear();
        super.clear();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b
    protected Bitmap e() {
        Bitmap bitmap;
        Set<Map.Entry<Bitmap, Integer>> entrySet = this.f70252g.entrySet();
        synchronized (this.f70252g) {
            try {
                bitmap = null;
                Integer num = null;
                for (Map.Entry<Bitmap, Integer> entry : entrySet) {
                    if (bitmap == null) {
                        bitmap = entry.getKey();
                        num = entry.getValue();
                    } else {
                        Integer value = entry.getValue();
                        if (value.intValue() < num.intValue()) {
                            bitmap = entry.getKey();
                            num = value;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f70252g.remove(bitmap);
        return bitmap;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public Bitmap get(String str) {
        Integer num;
        Bitmap bitmap = super.get(str);
        if (bitmap != null && (num = this.f70252g.get(bitmap)) != null) {
            this.f70252g.put(bitmap, Integer.valueOf(num.intValue() + 1));
        }
        return bitmap;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.b, com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public Bitmap remove(String str) {
        Bitmap bitmap = super.get(str);
        if (bitmap != null) {
            this.f70252g.remove(bitmap);
        }
        return super.remove(str);
    }
}
