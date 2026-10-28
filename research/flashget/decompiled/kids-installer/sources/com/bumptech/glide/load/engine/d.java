package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes3.dex */
final class d implements com.bumptech.glide.load.f {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.f f11277c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.f f11278d;

    d(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.f fVar2) {
        this.f11277c = fVar;
        this.f11278d = fVar2;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        this.f11277c.a(messageDigest);
        this.f11278d.a(messageDigest);
    }

    com.bumptech.glide.load.f c() {
        return this.f11277c;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11277c.equals(dVar.f11277c) && this.f11278d.equals(dVar.f11278d);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f11278d.hashCode() + (this.f11277c.hashCode() * 31);
    }

    public String toString() {
        return ProtectedSandApp.s("᳒") + this.f11277c + ProtectedSandApp.s("᳓") + this.f11278d + '}';
    }
}
