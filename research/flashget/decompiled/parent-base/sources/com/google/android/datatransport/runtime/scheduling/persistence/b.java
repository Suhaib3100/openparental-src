package com.google.android.datatransport.runtime.scheduling.persistence;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes5.dex */
final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final long f52208a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.s f52209b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.k f52210c;

    b(long j4, com.google.android.datatransport.runtime.s sVar, com.google.android.datatransport.runtime.k kVar) {
        this.f52208a = j4;
        if (sVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("왂"));
        }
        this.f52209b = sVar;
        if (kVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("왁"));
        }
        this.f52210c = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public com.google.android.datatransport.runtime.k b() {
        return this.f52210c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public long c() {
        return this.f52208a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public com.google.android.datatransport.runtime.s d() {
        return this.f52209b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f52208a == kVar.c() && this.f52209b.equals(kVar.d()) && this.f52210c.equals(kVar.b());
    }

    public int hashCode() {
        long j4 = this.f52208a;
        return ((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f52209b.hashCode()) * 1000003) ^ this.f52210c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("왃") + this.f52208a + ProtectedSandApp.s("완") + this.f52209b + ProtectedSandApp.s("왅") + this.f52210c + ProtectedSandApp.s("왆");
    }
}
