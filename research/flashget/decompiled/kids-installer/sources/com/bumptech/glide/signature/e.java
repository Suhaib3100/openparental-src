package com.bumptech.glide.signature;

import androidx.annotation.o0;
import com.bumptech.glide.load.f;
import com.bumptech.glide.util.l;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f12135c;

    public e(@o0 Object obj) {
        this.f12135c = l.d(obj);
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        messageDigest.update(this.f12135c.toString().getBytes(f.f11501b));
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f12135c.equals(((e) obj).f12135c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f12135c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("ᶲ") + this.f12135c + '}';
    }
}
