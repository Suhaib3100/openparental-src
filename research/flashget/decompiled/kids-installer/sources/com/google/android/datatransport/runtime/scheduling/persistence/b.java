package com.google.android.datatransport.runtime.scheduling.persistence;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes3.dex */
final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final long f12678a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.s f12679b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.k f12680c;

    b(long j5, com.google.android.datatransport.runtime.s sVar, com.google.android.datatransport.runtime.k kVar) {
        this.f12678a = j5;
        if (sVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("ₚ"));
        }
        this.f12679b = sVar;
        if (kVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("ₙ"));
        }
        this.f12680c = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public com.google.android.datatransport.runtime.k b() {
        return this.f12680c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public long c() {
        return this.f12678a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public com.google.android.datatransport.runtime.s d() {
        return this.f12679b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f12678a == kVar.c() && this.f12679b.equals(kVar.d()) && this.f12680c.equals(kVar.b());
    }

    public int hashCode() {
        long j5 = this.f12678a;
        return ((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.f12679b.hashCode()) * 1000003) ^ this.f12680c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("ₛ") + this.f12678a + ProtectedSandApp.s("ₜ") + this.f12679b + ProtectedSandApp.s("\u209d") + this.f12680c + ProtectedSandApp.s("\u209e");
    }
}
