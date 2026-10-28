package com.nostra13.universalimageloader.cache.memory;

import android.graphics.Bitmap;
import java.util.Collection;

/* compiled from: MemoryCache.java */
/* loaded from: classes6.dex */
public interface c {
    boolean a(String str, Bitmap bitmap);

    void clear();

    Bitmap get(String str);

    Collection<String> keys();

    Bitmap remove(String str);
}
