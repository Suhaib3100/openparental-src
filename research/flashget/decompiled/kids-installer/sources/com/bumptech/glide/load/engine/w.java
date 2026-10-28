package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes3.dex */
final class w implements com.bumptech.glide.load.f {

    /* renamed from: k, reason: collision with root package name */
    private static final com.bumptech.glide.util.i<Class<?>, byte[]> f11478k = new com.bumptech.glide.util.i<>(50);

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f11479c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.f f11480d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.f f11481e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11482f;

    /* renamed from: g, reason: collision with root package name */
    private final int f11483g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f11484h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.i f11485i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.m<?> f11486j;

    w(com.bumptech.glide.load.engine.bitmap_recycle.b bVar, com.bumptech.glide.load.f fVar, com.bumptech.glide.load.f fVar2, int i5, int i6, com.bumptech.glide.load.m<?> mVar, Class<?> cls, com.bumptech.glide.load.i iVar) {
        this.f11479c = bVar;
        this.f11480d = fVar;
        this.f11481e = fVar2;
        this.f11482f = i5;
        this.f11483g = i6;
        this.f11486j = mVar;
        this.f11484h = cls;
        this.f11485i = iVar;
    }

    private byte[] c() {
        com.bumptech.glide.util.i<Class<?>, byte[]> iVar = f11478k;
        byte[] k5 = iVar.k(this.f11484h);
        if (k5 != null) {
            return k5;
        }
        byte[] bytes = this.f11484h.getName().getBytes(com.bumptech.glide.load.f.f11501b);
        iVar.o(this.f11484h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f11479c.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f11482f).putInt(this.f11483g).array();
        this.f11481e.a(messageDigest);
        this.f11480d.a(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.m<?> mVar = this.f11486j;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.f11485i.a(messageDigest);
        messageDigest.update(c());
        this.f11479c.put(bArr);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f11483g == wVar.f11483g && this.f11482f == wVar.f11482f && com.bumptech.glide.util.n.d(this.f11486j, wVar.f11486j) && this.f11484h.equals(wVar.f11484h) && this.f11480d.equals(wVar.f11480d) && this.f11481e.equals(wVar.f11481e) && this.f11485i.equals(wVar.f11485i);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        int hashCode = ((((this.f11481e.hashCode() + (this.f11480d.hashCode() * 31)) * 31) + this.f11482f) * 31) + this.f11483g;
        com.bumptech.glide.load.m<?> mVar = this.f11486j;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return this.f11485i.hashCode() + ((this.f11484h.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        return ProtectedSandApp.s("ᴏ") + this.f11480d + ProtectedSandApp.s("ᴐ") + this.f11481e + ProtectedSandApp.s("ᴑ") + this.f11482f + ProtectedSandApp.s("ᴒ") + this.f11483g + ProtectedSandApp.s("ᴓ") + this.f11484h + ProtectedSandApp.s("ᴔ") + this.f11486j + ProtectedSandApp.s("ᴕ") + this.f11485i + '}';
    }
}
