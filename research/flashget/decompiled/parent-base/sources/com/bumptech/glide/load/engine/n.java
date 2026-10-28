package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: classes3.dex */
class n implements com.bumptech.glide.load.f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f44150c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44151d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44152e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f44153f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f44154g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.f f44155h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.m<?>> f44156i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.i f44157j;

    /* renamed from: k, reason: collision with root package name */
    private int f44158k;

    n(Object obj, com.bumptech.glide.load.f fVar, int i4, int i5, Map<Class<?>, com.bumptech.glide.load.m<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.i iVar) {
        String s4 = ProtectedSandApp.s("छ");
        this.f44150c = com.bumptech.glide.util.m.f(obj, s4);
        this.f44155h = (com.bumptech.glide.load.f) com.bumptech.glide.util.m.f(fVar, ProtectedSandApp.s("ज"));
        this.f44151d = i4;
        this.f44152e = i5;
        this.f44156i = (Map) com.bumptech.glide.util.m.f(map, s4);
        this.f44153f = (Class) com.bumptech.glide.util.m.f(cls, ProtectedSandApp.s("झ"));
        this.f44154g = (Class) com.bumptech.glide.util.m.f(cls2, ProtectedSandApp.s("ञ"));
        this.f44157j = (com.bumptech.glide.load.i) com.bumptech.glide.util.m.f(iVar, s4);
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f44150c.equals(nVar.f44150c) && this.f44155h.equals(nVar.f44155h) && this.f44152e == nVar.f44152e && this.f44151d == nVar.f44151d && this.f44156i.equals(nVar.f44156i) && this.f44153f.equals(nVar.f44153f) && this.f44154g.equals(nVar.f44154g) && this.f44157j.equals(nVar.f44157j);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        if (this.f44158k == 0) {
            int hashCode = this.f44150c.hashCode();
            this.f44158k = hashCode;
            int hashCode2 = ((((this.f44155h.hashCode() + (hashCode * 31)) * 31) + this.f44151d) * 31) + this.f44152e;
            this.f44158k = hashCode2;
            int hashCode3 = this.f44156i.hashCode() + (hashCode2 * 31);
            this.f44158k = hashCode3;
            int hashCode4 = this.f44153f.hashCode() + (hashCode3 * 31);
            this.f44158k = hashCode4;
            int hashCode5 = this.f44154g.hashCode() + (hashCode4 * 31);
            this.f44158k = hashCode5;
            this.f44158k = this.f44157j.hashCode() + (hashCode5 * 31);
        }
        return this.f44158k;
    }

    public String toString() {
        return ProtectedSandApp.s("ट") + this.f44150c + ProtectedSandApp.s("ठ") + this.f44151d + ProtectedSandApp.s("ड") + this.f44152e + ProtectedSandApp.s("ढ") + this.f44153f + ProtectedSandApp.s("ण") + this.f44154g + ProtectedSandApp.s("त") + this.f44155h + ProtectedSandApp.s("थ") + this.f44158k + ProtectedSandApp.s("द") + this.f44156i + ProtectedSandApp.s("ध") + this.f44157j + '}';
    }
}
