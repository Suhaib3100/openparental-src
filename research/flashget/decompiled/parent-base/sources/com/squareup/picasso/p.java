package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: LruCache.java */
/* loaded from: classes6.dex */
public final class p implements e {

    /* renamed from: b, reason: collision with root package name */
    final LruCache<String, b> f70945b;

    /* compiled from: LruCache.java */
    class a extends LruCache<String, b> {
        a(int i4) {
            super(i4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f70948b;
        }
    }

    /* compiled from: LruCache.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f70947a;

        /* renamed from: b, reason: collision with root package name */
        final int f70948b;

        b(Bitmap bitmap, int i4) {
            this.f70947a = bitmap;
            this.f70948b = i4;
        }
    }

    public p(@o0 Context context) {
        this(k0.b(context));
    }

    @Override // com.squareup.picasso.e
    public void a(@o0 String str, @o0 Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int j4 = k0.j(bitmap);
        if (j4 > this.f70945b.maxSize()) {
            this.f70945b.remove(str);
        } else {
            this.f70945b.put(str, new b(bitmap, j4));
        }
    }

    @Override // com.squareup.picasso.e
    public void b(String str) {
        for (String str2 : this.f70945b.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == '\n') {
                this.f70945b.remove(str2);
            }
        }
    }

    public int c() {
        return this.f70945b.evictionCount();
    }

    @Override // com.squareup.picasso.e
    public void clear() {
        this.f70945b.evictAll();
    }

    public int d() {
        return this.f70945b.hitCount();
    }

    public int e() {
        return this.f70945b.missCount();
    }

    public int f() {
        return this.f70945b.putCount();
    }

    @Override // com.squareup.picasso.e
    @q0
    public Bitmap get(@o0 String str) {
        b bVar = this.f70945b.get(str);
        if (bVar != null) {
            return bVar.f70947a;
        }
        return null;
    }

    @Override // com.squareup.picasso.e
    public int o() {
        return this.f70945b.maxSize();
    }

    @Override // com.squareup.picasso.e
    public int size() {
        return this.f70945b.size();
    }

    public p(int i4) {
        this.f70945b = new a(i4);
    }
}
