package com.google.android.datatransport.cct.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes5.dex */
final class l extends v {

    /* renamed from: b, reason: collision with root package name */
    private final long f51926b;

    l(long j4) {
        this.f51926b = j4;
    }

    @Override // com.google.android.datatransport.cct.internal.v
    public long c() {
        return this.f51926b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f51926b == ((v) obj).c();
    }

    public int hashCode() {
        long j4 = this.f51926b;
        return ((int) (j4 ^ (j4 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return android.support.v4.media.session.b.a(new StringBuilder(ProtectedSandApp.s("앍")), this.f51926b, ProtectedSandApp.s("앎"));
    }
}
