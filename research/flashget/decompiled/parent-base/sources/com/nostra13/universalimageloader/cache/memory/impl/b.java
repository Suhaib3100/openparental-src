package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: FuzzyKeyMemoryCache.java */
/* loaded from: classes6.dex */
public class b implements com.nostra13.universalimageloader.cache.memory.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.nostra13.universalimageloader.cache.memory.c f70240a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<String> f70241b;

    public b(com.nostra13.universalimageloader.cache.memory.c cVar, Comparator<String> comparator) {
        this.f70240a = cVar;
        this.f70241b = comparator;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public boolean a(String str, Bitmap bitmap) {
        String str2;
        synchronized (this.f70240a) {
            try {
                Iterator<String> it = this.f70240a.keys().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    str2 = it.next();
                    if (this.f70241b.compare(str, str2) == 0) {
                        break;
                    }
                }
                if (str2 != null) {
                    this.f70240a.remove(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f70240a.a(str, bitmap);
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public void clear() {
        this.f70240a.clear();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Bitmap get(String str) {
        return this.f70240a.get(str);
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Collection<String> keys() {
        return this.f70240a.keys();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Bitmap remove(String str) {
        return this.f70240a.remove(str);
    }
}
