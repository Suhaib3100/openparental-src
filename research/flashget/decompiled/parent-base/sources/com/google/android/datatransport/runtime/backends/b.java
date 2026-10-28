package com.google.android.datatransport.runtime.backends;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.backends.h;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes5.dex */
final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    private final h.a f51964a;

    /* renamed from: b, reason: collision with root package name */
    private final long f51965b;

    b(h.a aVar, long j4) {
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("얡"));
        }
        this.f51964a = aVar;
        this.f51965b = j4;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public long b() {
        return this.f51965b;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public h.a c() {
        return this.f51964a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f51964a.equals(hVar.c()) && this.f51965b == hVar.b();
    }

    public int hashCode() {
        int hashCode = (this.f51964a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f51965b;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("얢"));
        sb.append(this.f51964a);
        sb.append(ProtectedSandApp.s("얣"));
        return android.support.v4.media.session.b.a(sb, this.f51965b, ProtectedSandApp.s("얤"));
    }
}
