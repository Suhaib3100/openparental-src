package com.bumptech.glide.signature;

import androidx.annotation.o0;
import com.bumptech.glide.load.f;
import com.bumptech.glide.util.m;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f44941c;

    public e(@o0 Object obj) {
        this.f44941c = m.f(obj, ProtectedSandApp.s("\u0a92"));
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        messageDigest.update(this.f44941c.toString().getBytes(f.f44241b));
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f44941c.equals(((e) obj).f44941c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f44941c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("ઓ") + this.f44941c + '}';
    }
}
