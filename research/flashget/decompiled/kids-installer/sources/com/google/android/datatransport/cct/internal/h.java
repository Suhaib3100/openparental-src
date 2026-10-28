package com.google.android.datatransport.cct.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes3.dex */
final class h extends n {

    /* renamed from: b, reason: collision with root package name */
    private final long f12391b;

    h(long j5) {
        this.f12391b = j5;
    }

    @Override // com.google.android.datatransport.cct.internal.n
    public long c() {
        return this.f12391b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f12391b == ((n) obj).c();
    }

    public int hashCode() {
        long j5 = this.f12391b;
        return ((int) (j5 ^ (j5 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("\u2002") + this.f12391b + ProtectedSandApp.s("\u2003");
    }
}
