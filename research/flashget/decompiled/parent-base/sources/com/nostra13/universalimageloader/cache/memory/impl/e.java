package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LimitedAgeMemoryCache.java */
/* loaded from: classes6.dex */
public class e implements com.nostra13.universalimageloader.cache.memory.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.nostra13.universalimageloader.cache.memory.c f70246a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70247b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f70248c = Collections.synchronizedMap(new HashMap());

    public e(com.nostra13.universalimageloader.cache.memory.c cVar, long j4) {
        this.f70246a = cVar;
        this.f70247b = j4 * 1000;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public boolean a(String str, Bitmap bitmap) {
        boolean a5 = this.f70246a.a(str, bitmap);
        if (a5) {
            this.f70248c.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        return a5;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public void clear() {
        this.f70246a.clear();
        this.f70248c.clear();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Bitmap get(String str) {
        Long l4 = this.f70248c.get(str);
        if (l4 != null && System.currentTimeMillis() - l4.longValue() > this.f70247b) {
            this.f70246a.remove(str);
            this.f70248c.remove(str);
        }
        return this.f70246a.get(str);
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Collection<String> keys() {
        return this.f70246a.keys();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Bitmap remove(String str) {
        this.f70248c.remove(str);
        return this.f70246a.remove(str);
    }
}
