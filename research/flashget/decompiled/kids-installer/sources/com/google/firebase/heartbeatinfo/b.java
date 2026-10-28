package com.google.firebase.heartbeatinfo;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AutoValue_SdkHeartBeatResult.java */
/* loaded from: classes3.dex */
final class b extends t {

    /* renamed from: o, reason: collision with root package name */
    private final String f16653o;

    /* renamed from: p, reason: collision with root package name */
    private final long f16654p;

    b(String str, long j5) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⪆"));
        }
        this.f16653o = str;
        this.f16654p = j5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f16653o.equals(tVar.l()) && this.f16654p == tVar.j();
    }

    public int hashCode() {
        int hashCode = (this.f16653o.hashCode() ^ 1000003) * 1000003;
        long j5 = this.f16654p;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    @Override // com.google.firebase.heartbeatinfo.t
    public long j() {
        return this.f16654p;
    }

    @Override // com.google.firebase.heartbeatinfo.t
    public String l() {
        return this.f16653o;
    }

    public String toString() {
        return ProtectedSandApp.s("⪇") + this.f16653o + ProtectedSandApp.s("⪈") + this.f16654p + ProtectedSandApp.s("⪉");
    }
}
