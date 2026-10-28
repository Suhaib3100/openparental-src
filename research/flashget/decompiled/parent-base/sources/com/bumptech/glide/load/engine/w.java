package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes3.dex */
final class w implements com.bumptech.glide.load.f {

    /* renamed from: k, reason: collision with root package name */
    private static final com.bumptech.glide.util.j<Class<?>, byte[]> f44218k = new com.bumptech.glide.util.j<>(50);

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44219c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.f f44220d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.f f44221e;

    /* renamed from: f, reason: collision with root package name */
    private final int f44222f;

    /* renamed from: g, reason: collision with root package name */
    private final int f44223g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f44224h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.i f44225i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.m<?> f44226j;

    w(com.bumptech.glide.load.engine.bitmap_recycle.b bVar, com.bumptech.glide.load.f fVar, com.bumptech.glide.load.f fVar2, int i4, int i5, com.bumptech.glide.load.m<?> mVar, Class<?> cls, com.bumptech.glide.load.i iVar) {
        this.f44219c = bVar;
        this.f44220d = fVar;
        this.f44221e = fVar2;
        this.f44222f = i4;
        this.f44223g = i5;
        this.f44226j = mVar;
        this.f44224h = cls;
        this.f44225i = iVar;
    }

    private byte[] c() {
        com.bumptech.glide.util.j<Class<?>, byte[]> jVar = f44218k;
        byte[] k4 = jVar.k(this.f44224h);
        if (k4 != null) {
            return k4;
        }
        byte[] bytes = this.f44224h.getName().getBytes(com.bumptech.glide.load.f.f44241b);
        jVar.o(this.f44224h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f44219c.e(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f44222f).putInt(this.f44223g).array();
        this.f44221e.b(messageDigest);
        this.f44220d.b(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.m<?> mVar = this.f44226j;
        if (mVar != null) {
            mVar.b(messageDigest);
        }
        this.f44225i.b(messageDigest);
        messageDigest.update(c());
        this.f44219c.put(bArr);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f44223g == wVar.f44223g && this.f44222f == wVar.f44222f && com.bumptech.glide.util.o.e(this.f44226j, wVar.f44226j) && this.f44224h.equals(wVar.f44224h) && this.f44220d.equals(wVar.f44220d) && this.f44221e.equals(wVar.f44221e) && this.f44225i.equals(wVar.f44225i);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        int hashCode = ((((this.f44221e.hashCode() + (this.f44220d.hashCode() * 31)) * 31) + this.f44222f) * 31) + this.f44223g;
        com.bumptech.glide.load.m<?> mVar = this.f44226j;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return this.f44225i.hashCode() + ((this.f44224h.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        return ProtectedSandApp.s("ॆ") + this.f44220d + ProtectedSandApp.s("े") + this.f44221e + ProtectedSandApp.s("ै") + this.f44222f + ProtectedSandApp.s("ॉ") + this.f44223g + ProtectedSandApp.s("ॊ") + this.f44224h + ProtectedSandApp.s("ो") + this.f44226j + ProtectedSandApp.s("ौ") + this.f44225i + '}';
    }
}
