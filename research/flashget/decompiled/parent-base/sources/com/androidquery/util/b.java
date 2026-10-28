package com.androidquery.util;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: BitmapCache.java */
/* loaded from: classes3.dex */
public class b extends LinkedHashMap<String, Bitmap> {

    /* renamed from: f, reason: collision with root package name */
    private static final long f41217f = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f41218b;

    /* renamed from: c, reason: collision with root package name */
    private int f41219c;

    /* renamed from: d, reason: collision with root package name */
    private int f41220d;

    /* renamed from: e, reason: collision with root package name */
    private int f41221e;

    public b(int i4, int i5, int i6) {
        super(8, 0.75f, true);
        this.f41218b = i4;
        this.f41219c = i5;
        this.f41220d = i6;
    }

    private int b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight() * bitmap.getWidth();
    }

    private void e() {
        if (this.f41221e > this.f41220d) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
                if (this.f41221e <= this.f41220d) {
                    return;
                }
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap put(String str, Bitmap bitmap) {
        int b5 = b(bitmap);
        if (b5 > this.f41219c) {
            return null;
        }
        this.f41221e += b5;
        Bitmap bitmap2 = (Bitmap) super.put(str, bitmap);
        if (bitmap2 == null) {
            return bitmap2;
        }
        this.f41221e -= b(bitmap2);
        return bitmap2;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.f41221e = 0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bitmap remove(Object obj) {
        Bitmap bitmap = (Bitmap) super.remove(obj);
        if (bitmap != null) {
            this.f41221e -= b(bitmap);
        }
        return bitmap;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, Bitmap> entry) {
        if (this.f41221e > this.f41220d || size() > this.f41218b) {
            remove(entry.getKey());
        }
        e();
        return false;
    }
}
