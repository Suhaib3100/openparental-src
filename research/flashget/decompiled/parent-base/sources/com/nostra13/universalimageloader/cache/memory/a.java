package com.nostra13.universalimageloader.cache.memory;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: BaseMemoryCache.java */
/* loaded from: classes6.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Reference<Bitmap>> f70233a = Collections.synchronizedMap(new HashMap());

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public boolean a(String str, Bitmap bitmap) {
        this.f70233a.put(str, b(bitmap));
        return true;
    }

    protected abstract Reference<Bitmap> b(Bitmap bitmap);

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public void clear() {
        this.f70233a.clear();
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Bitmap get(String str) {
        Reference<Bitmap> reference = this.f70233a.get(str);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Collection<String> keys() {
        HashSet hashSet;
        synchronized (this.f70233a) {
            hashSet = new HashSet(this.f70233a.keySet());
        }
        return hashSet;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Bitmap remove(String str) {
        Reference<Bitmap> remove = this.f70233a.remove(str);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }
}
