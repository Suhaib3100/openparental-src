package com.bumptech.glide.load;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: classes3.dex */
public final class i implements f {

    /* renamed from: c, reason: collision with root package name */
    private final androidx.collection.a<h<?>, Object> f11508c = new com.bumptech.glide.util.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(@o0 h<T> hVar, @o0 Object obj, @o0 MessageDigest messageDigest) {
        hVar.h(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        for (int i5 = 0; i5 < this.f11508c.size(); i5++) {
            this.f11508c.l(i5).h(this.f11508c.q(i5), messageDigest);
        }
    }

    @q0
    public <T> T c(@o0 h<T> hVar) {
        return this.f11508c.containsKey(hVar) ? (T) this.f11508c.get(hVar) : hVar.d();
    }

    public void d(@o0 i iVar) {
        this.f11508c.m(iVar.f11508c);
    }

    @o0
    public <T> i e(@o0 h<T> hVar, @o0 T t5) {
        this.f11508c.put(hVar, t5);
        return this;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f11508c.equals(((i) obj).f11508c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f11508c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("ᴚ") + this.f11508c + '}';
    }
}
