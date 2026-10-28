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
    private final String f44938c;

    /* renamed from: d, reason: collision with root package name */
    private final long f44939d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44940e;

    public d(@q0 String str, long j4, int i4) {
        this.f44938c = str == null ? "" : str;
        this.f44939d = j4;
        this.f44940e = i4;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f44939d).putInt(this.f44940e).array());
        messageDigest.update(this.f44938c.getBytes(f.f44241b));
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
        return this.f44939d == dVar.f44939d && this.f44940e == dVar.f44940e && this.f44938c.equals(dVar.f44938c);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        int hashCode = this.f44938c.hashCode() * 31;
        long j4 = this.f44939d;
        return ((hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f44940e;
    }
}
