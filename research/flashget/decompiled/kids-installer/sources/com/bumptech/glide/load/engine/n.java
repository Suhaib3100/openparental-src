package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: classes3.dex */
class n implements com.bumptech.glide.load.f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f11412c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11413d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11414e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f11415f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f11416g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.f f11417h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.m<?>> f11418i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.i f11419j;

    /* renamed from: k, reason: collision with root package name */
    private int f11420k;

    n(Object obj, com.bumptech.glide.load.f fVar, int i5, int i6, Map<Class<?>, com.bumptech.glide.load.m<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.i iVar) {
        this.f11412c = com.bumptech.glide.util.l.d(obj);
        this.f11417h = (com.bumptech.glide.load.f) com.bumptech.glide.util.l.e(fVar, ProtectedSandApp.s("ᳶ"));
        this.f11413d = i5;
        this.f11414e = i6;
        this.f11418i = (Map) com.bumptech.glide.util.l.d(map);
        this.f11415f = (Class) com.bumptech.glide.util.l.e(cls, ProtectedSandApp.s("᳷"));
        this.f11416g = (Class) com.bumptech.glide.util.l.e(cls2, ProtectedSandApp.s("᳸"));
        this.f11419j = (com.bumptech.glide.load.i) com.bumptech.glide.util.l.d(iVar);
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f11412c.equals(nVar.f11412c) && this.f11417h.equals(nVar.f11417h) && this.f11414e == nVar.f11414e && this.f11413d == nVar.f11413d && this.f11418i.equals(nVar.f11418i) && this.f11415f.equals(nVar.f11415f) && this.f11416g.equals(nVar.f11416g) && this.f11419j.equals(nVar.f11419j);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        if (this.f11420k == 0) {
            int hashCode = this.f11412c.hashCode();
            this.f11420k = hashCode;
            int hashCode2 = ((((this.f11417h.hashCode() + (hashCode * 31)) * 31) + this.f11413d) * 31) + this.f11414e;
            this.f11420k = hashCode2;
            int hashCode3 = this.f11418i.hashCode() + (hashCode2 * 31);
            this.f11420k = hashCode3;
            int hashCode4 = this.f11415f.hashCode() + (hashCode3 * 31);
            this.f11420k = hashCode4;
            int hashCode5 = this.f11416g.hashCode() + (hashCode4 * 31);
            this.f11420k = hashCode5;
            this.f11420k = this.f11419j.hashCode() + (hashCode5 * 31);
        }
        return this.f11420k;
    }

    public String toString() {
        return ProtectedSandApp.s("᳹") + this.f11412c + ProtectedSandApp.s("ᳺ") + this.f11413d + ProtectedSandApp.s("\u1cfb") + this.f11414e + ProtectedSandApp.s("\u1cfc") + this.f11415f + ProtectedSandApp.s("\u1cfd") + this.f11416g + ProtectedSandApp.s("\u1cfe") + this.f11417h + ProtectedSandApp.s("\u1cff") + this.f11420k + ProtectedSandApp.s("ᴀ") + this.f11418i + ProtectedSandApp.s("ᴁ") + this.f11419j + '}';
    }
}
