package com.bumptech.glide.signature;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: MediaStoreSignature.java */
/* loaded from: classes3.dex */
public class d implements f {

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final String f12132c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12133d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12134e;

    public d(@q0 String str, long j5, int i5) {
        this.f12132c = str == null ? "" : str;
        this.f12133d = j5;
        this.f12134e = i5;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f12133d).putInt(this.f12134e).array());
        messageDigest.update(this.f12132c.getBytes(f.f11501b));
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12133d == dVar.f12133d && this.f12134e == dVar.f12134e && this.f12132c.equals(dVar.f12132c);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        int hashCode = this.f12132c.hashCode() * 31;
        long j5 = this.f12133d;
        return ((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f12134e;
    }
}
