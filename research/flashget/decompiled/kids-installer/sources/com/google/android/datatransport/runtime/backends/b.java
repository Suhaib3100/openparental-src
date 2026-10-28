package com.google.android.datatransport.runtime.backends;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.backends.h;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes3.dex */
final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    private final h.a f12424a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12425b;

    b(h.a aVar, long j5) {
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("‛"));
        }
        this.f12424a = aVar;
        this.f12425b = j5;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public long b() {
        return this.f12425b;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public h.a c() {
        return this.f12424a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f12424a.equals(hVar.c()) && this.f12425b == hVar.b();
    }

    public int hashCode() {
        int hashCode = (this.f12424a.hashCode() ^ 1000003) * 1000003;
        long j5 = this.f12425b;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return ProtectedSandApp.s("“") + this.f12424a + ProtectedSandApp.s("”") + this.f12425b + ProtectedSandApp.s("„");
    }
}
