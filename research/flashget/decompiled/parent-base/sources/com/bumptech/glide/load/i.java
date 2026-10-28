package com.bumptech.glide.load;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: classes3.dex */
public final class i implements f {

    /* renamed from: c, reason: collision with root package name */
    private final androidx.collection.a<h<?>, Object> f44248c = new com.bumptech.glide.util.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void g(@o0 h<T> hVar, @o0 Object obj, @o0 MessageDigest messageDigest) {
        hVar.h(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        for (int i4 = 0; i4 < this.f44248c.getSize(); i4++) {
            this.f44248c.keyAt(i4).h(this.f44248c.valueAt(i4), messageDigest);
        }
    }

    @q0
    public <T> T c(@o0 h<T> hVar) {
        return this.f44248c.containsKey(hVar) ? (T) this.f44248c.get(hVar) : hVar.d();
    }

    public void d(@o0 i iVar) {
        this.f44248c.putAll((a3<? extends h<?>, ? extends Object>) iVar.f44248c);
    }

    public i e(@o0 h<?> hVar) {
        this.f44248c.remove(hVar);
        return this;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f44248c.equals(((i) obj).f44248c);
        }
        return false;
    }

    @o0
    public <T> i f(@o0 h<T> hVar, @o0 T t4) {
        this.f44248c.put(hVar, t4);
        return this;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f44248c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("॒") + this.f44248c + '}';
    }
}
