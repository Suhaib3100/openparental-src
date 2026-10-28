package com.nostra13.universalimageloader.cache.disc.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.utils.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LimitedAgeDiskCache.java */
/* loaded from: classes6.dex */
public class b extends a {

    /* renamed from: l, reason: collision with root package name */
    private final long f70166l;

    /* renamed from: m, reason: collision with root package name */
    private final Map<File, Long> f70167m;

    public b(File file, File file2, ob.a aVar, long j4) {
        super(file, file2, aVar);
        this.f70167m = Collections.synchronizedMap(new HashMap());
        this.f70166l = j4 * 1000;
    }

    private void h(String str) {
        File d5 = d(str);
        long currentTimeMillis = System.currentTimeMillis();
        d5.setLastModified(currentTimeMillis);
        this.f70167m.put(d5, Long.valueOf(currentTimeMillis));
    }

    @Override // com.nostra13.universalimageloader.cache.disc.impl.a, nb.a
    public boolean b(String str, Bitmap bitmap) throws IOException {
        boolean b5 = super.b(str, bitmap);
        h(str);
        return b5;
    }

    @Override // com.nostra13.universalimageloader.cache.disc.impl.a, nb.a
    public boolean c(String str, InputStream inputStream, c.a aVar) throws IOException {
        boolean c5 = super.c(str, inputStream, aVar);
        h(str);
        return c5;
    }

    @Override // com.nostra13.universalimageloader.cache.disc.impl.a, nb.a
    public void clear() {
        super.clear();
        this.f70167m.clear();
    }

    @Override // com.nostra13.universalimageloader.cache.disc.impl.a, nb.a
    public File get(String str) {
        boolean z4;
        File d5 = d(str);
        if (d5 != null && d5.exists()) {
            Long l4 = this.f70167m.get(d5);
            if (l4 == null) {
                l4 = Long.valueOf(d5.lastModified());
                z4 = false;
            } else {
                z4 = true;
            }
            if (System.currentTimeMillis() - l4.longValue() > this.f70166l) {
                d5.delete();
                this.f70167m.remove(d5);
            } else if (!z4) {
                this.f70167m.put(d5, l4);
            }
        }
        return d5;
    }

    @Override // com.nostra13.universalimageloader.cache.disc.impl.a, nb.a
    public boolean remove(String str) {
        this.f70167m.remove(d(str));
        return super.remove(str);
    }

    public b(File file, long j4) {
        this(file, null, new ob.b(), j4);
    }

    public b(File file, File file2, long j4) {
        this(file, file2, new ob.b(), j4);
    }
}
