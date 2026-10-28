package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: LruMemoryCache.java */
/* loaded from: classes6.dex */
public class f implements com.nostra13.universalimageloader.cache.memory.c {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, Bitmap> f70249a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70250b;

    /* renamed from: c, reason: collision with root package name */
    private int f70251c;

    public f(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨷ\u0001"));
        }
        this.f70250b = i4;
        this.f70249a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + com.flashget.parentalcontrol.ProtectedSandApp.s("ᨸ\u0001"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f70251c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L53
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f70249a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f70251c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L53
            goto L14
        L12:
            r4 = move-exception
            goto L76
        L14:
            int r0 = r3.f70251c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L51
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f70249a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L51
        L21:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f70249a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L35
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L52
        L35:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f70249a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.f70251c     // Catch: java.lang.Throwable -> L12
            int r0 = r3.b(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.f70251c = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
        L52:
            return
        L53:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "ᨸ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L76:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.memory.impl.f.c(int):void");
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public final boolean a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᨹ\u0001"));
        }
        synchronized (this) {
            try {
                this.f70251c += b(str, bitmap);
                Bitmap put = this.f70249a.put(str, bitmap);
                if (put != null) {
                    this.f70251c -= b(str, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(this.f70250b);
        return true;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public void clear() {
        c(-1);
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public final Bitmap get(String str) {
        Bitmap bitmap;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᨺ\u0001"));
        }
        synchronized (this) {
            bitmap = this.f70249a.get(str);
        }
        return bitmap;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public Collection<String> keys() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f70249a.keySet());
        }
        return hashSet;
    }

    @Override // com.nostra13.universalimageloader.cache.memory.c
    public final Bitmap remove(String str) {
        Bitmap remove;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᨺ\u0001"));
        }
        synchronized (this) {
            try {
                remove = this.f70249a.remove(str);
                if (remove != null) {
                    this.f70251c -= b(str, remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public final synchronized String toString() {
        return String.format(ProtectedSandApp.s("ᨻ\u0001"), Integer.valueOf(this.f70250b));
    }
}
