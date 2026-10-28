package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes3.dex */
final class d implements com.bumptech.glide.load.f {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.f f43985c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.f f43986d;

    d(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.f fVar2) {
        this.f43985c = fVar;
        this.f43986d = fVar2;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        this.f43985c.b(messageDigest);
        this.f43986d.b(messageDigest);
    }

    com.bumptech.glide.load.f c() {
        return this.f43985c;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f43985c.equals(dVar.f43985c) && this.f43986d.equals(dVar.f43986d);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f43986d.hashCode() + (this.f43985c.hashCode() * 31);
    }

    public String toString() {
        return ProtectedSandApp.s("ࣙ") + this.f43985c + ProtectedSandApp.s("ࣚ") + this.f43986d + '}';
    }
}
